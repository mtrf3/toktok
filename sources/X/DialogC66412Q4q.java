package X;

import Y.ARunnableS12S0101000_8;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.internal.WebDialog;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q4q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogC66412Q4q extends WebDialog {
    public static final /* synthetic */ int LJLLLL = 0;
    public boolean LJLLL;

    @Override // com.facebook.internal.WebDialog, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        OK2 ok2 = this.LJLJJI;
        if (!this.LJLLI || this.LJLJLLL || ok2 == null || !ok2.isShown()) {
            super.cancel();
        } else {
            if (this.LJLLL) {
                return;
            }
            this.LJLLL = true;
            C16880lQ.LLZZ(ok2, o.LJIILLIIL("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS12S0101000_8(1, this, 26), 1500L);
        }
    }

    public static void LJI(DialogC66412Q4q this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.WebDialog
    public final Bundle LIZJ(String str) {
        Bundle LJJI = C66373Q3d.LJJI(android.net.Uri.parse(str).getQuery());
        String string = LJJI.getString("bridge_args");
        LJJI.remove("bridge_args");
        if (!C66373Q3d.LJIJJ(string)) {
            try {
                LJJI.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", C66601QBx.LIZ(new JSONObject(string)));
            } catch (JSONException unused) {
            }
        }
        String string2 = LJJI.getString("method_results");
        LJJI.remove("method_results");
        if (!C66373Q3d.LJIJJ(string2)) {
            try {
                LJJI.putBundle("com.facebook.platform.protocol.RESULT_ARGS", C66601QBx.LIZ(new JSONObject(string2)));
            } catch (JSONException unused2) {
            }
        }
        LJJI.remove("version");
        LJJI.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", Q5A.LJIIL());
        return LJJI;
    }

    public DialogC66412Q4q(ActivityC45651qj activityC45651qj, String str, String str2) {
        super(activityC45651qj, str);
        this.LJLILLLLZI = str2;
    }
}
