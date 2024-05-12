package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50151xz extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C10370av> {
    public static final C50151xz LJLIL = new C50151xz();

    public C50151xz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C10370av invoke(Object it) {
        Float f;
        o.LJIIIZ(it, "it");
        if (o.LJ(it, Boolean.FALSE)) {
            return new C10370av(C10370av.LIZLLL);
        }
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        Float f2 = null;
        if (obj != null) {
            f = (Float) obj;
        } else {
            f = null;
        }
        o.LJI(f);
        float floatValue = f.floatValue();
        Object obj2 = ListProtector.get(list, 1);
        if (obj2 != null) {
            f2 = (Float) obj2;
        }
        o.LJI(f2);
        return new C10370av(C78923UyF.LIZ(floatValue, f2.floatValue()));
    }
}
