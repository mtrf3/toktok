package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XqA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86066XqA extends AbstractC86064Xq8<C86066XqA> {
    public int LJFF;

    public C86066XqA() {
        super("enter_activity_tab");
    }

    @Override // X.AbstractC86064Xq8
    public final void LIZIZ() {
        super.LIZIZ();
        String valueOf = String.valueOf(this.LJFF);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        HashMap hashMap = (HashMap) this.LIZIZ.getValue();
        String LIZ = c1799074g.LIZ(valueOf);
        o.LJIIIIZZ(LIZ, "rule.normalize(value)");
        hashMap.put("show_cnt", LIZ);
    }
}