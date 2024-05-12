package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cp2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32488Cp2 {
    public final Gift LIZ;
    public final List<Gift> LIZIZ;
    public final C32492Cp6 LIZJ;
    public final List<GiftPage> LIZLLL;
    public final EnumC32491Cp5 LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32488Cp2)) {
            return false;
        }
        C32488Cp2 c32488Cp2 = (C32488Cp2) obj;
        return o.LJ(this.LIZ, c32488Cp2.LIZ) && o.LJ(this.LIZIZ, c32488Cp2.LIZIZ) && o.LJ(this.LIZJ, c32488Cp2.LIZJ) && o.LJ(this.LIZLLL, c32488Cp2.LIZLLL) && this.LJ == c32488Cp2.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftBoxPreSendData(selectedGiftBox=");
        LIZ.append(this.LIZ);
        LIZ.append(", allGiftBoxes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", preselectedGiftToWrap=");
        LIZ.append(this.LIZJ);
        LIZ.append(", candidate=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", entrypoint=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Gift gift = this.LIZ;
        int i = 0;
        if (gift == null) {
            hashCode = 0;
        } else {
            hashCode = gift.hashCode();
        }
        int i2 = hashCode * 31;
        List<Gift> list = this.LIZIZ;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C32492Cp6 c32492Cp6 = this.LIZJ;
        if (c32492Cp6 != null) {
            i = c32492Cp6.hashCode();
        }
        return this.LJ.hashCode() + AnonymousClass391.LIZIZ(this.LIZLLL, (i3 + i) * 31, 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32488Cp2(Gift gift, List<? extends Gift> list, C32492Cp6 c32492Cp6, List<? extends GiftPage> candidate, EnumC32491Cp5 entrypoint) {
        o.LJIIIZ(candidate, "candidate");
        o.LJIIIZ(entrypoint, "entrypoint");
        this.LIZ = gift;
        this.LIZIZ = list;
        this.LIZJ = c32492Cp6;
        this.LIZLLL = candidate;
        this.LJ = entrypoint;
    }
}
