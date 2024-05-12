package X;

import X.JNS;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JNS<T extends JNS<T>> extends JHM<T> {
    public final HashMap<String, String> LJIILJJIL;

    @Override // X.JHM
    public final void LJII() {
    }

    @Override // X.JHM
    public final void LJIIL() {
        super.LJIIL();
        ((HashMap) this.LIZIZ).putAll(this.LJIILJJIL);
    }

    public JNS(String str) {
        super(str);
        this.LJIILJJIL = new HashMap<>();
    }

    public final void LJIILLIIL(String str) {
        this.LIZLLL = str;
        LJIILL("enter_from", str);
    }

    public final void LJIILL(String key, String str) {
        o.LJIIIZ(key, "key");
        if (str == null || str.length() == 0) {
            return;
        }
        this.LJIILJJIL.put(key, str);
    }
}
