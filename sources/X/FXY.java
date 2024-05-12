package X;

import android.content.ComponentName;
import android.content.Intent;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKAppToAppRequest;
import com.orbu.core.adapter.TTKResponseKt;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FXY implements InterfaceC37231EjL {
    public static final FXY LIZ;

    static {
        FXY fxy = new FXY();
        LIZ = fxy;
        C16880lQ.LJLLJ(fxy.getClass());
        C77275UUl.LIZLLL("action", "package", "component");
    }

    @Override // X.InterfaceC37231EjL
    public final void LIZ(Intent intent) {
        TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
        if (!tTKOrbu.enableInterceptor()) {
            return;
        }
        String str = intent.getPackage();
        if (str == null) {
            ComponentName component = intent.getComponent();
            if (component != null) {
                str = component.getPackageName();
            } else {
                str = null;
            }
        }
        C1HQ LIZIZ = FXX.LIZIZ(intent);
        if (LIZIZ != null) {
            TTKResponseKt.isBlock(tTKOrbu.shouldInterceptTTKRequest(new TTKAppToAppRequest(new JSONObject(LIZIZ), str, E2C.LIZJ("x-tt-dataflow-id", String.valueOf(1207966465)))));
        }
    }
}
