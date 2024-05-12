package X;

import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Gah, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41791Gah {
    public final VEVideoEncodeSettings LIZ;
    public final Throwable LIZIZ;

    public C41791Gah() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41791Gah)) {
            return false;
        }
        C41791Gah c41791Gah = (C41791Gah) obj;
        return o.LJ(this.LIZ, c41791Gah.LIZ) && o.LJ(this.LIZIZ, c41791Gah.LIZIZ);
    }

    public final int hashCode() {
        VEVideoEncodeSettings vEVideoEncodeSettings = this.LIZ;
        int hashCode = (vEVideoEncodeSettings == null ? 0 : vEVideoEncodeSettings.hashCode()) * 31;
        Throwable th = this.LIZIZ;
        return hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompileSettingResult(compileSetting=");
        LIZ.append(this.LIZ);
        LIZ.append(", exception=");
        return C169696lJ.LIZLLL(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C41791Gah(VEVideoEncodeSettings vEVideoEncodeSettings, Throwable th, int i) {
        vEVideoEncodeSettings = (i & 1) != 0 ? null : vEVideoEncodeSettings;
        th = (i & 2) != 0 ? null : th;
        this.LIZ = vEVideoEncodeSettings;
        this.LIZIZ = th;
    }
}
