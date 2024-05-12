package X;

import android.webkit.ValueCallback;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NxX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61043NxX<T> implements ValueCallback {
    public final /* synthetic */ C61038NxS LIZ;

    public C61043NxX(C61038NxS c61038NxS) {
        this.LIZ = c61038NxS;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        try {
            if (JSONObjectProtectorUtils.getLong(new JSONObject((String) obj), "dom_ready") <= 0) {
                C61042NxW c61042NxW = this.LIZ.LIZIZ;
                c61042NxW.LJIJI = -4;
                c61042NxW.LJIIL = true;
            }
            this.LIZ.LIZIZ(true, false);
        } catch (JSONException unused) {
        }
    }
}
