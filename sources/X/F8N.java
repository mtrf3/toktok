package X;

import android.app.Application;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public final class F8N extends F8Y {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "ProviderInstalledFailedPlugin";
    }

    @Override // X.F8Y
    public final void LIZLLL() {
        if (!InstrumentationC38473F8b.LIZIZ) {
            try {
                Object LIZ = C36590EXq.LIZ();
                Field declaredField = LIZ.getClass().getDeclaredField("mInstrumentation");
                declaredField.setAccessible(true);
                if (!(declaredField.get(LIZ) instanceof InstrumentationC38473F8b)) {
                    declaredField.set(LIZ, new InstrumentationC38473F8b());
                    F8X.LIZIZ(F8W.DEBUG);
                    InstrumentationC38473F8b.LIZIZ = true;
                }
            } catch (Exception e) {
                e.getMessage();
                F8X.LIZIZ(F8W.DEBUG);
            }
        }
        F8X.LIZ();
    }

    @Override // X.F8Y
    public final void LIZJ(Application application) {
        InstrumentationC38473F8b.LIZ(new F8O());
        InstrumentationC38473F8b.LIZ(new F8Q());
    }
}
