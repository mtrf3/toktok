package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0eg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12700eg {
    public final String LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJ;

    public final boolean LIZ() {
        if (this.LIZLLL <= 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
        if (currentTimeMillis > 0) {
            this.LIZJ += currentTimeMillis;
        }
        this.LIZLLL = 0L;
        return true;
    }

    public final void LIZIZ(int i) {
        String str;
        boolean LIZ = LIZ();
        if (this.LIZJ <= 0) {
            return;
        }
        if (!LIZ) {
            str = "disconnect";
            i = this.LJ;
        } else {
            str = "no_stream";
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_dual_device_apply_duration");
        LIZ2.LJIJJ(this.LIZ, "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(this.LIZIZ), "room_id");
        LIZ2.LJIJJ(str, "end_reason");
        LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
        C30869C9p.LIZ(this.LIZJ, LIZ2, "duration");
        this.LIZJ = -1L;
    }

    public C12700eg(String anchorId, long j) {
        o.LJIIIZ(anchorId, "anchorId");
        this.LIZ = anchorId;
        this.LIZIZ = j;
    }
}
