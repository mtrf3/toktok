package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import kotlin.jvm.internal.o;

/* renamed from: X.4gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115974gr {
    public final SkylightData LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C115974gr) && o.LJ(this.LIZ, ((C115974gr) obj).LIZ);
    }

    public final int hashCode() {
        SkylightData skylightData = this.LIZ;
        if (skylightData == null) {
            return 0;
        }
        return skylightData.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightTemplateBindData(skylightData=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C115974gr(SkylightData skylightData) {
        this.LIZ = skylightData;
    }
}
