package X;

import android.app.NotificationChannel;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QS9 {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.LIZJ);
        jSONObject.put("name", this.LIZLLL);
        jSONObject.put("importance", this.LJ);
        jSONObject.put("bypassDnd", this.LJFF);
        jSONObject.put("lockscreenVisibility", this.LJI);
        jSONObject.put("lights", this.LJII);
        jSONObject.put("vibration", this.LJIIIIZZ);
        jSONObject.put("showBadge", this.LJIIIZ);
        jSONObject.put("enable", this.LIZIZ);
        jSONObject.put("desc", this.LIZ);
        return jSONObject;
    }

    public QS9(JSONObject jSONObject) {
        this.LIZIZ = true;
        this.LIZJ = jSONObject.optString("id");
        this.LIZLLL = jSONObject.optString("name");
        this.LJ = jSONObject.optInt("importance", 3);
        this.LJFF = jSONObject.optBoolean("bypassDnd", true);
        this.LJI = jSONObject.optInt("lockscreenVisibility", -1);
        this.LJII = jSONObject.optBoolean("lights", true);
        this.LJIIIIZZ = jSONObject.optBoolean("vibration", true);
        this.LJIIIZ = jSONObject.optBoolean("showBadge", true);
        this.LIZIZ = jSONObject.optBoolean("enable", true);
        this.LIZ = jSONObject.optString("desc");
    }

    public QS9(NotificationChannel notificationChannel) {
        this.LIZIZ = true;
        this.LIZJ = notificationChannel.getId();
        this.LIZLLL = String.valueOf(notificationChannel.getName());
        this.LJ = notificationChannel.getImportance();
        this.LJFF = notificationChannel.canBypassDnd();
        this.LJI = notificationChannel.getLockscreenVisibility();
        this.LJII = notificationChannel.shouldShowLights();
        this.LJIIIIZZ = notificationChannel.shouldVibrate();
        this.LJIIIZ = notificationChannel.canShowBadge();
        this.LIZ = notificationChannel.getDescription();
    }
}
