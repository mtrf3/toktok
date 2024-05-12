package com.ss.android.ugc.aweme.shortvideo.model;

import X.C165706es;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class CanvasVideoEditorTrackViewModel extends ViewModel {
    public static final Companion Companion = new Companion();
    public int filterIndex = LiveLayoutPreloadThreadPriority.DEFAULT;

    public final boolean isFilterIndexValid() {
        if (this.filterIndex != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CanvasVideoEditorTrackViewModel get(View view) {
            if (view == null) {
                return null;
            }
            return (CanvasVideoEditorTrackViewModel) C165706es.LJII(view, null, 6).get(CanvasVideoEditorTrackViewModel.class);
        }
    }
}
