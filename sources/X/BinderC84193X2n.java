package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.X2n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class BinderC84193X2n extends X2S {
    public final /* synthetic */ InterfaceC84194X2o LJLILLLLZI;

    @Override // X.InterfaceC84196X2q
    public final String getEventPage() {
        return this.LJLILLLLZI.getEventPage();
    }

    @Override // X.InterfaceC84196X2q
    public final int[] o0() {
        InterfaceC84194X2o interfaceC84194X2o = this.LJLILLLLZI;
        if (interfaceC84194X2o instanceof AbstractC84195X2p) {
            return ((AbstractC84195X2p) interfaceC84194X2o).LIZ();
        }
        return null;
    }

    public BinderC84193X2n(InterfaceC84194X2o interfaceC84194X2o) {
        this.LJLILLLLZI = interfaceC84194X2o;
    }

    @Override // X.InterfaceC84196X2q
    public final void G(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.LJLILLLLZI.monitorLogSend(new JSONObject(str));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
