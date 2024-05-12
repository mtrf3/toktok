package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.VwZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81367VwZ extends ConstraintLayout {
    public EnumC56823MRv LJLIL;
    public int LJLILLLLZI;
    public SpannableStringBuilder LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final AqS164S0100000_14 LJLJLLL;
    public final int LJLL;
    public final AqS170S0100000_4 LJLLI;
    public final AqS164S0100000_14 LJLLILLLL;
    public final AqS164S0100000_14 LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJJLJLI() {
        int i;
        boolean z;
        if (this.LJLJI == null || this.LJLJJI == 0 || this.LJLJJLL == 0) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleContentCollapse cardContentWidth = ");
        LIZ.append(this.LJLJJI);
        LIZ.append(", extraWidth = ");
        LIZ.append(this.LJLJJLL);
        C221018lt.LJFF("NoticeCardView", X1D.LIZIZ(LIZ));
        if (_$_findCachedViewById(R.id.eww).getVisibility() == 0) {
            i = this.LJLJJI - this.LJLJLJ;
        } else {
            i = this.LJLJJI;
        }
        StaticLayout staticLayout = new StaticLayout(this.LJLJI, ((TextView) _$_findCachedViewById(R.id.lvz)).getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        float lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) + this.LJLJL;
        StringBuilder LJ = C7MY.LJ("handleContentCollapse contentViewWidth = ", i, ", lineCount = ");
        LJ.append(staticLayout.getLineCount());
        LJ.append(", extraWidth = ");
        LJ.append(this.LJLJL);
        LJ.append(", lastLineWidth = ");
        LJ.append(lineWidth);
        C221018lt.LJFF("NoticeCardView", X1D.LIZIZ(LJ));
        int i2 = 0;
        if (staticLayout.getLineCount() > this.LJLILLLLZI) {
            _$_findCachedViewById(R.id.jjz).setVisibility(0);
            post(new ARunnableS50S0100000_14((InterfaceC65784Pro) this.LJLLILLLL, 202));
            ((TextView) _$_findCachedViewById(R.id.lvz)).setMaxLines(this.LJLILLLLZI);
        } else {
            _$_findCachedViewById(R.id.jjz).setVisibility(8);
        }
        if (staticLayout.getLineCount() > this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        View seeMoreLayout = _$_findCachedViewById(R.id.jjz);
        o.LJIIIIZZ(seeMoreLayout, "seeMoreLayout");
        View tvHide = _$_findCachedViewById(R.id.lwk);
        o.LJIIIIZZ(tvHide, "tvHide");
        View[] viewArr = {seeMoreLayout, tvHide};
        do {
            View view = viewArr[i2];
            if (z) {
                C16310kV.LJIIIZ(view, this.LJLLLL ? 1 : 0);
            } else {
                int LIZLLL = C16310kV.LIZLLL(view);
                boolean z2 = this.LJLLL;
                if (LIZLLL != z2) {
                    C16310kV.LJIIIZ(view, z2 ? 1 : 0);
                }
            }
            i2++;
        } while (i2 < 2);
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(this);
        if (i - lineWidth <= this.LJLJJLL || this.LJLLLL != this.LJLLL) {
            C221018lt.LJFF("NoticeCardView", "hide top to bottom of content");
            anonymousClass064.LJI(R.id.lwk, 3);
            anonymousClass064.LJI(R.id.lwk, 4);
            anonymousClass064.LJIIIIZZ(R.id.lwk, 3, R.id.lvz, 4);
        } else {
            C221018lt.LJFF("NoticeCardView", "hide bottom to bottom of content");
            anonymousClass064.LJI(R.id.lwk, 3);
            anonymousClass064.LJI(R.id.lwk, 4);
            anonymousClass064.LJIIIIZZ(R.id.lwk, 4, R.id.lvz, 4);
        }
        anonymousClass064.LIZIZ(this);
        _$_findCachedViewById(R.id.lwk).setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(new ARunnableS50S0100000_14((InterfaceC65784Pro) this.LJLJLLL, 202));
    }

    public final EnumC56823MRv getStyle() {
        return this.LJLIL;
    }

    public final void setDeleteListener(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.ewh), listener);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.ewi), listener);
    }

    public final void setStyle(EnumC56823MRv enumC56823MRv) {
        o.LJIIIZ(enumC56823MRv, "<set-?>");
        this.LJLIL = enumC56823MRv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81367VwZ(Context context, EnumC56823MRv style) {
        super(context, null, 0);
        int LIZIZ;
        o.LJIIIZ(style, "style");
        this.LJLLLLLL = new LinkedHashMap();
        this.LJLIL = style;
        this.LJLILLLLZI = 2;
        this.LJLJJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        this.LJLJL = C7MY.LIZIZ(16);
        this.LJLJLJ = C7MY.LIZIZ(62);
        this.LJLJLLL = new AqS164S0100000_14(this, 369);
        this.LJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        this.LJLLI = new AqS170S0100000_4(this, 1106);
        this.LJLLILLLL = new AqS164S0100000_14(this, 368);
        this.LJLLJ = new AqS164S0100000_14(this, 367);
        if (getLayoutParams() == null) {
            setLayoutParams(new C018905p(-1, -2));
        }
        setBackgroundResource(R.drawable.yf);
        C16880lQ.LLLZIIL(R.layout.s9, C16880lQ.LLZIL(context), this);
        try {
            List list = (List) ListProtector.get(C92V.LIZ, this.LJLIL.ordinal());
            EnumC56823MRv enumC56823MRv = this.LJLIL;
            EnumC56823MRv enumC56823MRv2 = EnumC56823MRv.FIRST_PAGE_BIG_CARD;
            if (enumC56823MRv == enumC56823MRv2 || enumC56823MRv == EnumC56823MRv.FIRST_PAGE_SMALL_CARD) {
                ((C1AH) _$_findCachedViewById(R.id.dq0)).setVisibility(0);
                View _$_findCachedViewById = _$_findCachedViewById(R.id.n1n);
                if (_$_findCachedViewById != null) {
                    ViewGroup.LayoutParams layoutParams = _$_findCachedViewById.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = ((Number) ListProtector.get(list, EnumC81368Vwa.CHANNEL_BOTTOM.ordinal())).intValue();
                    _$_findCachedViewById.setLayoutParams(marginLayoutParams);
                }
            } else {
                ((C1AH) _$_findCachedViewById(R.id.dq0)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(R.id.ewh)).setVisibility(8);
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII(this);
                anonymousClass064.LJIIIIZZ(R.id.eww, 3, R.id.lvz, 3);
                anonymousClass064.LJIIIIZZ(R.id.ewi, 7, R.id.dx0, 6);
                anonymousClass064.LIZIZ(this);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.lyc);
            ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.lyc).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = ((Number) ListProtector.get(list, EnumC81368Vwa.TITLE_TOP.ordinal())).intValue();
            _$_findCachedViewById2.setLayoutParams(marginLayoutParams2);
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.lvz);
            ViewGroup.LayoutParams layoutParams3 = _$_findCachedViewById(R.id.lvz).getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = ((Number) ListProtector.get(list, EnumC81368Vwa.CONTENT_TOP.ordinal())).intValue();
            _$_findCachedViewById3.setLayoutParams(marginLayoutParams3);
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.n1r);
            ViewGroup.LayoutParams layoutParams4 = _$_findCachedViewById(R.id.n1r).getLayoutParams();
            layoutParams4.height = ((Number) ListProtector.get(list, EnumC81368Vwa.CONTENT_BOTTOM.ordinal())).intValue();
            _$_findCachedViewById4.setLayoutParams(layoutParams4);
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.evy);
            ViewGroup.LayoutParams layoutParams5 = _$_findCachedViewById(R.id.evy).getLayoutParams();
            o.LJII(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
            marginLayoutParams4.topMargin = ((Number) ListProtector.get(list, EnumC81368Vwa.BIG_COVER_TOP.ordinal())).intValue();
            _$_findCachedViewById5.setLayoutParams(marginLayoutParams4);
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.n1m);
            ViewGroup.LayoutParams layoutParams6 = _$_findCachedViewById(R.id.n1m).getLayoutParams();
            layoutParams6.height = ((Number) ListProtector.get(list, EnumC81368Vwa.BIG_COVER_BOTTOM.ordinal())).intValue();
            _$_findCachedViewById6.setLayoutParams(layoutParams6);
            EnumC56823MRv enumC56823MRv3 = this.LJLIL;
            if (enumC56823MRv3 == enumC56823MRv2 || enumC56823MRv3 == EnumC56823MRv.SECOND_PAGE_BIG_CARD) {
                LIZIZ = C7MY.LIZIZ(52);
            } else {
                LIZIZ = C7MY.LIZIZ(38);
            }
            View _$_findCachedViewById7 = _$_findCachedViewById(R.id.lvf);
            ViewGroup.LayoutParams layoutParams7 = _$_findCachedViewById(R.id.lvf).getLayoutParams();
            layoutParams7.height = LIZIZ;
            _$_findCachedViewById7.setLayoutParams(layoutParams7);
            this.LJLILLLLZI = ((TextView) _$_findCachedViewById(R.id.lvz)).getMaxLines();
        } catch (Exception unused) {
        }
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.jjz), new ACListenerS34S0100000_14(this, 89));
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.lwk), new ACListenerS34S0100000_14(this, 90));
        ((TextView) _$_findCachedViewById(R.id.lwb)).setText("...");
        post(new ARunnableS50S0100000_14((InterfaceC65784Pro) this.LJLJLLL, 202));
    }

    public final void LJJLL(SpannableStringBuilder spannableStringBuilder, boolean z) {
        this.LJLJI = spannableStringBuilder;
        this.LJLLL = C90193gN.LIZ();
        this.LJLLLL = z;
        ((TextView) _$_findCachedViewById(R.id.lvz)).setText(this.LJLJI);
        LJJLJLI();
    }
}
