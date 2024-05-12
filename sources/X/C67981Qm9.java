package X;

import android.widget.TextView;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Qm9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C67981Qm9 implements InterfaceC67661Qgz {
    @Override // X.InterfaceC67661Qgz
    public void onComplete(AbstractC67638Qgc completedTask) {
        o.LJIIIZ(completedTask, "completedTask");
        try {
            Boolean result = (Boolean) completedTask.LJIIJ(ETK.class);
            InterfaceC67979Qm7 interfaceC67979Qm7 = C67959Qln.LIZLLL;
            if (interfaceC67979Qm7 != null) {
                o.LJIIIIZZ(result, "result");
                interfaceC67979Qm7.LIZIZ(result.booleanValue());
                C67960Qlo c67960Qlo = C67959Qln.LJFF;
                if (c67960Qlo != null) {
                    boolean booleanValue = result.booleanValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("is_google_ready", booleanValue);
                    c67960Qlo.LIZIZ("pipo_googlepayapi_isready_end", jSONObject, null);
                    return;
                }
                o.LJIJI("monitor");
                throw null;
            }
            o.LJIJI("callback");
            throw null;
        } catch (ETK unused) {
            InterfaceC67979Qm7 interfaceC67979Qm72 = C67959Qln.LIZLLL;
            if (interfaceC67979Qm72 != null) {
                interfaceC67979Qm72.LIZIZ(false);
                C67960Qlo c67960Qlo2 = C67959Qln.LJFF;
                if (c67960Qlo2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("is_google_ready", false);
                    c67960Qlo2.LIZIZ("pipo_googlepayapi_isready_end", jSONObject2, null);
                    return;
                }
                o.LJIJI("monitor");
                throw null;
            }
            o.LJIJI("callback");
            throw null;
        }
    }

    public static int LIZ(C08370Un c08370Un, int i, int i2) {
        return (c08370Un.hashCode() + i) * i2;
    }

    public static void LIZIZ(Object[] objArr, int i, String str, String str2, TextView textView) {
        String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(objArr, i));
        o.LJIIIIZZ(LLLZ, str2);
        textView.setText(LLLZ);
    }
}
