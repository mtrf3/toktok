package X;

import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.ISm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46648ISm {
    public int LIZ;
    public int LJII;
    public boolean LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public C46651ISp LJIIL;
    public List<C87748YcC> LJIILIIL;
    public List<C47462Ijy> LJIILJJIL;
    public JSONArray LJIILL;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public final int LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public int LJFF = -1;
    public float LJI = 1.0f;
    public final int LJIIIIZZ = -1;
    public final HashMap<String, Object> LJIILLIIL = new HashMap<>();
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public long LJIJI = -1;
    public int LJIL = -1;
    public int LJJ = -1;
    public ILN LJJIIZI = ILN.DEFAULT;

    public final String toString() {
        return "VideoPlayStopInfo(isSuccess=" + this.LIZ + ", errorCode=" + this.LIZIZ + ", playDuration=" + this.LIZJ + ", curCacheSize=" + this.LIZLLL + ", waitDuration=" + this.LJ + ", isSuperResolution=" + this.LJFF + ", srFailReason=" + this.LJII + ", traffic_economy_mode=" + this.LJIIIIZZ + ", buffering=" + this.LJIIIZ + ", networkLibType=" + ((Object) this.LJIIJ) + ", playSess=" + ((Object) this.LJIIJJI) + ", metricsInfo=" + this.LJIIL + ", requests=" + this.LJIILIIL + ", downloadInfos=" + this.LJIILJJIL + ", customMap=" + this.LJIILLIIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        for (Object obj : hashMap.keySet()) {
            Object obj2 = hashMap.get(obj);
            if (obj2 != null) {
                this.LJIILLIIL.put(obj, obj2);
            }
        }
    }
}
