package X;

import com.bytedance.bdlocation.df.ILocationPluginInstallListener;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;

/* renamed from: X.XdB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85261XdB implements ILocationPluginInstallListener {
    public final /* synthetic */ LocationServiceImpl LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Cert LIZLLL;
    public final /* synthetic */ Cert LJ;
    public final /* synthetic */ InterfaceC56182M3e LJFF;
    public final /* synthetic */ Long LJI;

    @Override // com.bytedance.bdlocation.df.ILocationPluginInstallListener
    public final void onSuccess(String str, boolean z) {
        XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new C85259Xd9(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, null), 3);
    }

    @Override // com.bytedance.bdlocation.df.ILocationPluginInstallListener
    public final void onFailed(String str, boolean z, int i) {
        XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new C85262XdC(this.LJFF, null), 3);
    }

    public C85261XdB(LocationServiceImpl locationServiceImpl, String str, String str2, TokenCert tokenCert, TokenCert tokenCert2, InterfaceC56182M3e interfaceC56182M3e, Long l) {
        this.LIZ = locationServiceImpl;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = tokenCert;
        this.LJ = tokenCert2;
        this.LJFF = interfaceC56182M3e;
        this.LJI = l;
    }
}
