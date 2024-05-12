package X;

import android.graphics.Point;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0hW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14460hW {
    public final Point LIZ;
    public final Point LIZIZ;
    public final UE3 LIZJ;
    public final int[] LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftFlyInfo(fromPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", toPosition=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", giftTrayShowInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", toIconSize=");
        LIZ.append(Arrays.toString(this.LIZLLL));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.LIZLLL) + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C14460hW.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.linkmic.GiftFlyInfo");
        C14460hW c14460hW = (C14460hW) obj;
        if (o.LJ(this.LIZ, c14460hW.LIZ) && o.LJ(this.LIZIZ, c14460hW.LIZIZ) && o.LJ(this.LIZJ, c14460hW.LIZJ) && Arrays.equals(this.LIZLLL, c14460hW.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C14460hW(Point fromPosition, Point toPosition, UE3 giftTrayShowInfo, int[] iArr) {
        o.LJIIIZ(fromPosition, "fromPosition");
        o.LJIIIZ(toPosition, "toPosition");
        o.LJIIIZ(giftTrayShowInfo, "giftTrayShowInfo");
        this.LIZ = fromPosition;
        this.LIZIZ = toPosition;
        this.LIZJ = giftTrayShowInfo;
        this.LIZLLL = iArr;
    }
}
