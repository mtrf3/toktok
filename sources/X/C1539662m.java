package X;

import Y.ACListenerS22S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDTListenerS69S0000000_2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.62m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1539662m extends FrameLayout {
    public static final /* synthetic */ int LLIZ = 0;
    public final Context LJLIL;
    public ViewGroup LJLILLLLZI;
    public C1551667c LJLJI;
    public C1556068u LJLJJI;
    public TuxIconView LJLJJL;
    public TuxIconView LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public boolean LJLLI;
    public final InputMethodManager LJLLILLLL;
    public AnonymousClass645 LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public C1554968j LJLZ;
    public LinearLayout LJZ;
    public C71897SJp LJZI;
    public View LJZL;
    public View LL;
    public View LLD;
    public boolean LLF;
    public InterfaceC139695e1 LLFF;
    public List<InteractTextStructWrap> LLFFF;
    public String LLFII;
    public String LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public String LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public long LLIIJI;
    public String LLIIJLIL;
    public boolean LLIIL;
    public String LLIILII;
    public boolean LLIILZL;
    public C6B9 LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public InterfaceC88472Yns<? super String, C76800UCe> LLILL;
    public C157146Es LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;

    private final int getLayoutRes() {
        return R.layout.at1;
    }

    public final Point getEditInputEditTextScreenCenterPoint() {
        int[] iArr = new int[2];
        View view = this.LJLLLLLL;
        o.LJI(view);
        view.getLocationOnScreen(iArr);
        View view2 = this.LJLLLLLL;
        o.LJI(view2);
        int width = view2.getWidth() / 2;
        View view3 = this.LJLLLLLL;
        o.LJI(view3);
        Point point = new Point(width, view3.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public final Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        View view = this.LJLLLLLL;
        o.LJI(view);
        view.getLocationOnScreen(iArr);
        View view2 = this.LJLLLLLL;
        o.LJI(view2);
        int width = view2.getWidth() / 2;
        View view3 = this.LJLLLLLL;
        o.LJI(view3);
        Point point = new Point(width, view3.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public final int getScene() {
        return 0;
    }

    public final void setBgColorChangeListener(AnonymousClass630 anonymousClass630) {
    }

    public final void setOnReadTextClickListener(InterfaceC1540762x interfaceC1540762x) {
    }

    public final void setTextStickerUpdateListener(InterfaceC1540862y interfaceC1540862y) {
    }

    private final int getEditTextLength() {
        Editable text;
        C1551667c c1551667c = this.LJLJI;
        if (c1551667c != null && (text = c1551667c.getText()) != null) {
            return text.length();
        }
        return 0;
    }

    private final String getEditTextStr() {
        Editable text;
        String obj;
        C1551667c c1551667c = this.LJLJI;
        if (c1551667c == null || (text = c1551667c.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final void LIZIZ() {
        InputMethodManager inputMethodManager;
        C1551667c c1551667c = this.LJLJI;
        if (c1551667c != null && (inputMethodManager = this.LJLLILLLL) != null) {
            o.LJI(c1551667c);
            inputMethodManager.hideSoftInputFromWindow(c1551667c.getWindowToken(), 0);
        }
    }

    public final void LIZLLL() {
        int i = this.LJLJL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    TuxIconView tuxIconView = this.LJLJJL;
                    if (tuxIconView != null) {
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_text_outline;
                        c2068389v.LJ = Integer.valueOf(R.attr.dj);
                        tuxIconView.setTuxIcon(c2068389v);
                        return;
                    }
                    o.LJIJI("mChangeColorImgView");
                    throw null;
                }
                TuxIconView tuxIconView2 = this.LJLJJL;
                if (tuxIconView2 != null) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_color_text_transparent;
                    tuxIconView2.setTuxIcon(c2068389v2);
                    return;
                }
                o.LJIJI("mChangeColorImgView");
                throw null;
            }
            TuxIconView tuxIconView3 = this.LJLJJL;
            if (tuxIconView3 != null) {
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZ = R.raw.icon_text_background;
                c2068389v3.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView3.setTuxIcon(c2068389v3);
                return;
            }
            o.LJIJI("mChangeColorImgView");
            throw null;
        }
        TuxIconView tuxIconView4 = this.LJLJJL;
        if (tuxIconView4 != null) {
            C2068389v c2068389v4 = new C2068389v();
            c2068389v4.LIZ = R.raw.icon_text_stroke;
            c2068389v4.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView4.setTuxIcon(c2068389v4);
            return;
        }
        o.LJIJI("mChangeColorImgView");
        throw null;
    }

    public final void LJFF() {
        int i = this.LJLJLLL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                TuxIconView tuxIconView = this.LJLJJLL;
                if (tuxIconView != null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_lines_right_aligned;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    return;
                }
                o.LJIJI("mAlignTxtView");
                throw null;
            }
            TuxIconView tuxIconView2 = this.LJLJJLL;
            if (tuxIconView2 != null) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_lines_center_aligned;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView2.setTuxIcon(c2068389v2);
                return;
            }
            o.LJIJI("mAlignTxtView");
            throw null;
        }
        TuxIconView tuxIconView3 = this.LJLJJLL;
        if (tuxIconView3 != null) {
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_lines_left_aligned;
            c2068389v3.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView3.setTuxIcon(c2068389v3);
            return;
        }
        o.LJIJI("mAlignTxtView");
        throw null;
    }

    public final Point getEditInputCenterPoint() {
        int LIZJ = C170576mj.LIZJ(this.LJLIL) / 2;
        View view = this.LJLLLLLL;
        o.LJI(view);
        int height = view.getHeight();
        return new Point(LIZJ, (height / 2) + ((int) C170576mj.LIZ(this.LJLIL, 52.0f)));
    }

    public final Point getEditPageSize() {
        return new Point(getWidth(), getHeight());
    }

    public final List<TextStickerTextWrap> getTextContent() {
        ArrayList arrayList = new ArrayList();
        C1551667c c1551667c = this.LJLJI;
        if (c1551667c != null) {
            arrayList.add(C68W.LIZ(c1551667c, this.LLFFF));
        }
        return arrayList;
    }

    public final TextStickerTextWrap getTextWrap() {
        return C68W.LIZ(this.LJLJI, this.LLFFF);
    }

    public final List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    private final int getTopMargin() {
        return C170576mj.LIZLLL(getContext());
    }

    public final TextStickerData LIZ() {
        List<InlineRichTextStyleData> list;
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        boolean z2;
        TextFontStyleData LJFF = C68M.LJIIJ().LJFF(getScene());
        InterfaceC139695e1 interfaceC139695e1 = this.LLFF;
        int i2 = 1;
        if (interfaceC139695e1 != null) {
            boolean LJIIJJI = C68W.LJIIJJI(getTextContent());
            boolean LJIIJ = C68W.LJIIJ(getTextContent());
            if (this.LLIIL) {
                str2 = "caption";
            } else {
                str2 = "text";
            }
            String str4 = "";
            if (LJFF == null || (str3 = LJFF.title) == null) {
                str3 = "";
            }
            if (this.LLIIIZ.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC139695e1.LJII(new C147105py(LJIIJJI, LJIIJ, i2, str2, str4, str3, z2, this.LLIIIZ));
        }
        if (this.LJLLI) {
            return null;
        }
        TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0L, false, false, false, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, -1, -1, 1048575, null);
        textStickerData.setTextWrapList(getTextWrapList());
        C157146Es c157146Es = this.LLILLIZIL;
        if (c157146Es != null) {
            list = c157146Es.LJ();
        } else {
            list = C61878OQg.INSTANCE;
        }
        textStickerData.setInlineTextStyles(list);
        textStickerData.setTextStr(getEditTextStr());
        textStickerData.setFontType(C68M.LJIIJ().LIZJ);
        textStickerData.setAlign(this.LJLJLLL);
        textStickerData.setBgMode(this.LJLJL);
        textStickerData.setColor(this.LJLL);
        C1551667c c1551667c = this.LJLJI;
        if (c1551667c != null) {
            i = c1551667c.getEditFontSize();
        } else {
            i = 28;
        }
        textStickerData.setFontSize(i);
        C1551667c c1551667c2 = this.LJLJI;
        if (c1551667c2 != null) {
            textStickerData.setLineSpacingExtra(c1551667c2.getLineSpacingExtra() / (c1551667c2.getEditFontSize() / c1551667c2.getDefaultTextSize()));
        }
        textStickerData.setAdjustTextParagraph(this.LLFZ);
        textStickerData.setAdjustTextFontInEditorPro(this.LLI);
        textStickerData.setAdjustTextStyleInEditorPro(this.LLFII);
        textStickerData.setAdjustTextColorInEditorPro(this.LLIFFJFJJ);
        textStickerData.setAdjustTextPositionInEditorPro(this.LLII);
        textStickerData.setEditorProTrimLength(this.LLIIII);
        textStickerData.setEditorProText(this.LLIIIILZ);
        textStickerData.setEditorProCopyText(this.LLIIIJ);
        textStickerData.setEditorProTTS(this.LLIIIL);
        textStickerData.setEditorProTTSID(this.LLIIIZ);
        textStickerData.setHasChangedFontSize(this.LLILII);
        C1551667c c1551667c3 = this.LJLJI;
        if (c1551667c3 != null) {
            z = c1551667c3.getUseAutoTextSize();
        } else {
            z = true;
        }
        textStickerData.setUseAutoTextSize(z);
        textStickerData.setScale(1.0f);
        Point editInputEditTextScreenCenterPoint = getEditInputEditTextScreenCenterPoint();
        if (editInputEditTextScreenCenterPoint == null) {
            editInputEditTextScreenCenterPoint = new Point(0, 0);
        }
        textStickerData.setEditCenterPoint(editInputEditTextScreenCenterPoint);
        if (this.LLILZ) {
            setVisibility(8);
        } else {
            C136685Ya.LIZ(this);
        }
        this.LJLLI = true;
        textStickerData.setEditInEPDuration(System.currentTimeMillis() - this.LLIIJI);
        if (this.LLIIL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        textStickerData.setEditorProCaption(str);
        textStickerData.setAdjustTextRollbar(this.LLILLL);
        textStickerData.setUseColorDropper(this.LLILLJJLI);
        C6B9 c6b9 = this.LLIIZ;
        if (c6b9 != null) {
            if (this.LLILIL) {
                c6b9.LIZ();
            }
            this.LLIL = this.LLIIL;
        }
        return textStickerData;
    }

    public final int getAlignTxt() {
        return this.LJLJLLL;
    }

    public final boolean getApplyToAll() {
        return this.LLIILZL;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getColorPickerClickListener() {
        return this.LLILL;
    }

    public final int getCurColor() {
        return this.LJLL;
    }

    public final boolean getCurrentIsCaption() {
        return this.LLIIL;
    }

    public final String getCurrentLanguageCode() {
        return this.LLIILII;
    }

    public final String getCurrentSlotId() {
        return this.LLIIJLIL;
    }

    public final EditText getEditText() {
        return this.LJLJI;
    }

    public final void LIZJ(int i) {
        OSZ<Integer, Integer> LIZ = AnonymousClass633.LIZ();
        int intValue = LIZ.getFirst().intValue();
        int intValue2 = LIZ.getSecond().intValue();
        C6B9 c6b9 = this.LLIIZ;
        if (c6b9 != null) {
            c6b9.LIZJ(Integer.valueOf(intValue), Integer.valueOf(intValue2), i);
        }
    }

    public final void LJI(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        if (!textFontStyleData.LIZ()) {
            if (this.LJLJLJ == -1 || this.LJLJL != 1) {
                this.LJLJLJ = this.LJLJL;
                this.LJLJL = 1;
            }
            TuxIconView tuxIconView = this.LJLJJL;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(0.34f);
                TuxIconView tuxIconView2 = this.LJLJJL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setClickable(false);
                    TuxIconView tuxIconView3 = this.LJLJJL;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setTag(Boolean.FALSE);
                        return;
                    } else {
                        o.LJIJI("mChangeColorImgView");
                        throw null;
                    }
                }
                o.LJIJI("mChangeColorImgView");
                throw null;
            }
            o.LJIJI("mChangeColorImgView");
            throw null;
        }
        int i = this.LJLJLJ;
        if (i != -1) {
            this.LJLJL = i;
        }
        TuxIconView tuxIconView4 = this.LJLJJL;
        if (tuxIconView4 != null) {
            tuxIconView4.setAlpha(1.0f);
            TuxIconView tuxIconView5 = this.LJLJJL;
            if (tuxIconView5 != null) {
                tuxIconView5.setClickable(true);
                TuxIconView tuxIconView6 = this.LJLJJL;
                if (tuxIconView6 != null) {
                    tuxIconView6.setTag(Boolean.TRUE);
                    return;
                } else {
                    o.LJIJI("mChangeColorImgView");
                    throw null;
                }
            }
            o.LJIJI("mChangeColorImgView");
            throw null;
        }
        o.LJIJI("mChangeColorImgView");
        throw null;
    }

    public final void setApplyToAll(boolean z) {
        this.LLIILZL = z;
    }

    public final void setColorPickerClickListener(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LLILL = interfaceC88472Yns;
    }

    public final void setCurrentIsCaption(boolean z) {
        this.LLIIL = z;
    }

    public final void setCurrentLanguageCode(String str) {
        this.LLIILII = str;
    }

    public final void setCurrentSlotId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLIIJLIL = str;
    }

    public final void setEditPage(boolean z) {
        this.LLF = z;
    }

    public final void setEditTime(boolean z) {
        this.LLILZIL = z;
    }

    public final void setInputLayoutShowListener(AnonymousClass645 anonymousClass645) {
        this.LJLLJ = anonymousClass645;
    }

    public final void setTextStickerInputMobListener(InterfaceC139695e1 interfaceC139695e1) {
        this.LLFF = interfaceC139695e1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539662m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "mContext");
        this.LJLIL = context;
        this.LJLJL = 1;
        this.LJLJLJ = -1;
        this.LJLJLLL = 2;
        this.LJLL = -1;
        this.LJLLI = true;
        this.LLF = true;
        this.LLFFF = new ArrayList();
        this.LLFII = CardStruct.IStatusCode.DEFAULT;
        this.LLFZ = CardStruct.IStatusCode.DEFAULT;
        this.LLI = CardStruct.IStatusCode.DEFAULT;
        this.LLIFFJFJJ = CardStruct.IStatusCode.DEFAULT;
        this.LLII = CardStruct.IStatusCode.DEFAULT;
        this.LLIIII = CardStruct.IStatusCode.DEFAULT;
        this.LLIIIILZ = CardStruct.IStatusCode.DEFAULT;
        this.LLIIIJ = CardStruct.IStatusCode.DEFAULT;
        this.LLIIIL = CardStruct.IStatusCode.DEFAULT;
        this.LLIIIZ = "";
        this.LLIIJLIL = "";
        this.LLILIL = true;
        this.LLILZLL = 1;
        Object LLILL = C16880lQ.LLILL(context, "input_method");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.LJLLILLLL = (InputMethodManager) LLILL;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.agn});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…e.TextStickerInputLayout)");
            this.LLILZLL = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
        }
        View LLLZIIL = C16880lQ.LLLZIIL(getLayoutRes(), C16880lQ.LLZIL(context), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLZIIL;
        this.LJLILLLLZI = viewGroup;
        this.LJLLLL = viewGroup.findViewById(R.id.bt6);
        ViewGroup viewGroup2 = this.LJLILLLLZI;
        if (viewGroup2 != null) {
            this.LJLLLLLL = viewGroup2.findViewById(R.id.eor);
            ViewGroup viewGroup3 = this.LJLILLLLZI;
            if (viewGroup3 != null) {
                C1551667c c1551667c = (C1551667c) viewGroup3.findViewById(R.id.czq);
                this.LJLJI = c1551667c;
                if (c1551667c != null) {
                    c1551667c.setEnabled(true);
                    c1551667c.setClickable(true);
                    c1551667c.setFocusable(true);
                    c1551667c.setFocusableInTouchMode(true);
                }
                C1551667c c1551667c2 = this.LJLJI;
                if (c1551667c2 != null) {
                    c1551667c2.setInEdit(true);
                }
                ViewGroup viewGroup4 = this.LJLILLLLZI;
                if (viewGroup4 != null) {
                    View findViewById = viewGroup4.findViewById(R.id.js6);
                    o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.shade)");
                    this.LJLJJL = (TuxIconView) findViewById;
                    ViewGroup viewGroup5 = this.LJLILLLLZI;
                    if (viewGroup5 != null) {
                        ViewGroup viewGroup6 = (ViewGroup) viewGroup5.findViewById(R.id.dln);
                        C1554968j LIZ = C1554968j.LIZ(getScene(), context);
                        this.LJLZ = LIZ;
                        LIZ.LIZIZ(C68M.LJIIJ().LJIIIZ());
                        C68M.LJIIJ().LJ = new InterfaceC1549866k() { // from class: X.5yx
                            @Override // X.InterfaceC1549866k
                            public final void accept(Object obj) {
                                C2VQ.LIZIZ(new AqS149S0200000_2(C1539662m.this, (C1539662m) obj, (List<TextFontStyleData>) 70), 0L);
                            }
                        };
                        if (viewGroup6 != null) {
                            viewGroup6.addView(this.LJLZ);
                        }
                        ViewGroup viewGroup7 = this.LJLILLLLZI;
                        if (viewGroup7 != null) {
                            View findViewById2 = viewGroup7.findViewById(R.id.a0k);
                            o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.align_txt)");
                            this.LJLJJLL = (TuxIconView) findViewById2;
                            C1551667c c1551667c3 = this.LJLJI;
                            if (c1551667c3 != null) {
                                c1551667c3.addTextChangedListener(new TextWatcher() { // from class: X.62t
                                    @Override // android.text.TextWatcher
                                    public final void afterTextChanged(Editable s) {
                                        o.LJIIIZ(s, "s");
                                    }

                                    @Override // android.text.TextWatcher
                                    public final void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
                                        o.LJIIIZ(s, "s");
                                    }

                                    @Override // android.text.TextWatcher
                                    public final void onTextChanged(CharSequence s, int i, int i2, int i3) {
                                        o.LJIIIZ(s, "s");
                                    }
                                });
                            }
                            TuxIconView tuxIconView = this.LJLJJLL;
                            if (tuxIconView != null) {
                                C16880lQ.LJJJ(tuxIconView, new ACListenerS22S0100000_2(this, 96));
                                ViewGroup viewGroup8 = this.LJLILLLLZI;
                                if (viewGroup8 != null) {
                                    C1556068u c1556068u = (C1556068u) viewGroup8.findViewById(R.id.bi_);
                                    this.LJLJJI = c1556068u;
                                    if (c1556068u != null) {
                                        c1556068u.setColorChangeListener(new InterfaceC1556368x() { // from class: X.62o
                                            /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
                                            
                                                if (r3 == false) goto L6;
                                             */
                                            @Override // X.InterfaceC1556368x
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final void LIZ(int r5) {
                                                /*
                                                    r4 = this;
                                                    X.62m r0 = X.C1539662m.this
                                                    X.6Es r0 = r0.LLILLIZIL
                                                    if (r0 == 0) goto L37
                                                    boolean r3 = r0.LIZJ(r5)
                                                    if (r3 != 0) goto L1b
                                                Lc:
                                                    X.62m r0 = X.C1539662m.this
                                                    X.67c r1 = r0.LJLJI
                                                    if (r1 == 0) goto L17
                                                    int r0 = r0.LJLJL
                                                    r1.LJIIIIZZ(r0, r5)
                                                L17:
                                                    X.62m r0 = X.C1539662m.this
                                                    r0.LJLL = r5
                                                L1b:
                                                    X.62m r0 = X.C1539662m.this
                                                    X.5e1 r2 = r0.LLFF
                                                    if (r2 == 0) goto L2d
                                                    boolean r0 = r0.getCurrentIsCaption()
                                                    if (r0 == 0) goto L34
                                                    java.lang.String r1 = "caption"
                                                L29:
                                                    r0 = 1
                                                    X.C139685e0.LIZ(r2, r5, r0, r1, r3)
                                                L2d:
                                                    X.62m r1 = X.C1539662m.this
                                                    java.lang.String r0 = "1"
                                                    r1.LLIFFJFJJ = r0
                                                    return
                                                L34:
                                                    java.lang.String r1 = "text"
                                                    goto L29
                                                L37:
                                                    r3 = 0
                                                    goto Lc
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C1539862o.LIZ(int):void");
                                            }
                                        });
                                    }
                                    if (C138525c8.LIZ()) {
                                        C1556068u c1556068u2 = this.LJLJJI;
                                        if (c1556068u2 != null) {
                                            c1556068u2.LIZLLL();
                                        }
                                        C1556068u c1556068u3 = this.LJLJJI;
                                        if (c1556068u3 != null) {
                                            c1556068u3.setColorPickerClickListener(new ACListenerS22S0100000_2(this, 95));
                                        }
                                    }
                                    C1554968j c1554968j = this.LJLZ;
                                    if (c1554968j != null) {
                                        c1554968j.setClickFontStyleListener(new InterfaceC1555668q() { // from class: X.62n
                                            /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
                                            @Override // X.InterfaceC1555668q
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final void LIZ(com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData r11) {
                                                /*
                                                    r10 = this;
                                                    r4 = r11
                                                    if (r4 != 0) goto L4
                                                    return
                                                L4:
                                                    X.62m r0 = X.C1539662m.this
                                                    r0.LJI(r4)
                                                    X.62m r0 = X.C1539662m.this
                                                    X.6Es r3 = r0.LLILLIZIL
                                                    if (r3 == 0) goto L64
                                                    java.lang.String r2 = r4.fileName
                                                    java.lang.String r0 = "type.fileName"
                                                    kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
                                                    X.68M r1 = X.C68M.LJIIJ()
                                                    java.lang.String r0 = r4.fileName
                                                    android.graphics.Typeface r1 = r1.LJIIL(r0)
                                                    java.lang.String r0 = "getInstance().getTypeface(type.fileName)"
                                                    kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
                                                    boolean r8 = r3.LIZLLL(r1, r2)
                                                    if (r8 == 0) goto L65
                                                    X.62m r0 = X.C1539662m.this
                                                    X.67c r2 = r0.LJLJI
                                                    if (r2 == 0) goto L3a
                                                    int r1 = r0.LJLJL
                                                    int r0 = r0.getCurColor()
                                                    r2.LJIIIIZZ(r1, r0)
                                                L3a:
                                                    X.62m r0 = X.C1539662m.this
                                                    X.68j r1 = r0.LJLZ
                                                    if (r1 == 0) goto L45
                                                    java.lang.String r0 = r4.fileName
                                                    r1.setSelectedFontType(r0)
                                                L45:
                                                    X.62m r0 = X.C1539662m.this
                                                    X.5e1 r3 = r0.LLFF
                                                    if (r3 == 0) goto L5a
                                                    r5 = 1
                                                    boolean r0 = r0.getCurrentIsCaption()
                                                    if (r0 == 0) goto L61
                                                    java.lang.String r6 = "caption"
                                                L54:
                                                    r7 = 0
                                                    r9 = 8
                                                    X.C139685e0.LIZIZ(r3, r4, r5, r6, r7, r8, r9)
                                                L5a:
                                                    X.62m r1 = X.C1539662m.this
                                                    java.lang.String r0 = "1"
                                                    r1.LLI = r0
                                                    return
                                                L61:
                                                    java.lang.String r6 = "text"
                                                    goto L54
                                                L64:
                                                    r8 = 0
                                                L65:
                                                    X.68M r2 = X.C68M.LJIIJ()
                                                    java.lang.String r1 = r4.fileName
                                                    X.62m r0 = X.C1539662m.this
                                                    int r0 = r0.getScene()
                                                    r2.LJIJJLI(r0, r1)
                                                    X.62m r0 = X.C1539662m.this
                                                    X.67c r2 = r0.LJLJI
                                                    if (r2 == 0) goto L8b
                                                    X.68M r1 = X.C68M.LJIIJ()
                                                    X.62m r0 = X.C1539662m.this
                                                    int r0 = r0.getScene()
                                                    android.graphics.Typeface r0 = r1.LJ(r0)
                                                    r2.setFontType(r0)
                                                L8b:
                                                    X.62m r1 = X.C1539662m.this
                                                    X.6Es r0 = r1.LLILLIZIL
                                                    if (r0 == 0) goto L9e
                                                    X.68j r1 = r1.LJLZ
                                                    if (r1 == 0) goto L9e
                                                    X.68M r0 = X.C68M.LJIIJ()
                                                    java.lang.String r0 = r0.LIZJ
                                                    r1.setSelectedFontType(r0)
                                                L9e:
                                                    X.62m r0 = X.C1539662m.this
                                                    X.67c r2 = r0.LJLJI
                                                    if (r2 == 0) goto Lad
                                                    int r1 = r0.LJLJL
                                                    int r0 = r0.getCurColor()
                                                    r2.LJIIIIZZ(r1, r0)
                                                Lad:
                                                    X.62m r0 = X.C1539662m.this
                                                    int r0 = r0.getScene()
                                                    if (r0 != 0) goto L45
                                                    X.62m r2 = X.C1539662m.this
                                                    boolean r0 = r2.LLILII
                                                    if (r0 != 0) goto L45
                                                    int r1 = r4.fontSize
                                                    if (r1 <= 0) goto Lc8
                                                    X.67c r0 = r2.LJLJI
                                                    if (r0 == 0) goto L45
                                                    r0.setFontSize(r1)
                                                    goto L45
                                                Lc8:
                                                    X.67c r1 = r2.LJLJI
                                                    if (r1 == 0) goto L45
                                                    boolean r0 = r2.getCurrentIsCaption()
                                                    if (r0 == 0) goto Ld9
                                                    r0 = 22
                                                Ld4:
                                                    r1.setFontSize(r0)
                                                    goto L45
                                                Ld9:
                                                    r0 = 28
                                                    goto Ld4
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: X.C1539762n.LIZ(com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData):void");
                                            }
                                        });
                                    }
                                    TuxIconView tuxIconView2 = this.LJLJJL;
                                    if (tuxIconView2 != null) {
                                        C16880lQ.LJJJ(tuxIconView2, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 38));
                                        ViewGroup viewGroup9 = this.LJLILLLLZI;
                                        if (viewGroup9 != null) {
                                            viewGroup9.findViewById(R.id.g6j);
                                            ViewGroup viewGroup10 = this.LJLILLLLZI;
                                            if (viewGroup10 != null) {
                                                View findViewById3 = viewGroup10.findViewById(R.id.kug);
                                                ViewGroup viewGroup11 = this.LJLILLLLZI;
                                                if (viewGroup11 != null) {
                                                    View findViewById4 = viewGroup11.findViewById(R.id.mm5);
                                                    if (this.LLILZLL == 0) {
                                                        this.LJLLL = findViewById3;
                                                        findViewById4.setVisibility(8);
                                                    } else {
                                                        this.LJLLL = findViewById4;
                                                        findViewById3.setVisibility(8);
                                                    }
                                                    ACListenerS22S0100000_2 aCListenerS22S0100000_2 = new ACListenerS22S0100000_2(this, 99);
                                                    View view = this.LJLLL;
                                                    if (view != null) {
                                                        C16880lQ.LJIIJ(aCListenerS22S0100000_2, view);
                                                    }
                                                    ViewGroup viewGroup12 = this.LJLILLLLZI;
                                                    if (viewGroup12 != null) {
                                                        C16880lQ.LJIIL(viewGroup12, new ACListenerS22S0100000_2(this, 97));
                                                        TuxIconView tuxIconView3 = this.LJLJJL;
                                                        if (tuxIconView3 != null) {
                                                            tuxIconView3.setImageResource(R.drawable.b4s);
                                                            if (C138855cf.LIZ()) {
                                                                ViewGroup viewGroup13 = this.LJLILLLLZI;
                                                                if (viewGroup13 != null) {
                                                                    C6B9 c6b9 = (C6B9) viewGroup13.findViewById(R.id.l56);
                                                                    c6b9.setOnTextSizeChangedListener(new C6BH() { // from class: X.62s
                                                                        @Override // X.C6BH
                                                                        public final void LIZ() {
                                                                            C1551667c c1551667c4 = C1539662m.this.LJLJI;
                                                                            if (c1551667c4 != null) {
                                                                                c1551667c4.setUseAutoTextSize(false);
                                                                            }
                                                                            C1539662m.this.LLILII = true;
                                                                        }
                                                                    });
                                                                    OSZ<Integer, Integer> LIZ2 = AnonymousClass633.LIZ();
                                                                    c6b9.LIZJ(Integer.valueOf(LIZ2.getFirst().intValue()), Integer.valueOf(LIZ2.getSecond().intValue()), 28);
                                                                    c6b9.setOnAdjustTextRollbarListener(new AqS152S0100000_2(this, 701));
                                                                    this.LLIIZ = c6b9;
                                                                } else {
                                                                    o.LJIJI("mRootView");
                                                                    throw null;
                                                                }
                                                            }
                                                            ViewGroup viewGroup14 = this.LJLILLLLZI;
                                                            if (viewGroup14 != null) {
                                                                addView(viewGroup14);
                                                                ViewGroup viewGroup15 = this.LJLILLLLZI;
                                                                if (viewGroup15 != null) {
                                                                    if (viewGroup15.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                                                                        ViewGroup viewGroup16 = this.LJLILLLLZI;
                                                                        if (viewGroup16 != null) {
                                                                            ViewGroup.LayoutParams layoutParams = viewGroup16.getLayoutParams();
                                                                            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                                                            marginLayoutParams.topMargin = getTopMargin();
                                                                            ViewGroup viewGroup17 = this.LJLILLLLZI;
                                                                            if (viewGroup17 != null) {
                                                                                viewGroup17.setLayoutParams(marginLayoutParams);
                                                                            } else {
                                                                                o.LJIJI("mRootView");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("mRootView");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.62z
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                        }
                                                                    }, findViewById(R.id.haj));
                                                                    ViewGroup viewGroup18 = this.LJLILLLLZI;
                                                                    if (viewGroup18 != null) {
                                                                        this.LL = viewGroup18.findViewById(R.id.aj4);
                                                                        ViewGroup viewGroup19 = this.LJLILLLLZI;
                                                                        if (viewGroup19 != null) {
                                                                            this.LJZL = viewGroup19.findViewById(R.id.aj3);
                                                                            ViewGroup viewGroup20 = this.LJLILLLLZI;
                                                                            if (viewGroup20 != null) {
                                                                                View findViewById5 = viewGroup20.findViewById(R.id.jlw);
                                                                                this.LLD = findViewById5;
                                                                                if (findViewById5 != null) {
                                                                                    findViewById5.setVisibility(8);
                                                                                }
                                                                                View view2 = this.LL;
                                                                                if (view2 != null) {
                                                                                    view2.setBackground(C78127UlP.LIZJ(-1, 16777215, (int) C170576mj.LIZ(getContext(), 2.0f), (int) C170576mj.LIZ(getContext(), 4.0f)));
                                                                                }
                                                                                View view3 = this.LJZL;
                                                                                if (view3 != null) {
                                                                                    view3.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
                                                                                }
                                                                                View view4 = this.LLD;
                                                                                if (view4 != null) {
                                                                                    C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 94), view4);
                                                                                }
                                                                                C82740Wdc.LIZJ(this.LLD);
                                                                                TuxIconView tuxIconView4 = this.LJLJJL;
                                                                                if (tuxIconView4 != null) {
                                                                                    tuxIconView4.setOnTouchListener(new IDTListenerS69S0000000_2(3));
                                                                                    C82740Wdc.LIZIZ(this.LJLLL);
                                                                                    TuxIconView tuxIconView5 = this.LJLJJLL;
                                                                                    if (tuxIconView5 != null) {
                                                                                        C82740Wdc.LIZJ(tuxIconView5);
                                                                                        View findViewById6 = findViewById(R.id.b_e);
                                                                                        o.LJIIIIZZ(findViewById6, "findViewById(R.id.check_box_apply_to_all)");
                                                                                        this.LJZI = (C71897SJp) findViewById6;
                                                                                        boolean LIZ3 = new C1540162r().LIZ();
                                                                                        this.LLIILZL = LIZ3;
                                                                                        C71897SJp c71897SJp = this.LJZI;
                                                                                        if (c71897SJp != null) {
                                                                                            c71897SJp.setChecked(LIZ3);
                                                                                            View findViewById7 = findViewById(R.id.g1p);
                                                                                            o.LJIIIIZZ(findViewById7, "findViewById(R.id.ll_apply_to_all)");
                                                                                            LinearLayout linearLayout = (LinearLayout) findViewById7;
                                                                                            this.LJZ = linearLayout;
                                                                                            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS22S0100000_2(this, 98));
                                                                                            C1551667c c1551667c4 = this.LJLJI;
                                                                                            if (c1551667c4 != null) {
                                                                                                c1551667c4.setAutoSizeListener(new C68H() { // from class: X.62q
                                                                                                    @Override // X.C68H
                                                                                                    public final void LIZ() {
                                                                                                        C6B9 c6b92 = C1539662m.this.LLIIZ;
                                                                                                        if (c6b92 != null) {
                                                                                                            c6b92.LJLJJLL.LIZIZ(c6b92.LJLJL);
                                                                                                        }
                                                                                                        C1539662m.this.LLILII = true;
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                            if (C138865cg.LIZ()) {
                                                                                                C1551667c c1551667c5 = this.LJLJI;
                                                                                                this.LLILLIZIL = c1551667c5 != null ? new C157146Es(c1551667c5) : null;
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        o.LJIJI("checkBox");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("mAlignTxtView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("mChangeColorImgView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("mRootView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("mRootView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("mRootView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("mRootView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("mRootView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("mChangeColorImgView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("mRootView");
                                                    throw null;
                                                }
                                                o.LJIJI("mRootView");
                                                throw null;
                                            }
                                            o.LJIJI("mRootView");
                                            throw null;
                                        }
                                        o.LJIJI("mRootView");
                                        throw null;
                                    }
                                    o.LJIJI("mChangeColorImgView");
                                    throw null;
                                }
                                o.LJIJI("mRootView");
                                throw null;
                            }
                            o.LJIJI("mAlignTxtView");
                            throw null;
                        }
                        o.LJIJI("mRootView");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public final void LJ(List<TextStickerTextWrap> textWrapList, List<? extends InlineRichTextStyleData> inlineTextStyles, int i, int i2, int i3, String str, boolean z, int i4, String slotUUid, boolean z2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z3, boolean z4, Integer num, boolean z5, boolean z6, float f) {
        boolean z7;
        C1556068u c1556068u;
        C1556068u c1556068u2;
        int LIZJ;
        o.LJIIIZ(textWrapList, "textWrapList");
        o.LJIIIZ(inlineTextStyles, "inlineTextStyles");
        o.LJIIIZ(slotUUid, "slotUUid");
        this.LLIFFJFJJ = str6;
        this.LLI = str5;
        this.LLFZ = str4;
        this.LLFII = str3;
        this.LLII = str7;
        this.LLIIII = str8;
        this.LLIIIJ = str10;
        this.LLIIIILZ = str9;
        this.LLIIIL = str11;
        this.LLIIIZ = str12;
        this.LLIIJI = System.currentTimeMillis();
        this.LLIIJLIL = slotUUid;
        this.LLIIL = z2;
        this.LLIILII = str2;
        this.LLILII = z4;
        this.LLILZ = false;
        C1551667c c1551667c = this.LJLJI;
        if (c1551667c != null) {
            if (C138855cf.LIZ() && z3) {
                z7 = true;
            } else {
                z7 = false;
            }
            c1551667c.setUseAutoTextSize(z7);
        }
        this.LJLJLJ = -1;
        C1554968j c1554968j = this.LJLZ;
        if (c1554968j != null) {
            c1554968j.LIZIZ(C68M.LJIIJ().LJIIIZ());
        }
        C1DH.LJJIJIL(this.LJLJI);
        C1551667c c1551667c2 = this.LJLJI;
        if (c1551667c2 != null) {
            c1551667c2.LJI(f, i4);
        }
        C1556068u c1556068u3 = this.LJLJJI;
        o.LJI(c1556068u3);
        c1556068u3.LIZIZ();
        if (z) {
            c1556068u3.setSelectColorView(i2);
        }
        String LJFF = C68W.LJFF(textWrapList);
        List<InteractTextStructWrap> LLJILJILJ = ORZ.LLJILJILJ(C68W.LJI(textWrapList));
        this.LLFFF = LLJILJILJ;
        C1551667c c1551667c3 = this.LJLJI;
        if (c1551667c3 != null) {
            c1551667c3.setTextStructWrapList(LLJILJILJ);
        }
        if (z) {
            C68M.LJIIJ().LJIL(getScene());
            C1554968j c1554968j2 = this.LJLZ;
            o.LJI(c1554968j2);
            c1554968j2.LIZJ();
            this.LJLJL = 1;
            this.LJLJLJ = -1;
            this.LJLL = C1539962p.LIZIZ().LIZ().LIZIZ;
            this.LJLJLLL = 2;
            C1551667c c1551667c4 = this.LJLJI;
            o.LJI(c1551667c4);
            c1551667c4.LJIIIIZZ(this.LJLJL, this.LJLL);
            C1551667c c1551667c5 = this.LJLJI;
            o.LJI(c1551667c5);
            c1551667c5.LJIIIZ(0, "");
            if (getScene() == 0 && (LIZJ = C68M.LJIIJ().LIZJ()) > 0) {
                C1551667c c1551667c6 = this.LJLJI;
                o.LJI(c1551667c6);
                c1551667c6.setFontSize(LIZJ);
            }
            this.LLILLJJLI = false;
            this.LLILLL = false;
            if (C138525c8.LIZ() && (c1556068u2 = this.LJLJJI) != null) {
                c1556068u2.setColorPickerColor(null);
            }
        } else {
            C1551667c c1551667c7 = this.LJLJI;
            if (c1551667c7 != null) {
                c1551667c7.LJIIIZ(LJFF.length(), LJFF);
            }
            if (!inlineTextStyles.isEmpty()) {
                List LLJILJILJ2 = ORZ.LLJILJILJ(inlineTextStyles);
                if (num != null) {
                    ORS.LJJLIL(C152565ym.LJLIL, LLJILJILJ2);
                }
                C157146Es c157146Es = this.LLILLIZIL;
                if (c157146Es != null) {
                    c157146Es.LIZIZ(inlineTextStyles);
                    C1554968j c1554968j3 = this.LJLZ;
                    if (c1554968j3 != null) {
                        c1554968j3.setSelectedFontType("");
                    }
                }
            }
            this.LLILLJJLI = z5;
            this.LLILLL = z6;
            if (num != null) {
                i2 = num.intValue();
                this.LLILLJJLI = true;
                C1556068u c1556068u4 = this.LJLJJI;
                if (c1556068u4 != null) {
                    c1556068u4.setColorPickerColor(Integer.valueOf(i2));
                }
            } else {
                if (C138525c8.LIZ() && (c1556068u = this.LJLJJI) != null) {
                    c1556068u.setColorPickerColor(null);
                }
                C1556068u c1556068u5 = this.LJLJJI;
                if (c1556068u5 != null) {
                    c1556068u5.setSelectColorView(i2);
                }
            }
            this.LJLJL = i;
            this.LJLJLLL = i3;
            this.LJLL = i2;
            C68M.LJIIJ().LJIJJLI(getScene(), str);
        }
        LIZLLL();
        C1551667c c1551667c8 = this.LJLJI;
        if (c1551667c8 != null) {
            c1551667c8.setFontType(C68M.LJIIJ().LJ(getScene()));
        }
        C1551667c c1551667c9 = this.LJLJI;
        if (c1551667c9 != null) {
            c1551667c9.LJIIIIZZ(i, i2);
        }
        C1551667c c1551667c10 = this.LJLJI;
        if (c1551667c10 != null) {
            c1551667c10.setAligin(this.LJLJLLL);
        }
        C1554968j c1554968j4 = this.LJLZ;
        if (c1554968j4 != null) {
            c1554968j4.LIZJ();
        }
        LJFF();
        LJI(C68M.LJIIJ().LJFF(getScene()));
        if (!this.LLF) {
            View view = this.LJZL;
            o.LJI(view);
            view.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
        }
        if (this.LJLLI || z) {
            post(new ARunnableS38S0100000_2(this, 134));
        }
        C139355dT c139355dT = new C139355dT();
        if (!this.LLILZIL) {
            c139355dT.LIZ.getInt("edit_text_tux_bubble_1", 0);
        }
        if (this.LLIIL) {
            LinearLayout linearLayout = this.LJZ;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                boolean LIZ = new C1540162r().LIZ();
                this.LLIILZL = LIZ;
                C71897SJp c71897SJp = this.LJZI;
                if (c71897SJp != null) {
                    c71897SJp.setChecked(LIZ);
                } else {
                    o.LJIJI("checkBox");
                    throw null;
                }
            } else {
                o.LJIJI("applyToAllLayout");
                throw null;
            }
        } else {
            LinearLayout linearLayout2 = this.LJZ;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            } else {
                o.LJIJI("applyToAllLayout");
                throw null;
            }
        }
        this.LLILIL = true;
    }
}
