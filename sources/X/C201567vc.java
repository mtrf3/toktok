package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import defpackage.a1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.7vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201567vc extends C119734mv {
    public final int LJLJLLL;
    public final int LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public AwemeRawAd LJLLJ;

    private final int getDefaultBgColor() {
        return ((Number) this.LJLLILLLL.getValue()).intValue();
    }

    private final int getDefaultTextColor() {
        return ((Number) this.LJLLI.getValue()).intValue();
    }

    private final int getTopMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AwemeRawAd awemeRawAd = this.LJLLJ;
        if (awemeRawAd == null) {
            return;
        }
        if (awemeRawAd.getShowLabelSeconds() <= 0) {
            setTopMargin(0);
            setAlpha(1.0f);
        } else {
            setTopMargin(-C17N.LJIILL(24.0d));
            setAlpha(0.0f);
            post(new ARunnableS39S0100000_3(this, 32));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x002a, code lost:
    
        if (r6 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L28
            com.ss.android.ugc.aweme.commercialize.model.FakeAuthor r0 = r6.getFakeAuthor()
            if (r0 == 0) goto L29
            java.lang.String r3 = r0.getCategoryLabel()
        Ld:
            com.ss.android.ugc.aweme.commercialize.model.FakeAuthor r0 = r6.getFakeAuthor()
            if (r0 == 0) goto L17
            java.lang.String r4 = r0.getRankLabel()
        L17:
            r2 = 0
            if (r3 == 0) goto L20
            int r0 = r3.length()
            if (r0 != 0) goto L2d
        L20:
            if (r4 == 0) goto L28
            int r0 = r4.length()
            if (r0 != 0) goto L2d
        L28:
            return
        L29:
            r3 = r4
            if (r6 == 0) goto L17
            goto Ld
        L2d:
            r5.LJLLJ = r6
            r5.removeAllViews()
            if (r3 == 0) goto L3f
            int r1 = r5.getDefaultTextColor()
            int r0 = r5.getDefaultBgColor()
            r5.LIZIZ(r1, r0, r3)
        L3f:
            if (r4 == 0) goto L4c
            int r1 = r5.getDefaultTextColor()
            int r0 = r5.getDefaultBgColor()
            r5.LIZIZ(r1, r0, r4)
        L4c:
            r5.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201567vc.LIZ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):void");
    }

    public final void setTopMargin(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C201567vc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLLL = C17N.LJIILL(2.0d);
        int LJIILL = C17N.LJIILL(4.0d);
        this.LJLL = LJIILL;
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(context, 51));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS151S0100000_1(context, 50));
        setSpaceH(LJIILL);
    }

    public final void LIZIZ(int i, int i2, String str) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C59948Nfs c59948Nfs = new C59948Nfs(context, null, 4);
        addView(c59948Nfs);
        C26338AVi.LJI(c59948Nfs, 0, 0, Integer.valueOf(this.LJLJLLL), 0, false, 16);
        C59946Nfq LIZ = NDH.LIZ();
        LIZ.LJIIJ(str);
        LIZ.LJIIL(81);
        LIZ.LJIIJJI(i);
        LIZ.LIZ(i2);
        LIZ.LIZIZ(C17N.LJIILL(2.0d));
        C59947Nfr c59947Nfr = LIZ.LIZ;
        if (c59947Nfr != null) {
            c59947Nfr.LJIIIIZZ = -2;
        }
        LIZ.LIZLLL(C17N.LJIILL(16.0d));
        LIZ.LIZJ(TextUtils.TruncateAt.END);
        LIZ.LJFF();
        LIZ.LJII(this.LJLL);
        LIZ.LJIIIIZZ(this.LJLL);
        C59947Nfr c59947Nfr2 = LIZ.LIZ;
        if (c59947Nfr2 != null) {
            c59948Nfs.LIZ(c59947Nfr2);
        }
    }
}
