package X;

import Y.ARunnableS25S0200000_6;
import android.webkit.ValueCallback;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ej1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37211Ej1<T> implements ValueCallback<String> {
    public final /* synthetic */ ARunnableS25S0200000_6 LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ android.net.Uri LIZJ;

    public C37211Ej1(ARunnableS25S0200000_6 aRunnableS25S0200000_6, String str, android.net.Uri uri) {
        this.LIZ = aRunnableS25S0200000_6;
        this.LIZIZ = str;
        this.LIZJ = uri;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("code", -1);
            String msg = jSONObject.optString("message", "");
            Object opt = jSONObject.opt("data");
            if (optInt != 0) {
                F2U f2u = (F2U) this.LIZ.l1;
                o.LJFF(msg, "msg");
                f2u.getClass();
            } else {
                ((F2U) this.LIZ.l1).getClass();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Manual] Result Callback.name: ");
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
