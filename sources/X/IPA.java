package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IPA {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public java.util.Map<String, ? extends Object> LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public int LJIILLIIL;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;
    public long LJIIJJI = -1;
    public final HashMap<String, Object> LJIILL = new HashMap<>();

    public final String toString() {
        return "VideoPlayFailInfo(error_code=" + ((Object) this.LIZ) + ", error_internal_code=" + ((Object) this.LIZIZ) + ", error_info=" + ((Object) this.LIZJ) + ", group_id=" + ((Object) this.LJ) + ", video_id=" + ((Object) this.LJFF) + ", is_bytevc1=" + ((Object) this.LJI) + ", is_dash=" + ((Object) this.LJII) + ", is_ad=null, internet_speed=" + ((Object) this.LJIIIIZZ) + ", cache_size=" + this.LJIIIZ + ", video_size=" + this.LJIIJ + ", video_duration=" + this.LJIIJJI + ", play_url=" + ((Object) this.LJIIL) + ", player_type=" + ((Object) this.LJIILIIL) + ", is_from_feed_cache=null, play_sess=" + ((Object) this.LJIILJJIL) + ", traffic_economy_mode=null, customMap=" + this.LJIILL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        for (Object obj : hashMap.keySet()) {
            Object obj2 = hashMap.get(obj);
            if (obj2 != null) {
                this.LJIILL.put(obj, obj2);
            }
        }
    }

    public final void LIZ(Object obj, String key) {
        o.LJIIIZ(key, "key");
        if (obj == null) {
            return;
        }
        this.LJIILL.put(key, obj);
    }
}
