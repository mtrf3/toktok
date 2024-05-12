package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.PasskeyFrequencySettingsModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes13.dex */
public final class T0I<T> extends AtomicReference<Object> implements T0V<T> {
    public static final long serialVersionUID = -733876083048047795L;
    public final List<Object> LJLIL;
    public volatile boolean LJLILLLLZI;
    public volatile int LJLJI;

    public T0I() {
        C73320Sq4.LIZIZ(16, "capacityHint");
        this.LJLIL = new ArrayList(16);
    }

    public final void LIZ(T0L<T> t0l) {
        int i;
        int i2;
        if (t0l.getAndIncrement() != 0) {
            return;
        }
        List<Object> list = this.LJLIL;
        InterfaceC116954iR<? super T> interfaceC116954iR = t0l.LJLIL;
        Integer num = (Integer) t0l.LJLJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
            t0l.LJLJI = 0;
        }
        int i3 = 1;
        while (!t0l.LJLJJI) {
            int i4 = this.LJLJI;
            while (i4 != i) {
                if (t0l.LJLJJI) {
                    t0l.LJLJI = null;
                    return;
                }
                PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = (Object) ListProtector.get(list, i);
                if (this.LJLILLLLZI && (i2 = i + 1) == i4 && i2 == (i4 = this.LJLJI)) {
                    if (EnumC73845SyX.isComplete(passkeyFrequencySettingsModel)) {
                        interfaceC116954iR.onComplete();
                    } else {
                        interfaceC116954iR.onError(EnumC73845SyX.getError(passkeyFrequencySettingsModel));
                    }
                    t0l.LJLJI = null;
                    t0l.LJLJJI = true;
                    return;
                }
                interfaceC116954iR.onNext(passkeyFrequencySettingsModel);
                i++;
            }
            if (i == this.LJLJI) {
                t0l.LJLJI = Integer.valueOf(i);
                i3 = t0l.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
        t0l.LJLJI = null;
    }
}
