package X;

import android.content.Intent;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OTv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61971OTv implements InterfaceC27436Apk {
    public final /* synthetic */ InterfaceC36488ETs LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C61971OTv(InterfaceC36488ETs interfaceC36488ETs, String str) {
        this.LJLIL = interfaceC36488ETs;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC27436Apk
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 10000) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "access_token");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "access_token_secret");
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = "";
            }
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "code");
            if (LLJJIJIIJIL3 == null) {
                LLJJIJIIJIL3 = "";
            }
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, "platform_id");
            if (LLJJIJIIJIL4 == null) {
                LLJJIJIIJIL4 = "";
            }
            if (o.LJ(LLJJIJIIJIL, "") && o.LJ(LLJJIJIIJIL2, "") && o.LJ(LLJJIJIIJIL3, "")) {
                InterfaceC36488ETs interfaceC36488ETs = this.LJLIL;
                if (interfaceC36488ETs != null) {
                    interfaceC36488ETs.LIZ(0, "");
                }
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (o.LJ("line", this.LJLILLLLZI)) {
                    jSONObject.put("access_token", android.net.Uri.encode(LLJJIJIIJIL));
                    jSONObject.put("access_token_secret", android.net.Uri.encode(LLJJIJIIJIL2));
                    jSONObject.put("code", android.net.Uri.encode(LLJJIJIIJIL3));
                } else {
                    jSONObject.put("access_token", LLJJIJIIJIL);
                    jSONObject.put("access_token_secret", LLJJIJIIJIL2);
                    jSONObject.put("code", LLJJIJIIJIL3);
                }
                jSONObject.put("platform", this.LJLILLLLZI);
                jSONObject.put("platform_app_id", LLJJIJIIJIL4);
                InterfaceC36488ETs interfaceC36488ETs2 = this.LJLIL;
                if (interfaceC36488ETs2 != null) {
                    interfaceC36488ETs2.onSuccess(jSONObject);
                }
            } catch (JSONException unused) {
                InterfaceC36488ETs interfaceC36488ETs3 = this.LJLIL;
                if (interfaceC36488ETs3 != null) {
                    interfaceC36488ETs3.LIZ(0, "failed");
                }
                return true;
            }
        } else {
            InterfaceC36488ETs interfaceC36488ETs4 = this.LJLIL;
            if (interfaceC36488ETs4 != null) {
                interfaceC36488ETs4.LIZ(0, "");
            }
        }
        return true;
    }
}
