package com.ss.android.ugc.gamora.editorpro.views;

import X.InterfaceC88472Yns;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class InterceptConstraintLayout extends ConstraintLayout {
    public InterfaceC88472Yns<? super MotionEvent, Boolean> LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptConstraintLayout(Context context) {
        this(context, null, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns.invoke(motionEvent).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setInterceptListener(InterfaceC88472Yns<? super MotionEvent, Boolean> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLIL = callback;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InterceptConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
