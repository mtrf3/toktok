package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Nsj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60745Nsj extends C60736Nsa {
    public final /* synthetic */ InterfaceC60710NsA LIZ;

    public C60745Nsj(InterfaceC60710NsA interfaceC60710NsA) {
        this.LIZ = interfaceC60710NsA;
    }

    @Override // X.C60736Nsa
    public final void LJI(C61295O3v response) {
        o.LJIIJ(response, "response");
        if (((C60606NqU) this.LIZ).LJIILIIL instanceof C37942Euo) {
            boolean LJ = o.LJ(response.LLD, "cdn");
            Object obj = ((C60606NqU) this.LIZ).LJIILIIL;
            if (obj != null) {
                ((C37942Euo) obj).LJIIJJI(new C37909EuH(Boolean.valueOf(LJ), response.LJZI.getUrl(), response.LJZI.getGeckoModel().LJLIL, response.LJZI.getGeckoModel().LJLILLLLZI, response.LJZI.getGeckoModel().LJLJI));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.bridge.HybridBridge");
        }
    }

    @Override // X.C60736Nsa
    public final void LJII(O26 resourceInfo) {
        boolean z;
        String str;
        o.LJIIJ(resourceInfo, "resourceInfo");
        InterfaceC60710NsA interfaceC60710NsA = this.LIZ;
        if (((C60606NqU) interfaceC60710NsA).LJIILIIL instanceof C37942Euo) {
            if (resourceInfo.LJIIIZ == O29.CDN) {
                z = true;
            } else {
                z = false;
            }
            Object obj = ((C60606NqU) interfaceC60710NsA).LJIILIIL;
            if (obj != null) {
                C37942Euo c37942Euo = (C37942Euo) obj;
                Boolean valueOf = Boolean.valueOf(z);
                String uri = resourceInfo.LJI.toString();
                C60889Nv3 c60889Nv3 = resourceInfo.LJIILIIL;
                String str2 = null;
                if (c60889Nv3 != null) {
                    str2 = c60889Nv3.LJLIL;
                    str = c60889Nv3.LJLILLLLZI;
                } else {
                    str = null;
                }
                c37942Euo.LJIIJJI(new C37909EuH(valueOf, uri, "", str2, str));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.bridge.HybridBridge");
        }
    }
}
