package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBV extends C61491OBj {
    public boolean LJLJLLL;
    public final /* synthetic */ long LJLL;

    public CBV(long j) {
        this.LJLL = j;
    }

    @Override // X.C61491OBj
    public final void LJL(String schema, String biz, C60737Nsb c60737Nsb, C30941Ji c30941Ji) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(biz, "biz");
        super.LJL(schema, biz, c60737Nsb, c30941Ji);
        this.LJLJLLL = true;
        C0NB.LJIIIZ("SubscribeService", "subs privilege detail preload fail");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LJLL));
        C0K2.LJII(2, "ttlive_subscription_perf_privilege_preloadreuse", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
    }

    @Override // X.C61491OBj
    public final void LJLI(String schema, String biz, C60737Nsb c60737Nsb, InterfaceC60833Nu9 interfaceC60833Nu9) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(biz, "biz");
        super.LJLI(schema, biz, c60737Nsb, interfaceC60833Nu9);
        if (this.LJLJLLL) {
            return;
        }
        C0NB.LJIIIZ("SubscribeService", "subs privilege detail preload success");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.LJLL));
        C0K2.LJII(1, "ttlive_subscription_perf_privilege_preloadreuse", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
    }
}
