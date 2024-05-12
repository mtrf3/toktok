package com.ss.android.ugc.aweme.feed;

import X.C8OB;
import X.ME3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class VideoViewCellRootView extends FrameLayout {
    public ME3 LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoViewCellRootView(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoViewCellRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ME3 me3;
        if (C8OB.LIZ() && (me3 = this.LJLIL) != null && me3.onTouch(this, motionEvent)) {
            requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setEdgeSpeedupListener(ME3 me3) {
        this.LJLIL = me3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoViewCellRootView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.VideoViewCellRootView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
