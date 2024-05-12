package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1y3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50191y3 extends AbstractC65781Prl implements InterfaceC88472Yns<Object, C11770dB> {
    public static final C50191y3 LJLIL = new C50191y3();

    public C50191y3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C11770dB invoke(Object it) {
        C11850dJ c11850dJ;
        C10370av c10370av;
        o.LJIIIZ(it, "it");
        List list = (List) it;
        Object obj = ListProtector.get(list, 0);
        C1HY c1hy = C0VC.LJIILJJIL;
        Boolean bool = Boolean.FALSE;
        Float f = null;
        if (o.LJ(obj, bool) || obj == null) {
            c11850dJ = null;
        } else {
            c11850dJ = (C11850dJ) c1hy.LIZIZ.invoke(obj);
        }
        o.LJI(c11850dJ);
        long j = c11850dJ.LIZ;
        Object obj2 = ListProtector.get(list, 1);
        C1HY c1hy2 = C0VC.LJIILLIIL;
        if (o.LJ(obj2, bool) || obj2 == null) {
            c10370av = null;
        } else {
            c10370av = (C10370av) c1hy2.LIZIZ.invoke(obj2);
        }
        o.LJI(c10370av);
        long j2 = c10370av.LIZ;
        Object obj3 = ListProtector.get(list, 2);
        if (obj3 != null) {
            f = (Float) obj3;
        }
        o.LJI(f);
        return new C11770dB(j, j2, f.floatValue());
    }
}
