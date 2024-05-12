package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EFA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final EFA LJLIL = new EFA();

    public EFA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        Integer num = EF7.LIZIZ;
        if (num != null) {
            int intValue = num.intValue();
            try {
                Application application = EF7.LIZ;
                if (application != null) {
                    String string = application.getString(intValue);
                    o.LJIIIIZZ(string, "context.getString(resId)");
                    return string;
                }
                o.LJIJI("context");
                throw null;
            } catch (Throwable unused) {
            }
        }
        return "";
    }
}
