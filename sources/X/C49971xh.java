package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49971xh extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C08410Ur<? extends Object>> {
    public static final C49971xh LJLIL = new C49971xh();

    public C49971xh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C08410Ur<? extends Object> invoke(Object it) {
        EnumC08480Uy enumC08480Uy;
        Integer num;
        Integer num2;
        String str;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        Object obj2 = null;
        if (obj != null) {
            enumC08480Uy = (EnumC08480Uy) obj;
        } else {
            enumC08480Uy = null;
        }
        o.LJI(enumC08480Uy);
        Object obj3 = ListProtector.get(list, 2);
        if (obj3 != null) {
            num = (Integer) obj3;
        } else {
            num = null;
        }
        o.LJI(num);
        int intValue = num.intValue();
        Object obj4 = ListProtector.get(list, 3);
        if (obj4 != null) {
            num2 = (Integer) obj4;
        } else {
            num2 = null;
        }
        o.LJI(num2);
        int intValue2 = num2.intValue();
        Object obj5 = ListProtector.get(list, 4);
        if (obj5 != null) {
            str = (String) obj5;
        } else {
            str = null;
        }
        o.LJI(str);
        int ordinal = enumC08480Uy.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            Object obj6 = ListProtector.get(list, 1);
                            if (obj6 != null) {
                                obj2 = obj6;
                            }
                            o.LJI(obj2);
                            return new C08410Ur<>(obj2, intValue, intValue2, str);
                        }
                        throw new C162476Zf();
                    }
                    Object obj7 = ListProtector.get(list, 1);
                    C1HY c1hy = C0VC.LJ;
                    if (!o.LJ(obj7, Boolean.FALSE) && obj7 != null) {
                        obj2 = c1hy.LIZIZ.invoke(obj7);
                    }
                    o.LJI(obj2);
                    return new C08410Ur<>(obj2, intValue, intValue2, str);
                }
                Object obj8 = ListProtector.get(list, 1);
                C1HY c1hy2 = C0VC.LIZLLL;
                if (!o.LJ(obj8, Boolean.FALSE) && obj8 != null) {
                    obj2 = c1hy2.LIZIZ.invoke(obj8);
                }
                o.LJI(obj2);
                return new C08410Ur<>(obj2, intValue, intValue2, str);
            }
            Object obj9 = ListProtector.get(list, 1);
            C1HY c1hy3 = C0VC.LJI;
            if (!o.LJ(obj9, Boolean.FALSE) && obj9 != null) {
                obj2 = c1hy3.LIZIZ.invoke(obj9);
            }
            o.LJI(obj2);
            return new C08410Ur<>(obj2, intValue, intValue2, str);
        }
        Object obj10 = ListProtector.get(list, 1);
        C1HY c1hy4 = C0VC.LJFF;
        if (!o.LJ(obj10, Boolean.FALSE) && obj10 != null) {
            obj2 = c1hy4.LIZIZ.invoke(obj10);
        }
        o.LJI(obj2);
        return new C08410Ur<>(obj2, intValue, intValue2, str);
    }
}
