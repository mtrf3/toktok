package X;

import Y.ARunnableS38S0100000_2;
import Y.IDObjectS175S0100000_2;
import Y.IDTListenerS112S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.68k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1555068k extends C1545664u {
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public final int LLJJJ;
    public C1552667m LLJJJIL;
    public final FrameLayout LLJJJJ;
    public final C1555168l LLJJJJJIL;
    public final C1555868s LLJJJJLIIL;
    public InnerEffectTextLayoutConfig LLJJL;

    @Override // X.C1545664u
    public final void LJIILLIIL() {
    }

    @Override // X.C1545664u
    public final void LJJIIJ() {
    }

    @Override // X.C1545664u
    public final void LJJIIJZLJL() {
    }

    @Override // X.C1545664u
    public void setData(TextStickerData textStickerData) {
    }

    @Override // X.C1545664u
    public final void LJ() {
        C1554968j c1554968j = this.LLF;
        if (((ArrayList) c1554968j.LJLJI).size() > 0 && (((View) ListProtector.get(c1554968j.LJLJI, 0)).getTag() instanceof String)) {
            C68M.LJIIJ().LIZJ = (String) ((View) ListProtector.get(c1554968j.LJLJI, 0)).getTag();
        } else {
            C68M.LJIIJ().LJIJJLI(c1554968j.LJLJL, "default");
        }
        c1554968j.LJLJLJ = "";
        c1554968j.LJLJJL.scrollTo(0, 0);
        super.LJ();
    }

    @Override // X.C1545664u
    public final void LJIILIIL() {
        if (this.LLILLL) {
            C19K focusableEditText = this.LLJJJJLIIL.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.LIZ(getContext(), focusableEditText);
            }
        } else {
            KeyboardUtils.LIZ(getContext(), this.LJLJI);
        }
        this.LLJJJJLIIL.setEditable(false);
        C1DH.LJJIJL(this.LJLJI, false);
    }

    @Override // X.C1545664u
    public final void LJJII() {
        if (this.LLILLL) {
            C19K focusableEditText = this.LLJJJJLIIL.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.LIZIZ(getContext(), focusableEditText);
                return;
            }
            return;
        }
        KeyboardUtils.LIZIZ(getContext(), this.LJLJI);
    }

    @Override // X.C1545664u
    public List<TextStickerTextWrap> getTextWrapList() {
        if (this.LLILLL) {
            C1555868s c1555868s = this.LLJJJJLIIL;
            ArrayList arrayList = new ArrayList();
            if (c1555868s == null) {
                return arrayList;
            }
            Iterator<C1555768r> it = c1555868s.getEditTextList().iterator();
            while (it.hasNext()) {
                arrayList.add(C68W.LIZ(it.next().LIZ, null));
            }
            return arrayList;
        }
        return C47261Igj.LJII(C68W.LIZ(this.LJLJI, null));
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.LLJJL;
    }

    public final C1552667m getScaleInfo() {
        return this.LLJJJIL;
    }

    @Override // X.C1545664u
    public void setEffectText(List<TextStickerTextWrap> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) && list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (TextStickerTextWrap textStickerTextWrap : list) {
                arrayList.add(new C1555968t(textStickerTextWrap.getSelectionStart(), textStickerTextWrap.getText(), false, textStickerTextWrap.getHasFocus()));
            }
            this.LLJJJJLIIL.setText(arrayList);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LLJJJJLIIL.setText(C47261Igj.LJII(new C1555968t(0, false, (String) null, 15)));
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.LLJJL = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.LLJJJJLIIL.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            this.LLILLL = true;
            this.LJLJI.setVisibility(4);
            this.LLFF.setVisibility(8);
            this.LLJJJJLIIL.setVisibility(0);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LLILLL = false;
        this.LJLJI.setVisibility(0);
        this.LLFF.setVisibility(0);
        this.LLJJJJLIIL.setVisibility(4);
    }

    public final void setScaleInfo(C1552667m value) {
        o.LJIIIZ(value, "value");
        if (!o.LJ(this.LLJJJIL, value)) {
            this.LLJJJIL = value;
            if (!value.LJLIL) {
                post(new ARunnableS38S0100000_2(this, 25));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555068k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.eor);
        this.LLJJJ = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.LLJJJIL = new C1552667m(0);
        ScrollView scrollView = new ScrollView(context);
        C018905p c018905p = new C018905p(-1, -1);
        c018905p.topToTop = 0;
        c018905p.bottomToBottom = 0;
        c018905p.startToStart = 0;
        c018905p.endToEnd = 0;
        scrollView.setLayoutParams(c018905p);
        scrollView.setFillViewport(true);
        viewGroup.addView(scrollView);
        scrollView.setOnTouchListener(new IDTListenerS112S0100000_2(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(frameLayout);
        this.LLJJJJ = frameLayout;
        C1555168l c1555168l = new C1555168l(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c1555168l.setLayoutParams(layoutParams);
        frameLayout.addView(c1555168l);
        this.LLJJJJJIL = c1555168l;
        C1555868s c1555868s = new C1555868s(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        c1555868s.setLayoutParams(layoutParams2);
        c1555868s.setVisibility(4);
        c1555868s.setShowHint(true);
        String string = context.getString(R.string.p72);
        o.LJIIIIZZ(string, "context.getString(R.stri…ge_coverselect_entertext)");
        c1555868s.setHintString(string);
        c1555868s.setMaxViewWidth(C81184Vtc.LJ(context));
        c1555168l.addView(c1555868s);
        this.LLJJJJLIIL = c1555868s;
        this.LJLJI.addTextChangedListener(new IDObjectS175S0100000_2(this, 2));
        this.LLIIII.setVisibility(8);
        View view = this.LJZL;
        if (view instanceof TextView) {
            o.LJII(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
        }
        this.LJLJI.bringToFront();
        this.LJLJI.setHint(" ");
        ViewGroup.LayoutParams layoutParams3 = this.LJLJI.getLayoutParams();
        layoutParams3.width = -2;
        this.LJLJI.setLayoutParams(layoutParams3);
    }

    @Override // X.C1545664u
    public final void LJJIFFI(List<TextStickerTextWrap> list, List<? extends InlineRichTextStyleData> inlineRichTextStyleDataList, int i, int i2, int i3, String str, boolean z, int i4, int i5, String str2, Integer num, boolean z2, boolean z3) {
        o.LJIIIZ(inlineRichTextStyleDataList, "inlineRichTextStyleDataList");
        this.LLJJJJLIIL.setEditable(true);
        C1DH.LJJIJL(this.LJLJI, true);
        super.LJJIFFI(list, inlineRichTextStyleDataList, i, i2, i3, str, z, i4, i5, str2, num, z2, z3);
        ImageView imageView = this.LJLLILLLL;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.LJLLILLLL = null;
        }
        View view = this.LJLJJI;
        if (view != null) {
            view.setVisibility(8);
            this.LJLJJI = null;
        }
    }
}
