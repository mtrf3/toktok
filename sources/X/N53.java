package X;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N53 implements JMC {
    public final JME LJLIL;
    public C58798N5u LJLILLLLZI;
    public final SearchAdEventLogger LJLJI = new SearchAdEventLogger();
    public final ActivityC45651qj LJLJJI;
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.JMC
    public final void onViewDetachedFromWindow() {
        this.LJLJJL = false;
        SearchAdEventLogger searchAdEventLogger = this.LJLJI;
        C58777N4z.LIZ.getClass();
        searchAdEventLogger.LJIILIIL(C58777N4z.LIZJ);
        C58798N5u c58798N5u = this.LJLILLLLZI;
        if (c58798N5u != null) {
            c58798N5u.onViewDetachedFromWindow();
        }
    }

    @Override // X.JMC
    public final void onBind() {
        AwemeRawAd awemeRawAd;
        LifecycleCoroutineScope lifecycleScope;
        this.LJLJI.LJIJJ(this.LJLIL.getAweme(), new C58646Mzy(EnumC123104sM.IS_DIRECT_LIVE), this.LJLIL);
        C59948Nfs LIZIZ = this.LJLIL.LIZIZ();
        if (!(LIZIZ instanceof C59948Nfs)) {
            LIZIZ = null;
        }
        Aweme aweme = this.LJLIL.getAweme();
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C182957Fz.LIZ(LIZIZ, awemeRawAd);
        this.LJLILLLLZI = N55.LIZ(this.LJLIL);
        ActivityC45651qj activityC45651qj = this.LJLJJI;
        if (activityC45651qj != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activityC45651qj)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new NEF(this, null), 3);
        }
    }

    @Override // X.JMC
    public final void onViewAttachedToWindow() {
        SearchAdEventLogger searchAdEventLogger = this.LJLJI;
        C58777N4z.LIZ.getClass();
        searchAdEventLogger.LJIILIIL(C58777N4z.LIZIZ);
    }

    @Override // X.JMC
    public final void qC() {
        SearchAdEventLogger searchAdEventLogger = this.LJLJI;
        C58777N4z.LIZ.getClass();
        searchAdEventLogger.LJ(C58777N4z.LJIILJJIL, new AqS176S0100000_10(this, 6));
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ JME L9() {
        return this.LJLIL;
    }

    @Override // X.JMC
    public final InterfaceC58799N5v LLLZIIL() {
        return this.LJLILLLLZI;
    }

    public N53(JMB jmb) {
        ActivityC45651qj activityC45651qj;
        this.LJLIL = jmb;
        Context LIZ = jmb.LIZ();
        if (LIZ != null) {
            activityC45651qj = C45804HyK.LJJIFFI(LIZ);
        } else {
            activityC45651qj = null;
        }
        this.LJLJJI = activityC45651qj;
        this.LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 6));
    }

    @Override // X.JMC
    public final void mq0(JM8 clickFrom) {
        o.LJIIIZ(clickFrom, "clickFrom");
        int i = JM9.LIZ[clickFrom.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            SearchAdEventLogger searchAdEventLogger = this.LJLJI;
            C58777N4z.LIZ.getClass();
            searchAdEventLogger.LJIILIIL(C58777N4z.LJIILIIL);
            return;
        }
        SearchAdEventLogger searchAdEventLogger2 = this.LJLJI;
        C58777N4z.LIZ.getClass();
        searchAdEventLogger2.LJIILIIL(C58777N4z.LJIIJ);
    }
}
