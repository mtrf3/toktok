package X;

import X.C6OF;
import X.C6OU;
import Y.ACListenerS22S0100000_2;
import Y.ALAdapterS1S0110000_2;
import Y.IDAListenerS71S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS1S0200002_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OF extends C6T3 {
    public final C6OE LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C1NS<C6O4> LJLJJLL;
    public final C159586Oc LJLJL;
    public final C6O3 LJLJLJ;
    public C1NS<TextStickerModel> LJLJLLL;
    public C1NS<TextStickerModel> LJLL;
    public LifecycleOwner LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public C159366Ng LJLLJ;
    public FrameLayout LJLLL;
    public TuxTextView LJLLLL;
    public TextStickerModel LJLLLLLL;
    public C6O5 LJLZ;
    public ViewGroup LJZ;
    public View LJZI;
    public FrameLayout LJZL;
    public C6Q4 LL;
    public final C62822Ol8 LLD;

    @Override // X.C6T3
    public final void LIZLLL() {
        setAnimStickerViewVisible(false);
        setTextStickerViewVisible(true);
        getTextStickerView().requestFocus();
    }

    @Override // X.C6T3
    public final void LIZIZ() {
        C6OM c6om;
        setVisibility(8);
        boolean z = false;
        setAnimStickerViewVisible(false);
        setTextStickerViewVisible(false);
        C1NS<TextStickerModel> c1ns = this.LJLJLLL;
        if (c1ns != null) {
            String textStr = c1ns.LJ.getTextStr();
            TextStickerModel textStickerModel = this.LJLLLLLL;
            if (textStickerModel != null) {
                boolean z2 = !o.LJ(textStr, textStickerModel.getTextStr());
                TextStickerModel textStickerModel2 = this.LJLLLLLL;
                if (textStickerModel2 != null) {
                    C1NS<TextStickerModel> c1ns2 = this.LJLJLLL;
                    if (c1ns2 != null) {
                        String textStr2 = c1ns2.LJ.getTextStr();
                        C1NS<TextStickerModel> c1ns3 = this.LJLJLLL;
                        if (c1ns3 != null) {
                            TextFontModel L = TextFontModel.L(c1ns3.LJ.getFontModel(), null, null, null, getTextStickerView().getTextSizeSp(), null, null, false, false, 495);
                            C1NS<TextStickerModel> c1ns4 = this.LJLJLLL;
                            if (c1ns4 != null) {
                                int mode = c1ns4.LJ.getMode();
                                C1NS<TextStickerModel> c1ns5 = this.LJLJLLL;
                                if (c1ns5 != null) {
                                    int color = c1ns5.LJ.getColor();
                                    C1NS<TextStickerModel> c1ns6 = this.LJLJLLL;
                                    if (c1ns6 != null) {
                                        int align = c1ns6.LJ.getAlign();
                                        TextStickerModel textStickerModel3 = this.LJLLLLLL;
                                        if (textStickerModel3 != null) {
                                            boolean z3 = false;
                                            BaseStickerModel copy$default = BaseStickerModel.copy$default(textStickerModel3.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, -1073741825, null);
                                            C1NS<TextStickerModel> c1ns7 = this.LJLJLLL;
                                            if (c1ns7 != null) {
                                                TTSModel ttsModel = c1ns7.LJ.getTtsModel();
                                                TextStickerModel textStickerModel4 = this.LJLLLLLL;
                                                if (textStickerModel4 != null) {
                                                    if (textStickerModel4.isManualEdited() || z2) {
                                                        z3 = true;
                                                    }
                                                    TextStickerModel copy$default2 = TextStickerModel.copy$default(textStickerModel2, copy$default, null, textStr2, mode, color, align, 0.0f, L, false, false, true, ttsModel, null, null, null, null, null, z3, 127042, null);
                                                    C6Q4 c6q4 = this.LL;
                                                    if (c6q4 != null) {
                                                        C1NS<TextStickerModel> c1ns8 = this.LJLJLLL;
                                                        if (c1ns8 != null) {
                                                            if (u.LJIJ(c1ns8.LJ)) {
                                                                TextStickerModel textStickerModel5 = this.LJLLLLLL;
                                                                if (textStickerModel5 != null) {
                                                                    if (u.LJIJ(textStickerModel5) && (c6om = (C6OM) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6OM.class))) != null && c6om.LJII) {
                                                                        z = true;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("savedTextStickerModel");
                                                                    throw null;
                                                                }
                                                            }
                                                            c6q4.LIZ(copy$default2, z);
                                                            return;
                                                        }
                                                        o.LJIJI("stateContainer");
                                                        throw null;
                                                    }
                                                    return;
                                                }
                                                o.LJIJI("savedTextStickerModel");
                                                throw null;
                                            }
                                            o.LJIJI("stateContainer");
                                            throw null;
                                        }
                                        o.LJIJI("savedTextStickerModel");
                                        throw null;
                                    }
                                    o.LJIJI("stateContainer");
                                    throw null;
                                }
                                o.LJIJI("stateContainer");
                                throw null;
                            }
                            o.LJIJI("stateContainer");
                            throw null;
                        }
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                    o.LJIJI("stateContainer");
                    throw null;
                }
                o.LJIJI("savedTextStickerModel");
                throw null;
            }
            o.LJIJI("savedTextStickerModel");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    @Override // X.C6T3
    public final void LJ() {
        C6Q4 c6q4 = this.LL;
        if (c6q4 != null) {
            c6q4.LIZLLL();
        }
    }

    public final C6OA getAbilityContainer() {
        return (C6OA) this.LLD.getValue();
    }

    @Override // X.C6T3
    public View getAlphaView() {
        ViewGroup viewGroup = this.LJZ;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("textEditRoot");
        throw null;
    }

    public final AnonymousClass635 getConfig() {
        return (AnonymousClass635) this.LJLJJL.getValue();
    }

    @Override // X.C6T3
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LJLLL;
        if (frameLayout != null) {
            int top = frameLayout.getTop();
            if (this.LJLLL != null) {
                return ((r0.getBottom() + top) / 2) - ((getBottom() + getTop()) / 2);
            }
            o.LJIJI("textStickerContainer");
            throw null;
        }
        o.LJIJI("textStickerContainer");
        throw null;
    }

    @Override // X.C6T3
    public float getStickerInitTranslationY() {
        TextStickerModel textStickerModel = this.LJLLLLLL;
        if (textStickerModel != null) {
            float centerY = textStickerModel.getBaseStickerModel().getCenterY();
            TextStickerModel textStickerModel2 = this.LJLLLLLL;
            if (textStickerModel2 != null) {
                float translateY = textStickerModel2.getBaseStickerModel().getTranslateY() + centerY;
                if (this.LJLLLLLL != null) {
                    return (translateY + r0.getBaseStickerModel().getContainerTop()) - ((getBottom() + getTop()) / 2);
                }
                o.LJIJI("savedTextStickerModel");
                throw null;
            }
            o.LJIJI("savedTextStickerModel");
            throw null;
        }
        o.LJIJI("savedTextStickerModel");
        throw null;
    }

    public final C159366Ng getTextStickerView() {
        return (C159366Ng) this.LJLLILLLL.getValue();
    }

    public final void LJIIL() {
        int i;
        int i2;
        C159366Ng textStickerView = getTextStickerView();
        C1NS<TextStickerModel> c1ns = this.LJLJLLL;
        if (c1ns != null) {
            textStickerView.setText(c1ns.LJ.getTextStr());
            C159366Ng textStickerView2 = getTextStickerView();
            C1NS<TextStickerModel> c1ns2 = this.LJLJLLL;
            if (c1ns2 != null) {
                textStickerView2.setSelection(c1ns2.LJ.getTextStr().length());
                setVisibility(0);
                C6OM c6om = (C6OM) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6OM.class));
                int i3 = 8;
                if (c6om != null) {
                    LinearLayout linearLayout = c6om.LJFF;
                    if (u.LJIJ(c6om.LIZJ.LJ)) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    linearLayout.setVisibility(i2);
                }
                C6OC c6oc = (C6OC) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6OC.class));
                if (c6oc != null) {
                    C1NS<TextStickerModel> c1ns3 = this.LJLJLLL;
                    if (c1ns3 != null) {
                        boolean z = !u.LJIJ(c1ns3.LJ);
                        ViewGroup viewGroup = c6oc.LIZIZ;
                        if (z) {
                            i = 0;
                        } else {
                            i = 4;
                        }
                        viewGroup.setVisibility(i);
                    } else {
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                }
                C6O9 c6o9 = (C6O9) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6O9.class));
                if (c6o9 != null) {
                    C1NS<TextStickerModel> c1ns4 = this.LJLJLLL;
                    if (c1ns4 != null) {
                        boolean z2 = !u.LJIJ(c1ns4.LJ);
                        TuxIconView tuxIconView = c6o9.LIZLLL;
                        if (tuxIconView != null) {
                            if (z2) {
                                i3 = 0;
                            }
                            tuxIconView.setVisibility(i3);
                        }
                    } else {
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                }
                C6O2 c6o2 = (C6O2) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6O2.class));
                if (c6o2 != null) {
                    c6o2.LIZIZ();
                }
                TextStickerModel textStickerModel = this.LJLLLLLL;
                if (textStickerModel != null) {
                    if (textStickerModel.getTextStr().length() == 0) {
                        setTextStickerViewVisible(true);
                        setAnimStickerViewVisible(false);
                        C6OC c6oc2 = (C6OC) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6OC.class));
                        if (c6oc2 != null) {
                            c6oc2.LIZJ();
                        }
                    }
                    C6OH c6oh = (C6OH) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6OH.class));
                    if (c6oh != null) {
                        c6oh.LIZIZ();
                        C6OI c6oi = c6oh.LIZLLL;
                        if (c6oi != null) {
                            c6oi.getTextSizeHelper().LIZIZ((TextView) c6oh.LJ.getValue());
                        }
                        C6OI c6oi2 = c6oh.LIZLLL;
                        if (c6oi2 != null) {
                            c6oi2.LIZIZ();
                        }
                    }
                    getAbilityContainer().LJ.LJI();
                    getSoftKeyBoardListener().LIZIZ(this);
                    LJI(getTextStickerView());
                    C6Q4 c6q4 = this.LL;
                    if (c6q4 != null) {
                        C1NS<TextStickerModel> c1ns5 = this.LJLJLLL;
                        if (c1ns5 != null) {
                            c6q4.LIZIZ(c1ns5.LJ);
                            return;
                        } else {
                            o.LJIJI("stateContainer");
                            throw null;
                        }
                    }
                    return;
                }
                o.LJIJI("savedTextStickerModel");
                throw null;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    @Override // X.C6T3
    public float getStickerContainerTranslationX() {
        return ((getTextStickerView().getRight() + getTextStickerView().getLeft()) / 2) - ((getRight() + getLeft()) / 2);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !getConfig().LJIIZILJ;
    }

    public final InterfaceC138675cN getApi() {
        return this.LJLJLJ;
    }

    public final C1NS<C6O4> getEditViewTextStickerEditState() {
        return this.LJLJJLL;
    }

    public final C6Q4 getStickerEditListener() {
        return this.LL;
    }

    private final void setAnimStickerViewVisible(boolean z) {
        C1NS<TextStickerModel> c1ns = this.LJLL;
        if (c1ns != null) {
            c1ns.LJ(new AqS7S0010000_2(z, 43));
        } else {
            o.LJIJI("animStateContainer");
            throw null;
        }
    }

    private final void setTextStickerViewVisible(boolean z) {
        int i;
        FrameLayout frameLayout = this.LJLLL;
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            frameLayout.setVisibility(i);
            return;
        }
        o.LJIJI("textStickerContainer");
        throw null;
    }

    @Override // X.C6T3
    public final void LIZJ(int i) {
        ViewGroup viewGroup = this.LJZ;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            ViewGroup viewGroup2 = this.LJZ;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("textEditRoot");
                throw null;
            }
        }
        o.LJIJI("textEditRoot");
        throw null;
    }

    @Override // X.C6T3
    public final void LJFF(int i) {
        FrameLayout frameLayout = this.LJLLL;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            FrameLayout frameLayout2 = this.LJLLL;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("textStickerContainer");
                throw null;
            }
        }
        o.LJIJI("textStickerContainer");
        throw null;
    }

    @Override // X.C6T3
    public final void LJI(EditText editText) {
        o.LJIIIZ(editText, "editText");
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 2);
        }
    }

    public final void LJIIIZ(boolean z) {
        getTextStickerView().setEnabled(z);
        if (z) {
            ViewPropertyAnimator scaleY = getTextStickerView().animate().scaleX(1.0f).scaleY(1.0f);
            C1NS<TextStickerModel> c1ns = this.LJLJLLL;
            if (c1ns != null) {
                scaleY.rotationBy(-c1ns.LJ.getBaseStickerModel().getRotation()).setDuration(100L).setListener(new ALAdapterS1S0110000_2(this, z, 3)).start();
                return;
            } else {
                o.LJIJI("stateContainer");
                throw null;
            }
        }
        ViewPropertyAnimator animate = getTextStickerView().animate();
        C1NS<TextStickerModel> c1ns2 = this.LJLJLLL;
        if (c1ns2 != null) {
            ViewPropertyAnimator scaleX = animate.scaleX(c1ns2.LJ.getBaseStickerModel().getScale());
            C1NS<TextStickerModel> c1ns3 = this.LJLJLLL;
            if (c1ns3 != null) {
                ViewPropertyAnimator scaleY2 = scaleX.scaleY(c1ns3.LJ.getBaseStickerModel().getScale());
                C1NS<TextStickerModel> c1ns4 = this.LJLJLLL;
                if (c1ns4 != null) {
                    scaleY2.rotationBy(c1ns4.LJ.getBaseStickerModel().getRotation()).setDuration(100L).setListener(new ALAdapterS1S0110000_2(this, z, 4)).start();
                    return;
                } else {
                    o.LJIJI("stateContainer");
                    throw null;
                }
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public final void LJIILIIL(TextStickerModel model) {
        o.LJIIIZ(model, "model");
        this.LJLLLLLL = model.deepCopy();
        C1NS<TextStickerModel> c1ns = this.LJLJLLL;
        if (c1ns != null) {
            c1ns.LJ(new AqS168S0100000_2(model, 463));
            setTextStickerViewVisible(false);
            C1NS<TextStickerModel> c1ns2 = this.LJLL;
            if (c1ns2 != null) {
                c1ns2.LJ(new AqS168S0100000_2(model, 464));
                return;
            } else {
                o.LJIJI("animStateContainer");
                throw null;
            }
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        C6OI c6oi;
        super.keyBoardHide(i);
        C6OB c6ob = (C6OB) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6OB.class));
        if (c6ob != null) {
            c6ob.LIZJ.LIZJ.LJ(new AqS168S0100000_2(c6ob, 441));
        }
        C1NS<TextStickerModel> c1ns = this.LJLL;
        if (c1ns != null) {
            c1ns.LJ(new AqS168S0100000_2(this, 462));
            setAnimStickerViewVisible(true);
            setTextStickerViewVisible(false);
            C159366Ng c159366Ng = this.LJLLJ;
            if (c159366Ng != null) {
                C1NS<TextStickerModel> c1ns2 = this.LJLL;
                if (c1ns2 != null) {
                    LJII(c159366Ng, c1ns2.LJ.getBaseStickerModel());
                    C6OH c6oh = (C6OH) getAbilityContainer().LIZ(C65352Pkq.LIZ(C6OH.class));
                    if (c6oh != null && (c6oi = c6oh.LIZLLL) != null) {
                        c6oi.LIZ();
                        return;
                    }
                    return;
                }
                o.LJIJI("animStateContainer");
                throw null;
            }
            o.LJIJI("animTextStickerView");
            throw null;
        }
        o.LJIJI("animStateContainer");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        boolean z;
        LIZJ(i);
        TextStickerModel textStickerModel = this.LJLLLLLL;
        if (textStickerModel != null) {
            if (textStickerModel.getTextStr().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                float stickerInitTranslationY = getStickerInitTranslationY();
                C159366Ng c159366Ng = this.LJLLJ;
                if (c159366Ng != null) {
                    c159366Ng.setTranslationY(stickerInitTranslationY);
                    C1NS<TextStickerModel> c1ns = this.LJLL;
                    if (c1ns != null) {
                        BaseStickerModel baseStickerModel = c1ns.LJ.getBaseStickerModel();
                        C1NS<TextStickerModel> c1ns2 = this.LJLL;
                        if (c1ns2 != null) {
                            c1ns2.LJ(new AqS5S0100001_2(baseStickerModel, stickerInitTranslationY, 6));
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
                            ofFloat.setDuration(300L);
                            ofFloat.addListener(new IDAListenerS71S0100000_2(this, 13));
                            ofFloat.start();
                            return;
                        }
                        o.LJIJI("animStateContainer");
                        throw null;
                    }
                    o.LJIJI("animStateContainer");
                    throw null;
                }
                o.LJIJI("animTextStickerView");
                throw null;
            }
            float stickerInitTranslationY2 = getStickerInitTranslationY();
            C159366Ng c159366Ng2 = this.LJLLJ;
            if (c159366Ng2 != null) {
                c159366Ng2.setTranslationY(stickerInitTranslationY2);
                C1NS<TextStickerModel> c1ns3 = this.LJLL;
                if (c1ns3 != null) {
                    BaseStickerModel baseStickerModel2 = c1ns3.LJ.getBaseStickerModel();
                    C1NS<TextStickerModel> c1ns4 = this.LJLL;
                    if (c1ns4 != null) {
                        c1ns4.LJ(new AqS5S0100001_2(baseStickerModel2, stickerInitTranslationY2, 7));
                        setAnimStickerViewVisible(true);
                        setTextStickerViewVisible(false);
                        C159366Ng c159366Ng3 = this.LJLLJ;
                        if (c159366Ng3 != null) {
                            LJIIIIZZ(c159366Ng3, BaseStickerModel.copy$default(baseStickerModel2, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, stickerInitTranslationY2, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null));
                            return;
                        } else {
                            o.LJIJI("animTextStickerView");
                            throw null;
                        }
                    }
                    o.LJIJI("animStateContainer");
                    throw null;
                }
                o.LJIJI("animStateContainer");
                throw null;
            }
            o.LJIJI("animTextStickerView");
            throw null;
        }
        o.LJIJI("savedTextStickerModel");
        throw null;
    }

    public final void setStickerEditListener(C6Q4 c6q4) {
        this.LL = c6q4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.6O3] */
    public C6OF(Context context, C160056Px stickerObjectContainer) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stickerObjectContainer, "stickerObjectContainer");
        new LinkedHashMap();
        this.LJLJJI = ((InterfaceC159886Pg) stickerObjectContainer.LIZIZ(C65352Pkq.LIZ(InterfaceC159886Pg.class))).LJFF();
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 767));
        this.LJLJJLL = new C1NS<>(new C6O4(0));
        this.LJLJL = new C159586Oc(new C6OR(this));
        this.LJLJLJ = new InterfaceC138675cN() { // from class: X.6O3
            @Override // X.InterfaceC138675cN
            public final C1NS<TextStickerModel> LIZIZ() {
                C1NS<TextStickerModel> c1ns = C6OF.this.LJLJLLL;
                if (c1ns != null) {
                    return c1ns;
                }
                o.LJIJI("stateContainer");
                throw null;
            }

            @Override // X.InterfaceC138675cN
            public final void LIZJ(boolean z) {
                C6O9 c6o9 = (C6O9) C6OF.this.getAbilityContainer().LIZ(C65352Pkq.LIZ(C6O9.class));
                if (c6o9 != null) {
                    c6o9.LIZIZ(z);
                }
            }

            @Override // X.InterfaceC138675cN
            public final boolean LJ(int i) {
                if (C6OF.this.getVisibility() == 0) {
                    C1NS<TextStickerModel> c1ns = C6OF.this.LJLJLLL;
                    if (c1ns != null) {
                        if (c1ns.LJ.getId() == i) {
                            return true;
                        }
                    } else {
                        o.LJIJI("stateContainer");
                        throw null;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC138675cN
            public final void LJFF(OSZ<String, String> osz) {
                C6OF.this.getEditViewTextStickerEditState().LJ(new AqS168S0100000_2(osz, (OSZ<Integer, Integer>) 466));
            }

            @Override // X.InterfaceC138675cN
            public final void LIZ(TTSModel tTSModel, OSZ<Float, Float> osz) {
                C1NS<TextStickerModel> c1ns = C6OF.this.LJLJLLL;
                if (c1ns != null) {
                    c1ns.LJ(new AqS133S0200000_2(tTSModel, osz, 105));
                    C6OF.this.LJIIIZ(true);
                    C6OF c6of = C6OF.this;
                    c6of.LJI(c6of.getTextStickerView());
                    return;
                }
                o.LJIJI("stateContainer");
                throw null;
            }

            @Override // X.InterfaceC138675cN
            public final void LIZLLL(TTSModel tTSModel, float f, float f2) {
                C6OF c6of = C6OF.this;
                C1NS<TextStickerModel> c1ns = c6of.LJLJLLL;
                if (c1ns != null) {
                    c1ns.LJ(new AqS1S0200002_2(c6of, f, f2, tTSModel, 0));
                } else {
                    o.LJIJI("stateContainer");
                    throw null;
                }
            }
        };
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS149S0200000_2(this, context, 82));
        this.LLD = C221108m2.LIZIZ(new AqS152S0100000_2(this, 766));
    }

    public static final void LJIIJ(C6OF c6of, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C6OA abilityContainer = c6of.getAbilityContainer();
        C6O2 c6o2 = (C6O2) abilityContainer.LIZ(C65352Pkq.LIZ(C6O2.class));
        int i7 = 4;
        if (c6o2 != null) {
            ViewGroup viewGroup = c6o2.LIZIZ;
            if (z) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            viewGroup.setVisibility(i6);
        }
        C6O9 c6o9 = (C6O9) abilityContainer.LIZ(C65352Pkq.LIZ(C6O9.class));
        if (c6o9 != null) {
            ViewGroup viewGroup2 = c6o9.LIZIZ;
            if (z) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            viewGroup2.setVisibility(i5);
        }
        C6ON c6on = (C6ON) abilityContainer.LIZ(C65352Pkq.LIZ(C6ON.class));
        if (c6on != null) {
            ViewGroup viewGroup3 = c6on.LIZIZ;
            if (z) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            viewGroup3.setVisibility(i4);
        }
        C6OH c6oh = (C6OH) abilityContainer.LIZ(C65352Pkq.LIZ(C6OH.class));
        if (c6oh != null) {
            ViewGroup viewGroup4 = c6oh.LIZIZ;
            if (z) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            viewGroup4.setVisibility(i3);
        }
        C6OC c6oc = (C6OC) abilityContainer.LIZ(C65352Pkq.LIZ(C6OC.class));
        if (c6oc != null) {
            ViewGroup viewGroup5 = c6oc.LIZIZ;
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            viewGroup5.setVisibility(i2);
        }
        View view = c6of.LJZI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            view.setVisibility(i);
            View findViewById = c6of.findViewById(R.id.af_);
            if (z) {
                i7 = 0;
            }
            findViewById.setVisibility(i7);
            return;
        }
        o.LJIJI("titleLayout");
        throw null;
    }

    public final void LJIIJJI(TextStickerModel model, C6O5 service, LifecycleOwner owner) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(service, "service");
        o.LJIIIZ(owner, "owner");
        this.LJLLLLLL = model.deepCopy();
        this.LJLJLLL = new C1NS<>(TextStickerModel.copy$default(model, null, null, null, 0, 0, 0, 0.0f, null, true, true, true, null, null, null, null, null, null, false, 260351, null));
        this.LJLL = new C1NS<>(TextStickerModel.copy$default(model, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, null, null, null, null, null, null, false, 260351, null));
        this.LJLLI = owner;
        this.LJLZ = service;
        C16880lQ.LLLZIIL(R.layout.cq_, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.l42);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.text_edit_root)");
        this.LJZ = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.la4);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.title_layout)");
        this.LJZI = findViewById2;
        ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C170576mj.LIZLLL(getContext());
        View findViewById3 = findViewById(R.id.kgr);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.sticker_container_layout)");
        this.LJLLL = (FrameLayout) findViewById3;
        setTextStickerViewVisible(false);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C159366Ng c159366Ng = new C159366Ng(context);
        C1NS<TextStickerModel> c1ns = this.LJLL;
        if (c1ns != null) {
            LifecycleOwner lifecycleOwner = this.LJLLI;
            if (lifecycleOwner != null) {
                c159366Ng.LJIIIZ(c1ns, lifecycleOwner, getConfig(), new AqS168S0100000_2(this, 470));
                this.LJLLJ = c159366Ng;
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.LJZL = frameLayout;
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                FrameLayout frameLayout2 = this.LJZL;
                if (frameLayout2 != null) {
                    C159366Ng c159366Ng2 = this.LJLLJ;
                    if (c159366Ng2 != null) {
                        frameLayout2.addView(c159366Ng2, layoutParams2);
                        View findViewById4 = findViewById(R.id.mm5);
                        o.LJIIIIZZ(findViewById4, "findViewById(R.id.tv_sure)");
                        this.LJLLLL = (TuxTextView) findViewById4;
                        C6OA abilityContainer = getAbilityContainer();
                        FrameLayout frameLayout3 = this.LJLLL;
                        if (frameLayout3 != null) {
                            abilityContainer.LIZIZ(new C6OB(frameLayout3, getAbilityContainer()));
                            View findViewById5 = findViewById(R.id.haj);
                            o.LJIIIIZZ(findViewById5, "findViewById(R.id.one_line_layout)");
                            abilityContainer.LIZIZ(new C6O9((ViewGroup) findViewById5, getAbilityContainer()));
                            View findViewById6 = findViewById(R.id.dln);
                            o.LJIIIIZZ(findViewById6, "findViewById(R.id.font_layout)");
                            abilityContainer.LIZIZ(new C6O2((ViewGroup) findViewById6, getAbilityContainer()));
                            View findViewById7 = findViewById(R.id.kgp);
                            o.LJIIIIZZ(findViewById7, "findViewById(R.id.sticker_config_container_layout)");
                            abilityContainer.LIZIZ(new C6ON((ViewGroup) findViewById7, getAbilityContainer()));
                            if (abilityContainer.LJFF.LJIIIIZZ) {
                                View findViewById8 = findViewById(R.id.l57);
                                o.LJIIIIZZ(findViewById8, "findViewById(R.id.text_size_slider_wrapper)");
                                abilityContainer.LIZIZ(new C6OH((ViewGroup) findViewById8, getAbilityContainer()));
                            }
                            AnonymousClass635 anonymousClass635 = abilityContainer.LJFF;
                            if (anonymousClass635.LIZLLL && (anonymousClass635.LJFF || anonymousClass635.LJI)) {
                                View findViewById9 = findViewById(R.id.czz);
                                o.LJIIIIZZ(findViewById9, "findViewById(R.id.et_tts_select_bubble_view)");
                                abilityContainer.LIZIZ(new C6OC((ViewGroup) findViewById9, getAbilityContainer()));
                            }
                            View findViewById10 = findViewById(R.id.g1p);
                            o.LJIIIIZZ(findViewById10, "findViewById(R.id.ll_apply_to_all)");
                            abilityContainer.LIZIZ(new C6OM((ViewGroup) findViewById10, getAbilityContainer()));
                            ViewGroup viewGroup = this.LJZ;
                            if (viewGroup != null) {
                                C16880lQ.LJIIL(viewGroup, new ACListenerS22S0100000_2(this, 111));
                                TuxTextView tuxTextView = this.LJLLLL;
                                if (tuxTextView != null) {
                                    C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0100000_2(this, 113));
                                    LifecycleOwner lifecycleOwner2 = this.LJLLI;
                                    if (lifecycleOwner2 != null) {
                                        lifecycleOwner2.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tools.sticker.core.text.view.TextStickerEditView$initListener$3
                                            @Override // androidx.lifecycle.LifecycleEventObserver
                                            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                                                o.LJIIIZ(source, "source");
                                                o.LJIIIZ(event, "event");
                                                if (C6OU.LIZ[event.ordinal()] == 1 && C6OF.this.getVisibility() == 0) {
                                                    C6OF c6of = C6OF.this;
                                                    c6of.LIZ(c6of.getTextStickerView());
                                                }
                                            }
                                        });
                                        return;
                                    } else {
                                        o.LJIJI("lifecycleOwner");
                                        throw null;
                                    }
                                }
                                o.LJIJI("sureView");
                                throw null;
                            }
                            o.LJIJI("textEditRoot");
                            throw null;
                        }
                        o.LJIJI("textStickerContainer");
                        throw null;
                    }
                    o.LJIJI("animTextStickerView");
                    throw null;
                }
                o.LJIJI("animStickerContainer");
                throw null;
            }
            o.LJIJI("lifecycleOwner");
            throw null;
        }
        o.LJIJI("animStateContainer");
        throw null;
    }
}
