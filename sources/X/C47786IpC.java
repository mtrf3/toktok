package X;

import android.content.Context;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IpC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47786IpC {
    public final Context LIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public final ArrayList<String> LIZIZ = new ArrayList<>();
    public final C47868IqW LJ = new C47868IqW(this);

    public final void LIZ() {
        int i;
        if (!this.LIZLLL || this.LIZIZ.size() > 100) {
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            i = Settings.System.getInt(this.LIZ.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            i = 0;
        }
        hashMap.put("b", Float.valueOf((i * 1.0f) / 255.0f));
        hashMap.put("t", Long.valueOf(System.currentTimeMillis()));
        C77117UOj.LIZJ(new JSONObject(hashMap).toString(), this.LIZIZ);
    }

    public C47786IpC(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }
}
