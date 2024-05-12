package X;

import Y.ARunnableS22S0200000_3;
import Y.AUListenerS92S0100000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.feed.assem.ffpbutton.FollowButtonFFPAssem;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.o;

/* renamed from: X.8u0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226048u0 extends AbstractC65781Prl implements InterfaceC88471Ynr<FollowButtonFFPAssem, Boolean, C76800UCe> {
    public static final C226048u0 LJLIL = new C226048u0();

    public C226048u0() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FollowButtonFFPAssem followButtonFFPAssem, Boolean bool) {
        int i;
        FollowButtonFFPAssem selectSubscribe = followButtonFFPAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            RelationButton relationButton = selectSubscribe.LLFII;
            if (relationButton != null) {
                relationButton.clearAnimation();
                RelationButton relationButton2 = selectSubscribe.LLFII;
                if (relationButton2 != null) {
                    ViewGroup.LayoutParams layoutParams = relationButton2.getLayoutParams();
                    if (layoutParams != null) {
                        if (selectSubscribe.LLIFFJFJJ) {
                            i = 32;
                        } else {
                            i = 36;
                        }
                        layoutParams.height = C7MY.LIZIZ(i);
                        relationButton2.setLayoutParams(layoutParams);
                        RelationButton relationButton3 = selectSubscribe.LLFII;
                        if (relationButton3 != null) {
                            relationButton3.setVisibility(0);
                        } else {
                            o.LJIJI("relationButton");
                            throw null;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    o.LJIJI("relationButton");
                    throw null;
                }
            } else {
                o.LJIJI("relationButton");
                throw null;
            }
        } else {
            RelationButton relationButton4 = selectSubscribe.LLFII;
            if (relationButton4 != null) {
                relationButton4.clearAnimation();
                RelationButton relationButton5 = selectSubscribe.LLFII;
                if (relationButton5 != null) {
                    if (!relationButton5.isAttachedToWindow() || !relationButton5.hasWindowFocus() || relationButton5.getWindowVisibility() != 0 || !relationButton5.isShown() || relationButton5.getWidth() <= 0 || relationButton5.getHeight() <= 0 || relationButton5.getAlpha() <= 0.0f || !relationButton5.getGlobalVisibleRect(new Rect())) {
                        RelationButton relationButton6 = selectSubscribe.LLFII;
                        if (relationButton6 != null) {
                            relationButton6.setVisibility(8);
                        } else {
                            o.LJIJI("relationButton");
                            throw null;
                        }
                    } else {
                        Interpolator LJ = C55953Lxd.LJ();
                        int[] iArr = new int[2];
                        RelationButton relationButton7 = selectSubscribe.LLFII;
                        if (relationButton7 != null) {
                            iArr[0] = relationButton7.getHeight();
                            iArr[1] = 0;
                            ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                            ofInt.setInterpolator(LJ);
                            ofInt.setDuration(300L);
                            ofInt.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 27));
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat.setInterpolator(LJ);
                            ofFloat.setDuration(300L);
                            ofFloat.addUpdateListener(new AUListenerS92S0100000_3(selectSubscribe, 26));
                            ofFloat.addListener(new IDAListenerS72S0100000_3(selectSubscribe, 42));
                            RelationButton relationButton8 = selectSubscribe.LLFII;
                            if (relationButton8 != null) {
                                relationButton8.postDelayed(new ARunnableS22S0200000_3(ofInt, ofFloat, 36), 600L);
                            } else {
                                o.LJIJI("relationButton");
                                throw null;
                            }
                        } else {
                            o.LJIJI("relationButton");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("relationButton");
                    throw null;
                }
            } else {
                o.LJIJI("relationButton");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
