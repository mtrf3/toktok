package X;

import Y.ACListenerS21S0101000_2;
import Y.ACListenerS22S0100000_2;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS50S0000000_2;
import Y.ALAdapterS1S0100000_2;
import Y.AObjectS132S0100000_2;
import Y.ARunnableS14S0201000_11;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDCListenerS10S0101000;
import Y.IDObjectS175S0100000_2;
import Y.IDTListenerS69S0000000_2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.ss.android.ugc.bytebench.EditorStickerDowngradeServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.64u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1545664u extends FrameLayout {
    public static final float LLJJIJI = C17N.LJIILL(6.0d);
    public final Context LJLIL;
    public View LJLILLLLZI;
    public C1551767d LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public C71799SFv LJLJJLL;
    public TuxTextView LJLJL;
    public View LJLJLJ;
    public C1556068u LJLJLLL;
    public TuxIconView LJLL;
    public TuxIconView LJLLI;
    public ImageView LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public final InputMethodManager LJZ;
    public AnonymousClass645 LJZI;
    public View LJZL;
    public View LL;
    public View LLD;
    public C1554968j LLF;
    public LinearLayout LLFF;
    public C67P LLFFF;
    public View LLFII;
    public View LLFZ;
    public View LLI;
    public C71897SJp LLIFFJFJJ;
    public TuxTextView LLII;
    public LinearLayout LLIIII;
    public String LLIIIILZ;
    public final boolean LLIIIJ;
    public InterfaceC139695e1 LLIIIL;
    public InterfaceC156706Da LLIIIZ;
    public C157146Es LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public final ALAdapterS1S0100000_2 LLILII;
    public InterfaceC156716Db LLILIL;
    public List<InteractTextStructWrap> LLILL;
    public int LLILLIZIL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public LinearLayout LLIZ;
    public C6B9 LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public AnonymousClass654 LLJIJIL;
    public AnonymousClass656 LLJILJIL;
    public boolean LLJILJILJ;
    public InterfaceC82683Wch LLJILLL;
    public int LLJJ;
    public long LLJJI;
    public InterfaceC1546465c LLJJIII;

    public void LIZ() {
    }

    public void LIZJ(TextFontStyleData textFontStyleData) {
    }

    public int LJI() {
        return 2;
    }

    public void LJIILL(View view) {
    }

    public final void LJIJ() {
        LJIJI(true);
        View view = this.LJLJLJ;
        if (view != null) {
            if (view.getLayoutParams() != null) {
                this.LJLJLJ.getLayoutParams().width = C17N.LJIILL(10.0d);
                View view2 = this.LJLJLJ;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            this.LJLJLJ.setVisibility(4);
        }
        LJJ(false);
        setTtsBubbleText(null);
    }

    public Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        this.LLD.getLocationOnScreen(iArr);
        Point point = new Point(this.LLD.getWidth() / 2, this.LLD.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public int getLayoutRes() {
        return R.layout.aub;
    }

    public int getSafeAreaHeight() {
        return 0;
    }

    public int getScene() {
        return 0;
    }

    public void setBgColorChangeListener(AnonymousClass630 anonymousClass630) {
    }

    public void setEffectText(List<TextStickerTextWrap> list) {
    }

    public void setSafeAreaHeight(int i) {
    }

    private int getEditTextLength() {
        if (this.LJLJI.getText() != null) {
            return this.LJLJI.getText().length();
        }
        return 0;
    }

    public void LJ() {
        this.LLF.LIZJ();
        this.LJLLJ = 1;
        this.LJLLL = -1;
        this.LJLLLLLL = C1539962p.LIZIZ().LIZ().LIZIZ;
        this.LJLLLL = LJI();
        this.LJLJI.LJIILJJIL(this.LJLLJ, this.LJLLLLLL);
        this.LJLJI.LJIILL(0, "");
    }

    public final void LJFF() {
        boolean z = !this.LLIFFJFJJ.isChecked();
        this.LLILZIL = z;
        this.LLIFFJFJJ.setChecked(z);
        new C1540162r().LIZ.storeBoolean("last_selected_apply_to_all", this.LLILZIL);
    }

    public final void LJII() {
        ImageView imageView = this.LJLLILLLL;
        if (imageView == null) {
            return;
        }
        imageView.setClickable(false);
        this.LJLLILLLL.setAlpha(0.5f);
        this.LJLLILLLL.setImageResource(R.drawable.b9n);
    }

    public final void LJIIIIZZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LLJILLL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        if (this.LJLZ) {
            return;
        }
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ() || this.LLIIZ) {
            setVisibility(8);
        } else {
            C136685Ya.LIZ(this);
        }
        this.LJLZ = true;
        AnonymousClass645 anonymousClass645 = this.LJZI;
        if (anonymousClass645 != null) {
            anonymousClass645.dismiss();
        }
        C6B9 c6b9 = this.LLIZLLLIL;
        if (c6b9 != null && this.LLIILII) {
            c6b9.LIZ();
            this.LLJ = this.LLILZLL;
        }
    }

    public void LJIILIIL() {
        InputMethodManager inputMethodManager;
        C1551767d c1551767d = this.LJLJI;
        if (c1551767d != null && (inputMethodManager = this.LJZ) != null) {
            inputMethodManager.hideSoftInputFromWindow(c1551767d.getWindowToken(), 0);
        }
    }

    public void LJIILJJIL() {
        C1551767d c1551767d = this.LJLJI;
        if (c1551767d != null) {
            c1551767d.setAutoSizeChangedListener(new C68H() { // from class: X.650
                @Override // X.C68H
                public final void LIZ() {
                    C1545664u c1545664u = C1545664u.this;
                    c1545664u.LLJI = true;
                    C6B9 c6b9 = c1545664u.LLIZLLLIL;
                    c6b9.LJLJJLL.LIZIZ(c6b9.LJLJL);
                }
            });
        }
    }

    public void LJIIZILJ() {
        if (this.LLJ) {
            if (!this.LLILZLL) {
                OSZ<Integer, Integer> LIZ = AnonymousClass633.LIZ();
                this.LLIZLLLIL.LIZJ(LIZ.getFirst(), LIZ.getSecond(), 28);
                this.LJLJI.setDefaultTextSize(28);
                return;
            }
            return;
        }
        if (!this.LLILZLL) {
            return;
        }
        OSZ<Integer, Integer> LIZ2 = AnonymousClass633.LIZ();
        this.LLIZLLLIL.LIZJ(LIZ2.getFirst(), LIZ2.getSecond(), 22);
        this.LJLJI.setDefaultTextSize(22);
    }

    public final void LJIJJ() {
        C2068389v c2068389v = new C2068389v();
        if (this.LJLLJ == 3) {
            c2068389v.LIZ = R.raw.icon_color_text_transparent;
        } else {
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            int i = this.LJLLJ;
            if (i == 1) {
                c2068389v.LIZ = R.raw.icon_text_stroke;
            } else if (i == 2) {
                c2068389v.LIZ = R.raw.icon_text_background;
            } else if (i == 4) {
                c2068389v.LIZ = R.raw.icon_text_outline;
            }
        }
        this.LJLL.setTuxIcon(c2068389v);
    }

    public final void LJIL() {
        boolean z;
        C6BK c6bk = new C6BK();
        c6bk.LIZJ(Long.valueOf(System.currentTimeMillis() - this.LLJJI), "click_show_duration");
        JSONObject LJ = c6bk.LJ();
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ()) {
            setVisibility(0);
            GXR.LIZIZ("tool_performance_enter_text_sticker_tab", LJ);
        } else {
            C136685Ya.LIZIZ(this.LLJJI, this.LLILII, this);
        }
        AnonymousClass645 anonymousClass645 = this.LJZI;
        if (anonymousClass645 != null) {
            anonymousClass645.show();
        }
        if (C78886Uxe.LJJIJ(C68M.LJIIJ().LJIIIZ())) {
            C6PB.LJ().LIZIZ(R.string.e8e, getContext());
        }
        if (this.LLIZLLLIL != null) {
            LJIIZILJ();
            if (this.LLIILII) {
                C6B9 c6b9 = this.LLIZLLLIL;
                C1551767d c1551767d = this.LJLJI;
                c6b9.LJLJJLL.LIZIZ(c1551767d);
                c6b9.LJLJL = c1551767d;
                this.LLIZLLLIL.LIZIZ();
            }
            C67P c67p = this.LLFFF;
            if (c67p != null && c67p.getData() != null) {
                z = this.LLFFF.getData().isUseAutoTextSize();
            } else {
                z = true;
            }
            this.LJLJI.setUseAutoTextSize(z);
        }
    }

    public void LJJII() {
        C1551767d c1551767d = this.LJLJI;
        if (c1551767d != null && this.LJZ != null) {
            c1551767d.post(new ARunnableS38S0100000_2(this, 26));
        }
    }

    public void LJJIII() {
        postDelayed(new ARunnableS21S0200000_2(this, new C139355dT(), 6), 0L);
    }

    public final void LJJIIZ() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LJ = Integer.valueOf(R.attr.dj);
        int i = this.LJLLLL;
        if (i == 2) {
            c2068389v.LIZ = R.raw.icon_lines_center_aligned;
        } else if (i == 1) {
            c2068389v.LIZ = R.raw.icon_lines_left_aligned;
        } else if (i == 3) {
            c2068389v.LIZ = R.raw.icon_lines_right_aligned;
        }
        this.LJLLI.setTuxIcon(c2068389v);
    }

    public Point getEditInputCenterPoint() {
        int LIZJ = C170576mj.LIZJ(this.LJLIL) / 2;
        int height = this.LLD.getHeight();
        return new Point(LIZJ, (height / 2) + ((int) C170576mj.LIZ(this.LJLIL, 52.0f)));
    }

    public Point getEditPageSize() {
        return new Point(getWidth(), getHeight());
    }

    public String getEditTextStr() {
        if (this.LJLJI.getText() != null) {
            return this.LJLJI.getText().toString();
        }
        return "";
    }

    public List<InlineRichTextStyleData> getInlineTextStyleDatas() {
        C157146Es c157146Es = this.LLIIJI;
        if (c157146Es != null) {
            return c157146Es.LJ();
        }
        return null;
    }

    public Point getReadIconPosition() {
        ImageView imageView = this.LJLLILLLL;
        if (imageView == null || imageView.getVisibility() != 0) {
            return null;
        }
        this.LJLLILLLL.getLocationOnScreen(r4);
        int[] iArr = {(this.LJLLILLLL.getWidth() / 2) + iArr[0]};
        return new Point(iArr[0], iArr[1]);
    }

    public TextStickerTextWrap getTextWrap() {
        return C68W.LIZ(this.LJLJI, this.LLILL);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    public final boolean LJIIL() {
        return !TextUtils.isEmpty(getEditTextStr());
    }

    public void LJIILLIIL() {
        if (!C138855cf.LIZ()) {
            return;
        }
        C6B9 c6b9 = (C6B9) this.LJLILLLLZI.findViewById(R.id.l56);
        this.LLIZLLLIL = c6b9;
        c6b9.setOnTextSizeChangedListener(new C6BH() { // from class: X.653
            @Override // X.C6BH
            public final void LIZ() {
                C1545664u c1545664u = C1545664u.this;
                c1545664u.LJLJI.LLFZ = false;
                c1545664u.LLJI = true;
            }
        });
        this.LLIZLLLIL.setOnAdjustTextRollbarListener(new AObjectS132S0100000_2(this, 5));
        OSZ<Integer, Integer> LIZ = AnonymousClass633.LIZ();
        this.LLIZLLLIL.LIZJ(LIZ.getFirst(), LIZ.getSecond(), 28);
        this.LJLJI.setMinTextSize(LIZ.getFirst().intValue());
    }

    public void LJJIIJ() {
        if (C138525c8.LIZ()) {
            this.LJLJLLL.LIZLLL();
            this.LJLJLLL.setColorPickerClickListener(new ACListenerS21S0101000_2(0, this, 4));
        }
    }

    public void LJJIIJZLJL() {
        if (C138865cg.LIZ()) {
            this.LLIIJI = new C157146Es(this.LJLJI);
        }
    }

    public int getTopMargin() {
        return C170576mj.LIZLLL(getContext());
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !C158226Iw.LIZ();
    }

    public int getAlignTxt() {
        return this.LJLLLL;
    }

    public int getCurColor() {
        return this.LJLLLLLL;
    }

    public int getCurTxtMode() {
        return this.LJLLJ;
    }

    public EditText getEditText() {
        return this.LJLJI;
    }

    public boolean getHasFontSizeChanged() {
        return this.LLJI;
    }

    public InterfaceC156716Db getVisibleController() {
        return this.LLILIL;
    }

    public void LIZIZ(int i) {
        this.LJLJI.LJIILJJIL(this.LJLLJ, i);
        this.LJLLLLLL = i;
    }

    public int LIZLLL(int i) {
        int LJI = LJI();
        if (i == 2) {
            return 1;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 3) {
            return LJI;
        }
        return 2;
    }

    public final void LJIIIZ(boolean z) {
        float f;
        View view = this.LJLJJI;
        if (view != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            view.setAlpha(f);
        }
        if (this.LJLJJL != null) {
            if (C165166e0.LIZ()) {
                this.LLIL = z;
            } else {
                this.LJLJJL.setClickable(z);
            }
        }
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            view2.setClickable(z);
        }
    }

    public final int LJIIJ(int i) {
        C1551767d c1551767d = this.LJLJI;
        if (c1551767d != null && c1551767d.getEditFontSize() > 0) {
            return this.LJLJI.getEditFontSize();
        }
        return i;
    }

    public String LJIIJJI(List<TextStickerTextWrap> list) {
        return C68W.LJFF(list);
    }

    public final void LJIJI(boolean z) {
        int i;
        C71799SFv c71799SFv = this.LJLJJLL;
        if (c71799SFv != null && c71799SFv.getLayoutParams() != null) {
            this.LJLJJLL.getLayoutParams().height = C17N.LJIILL(16.0d);
            this.LJLJJLL.getLayoutParams().width = C17N.LJIILL(16.0d);
            C71799SFv c71799SFv2 = this.LJLJJLL;
            c71799SFv2.setLayoutParams(c71799SFv2.getLayoutParams());
        }
        C71799SFv c71799SFv3 = this.LJLJJLL;
        if (c71799SFv3 != null) {
            if (z) {
                i = R.drawable.dcr;
            } else {
                i = R.drawable.dcq;
            }
            c71799SFv3.LJIIIIZZ(Integer.valueOf(i));
        }
    }

    public final void LJJ(boolean z) {
        V8L v8l;
        C71799SFv c71799SFv = this.LJLJJLL;
        if (c71799SFv == null) {
            return;
        }
        if (z) {
            if (c71799SFv.getHierarchy() == null || (v8l = this.LJLJJLL.getHierarchy().LIZJ) == null) {
                v8l = new V8L();
            }
            v8l.LIZLLL(C17N.LJIILL(1.0d));
            v8l.LJFF = -1;
            if (this.LJLJJLL.getHierarchy() != null) {
                this.LJLJJLL.getHierarchy().LJIL(v8l);
                return;
            }
            return;
        }
        if (c71799SFv.getHierarchy() == null) {
            return;
        }
        this.LJLJJLL.getHierarchy().LJIL(null);
    }

    public final void LJJIIZI(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        if (!textFontStyleData.LIZ()) {
            if (this.LJLLL == -1 || this.LJLLJ != 1) {
                this.LJLLL = this.LJLLJ;
                this.LJLLJ = 1;
            }
            this.LJLL.setAlpha(0.34f);
            this.LJLL.setClickable(false);
            this.LJLL.setTag(Boolean.FALSE);
            return;
        }
        int i = this.LJLLL;
        if (i != -1) {
            this.LJLLJ = i;
        }
        this.LJLL.setAlpha(1.0f);
        this.LJLL.setClickable(true);
        this.LJLL.setTag(Boolean.TRUE);
    }

    public void setColorPickerClickListener(AnonymousClass656 anonymousClass656) {
        this.LLJILJIL = anonymousClass656;
    }

    public void setCurrentClickTime(long j) {
        this.LLJJI = j;
    }

    public void setData(TextStickerData textStickerData) {
        int bgMode = textStickerData.getBgMode();
        int color = textStickerData.getColor();
        int align = textStickerData.getAlign();
        this.LJLLJ = bgMode;
        this.LJLLLLLL = color;
        this.LJLLLL = align;
        if (TextUtils.isEmpty(textStickerData.getFontType())) {
            C68M.LJIIJ().LJIJJLI(getScene(), textStickerData.getFontType());
        }
    }

    public void setInputLayoutShowListener(AnonymousClass645 anonymousClass645) {
        this.LJZI = anonymousClass645;
    }

    public void setOnReadTextClickListener(AnonymousClass654 anonymousClass654) {
        this.LLJIJIL = anonymousClass654;
    }

    public void setReadTextIcon(boolean z) {
        ImageView imageView = this.LJLLILLLL;
        if (imageView == null) {
            return;
        }
        imageView.setClickable(true);
        this.LJLLILLLL.setAlpha(1.0f);
        this.LLILZ = z;
        if (z) {
            this.LJLLILLLL.setImageResource(R.drawable.b9m);
        } else {
            this.LJLLILLLL.setImageResource(R.drawable.b9n);
        }
    }

    public void setTextStickerInputMobListener(InterfaceC139695e1 interfaceC139695e1) {
        this.LLIIIL = interfaceC139695e1;
    }

    public void setTextStickerUpdateListener(InterfaceC1546465c interfaceC1546465c) {
        this.LLJJIII = interfaceC1546465c;
    }

    public void setTextStickerView(C67P c67p) {
        this.LLFFF = c67p;
    }

    public void setTtsBubbleIcon(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLJJLL) {
            LJIJI(false);
            LJJ(false);
        } else {
            C71799SFv c71799SFv = this.LJLJJLL;
            if (c71799SFv != null && c71799SFv.getLayoutParams() != null) {
                this.LJLJJLL.getLayoutParams().height = C17N.LJIILL(20.0d);
                this.LJLJJLL.getLayoutParams().width = C17N.LJIILL(20.0d);
                C71799SFv c71799SFv2 = this.LJLJJLL;
                c71799SFv2.setLayoutParams(c71799SFv2.getLayoutParams());
            }
            C71799SFv c71799SFv3 = this.LJLJJLL;
            if (c71799SFv3 != null) {
                c71799SFv3.LJIIIIZZ(str);
            }
            LJJ(true);
        }
        View view = this.LJLJLJ;
        if (view != null && view.getLayoutParams() != null) {
            this.LJLJLJ.getLayoutParams().width = C17N.LJIILL(26.0d);
            View view2 = this.LJLJLJ;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.LJLJLJ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
    }

    public void setTtsBubbleText(String str) {
        if (this.LJLJL == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.LJLJL.setText(R.string.e46);
        } else {
            this.LJLJL.setText(str);
        }
    }

    public void setVisibleController(InterfaceC156716Db interfaceC156716Db) {
        this.LLILIL = interfaceC156716Db;
    }

    public void setWikiTextStickerMob(InterfaceC156706Da interfaceC156706Da) {
        this.LLIIIZ = interfaceC156706Da;
    }

    public C1545664u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLLJ = 1;
        this.LJLLL = -1;
        this.LJLLLL = LJI();
        this.LJLLLLLL = -1;
        this.LJLZ = true;
        this.LLIIIJ = true;
        this.LLIIJLIL = false;
        this.LLIIL = false;
        this.LLIILII = true;
        this.LLIILZL = false;
        this.LLIIZ = false;
        this.LLIL = false;
        this.LLILII = new ALAdapterS1S0100000_2(this, 5);
        this.LLILL = new ArrayList();
        this.LLILLIZIL = 0;
        this.LLILLJJLI = true;
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = new C1540162r().LIZ();
        this.LLILZLL = false;
        this.LLJ = false;
        this.LLJI = false;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = false;
        this.LLJILLL = null;
        this.LLJJ = 1;
        this.LLJJI = -1L;
        this.LJLIL = context;
        this.LJZ = (InputMethodManager) C16880lQ.LLILL(context, "input_method");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.agn});
            this.LLJJ = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
        }
        View LLLZIIL = C16880lQ.LLLZIIL(getLayoutRes(), C16880lQ.LLZIL(context), null);
        this.LJLILLLLZI = LLLZIIL;
        this.LL = LLLZIIL.findViewById(R.id.bt6);
        this.LLD = this.LJLILLLLZI.findViewById(R.id.eor);
        this.LJLJI = (C1551767d) this.LJLILLLLZI.findViewById(R.id.czq);
        this.LJLL = (TuxIconView) this.LJLILLLLZI.findViewById(R.id.js6);
        ViewGroup viewGroup = (ViewGroup) this.LJLILLLLZI.findViewById(R.id.dln);
        C1554968j LIZ = C1554968j.LIZ(getScene(), context);
        this.LLF = LIZ;
        LIZ.LIZIZ(C68M.LJIIJ().LJIIIZ());
        C68M.LJIIJ().LJ = new InterfaceC1549866k() { // from class: X.652
            @Override // X.InterfaceC1549866k
            public final void accept(Object obj) {
                C1545664u c1545664u = C1545664u.this;
                C1554968j c1554968j = c1545664u.LLF;
                if (c1554968j != null) {
                    c1554968j.post(new ARunnableS14S0201000_11(1, c1545664u, obj, 11));
                }
            }
        };
        viewGroup.addView(this.LLF);
        this.LJLLI = (TuxIconView) this.LJLILLLLZI.findViewById(R.id.a0k);
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLJJI) {
            ImageView imageView = (ImageView) this.LJLILLLLZI.findViewById(R.id.lt0);
            this.LJLLILLLL = imageView;
            C16880lQ.LJIILLIIL(imageView, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 5));
            this.LJLLILLLL.setVisibility(0);
        }
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLJI && (AnonymousClass699.LIZIZ().LIZIZ.LJLJJL || AnonymousClass699.LIZIZ().LIZIZ.LJLJJLL)) {
            View findViewById = this.LJLILLLLZI.findViewById(R.id.czz);
            this.LJLJJI = findViewById;
            if (findViewById != null) {
                this.LJLJI.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() { // from class: X.64z
                    @Override // android.view.ViewTreeObserver.OnDrawListener
                    public final void onDraw() {
                        C1551767d c1551767d;
                        C1545664u c1545664u = C1545664u.this;
                        if (c1545664u.LJLJJI != null && (c1551767d = c1545664u.LJLJI) != null && c1545664u.LJLILLLLZI != null) {
                            c1551767d.post(new RunnableC47136Iei(2, c1545664u));
                        }
                    }
                });
                this.LJLJJI.setVisibility(0);
                this.LJLJJL = this.LJLJJI.findViewById(R.id.bb_);
                if (!C165166e0.LIZ()) {
                    this.LJLJJL.setClickable(false);
                }
                this.LJLJJLL = (C71799SFv) this.LJLJJI.findViewById(R.id.bbb);
                this.LJLJL = (TuxTextView) this.LJLJJI.findViewById(R.id.mpk);
                View findViewById2 = this.LJLJJI.findViewById(R.id.lt3);
                this.LJLJLJ = findViewById2;
                findViewById2.setClickable(false);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
                c110614Vt.LIZJ = Float.valueOf(C170576mj.LIZ(context, 20.0f));
                this.LJLJJI.setBackground(c110614Vt.LIZ(context));
                LJIJ();
                C16880lQ.LJIIJ(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 6), this.LJLJJL);
                C16880lQ.LJIIJ(new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 7), this.LJLJLJ);
            }
        }
        this.LJLJI.addTextChangedListener(new IDObjectS175S0100000_2(this, 12));
        LJIILJJIL();
        C16880lQ.LJJJ(this.LJLLI, new IDCListenerS10S0101000(1, this, 3));
        C1556068u c1556068u = (C1556068u) this.LJLILLLLZI.findViewById(R.id.bi_);
        this.LJLJLLL = c1556068u;
        c1556068u.setColorChangeListener(new InterfaceC1556368x() { // from class: X.64y
            /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
            
                if (r7 == false) goto L6;
             */
            @Override // X.InterfaceC1556368x
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r9) {
                /*
                    r8 = this;
                    X.64u r1 = X.C1545664u.this
                    X.6Es r0 = r1.LLIIJI
                    r4 = 0
                    r3 = r9
                    if (r0 == 0) goto L25
                    boolean r7 = r0.LIZJ(r3)
                    if (r7 != 0) goto L13
                Le:
                    r1.LIZIZ(r3)
                    r1.LLIIJLIL = r4
                L13:
                    X.5e1 r2 = r1.LLIIIL
                    if (r2 == 0) goto L21
                    boolean r0 = r1.LLILZLL
                    if (r0 == 0) goto L22
                    java.lang.String r5 = "caption"
                L1d:
                    r6 = 0
                    r2.LJ(r3, r4, r5, r6, r7)
                L21:
                    return
                L22:
                    java.lang.String r5 = "text"
                    goto L1d
                L25:
                    r7 = 0
                    goto Le
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1546064y.LIZ(int):void");
            }
        });
        LJJIIJ();
        this.LLF.setClickFontStyleListener(new InterfaceC1555668q() { // from class: X.64x
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
            
                if (r9 == false) goto L12;
             */
            @Override // X.InterfaceC1555668q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData r11) {
                /*
                    r10 = this;
                    X.64u r2 = X.C1545664u.this
                    r5 = r11
                    if (r5 != 0) goto L9
                    r2.getClass()
                L8:
                    return
                L9:
                    r2.LJJIIZI(r5)
                    X.6Es r4 = r2.LLIIJI
                    if (r4 == 0) goto La3
                    java.lang.String r3 = r5.fileName
                    X.68M r1 = X.C68M.LJIIJ()
                    java.lang.String r0 = r5.fileName
                    android.graphics.Typeface r0 = r1.LJIIL(r0)
                    boolean r9 = r4.LIZLLL(r0, r3)
                    if (r9 == 0) goto L32
                    X.67d r3 = r2.LJLJI
                    int r1 = r2.LJLLJ
                    int r0 = r2.LJLLLLLL
                    r3.LJIILJJIL(r1, r0)
                    X.68j r1 = r2.LLF
                    java.lang.String r0 = r5.fileName
                    r1.setSelectedFontType(r0)
                L32:
                    if (r9 != 0) goto L7d
                L34:
                    X.68M r3 = X.C68M.LJIIJ()
                    java.lang.String r1 = r5.fileName
                    int r0 = r2.getScene()
                    r3.LJIJJLI(r0, r1)
                    X.67d r3 = r2.LJLJI
                    X.68M r1 = X.C68M.LJIIJ()
                    int r0 = r2.getScene()
                    android.graphics.Typeface r0 = r1.LJ(r0)
                    r3.setFontType(r0)
                    X.6Es r0 = r2.LLIIJI
                    if (r0 == 0) goto L61
                    X.68j r1 = r2.LLF
                    X.68M r0 = X.C68M.LJIIJ()
                    java.lang.String r0 = r0.LIZJ
                    r1.setSelectedFontType(r0)
                L61:
                    X.67d r3 = r2.LJLJI
                    int r1 = r2.LJLLJ
                    int r0 = r2.LJLLLLLL
                    r3.LJIILJJIL(r1, r0)
                    int r0 = r2.getScene()
                    if (r0 != 0) goto L7d
                    boolean r0 = r2.LLJI
                    if (r0 != 0) goto L7d
                    int r1 = r5.fontSize
                    if (r1 <= 0) goto L94
                    X.67d r0 = r2.LJLJI
                    r0.setFontSize(r1)
                L7d:
                    X.5e1 r4 = r2.LLIIIL
                    if (r4 == 0) goto L8c
                    r6 = 0
                    boolean r0 = r2.LLILZLL
                    if (r0 == 0) goto L91
                    java.lang.String r7 = "caption"
                L88:
                    r8 = 0
                    r4.LIZJ(r5, r6, r7, r8, r9)
                L8c:
                    r2.LIZJ(r5)
                    goto L8
                L91:
                    java.lang.String r7 = "text"
                    goto L88
                L94:
                    X.67d r1 = r2.LJLJI
                    boolean r0 = r2.LLILZLL
                    if (r0 == 0) goto La0
                    r0 = 22
                L9c:
                    r1.setFontSize(r0)
                    goto L7d
                La0:
                    r0 = 28
                    goto L9c
                La3:
                    r9 = 0
                    goto L34
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1545964x.LIZ(com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData):void");
            }
        });
        C16880lQ.LJJJ(this.LJLL, new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 47));
        this.LLFF = (LinearLayout) this.LJLILLLLZI.findViewById(R.id.g6j);
        View findViewById3 = this.LJLILLLLZI.findViewById(R.id.kug);
        View findViewById4 = this.LJLILLLLZI.findViewById(R.id.mm5);
        if (this.LLJJ == 0) {
            this.LJZL = findViewById3;
            findViewById4.setVisibility(8);
        } else {
            this.LJZL = findViewById4;
            findViewById3.setVisibility(8);
        }
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(1, this, 9), this.LJZL);
        C16880lQ.LJIIJ(new IDCListenerS10S0101000(3, this, 4), this.LJLILLLLZI);
        this.LJLL.setImageResource(R.drawable.b4s);
        LJIILLIIL();
        LJIILL(this.LJLILLLLZI);
        addView(this.LJLILLLLZI);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLILLLLZI.getLayoutParams();
        layoutParams.topMargin = getTopMargin();
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        C16880lQ.LJIIJ(new ACListenerS50S0000000_2(1), findViewById(R.id.haj));
        this.LLFZ = this.LJLILLLLZI.findViewById(R.id.aj4);
        this.LLFII = this.LJLILLLLZI.findViewById(R.id.aj3);
        View findViewById5 = this.LJLILLLLZI.findViewById(R.id.jlw);
        this.LLI = findViewById5;
        findViewById5.setVisibility(8);
        this.LLFZ.setBackground(C78127UlP.LIZJ(-1, 16777215, (int) C170576mj.LIZ(getContext(), 2.0f), (int) C170576mj.LIZ(getContext(), 4.0f)));
        this.LLFII.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
        C16880lQ.LJIIJ(new IDCListenerS10S0101000(3, this, 6), this.LLI);
        C82740Wdc.LIZJ(this.LLI);
        this.LJLL.setOnTouchListener(new IDTListenerS69S0000000_2(3));
        C82740Wdc.LIZIZ(this.LJZL);
        C82740Wdc.LIZJ(this.LJLLI);
        this.LLIIII = (LinearLayout) findViewById(R.id.g6k);
        LIZ();
        this.LLIZ = (LinearLayout) findViewById(R.id.g1p);
        this.LLIFFJFJJ = (C71897SJp) findViewById(R.id.b_e);
        this.LLII = (TuxTextView) findViewById(R.id.lzs);
        C16880lQ.LJIIZILJ(this.LLIZ, new ACListenerS22S0100000_2(this, 122));
        C16880lQ.LJJJI(this.LLIFFJFJJ, new ACListenerS22S0100000_2(this, 123));
        C16880lQ.LJJJJI(this.LLII, new ACListenerS22S0100000_2(this, 121));
        LJJIIJZLJL();
        this.LLILLJJLI = new C139355dT().LIZ.getInt("edit_text_tux_bubble_1", 0) == 0;
    }

    public final void LJJI(int i, String str, Integer num) {
        LJJIFFI(C68W.LIZLLL(""), null, 0, -1, 0, "", true, 28, i, str, num, false, false);
    }

    public void LJIJJLI(List<TextStickerTextWrap> list, List<InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, Integer num, boolean z2, boolean z3) {
        int LIZJ;
        this.LJLLL = -1;
        C1554968j c1554968j = this.LLF;
        if (c1554968j != null) {
            c1554968j.LIZIZ(C68M.LJIIJ().LJIIIZ());
        }
        C1DH.LJJIJIL(this.LJLJI);
        this.LJLJI.setTextSize(i4);
        this.LJLJI.setEditFontSize(i4);
        C1556068u c1556068u = this.LJLJLLL;
        c1556068u.LIZIZ();
        if (z) {
            c1556068u.setSelectColorView(i2);
        }
        String LJIIJJI = LJIIJJI(list);
        List<InteractTextStructWrap> LJI = C68W.LJI(list);
        this.LLILL = LJI;
        this.LLILLIZIL = i5 - LJI.size();
        this.LJLJI.setTextStructWrapList(this.LLILL);
        boolean z4 = false;
        if (z) {
            this.LLF.setSelectedFontType(null);
            C68M.LJIIJ().LJIL(getScene());
            LJ();
            if (getScene() == 0 && (LIZJ = C68M.LJIIJ().LIZJ()) > 0) {
                this.LJLJI.setFontSize(LIZJ);
            }
            this.LLIIJLIL = false;
            this.LLIIL = false;
        } else {
            this.LJLJI.LJIILL(LJIIJJI.length(), LJIIJJI);
            C157146Es c157146Es = this.LLIIJI;
            if (c157146Es != null) {
                c157146Es.LIZIZ(list2);
            }
            this.LJLJLLL.setSelectColorView(i2);
            this.LJLLJ = i;
            this.LJLLLL = i3;
            this.LJLLLLLL = i2;
            C68M.LJIIJ().LJIJJLI(getScene(), str);
            this.LLIIJLIL = z2;
            this.LLIIL = z3;
        }
        LJIJJ();
        this.LJLJI.setFontType(C68M.LJIIJ().LJ(getScene()));
        this.LJLJI.LJIILJJIL(i, i2);
        this.LJLJI.setAligin(this.LJLLLL);
        this.LLF.LIZJ();
        LJJIIZ();
        LJJIIZI(C68M.LJIIJ().LJFF(getScene()));
        if (!this.LLIIIJ) {
            this.LLFII.setBackground(C78127UlP.LIZIZ(C1539962p.LIZIZ().LIZ().LIZ));
        }
        if (num != null) {
            LIZIZ(num.intValue());
            this.LJLJLLL.setColorPickerColor(num);
            this.LLIIJLIL = true;
        } else if (C138525c8.LIZ()) {
            this.LJLJLLL.setColorPickerColor(null);
        }
        if (C138855cf.LIZ()) {
            if (num == null) {
                z4 = true;
            }
            this.LLIILII = z4;
        }
    }

    public void LJJIFFI(List<TextStickerTextWrap> list, List<InlineRichTextStyleData> list2, int i, int i2, int i3, String str, boolean z, int i4, int i5, String str2, Integer num, boolean z2, boolean z3) {
        boolean z4;
        this.LLIIZ = false;
        this.LLIIIILZ = str2;
        if (this.LLILLL) {
            setEffectText(list);
        } else {
            LJIJJLI(list, list2, i, i2, i3, str, z, i4, i5, num, z2, z3);
        }
        if (this.LJLZ || z) {
            this.LLIILZL = true;
            this.LJLZ = false;
            LJJII();
        }
        C67P c67p = this.LLFFF;
        if (c67p != null && c67p.getData() != null) {
            setReadTextIcon(this.LLFFF.getData().getHasReadTextAudio());
        }
        if (this.LLJILJILJ) {
            ImageView imageView = this.LJLLILLLL;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View view = this.LJLJJI;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.LJLLILLLL;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            View view2 = this.LJLJJI;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        C67P c67p2 = this.LLFFF;
        if (c67p2 != null && c67p2.getData().getType().equals("type_inline_caption")) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LLILZLL = z4;
        if (z4) {
            ImageView imageView3 = this.LJLLILLLL;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            View view3 = this.LJLJJI;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            this.LLIFFJFJJ.setVisibility(0);
            this.LLII.setVisibility(0);
            boolean LIZ = new C1540162r().LIZ();
            this.LLILZIL = LIZ;
            this.LLIFFJFJJ.setChecked(LIZ);
        } else {
            this.LLIFFJFJJ.setVisibility(8);
            this.LLII.setVisibility(8);
        }
        this.LLIILII = true;
    }
}
