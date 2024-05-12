package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.proxy.ReportBusinessProxy;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZE implements NZ4 {
    public final /* synthetic */ NZA LIZ;

    @Override // X.NZ4
    public final void LIZ() {
    }

    @Override // X.NZ4
    public final void LJLIIL() {
    }

    @Override // X.NZ4
    public final void LJLIL(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.NZ4
    public final void LIZIZ() {
        BusinessService.Business LIZ = this.LIZ.LJLLILLLL.LIZ(ReportBusinessProxy.class);
        Activity activity = this.LIZ.LJLIL;
        LIZ.getClass();
        CrossPlatformLegacyServiceImpl.LJIJ().LJIIIIZZ(activity, LIZ.LIZIZ.LIZ.LJIIIZ);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Pro, X.Prl] */
    @Override // X.NZ4
    public final void LJLIIIL() {
        ?? r0;
        NZA nza = this.LIZ;
        NZC nzc = nza.LJLJJL;
        if (nzc != null) {
            if (!nzc.goBack() && (r0 = nza.LJLLI) != 0) {
                r0.invoke();
                return;
            }
            return;
        }
        o.LJIJI("mCrossPlatformWebView");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Pro, X.Prl] */
    @Override // X.NZ4
    public final void LJLILLLLZI() {
        ?? r0 = this.LIZ.LJLLI;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Pro, X.Prl] */
    @Override // X.NZ4
    public final void LJLJI() {
        ?? r0 = this.LIZ.LJLLI;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    public NZE(NZA nza) {
        this.LIZ = nza;
    }
}
