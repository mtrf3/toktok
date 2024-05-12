package X;

import Y.IDAListenerS71S0100000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursSuggestTopic;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS3S0002000_2;
import kotlin.jvm.internal.AqS5S0100001_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6SQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SQ extends C6T3 {
    public static boolean LLIFFJFJJ;
    public final InterfaceC159886Pg LJLJJI;
    public AddYoursStickerModel LJLJJL;
    public ViewGroup LJLJJLL;
    public C1NS<AddYoursStickerModel> LJLJL;
    public C1NS<AddYoursStickerModel> LJLJLJ;
    public LifecycleOwner LJLJLLL;
    public FrameLayout LJLL;
    public View LJLLI;
    public TuxTextView LJLLILLLL;
    public C161096Tx LJLLJ;
    public C161096Tx LJLLL;
    public C29701Eo LJLLLL;
    public C6SO LJLLLLLL;
    public Point LJLZ;
    public C6Q4 LJZ;
    public final int LJZI;
    public C6SS LJZL;
    public final C6U1 LL;
    public int LLD;
    public java.util.Map<EnumC160626Sc, ? extends List<AddYoursStickerTopicRepoApi$AddYoursSuggestTopic>> LLF;
    public boolean LLFF;
    public String LLFFF;
    public boolean LLFII;
    public int LLFZ;
    public int LLI;

    @Override // X.C6T3
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    static {
        Keva repo = Keva.getRepo("add_yours_sticker_edit");
        boolean z = true;
        if (repo.getBoolean("is_first", true)) {
            repo.storeBoolean("is_first", false);
        } else {
            z = false;
        }
        LLIFFJFJJ = z;
    }

    @Override // X.C6T3
    public final void LIZIZ() {
        setVisibility(8);
        C1NS<AddYoursStickerModel> c1ns = this.LJLJLJ;
        if (c1ns != null) {
            c1ns.LJ(C6SY.LJLIL);
            C1NS<AddYoursStickerModel> c1ns2 = this.LJLJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C6SZ.LJLIL);
                AddYoursStickerModel addYoursStickerModel = this.LJLJJL;
                if (addYoursStickerModel != null) {
                    BaseStickerModel copy$default = BaseStickerModel.copy$default(addYoursStickerModel.getBaseStickerModel(), 0, 0, EnumC157656Gr.ADD_YOURS, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -5, null);
                    C1NS<AddYoursStickerModel> c1ns3 = this.LJLJL;
                    if (c1ns3 != null) {
                        String topicText = c1ns3.LJ.getTopicText();
                        C1NS<AddYoursStickerModel> c1ns4 = this.LJLJL;
                        if (c1ns4 != null) {
                            String topicTextFromRecommendTopicList = c1ns4.LJ.getTopicTextFromRecommendTopicList();
                            C1NS<AddYoursStickerModel> c1ns5 = this.LJLJL;
                            if (c1ns5 != null) {
                                AddYoursStickerModel copy$default2 = AddYoursStickerModel.copy$default(addYoursStickerModel, copy$default, null, null, topicText, topicTextFromRecommendTopicList, null, true, false, false, null, null, c1ns5.LJ.isOperationSet(), 1574, null);
                                C6Q4 c6q4 = this.LJZ;
                                if (c6q4 != null) {
                                    c6q4.LIZ(copy$default2, false);
                                }
                                this.LLD = -1;
                                LLIFFJFJJ = false;
                                return;
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
                o.LJIJI("savedAddYoursStickerModel");
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
        int i;
        C1NS<AddYoursStickerModel> c1ns = this.LJLJLJ;
        if (c1ns != null) {
            c1ns.LJ(C160606Sa.LJLIL);
            C1NS<AddYoursStickerModel> c1ns2 = this.LJLJL;
            if (c1ns2 != null) {
                c1ns2.LJ(C160616Sb.LJLIL);
                getAddYoursStickerView().getContentEditText().requestFocus();
                C6SN contentEditText = getAddYoursStickerView().getContentEditText();
                Editable text = getAddYoursStickerView().getContentEditText().getText();
                if (text != null) {
                    i = text.length();
                } else {
                    i = 0;
                }
                contentEditText.setSelection(i);
                return;
            }
            o.LJIJI("stateContainer");
            throw null;
        }
        o.LJIJI("animStateContainer");
        throw null;
    }

    @Override // X.C6T3
    public final void LJ() {
        C6Q4 c6q4 = this.LJZ;
        if (c6q4 != null) {
            c6q4.LIZLLL();
        }
    }

    public final C161096Tx getAddYoursStickerView() {
        C161096Tx c161096Tx = this.LJLLJ;
        if (c161096Tx != null) {
            return c161096Tx;
        }
        o.LJIJI("addYoursStickerView");
        throw null;
    }

    @Override // X.C6T3
    public View getAlphaView() {
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("editRootLayout");
        throw null;
    }

    @Override // X.C6T3
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LJLL;
        if (frameLayout != null) {
            int top = frameLayout.getTop();
            if (this.LJLL != null) {
                return ((r0.getBottom() + top) / 2) - ((getBottom() + getTop()) / 2);
            }
            o.LJIJI("addYoursStickerContainer");
            throw null;
        }
        o.LJIJI("addYoursStickerContainer");
        throw null;
    }

    @Override // X.C6T3
    public float getStickerInitTranslationY() {
        AddYoursStickerModel addYoursStickerModel = this.LJLJJL;
        if (addYoursStickerModel != null) {
            float centerY = addYoursStickerModel.getBaseStickerModel().getCenterY();
            AddYoursStickerModel addYoursStickerModel2 = this.LJLJJL;
            if (addYoursStickerModel2 != null) {
                float translateY = addYoursStickerModel2.getBaseStickerModel().getTranslateY() + centerY;
                if (this.LJLJJL != null) {
                    return (translateY + r0.getBaseStickerModel().getContainerTop()) - ((getBottom() + getTop()) / 2);
                }
                o.LJIJI("savedAddYoursStickerModel");
                throw null;
            }
            o.LJIJI("savedAddYoursStickerModel");
            throw null;
        }
        o.LJIJI("savedAddYoursStickerModel");
        throw null;
    }

    public final C6SS getInputMode() {
        return this.LJZL;
    }

    public final C6Q4 getStickerEditListener() {
        return this.LJZ;
    }

    @Override // X.C6T3
    public final void LIZ(EditText editText) {
        o.LJIIIZ(editText, "editText");
        super.LIZ(editText);
        LJIIIZ((C6SN) editText);
    }

    @Override // X.C6T3
    public final void LIZJ(int i) {
        ViewGroup viewGroup = this.LJLJJLL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            ViewGroup viewGroup2 = this.LJLJJLL;
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
        FrameLayout frameLayout = this.LJLL;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            FrameLayout frameLayout2 = this.LJLL;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("addYoursStickerContainer");
                throw null;
            }
        }
        o.LJIJI("addYoursStickerContainer");
        throw null;
    }

    public final void LJIIIZ(C6SN c6sn) {
        C1NS<AddYoursStickerModel> c1ns = this.LJLJL;
        if (c1ns != null) {
            if (!o.LJ(c1ns.LJ.getTopicText(), c6sn.getText().toString())) {
                C1NS<AddYoursStickerModel> c1ns2 = this.LJLJL;
                if (c1ns2 != null) {
                    c1ns2.LJ(new AqS168S0100000_2(c6sn, 602));
                    this.LJZL = C6SS.MANUAL;
                    return;
                } else {
                    o.LJIJI("stateContainer");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("stateContainer");
        throw null;
    }

    public final void LJIIJ(boolean z) {
        if (z) {
            TuxTextView tuxTextView = this.LJLLILLLL;
            if (tuxTextView != null) {
                tuxTextView.setEnabled(false);
                TuxTextView tuxTextView2 = this.LJLLILLLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColorRes(R.attr.dn);
                    return;
                } else {
                    o.LJIJI("sureView");
                    throw null;
                }
            }
            o.LJIJI("sureView");
            throw null;
        }
        TuxTextView tuxTextView3 = this.LJLLILLLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setEnabled(true);
            TuxTextView tuxTextView4 = this.LJLLILLLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColorRes(R.attr.dj);
                return;
            } else {
                o.LJIJI("sureView");
                throw null;
            }
        }
        o.LJIJI("sureView");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        int i2;
        if (getState() == C6T6.PAUSE) {
            return;
        }
        super.keyBoardHide(i);
        String str = this.LLFFF;
        C1NS<AddYoursStickerModel> c1ns = this.LJLJL;
        if (c1ns != null) {
            if (!o.LJ(str, c1ns.LJ.getTopicText())) {
                C1NS<AddYoursStickerModel> c1ns2 = this.LJLJL;
                if (c1ns2 != null) {
                    c1ns2.LJ(C6SV.LJLIL);
                } else {
                    o.LJIJI("stateContainer");
                    throw null;
                }
            }
            C1NS<AddYoursStickerModel> c1ns3 = this.LJLJL;
            if (c1ns3 != null) {
                c1ns3.LJ(new AqS168S0100000_2(this, 599));
                C1NS<AddYoursStickerModel> c1ns4 = this.LJLJLJ;
                if (c1ns4 != null) {
                    c1ns4.LJ(new AqS168S0100000_2(this, 600));
                    C1NS<AddYoursStickerModel> c1ns5 = this.LJLJL;
                    if (c1ns5 != null) {
                        c1ns5.LJ(C6SW.LJLIL);
                        C6Q4 c6q4 = this.LJZ;
                        if (c6q4 != null) {
                            c6q4.LJ();
                        }
                        AddYoursStickerModel addYoursStickerModel = this.LJLJJL;
                        if (addYoursStickerModel != null) {
                            String topicText = addYoursStickerModel.getTopicText();
                            if (topicText == null || topicText.length() == 0) {
                                int width = (getAddYoursStickerView().getWidth() / 2) + C278817o.LIZ(32.0f);
                                Point point = this.LJLZ;
                                if (point != null) {
                                    int i3 = width - point.x;
                                    Context context = getContext();
                                    o.LJIIIIZZ(context, "context");
                                    if (C26338AVi.LIZJ(context)) {
                                        i2 = -1;
                                    } else {
                                        i2 = 1;
                                    }
                                    int i4 = i3 * i2;
                                    int height = (getAddYoursStickerView().getHeight() / 2) + C278817o.LIZ(158.0f);
                                    Point point2 = this.LJLZ;
                                    if (point2 != null) {
                                        int i5 = height - point2.y;
                                        AddYoursStickerModel addYoursStickerModel2 = this.LJLJJL;
                                        if (addYoursStickerModel2 != null) {
                                            this.LJLJJL = AddYoursStickerModel.copy$default(addYoursStickerModel2, BaseStickerModel.copy$default(addYoursStickerModel2.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, i4, i5, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -6291457, null), null, null, null, null, null, false, false, false, null, null, null, 4094, null);
                                            C1NS<AddYoursStickerModel> c1ns6 = this.LJLJLJ;
                                            if (c1ns6 != null) {
                                                c1ns6.LJ(new AqS3S0002000_2(i4, i5, 1));
                                            } else {
                                                o.LJIJI("animStateContainer");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("savedAddYoursStickerModel");
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
                            C1NS<AddYoursStickerModel> c1ns7 = this.LJLJL;
                            if (c1ns7 != null) {
                                String topicText2 = c1ns7.LJ.getTopicText();
                                if (topicText2 == null || topicText2.length() == 0) {
                                    C1NS<AddYoursStickerModel> c1ns8 = this.LJLJLJ;
                                    if (c1ns8 != null) {
                                        c1ns8.LJ(C6SX.LJLIL);
                                    } else {
                                        o.LJIJI("animStateContainer");
                                        throw null;
                                    }
                                }
                                C161096Tx c161096Tx = this.LJLLL;
                                if (c161096Tx != null) {
                                    C1NS<AddYoursStickerModel> c1ns9 = this.LJLJLJ;
                                    if (c1ns9 != null) {
                                        LJII(c161096Tx, c1ns9.LJ.getBaseStickerModel());
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
                        o.LJIJI("savedAddYoursStickerModel");
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
        o.LJIJI("stateContainer");
        throw null;
    }

    @Override // X.C6T3, X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        if (getState() == C6T6.PAUSE) {
            return;
        }
        LIZJ(i);
        AddYoursStickerModel addYoursStickerModel = this.LJLJJL;
        if (addYoursStickerModel != null) {
            String topicText = addYoursStickerModel.getTopicText();
            if (topicText == null || topicText.length() == 0) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addListener(new IDAListenerS71S0100000_2(this, 15));
                ofFloat.start();
                return;
            }
            float stickerInitTranslationY = getStickerInitTranslationY();
            C161096Tx c161096Tx = this.LJLLL;
            if (c161096Tx != null) {
                c161096Tx.setTranslationY(stickerInitTranslationY);
                C1NS<AddYoursStickerModel> c1ns = this.LJLJLJ;
                if (c1ns != null) {
                    BaseStickerModel baseStickerModel = c1ns.LJ.getBaseStickerModel();
                    C1NS<AddYoursStickerModel> c1ns2 = this.LJLJLJ;
                    if (c1ns2 != null) {
                        c1ns2.LJ(new AqS5S0100001_2(baseStickerModel, stickerInitTranslationY, 10));
                        C1NS<AddYoursStickerModel> c1ns3 = this.LJLJLJ;
                        if (c1ns3 != null) {
                            c1ns3.LJ(C160676Sh.LJLIL);
                            C1NS<AddYoursStickerModel> c1ns4 = this.LJLJL;
                            if (c1ns4 != null) {
                                c1ns4.LJ(C160686Si.LJLIL);
                                C161096Tx c161096Tx2 = this.LJLLL;
                                if (c161096Tx2 != null) {
                                    LJIIIIZZ(c161096Tx2, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, stickerInitTranslationY, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -4194305, null));
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
        o.LJIJI("savedAddYoursStickerModel");
        throw null;
    }

    public final void setAddYoursStickerView(C161096Tx c161096Tx) {
        o.LJIIIZ(c161096Tx, "<set-?>");
        this.LJLLJ = c161096Tx;
    }

    public final void setInputMode(C6SS c6ss) {
        o.LJIIIZ(c6ss, "<set-?>");
        this.LJZL = c6ss;
    }

    public final void setStickerEditListener(C6Q4 c6q4) {
        this.LJZ = c6q4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6SQ(Context context, InterfaceC159886Pg editProvideStickerService) {
        super(context, null, 0);
        C6U1 LJFF;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(editProvideStickerService, "editProvideStickerService");
        new LinkedHashMap();
        this.LJLJJI = editProvideStickerService;
        this.LJZI = 40;
        this.LJZL = C6SS.MANUAL;
        C6SL LJIIJ = editProvideStickerService.LJIIJ();
        this.LL = (LJIIJ == null || (LJFF = LJIIJ.LJFF()) == null) ? C6U1.LARGER_WHITE : LJFF;
        this.LLD = -1;
        this.LLF = C113554cx.LJJJLIIL();
        this.LLFF = true;
    }
}
