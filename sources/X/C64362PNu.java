package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PNu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64362PNu {
    public final List<String> LIZ;
    public final Object LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C16880lQ.LJLLJ(this.LIZIZ.getClass()));
        sb.append('{');
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            sb.append((String) ListProtector.get(this.LIZ, i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ C64362PNu(Object obj) {
        QH7.LJIIIIZZ(obj);
        this.LIZIZ = obj;
        this.LIZ = new ArrayList();
    }

    public final void LIZ(Object obj, String str) {
        List<String> list = this.LIZ;
        String valueOf = String.valueOf(obj);
        ((ArrayList) list).add(FP1.LIZLLL(new StringBuilder(C1FL.LIZ(str, 1, valueOf.length())), str, "=", valueOf));
    }
}
