package X;

import X.C157816Hh;
import kotlin.jvm.internal.AqS103S0300000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.6I1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6I1<T extends C157816Hh> implements C6I2<T> {
    public final C62822Ol8 LIZ;

    public C6I1() {
        this(null);
    }

    public final C83310Wmo<T, Void> LIZJ() {
        return (C83310Wmo) this.LIZ.getValue();
    }

    public C6I1(InterfaceC88471Ynr<? super T, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr) {
        this.LIZ = C221108m2.LIZIZ(new AqS164S0100000_14(interfaceC88471Ynr, 293));
    }

    @Override // X.C6I2
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final int LIZ(T bean) {
        o.LJIIIZ(bean, "bean");
        if (bean.LIZIZ() || bean.LIZ()) {
            return 4;
        }
        if (LIZJ().LJI(bean) || LIZJ().LJFF(bean)) {
            return 8;
        }
        bean.downloaded = C157986Hy.LIZ(bean.effect);
        if (bean.LIZ()) {
            return 4;
        }
        return 2;
    }

    public final void LIZLLL(T bean, InterfaceC83314Wms<T, Void> interfaceC83314Wms) {
        o.LJIIIZ(bean, "bean");
        C83310Wmo<T, Void> LIZJ = LIZJ();
        LIZJ.getClass();
        LIZJ.LJIIIIZZ(new AqS103S0300000_14(LIZJ, bean, interfaceC83314Wms, 3));
    }
}
