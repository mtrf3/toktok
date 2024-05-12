package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YBu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86982YBu extends ViewGroup {
    public static Boolean LJLJJL;
    public static java.util.Map<String, Integer> LJLJJLL;
    public static int LJLJL = 251789312;
    public static final YCQ LJLJLJ;
    public static final YCP LJLJLLL;
    public static final YCO LJLL;
    public static final YCR LJLLI;
    public static final YCT LJLLILLLL;
    public static final YCU LJLLJ;
    public static final YCF LJLLL;
    public static final YCG LJLLLL;
    public static final YCH LJLLLLLL;
    public static final YCK LJLZ;
    public static final YC7 LJZ;
    public static final List<AbstractC86978YBq> LJZI;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C86982YBu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    static {
        YCV ycv = new YCV();
        YCM ycm = new YCM();
        YCB ycb = new YCB();
        YCE yce = new YCE();
        YCN ycn = new YCN();
        YCW ycw = new YCW();
        YCL ycl = new YCL();
        YCQ ycq = new YCQ();
        LJLJLJ = ycq;
        YCI yci = new YCI();
        YCP ycp = new YCP();
        LJLJLLL = ycp;
        YCO yco = new YCO();
        LJLL = yco;
        YCR ycr = new YCR();
        LJLLI = ycr;
        YCT yct = new YCT();
        LJLLILLLL = yct;
        YCU ycu = new YCU();
        LJLLJ = ycu;
        YCF ycf = new YCF();
        LJLLL = ycf;
        YCG ycg = new YCG();
        LJLLLL = ycg;
        YCH ych = new YCH();
        LJLLLLLL = ych;
        YC2 yc2 = new YC2();
        C86987YBz c86987YBz = new C86987YBz();
        YC3 yc3 = new YC3();
        YC1 yc1 = new YC1();
        YC0 yc0 = new YC0();
        C86986YBy c86986YBy = new C86986YBy();
        C86985YBx c86985YBx = new C86985YBx();
        YC9 yc9 = new YC9();
        YCA yca = new YCA();
        YCD ycd = new YCD();
        YC5 yc5 = new YC5();
        YC8 yc8 = new YC8();
        YCC ycc = new YCC();
        YCS ycs = new YCS();
        YC6 yc6 = new YC6();
        YCJ ycj = new YCJ();
        YCK yck = new YCK();
        LJLZ = yck;
        YC7 yc7 = new YC7();
        LJZ = yc7;
        LJZI = C47261Igj.LJJIJIIJI(yce, ycn, ycm, ycv, ycb, ycw, ycl, ycq, yci, ycp, yco, ycr, yct, ycu, ycf, ycg, ych, yc2, c86987YBz, yc3, yc1, yc0, c86986YBy, c86985YBx, yc9, yca, ycd, yc5, yc8, ycc, ycs, yc6, ycj, yck, yc7, new YC4(), new C86984YBw());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C86981YBt(-2);
    }

    public final int getMyHeight() {
        return this.LJLJJI;
    }

    public final int getMyHeightMeasureSpec() {
        return this.LJLILLLLZI;
    }

    public final int getMyWidth() {
        return this.LJLJI;
    }

    public final int getMyWidthMeasureSpec() {
        return this.LJLIL;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C86981YBt;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return new C86981YBt(context, attrs);
    }

    public final void setMyHeight(int i) {
        this.LJLJJI = i;
    }

    public final void setMyHeightMeasureSpec(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setMyWidth(int i) {
        this.LJLJI = i;
    }

    public final void setMyWidthMeasureSpec(int i) {
        this.LJLIL = i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C86981YBt(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x027f, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0280, code lost:
    
        if (r4 >= r6) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0282, code lost:
    
        r3 = getChildAt(r4);
        r2 = r3.getLayoutParams();
        kotlin.jvm.internal.o.LJII(r2, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
        r2 = (X.C86981YBt) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0291, code lost:
    
        if (r2.LJI == null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0293, code lost:
    
        r1 = r2.LJIILJJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0297, code lost:
    
        if (r1 != r1) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0299, code lost:
    
        r9 = 1073741824;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r1), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02a5, code lost:
    
        if (r2.LJII == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02a7, code lost:
    
        r1 = r2.LJIILL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02ab, code lost:
    
        if (r1 != r1) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ad, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r1), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02b5, code lost:
    
        r3.measure(r8, r0);
        r1 = (int) r2.LJIILJJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02bf, code lost:
    
        if (r1 == r3.getMeasuredWidth()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02c1, code lost:
    
        if (r1 <= 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02c3, code lost:
    
        r2.LJIILJJIL = r3.getMeasuredWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02ca, code lost:
    
        r1 = (int) r2.LJIILL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02d1, code lost:
    
        if (r1 == r3.getMeasuredHeight()) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02d3, code lost:
    
        if (r1 <= 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x02d5, code lost:
    
        r2.LJIILL = r3.getMeasuredHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02dc, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02df, code lost:
    
        r1 = ((android.view.ViewGroup.LayoutParams) r2).height;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x02e2, code lost:
    
        if (r1 != (-2)) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02e4, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r22.LJLJJI, com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority.DEFAULT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02ee, code lost:
    
        if (r1 != (-1)) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02f0, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r22.LJLJJI, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02f9, code lost:
    
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r2.LIZIZ()), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0308, code lost:
    
        r9 = 1073741824;
        r1 = ((android.view.ViewGroup.LayoutParams) r2).width;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x030d, code lost:
    
        if (r1 != (-2)) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x030f, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r22.LJLJI, com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority.DEFAULT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0319, code lost:
    
        if (r1 != (-1)) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x031b, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r22.LJLJI, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0322, code lost:
    
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.round(r2.LJFF()), 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03f2, code lost:
    
        setMeasuredDimension((r22.LJLJI + r21) + r20, (r22.LJLJJI + r19) + r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0401, code lost:
    
        return;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86982YBu.onMeasure(int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C86982YBu(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            boolean r0 = r1.isInEditMode()
            if (r0 == 0) goto L23
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C86982YBu.LJLJJL = r0
            java.util.Map<java.lang.String, java.lang.Integer> r0 = X.C86982YBu.LJLJJLL
            if (r0 != 0) goto L23
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            X.C86982YBu.LJLJJLL = r0
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86982YBu.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type com.bytedance.tux.widget.FlexLayout.LayoutParams");
                C86981YBt c86981YBt = (C86981YBt) layoutParams;
                if (getLayoutDirection() == 1) {
                    int i6 = (i3 - i) - paddingLeft;
                    childAt.layout(i6 - Math.round(c86981YBt.LIZLLL()), Math.round(c86981YBt.LJ()) + paddingTop, i6 - Math.round(c86981YBt.LIZJ()), Math.round(c86981YBt.LIZ()) + paddingTop);
                } else {
                    childAt.layout(Math.round(c86981YBt.LIZJ()) + paddingLeft, Math.round(c86981YBt.LJ()) + paddingTop, Math.round(c86981YBt.LIZLLL()) + paddingLeft, Math.round(c86981YBt.LIZ()) + paddingTop);
                }
            }
        }
    }
}
