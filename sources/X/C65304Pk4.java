package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Pk4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65304Pk4 implements InterfaceC73592SuS, PXG {
    public static final C65304Pk4 LJLIL = new C65304Pk4();
    public static final int[] LJLILLLLZI = {1, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096};
    public static final C65304Pk4 LJLJI = new C65304Pk4();

    @Override // X.PXG
    public void LIZ(C64601PWz c64601PWz) {
        c64601PWz.addNetworkInterceptor(new C48122Iuc());
    }

    public C83837WvJ LIZIZ(java.util.Map contextCreators) {
        o.LJIIIZ(contextCreators, "contextCreators");
        return new C83837WvJ(contextCreators);
    }

    public void LIZJ(JSONObject jSONObject) {
        C09900aA.LJ("disk_usage", jSONObject);
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        return it instanceof C61057Nxl;
    }
}
