package X;

import com.lynx.tasm.TemplateData;
import kotlin.jvm.internal.o;

/* renamed from: X.M0x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56123M0x {
    public final TemplateData LIZ;
    public final boolean LIZIZ;

    public C56123M0x() {
        this((TemplateData) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56123M0x)) {
            return false;
        }
        C56123M0x c56123M0x = (C56123M0x) obj;
        return o.LJ(this.LIZ, c56123M0x.LIZ) && this.LIZIZ == c56123M0x.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        TemplateData templateData = this.LIZ;
        int hashCode = (templateData == null ? 0 : templateData.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxData(templateData=");
        LIZ.append(this.LIZ);
        LIZ.append(", isSuccess=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C56123M0x(TemplateData templateData, int i) {
        this((i & 1) != 0 ? null : templateData, false);
    }

    public C56123M0x(TemplateData templateData, boolean z) {
        this.LIZ = templateData;
        this.LIZIZ = z;
    }
}
