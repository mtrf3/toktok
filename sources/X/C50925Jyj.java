package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.cointask.core.config.SearchCoinTaskConfigData;
import com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinNewUIStyleViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Jyj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50925Jyj extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50925Jyj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final SearchCoinNewUIStyleViewModel getNewCoinViewModel() {
        return (SearchCoinNewUIStyleViewModel) this.LJLJI.getValue();
    }

    private final TuxTextView getTextView() {
        return (TuxTextView) this.LJLILLLLZI.getValue();
    }

    public final SmartImageView getCoinIconView() {
        return (SmartImageView) this.LJLIL.getValue();
    }

    public final String getIconViewUrl() {
        SearchCoinTaskConfigData LIZIZ = C50926Jyk.LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.coinBannerIcon;
        }
        return null;
    }

    public final void LIZ(int i) {
        Resources resources;
        String quantityString;
        Integer LJI;
        Context context = getContext();
        if (context == null || (resources = context.getResources()) == null || (quantityString = resources.getQuantityString(R.plurals.si, i)) == null) {
            return;
        }
        String LIZIZ = C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i)}, 1, Locale.US, quantityString, "format(locale, format, *args)");
        String valueOf = String.valueOf(i);
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, valueOf, 0, false, 6);
        if (LJJLIIIJL <= -1 || LJJLIIIJL >= LIZIZ.length()) {
            return;
        }
        SpannableString spannableString = new SpannableString(LIZIZ);
        Context context2 = getContext();
        if (context2 != null && (LJI = C79045V0n.LJI(R.attr.ls, context2)) != null) {
            spannableString.setSpan(new ForegroundColorSpan(LJI.intValue()), LJJLIIIJL, valueOf.length() + LJJLIIIJL, 33);
        }
        getTextView().setText(spannableString);
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50925Jyj(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r1 = r8 & 2
            r0 = 0
            if (r1 == 0) goto L6
            r7 = r0
        L6:
            java.lang.String r3 = "context"
            defpackage.a1.LJFF(r6, r3)
            r0 = 0
            r5.<init>(r6, r7, r0)
            kotlin.jvm.internal.AqS155S0200000_8 r1 = new kotlin.jvm.internal.AqS155S0200000_8
            r0 = 5
            r1.<init>(r6, r5, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLIL = r0
            kotlin.jvm.internal.AqS153S0100000_3 r1 = new kotlin.jvm.internal.AqS153S0100000_3
            r0 = 852(0x354, float:1.194E-42)
            r1.<init>(r6, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLILLLLZI = r0
            kotlin.jvm.internal.AqS158S0100000_8 r1 = new kotlin.jvm.internal.AqS158S0100000_8
            r0 = 134(0x86, float:1.88E-43)
            r1.<init>(r6, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r5.LJLJI = r0
            r0 = 2130968944(0x7f040170, float:1.7546556E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r6)
            if (r0 == 0) goto L45
            int r0 = r0.intValue()
            r5.setBackgroundColor(r0)
        L45:
            com.bytedance.lighten.loader.SmartImageView r0 = r5.getCoinIconView()
            if (r0 == 0) goto L51
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L5e
        L51:
            com.bytedance.lighten.loader.SmartImageView r0 = r5.getCoinIconView()
            if (r0 == 0) goto L5e
            com.bytedance.lighten.loader.SmartImageView r0 = r5.getCoinIconView()
            r5.addView(r0)
        L5e:
            com.bytedance.tux.input.TuxTextView r0 = r5.getTextView()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L6f
            com.bytedance.tux.input.TuxTextView r0 = r5.getTextView()
            r5.addView(r0)
        L6f:
            r1 = 16
            int r4 = X.C7MY.LIZIZ(r1)
            r0 = 7
            int r2 = X.C7MY.LIZIZ(r0)
            int r1 = X.C7MY.LIZIZ(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r5.setPadding(r4, r2, r1, r0)
            r0 = 40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r5.setMinimumHeight(r0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            r5.setLayoutParams(r2)
            X.Ol8 r0 = X.C50929Jyn.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto Lf8
            android.content.Context r0 = r5.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            X.1qj r3 = X.C45804HyK.LJJIFFI(r0)
            if (r3 == 0) goto Lf8
            com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinNewUIStyleViewModel r0 = r5.getNewCoinViewModel()
            if (r0 == 0) goto Lde
            X.5H3 r0 = r0.LJLIL
            java.lang.Object r2 = r0.getValue()
            androidx.lifecycle.LiveData r2 = (androidx.lifecycle.LiveData) r2
            if (r2 == 0) goto Lde
            Y.AObserverS76S0100000_8 r1 = new Y.AObserverS76S0100000_8
            r0 = 124(0x7c, float:1.74E-43)
            r1.<init>(r5, r0)
            r2.observe(r3, r1)
        Lde:
            com.ss.android.ugc.aweme.search.cointask.core.viewmodel.SearchCoinNewUIStyleViewModel r0 = r5.getNewCoinViewModel()
            if (r0 == 0) goto Lf8
            X.5H3 r0 = r0.LJLILLLLZI
            java.lang.Object r2 = r0.getValue()
            androidx.lifecycle.LiveData r2 = (androidx.lifecycle.LiveData) r2
            if (r2 == 0) goto Lf8
            Y.AObserverS76S0100000_8 r1 = new Y.AObserverS76S0100000_8
            r0 = 125(0x7d, float:1.75E-43)
            r1.<init>(r5, r0)
            r2.observe(r3, r1)
        Lf8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50925Jyj.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
