package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C16880lQ;
import X.C186577Tx;
import X.C201267v8;
import X.C201297vB;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C2K0;
import X.C2U8;
import X.C55096Ljo;
import X.C61202ai;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71J;
import X.C71K;
import X.C71N;
import X.C71O;
import X.C71Y;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.TBT;
import X.X1D;
import Y.ARunnableS39S0100000_3;
import Y.AUListenerS92S0100000_3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RefactorKeyboardPanelV2 extends UISlotAssem implements View.OnLayoutChangeListener, IKeyboardV2Ability, InterfaceC55102Lju {
    public static final C71J LJLLJ = new Object() { // from class: X.71J
    };
    public final C214298b3 LJLJLLL;
    public View LJLL;
    public ValueAnimator LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1485945235) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.r1;
    }

    public RefactorKeyboardPanelV2() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 117), C71O.INSTANCE, null);
        this.LJLLILLLL = C221108m2.LIZIZ(C201267v8.LJLIL);
        C221108m2.LIZIZ(C201297vB.LJLIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        View view = this.LJLL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability
    public final void bI(final float f) {
        boolean z;
        final float translationY = x3().getTranslationY();
        if (translationY == f) {
            return;
        }
        if (C71K.LIZ() > 0 && (C71K.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            x3().setTranslationY(f);
            if (translationY == 0.0f || f != 0.0f) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setPanelTranslationY translationY ");
            LIZ.append(f);
            C71Y.LIZ("KeyboardPanelV2", X1D.LIZIZ(LIZ));
            C186577Tx.LIZ();
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setPanelTranslationY start animation  translationY ");
        LIZ2.append(f);
        C71Y.LIZ("KeyboardPanelV2", X1D.LIZIZ(LIZ2));
        ValueAnimator valueAnimator = this.LJLLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, f);
        this.LJLLI = ofFloat;
        if (ofFloat != null) {
            ofFloat.addUpdateListener(new AUListenerS92S0100000_3(this, 5));
        }
        ValueAnimator valueAnimator2 = this.LJLLI;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(150L);
        }
        ValueAnimator valueAnimator3 = this.LJLLI;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator((Interpolator) this.LJLLILLLL.getValue());
        }
        ValueAnimator valueAnimator4 = this.LJLLI;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new Animator.AnimatorListener() { // from class: X.71M
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
                    C71Y.LIZLLL("KeyboardPanelV2", "setPanelTranslationY end");
                    if (translationY == 0.0f || f != 0.0f) {
                        return;
                    }
                    C186577Tx.LIZ();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    C71Y.LIZLLL("KeyboardPanelV2", "setPanelTranslationY start");
                    if (translationY == 0.0f || f != 0.0f) {
                        return;
                    }
                    C186577Tx.LIZIZ.LIZLLL = System.currentTimeMillis();
                }
            });
        }
        ValueAnimator valueAnimator5 = this.LJLLI;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.71P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        }, view);
        View findViewById = view.findViewById(R.id.d28);
        this.LJLL = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(this);
        }
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 83));
        C71Y.LIZ("xjcccccccc", "test view create  0000000");
        C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.71C
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C177616y5) obj).LJLJL);
            }
        }, C213688a4.LIZLLL(), C71N.LJLIL, 4);
        view.postDelayed(new ARunnableS39S0100000_3(this, 28), 100L);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (view != null) {
            i9 = view.getMeasuredHeight();
        } else {
            i9 = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutChange height :");
        LIZ.append(i9);
        C71Y.LIZLLL("KeyboardPanelV2", X1D.LIZIZ(LIZ));
        C2U8.LIZ(new C61202ai(i9));
        ((AssemViewModel) this.LJLJLLL.getValue()).setState(new AqS28S0001000_3(i9, 11));
    }
}
