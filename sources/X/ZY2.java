package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZY2 {
    public final AbstractC90097ZXp LIZ;
    public final List<ZY4> LIZIZ = new ArrayList();
    public final C90095ZXn LIZJ;
    public C90099ZXr LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaRouter.RouteProviderInfo{ packageName=");
        LIZ.append(this.LIZJ.LIZ.getPackageName());
        LIZ.append(" }");
        return X1D.LIZIZ(LIZ);
    }

    public ZY2(AbstractC90097ZXp abstractC90097ZXp) {
        this.LIZ = abstractC90097ZXp;
        this.LIZJ = abstractC90097ZXp.LJLILLLLZI;
    }

    public final ZY4 LIZ(String str) {
        int size = ((ArrayList) this.LIZIZ).size();
        for (int i = 0; i < size; i++) {
            if (((ZY4) ListProtector.get(this.LIZIZ, i)).LIZIZ.equals(str)) {
                return (ZY4) ListProtector.get(this.LIZIZ, i);
            }
        }
        return null;
    }
}
