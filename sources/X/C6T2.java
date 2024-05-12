package X;

import Y.IDAListenerS71S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import defpackage.a1;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6T2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T2 extends C6T3 {
    public SingleHashTagStickerModel LJLJJI;
    public C1NS<SingleHashTagStickerModel> LJLJJL;
    public C1NS<SingleHashTagStickerModel> LJLJJLL;
    public C161016Tp LJLJL;
    public C161016Tp LJLJLJ;
    public LifecycleOwner LJLJLLL;
    public ViewGroup LJLL;
    public FrameLayout LJLLI;
    public View LJLLILLLL;
    public C6Q4 LJLLJ;

    @Override // X.C6T3
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    @Override // X.C6T3
    public final void LIZIZ() {
        setVisibility(8);
        C1NS<SingleHashTagStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C6TD.LJLIL);
            C1NS<SingleHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C6TE.LJLIL);
                SingleHashTagStickerModel singleHashTagStickerModel = this.LJLJJI;
                if (singleHashTagStickerModel != null) {
                    BaseStickerModel copy$default = BaseStickerModel.copy$default(singleHashTagStickerModel.getBaseStickerModel(), 0, 0, EnumC157656Gr.PICTURE_HASHTAG_SINGLE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -5, null);
                    C1NS<SingleHashTagStickerModel> c1ns3 = this.LJLJJL;
                    if (c1ns3 != null) {
                        SingleHashTagStickerModel copy$default2 = SingleHashTagStickerModel.copy$default(singleHashTagStickerModel, copy$default, 0L, c1ns3.LJ.getContentText(), false, false, true, 2, null);
                        C6Q4 c6q4 = this.LJLLJ;
                        if (c6q4 != null) {
                            c6q4.LIZ(copy$default2, false);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("stateContainer");
                    throw null;
                }
                o.LJIJI("savedHashTagStickerModel");
                throw null;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("animStateContainer");
        throw null;
    }

    @Override // X.C6T3
    public final void LIZLLL() {
        C1NS<SingleHashTagStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C6TF.LJLIL);
            C1NS<SingleHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C6TG.LJLIL);
                C161016Tp c161016Tp = this.LJLJL;
                if (c161016Tp != null) {
                    c161016Tp.getContentEditText().requestFocus();
                    return;
                } else {
                    o.LJIJI("hashtagStickerView");
                    throw null;
                }
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("animStateContainer");
        throw null;
    }

    @Override // X.C6T3
    public final void LJ() {
        C6Q4 c6q4 = this.LJLLJ;
        if (c6q4 != null) {
            c6q4.LIZLLL();
        }
    }

    @Override // X.C6T3
    public View getAlphaView() {
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("editRootLayout");
        throw null;
    }

    @Override // X.C6T3
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null) {
            int top = frameLayout.getTop();
            if (this.LJLLI != null) {
                return ((r0.getBottom() + top) / 2) - ((getBottom() + getTop()) / 2);
            }
            o.LJIJI("hashTagStickerContainer");
            throw null;
        }
        o.LJIJI("hashTagStickerContainer");
        throw null;
    }

    @Override // X.C6T3
    public float getStickerInitTranslationY() {
        SingleHashTagStickerModel singleHashTagStickerModel = this.LJLJJI;
        if (singleHashTagStickerModel != null) {
            float centerY = singleHashTagStickerModel.getBaseStickerModel().getCenterY();
            SingleHashTagStickerModel singleHashTagStickerModel2 = this.LJLJJI;
            if (singleHashTagStickerModel2 != null) {
                float translateY = singleHashTagStickerModel2.getBaseStickerModel().getTranslateY() + centerY;
                if (this.LJLJJI != null) {
                    return (translateY + r0.getBaseStickerModel().getContainerTop()) - ((getBottom() + getTop()) / 2);
                }
                o.LJIJI("savedHashTagStickerModel");
                throw null;
            }
            o.LJIJI("savedHashTagStickerModel");
            throw null;
        }
        o.LJIJI("savedHashTagStickerModel");
        throw null;
    }

    public final C6Q4 getStickerEditListener() {
        return this.LJLLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6T2(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
    }

    @Override // X.C6T3
    public final void LIZJ(int i) {
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i - ((int) C170576mj.LIZ(getContext(), 62.0f));
            ViewGroup viewGroup2 = this.LJLL;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("editRootLayout");
                throw null;
            }
        }
        o.LJIJI("editRootLayout");
        throw null;
    }

    @Override // X.C6T3
    public final void LJFF(int i) {
        FrameLayout frameLayout = this.LJLLI;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            FrameLayout frameLayout2 = this.LJLLI;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("hashTagStickerContainer");
                throw null;
            }
        }
        o.LJIJI("hashTagStickerContainer");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        if (getState() == C6T6.PAUSE) {
            return;
        }
        super.keyBoardHide(i);
        C1NS<SingleHashTagStickerModel> c1ns = this.LJLJJL;
        if (c1ns != null) {
            c1ns.LJ(new AqS168S0100000_2(this, 364));
            C1NS<SingleHashTagStickerModel> c1ns2 = this.LJLJJLL;
            if (c1ns2 != null) {
                c1ns2.LJ(new AqS168S0100000_2(this, 365));
                C1NS<SingleHashTagStickerModel> c1ns3 = this.LJLJJL;
                if (c1ns3 != null) {
                    c1ns3.LJ(C6TC.LJLIL);
                    C161016Tp c161016Tp = this.LJLJLJ;
                    if (c161016Tp != null) {
                        C1NS<SingleHashTagStickerModel> c1ns4 = this.LJLJJLL;
                        if (c1ns4 != null) {
                            LJII(c161016Tp, c1ns4.LJ.getBaseStickerModel());
                            return;
                        } else {
                            o.LJIJI("animStateContainer");
                            throw null;
                        }
                    }
                    o.LJIJI("animStickerView");
                    throw null;
                }
                o.LJIJI("stateContainer");
                throw null;
            }
            o.LJIJI("animStateContainer");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        if (getState() == C6T6.PAUSE) {
            return;
        }
        LIZJ(i);
        SingleHashTagStickerModel singleHashTagStickerModel = this.LJLJJI;
        if (singleHashTagStickerModel != null) {
            if (singleHashTagStickerModel.getContentText().length() == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new IDAListenerS71S0100000_2(this, 11));
                ofFloat.start();
                return;
            }
            float stickerInitTranslationY = getStickerInitTranslationY();
            C161016Tp c161016Tp = this.LJLJLJ;
            if (c161016Tp != null) {
                c161016Tp.setTranslationY(stickerInitTranslationY);
                C1NS<SingleHashTagStickerModel> c1ns = this.LJLJJLL;
                if (c1ns != null) {
                    BaseStickerModel baseStickerModel = c1ns.LJ.getBaseStickerModel();
                    C1NS<SingleHashTagStickerModel> c1ns2 = this.LJLJJLL;
                    if (c1ns2 != null) {
                        c1ns2.LJ(new AqS5S0100001_2(baseStickerModel, stickerInitTranslationY, 5));
                        C1NS<SingleHashTagStickerModel> c1ns3 = this.LJLJJLL;
                        if (c1ns3 != null) {
                            c1ns3.LJ(C6TO.LJLIL);
                            C1NS<SingleHashTagStickerModel> c1ns4 = this.LJLJJL;
                            if (c1ns4 != null) {
                                c1ns4.LJ(C6TP.LJLIL);
                                C1NS<SingleHashTagStickerModel> c1ns5 = this.LJLJJL;
                                if (c1ns5 != null) {
                                    c1ns5.LJ(C6TQ.LJLIL);
                                    C161016Tp c161016Tp2 = this.LJLJLJ;
                                    if (c161016Tp2 != null) {
                                        LJIIIIZZ(c161016Tp2, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, stickerInitTranslationY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null));
                                        return;
                                    } else {
                                        o.LJIJI("animStickerView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("stateContainer");
                                throw null;
                            }
                            o.LJIJI("stateContainer");
                            throw null;
                        }
                        o.LJIJI("animStateContainer");
                        throw null;
                    }
                    o.LJIJI("animStateContainer");
                    throw null;
                }
                o.LJIJI("animStateContainer");
                throw null;
            }
            o.LJIJI("animStickerView");
            throw null;
        }
        o.LJIJI("savedHashTagStickerModel");
        throw null;
    }

    public final void setStickerEditListener(C6Q4 c6q4) {
        this.LJLLJ = c6q4;
    }
}
