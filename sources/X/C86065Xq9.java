package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xq9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86065Xq9 extends AbstractC86064Xq8<C86065Xq9> {
    public int LJFF;
    public String LJI;

    public C86065Xq9() {
        super("activity_filter_option_apply");
    }

    @Override // X.AbstractC86064Xq8
    public final void LIZIZ() {
        super.LIZIZ();
        String valueOf = String.valueOf(this.LJFF);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        HashMap hashMap = (HashMap) this.LIZIZ.getValue();
        String LIZ = c1799074g.LIZ(valueOf);
        o.LJIIIIZZ(LIZ, "rule.normalize(value)");
        hashMap.put("option_cnt", LIZ);
        String str = this.LJI;
        if (str != null) {
            LIZ("option_name", str);
        }
    }
}
