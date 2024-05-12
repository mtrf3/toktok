package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C10K;
import X.C16880lQ;
import X.C37692Eqm;
import X.C39048FUe;
import X.C39930Flm;
import X.C60737Nsb;
import X.C61261O2n;
import X.C61268O2u;
import X.C61269O2v;
import X.C61284O3k;
import X.C61295O3v;
import X.C68322mC;
import X.C76800UCe;
import X.InterfaceC40516FvE;
import X.InterfaceC60201Njx;
import X.InterfaceC60250Nkk;
import X.InterfaceC88472Yns;
import X.O1M;
import X.O26;
import X.O2C;
import X.O2R;
import X.O2Z;
import X.X1D;
import Y.ACallableS87S0200000_10;
import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.forest.model.Request;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AqS15S0500000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(C61295O3v it) {
        o.LJIIJ(it, "it");
        if (((C61284O3k) this.l0).LIZ) {
            C61295O3v c61295O3v = (C61295O3v) this.l1;
            c61295O3v.LJLILLLLZI = true;
            c61295O3v.LL.LIZLLL(2, "ResourceLoaderChain# on cancel load");
            C39930Flm.LIZ("ResourceFetcherChain", "ResourceLoaderChain# on cancel load");
            ((InterfaceC88472Yns) this.l2).invoke((C61295O3v) this.l1);
            return;
        }
        if (it.LJZL) {
            it.LLFII = C16880lQ.LJLLJ(((ResourceFetcher) this.l3).getClass());
            ((InterfaceC88472Yns) this.l2).invoke((C61295O3v) this.l1);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchAsync error:");
        LIZ.append(it.LL);
        C39930Flm.LJ("ResourceFetcherChain", X1D.LIZIZ(LIZ), 4);
        if (!((C61284O3k) this.l0).LIZIZ.isEmpty()) {
            ((C61284O3k) this.l0).LIZIZ((Request) this.l4, (C61295O3v) this.l1, (InterfaceC88472Yns) this.l2);
        } else {
            ((InterfaceC88472Yns) this.l2).invoke(it);
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS15S0500000_10 aqS15S0500000_10, Object obj) {
        aqS15S0500000_10.invoke$0((C61295O3v) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS15S0500000_10 aqS15S0500000_10, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIJ(throwable, "throwable");
        ((InterfaceC40516FvE) aqS15S0500000_10.l0).be(throwable);
        ((InterfaceC88472Yns) aqS15S0500000_10.l4).invoke(throwable);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.O26, T] */
    public static final Object invoke$2(AqS15S0500000_10 aqS15S0500000_10, Object obj) {
        String str;
        String str2;
        C61261O2n it = (C61261O2n) obj;
        o.LJIIJ(it, "it");
        C68322mC c68322mC = (C68322mC) aqS15S0500000_10.l0;
        ?? r1 = it.LIZ;
        c68322mC.element = r1;
        if (r1 != 0) {
            C60737Nsb c60737Nsb = ((O1M) aqS15S0500000_10.l1).LJIIJJI;
            if (c60737Nsb != null) {
                str = c60737Nsb.bid;
            } else {
                str = null;
            }
            r1.LJ = str;
            C60737Nsb c60737Nsb2 = ((O1M) aqS15S0500000_10.l1).LJIIJJI;
            if (c60737Nsb2 != null) {
                str2 = c60737Nsb2.containerId;
            } else {
                str2 = null;
            }
            r1.LJFF = str2;
        }
        ((JSONObject) aqS15S0500000_10.l2).put("m_resolve", ((C61268O2u) aqS15S0500000_10.l3).LIZ());
        ((JSONObject) aqS15S0500000_10.l2).put("m_total", ((C61268O2u) aqS15S0500000_10.l3).LIZIZ());
        O26 resInfo = it.LIZ;
        O1M taskConfig = (O1M) aqS15S0500000_10.l1;
        o.LJIIJ(resInfo, "resInfo");
        o.LJIIJ(taskConfig, "taskConfig");
        C10K.LIZIZ(new ACallableS87S0200000_10(taskConfig, resInfo, 16), C10K.LJI, null);
        O2C.LIZIZ((JSONObject) aqS15S0500000_10.l2, it.LIZ, (O1M) aqS15S0500000_10.l1, true);
        C61269O2v.LIZIZ.LIZIZ(it.LIZ, ((C61261O2n) aqS15S0500000_10.l4).LIZIZ);
        C61261O2n c61261O2n = (C61261O2n) aqS15S0500000_10.l4;
        O26 o26 = c61261O2n.LIZ;
        if (o26 != null) {
            O2R.LIZ(it, (O2Z) o26, c61261O2n.LIZIZ);
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            String jSONArray = it.LIZ.LIZLLL.toString();
            o.LJFF(jSONArray, "it.info.pipelineStatus.toString()");
            C39048FUe.LIZIZ(c39048FUe, jSONArray, null, null, 6);
            return C76800UCe.LIZ;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.resource.RLResourceInfo");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0500000_10(C68322mC c68322mC, O1M o1m, JSONObject jSONObject, C61268O2u c61268O2u, C61261O2n c61261O2n, int i) {
        super(1);
        this.$t = i;
        this.l0 = c68322mC;
        this.l1 = o1m;
        this.l2 = jSONObject;
        this.l3 = c61268O2u;
        this.l4 = c61261O2n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0500000_10(C61284O3k c61284O3k, C61295O3v c61295O3v, InterfaceC88472Yns interfaceC88472Yns, ResourceFetcher resourceFetcher, Request request, int i) {
        super(1);
        this.$t = i;
        this.l0 = c61284O3k;
        this.l1 = c61295O3v;
        this.l2 = interfaceC88472Yns;
        this.l3 = resourceFetcher;
        this.l4 = request;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS15S0500000_10(InterfaceC40516FvE interfaceC40516FvE, InterfaceC60201Njx interfaceC60201Njx, InterfaceC60250Nkk interfaceC60250Nkk, List list, AqS1S0800000_10 aqS1S0800000_10, AqS1S0800000_10 aqS1S0800000_102, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC40516FvE;
        this.l1 = interfaceC60250Nkk;
        this.l2 = list;
        this.l3 = aqS1S0800000_10;
        this.l4 = aqS1S0800000_102;
    }
}
