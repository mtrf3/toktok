package X;

import Y.AfS64S0200000_15;
import Y.AfS67S0100000_15;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;

/* renamed from: X.XdL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85271XdL<T> implements InterfaceC64592gB {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<PoiSearchApi.PoiSearchResultWrapper, C76800UCe> LJLJI;
    public final /* synthetic */ C85268XdI LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Throwable, C76800UCe> LJLJJL;
    public final /* synthetic */ String LJLJJLL = "poi";
    public final /* synthetic */ String LJLJL = "add_location";
    public final /* synthetic */ Cert LJLJLJ;
    public final /* synthetic */ Cert LJLJLLL;

    public C85271XdL(C72242sW c72242sW, long j, InterfaceC88472Yns interfaceC88472Yns, C85268XdI c85268XdI, InterfaceC88472Yns interfaceC88472Yns2, TokenCert tokenCert, TokenCert tokenCert2) {
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = c85268XdI;
        this.LJLJJL = interfaceC88472Yns2;
        this.LJLJLJ = tokenCert;
        this.LJLJLLL = tokenCert2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C68322mC c68322mC = new C68322mC();
        this.LJLIL.element = System.currentTimeMillis() - this.LJLILLLLZI;
        long currentTimeMillis = System.currentTimeMillis();
        C72242sW c72242sW = new C72242sW();
        C72242sW c72242sW2 = new C72242sW();
        C85273XdN c85273XdN = new C85273XdN(this.LJLIL, c72242sW, c72242sW2, c68322mC, this.LJLJI, this.LJLJJI, this.LJLJJL);
        PoiSearchApi.PoiSearchRecallResult.Companion.getClass();
        PoiSearchApi.PoiSearchRecallResult LIZ = C85322XeA.LIZ((String) obj);
        if (LIZ != null) {
            String str = this.LJLJJLL;
            String str2 = this.LJLJL;
            Cert cert = this.LJLJLJ;
            Cert cert2 = this.LJLJLLL;
            c72242sW.element = System.currentTimeMillis() - currentTimeMillis;
            c72242sW2.element = System.currentTimeMillis();
            try {
                C73390SrC LIZIZ = C85267XdH.LIZIZ(str, str2, LIZ, cert, cert2);
                if (LIZIZ != null) {
                    LIZIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0200000_15(c68322mC, c85273XdN, 4), new AfS67S0100000_15(c85273XdN, 45));
                    return;
                }
            } catch (Exception unused) {
            }
        }
        c85273XdN.invoke();
    }
}
