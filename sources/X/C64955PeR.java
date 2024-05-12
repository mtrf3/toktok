package X;

import defpackage.a1;
import java.util.Map;

/* renamed from: X.PeR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64955PeR<T> extends AbstractC64964Pea<java.util.Map<String, T>> {
    public final InterfaceC65016PfQ<T, String> LIZ;
    public final boolean LIZIZ;

    public C64955PeR(InterfaceC65016PfQ<T, String> interfaceC65016PfQ, boolean z) {
        this.LIZ = interfaceC65016PfQ;
        this.LIZIZ = z;
    }

    @Override // X.AbstractC64964Pea
    public final void LIZ(C64970Peg c64970Peg, Object obj) {
        java.util.Map map = (java.util.Map) obj;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    Object value = entry.getValue();
                    if (value != null) {
                        c64970Peg.LIZ(str, (String) this.LIZ.LIZ(value), this.LIZIZ);
                    } else {
                        throw new IllegalArgumentException(a1.LJ("Field map contained null value for key '", str, "'."));
                    }
                } else {
                    throw new IllegalArgumentException("Field map contained null key.");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Field map was null.");
    }
}
