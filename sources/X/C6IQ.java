package X;

import Y.ACListenerS24S0101000_5;
import Y.ACListenerS32S0101000_15;
import Y.ACListenerS50S0000000_2;
import Y.ALAdapterS0S0200100_2;
import Y.ALAdapterS1S0100000_2;
import Y.ALAdapterS1S0200000_2;
import Y.IDComparatorS30S0000000_2;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextPair;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextUnderlineIndexRange;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.bytebench.EditorStickerDowngradeServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6IQ, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6IQ extends FrameLayout {
    public static final /* synthetic */ int LLFF = 0;
    public final Context LJLIL;
    public View LJLILLLLZI;
    public C156816Dl LJLJI;
    public C158026Ic LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public final InputMethodManager LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public C6IL LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public View LJLZ;
    public final boolean LJZ;
    public boolean LJZI;
    public final ALAdapterS1S0100000_2 LJZL;
    public List<InteractTextStructWrap> LL;
    public long LLD;
    public InterfaceC29345BfR LLF;

    public Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        this.LJLLJ.getLocationOnScreen(iArr);
        Point point = new Point(this.LJLLJ.getWidth() / 2, this.LJLLJ.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public int getLayoutRes() {
        return R.layout.br9;
    }

    public int getScene() {
        return 0;
    }

    public C6IZ getVisibleController() {
        return null;
    }

    public void setBgColorChangeListener(InterfaceC158006Ia interfaceC158006Ia) {
    }

    public void setEffectText(List<TextStickerTextWrap> list) {
    }

    public void setInputLayoutShowListener(InterfaceC158016Ib interfaceC158016Ib) {
    }

    public void setTextStickerView(YKR ykr) {
    }

    public void setVisibleController(C6IZ c6iz) {
    }

    private int getEditTextLength() {
        if (this.LJLJI.getText() != null) {
            return this.LJLJI.getText().length();
        }
        return 0;
    }

    public final void LIZ() {
        if (this.LJLJLLL) {
            return;
        }
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ()) {
            setVisibility(8);
        } else if (getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new ALAdapterS1S0200000_2(this, 12));
            ofFloat.start();
        }
        this.LJLJLLL = true;
    }

    public final void LIZIZ() {
        InputMethodManager inputMethodManager;
        C156816Dl c156816Dl = this.LJLJI;
        if (c156816Dl != null && (inputMethodManager = this.LJLL) != null) {
            inputMethodManager.hideSoftInputFromWindow(c156816Dl.getWindowToken(), 0);
        }
    }

    public final void LIZJ() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZJ(Long.valueOf(System.currentTimeMillis() - this.LLD), "click_show_duration");
        c198517qh.LJ();
        if (EditorStickerDowngradeServiceImpl.LIZIZ().LIZ()) {
            setVisibility(0);
        } else {
            ALAdapterS1S0100000_2 aLAdapterS1S0100000_2 = this.LJZL;
            long j = this.LLD;
            setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new ALAdapterS0S0200100_2(j, aLAdapterS1S0100000_2, this, 0));
            ofFloat.start();
        }
        if (C78886Uxe.LJJIJ(C6IH.LJ().LIZLLL())) {
            C05L.LIZLLL(getContext(), R.string.e8e);
        }
        this.LJLJLLL = false;
    }

    public Point getEditInputCenterPoint() {
        int LIZJ = C170576mj.LIZJ(this.LJLIL) / 2;
        int height = this.LJLLJ.getHeight();
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

    public TextStickerTextWrap getTextWrap() {
        C156816Dl c156816Dl = this.LJLJI;
        List<InteractTextStructWrap> list = this.LL;
        if (c156816Dl == null) {
            return new TextStickerTextWrap(null, null, 0, false, false, 31, null);
        }
        String obj = c156816Dl.getText().toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int lineCount = c156816Dl.getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = c156816Dl.getLayout().getLineEnd(i);
            String substring = obj.substring(i2, lineEnd);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            TextStickerString textStickerString = new TextStickerString(substring);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (InteractTextStructWrap interactTextStructWrap : list) {
                    if (interactTextStructWrap.getRange().getStart() < lineEnd && interactTextStructWrap.getRange().getEnd() > i2) {
                        if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, lineEnd - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        } else if (i2 >= interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, interactTextStructWrap.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd <= interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, lineEnd - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        } else if (i2 < interactTextStructWrap.getRange().getStart() && lineEnd > interactTextStructWrap.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(interactTextStructWrap.getRange().getStart() - i2, interactTextStructWrap.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(interactTextStructWrap.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null)));
                        }
                    }
                }
            }
            if (arrayList.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS30S0000000_2(23));
            }
            linkedHashMap.put(textStickerString, arrayList);
            c156816Dl.getLayout().getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<InteractTextStructWrap> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(InteractTextStructWrap.copy$default(it.next(), null, null, 3, null));
            }
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(obj, arrayList2), c156816Dl.getSelectionStart(), c156816Dl.hasFocus(), false, 16, null);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    public int getAlignTxt() {
        return this.LJLJL;
    }

    public int getCurColor() {
        return this.LJLJLJ;
    }

    public int getCurTxtMode() {
        return this.LJLJJL;
    }

    public EditText getEditText() {
        return this.LJLJI;
    }

    public final void LIZLLL(int i) {
        LJ(C47261Igj.LJII(new TextStickerTextWrap(null, null, 0, false, false, 31, null)), 0, -1, 0, "", true, 64);
    }

    public final void LJFF(TextFontStyleData textFontStyleData) {
        boolean z;
        if (textFontStyleData == null) {
            return;
        }
        if (textFontStyleData.enableBgColor == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.LJLJJLL == -1 || this.LJLJJL != 1) {
                this.LJLJJLL = this.LJLJJL;
                this.LJLJJL = 1;
                return;
            }
            return;
        }
        int i = this.LJLJJLL;
        if (i == -1) {
            return;
        }
        this.LJLJJL = i;
    }

    public void setCurrentClickTime(long j) {
        this.LLD = j;
    }

    public void setData(TextStickerData textStickerData) {
        int bgMode = textStickerData.getBgMode();
        int color = textStickerData.getColor();
        int align = textStickerData.getAlign();
        this.LJLJJL = bgMode;
        this.LJLJLJ = color;
        this.LJLJL = align;
        if (TextUtils.isEmpty(textStickerData.getFontType())) {
            C6IH.LJ().LJII(getScene(), textStickerData.getFontType());
        }
    }

    public void setTextStickerUpdateListener(InterfaceC29345BfR interfaceC29345BfR) {
        this.LLF = interfaceC29345BfR;
    }

    public C6IQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJJL = 1;
        this.LJLJJLL = -1;
        this.LJLJL = 2;
        this.LJLJLJ = -1;
        this.LJLJLLL = true;
        this.LJZ = true;
        this.LJZL = new ALAdapterS1S0100000_2(this, 6);
        this.LL = new ArrayList();
        this.LLD = -1L;
        this.LJLIL = context;
        this.LJLL = (InputMethodManager) C16880lQ.LLILL(context, "input_method");
        View LLLZIIL = C16880lQ.LLLZIIL(getLayoutRes(), C16880lQ.LLZIL(context), null);
        this.LJLILLLLZI = LLLZIIL;
        this.LJLLILLLL = LLLZIIL.findViewById(R.id.bt6);
        this.LJLLJ = this.LJLILLLLZI.findViewById(R.id.eor);
        this.LJLJI = (C156816Dl) this.LJLILLLLZI.findViewById(R.id.czq);
        ViewGroup viewGroup = (ViewGroup) this.LJLILLLLZI.findViewById(R.id.dln);
        C6IL c6il = new C6IL(context, getScene());
        c6il.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.LJLLL = c6il;
        c6il.LIZ(C6IH.LJ().LIZLLL());
        viewGroup.addView(this.LJLLL);
        C158026Ic c158026Ic = (C158026Ic) this.LJLILLLLZI.findViewById(R.id.bi_);
        this.LJLJJI = c158026Ic;
        c158026Ic.setColorChangeListener(new C1YZ(this));
        this.LJLLL.setClickFontStyleListener(new C6IO(this));
        this.LJLILLLLZI.findViewById(R.id.g6j);
        View findViewById = this.LJLILLLLZI.findViewById(R.id.mm5);
        this.LJLLI = findViewById;
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(2, this, 16), findViewById);
        C16880lQ.LJIIJ(new ACListenerS32S0101000_15(4, this, 11), this.LJLILLLLZI);
        addView(this.LJLILLLLZI);
        C16880lQ.LJIIJ(new ACListenerS50S0000000_2(0), findViewById(R.id.haj));
        this.LJLLLLLL = this.LJLILLLLZI.findViewById(R.id.aj4);
        this.LJLLLL = this.LJLILLLLZI.findViewById(R.id.aj3);
        View findViewById2 = this.LJLILLLLZI.findViewById(R.id.jlw);
        this.LJLZ = findViewById2;
        findViewById2.setVisibility(8);
        this.LJLLLLLL.setBackground(C78127UlP.LIZJ(-1, 16777215, (int) C170576mj.LIZ(getContext(), 2.0f), (int) C170576mj.LIZ(getContext(), 4.0f)));
        this.LJLLLL.setBackground(C78127UlP.LIZIZ(C6IR.LIZIZ().LIZ().LIZ));
        C16880lQ.LJIIJ(new ACListenerS24S0101000_5(3, this, 17), this.LJLZ);
        C82740Wdc.LIZJ(this.LJLZ);
        C82740Wdc.LIZIZ(this.LJLLI);
        this.LJLJI.setFilters(new InputFilter[]{new InputFilter.LengthFilter(36)});
    }

    public final void LJ(List list, int i, int i2, int i3, String str, boolean z, int i4) {
        List<InteractTextStructWrap> arrayList;
        InputMethodManager inputMethodManager;
        int i5;
        this.LJLJJLL = -1;
        C6IL c6il = this.LJLLL;
        if (c6il != null) {
            c6il.LIZ(C6IH.LJ().LIZLLL());
        }
        C156816Dl c156816Dl = this.LJLJI;
        if (c156816Dl != null) {
            c156816Dl.setFocusable(true);
            c156816Dl.setFocusableInTouchMode(true);
            c156816Dl.requestFocus();
            c156816Dl.setCursorVisible(true);
        }
        this.LJLJI.setTextSize(i4);
        C158026Ic c158026Ic = this.LJLJJI;
        c158026Ic.LIZ();
        if (z) {
            c158026Ic.setSelectColorView(i2);
        }
        String LJIJJ = V1M.LJIJJ(list);
        if (list == null || list.isEmpty()) {
            arrayList = new ArrayList<>();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((TextStickerTextWrap) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() == 1) {
                    arrayList = ((TextStickerTextWrap) ListProtector.get(arrayList2, 0)).safeStrPair().second;
                } else {
                    int size = arrayList2.size();
                    for (int i6 = 1; i6 < size; i6++) {
                        for (InteractTextStructWrap interactTextStructWrap : ((TextStickerTextWrap) ListProtector.get(arrayList2, i6)).safeStrPair().second) {
                            interactTextStructWrap.getRange().getStart();
                            interactTextStructWrap.getRange().getEnd();
                        }
                    }
                    arrayList = new ArrayList<>();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ORS.LJJLIIIJILLIZJL(((TextStickerTextWrap) it.next()).safeStrPair().second, arrayList);
                    }
                }
            } else {
                arrayList = new ArrayList<>();
            }
        }
        this.LL = arrayList;
        this.LJLJI.setTextStructWrapList(arrayList);
        if (z) {
            C6IH LJ = C6IH.LJ();
            int scene = getScene();
            List<TextFontStyleData> LIZLLL = LJ.LIZLLL();
            if (!((ArrayList) LIZLLL).isEmpty() && ((TextFontStyleData) ListProtector.get(LIZLLL, 0)).LIZIZ == 1) {
                LJ.LJII(scene, ((TextFontStyleData) ListProtector.get(LIZLLL, 0)).fileName);
            }
            this.LJLLL.LIZJ();
            this.LJLJJL = 1;
            this.LJLJJLL = -1;
            int i7 = C6IR.LIZIZ().LIZ().LIZIZ;
            this.LJLJLJ = i7;
            this.LJLJL = 2;
            this.LJLJI.LJI(this.LJLJJL, i7);
            C156816Dl c156816Dl2 = this.LJLJI;
            c156816Dl2.setText("");
            c156816Dl2.setSelection(Math.min(0, c156816Dl2.getText().toString().length()));
            if (getScene() == 0) {
                C6IH LJ2 = C6IH.LJ();
                TextFontStyleData textFontStyleData = LJ2.LIZ.get(LJ2.LIZJ);
                if (textFontStyleData != null && (i5 = textFontStyleData.fontSize) > 0) {
                    this.LJLJI.setFontSize(i5);
                }
            }
        } else {
            C156816Dl c156816Dl3 = this.LJLJI;
            int length = LJIJJ.length();
            c156816Dl3.setText(LJIJJ);
            c156816Dl3.setSelection(Math.min(length, c156816Dl3.getText().toString().length()));
            this.LJLJJI.setSelectColorView(i2);
            this.LJLJJL = i;
            this.LJLJL = i3;
            this.LJLJLJ = i2;
            C6IH.LJ().LJII(getScene(), str);
        }
        this.LJLJI.setFontType(C6IH.LJ().LIZIZ(getScene()));
        this.LJLJI.LJI(i, i2);
        this.LJLJI.setAligin(this.LJLJL);
        this.LJLLL.LIZJ();
        C6IH LJ3 = C6IH.LJ();
        LJFF(LJ3.LIZ.get(LJ3.LIZJ(getScene())));
        if (!this.LJZ) {
            this.LJLLLL.setBackground(C78127UlP.LIZIZ(C6IR.LIZIZ().LIZ().LIZ));
        }
        if (!this.LJLJLLL && !z) {
            return;
        }
        this.LJZI = true;
        this.LJLJLLL = false;
        if (this.LJLJI == null || (inputMethodManager = this.LJLL) == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }
}
