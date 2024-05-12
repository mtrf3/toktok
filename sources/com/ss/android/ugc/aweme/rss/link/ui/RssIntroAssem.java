package com.ss.android.ugc.aweme.rss.link.ui;

import X.A7B;
import X.AJ4;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.JBR;
import X.XKQ;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public final class RssIntroAssem extends UIContentAssem {
    public int LJLIL;
    public XKQ LJLILLLLZI;
    public AnimatedDrawable2 LJLJI;
    public final C55749LuL LJLJJI;
    public final C214298b3 LJLJJL;
    public final Integer[] LJLJJLL;
    public final Integer[] LJLJL;
    public View LJLJLJ;
    public TuxSheet LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;

    public RssIntroAssem() {
        new LinkedHashMap();
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, RssLinkParam.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 767);
        C65776Prg LIZ = C65352Pkq.LIZ(RssLinkViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 766), A7B.INSTANCE, aqS154S0100000_4);
        this.LJLJJLL = new Integer[]{Integer.valueOf(R.string.bt2), Integer.valueOf(R.string.bt4), Integer.valueOf(R.string.bt6)};
        this.LJLJL = new Integer[]{Integer.valueOf(R.string.bt1), Integer.valueOf(R.string.bt3), Integer.valueOf(R.string.bt5)};
    }

    public final void x3() {
        AnimatedDrawable2 animatedDrawable2 = this.LJLJI;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
        this.LJLJI = null;
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        RssLinkViewModel rssLinkViewModel = (RssLinkViewModel) this.LJLJJL.getValue();
        rssLinkViewModel.withState(new AqS170S0100000_4(rssLinkViewModel, 10));
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        TuxSheet tuxSheet = this.LJLJLLL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x012d, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
    
        r1 = X.W5U.LJIIIIZZ(r0);
        r1.LJJIIJZLJL = r5;
        r1.LJIILIIL = r2;
        r1.LJIILLIIL = r2;
        r1.LIZLLL(new X.AJ3(r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0159, code lost:
    
        if (r0 == null) goto L50;
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem.onViewCreated(android.view.View):void");
    }

    public final void v3(int i) {
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView == null || this.LJLLI == null || this.LJLIL == i) {
            return;
        }
        this.LJLIL = i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tuxTextView, (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(150L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.LJLLI, (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat2.setDuration(150L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.LJLL, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat3.setDuration(150L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.LJLLI, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat4, 150L);
        LIZLLL.playTogether(ofFloat, ofFloat2);
        LIZLLL.addListener(new AJ4(this, i));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat3, ofFloat4);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setInterpolator(new LinearInterpolator());
        animatorSet2.playSequentially(LIZLLL, animatorSet);
        animatorSet2.start();
    }
}
