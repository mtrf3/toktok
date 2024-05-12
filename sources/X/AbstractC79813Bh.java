package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3Bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79813Bh<T> implements InterfaceC79903Bq<T> {
    public final int capacity;
    public final MBA context;
    public final XKI onBufferOverflow;

    public String additionalToStringProps() {
        return null;
    }

    @Override // X.InterfaceC65462ha
    public Object collect(InterfaceC64672gJ<? super T> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return collect$suspendImpl(this, interfaceC64672gJ, interfaceC67352kd);
    }

    public abstract Object collectTo(C3CK<? super T> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd);

    public abstract AbstractC79813Bh<T> create(MBA mba, int i, XKI xki);

    public InterfaceC65462ha<T> dropChannelOperators() {
        return null;
    }

    public final InterfaceC88471Ynr<C3CK<? super T>, InterfaceC67352kd<? super C76800UCe>, Object> getCollectToFun$kotlinx_coroutines_core() {
        return new C79743Ba(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String additionalToStringProps = additionalToStringProps();
        if (additionalToStringProps != null) {
            arrayList.add(additionalToStringProps);
        }
        MBA mba = this.context;
        if (mba != MBB.INSTANCE) {
            arrayList.add(o.LJIILLIIL(mba, "context="));
        }
        int i = this.capacity;
        if (i != -3) {
            arrayList.add(o.LJIILLIIL(Integer.valueOf(i), "capacity="));
        }
        XKI xki = this.onBufferOverflow;
        if (xki != XKI.SUSPEND) {
            arrayList.add(o.LJIILLIIL(xki, "onBufferOverflow="));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C16880lQ.LJLLJ(getClass()));
        sb.append('[');
        return C07670Rv.LIZIZ(sb, ORZ.LLD(arrayList, ", ", null, null, null, 62), ']');
    }

    public XKM<T> produceImpl(InterfaceC70422pa interfaceC70422pa) {
        MBA mba = this.context;
        int produceCapacity$kotlinx_coroutines_core = getProduceCapacity$kotlinx_coroutines_core();
        XKI xki = this.onBufferOverflow;
        XKY xky = XKY.ATOMIC;
        InterfaceC88471Ynr<C3CK<? super T>, InterfaceC67352kd<? super C76800UCe>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        XKO xko = new XKO(C84648XKa.LIZ(interfaceC70422pa, mba), C78934UyQ.LIZJ(produceCapacity$kotlinx_coroutines_core, xki, 4));
        xky.invoke(collectToFun$kotlinx_coroutines_core, xko, xko);
        return xko;
    }

    public AbstractC79813Bh(MBA mba, int i, XKI xki) {
        this.context = mba;
        this.capacity = i;
        this.onBufferOverflow = xki;
    }

    public static Object collect$suspendImpl(AbstractC79813Bh abstractC79813Bh, InterfaceC64672gJ interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object LJI = C48841JEv.LJI(new C79753Bb(abstractC79813Bh, interfaceC64672gJ, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC79903Bq
    public InterfaceC65462ha<T> fuse(MBA mba, int i, XKI xki) {
        MBA plus = mba.plus(this.context);
        if (xki == XKI.SUSPEND) {
            int i2 = this.capacity;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            xki = this.onBufferOverflow;
        }
        if (o.LJ(plus, this.context) && i == this.capacity && xki == this.onBufferOverflow) {
            return this;
        }
        return create(plus, i, xki);
    }
}
