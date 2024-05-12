package X;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public final class T0D<T> extends ArrayList<Object> implements T0H<T> {
    public static final long serialVersionUID = 7063189396499112664L;
    public volatile int LJLIL;

    public T0D() {
        super(16);
    }

    public final void LIZJ(T0E<T> t0e) {
        int i;
        if (t0e.getAndIncrement() != 0) {
            return;
        }
        InterfaceC116954iR<? super T> interfaceC116954iR = t0e.LJLILLLLZI;
        int i2 = 1;
        while (!t0e.LJLJJI) {
            int i3 = this.LJLIL;
            Integer num = (Integer) t0e.LJLJI;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            while (i < i3) {
                if (EnumC73845SyX.accept(get(i), interfaceC116954iR) || t0e.LJLJJI) {
                    return;
                } else {
                    i++;
                }
            }
            t0e.LJLJI = Integer.valueOf(i);
            i2 = t0e.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
        }
    }
}
