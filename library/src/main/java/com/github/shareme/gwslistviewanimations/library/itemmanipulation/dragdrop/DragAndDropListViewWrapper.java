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

import android.widget.AbsListView;

import com.github.shareme.gwslistviewanimations.library.util.ListViewWrapper;

/**
 * DragAndDropListViewWrapper
 * Created by fgrott on 9/2/2015.
 */
public interface DragAndDropListViewWrapper extends ListViewWrapper {

    void setOnScrollListener(AbsListView.OnScrollListener onScrollListener);

    int pointToPosition(int x, int y);

    int computeVerticalScrollOffset();

    int computeVerticalScrollExtent();

    int computeVerticalScrollRange();
}