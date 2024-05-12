package X;

import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q6H {
    public static final Q6I LIZLLL = new Q6I();
    public static Q6H LJ;
    public final int LIZ;
    public final UUID LIZIZ;
    public Intent LIZJ;

    public final UUID LIZ() {
        UUID uuid = null;
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            uuid = this.LIZIZ;
            return uuid;
        } catch (Throwable unused) {
            return uuid;
        }
    }

    public Q6H(int i) {
        UUID randomUUID = UUID.randomUUID();
        o.LJIIIIZZ(randomUUID, "randomUUID()");
        this.LIZ = i;
        this.LIZIZ = randomUUID;
    }
}
