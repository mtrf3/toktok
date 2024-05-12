package com.ss.android.ugc.aweme.innerpush.ui;

import X.C1I1;
import X.C63081OpJ;
import X.C81303VvX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class InnerPushPullUpLayout extends C81303VvX {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InnerPushPullUpLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C81303VvX, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LJLILLLLZI = motionEvent.getY();
            } else {
                if (motionEvent.getAction() == 2 && C1I1.LIZIZ(motionEvent, this.LJLILLLLZI) > 3.0f) {
                    float y = this.LJLILLLLZI - motionEvent.getY();
                    int scaledTouchSlop = ViewConfiguration.get(this.LJLIL).getScaledTouchSlop();
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    if (y > scaledTouchSlop - C63081OpJ.LJJJJLI(context)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerPushPullUpLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.ui.InnerPushPullUpLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
