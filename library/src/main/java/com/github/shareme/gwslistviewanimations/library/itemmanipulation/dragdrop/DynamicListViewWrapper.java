/*
 * Copyright 2014 Niek Haarman
 * Modifications Copyright (C) Fred Grott(GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shareme.gwslistviewanimations.library.itemmanipulation.dragdrop;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;

import com.github.shareme.gwslistviewanimations.library.itemmanipulation.DynamicListView;


/**
 * DynamicListViewWrapper
 * Created by fgrott on 9/2/2015.
 */
public class DynamicListViewWrapper implements DragAndDropListViewWrapper {

    @NonNull
    private final DynamicListView mDynamicListView;

    public DynamicListViewWrapper(@NonNull final DynamicListView dynamicListView) {
        mDynamicListView = dynamicListView;
    }

    @NonNull
    @Override
    public DynamicListView getListView() {
        return mDynamicListView;
    }

    @Nullable
    @Override
    public View getChildAt(final int index) {
        return mDynamicListView.getChildAt(index);
    }

    @Override
    public int getFirstVisiblePosition() {
        return mDynamicListView.getFirstVisiblePosition();
    }

    @Override
    public int getLastVisiblePosition() {
        return mDynamicListView.getLastVisiblePosition();
    }

    @Override
    public int getCount() {
        return mDynamicListView.getCount();
    }

    @Override
    public int getChildCount() {
        return mDynamicListView.getChildCount();
    }

    @Override
    public int getHeaderViewsCount() {
        return mDynamicListView.getHeaderViewsCount();
    }

    @Override
    public int getPositionForView(@NonNull final View view) {
        return mDynamicListView.getPositionForView(view);
    }

    @Nullable
    @Override
    public ListAdapter getAdapter() {
        return mDynamicListView.getAdapter();
    }

    @Override
    public void smoothScrollBy(final int distance, final int duration) {
        mDynamicListView.smoothScrollBy(distance, duration);
    }

    @Override
    public void setOnScrollListener(final AbsListView.OnScrollListener onScrollListener) {
        mDynamicListView.setOnScrollListener(onScrollListener);
    }

    @Override
    public int pointToPosition(final int x, final int y) {
        return mDynamicListView.pointToPosition(x, y);
    }

    @Override
    public int computeVerticalScrollOffset() {
        return mDynamicListView.computeVerticalScrollOffset();
    }

    @Override
    public int computeVerticalScrollExtent() {
        return mDynamicListView.computeVerticalScrollExtent();
    }

    @Override
    public int computeVerticalScrollRange() {
        return mDynamicListView.computeVerticalScrollRange();
    }
}
