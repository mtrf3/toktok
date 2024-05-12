package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGCThreadOptSetting;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BPl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28733BPl extends C0NE {
    public static C28733BPl LIZIZ;
    public final AtomicReference<OSZ<Long, JSONObject>> LIZ = new AtomicReference<>();

    public static synchronized C28733BPl LJIILIIL() {
        C28733BPl c28733BPl;
        synchronized (C28733BPl.class) {
            if (LIZIZ == null) {
                LIZIZ = new C28733BPl();
            }
            c28733BPl = LIZIZ;
        }
        return c28733BPl;
    }

    @Override // X.C0NE
    public final JSONObject LJI() {
        long j;
        BJE bje;
        Long l;
        OSZ<Long, JSONObject> osz;
        long LJIILJJIL = BJM.LJIILJJIL();
        if (LiveGCThreadOptSetting.enableAppLogOpt() && (osz = this.LIZ.get()) != null && osz.getFirst().longValue() == LJIILJJIL) {
            return osz.getSecond();
        }
        JSONObject jSONObject = new JSONObject();
        String valueOf = String.valueOf(BJM.LJIILJJIL());
        String valueOf2 = String.valueOf(BJM.LJ());
        C28246B6s LJIJI = BJM.LJIJI();
        if (LJIJI != null && (bje = LJIJI.LJ) != null && (l = bje.LJFF) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        try {
            jSONObject.put("user_id", String.valueOf(j));
            jSONObject.put("room_id", valueOf);
            jSONObject.put("anchor_id", valueOf2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (LiveGCThreadOptSetting.enableAppLogOpt()) {
            this.LIZ.set(new OSZ<>(Long.valueOf(LJIILJJIL), jSONObject));
        }
        return jSONObject;
    }
}
