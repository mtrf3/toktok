package com.byted.cast.common.api.multiple;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes29.dex */
public interface IMultipleLoader {
    void loadAudio(String str, Context context, FrameLayout frameLayout);

    void loadMirror(String str, Context context, FrameLayout frameLayout);

    void loadPhoto(String str, Context context, FrameLayout frameLayout);

    void loadVideo(String str, Context context, FrameLayout frameLayout);
}
