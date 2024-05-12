package X;

import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THC implements TH7<THN, Fragment> {
    public final HashMap<String, TH6<THN, Fragment>> LIZ = new HashMap<>();
    public final InterfaceC88472Yns<String, TH6<THN, Fragment>> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public THC(InterfaceC88472Yns<? super String, ? extends TH6<THN, ? extends Fragment>> interfaceC88472Yns) {
        this.LIZIZ = interfaceC88472Yns;
    }

    @Override // X.TH7
    public final TH6<THN, Fragment> get(String str) {
        TH6<THN, Fragment> invoke;
        TH6<THN, Fragment> th6 = this.LIZ.get(str);
        if (th6 != null) {
            return th6;
        }
        InterfaceC88472Yns<String, TH6<THN, Fragment>> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null && (invoke = interfaceC88472Yns.invoke(str)) != null) {
            return invoke;
        }
        return new THE();
    }

    public final void LIZ(String category, TH6<THN, ? extends Fragment> th6) {
        o.LJIIIZ(category, "category");
        this.LIZ.put(category, th6);
    }
}
