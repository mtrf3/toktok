package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.C1d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30649C1d {
    public Boolean LIZ;
    public int LIZIZ;
    public PunishEventInfo LIZJ;

    public C30649C1d() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30649C1d)) {
            return false;
        }
        C30649C1d c30649C1d = (C30649C1d) obj;
        return o.LJ(this.LIZ, c30649C1d.LIZ) && this.LIZIZ == c30649C1d.LIZIZ && o.LJ(this.LIZJ, c30649C1d.LIZJ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int hashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.LIZIZ) * 31;
        PunishEventInfo punishEventInfo = this.LIZJ;
        return hashCode + (punishEventInfo != null ? punishEventInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PerceptionRecordData(violation=");
        LIZ.append(this.LIZ);
        LIZ.append(", endTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", message=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C30649C1d(int i) {
        this(null, -1, null);
    }

    public C30649C1d(Boolean bool, int i, PunishEventInfo punishEventInfo) {
        this.LIZ = bool;
        this.LIZIZ = i;
        this.LIZJ = punishEventInfo;
    }
}
