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
package com.github.shareme.gwslistviewanimations.library.itemmanipulation.swipedismiss.undo;

import android.support.annotation.NonNull;
import android.view.View;

import com.github.shareme.gwslistviewanimations.library.itemmanipulation.swipedismiss.OnDismissCallback;

/**
 * A callback interface used to inform its client about a successful dismissal of one or
 * more list item positions.
 * Created by fgrott on 9/2/2015.
 */
public interface UndoCallback extends OnDismissCallback {

    /**
     * Returns the primary {@link View} contained in given {@code View}.
     *
     * @param view the parent {@code View}, which contains both the primary and the undo {@link View}s.
     */
    @NonNull
    View getPrimaryView(@NonNull View view);

    /**
     * Returns the undo {@link View} contained in given {@code View}.
     *
     * @param view the parent {@code View}, which contains both the primary and the undo {@link View}s.
     */
    @NonNull
    View getUndoView(@NonNull View view);

    /**
     * Called when the undo {@link View} is shown for given position.
     *
     * @param view     the parent {@code View}, which contains both the primary and the undo {@link View}s.
     * @param position the position for which the undo {@code View} is shown.
     */
    void onUndoShown(@NonNull View view, int position);

    /**
     * Called when the undo button is clicked for given position, and the primary {@link View} is shown.
     *
     * @param view     the parent {@code View}, which contains both the primary and the undo {@link View}s.
     * @param position the position for which the button has been clicked.
     */
    void onUndo(@NonNull View view, int position);

    /**
     * Called when the user has definitively dismissed an item.<br>
     * Do <i><b>NOT</b></i> remove the item from the adapter here!
     * Instead, do this in #onDismiss(android.view.ViewGroup, int[])}.
     *
     * @param view     the parent {@code View}, which contains both the primary and the undo {@link View}s.
     * @param position the position of the item that is dismissed.
     */
    void onDismiss(@NonNull View view, int position);
}
