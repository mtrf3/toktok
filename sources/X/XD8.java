package X;

import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.ugc.effectplatform.model.net.UpdateUseEffectResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XD8 extends XDF {
    public final XCG LJIIL;
    public final String LJIILIIL;
    public final List<String> LJIILJJIL;
    public final boolean LJIILL;
    public final long LJIILLIIL;
    public final java.util.Map<String, String> LJIIZILJ;

    @Override // X.XDF
    public final int LJII() {
        return 10002;
    }

    @Override // X.XDF
    public final XD6 LJI() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(XCH.LIZ(this.LJIIL, true));
        hashMap.put("panel", this.LJIILIIL);
        hashMap.put("effect_ids", this.LJIILJJIL);
        hashMap.put("type", Integer.valueOf(this.LJIILL ? 1 : 0));
        hashMap.put("expiration_time", Long.valueOf(this.LJIILLIIL));
        java.util.Map<String, String> map = this.LJIIZILJ;
        if (map != null) {
            hashMap.putAll(map);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJIIL.LJJIIJZLJL);
        return new XD6(JBR.LJFF(LIZ, this.LJIIL.LIZ, "/effect/user/use", LIZ), null, XD7.POST, hashMap, "application/json", 202);
    }

    @Override // X.XDF
    public final int LJIIIIZZ() {
        return this.LJIIL.LJIILL;
    }

    @Override // X.XDF
    public final XDH LJIILJJIL(G0J jsonConverter, String str) {
        o.LJIIJ(jsonConverter, "jsonConverter");
        return (XDH) ((KNJsonConverter) jsonConverter.LIZ).convertJsonToObj(str, UpdateUseEffectResponse.class);
    }

    @Override // X.XDF
    public final void LJIIJ(String str, String str2, C84418XBe c84418XBe) {
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed: ");
        LIZ.append(c84418XBe);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("UpdateUsedEffectTask", LIZIZ, null);
        c84418XBe.LIZ(str, this.LJIIL.LJJIIJZLJL, str2);
        super.LJIIJ(str, str2, c84418XBe);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XD8(XCG effectConfig, String panel, String taskFlag, List<String> effectIds, boolean z, long j, java.util.Map<String, String> map) {
        super((X62) effectConfig.LJIJI.LIZ, effectConfig.LJIJ, effectConfig.LJJJ, taskFlag);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(panel, "panel");
        o.LJIIJ(taskFlag, "taskFlag");
        o.LJIIJ(effectIds, "effectIds");
        this.LJIIL = effectConfig;
        this.LJIILIIL = panel;
        this.LJIILJJIL = effectIds;
        this.LJIILL = z;
        this.LJIILLIIL = j;
        this.LJIIZILJ = map;
    }
}
