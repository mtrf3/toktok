package X;

import android.webkit.ValueCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ej0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37210Ej0<T> implements ValueCallback<String> {
    public final /* synthetic */ F2U LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    public C37210Ej0(F2U f2u, String str, String str2) {
        this.LIZ = f2u;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code", -1);
            String msg = jSONObject.optString("message", "");
            Object opt = jSONObject.opt("data");
            if (optInt != 0 && this.LIZ != null) {
                o.LJFF(msg, "msg");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Auto] Result Callback.name: ");
            LIZ.append(this.LIZIZ);
            LIZ.append(", code: ");
            LIZ.append(optInt);
            LIZ.append(", msg: ");
            LIZ.append(msg);
            LIZ.append(", data: ");
            LIZ.append(opt);
            LIZ.append(", url: ");
            LIZ.append(this.LIZJ);
            C37198Eio.LIZIZ(X1D.LIZIZ(LIZ));
            C3C5.m7constructorimpl(jSONObject);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
