package X;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O7L implements O6W {
    public final O7M LIZ;
    public final ExecutorService LIZIZ;

    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public O7L(Context context) {
        o.LJIIJ(context, "context");
        this.LIZ = new O7M(context);
        this.LIZIZ = C61359O6h.LJFF;
    }

    public final int LIZIZ(String str) {
        O7M o7m = this.LIZ;
        if (str != null) {
            return o7m.LIZ.getInt(str, 0);
        }
        o7m.getClass();
        return 0;
    }

    public final String LIZLLL(String str) {
        return this.LIZ.LIZJ(str);
    }

    public final long LIZJ(String str, long j) {
        return this.LIZ.LIZ.getLong(str, j);
    }

    public final O6W LJ(int i, String str) {
        O7M o7m = this.LIZ;
        if (str != null) {
            o7m.LIZIZ.putInt(str, i);
        } else {
            o7m.getClass();
        }
        return this;
    }

    public final O6W LJFF(long j, String str) {
        this.LIZ.LIZLLL(j, str);
        return this;
    }

    public final O6W LJI(String str, String str2) {
        this.LIZ.LIZIZ.putString(str, str2);
        return this;
    }
}
