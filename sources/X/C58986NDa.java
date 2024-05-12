package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.NDa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58986NDa extends FrameLayout {
    public boolean LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C58986NDa(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C58986NDa(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS getView() {
        boolean z;
        View view;
        if (getChildCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view = getChildAt(0);
        } else {
            view = null;
        }
        if (!(view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
            return null;
        }
        return (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) view;
    }

    public final boolean getInterceptTouchEvent() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.LJLIL;
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.LJLIL = z;
    }

    public final void setView(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView) {
        o.LJIIIZ(sparkView, "sparkView");
        removeAllViews();
        addView(sparkView, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C58986NDa(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C58986NDa.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
