package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS3S0200200_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XdV, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85281XdV extends AbstractC65781Prl implements InterfaceC88472Yns<C85286Xda, C76800UCe> {
    public final /* synthetic */ PoiPublishExtensionVM LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ double LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Long, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C85281XdV(PoiPublishExtensionVM poiPublishExtensionVM, double d, double d2, String str, boolean z, long j, InterfaceC88472Yns<? super Long, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LJLIL = poiPublishExtensionVM;
        this.LJLILLLLZI = d;
        this.LJLJI = d2;
        this.LJLJJI = str;
        this.LJLJJL = z;
        this.LJLJJLL = j;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C85286Xda c85286Xda) {
        C85286Xda it = c85286Xda;
        o.LJIIIZ(it, "it");
        if (!(it.LJLIL instanceof C72922tc)) {
            this.LJLIL.setState(C85285XdZ.LJLIL);
            long currentTimeMillis = System.currentTimeMillis();
            C85268XdI c85268XdI = new C85268XdI(this.LJLILLLLZI, this.LJLJI, 0L, this.LJLJJI, "RECOMMEND", 20L, 0L, this.LJLJJL, 0L, this.LJLJJLL, null, this.LJLIL.LJLJJL, 1503180);
            long currentTimeMillis2 = System.currentTimeMillis();
            C85269XdJ c85269XdJ = PoiSearchApi.LIZ;
            AqS3S0200200_15 aqS3S0200200_15 = new AqS3S0200200_15(this.LJLIL, (PoiPublishExtensionVM) currentTimeMillis2, (long) this.LJLJL, (InterfaceC88472Yns<? super Long, C76800UCe>) currentTimeMillis, 0L);
            AqS181S0100000_15 aqS181S0100000_15 = new AqS181S0100000_15(this.LJLIL, 224);
            TokenCert.Companion companion = TokenCert.Companion;
            TokenCert with = companion.with("bpea-poi_search_recommend_client_rank");
            with.auth("evru");
            TokenCert with2 = companion.with("bpea-poi_search_recommend_client_rank_decypt");
            with2.auth("mckd");
            c85269XdJ.getClass();
            C85269XdJ.LJI(c85268XdI, aqS3S0200200_15, aqS181S0100000_15, with, with2);
        }
        return C76800UCe.LIZ;
    }
}
