package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hga, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44704Hga {
    public final List<AutoCutMediaModel> LIZ;
    public final boolean LIZIZ;
    public final EnumC44705Hgb LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44704Hga)) {
            return false;
        }
        C44704Hga c44704Hga = (C44704Hga) obj;
        return o.LJ(this.LIZ, c44704Hga.LIZ) && this.LIZIZ == c44704Hga.LIZIZ && this.LIZJ == c44704Hga.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<AutoCutMediaModel> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LIZJ.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMediaModelListInfo(sourceType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mediaList=");
        LIZ.append(this.LIZ);
        LIZ.append(", useCompressMedia=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C44704Hga(List<AutoCutMediaModel> list, boolean z, EnumC44705Hgb sourceType) {
        o.LJIIIZ(sourceType, "sourceType");
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = sourceType;
    }
}
