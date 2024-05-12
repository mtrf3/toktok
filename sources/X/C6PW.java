package X;

import Y.IDAListenerS71S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import defpackage.a1;
import kotlin.jvm.internal.AqS0S0000002_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6PW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PW extends C6T3 {
    public QAStickerModel LJLJJI;
    public C1NS<QAStickerModel> LJLJJL;
    public C1NS<QAStickerModel> LJLJJLL;
    public C6S4 LJLJL;
    public C6S4 LJLJLJ;
    public LifecycleOwner LJLJLLL;
    public ViewGroup LJLL;
    public FrameLayout LJLLI;
    public View LJLLILLLL;
    public TuxTextView LJLLJ;
    public Point LJLLL;
    public C6Q4 LJLLLL;
    public int LJLLLLLL;

    @Override // X.C6T3
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    @Override // X.C6T3
    public final void LIZIZ() {
        setVisibility(8);
        C1NS<QAStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C159906Pi.LJLIL);
            C1NS<QAStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C159916Pj.LJLIL);
                QAStickerModel qAStickerModel = this.LJLJJI;
                if (qAStickerModel != null) {
                    BaseStickerModel copy$default = BaseStickerModel.copy$default(qAStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.75f, Integer.MAX_VALUE, null);
                    C1NS<QAStickerModel> c1ns3 = this.LJLJJL;
                    if (c1ns3 != null) {
                        QAStickerModel copy$default2 = QAStickerModel.copy$default(qAStickerModel, copy$default, 0L, 0L, 0L, null, null, c1ns3.LJ.getQuestionContent(), null, null, null, null, null, null, null, null, false, false, true, 0.0f, 0L, null, null, 3964862, null);
                        C6Q4 c6q4 = this.LJLLLL;
                        if (c6q4 != null) {
                            c6q4.LIZ(copy$default2, false);
                            return;
                        }
                        return;
                    }
                    o.LJIJI("stateContainer");
                    throw null;
                }
                o.LJIJI("savedQAStickerModel");
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
        C1NS<QAStickerModel> c1ns = this.LJLJJLL;
        if (c1ns != null) {
            c1ns.LJ(C159926Pk.LJLIL);
            C1NS<QAStickerModel> c1ns2 = this.LJLJJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C159936Pl.LJLIL);
                C6S4 c6s4 = this.LJLJL;
                if (c6s4 != null) {
                    c6s4.getContentEditText().requestFocus();
                    return;
                } else {
                    o.LJIJI("qaStickerView");
                    throw null;
                }
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("animStateContainer");
        throw null;
    }

    public final boolean LJIIIZ() {
        QAStickerModel qAStickerModel = this.LJLJJI;
        if (qAStickerModel != null) {
            if (qAStickerModel.getQuestionContent().length() == 0) {
                return true;
            }
            return false;
        }
        o.LJIJI("savedQAStickerModel");
        throw null;
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
            o.LJIJI("qaStickerContainer");
            throw null;
        }
        o.LJIJI("qaStickerContainer");
        throw null;
    }

    @Override // X.C6T3
    public float getStickerInitTranslationY() {
        QAStickerModel qAStickerModel = this.LJLJJI;
        if (qAStickerModel != null) {
            float centerY = qAStickerModel.getBaseStickerModel().getCenterY();
            QAStickerModel qAStickerModel2 = this.LJLJJI;
            if (qAStickerModel2 != null) {
                float translateY = qAStickerModel2.getBaseStickerModel().getTranslateY() + centerY;
                if (this.LJLJJI != null) {
                    return (translateY + r0.getBaseStickerModel().getContainerTop()) - ((getBottom() + getTop()) / 2);
                }
                o.LJIJI("savedQAStickerModel");
                throw null;
            }
            o.LJIJI("savedQAStickerModel");
            throw null;
        }
        o.LJIJI("savedQAStickerModel");
        throw null;
    }

    public final int getQaStickerContainerTopMargin() {
        return this.LJLLLLLL;
    }

    public final C6Q4 getStickerEditListener() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6PW(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLLLLLL = C170576mj.LIZLLL(context);
    }

    @Override // X.C6T3
    public final void LIZJ(int i) {
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
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
                o.LJIJI("qaStickerContainer");
                throw null;
            }
        }
        o.LJIJI("qaStickerContainer");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        int i2;
        super.keyBoardHide(i);
        if (this.LJLJL != null) {
            float width = r0.getWidth() * 0.75f;
            if (this.LJLJL != null) {
                float height = r0.getHeight() * 0.75f;
                C1NS<QAStickerModel> c1ns = this.LJLJJL;
                if (c1ns != null) {
                    c1ns.LJ(new AqS168S0100000_2(this, 567));
                    C1NS<QAStickerModel> c1ns2 = this.LJLJJLL;
                    if (c1ns2 != null) {
                        c1ns2.LJ(new AqS168S0100000_2(this, 568));
                        C1NS<QAStickerModel> c1ns3 = this.LJLJJL;
                        if (c1ns3 != null) {
                            c1ns3.LJ(C159896Ph.LJLIL);
                            if (LJIIIZ()) {
                                float f = 2;
                                float LIZ = (width / f) + C170576mj.LIZ(getContext(), 30.0f);
                                if (this.LJLLL != null) {
                                    float f2 = LIZ - r0.x;
                                    if (C90193gN.LIZ()) {
                                        i2 = -1;
                                    } else {
                                        i2 = 1;
                                    }
                                    float f3 = f2 * i2;
                                    float LIZ2 = (height / f) + C170576mj.LIZ(getContext(), 100.0f) + this.LJLLLLLL;
                                    if (this.LJLLL != null) {
                                        float f4 = LIZ2 - r0.y;
                                        C1NS<QAStickerModel> c1ns4 = this.LJLJJLL;
                                        if (c1ns4 != null) {
                                            c1ns4.LJ(new AqS0S0000002_2(f3, f4, 2));
                                        } else {
                                            o.LJIJI("animStateContainer");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("stickerContainerCenter");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("stickerContainerCenter");
                                    throw null;
                                }
                            }
                            C6S4 c6s4 = this.LJLJLJ;
                            if (c6s4 != null) {
                                C1NS<QAStickerModel> c1ns5 = this.LJLJJLL;
                                if (c1ns5 != null) {
                                    LJII(c6s4, c1ns5.LJ.getBaseStickerModel());
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
            o.LJIJI("qaStickerView");
            throw null;
        }
        o.LJIJI("qaStickerView");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        LIZJ(i);
        if (LJIIIZ()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new IDAListenerS71S0100000_2(this, 14));
            ofFloat.start();
            return;
        }
        float stickerInitTranslationY = getStickerInitTranslationY();
        C6S4 c6s4 = this.LJLJLJ;
        if (c6s4 != null) {
            c6s4.setTranslationY(stickerInitTranslationY);
            C1NS<QAStickerModel> c1ns = this.LJLJJLL;
            if (c1ns != null) {
                BaseStickerModel baseStickerModel = c1ns.LJ.getBaseStickerModel();
                C1NS<QAStickerModel> c1ns2 = this.LJLJJLL;
                if (c1ns2 != null) {
                    c1ns2.LJ(new AqS5S0100001_2(baseStickerModel, stickerInitTranslationY, 9));
                    C1NS<QAStickerModel> c1ns3 = this.LJLJJLL;
                    if (c1ns3 != null) {
                        c1ns3.LJ(C159996Pr.LJLIL);
                        C1NS<QAStickerModel> c1ns4 = this.LJLJJL;
                        if (c1ns4 != null) {
                            c1ns4.LJ(C160006Ps.LJLIL);
                            C6S4 c6s42 = this.LJLJLJ;
                            if (c6s42 != null) {
                                LJIIIIZZ(c6s42, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, stickerInitTranslationY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null));
                                return;
                            } else {
                                o.LJIJI("animStickerView");
                                throw null;
                            }
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

    public final void setQaStickerContainerTopMargin(int i) {
        this.LJLLLLLL = i;
    }

    public final void setStickerEditListener(C6Q4 c6q4) {
        this.LJLLLL = c6q4;
    }
}
