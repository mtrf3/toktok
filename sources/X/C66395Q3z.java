package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;
import m43.u;

/* renamed from: X.Q3z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66395Q3z {
    public static final Q44 LIZLLL = new Q44();
    public static final HashMap<String, String> LJ = new HashMap<>();
    public final EnumC66383Q3n LIZ;
    public final String LIZIZ;
    public StringBuilder LIZJ;

    public final void LIZIZ() {
        o.LJIIIIZZ(this.LIZJ.toString(), "contents.toString()");
        EnumC66383Q3n behavior = this.LIZ;
        String tag = this.LIZIZ;
        o.LJIIIZ(behavior, "behavior");
        o.LJIIIZ(tag, "tag");
        u.LJIIIIZZ(behavior);
        this.LIZJ = new StringBuilder();
    }

    public final void LIZJ() {
        u.LJIIIIZZ(this.LIZ);
    }

    public C66395Q3z(EnumC66383Q3n behavior) {
        o.LJIIIZ(behavior, "behavior");
        this.LIZ = behavior;
        Q4J.LJFF("Request", "tag");
        this.LIZIZ = o.LJIILLIIL("Request", "FacebookSDK.");
        this.LIZJ = new StringBuilder();
    }

    public final void LIZ(Object value, String key) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        LIZJ();
    }
}
