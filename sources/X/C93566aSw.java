package X;

import Y.IDCListenerS139S0100000_42;
import Y.IDObjectS187S0100000_42;
import Y.IDTListenerS69S0000000_2;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aSw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93566aSw extends FrameLayout {
    public ViewGroup LJLIL;
    public C94441ah3 LJLILLLLZI;
    public C1556068u LJLJI;
    public TuxIconView LJLJJI;
    public TuxIconView LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public final boolean LJLL;
    public final InputMethodManager LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public C1554968j LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public final boolean LJZL;
    public InterfaceC139695e1 LL;
    public List<InteractTextStructWrap> LLD;
    public InterfaceC93565aSv LLF;

    private final Point getEditInputEditTextScreenCenterPoint() {
        int[] iArr = new int[2];
        View view = this.LJLLLL;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            View view2 = this.LJLLLL;
            if (view2 != null) {
                int width = view2.getWidth() / 2;
                View view3 = this.LJLLLL;
                if (view3 != null) {
                    Point point = new Point(width, view3.getHeight() / 2);
                    return new Point(iArr[0] + point.x, iArr[1] + point.y);
                }
                o.LJIJI("inputLayout");
                throw null;
            }
            o.LJIJI("inputLayout");
            throw null;
        }
        o.LJIJI("inputLayout");
        throw null;
    }

    private final int getLayoutRes() {
        return R.layout.dwp;
    }

    public final Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        View view = this.LJLLLL;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            View view2 = this.LJLLLL;
            if (view2 != null) {
                int width = view2.getWidth() / 2;
                View view3 = this.LJLLLL;
                if (view3 != null) {
                    Point point = new Point(width, view3.getHeight() / 2);
                    return new Point(iArr[0] + point.x, iArr[1] + point.y);
                }
                o.LJIJI("inputLayout");
                throw null;
            }
            o.LJIJI("inputLayout");
            throw null;
        }
        o.LJIJI("inputLayout");
        throw null;
    }

    public final int getScene() {
        return 0;
    }

    public final void setBgColorChangeListener(AnonymousClass630 anonymousClass630) {
    }

    public final void setInputLayoutShowListener(AnonymousClass645 anonymousClass645) {
    }

    private final List<TextStickerTextWrap> getTextContent() {
        ArrayList arrayList = new ArrayList();
        C94441ah3 c94441ah3 = this.LJLILLLLZI;
        if (c94441ah3 != null) {
            arrayList.add(C68W.LIZ(c94441ah3, this.LLD));
            return arrayList;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }

    private final TextStickerTextWrap getTextWrap() {
        C94441ah3 c94441ah3 = this.LJLILLLLZI;
        if (c94441ah3 != null) {
            return C68W.LIZ(c94441ah3, this.LLD);
        }
        o.LJIJI("simpleEditText");
        throw null;
    }

    private final List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    public final void LIZ() {
        int i = this.LJLJJLL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    TuxIconView tuxIconView = this.LJLJJI;
                    if (tuxIconView != null) {
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_text_outline;
                        c2068389v.LJ = Integer.valueOf(R.attr.dj);
                        tuxIconView.setTuxIcon(c2068389v);
                        return;
                    }
                    o.LJIJI("changeModeImgView");
                    throw null;
                }
                TuxIconView tuxIconView2 = this.LJLJJI;
                if (tuxIconView2 != null) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_color_text_transparent;
                    c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView2.setTuxIcon(c2068389v2);
                    return;
                }
                o.LJIJI("changeModeImgView");
                throw null;
            }
            TuxIconView tuxIconView3 = this.LJLJJI;
            if (tuxIconView3 != null) {
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZ = R.raw.icon_text_background;
                c2068389v3.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView3.setTuxIcon(c2068389v3);
                return;
            }
            o.LJIJI("changeModeImgView");
            throw null;
        }
        TuxIconView tuxIconView4 = this.LJLJJI;
        if (tuxIconView4 != null) {
            C2068389v c2068389v4 = new C2068389v();
            c2068389v4.LIZ = R.raw.icon_text_stroke;
            c2068389v4.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView4.setTuxIcon(c2068389v4);
            return;
        }
        o.LJIJI("changeModeImgView");
        throw null;
    }

    public final void LIZIZ() {
        int i = this.LJLJLJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                TuxIconView tuxIconView = this.LJLJJL;
                if (tuxIconView != null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_lines_right_aligned;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    return;
                }
                o.LJIJI("alignTxtView");
                throw null;
            }
            TuxIconView tuxIconView2 = this.LJLJJL;
            if (tuxIconView2 != null) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_lines_center_aligned;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView2.setTuxIcon(c2068389v2);
                return;
            }
            o.LJIJI("alignTxtView");
            throw null;
        }
        TuxIconView tuxIconView3 = this.LJLJJL;
        if (tuxIconView3 != null) {
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_lines_left_aligned;
            c2068389v3.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView3.setTuxIcon(c2068389v3);
            return;
        }
        o.LJIJI("alignTxtView");
        throw null;
    }

    public final Point getEditPageSize() {
        return new Point(getWidth(), getHeight());
    }

    public final String getEditTextStr() {
        String obj;
        C94441ah3 c94441ah3 = this.LJLILLLLZI;
        if (c94441ah3 != null) {
            Editable text = c94441ah3.getText();
            if (text == null || (obj = text.toString()) == null) {
                return "";
            }
            return obj;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }

    private final int getTopMargin() {
        return C170576mj.LIZLLL(getContext());
    }

    public final Point getEditInputCenterPoint() {
        int LIZJ = C170576mj.LIZJ(getContext()) / 2;
        View view = this.LJLLLL;
        if (view != null) {
            return new Point(LIZJ, ((int) C170576mj.LIZ(getContext(), 52.0f)) + (view.getHeight() / 2));
        }
        o.LJIJI("inputLayout");
        throw null;
    }

    public final void LIZJ(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        if (!textFontStyleData.LIZ()) {
            if (this.LJLJL == -1 || this.LJLJJLL != 1) {
                this.LJLJL = this.LJLJJLL;
                this.LJLJJLL = 1;
            }
            TuxIconView tuxIconView = this.LJLJJI;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(0.34f);
                TuxIconView tuxIconView2 = this.LJLJJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setClickable(false);
                    TuxIconView tuxIconView3 = this.LJLJJI;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setTag(Boolean.FALSE);
                        return;
                    } else {
                        o.LJIJI("changeModeImgView");
                        throw null;
                    }
                }
                o.LJIJI("changeModeImgView");
                throw null;
            }
            o.LJIJI("changeModeImgView");
            throw null;
        }
        int i = this.LJLJL;
        if (i != -1) {
            this.LJLJJLL = i;
        }
        TuxIconView tuxIconView4 = this.LJLJJI;
        if (tuxIconView4 != null) {
            tuxIconView4.setAlpha(1.0f);
            TuxIconView tuxIconView5 = this.LJLJJI;
            if (tuxIconView5 != null) {
                tuxIconView5.setClickable(true);
                TuxIconView tuxIconView6 = this.LJLJJI;
                if (tuxIconView6 != null) {
                    tuxIconView6.setTag(Boolean.TRUE);
                    return;
                } else {
                    o.LJIJI("changeModeImgView");
                    throw null;
                }
            }
            o.LJIJI("changeModeImgView");
            throw null;
        }
        o.LJIJI("changeModeImgView");
        throw null;
    }

    public final void LIZLLL(int i) {
        View view = this.LJLLL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i;
            View view2 = this.LJLLL;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
                return;
            } else {
                o.LJIJI("contentLayout");
                throw null;
            }
        }
        o.LJIJI("contentLayout");
        throw null;
    }

    public final void setData(TextStickerData data) {
        o.LJIIIZ(data, "data");
        int bgMode = data.getBgMode();
        int color = data.getColor();
        int align = data.getAlign();
        this.LJLJJLL = bgMode;
        this.LJLJLLL = color;
        this.LJLJLJ = align;
        if (TextUtils.isEmpty(data.getFontType())) {
            C68M.LJIIJ().LJIJJLI(getScene(), data.getFontType());
        }
    }

    public final void setTextStickerInputMobListener(InterfaceC139695e1 interfaceC139695e1) {
        this.LL = interfaceC139695e1;
    }

    public final void setTextStickerUpdateListener(InterfaceC93565aSv interfaceC93565aSv) {
        this.LLF = interfaceC93565aSv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93566aSw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLJJLL = 1;
        this.LJLJL = -1;
        this.LJLJLJ = 2;
        this.LJLJLLL = -1;
        this.LJLL = true;
        this.LJZL = true;
        this.LLD = new ArrayList();
        Object LLILL = C16880lQ.LLILL(context, "input_method");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.LJLLI = (InputMethodManager) LLILL;
        View LLLZIIL = C16880lQ.LLLZIIL(getLayoutRes(), C16880lQ.LLZIL(getContext()), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLZIIL;
        this.LJLIL = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.bt6);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.content_Layout)");
        this.LJLLL = findViewById;
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 != null) {
            View findViewById2 = viewGroup2.findViewById(R.id.eor);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.input_layout)");
            this.LJLLLL = findViewById2;
            ViewGroup viewGroup3 = this.LJLIL;
            if (viewGroup3 != null) {
                View findViewById3 = viewGroup3.findViewById(R.id.czq);
                o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.et_input)");
                C94441ah3 c94441ah3 = (C94441ah3) findViewById3;
                this.LJLILLLLZI = c94441ah3;
                c94441ah3.addTextChangedListener(new IDObjectS187S0100000_42(this, 2));
                ViewGroup viewGroup4 = this.LJLIL;
                if (viewGroup4 != null) {
                    View findViewById4 = viewGroup4.findViewById(R.id.mm5);
                    o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.tv_sure)");
                    this.LJLLILLLL = findViewById4;
                    findViewById4.setAlpha(0.5f);
                    View view = this.LJLLILLLL;
                    if (view != null) {
                        view.setClickable(false);
                        ViewGroup viewGroup5 = this.LJLIL;
                        if (viewGroup5 != null) {
                            this.LJLLJ = viewGroup5.findViewById(R.id.m1c);
                            C94441ah3 c94441ah32 = this.LJLILLLLZI;
                            if (c94441ah32 != null) {
                                c94441ah32.setEnabled(true);
                                c94441ah32.setClickable(true);
                                c94441ah32.setFocusable(true);
                                c94441ah32.setFocusableInTouchMode(true);
                                C94441ah3 c94441ah33 = this.LJLILLLLZI;
                                if (c94441ah33 != null) {
                                    c94441ah33.setInEdit(true);
                                    ViewGroup viewGroup6 = this.LJLIL;
                                    if (viewGroup6 != null) {
                                        View findViewById5 = viewGroup6.findViewById(R.id.js6);
                                        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.shade)");
                                        this.LJLJJI = (TuxIconView) findViewById5;
                                        ViewGroup viewGroup7 = this.LJLIL;
                                        if (viewGroup7 != null) {
                                            ViewGroup viewGroup8 = (ViewGroup) viewGroup7.findViewById(R.id.dln);
                                            C1554968j LIZ = C1554968j.LIZ(getScene(), getContext());
                                            this.LJLLLLLL = LIZ;
                                            LIZ.LIZIZ(C68M.LJIIJ().LJIIIZ());
                                            C68M.LJIIJ().LJ = new C94240ado(this);
                                            if (viewGroup8 != null) {
                                                C1554968j c1554968j = this.LJLLLLLL;
                                                if (c1554968j != null) {
                                                    viewGroup8.addView(c1554968j);
                                                } else {
                                                    o.LJIJI("selectFontLayout");
                                                    throw null;
                                                }
                                            }
                                            ViewGroup viewGroup9 = this.LJLIL;
                                            if (viewGroup9 != null) {
                                                View findViewById6 = viewGroup9.findViewById(R.id.a0k);
                                                o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.id.align_txt)");
                                                TuxIconView tuxIconView = (TuxIconView) findViewById6;
                                                this.LJLJJL = tuxIconView;
                                                C16880lQ.LJJJ(tuxIconView, new IDCListenerS139S0100000_42(this, 11));
                                                ViewGroup viewGroup10 = this.LJLIL;
                                                if (viewGroup10 != null) {
                                                    C1556068u c1556068u = (C1556068u) viewGroup10.findViewById(R.id.bi_);
                                                    this.LJLJI = c1556068u;
                                                    if (c1556068u != null) {
                                                        c1556068u.setColorChangeListener(new C94241adp(this));
                                                    }
                                                    C1554968j c1554968j2 = this.LJLLLLLL;
                                                    if (c1554968j2 != null) {
                                                        c1554968j2.setClickFontStyleListener(new C94242adq(this));
                                                        TuxIconView tuxIconView2 = this.LJLJJI;
                                                        if (tuxIconView2 != null) {
                                                            C16880lQ.LJJJ(tuxIconView2, new C94243adr(this));
                                                            ViewGroup viewGroup11 = this.LJLIL;
                                                            if (viewGroup11 != null) {
                                                                viewGroup11.findViewById(R.id.g6j);
                                                                View view2 = this.LJLLILLLL;
                                                                if (view2 != null) {
                                                                    C16880lQ.LJIIJ(new IDCListenerS139S0100000_42(this, 12), view2);
                                                                    View view3 = this.LJLLJ;
                                                                    if (view3 != null) {
                                                                        C16880lQ.LJIIJ(new IDCListenerS139S0100000_42(this, 13), view3);
                                                                    }
                                                                    TuxIconView tuxIconView3 = this.LJLJJI;
                                                                    if (tuxIconView3 != null) {
                                                                        tuxIconView3.setImageResource(R.drawable.b4s);
                                                                        TuxIconView tuxIconView4 = this.LJLJJL;
                                                                        if (tuxIconView4 != null) {
                                                                            tuxIconView4.setImageResource(R.drawable.b4t);
                                                                            ViewGroup viewGroup12 = this.LJLIL;
                                                                            if (viewGroup12 != null) {
                                                                                addView(viewGroup12);
                                                                                ViewGroup viewGroup13 = this.LJLIL;
                                                                                if (viewGroup13 != null) {
                                                                                    ViewGroup.LayoutParams layoutParams = viewGroup13.getLayoutParams();
                                                                                    o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                                                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                                                                    layoutParams2.topMargin = getTopMargin();
                                                                                    ViewGroup viewGroup14 = this.LJLIL;
                                                                                    if (viewGroup14 != null) {
                                                                                        viewGroup14.setLayoutParams(layoutParams2);
                                                                                        ViewGroup viewGroup15 = this.LJLIL;
                                                                                        if (viewGroup15 != null) {
                                                                                            this.LJZ = viewGroup15.findViewById(R.id.aj4);
                                                                                            ViewGroup viewGroup16 = this.LJLIL;
                                                                                            if (viewGroup16 != null) {
                                                                                                this.LJLZ = viewGroup16.findViewById(R.id.aj3);
                                                                                                ViewGroup viewGroup17 = this.LJLIL;
                                                                                                if (viewGroup17 != null) {
                                                                                                    View findViewById7 = viewGroup17.findViewById(R.id.jlw);
                                                                                                    this.LJZI = findViewById7;
                                                                                                    if (findViewById7 != null) {
                                                                                                        findViewById7.setVisibility(8);
                                                                                                    }
                                                                                                    View view4 = this.LJZ;
                                                                                                    if (view4 != null) {
                                                                                                        view4.setBackground(C78127UlP.LIZJ(-1, 16777215, (int) C170576mj.LIZ(getContext(), 2.0f), (int) C170576mj.LIZ(getContext(), 4.0f)));
                                                                                                    }
                                                                                                    View view5 = this.LJLZ;
                                                                                                    if (view5 != null) {
                                                                                                        view5.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
                                                                                                    }
                                                                                                    View view6 = this.LJZI;
                                                                                                    if (view6 != null) {
                                                                                                        C16880lQ.LJIIJ(new IDCListenerS139S0100000_42(this, 10), view6);
                                                                                                    }
                                                                                                    C82740Wdc.LIZJ(this.LJZI);
                                                                                                    TuxIconView tuxIconView5 = this.LJLJJI;
                                                                                                    if (tuxIconView5 != null) {
                                                                                                        tuxIconView5.setOnTouchListener(new IDTListenerS69S0000000_2(3));
                                                                                                        View view7 = this.LJLLILLLL;
                                                                                                        if (view7 != null) {
                                                                                                            C82740Wdc.LIZIZ(view7);
                                                                                                            TuxIconView tuxIconView6 = this.LJLJJL;
                                                                                                            if (tuxIconView6 != null) {
                                                                                                                C82740Wdc.LIZJ(tuxIconView6);
                                                                                                                return;
                                                                                                            } else {
                                                                                                                o.LJIJI("alignTxtView");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        }
                                                                                                        o.LJIJI("sureView");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    o.LJIJI("changeModeImgView");
                                                                                                    throw null;
                                                                                                }
                                                                                                o.LJIJI("rootView");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("rootView");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("rootView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("rootView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("rootView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("rootView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("alignTxtView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("changeModeImgView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("sureView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("rootView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("changeModeImgView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("selectFontLayout");
                                                    throw null;
                                                }
                                                o.LJIJI("rootView");
                                                throw null;
                                            }
                                            o.LJIJI("rootView");
                                            throw null;
                                        }
                                        o.LJIJI("rootView");
                                        throw null;
                                    }
                                    o.LJIJI("rootView");
                                    throw null;
                                }
                                o.LJIJI("simpleEditText");
                                throw null;
                            }
                            o.LJIJI("simpleEditText");
                            throw null;
                        }
                        o.LJIJI("rootView");
                        throw null;
                    }
                    o.LJIJI("sureView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
