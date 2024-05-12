package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes12.dex */
public final class PQ3 extends PQ5 {
    public PQ3() {
        super("is_background");
    }

    @Override // X.PQ5
    public final Object LIZ(List<? extends Object> list) {
        Integer num;
        int i = 1;
        if (list != null && !list.isEmpty() && (num = (Integer) ListProtector.get(list, 0)) != null) {
            i = num.intValue();
        }
        PQ0.LJFF.getClass();
        return Boolean.valueOf(C64403PPj.LIZLLL(i * 1000));
    }
}
