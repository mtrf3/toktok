package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import java.util.HashMap;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XDl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84477XDl extends XCZ {
    public final XCG LJI;
    public final String LJII;
    public final C40601ia<String, String> LJIIIIZZ;

    @Override // X.XCZ
    public final void LIZ() {
        String convertObjToJson;
        InterfaceC84458XCs interfaceC84458XCs;
        HashMap hashMap = new HashMap();
        C40601ia<String, String> c40601ia = this.LJIIIIZZ;
        if (c40601ia != null) {
            hashMap.putAll(c40601ia);
        }
        try {
            G0J g0j = this.LJI.LJIJ;
            if (g0j != null && (convertObjToJson = ((KNJsonConverter) g0j.LIZ).convertObjToJson(hashMap)) != null && (interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI)) != null) {
                interfaceC84458XCs.save("updatetime", convertObjToJson);
            }
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 702), 64));
        } catch (Exception e) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(e), 23), 64));
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            String valueOf = String.valueOf(e);
            c12310e3.getClass();
            C12310e3.LIZIZ("WriteUpdateTagTask", valueOf, null);
        }
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 727), 64));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84477XDl(XCG effectConfig, String mTaskId, C40601ia<String, String> c40601ia) {
        super(mTaskId, null);
        o.LJIIJ(effectConfig, "effectConfig");
        o.LJIIJ(mTaskId, "mTaskId");
        this.LJI = effectConfig;
        this.LJII = mTaskId;
        this.LJIIIIZZ = c40601ia;
    }
}
