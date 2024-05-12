package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class Q2V {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public abstract Object LIZ(List<? extends Object> list);

    public final String LIZIZ(List<? extends Object> list) {
        if (list != null && !list.isEmpty()) {
            int i = this.LIZJ;
            boolean z = true;
            boolean z2 = true;
            boolean z3 = false;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = ListProtector.get(list, i2);
                if (!(obj instanceof Number)) {
                    z = false;
                }
                if (!(obj instanceof Boolean)) {
                    z2 = false;
                }
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    z3 = true;
                }
            }
            if (z) {
                if (z3) {
                    return "param_type_double";
                }
                return "param_type_number";
            }
            if (z2) {
                return "param_type_boolean";
            }
        }
        return "param_type_other";
    }

    public final void LIZJ(List<? extends Object> list, boolean z) {
        boolean z2;
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int size = list.size();
            int i = this.LIZJ;
            if (size >= i) {
                if (z) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (ListProtector.get(list, i2) == null) {
                            throw new C61596OFk(101, "params error: param is null");
                        }
                    }
                    return;
                }
                return;
            }
            throw new C61596OFk(101, "params error: params.size() < operator.argsLength");
        }
        throw new C61596OFk(101, "params error: params isNullOrEmpty");
    }

    public Q2V(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
