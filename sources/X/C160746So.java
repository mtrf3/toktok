package X;

import Y.IDAListenerS71S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import defpackage.a1;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6So, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160746So extends C6T3 {
    public EmbedHashTagStickerModel LJLJJI;
    public C1NS<EmbedHashTagStickerModel> LJLJJL;
    public C1NS<EmbedHashTagStickerModel> LJLJJLL;
    public C160946Ti LJLJL;
    public C160946Ti LJLJLJ;
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
        C1NS<EmbedHashTagStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C160766Sq.LJLIL);
            C1NS<EmbedHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C160776Sr.LJLIL);
                EmbedHashTagStickerModel embedHashTagStickerModel = this.LJLJJI;
                if (embedHashTagStickerModel != null) {
                    BaseStickerModel copy$default = BaseStickerModel.copy$default(embedHashTagStickerModel.getBaseStickerModel(), 0, 0, EnumC157656Gr.PICTURE_HASHTAG_EMBED, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -5, null);
                    C1NS<EmbedHashTagStickerModel> c1ns3 = this.LJLJJL;
                    if (c1ns3 != null) {
                        EmbedHashTagStickerModel copy$default2 = EmbedHashTagStickerModel.copy$default(embedHashTagStickerModel, copy$default, 0L, c1ns3.LJ.getContentText(), false, false, true, 2, null);
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
        C1NS<EmbedHashTagStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C160786Ss.LJLIL);
            C1NS<EmbedHashTagStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C160796St.LJLIL);
                C160946Ti c160946Ti = this.LJLJL;
                if (c160946Ti != null) {
                    c160946Ti.getContentEditText().requestFocus();
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
        EmbedHashTagStickerModel embedHashTagStickerModel = this.LJLJJI;
        if (embedHashTagStickerModel != null) {
            float centerY = embedHashTagStickerModel.getBaseStickerModel().getCenterY();
            EmbedHashTagStickerModel embedHashTagStickerModel2 = this.LJLJJI;
            if (embedHashTagStickerModel2 != null) {
                float translateY = embedHashTagStickerModel2.getBaseStickerModel().getTranslateY() + centerY;
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
    public C160746So(Context context) {
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
        C1NS<EmbedHashTagStickerModel> c1ns = this.LJLJJL;
        if (c1ns != null) {
            c1ns.LJ(new AqS168S0100000_2(this, 6));
            C1NS<EmbedHashTagStickerModel> c1ns2 = this.LJLJJLL;
            if (c1ns2 != null) {
                c1ns2.LJ(new AqS168S0100000_2(this, 7));
                C1NS<EmbedHashTagStickerModel> c1ns3 = this.LJLJJL;
                if (c1ns3 != null) {
                    c1ns3.LJ(C160756Sp.LJLIL);
                    C160946Ti c160946Ti = this.LJLJLJ;
                    if (c160946Ti != null) {
                        C1NS<EmbedHashTagStickerModel> c1ns4 = this.LJLJJLL;
                        if (c1ns4 != null) {
                            LJII(c160946Ti, c1ns4.LJ.getBaseStickerModel());
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
        EmbedHashTagStickerModel embedHashTagStickerModel = this.LJLJJI;
        if (embedHashTagStickerModel != null) {
            if (embedHashTagStickerModel.getContentText().length() == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new IDAListenerS71S0100000_2(this, 2));
                ofFloat.start();
                return;
            }
            float stickerInitTranslationY = getStickerInitTranslationY();
            C160946Ti c160946Ti = this.LJLJLJ;
            if (c160946Ti != null) {
                c160946Ti.setTranslationY(stickerInitTranslationY);
                C1NS<EmbedHashTagStickerModel> c1ns = this.LJLJJLL;
                if (c1ns != null) {
                    BaseStickerModel baseStickerModel = c1ns.LJ.getBaseStickerModel();
                    C1NS<EmbedHashTagStickerModel> c1ns2 = this.LJLJJLL;
                    if (c1ns2 != null) {
                        c1ns2.LJ(new AqS5S0100001_2(baseStickerModel, stickerInitTranslationY, 0));
                        C1NS<EmbedHashTagStickerModel> c1ns3 = this.LJLJJLL;
                        if (c1ns3 != null) {
                            c1ns3.LJ(C160826Sw.LJLIL);
                            C1NS<EmbedHashTagStickerModel> c1ns4 = this.LJLJJL;
                            if (c1ns4 != null) {
                                c1ns4.LJ(C160836Sx.LJLIL);
                                C1NS<EmbedHashTagStickerModel> c1ns5 = this.LJLJJL;
                                if (c1ns5 != null) {
                                    c1ns5.LJ(C160846Sy.LJLIL);
                                    C160946Ti c160946Ti2 = this.LJLJLJ;
                                    if (c160946Ti2 != null) {
                                        LJIIIIZZ(c160946Ti2, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, stickerInitTranslationY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null));
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
