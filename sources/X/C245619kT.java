package X;

import android.text.TextUtils;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9kT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245619kT extends F9E {
    public final String LJLIL;
    public final HashMap<String, C9XS> LJLILLLLZI = new HashMap<>();
    public C170206m8 LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C245619kT(String str) {
        this.LJLIL = str;
    }

    public final C9XS L(String eventType) {
        o.LJIIIZ(eventType, "eventType");
        if (TextUtils.isEmpty(eventType)) {
            return null;
        }
        C9XS c9xs = this.LJLILLLLZI.get(eventType);
        if (c9xs == null) {
            C9XS c9xs2 = new C9XS(eventType);
            this.LJLILLLLZI.put(eventType, c9xs2);
            return c9xs2;
        }
        return c9xs;
    }
}
