package X;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public final class ZUF implements InterfaceC12330e5 {
    public final /* synthetic */ ZUT LIZ;

    public ZUF(ZUT zut) {
        this.LIZ = zut;
    }

    @Override // X.InterfaceC12330e5
    public final void onEvent(String str, JSONObject jSONObject) {
        try {
            ZU3 zu3 = this.LIZ.LJLILLLLZI.mCallback;
            if (zu3 != null) {
                zu3.onEvent(str, jSONObject.toString());
            }
        } catch (RemoteException e) {
            if (e.getMessage() != null) {
                e.getMessage();
                C47261Igj.LJJJJZ("ByteBenchService");
            }
        }
    }
}
