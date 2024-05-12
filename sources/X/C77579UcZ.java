package X;

import android.content.Context;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UcZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77579UcZ implements InterfaceC38012Evw, InterfaceC77595Ucp {
    public final Context LJLIL;
    public final C38049EwX LJLILLLLZI;
    public C38048EwW LJLJI;
    public JSONObject LJLJJI;
    public final HashMap<String, String> LJLJJL;

    @Override // X.InterfaceC77595Ucp
    public void B4(int i, int i2, int i3, C77518Uba c77518Uba) {
    }

    @Override // X.InterfaceC77595Ucp
    public final void LJII() {
    }

    @Override // X.InterfaceC77595Ucp
    public final void LJIJ() {
    }

    @Override // X.InterfaceC77595Ucp
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC77595Ucp
    public void j7(Diamond diamond, C77612Ud6 c77612Ud6) {
    }

    @Override // X.InterfaceC77595Ucp
    public final void l4(NoticesResult.Notice notice) {
    }

    @Override // X.InterfaceC77595Ucp
    public final void s8(int i, long j) {
    }

    public final C38048EwW LIZ() {
        C38048EwW c38048EwW = this.LJLJI;
        if (c38048EwW != null) {
            return c38048EwW;
        }
        o.LJIJI("jsMsg");
        throw null;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = this.LJLJJI;
        if (jSONObject != null) {
            return jSONObject;
        }
        o.LJIJI("jsResult");
        throw null;
    }

    public C77579UcZ(Context context, C38049EwX jsBridge) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(jsBridge, "jsBridge");
        this.LJLIL = context;
        this.LJLILLLLZI = jsBridge;
        this.LJLJJL = new HashMap<>();
    }

    @Override // X.InterfaceC38012Evw
    public void call(C38048EwW msg, JSONObject res) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(res, "res");
        this.LJLJI = msg;
        this.LJLJJI = res;
        JSONObject jSONObject = LIZ().LIZLLL;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("args")) == null || (optJSONObject2 = optJSONObject.optJSONObject("event_params")) == null) {
            return;
        }
        Iterator<String> keys = optJSONObject2.keys();
        o.LJIIIIZZ(keys, "eventParams.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = optJSONObject2.get(key);
            HashMap<String, String> hashMap = this.LJLJJL;
            o.LJIIIIZZ(key, "key");
            hashMap.put(key, obj.toString());
        }
    }
}
