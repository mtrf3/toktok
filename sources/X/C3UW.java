package X;

import fjb.a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.perfmon.duration.DurationPerfMonImpl$endTracing$1", f = "DurationPerfMonImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3UW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3UX LJLIL;
    public final /* synthetic */ C84683Ua LJLILLLLZI;
    public final /* synthetic */ C3UY LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3UW(C3UX c3ux, C84683Ua c84683Ua, C3UY c3uy, long j, String str, InterfaceC67352kd<? super C3UW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3ux;
        this.LJLILLLLZI = c84683Ua;
        this.LJLJI = c3uy;
        this.LJLJJI = j;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3UW(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        int i = C3UT.LIZ[this.LJLIL.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C84683Ua c84683Ua = this.LJLILLLLZI;
                C3UX c3ux = this.LJLIL;
                C3UY c3uy = this.LJLJI;
                long j = this.LJLJJI;
                c84683Ua.getClass();
                if (c3ux.LIZJ >= 1.0f || FMX.LIZJ(c3ux.LIZ)) {
                    java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("load_time", Long.valueOf(j)));
                    LJJLIIIIJ.putAll(c3uy.LIZ);
                    LJJLIIIIJ.putAll(c3uy.LIZIZ);
                    LJJLIIIIJ.putAll(c3uy.LIZJ);
                    if (C78685UuP.LJJJZ(c3ux.LIZIZ)) {
                        LJJLIIIIJ.put("extra_id", c3ux.LIZIZ);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(LJJLIIIIJ.size()));
                    for (Map.Entry entry : ((LinkedHashMap) LJJLIIIIJ).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                    c84683Ua.LIZIZ.LIZIZ(c3ux.LIZ, linkedHashMap);
                }
            }
        } else {
            C84683Ua c84683Ua2 = this.LJLILLLLZI;
            C3UX c3ux2 = this.LJLIL;
            C3UY c3uy2 = this.LJLJI;
            long j2 = this.LJLJJI;
            c84683Ua2.getClass();
            JSONObject LIZJ = C84683Ua.LIZJ(c3uy2.LIZ);
            JSONObject LIZJ2 = C84683Ua.LIZJ(c3uy2.LIZIZ);
            LIZJ2.put("load_time", j2);
            JSONObject LIZJ3 = C84683Ua.LIZJ(c3uy2.LIZJ);
            if (C78685UuP.LJJJZ(c3ux2.LIZIZ)) {
                LIZJ3.put("extra_id", c3ux2.LIZIZ);
            }
            c84683Ua2.LIZ.LIZ(c3ux2.LIZ, LIZJ, LIZJ2, LIZJ3);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reported duration for ");
        LIZ.append(this.LJLJJL);
        C34B.LIZIZ("DurationPerfMonImpl", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
