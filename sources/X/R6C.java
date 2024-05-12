package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R6C extends QQE<R6R> {
    public final WeakReference<R6J> LIZ;

    public R6C(R6J r6j) {
        this.LIZ = new WeakReference<>(r6j);
    }

    @Override // X.QQE
    public final void onResponse(R6R r6r) {
        R6R r6r2 = r6r;
        if (r6r2.LIZIZ) {
            if (this.LIZ.get() != null) {
                this.LIZ.get().LJJIIZI(r6r2.LJIIIZ);
            }
        } else {
            if (this.LIZ.get() == null) {
                return;
            }
            String str = r6r2.LJIILIIL;
            JSONObject jSONObject = r6r2.LJII;
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (TextUtils.isEmpty(str) && optJSONObject != null && optJSONObject.has("profile_key")) {
                    str = optJSONObject.optString("profile_key", "");
                }
            }
            this.LIZ.get().LJJLIIIJ(r6r2.LIZLLL, r6r2.LJFF, str, r6r2);
        }
    }
}
