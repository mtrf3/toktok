package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BFa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28462BFa {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public long LIZLLL;
    public String LJ;

    public final void LIZ(boolean z) {
        if (this.LIZLLL == 0) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_live_gift_record_duration");
        LIZ.LJIJJ(this.LIZ, "anchor_id");
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJIJJ(Long.valueOf(this.LIZIZ), "room_id");
        LIZ.LJIJJ(this.LIZJ, "event_page");
        LIZ.LJIJJ(this.LJ, "enter_from");
        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_send_gift");
        LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() - this.LIZLLL) / 1000), "duration");
        LIZ.LJJIIJZLJL();
        this.LIZLLL = 0L;
    }

    public final void LIZIZ(String str, boolean z) {
        if (this.LIZLLL != 0) {
            return;
        }
        this.LIZLLL = System.currentTimeMillis();
        this.LJ = str;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_gift_record_show");
        LIZ.LJIJJ(this.LIZ, "anchor_id");
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJIJJ(Long.valueOf(this.LIZIZ), "room_id");
        LIZ.LJIJJ(this.LIZJ, "event_page");
        C0JT.LIZJ(LIZ, str, "enter_from", z ? 1 : 0, "is_send_gift");
    }

    public C28462BFa(String anchorId, long j, String str) {
        o.LJIIIZ(anchorId, "anchorId");
        this.LIZ = anchorId;
        this.LIZIZ = j;
        this.LIZJ = str;
    }
}
