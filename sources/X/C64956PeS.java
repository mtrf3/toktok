package X;

import java.util.Map;

/* renamed from: X.PeS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64956PeS<T> extends AbstractC64964Pea<java.util.Map<String, T>> {
    public final InterfaceC65016PfQ<T, String> LIZ;
    public final boolean LIZIZ;

    public C64956PeS(InterfaceC65016PfQ<T, String> interfaceC65016PfQ, boolean z) {
        this.LIZ = interfaceC65016PfQ;
        this.LIZIZ = z;
    }

    @Override // X.AbstractC64964Pea
    public final void LIZ(C64970Peg c64970Peg, Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                Object value = entry.getValue();
                if (value != null) {
                    c64970Peg.LIZIZ(str, (String) this.LIZ.LIZ(value), this.LIZIZ);
                }
            } else {
                throw new IllegalArgumentException("Query map contained null key.");
            }
        }
    }
}
