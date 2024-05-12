package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class KR3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String message) {
        Activity LJIIIIZZ;
        o.LJIIIZ(message, "message");
        if (o.LJ(EF7.LJIILIIL, "local_test") && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null) {
            C26045AKb c26045AKb = new C26045AKb(LJIIIIZZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("IBE: ");
            LIZ2.append(message);
            c26045AKb.LJIIIZ(X1D.LIZIZ(LIZ2));
            c26045AKb.LJIIJ();
        }
    }

    public static Activity LIZJ(Context context) {
        o.LJIIIZ(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextWrapper.getBaseContext();
                o.LJII(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return (Activity) baseContext;
            }
        }
        return C84763XOl.LJIIIIZZ();
    }

    public static void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, String str, OSZ... oszArr) {
        InterfaceC60761Nsz kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
        if (kitView == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unable to send JSB ");
            LIZ2.append(str);
            LIZ2.append(" due to empty kit view");
            LIZ(X1D.LIZIZ(LIZ2));
            return;
        }
        if (oszArr.length == 0) {
            kitView.LJIIJ(str, null);
        } else {
            kitView.LJIIIZ(str, new JSONObject(C113554cx.LJJLIIIIJ((OSZ[]) Arrays.copyOf(oszArr, oszArr.length))));
        }
    }
}
