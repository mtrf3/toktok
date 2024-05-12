package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RdY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69996RdY<T> implements InterfaceC64592gB {
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLIL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C69996RdY(IPdpStarter.PdpEnterParam pdpEnterParam, IPdpStarter.PdpEnterParam pdpEnterParam2, int i, String str) {
        this.LJLIL = pdpEnterParam;
        this.LJLILLLLZI = pdpEnterParam2;
        this.LJLJI = i;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable e = (Throwable) obj;
        C69999Rdb c69999Rdb = new C69999Rdb(this.LJLIL.getProductId());
        c69999Rdb.LJIIL(EnumC70000Rdc.ERROR);
        c69999Rdb.LJIIJ();
        if (e instanceof C69888Rbo) {
            C70001Rdd.LIZ(this.LJLILLLLZI.getRequestParams(), this.LJLILLLLZI.getTrackParams(), String.valueOf(e.getMessage()), String.valueOf(((C69888Rbo) e).getCode()), this.LJLJI);
        } else {
            o.LJIIIIZZ(e, "e");
            Object LIZ = BPF.LIZ(e);
            if (LIZ == null) {
                LIZ = "";
            }
            C70001Rdd.LIZ(this.LJLILLLLZI.getRequestParams(), this.LJLILLLLZI.getTrackParams(), String.valueOf(e.getMessage()), LIZ.toString(), this.LJLJI);
        }
        C70900Rs8 c70900Rs8 = new C70900Rs8();
        c70900Rs8.LJII(new AqS178S0100000_12(this.LJLIL, 675));
        c70900Rs8.LIZJ(false);
        C69995RdX c69995RdX = C69995RdX.LJLILLLLZI;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LJLILLLLZI;
        String str = this.LJLJJI;
        c69995RdX.getClass();
        C69995RdX.LLLZLL(pdpEnterParam, str);
    }
}
