package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UmU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78194UmU {
    public final long LIZ;
    public final InterfaceC65784Pro<List<ImageModel>> LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC78206Umg LIZLLL;
    public final C78161Ulx LJ;
    public String LJFF;
    public List<? extends C77383UYp> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78194UmU)) {
            return false;
        }
        C78194UmU c78194UmU = (C78194UmU) obj;
        return this.LIZ == c78194UmU.LIZ && o.LJ(this.LIZIZ, c78194UmU.LIZIZ) && this.LIZJ == c78194UmU.LIZJ && o.LJ(this.LIZLLL, c78194UmU.LIZLLL) && o.LJ(this.LJ, c78194UmU.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        InterfaceC65784Pro<List<ImageModel>> interfaceC65784Pro = this.LIZIZ;
        int hashCode = (LLJIJIL + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJ.hashCode() + ((this.LIZLLL.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoRequest(assetId=");
        LIZ.append(this.LIZ);
        LIZ.append(", maskCreator=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isMaskGift=");
        LIZ.append(this.LIZJ);
        LIZ.append(", listeners=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", monitor=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C78194UmU(long j, InterfaceC65784Pro interfaceC65784Pro, boolean z, C78200Uma c78200Uma, C78161Ulx c78161Ulx) {
        this.LIZ = j;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = z;
        this.LIZLLL = c78200Uma;
        this.LJ = c78161Ulx;
    }
}
