package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import java.util.HashMap;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XDt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84485XDt extends XCZ {
    public final XCG LJI;
    public final String LJII;

    @Override // X.XCZ
    public final void LIZ() {
        String queryToValue;
        HashMap hashMap;
        InterfaceC84458XCs interfaceC84458XCs = (InterfaceC84458XCs) C78685UuP.LJJJJLI(this.LJI.LJJIFFI);
        if (interfaceC84458XCs == null || (queryToValue = interfaceC84458XCs.queryToValue("updatetime")) == null) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(10009), 39), 64));
            return;
        }
        try {
            G0J g0j = this.LJI.LJIJ;
            if (g0j != null && (hashMap = (HashMap) ((KNJsonConverter) g0j.LIZ).convertJsonToObj(queryToValue, HashMap.class)) != null) {
                C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, hashMap, 42), 64));
            } else {
                C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(new IllegalStateException("local file destroy")), 39), 64));
            }
        } catch (Exception e) {
            C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS162S0200000_15(this, new C84418XBe(e), 39), 64));
        }
    }

    @Override // X.XCZ
    public final void LIZJ() {
        C15180ig.LIZ(new ARunnableS51S0100000_15(new AqS165S0100000_15(this, 711), 64));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84485XDt(XCG effectConfig, String str) {
        super(str, null);
        o.LJIIJ(effectConfig, "effectConfig");
        this.LJI = effectConfig;
        this.LJII = str;
    }
}
