package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Q2v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66365Q2v extends Q2V {
    public C66365Q2v() {
        super("!", 600, 1);
    }

    @Override // X.Q2V
    public final Object LIZ(List<? extends Object> list) {
        LIZJ(list, true);
        if (ListProtector.get(list, 0) instanceof Boolean) {
            return Boolean.valueOf(!((Boolean) r1).booleanValue());
        }
        throw new C61596OFk(101, "params invalid");
    }
}
