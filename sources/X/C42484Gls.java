package X;

import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.ad.feed.ibe.ICommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.Gls, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42484Gls implements InterfaceC41034G8o, InterfaceC40998G7e {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJI;
    public final GF3 LJLIL;
    public final OF1 LJLILLLLZI = C1DF.LJJIFFI(this, GFC.LJLIL);

    static {
        TBT tbt = new TBT(C42484Gls.class, "commerceModel", "getCommerceModel()Lcom/ss/android/ugc/aweme/commerce/tools/common/CommerceToolsModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    @Override // X.InterfaceC40998G7e
    public final void P0() {
        if (e1.LIZ(31744, "ibe_gecko_preload_in_post", true, false)) {
            for (IBEInfo iBEInfo : ((CommerceToolsModel) this.LJLILLLLZI.LIZ(this, LJLJI[0])).getIbeContext().getIbeInfos()) {
                ICommerceIBEService LJFF = CommerceIBEService.LJFF();
                o.LJIIIIZZ(LJFF, "get().getService(ICommerceIBEService::class.java)");
                LJFF.LIZLLL(iBEInfo, C5L7.LIZ(), new C58628Mzg(iBEInfo, new ETC(0, null, null, EnumC59048NFk.PUBLISH.getValue(), false, 23)), C58989NDd.LJLIL, C58990NDe.LJLIL);
            }
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public C42484Gls(GF4 gf4) {
        this.LJLIL = gf4;
    }
}
