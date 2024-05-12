package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.OIs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61682OIs extends AbstractC61685OIv {
    public C61682OIs() {
        super("add");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        if (list != null) {
            if ((ListProtector.get(list, 0) instanceof Integer) && (ListProtector.get(list, 1) instanceof Integer)) {
                Object obj = ListProtector.get(list, 0);
                if (obj != null) {
                    int intValue = ((Integer) obj).intValue();
                    Object obj2 = ListProtector.get(list, 1);
                    if (obj2 != null) {
                        return C77339UWx.LIZIZ((Integer) obj2, intValue);
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.Int");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(String.valueOf(ListProtector.get(list, 0)));
            LIZ.append(String.valueOf(ListProtector.get(list, 1)));
            return X1D.LIZIZ(LIZ);
        }
        throw new C61596OFk(105, "params error");
    }
}
