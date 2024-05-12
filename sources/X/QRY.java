package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QRY implements Runnable {
    public final Context LJLIL;
    public final InterfaceC66984QQq LJLILLLLZI;
    public final boolean LJLJI;

    public final void LIZ() {
        String str;
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) PT6.LIZ(this.LJLIL, LocalFrequencySettings.class);
        int LIZJ = C36929EeT.LIZJ(this.LJLIL);
        java.util.Map<String, String> LIZ = ((QRM) this.LJLILLLLZI).LIZ();
        if (this.LJLJI) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        HashMap hashMap = (HashMap) LIZ;
        hashMap.put("notice", str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZJ);
        LIZ2.append("");
        hashMap.put("system_notify_status", X1D.LIZIZ(LIZ2));
        String LIZIZ = C36929EeT.LIZIZ(C73312Spw.LJFF("/service/1/app_notice_status/"), LIZ);
        try {
            JSONArray LIZIZ2 = C67013QRt.LIZ.LIZIZ(this.LJLIL);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("out_app_channel_notify", LIZIZ2.toString()));
            String LIZJ2 = AbstractC66805QJt.LIZ.LIZJ(LIZIZ, arrayList);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("sendPushEnableToServer response = ");
            LIZ3.append(LIZJ2);
            X1D.LIZIZ(LIZ3);
            if (!TextUtils.isEmpty(LIZJ2)) {
                if ("success".equals(new JSONObject(LIZJ2).optString("message"))) {
                    localFrequencySettings.LJIIL(true);
                    localFrequencySettings.LJJIJL(LIZJ);
                    localFrequencySettings.LJIIIZ(LIZIZ2.toString());
                    localFrequencySettings.LJ(System.currentTimeMillis());
                    QRM.LJFF().LJIIL();
                    return;
                }
                ((QRM) this.LJLILLLLZI).LIZIZ().LIZIZ(302, LIZJ2);
            } else {
                ((QRM) this.LJLILLLLZI).LIZIZ().LIZIZ(304, LIZJ2);
            }
            localFrequencySettings.LJIIL(false);
        } catch (Exception e) {
            localFrequencySettings.LJIIL(false);
            QRM.LJFF().LIZIZ(301, android.util.Log.getStackTraceString(e));
            C16880lQ.LLLLIIL(e);
            if (e instanceof IOException) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("network error : ");
                LIZ4.append(e.getMessage());
                X1D.LIZIZ(LIZ4);
                return;
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("unknown error: ");
            LIZ5.append(e.getMessage());
            X1D.LIZIZ(LIZ5);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public QRY(Context context, InterfaceC66984QQq interfaceC66984QQq, boolean z) {
        this.LJLIL = context;
        this.LJLILLLLZI = interfaceC66984QQq;
        this.LJLJI = z;
    }
}
