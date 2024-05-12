package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IOw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46554IOw {
    public String LJII;
    public String LJIIIIZZ;
    public Double LJIIJ;
    public Double LJIIJJI;
    public int LIZ = -1;
    public int LIZIZ = -1;
    public long LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public final int LJFF = -1;
    public boolean LJI = true;
    public Integer LJIIIZ = -1;
    public final Boolean LJIIL = Boolean.FALSE;
    public final HashMap<String, Object> LJIILIIL = new HashMap<>();

    public final String toString() {
        return "VideoBlockInfo(is_net_block=" + this.LJI + ", position=" + this.LIZJ + ", internetSpeed=" + this.LJ + ", is_cache=" + this.LIZ + ", drop_cnt=" + this.LIZIZ + ", traffic_economy_mode=" + this.LJFF + ", play_sess=" + ((Object) this.LJII) + ", video_size=null, player_type=" + ((Object) this.LJIIIIZZ) + ", request_info=null, is_battery_saver=null, video_cache_read_time=" + this.LJIIJ + ", video_cache_read_size=" + this.LJIIJJI + ", video_cache_read_cnt=" + this.LJIIIZ + ", video_cache_use_ttnet=" + this.LJIIL + ", customMap=" + this.LJIILIIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        for (Object obj : hashMap.keySet()) {
            Object obj2 = hashMap.get(obj);
            if (obj2 != null) {
                this.LJIILIIL.put(obj, obj2);
            }
        }
    }

    public final void LIZ(Object obj, String key) {
        o.LJIIIZ(key, "key");
        if (obj == null) {
            return;
        }
        this.LJIILIIL.put(key, obj);
    }
}
