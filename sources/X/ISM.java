package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class ISM {
    public long LJIIL;
    public long LJIILIIL;
    public int LJIILJJIL;
    public long LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LIZLLL = -1;
    public int LJ = 2;
    public String LJFF = "";
    public String LJI = "";
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -3;
    public int LJIIJ = -1;
    public String LJIIJJI = "";
    public final HashMap<String, Object> LJIJI = new HashMap<>();
    public ILN LJIJJ = ILN.DEFAULT;

    public final String toString() {
        return "VideoPlayStartInfo(appVersion=" + ((Object) this.LIZJ) + ", appId=" + ((Object) this.LIZ) + ", videoDuration=" + this.LIZLLL + ", group_id=" + ((Object) this.LIZIZ) + ", preloader_type=" + this.LJ + ", play_sess=" + ((Object) this.LJFF) + ", access=" + ((Object) this.LJI) + ", isHitCache=" + this.LJII + ",isCacheCompleted=" + this.LJIIIIZZ + ", preCacheSize=" + this.LJIIIZ + ", customMap=" + this.LJIJI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        for (Object obj : hashMap.keySet()) {
            Object obj2 = hashMap.get(obj);
            if (obj2 != null) {
                this.LJIJI.put(obj, obj2);
            }
        }
    }
}
