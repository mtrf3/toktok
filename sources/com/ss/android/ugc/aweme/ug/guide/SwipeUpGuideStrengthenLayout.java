package com.ss.android.ugc.aweme.ug.guide;

import X.C78983UzD;
import X.C80796VnM;
import X.InterfaceC92113jT;
import X.X1D;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SwipeUpGuideStrengthenLayout extends RelativeLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public InterfaceC92113jT LJLJI;
    public final float LJLJJI;
    public float LJLJJL;
    public Runnable LJLJJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeUpGuideStrengthenLayout(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final float getDensity() {
        return this.LJLJJI;
    }

    public final float getDisAmount() {
        return this.LJLJJL;
    }

    public final Runnable getFallBackRunnable() {
        return this.LJLJJLL;
    }

    public final float getPreviousY() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC92113jT getViewPager() {
        return this.LJLJI;
    }

    public final float getYDown() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C80796VnM c80796VnM;
        Runnable runnable;
        InterfaceC92113jT interfaceC92113jT;
        InterfaceC92113jT interfaceC92113jT2;
        InterfaceC92113jT interfaceC92113jT3;
        InterfaceC92113jT interfaceC92113jT4;
        if (motionEvent != null) {
            try {
                int action = motionEvent.getAction();
                if (action == 0) {
                    float y = motionEvent.getY();
                    this.LJLIL = y;
                    this.LJLILLLLZI = y;
                    InterfaceC92113jT interfaceC92113jT5 = this.LJLJI;
                    if (interfaceC92113jT5 != null) {
                        interfaceC92113jT5.LIZJ();
                    }
                } else if (action != 1) {
                    if (action != 2) {
                        if (action == 3 && (interfaceC92113jT3 = this.LJLJI) != null && interfaceC92113jT3.LIZ() && (interfaceC92113jT4 = this.LJLJI) != null) {
                            interfaceC92113jT4.LIZLLL();
                        }
                    } else {
                        float y2 = motionEvent.getY() - this.LJLILLLLZI;
                        this.LJLILLLLZI = motionEvent.getY();
                        if (y2 < 0.0f || this.LJLJJL < 0.0f) {
                            InterfaceC92113jT interfaceC92113jT6 = this.LJLJI;
                            if (interfaceC92113jT6 != null && !interfaceC92113jT6.LIZ() && (interfaceC92113jT2 = this.LJLJI) != null) {
                                interfaceC92113jT2.LIZJ();
                            }
                            InterfaceC92113jT interfaceC92113jT7 = this.LJLJI;
                            if (interfaceC92113jT7 != null) {
                                interfaceC92113jT7.LJFF(y2);
                            }
                            this.LJLJJL += y2;
                        }
                    }
                } else {
                    InterfaceC92113jT interfaceC92113jT8 = this.LJLJI;
                    if (interfaceC92113jT8 != null && interfaceC92113jT8.LIZ() && (interfaceC92113jT = this.LJLJI) != null) {
                        interfaceC92113jT.LIZLLL();
                    }
                    this.LJLIL = 0.0f;
                    this.LJLJJL = 0.0f;
                    InterfaceC92113jT interfaceC92113jT9 = this.LJLJI;
                    if ((interfaceC92113jT9 instanceof C80796VnM) && (c80796VnM = (C80796VnM) interfaceC92113jT9) != null && c80796VnM.getChildCount() == 1 && (runnable = this.LJLJJLL) != null) {
                        runnable.run();
                    }
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SwipeUpGuideStrengthenLayout onTouchEvent error: ");
                LIZ.append(e);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
            }
        }
        return true;
    }

    public final void setDisAmount(float f) {
        this.LJLJJL = f;
    }

    public final void setFallBackRunnable(Runnable runnable) {
        this.LJLJJLL = runnable;
    }

    public final void setPreviousY(float f) {
        this.LJLILLLLZI = f;
    }

    public final void setViewPager(InterfaceC92113jT interfaceC92113jT) {
        this.LJLJI = interfaceC92113jT;
    }

    public final void setYDown(float f) {
        this.LJLIL = f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwipeUpGuideStrengthenLayout(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
            android.content.res.Resources r0 = r2.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1.LJLJJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
