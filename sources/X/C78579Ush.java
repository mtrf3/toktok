package X;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ush, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78579Ush implements BQ7 {
    public static int LJII = -1;
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public int LJI;

    public C78579Ush() {
        this(false);
    }

    public final HashMap<String, Object> LIZJ() {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.LJFF) {
            hashMap.put("live_end_successful", CardStruct.IStatusCode.DEFAULT);
        } else {
            hashMap.put("live_end_successful", "1");
        }
        hashMap.put("end_reason", String.valueOf(this.LJI));
        return hashMap;
    }

    public C78579Ush(boolean z) {
        this.LJFF = true;
        this.LJI = -1;
        C78583Usl LJI = C78583Usl.LJI();
        C78580Usi c78580Usi = new C78580Usi();
        synchronized (LJI) {
            C78583Usl.LJII = c78580Usi;
        }
        if (z) {
            return;
        }
        try {
            this.LIZLLL = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).S40().get();
            this.LJ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).s40().LIZ(null);
            if (this.LIZLLL == null) {
                ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).S40().LIZ(new InterfaceC31146CKg() { // from class: X.Usj
                    @Override // X.InterfaceC31146CKg
                    public final void LIZ(String str) {
                        C78579Ush.this.LIZLLL = str;
                    }
                });
            }
        } catch (Throwable th) {
            C0NB.LJI("LivePlayerLog", th);
        }
    }

    public static String LIZIZ(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C16880lQ.LLILL(context, "phone");
            C39405FdJ.LJFF.getClass();
            return C39571Ffz.LIZJ(telephonyManager);
        } catch (Exception unused) {
            return "unkown";
        }
    }

    public static int LIZLLL(Context context) {
        try {
            int i = LJII;
            if (i > 0) {
                return i;
            }
            Bundle bundle = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle != null) {
                LJII = bundle.getInt("UPDATE_VERSION_CODE");
            }
            return LJII;
        } catch (Exception e) {
            C0NB.LJI("LivePlayerLog", e);
            return LJII;
        }
    }

    public static void LJ(int i, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(WM7.SCENE_SERVICE, i);
            jSONObject2.put("error_msg", th.getMessage());
        } catch (JSONException unused) {
        }
        C0K2.LJI("ttlive_stream_upload_error", jSONObject, jSONObject2, new JSONObject());
    }

    @Override // X.BQ7
    public final void LIZ(String str, JSONObject jSONObject) {
        C78583Usl.LJI().LIZ(new CallableC78572Usa(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, jSONObject, str, LIZJ()));
    }
}
