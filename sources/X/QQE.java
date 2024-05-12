package X;

import X.QQI;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class QQE<T extends QQI> extends QQ0 {
    public boolean cancel;

    public void cancel() {
        this.cancel = true;
        cancelApi();
    }

    public abstract void onResponse(T t);

    public JSONObject onSendEvent(String str) {
        return null;
    }

    public final void dispatchOnResponse(T t) {
        if (!this.cancel) {
            onResponse(t);
        }
    }
}
