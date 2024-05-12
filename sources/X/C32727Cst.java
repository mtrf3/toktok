package X;

import Y.ALAdapterS1S0000000_4;
import Y.ALAdapterS4S0100000_5;
import Y.ALAdapterS4S0200000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cst, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32727Cst extends AbstractC32678Cs6 {
    public final View LLFII;
    public final C29701Eo LLFZ;
    public final LinearLayout LLI;
    public final C47061t0 LLIFFJFJJ;
    public final C47061t0 LLII;
    public final ImageView LLIIII;
    public final ImageView LLIIIILZ;
    public final ImageView LLIIIJ;
    public final C15540jG LLIIIL;
    public final C15540jG LLIIIZ;
    public boolean LLIIJI;
    public final String LLIIJLIL;
    public final C56414MCc LLIIL;
    public AnimatorSet LLIILII;

    @Override // X.AbstractC32678Cs6
    public final void T() {
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        if (this.LLFF) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LJZ;
            if (abstractC32698CsQ2 != null && abstractC32698CsQ2.LIZJ && C31120CJg.LJIIJJI() == abstractC32698CsQ2.LIZJ()) {
                C31120CJg.LIZ.xt();
                return;
            }
            if (C31120CJg.LJIIIZ() && (abstractC32698CsQ = this.LJZ) != null && C31120CJg.LJIIJJI() == abstractC32698CsQ.LIZJ()) {
                IInteractService iInteractService = C31120CJg.LIZ;
                if (!iInteractService.Zf()) {
                    C56414MCc c56414MCc = this.LLIIL;
                    if (c56414MCc != null && c56414MCc.LIZ(this.LJLJJLL) != null) {
                        C56414MCc c56414MCc2 = this.LLIIL;
                        if (this.LJLJJLL == null || c56414MCc2 == null) {
                            return;
                        }
                        c56414MCc2.LIZJ();
                        c56414MCc2.setVisibility(0);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.9f);
                        ofFloat.setDuration(130L);
                        ofFloat.setInterpolator(C18950ol.LIZIZ(0.66f, 0.0f, 0.8f, 1.0f));
                        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(c56414MCc2, 29));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.9f, 1.15f);
                        ofFloat2.setDuration(130L);
                        ofFloat2.setInterpolator(C18950ol.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
                        ofFloat2.addUpdateListener(new AUListenerS94S0100000_5(c56414MCc2, 30));
                        ValueAnimator ofInt = ValueAnimator.ofInt(1, 10);
                        ofInt.setDuration(1000L);
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.15f, 0.9f);
                        ofFloat3.setDuration(130L);
                        ofFloat3.setInterpolator(C18950ol.LIZIZ(0.66f, 0.0f, 0.8f, 1.0f));
                        ofFloat3.addUpdateListener(new AUListenerS94S0100000_5(c56414MCc2, 27));
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.9f, 1.0f);
                        ofFloat4.setDuration(130L);
                        ofFloat4.setInterpolator(C18950ol.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
                        ofFloat4.addUpdateListener(new AUListenerS94S0100000_5(c56414MCc2, 28));
                        ofFloat4.addListener(new ALAdapterS4S0100000_5(this, 42));
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.2f);
                        ofFloat5.setDuration(200L);
                        ofFloat5.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
                        ofFloat5.addUpdateListener(new AUListenerS94S0100000_5(this, 25));
                        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(1.2f, 1.0f);
                        ofFloat6.setDuration(130L);
                        ofFloat6.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
                        ofFloat6.addUpdateListener(new AUListenerS94S0100000_5(this, 26));
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(1, 10);
                        ofInt2.setDuration(200L);
                        ofInt2.addListener(new ALAdapterS1S0000000_4(2));
                        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(1.0f, 10.0f);
                        ofFloat7.setDuration(2000L);
                        ofFloat7.addListener(new ALAdapterS4S0200000_5(this, c56414MCc2, 16));
                        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(0.0f, 10.0f);
                        ofFloat8.setDuration(300L);
                        ofFloat8.addListener(new LDH());
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(ofFloat8).before(ofFloat);
                        animatorSet.play(ofFloat).before(ofFloat2).with(ofInt2);
                        animatorSet.play(ofInt).after(ofFloat2);
                        animatorSet.play(ofFloat3).after(ofInt);
                        animatorSet.play(ofFloat4).after(ofFloat3);
                        animatorSet.play(ofFloat5).after(ofFloat4);
                        animatorSet.play(ofFloat6).after(ofFloat5);
                        animatorSet.play(ofFloat7).after(ofInt2);
                        animatorSet.addListener(new C32779Ctj(animatorSet, this, c56414MCc2));
                        animatorSet.start();
                        iInteractService.xt();
                        this.LLIILII = animatorSet;
                        return;
                    }
                    C56414MCc c56414MCc3 = this.LLIIL;
                    if (c56414MCc3 == null) {
                        return;
                    }
                    c56414MCc3.setVisibility(8);
                    return;
                }
            }
            C56414MCc c56414MCc4 = this.LLIIL;
            if (c56414MCc4 == null) {
                return;
            }
            c56414MCc4.setVisibility(8);
        }
    }

    @Override // X.AbstractC32678Cs6
    public final void c0() {
        LinearLayout linearLayout = this.LLI;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        ImageView imageView = this.LLIIIJ;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        super.c0();
    }

    @Override // X.AbstractC32678Cs6
    public final void f0() {
        LinearLayout linearLayout = this.LLI;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.LLIIII;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        super.f0();
    }

    @Override // X.AbstractC32678Cs6
    public final String Q() {
        return this.LLIIJLIL;
    }

    public C32727Cst(View view) {
        super(view);
        this.LLFII = view;
        this.LLIIIL = new C15540jG();
        this.LLIIIZ = new C15540jG();
        this.LLIIJLIL = "LiveGiftPanelViewHolderV2";
        this.LLIIL = (C56414MCc) view.findViewById(R.id.gf9);
        this.LLFZ = (C29701Eo) view.findViewById(R.id.dtm);
        this.LLI = (LinearLayout) view.findViewById(R.id.dtn);
        this.LLII = (C47061t0) view.findViewById(R.id.mzh);
        this.LLIFFJFJJ = (C47061t0) view.findViewById(R.id.mzi);
        this.LLIIII = (ImageView) view.findViewById(R.id.mzf);
        this.LLIIIILZ = (ImageView) view.findViewById(R.id.mza);
        this.LLIIIJ = (ImageView) view.findViewById(R.id.jl1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0567, code lost:
    
        if (r0.LJII() == true) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0569, code lost:
    
        r0 = r15.LJZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x056b, code lost:
    
        if (r0 == null) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x056f, code lost:
    
        if (r0.LIZJ != false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0571, code lost:
    
        r0 = r15.LJLJJLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0573, code lost:
    
        if (r0 != null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0575, code lost:
    
        r0 = r15.LJLJLJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0577, code lost:
    
        if (r0 != null) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0579, code lost:
    
        r0 = r15.LJLZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x057d, code lost:
    
        if (r0 != null) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x057f, code lost:
    
        r1 = r15.LLIIII;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0581, code lost:
    
        if (r1 != null) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0583, code lost:
    
        r0 = r15.LLIIIILZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0585, code lost:
    
        if (r0 != null) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0587, code lost:
    
        r0 = r15.LLIIIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0589, code lost:
    
        if (r0 != null) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0663, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0668, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x066d, code lost:
    
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0673, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0678, code lost:
    
        r0.setAlpha(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x067d, code lost:
    
        r0.setAlpha(1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x068b, code lost:
    
        if (r0.LJIIIZ() == r1) goto L333;
     */
    @Override // X.AbstractC32678Cs6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(X.AbstractC32698CsQ<? extends X.C30896CAq> r16, com.bytedance.ies.sdk.datachannel.DataChannel r17, int r18) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32727Cst.N(X.CsQ, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
