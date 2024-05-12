package X;

import android.webkit.ValueCallback;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ej3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37213Ej3<T> implements ValueCallback<String> {
    public final /* synthetic */ C37957Ev3 LIZ;

    public C37213Ej3(C37957Ev3 c37957Ev3) {
        this.LIZ = c37957Ev3;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        String it = str;
        C37957Ev3 c37957Ev3 = this.LIZ;
        o.LJFF(it, "it");
        c37957Ev3.getClass();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{a=");
            LIZ.append(it);
            LIZ.append('}');
            String optString = new JSONObject(X1D.LIZIZ(LIZ)).optString("a", "");
            o.LJFF(optString, "jsonObject.optString(\"a\", \"\")");
            c37957Ev3.LJIIZILJ(optString);
        } catch (JSONException e) {
            String str2 = c37957Ev3.LJFF;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("parseJsonValueEncodedMsgQueue failed, exception == ");
            LIZ2.append(e.getMessage());
            C37887Etv.LIZIZ(str2, X1D.LIZIZ(LIZ2));
        }
    }
}
