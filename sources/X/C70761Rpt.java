package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;

/* renamed from: X.Rpt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70761Rpt implements InterfaceC70769Rq1 {
    public final /* synthetic */ C70756Rpo LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C27583As7 LJLJI;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        this.LJLIL.LJLLLLLL = System.currentTimeMillis();
    }

    public C70761Rpt(C70756Rpo c70756Rpo, boolean z, C27583As7 c27583As7) {
        this.LJLIL = c70756Rpo;
        this.LJLILLLLZI = z;
        this.LJLJI = c27583As7;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLJI.LIZLLL(th);
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIJIIJIL(-1, -1L, false, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Pro, X.Prl] */
    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        ?? r0;
        C70756Rpo c70756Rpo = this.LJLIL;
        if (!c70756Rpo.LLD && (r0 = c70756Rpo.LJLLL) != 0) {
            r0.invoke();
        }
        if (!this.LJLILLLLZI) {
            C70756Rpo c70756Rpo2 = this.LJLIL;
            if (c70756Rpo2.LJLLLLLL > 0) {
                c70756Rpo2.LJLLLLLL = System.currentTimeMillis() - this.LJLIL.LJLLLLLL;
            }
            C70756Rpo c70756Rpo3 = this.LJLIL;
            PdpViewModel pdpViewModel = c70756Rpo3.LJLJLJ;
            if (pdpViewModel != null) {
                C78565UsT.LJJIJ(pdpViewModel, C78613UtF.LIZJ, new C70760Rps(c70756Rpo3, null));
            }
        }
        this.LJLJI.LIZJ(c2047581v);
    }
}
