package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CW6 {
    public final String LIZ;
    public final long LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final String LJ;
    public final String LJFF;
    public long LJI;
    public CW9 LJII;
    public String LJIIIIZZ;
    public CW8 LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;

    public final void LIZ() {
        Object obj;
        if (this.LJI > 0) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_ingame_overlay_duration");
            LIZ.LJIJJ(this.LIZ, "anchor_id");
            LIZ.LJIJJ(Long.valueOf(this.LIZIZ), "room_id");
            LIZ.LJIJJ(this.LJ, "live_type");
            LIZ.LJIJJ(this.LJFF, "overlay_type");
            LIZ.LJIJJ(this.LJII.getDescribe(), "overlay_status");
            I9A.LIZ(System.currentTimeMillis(), this.LJI, LIZ, "duration");
            if (this.LJII == CW9.UNFOLDED) {
                LIZ.LJIJJ(this.LJIIIIZZ, "tab_name");
                CW8 cw8 = this.LJIIIZ;
                if (cw8 != null) {
                    obj = cw8.getDescribe();
                } else {
                    obj = null;
                }
                LIZ.LJIJJ(obj, "size_type");
                LIZ.LJIJJ(Integer.valueOf(this.LJIIJJI), "size_height");
                LIZ.LJIJJ(Integer.valueOf(this.LJIIJ), "size_width");
                LIZ.LJIJJ(Integer.valueOf(this.LJIILJJIL ? 1 : 0), "if_memory_size");
                float f = this.LIZJ * this.LIZLLL;
                if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                    LIZ.LJIL("occupy_pct", Float.valueOf((this.LJIIJJI * this.LJIIJ) / f));
                }
            }
            LIZ.LJJIIJZLJL();
        }
        this.LJI = System.currentTimeMillis();
    }

    public final void LIZIZ(CW9 overlayStatus) {
        o.LJIIIZ(overlayStatus, "overlayStatus");
        CW9 cw9 = this.LJII;
        if (overlayStatus == cw9) {
            return;
        }
        CW9 cw92 = CW9.HIDDEN;
        if (cw9 != cw92) {
            LIZ();
            if (overlayStatus != cw92) {
                BZI LIZ = C28787BRn.LIZ("livesdk_live_ingame_overlay_switch");
                LIZ.LJIJJ(this.LIZ, "anchor_id");
                LIZ.LJIJJ(Long.valueOf(this.LIZIZ), "room_id");
                LIZ.LJIJJ("screen_share", "live_type");
                LIZ.LJIJJ(overlayStatus.getDescribe(), "overlay_status");
                LIZ.LJJIIJZLJL();
            }
        } else {
            this.LJI = System.currentTimeMillis();
        }
        this.LJII = overlayStatus;
    }

    public final void LIZJ(CW8 cw8, int i, int i2) {
        CW8 cw82;
        if (this.LJIIIZ != null && this.LJII == CW9.UNFOLDED) {
            LIZ();
        }
        if (this.LJIILJJIL && (cw82 = this.LJIIIZ) != null && cw8 != cw82) {
            this.LJIILJJIL = false;
        }
        this.LJIIIZ = cw8;
        this.LJIIJJI = i2;
        this.LJIIJ = i;
        if (this.LJIIL == 0 || this.LJIILIIL == 0) {
            this.LJIIL = i;
            this.LJIILIIL = i2;
        }
    }

    public CW6(long j, String anchorId, float f, float f2) {
        o.LJIIIZ(anchorId, "anchorId");
        this.LIZ = anchorId;
        this.LIZIZ = j;
        this.LIZJ = f;
        this.LIZLLL = f2;
        this.LJ = "screen_share";
        this.LJFF = "floating_bal";
        this.LJII = CW9.HIDDEN;
        this.LJIIIIZZ = "message";
        this.LJIILJJIL = true;
    }
}
