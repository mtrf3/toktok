package X;

import android.view.Choreographer;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public final class EWO extends AbstractC65781Prl implements InterfaceC65784Pro<Object> {
    public static final EWO LJLIL = new EWO();

    public EWO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        Field LIZ = C36508EUm.LIZ(Choreographer.class, "FRAME_CALLBACK_TOKEN");
        if (LIZ == null) {
            return null;
        }
        return LIZ.get(null);
    }
}
