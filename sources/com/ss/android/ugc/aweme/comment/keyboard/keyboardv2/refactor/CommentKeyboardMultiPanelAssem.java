package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC177926ya;
import X.C177906yY;
import X.C186577Tx;
import X.C201257v7;
import X.C201287vA;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71E;
import X.C71F;
import X.C71G;
import X.C71K;
import X.C71Y;
import X.C78886Uxe;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.TBT;
import X.X1D;
import Y.AUListenerS92S0100000_3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.IDqS428S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentKeyboardMultiPanelAssem extends UISlotAssem implements IKeyboardMultiPanelAssemAbility, InterfaceC55102Lju {
    public static final C71F LJLLL = new Object() { // from class: X.71F
    };
    public final C214298b3 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public ValueAnimator LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 749131655) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.qi;
    }

    public CommentKeyboardMultiPanelAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 106), C71E.INSTANCE, null);
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 104));
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 105));
        this.LJLLJ = C221108m2.LIZIZ(C201257v7.LJLIL);
        C221108m2.LIZIZ(C201287vA.LJLIL);
        C221108m2.LIZIZ(C71G.LJLIL);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C71Y.LIZ("xjcccccccc", "test view create  44444444");
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C71Y.LIZ("xjcccccccc", "test view create 22222");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C78886Uxe.LJJLIIIJ(0, getContainerView());
        C71Y.LIZ("xjcccccccc", "test view create  33333");
        C8YN.LJIIJ(this, this.LJLJLLL.getValue(), new TBT() { // from class: X.71A
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C177616y5) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.71B
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C177616y5) obj).LJLJL);
            }
        }, C213688a4.LIZLLL(), new IDqS428S0100000_3(this, 0), 8);
    }

    public final void H3(final int i, final int i2, AbstractC177926ya abstractC177926ya) {
        if (i == i2 || i2 <= 0) {
            return;
        }
        if (i == 0 && o.LJ(abstractC177926ya, C177906yY.LIZ) && C71K.LIZ() > 0 && (C71K.LIZ() & 2) == 2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
            this.LJLLILLLL = ofInt;
            if (ofInt != null) {
                ofInt.addUpdateListener(new AUListenerS92S0100000_3(this, 4));
            }
            ValueAnimator valueAnimator = this.LJLLILLLL;
            if (valueAnimator != null) {
                valueAnimator.setDuration(150L);
            }
            ValueAnimator valueAnimator2 = this.LJLLILLLL;
            if (valueAnimator2 != null) {
                valueAnimator2.setInterpolator((Interpolator) this.LJLLJ.getValue());
            }
            ValueAnimator valueAnimator3 = this.LJLLILLLL;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new Animator.AnimatorListener() { // from class: X.71D
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C71Y.LIZLLL("KeyboardMultiPanelAssem", "changeMultiPanelHeight end");
                        if (i == 0 && i2 != 0) {
                            C186577Tx.LIZ();
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animation) {
                        o.LJIIIZ(animation, "animation");
                        C71Y.LIZLLL("KeyboardMultiPanelAssem", "changeMultiPanelHeight start");
                        if (i == 0 && i2 != 0) {
                            C186577Tx.LIZIZ.LIZLLL = System.currentTimeMillis();
                        }
                    }
                });
            }
            ValueAnimator valueAnimator4 = this.LJLLILLLL;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator5 = this.LJLLILLLL;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeMultiPanelHeight setHeight  ");
        LIZ.append(i);
        LIZ.append("  ");
        LIZ.append(i2);
        C71Y.LIZ("KeyboardMultiPanelAssem", X1D.LIZIZ(LIZ));
        C78886Uxe.LJJLIIIJ(i2, getContainerView());
        C186577Tx.LIZ();
    }
}
