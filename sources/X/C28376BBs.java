package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BBs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28376BBs extends AbstractC28377BBt {
    public final long LIZJ;
    public final boolean LIZLLL;

    @Override // X.AbstractC28377BBt
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC28377BBt
    public final boolean LIZLLL() {
        return this.LIZLLL;
    }

    public final void LJI(InterfaceC116954iR interfaceC116954iR, boolean z) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        hashMap.put(8, Boolean.valueOf(z));
        Boolean LIZJ = InterfaceC30442Bx8.X0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_COMMENT_FILTER_SWITCH_L2_FILTER.value");
        hashMap.put(4, LIZJ);
        hashMap.put(9, Boolean.valueOf(z));
        LJ(hashMap, interfaceC116954iR);
    }

    public C28376BBs(long j, boolean z, String trigger) {
        o.LJIIIZ(trigger, "trigger");
        this.LIZJ = j;
        this.LIZLLL = z;
    }
}
