package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import ujb.o;

/* renamed from: X.XAp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84403XAp extends XCZ {
    public final XCG LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;

    @Override // X.XCZ
    public final void LIZJ() {
    }

    public final SingleAlgorithmModelResponse LJII() {
        SingleAlgorithmModelResponse singleAlgorithmModelResponse;
        OSZ[] oszArr = new OSZ[4];
        String str = this.LJI.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        oszArr[0] = new OSZ("sdk_version", str);
        String str3 = this.LJI.LJII;
        if (str3 != null) {
            str2 = str3;
        }
        oszArr[1] = new OSZ("device_type", str2);
        oszArr[2] = new OSZ("device_platform", "android");
        oszArr[3] = new OSZ("name", this.LJII);
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (this.LJI.LJJIJ == XA2.ZIP) {
            LJJLIIIIJ.put("url_type", "zip");
        } else {
            LJJLIIIIJ.put("url_type", "source");
        }
        X9D x9d = this.LJI.LJJIJIIJIL;
        if (x9d != null) {
            LJJLIIIIJ.put("status", String.valueOf(Integer.valueOf(x9d.ordinal())));
        }
        int i = this.LJIIIIZZ;
        if (i > 0) {
            LJJLIIIIJ.put("busi_id", String.valueOf(i));
        }
        LJJLIIIIJ.putAll(XCH.LIZ(this.LJI, false));
        String str4 = this.LJIIIZ;
        if (str4 != null && (!o.LJJJJJL(str4))) {
            LJJLIIIIJ.put("big_version", str4);
        }
        String str5 = this.LJI.LJJIIJZLJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str5);
        LIZ.append("/model/api/model");
        XD6 xd6 = new XD6(C61597OFl.LIZ(LJJLIIIIJ, X1D.LIZIZ(LIZ)), null, XD7.GET, null, null, LiveCoverMinSizeSetting.DEFAULT);
        X62 x62 = (X62) this.LJI.LJIJI.LIZ;
        if (x62 == null) {
            LJI(new C84418XBe(10011));
            return null;
        }
        try {
            String LIZLLL = C79045V0n.LIZLLL(x62.fetchFromNetwork(xd6).LIZJ);
            if (LIZLLL.length() == 0) {
                LJI(new C84418XBe(10002));
                return null;
            }
            G0J g0j = this.LJI.LJIJ;
            if (g0j == null || (singleAlgorithmModelResponse = (SingleAlgorithmModelResponse) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(LIZLLL, SingleAlgorithmModelResponse.class)) == null) {
                LJI(new C84418XBe(10008));
                return null;
            }
            return singleAlgorithmModelResponse;
        } catch (Exception e) {
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("FetchModelInfoByNameTask", "fetch single model info failed!", e);
            LJI(new C84418XBe(e));
            return null;
        }
    }

    @Override // X.XCZ
    public final void LIZ() {
        LJII();
    }

    public static final void LJI(C84418XBe c84418XBe) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetch single model info failed!, ");
        LIZ.append(c84418XBe.LIZIZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("FetchModelInfoByNameTask", LIZIZ, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84403XAp(XCG config, String modelName, int i) {
        super(null, config.LJJJ);
        kotlin.jvm.internal.o.LJIIJ(config, "config");
        kotlin.jvm.internal.o.LJIIJ(modelName, "modelName");
        this.LJI = config;
        this.LJII = modelName;
        this.LJIIIIZZ = i;
        this.LJIIIZ = null;
    }
}
