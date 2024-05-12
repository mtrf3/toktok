package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdExperienceEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NFB implements NRX {
    public final NFE LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public Context LJLJJLL;
    public Aweme LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public View LJLL;
    public SmartImageView LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public C207728Dg LJLLL;
    public TuxTextView LJLLLL;
    public SY4 LJLLLLLL;
    public AdFollowUpAceSurveyVM LJLZ;
    public OO3 LJZ;
    public TuxIconView LJZI;
    public ActivityC45651qj LJZL;
    public final AdExperienceEventLogger LL;
    public final C62822Ol8 LLD;
    public XKQ LLF;

    @Override // X.C90T
    public final void LIZIZ() {
    }

    @Override // X.C90F
    public final void LIZLLL(Aweme aweme, boolean z) {
    }

    @Override // X.OO8
    public final void LJ() {
    }

    @Override // X.OO8
    public final boolean LJFF() {
        return true;
    }

    @Override // X.C90T
    public final void LJIIL() {
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.NRX
    public final boolean Kl0() {
        OO3 oo3 = this.LJZ;
        if (oo3 != null) {
            return oo3.LJIILL;
        }
        return false;
    }

    @Override // X.C90T
    public final void LIZJ() {
        View view = this.LJLJLJ;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        View view3 = this.LJLJJI;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.LJLJJL;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        View view5 = this.LJLL;
        if (view5 != null) {
            view5.setVisibility(0);
            view5.setAlpha(1.0f);
        }
    }

    @Override // X.C90T
    public final void LJII() {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.LJLJJL;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(8);
    }

    @Override // X.C90T
    public final boolean isShowing() {
        View view = this.LJLJLJ;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C90F
    public final void LJIIJJI() {
        if (!isShowing()) {
            return;
        }
        AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = this.LJLZ;
        if (adFollowUpAceSurveyVM != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(adFollowUpAceSurveyVM), null, null, new C59025NEn(true, adFollowUpAceSurveyVM, null), 3);
        } else {
            o.LJIJI("surveyVm");
            throw null;
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ NFE L9() {
        return this.LJLIL;
    }

    @Override // X.OO8
    public final void LJIILIIL() {
        LJIIJJI();
    }

    public NFB(NFE depend) {
        o.LJIIIZ(depend, "depend");
        this.LJLIL = depend;
        this.LL = new AdExperienceEventLogger();
        this.LLD = C221108m2.LIZIZ(NFD.LJLIL);
    }

    @QD3
    public final void onEvent$commercialize_feed_impl_release(C56642Ke c56642Ke) {
        LifecycleCoroutineScope lifecycleScope;
        if (c56642Ke == null) {
            return;
        }
        try {
            ActivityC45651qj activityC45651qj = this.LJZL;
            XKQ xkq = null;
            if (activityC45651qj != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj)) != null) {
                xkq = XKX.LIZLLL(lifecycleScope, null, null, new C59032NEu(c56642Ke, this, null), 3);
            }
            C3C5.m7constructorimpl(xkq);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.C90F
    public final void LJI(EnumC61773OMf operation, Aweme aweme) {
        o.LJIIIZ(operation, "operation");
        AdExperienceEventLogger adExperienceEventLogger = this.LL;
        N12.LIZ.getClass();
        adExperienceEventLogger.LJIILIIL(N12.LJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d3, code lost:
    
        if (r21 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ce, code lost:
    
        if (r21 != null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    @Override // X.C90T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(android.view.ViewStub r19, android.content.Context r20, com.ss.android.ugc.aweme.feed.model.Aweme r21, android.view.View r22, android.view.View r23, android.view.View r24, android.view.View r25, X.OO3 r26) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NFB.LJIIJ(android.view.ViewStub, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, android.view.View, android.view.View, android.view.View, X.OO3):void");
    }
}
