package X;

import android.widget.FrameLayout;
import java.lang.reflect.Constructor;

/* loaded from: classes16.dex */
public final class YR8 extends AbstractC65781Prl implements InterfaceC65784Pro<Constructor<C29091Cf>> {
    public static final YR8 LJLIL = new YR8();

    public YR8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Constructor<C29091Cf> invoke() {
        Constructor<C29091Cf> declaredConstructor = C29091Cf.class.getDeclaredConstructor(FrameLayout.class);
        declaredConstructor.setAccessible(true);
        return declaredConstructor;
    }
}
