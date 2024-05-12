package X;

import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HG7 {
    public final HGC LIZ;
    public final InterfaceC65784Pro<ExtractFramesModel> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HG7)) {
            return false;
        }
        HG7 hg7 = (HG7) obj;
        return this.LIZ == hg7.LIZ && o.LJ(this.LIZIZ, hg7.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC65784Pro<ExtractFramesModel> interfaceC65784Pro = this.LIZIZ;
        return hashCode + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtractFrameContext(source=");
        LIZ.append(this.LIZ);
        LIZ.append(", frameModelProvider=");
        return C06540Nm.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public HG7(HGC source, InterfaceC65784Pro<ExtractFramesModel> interfaceC65784Pro) {
        o.LJIIIZ(source, "source");
        this.LIZ = source;
        this.LIZIZ = interfaceC65784Pro;
    }
}
