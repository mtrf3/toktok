package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.HashMap;

/* renamed from: X.Tgg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75286Tgg {
    public final LiveEffect LIZ;
    public final boolean LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public C73411SrX LJ;

    public static boolean LIZ() {
        if (C59994Ngc.LIZJ() == EnumC74778TWk.GRID_FIX) {
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        if (this.LIZLLL <= 0 && C78886Uxe.LJJJJZI(C8E.LJ()) >= 1) {
            this.LIZLLL = System.currentTimeMillis();
            LiveEffect liveEffect = this.LIZ;
            boolean z = this.LIZIZ;
            HashMap hashMap = new HashMap();
            C75285Tgf.LIZJ(hashMap);
            C75285Tgf.LIZIZ = C74824TYe.LJIIJ();
            C75285Tgf.LIZIZ(hashMap, null);
            C75285Tgf.LIZ(liveEffect, hashMap);
            hashMap.put("is_default", String.valueOf(z ? 1 : 0));
            C75285Tgf.LJFF("livesdk_anchor_shared_background_select_onstage", hashMap);
        }
    }

    public final void LIZJ() {
        if (this.LIZJ > 0) {
            LiveEffect liveEffect = this.LIZ;
            boolean z = this.LIZIZ;
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.LIZJ);
            HashMap hashMap = new HashMap();
            C75285Tgf.LIZJ(hashMap);
            C75285Tgf.LIZIZ(hashMap, C75285Tgf.LIZ);
            C75285Tgf.LIZ(liveEffect, hashMap);
            hashMap.put("is_default", String.valueOf(z ? 1 : 0));
            hashMap.put("use_time", String.valueOf(currentTimeMillis));
            C75285Tgf.LJFF("livesdk_anchor_shared_background_use_time", hashMap);
            this.LIZJ = 0L;
            C73411SrX c73411SrX = this.LJ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
        LIZLLL();
    }

    public final void LIZLLL() {
        if (this.LIZLLL > 0) {
            LiveEffect liveEffect = this.LIZ;
            boolean z = this.LIZIZ;
            int currentTimeMillis = (int) (System.currentTimeMillis() - this.LIZLLL);
            HashMap hashMap = new HashMap();
            C75285Tgf.LIZJ(hashMap);
            C75285Tgf.LIZIZ(hashMap, C75285Tgf.LIZIZ);
            C75285Tgf.LIZ(liveEffect, hashMap);
            hashMap.put("is_default", String.valueOf(z ? 1 : 0));
            hashMap.put("use_time", String.valueOf(currentTimeMillis));
            C75285Tgf.LJFF("livesdk_anchor_shared_background_use_time_onstage", hashMap);
            this.LIZLLL = 0L;
        }
    }

    public C75286Tgg(LiveEffect liveEffect, boolean z) {
        this.LIZ = liveEffect;
        this.LIZIZ = z;
    }
}
