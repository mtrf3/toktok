package X;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.O5d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61329O5d {
    public final String LIZ;
    public java.util.Map<Class<?>, Object> LIZIZ;

    public final C48260Iwq LIZ() {
        java.util.Map unmodifiableMap;
        String str = this.LIZ;
        if (this.LIZIZ == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.LIZIZ));
        }
        return new C48260Iwq(str, unmodifiableMap);
    }

    public C61329O5d(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(C67527Qep c67527Qep) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        ((HashMap) this.LIZIZ).put(InterfaceC67542Qf4.class, c67527Qep);
    }
}
