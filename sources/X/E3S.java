package X;

import com.bytedance.ies.abmock.ClientExpManager;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E3S extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final E3S LJLIL = new E3S();

    public E3S() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (C38686FGg.LJ) {
            Boolean isFirstLaunch = (Boolean) C34854Dm6.LIZIZ.getValue();
            o.LJIIIIZZ(isFirstLaunch, "isFirstLaunch");
            if (isFirstLaunch.booleanValue() && C36152EGu.LJ == 1 && E3W.LIZ.contains(C34854Dm6.LIZ.getValue())) {
                i = FFL.LJIIIZ().LJIIJJI(ClientExpManager.new_user_local_aweme_without_guide(), "new_user_local_aweme_without_guide");
                return Integer.valueOf(i);
            }
        }
        i = -1;
        return Integer.valueOf(i);
    }
}
