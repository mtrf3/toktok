package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ac0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26584Ac0 {
    public final String LIZ;
    public final List<C26804AfY> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26584Ac0)) {
            return false;
        }
        C26584Ac0 c26584Ac0 = (C26584Ac0) obj;
        return o.LJ(this.LIZ, c26584Ac0.LIZ) && o.LJ(this.LIZIZ, c26584Ac0.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return this.LIZIZ.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopModuleVO(shopModuleTitle=");
        LIZ.append(this.LIZ);
        LIZ.append(", shopInfoList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26584Ac0(String str, List<C26804AfY> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
