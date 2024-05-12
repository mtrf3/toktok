package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7I {
    public static volatile O7I LJIIL;
    public volatile List<O7E> LIZ;
    public volatile List<O7E> LIZIZ;
    public long LJI;
    public volatile boolean LJIIIIZZ;
    public volatile C48473J0r LJIIIZ;
    public long LIZJ = 1800000;
    public long LIZLLL = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    public volatile long LJ = -1;
    public volatile long LJFF = -1;
    public final String LJII = "";
    public String LJIIJJI = "{}";
    public final List<String> LJIIJ = new ArrayList();

    public static O7I LIZIZ() {
        if (LJIIL == null) {
            synchronized (O7I.class) {
                if (LJIIL == null) {
                    LJIIL = new O7I();
                }
            }
        }
        return LJIIL;
    }

    public final String LIZJ() {
        if (!TextUtils.isEmpty(this.LJII) && !this.LJIIIIZZ) {
            synchronized (this) {
                if (!this.LJIIIIZZ) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.LJIIJJI);
                        jSONObject.put("vid", this.LJII);
                        this.LJIIJJI = jSONObject.toString();
                        this.LJIIIIZZ = true;
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        return this.LJIIJJI;
    }

    public final void LIZ(int i, long j) {
        if (C61359O6h.LJII().LJIILJJIL) {
            List<String> list = this.LJIIJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(j);
            LIZ.append(":");
            LIZ.append(i);
            ((ArrayList) list).add(X1D.LIZIZ(LIZ));
        }
    }
}
