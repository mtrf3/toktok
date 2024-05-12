package X;

import com.bytedance.android.live.wallet.model.IapProductGetResult;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A8C extends A8H {
    public final HashMap<String, IapProductGetResult.Item> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A8C) && o.LJ(this.LIZ, ((A8C) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadedSuccessful(priceMap=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public A8C(HashMap<String, IapProductGetResult.Item> priceMap) {
        o.LJIIIZ(priceMap, "priceMap");
        this.LIZ = priceMap;
    }
}
