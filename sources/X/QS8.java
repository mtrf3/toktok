package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push.settings.LocalFrequencySettings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QS8 extends C66997QRd {
    public List<NotificationChannel> LIZIZ;

    @Override // X.C66997QRd, X.QS0
    public final JSONArray LIZIZ(Context context) {
        List<NotificationChannel> LJ = LJ(context);
        JSONArray jSONArray = new JSONArray();
        if (LJ != null) {
            Iterator<NotificationChannel> it = LJ.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(new QS9(it.next()).LIZ());
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return jSONArray;
    }

    public final List<NotificationChannel> LJ(Context context) {
        List<NotificationChannel> list = this.LIZIZ;
        if (list == null || list.isEmpty()) {
            try {
                this.LIZIZ = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
            } catch (Throwable unused) {
                this.LIZIZ = Collections.emptyList();
            }
        }
        return this.LIZIZ;
    }

    public static boolean LJFF(List<NotificationChannel> list, java.util.Map<String, QS9> map) {
        if (list.size() != map.size()) {
            return false;
        }
        for (NotificationChannel notificationChannel : list) {
            QS9 qs9 = map.get(notificationChannel.getId());
            if (qs9 == null || qs9.LJ != notificationChannel.getImportance() || qs9.LJI != notificationChannel.getLockscreenVisibility() || qs9.LJFF != notificationChannel.canBypassDnd() || qs9.LJII != notificationChannel.shouldShowLights() || qs9.LJIIIIZZ != notificationChannel.shouldVibrate()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C66997QRd, X.QS0
    public final void LIZ(Context context, QS9 qs9) {
        if (this.LIZ == null) {
            this.LIZ = (NotificationManager) C16880lQ.LLILL(context, "notification");
        }
        NotificationManager notificationManager = this.LIZ;
        if (notificationManager == null || TextUtils.isEmpty(qs9.LIZJ) || notificationManager.getNotificationChannel(qs9.LIZJ) == null) {
            return;
        }
        notificationManager.deleteNotificationChannel(qs9.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    @Override // X.C66997QRd, X.QS0
    public final boolean LIZJ(int i, Context context) {
        List<NotificationChannel> LJ;
        String LJJI;
        ?? hashMap;
        if (super.LIZJ(i, context)) {
            return true;
        }
        try {
            LJ = LJ(context);
            LJJI = ((LocalFrequencySettings) PT6.LIZ(context, LocalFrequencySettings.class)).LJJI();
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (TextUtils.isEmpty(LJJI)) {
            if (LJ != null && !LJ.isEmpty()) {
                return true;
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray(LJJI);
        if (jSONArray.length() == 0) {
            hashMap = Collections.emptyMap();
        } else {
            hashMap = new HashMap(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                hashMap.put(optJSONObject.optString("id"), new QS9(optJSONObject));
            }
        }
        return true ^ LJFF(LJ, hashMap);
    }

    @Override // X.C66997QRd, X.QS0
    public final void LIZLLL(Context context, QS9 qs9) {
        if (this.LIZ == null) {
            this.LIZ = (NotificationManager) C16880lQ.LLILL(context, "notification");
        }
        NotificationManager notificationManager = this.LIZ;
        if (notificationManager == null || TextUtils.isEmpty(qs9.LIZJ) || TextUtils.isEmpty(qs9.LIZLLL) || notificationManager.getNotificationChannel(qs9.LIZJ) != null) {
            return;
        }
        int i = qs9.LJ;
        if (i < 0 || i > 5) {
            i = 3;
        }
        NotificationChannel notificationChannel = new NotificationChannel(qs9.LIZJ, qs9.LIZLLL, i);
        notificationChannel.setShowBadge(qs9.LJIIIZ);
        notificationChannel.setDescription(qs9.LIZ);
        notificationChannel.enableVibration(qs9.LJIIIIZZ);
        notificationChannel.setBypassDnd(qs9.LJFF);
        notificationChannel.enableLights(qs9.LJII);
        notificationChannel.setLockscreenVisibility(qs9.LJI);
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
