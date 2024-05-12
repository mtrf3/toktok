package X;

import Y.IDAListenerS71S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import defpackage.a1;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6T1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T1 extends C6T3 {
    public GlobalHashTagStickerModel LJLJJI;
    public C1NS<GlobalHashTagStickerModel> LJLJJL;
    public C1NS<GlobalHashTagStickerModel> LJLJJLL;
    public C161006To LJLJL;
    public C161006To LJLJLJ;
    public LifecycleOwner LJLJLLL;
    public ViewGroup LJLL;
    public FrameLayout LJLLI;
    public View LJLLILLLL;
    public C6Q4 LJLLJ;
    public int LJLLL;

    @Override // X.C6T3
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    @Override // X.C6T3
    public final void LIZIZ() {
        setVisibility(8);
        C1NS<GlobalHashTagStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C6T8.LJLIL);
            C1NS<GlobalHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C6T9.LJLIL);
                GlobalHashTagStickerModel globalHashTagStickerModel = this.LJLJJI;
                if (globalHashTagStickerModel != null) {
                    BaseStickerModel copy$default = BaseStickerModel.copy$default(globalHashTagStickerModel.getBaseStickerModel(), 0, 0, EnumC157656Gr.PICTURE_HASHTAG_GLOBAL, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -5, null);
                    C1NS<GlobalHashTagStickerModel> c1ns3 = this.LJLJJL;
                    if (c1ns3 != null) {
                        GlobalHashTagStickerModel copy$default2 = GlobalHashTagStickerModel.copy$default(globalHashTagStickerModel, copy$default, 0L, c1ns3.LJ.getContentText(), false, false, true, 2, null);
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
        C1NS<GlobalHashTagStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C6TA.LJLIL);
            C1NS<GlobalHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C6TB.LJLIL);
                C161006To c161006To = this.LJLJL;
                if (c161006To != null) {
                    c161006To.getContentEditText().requestFocus();
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
        GlobalHashTagStickerModel globalHashTagStickerModel = this.LJLJJI;
        if (globalHashTagStickerModel != null) {
            float centerY = globalHashTagStickerModel.getBaseStickerModel().getCenterY();
            GlobalHashTagStickerModel globalHashTagStickerModel2 = this.LJLJJI;
            if (globalHashTagStickerModel2 != null) {
                float translateY = globalHashTagStickerModel2.getBaseStickerModel().getTranslateY() + centerY;
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

    public final int getHashTagStickerContainerTopMargin() {
        return this.LJLLL;
    }

    public final C6Q4 getStickerEditListener() {
        return this.LJLLJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6T1(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLLL = C170576mj.LIZLLL(context);
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
        C1NS<GlobalHashTagStickerModel> c1ns = this.LJLJJL;
        if (c1ns != null) {
            c1ns.LJ(new AqS168S0100000_2(this, 19));
            C1NS<GlobalHashTagStickerModel> c1ns2 = this.LJLJJLL;
            if (c1ns2 != null) {
                c1ns2.LJ(new AqS168S0100000_2(this, 20));
                C1NS<GlobalHashTagStickerModel> c1ns3 = this.LJLJJL;
                if (c1ns3 != null) {
                    c1ns3.LJ(C6T7.LJLIL);
                    C161006To c161006To = this.LJLJLJ;
                    if (c161006To != null) {
                        C1NS<GlobalHashTagStickerModel> c1ns4 = this.LJLJJLL;
                        if (c1ns4 != null) {
                            LJII(c161006To, c1ns4.LJ.getBaseStickerModel());
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
        GlobalHashTagStickerModel globalHashTagStickerModel = this.LJLJJI;
        if (globalHashTagStickerModel != null) {
            if (globalHashTagStickerModel.getContentText().length() == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new IDAListenerS71S0100000_2(this, 3));
                ofFloat.start();
                return;
            }
            float stickerInitTranslationY = getStickerInitTranslationY();
            C161006To c161006To = this.LJLJLJ;
            if (c161006To != null) {
                c161006To.setTranslationY(stickerInitTranslationY);
                C1NS<GlobalHashTagStickerModel> c1ns = this.LJLJJLL;
                if (c1ns != null) {
                    BaseStickerModel baseStickerModel = c1ns.LJ.getBaseStickerModel();
                    C1NS<GlobalHashTagStickerModel> c1ns2 = this.LJLJJLL;
                    if (c1ns2 != null) {
                        c1ns2.LJ(new AqS5S0100001_2(baseStickerModel, stickerInitTranslationY, 1));
                        C1NS<GlobalHashTagStickerModel> c1ns3 = this.LJLJJLL;
                        if (c1ns3 != null) {
                            c1ns3.LJ(C6TJ.LJLIL);
                            C1NS<GlobalHashTagStickerModel> c1ns4 = this.LJLJJL;
                            if (c1ns4 != null) {
                                c1ns4.LJ(C6TK.LJLIL);
                                C1NS<GlobalHashTagStickerModel> c1ns5 = this.LJLJJL;
                                if (c1ns5 != null) {
                                    c1ns5.LJ(C6TL.LJLIL);
                                    C161006To c161006To2 = this.LJLJLJ;
                                    if (c161006To2 != null) {
                                        LJIIIIZZ(c161006To2, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, stickerInitTranslationY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null));
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

    public final void setHashTagStickerContainerTopMargin(int i) {
        this.LJLLL = i;
    }

    public final void setStickerEditListener(C6Q4 c6q4) {
        this.LJLLJ = c6q4;
    }
}
