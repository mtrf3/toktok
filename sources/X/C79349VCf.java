package X;

import android.util.ArrayMap;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.VCf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79349VCf {
    public java.util.Map<String, VD6> LIZLLL;
    public List<String> LIZ = new ArrayList();
    public final java.util.Map<String, Integer> LIZIZ = new ArrayMap();
    public final java.util.Map<String, JSONObject> LIZJ = new ArrayMap();
    public long LJ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
    public int LJFF = 50;

    public final void LIZ() {
        java.util.Map<String, VD6> map = this.LIZLLL;
        if (map == null || ((ArrayMap) map).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayMap) this.LIZLLL).entrySet().iterator();
        while (it.hasNext()) {
            VD6 vd6 = (VD6) ((Map.Entry) it.next()).getValue();
            if (vd6 != null) {
                long j = vd6.LIZIZ;
                if (j > 0 && System.currentTimeMillis() - j > this.LJ) {
                    it.remove();
                }
            }
        }
    }
}
