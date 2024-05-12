package X;

import Y.ACallableS115S0100000_12;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class S0L {
    public final String LIZ;
    public final HashMap<String, String> LIZIZ;
    public final HashMap<String, String> LIZJ;

    public abstract void LIZIZ();

    public final void LIZJ() {
        InterfaceC71397S0j.LIZ.getClass();
        LIZ("data_type", "commerce_data");
        LIZIZ();
        this.LIZIZ.putAll(this.LIZJ);
        C10K.LIZJ(new ACallableS115S0100000_12(this, 4));
    }

    public S0L(String event) {
        o.LJIIIZ(event, "event");
        this.LIZ = event;
        this.LIZIZ = new HashMap<>();
        this.LIZJ = new HashMap<>();
    }

    public final void LIZ(String key, String str) {
        o.LJIIIZ(key, "key");
        if (str != null) {
            this.LIZIZ.put(key, S0Y.LIZ(str));
        }
    }
}
