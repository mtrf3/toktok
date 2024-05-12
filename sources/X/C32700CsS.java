package X;

import android.util.LongSparseArray;
import kotlin.jvm.internal.o;

/* renamed from: X.CsS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32700CsS {
    public static final /* synthetic */ int LJ = 0;
    public long LIZ;
    public long LIZIZ;
    public final LongSparseArray<Long> LIZJ = new LongSparseArray<>();
    public int LIZLLL;

    public final void LIZLLL() {
        String str;
        if (this.LIZ == 0) {
            return;
        }
        long LIZ = C30725C4b.LIZ() - this.LIZIZ;
        BZI LIZ2 = C28787BRn.LIZ("gift_dynamic_preview_success");
        LIZ2.LJIJJ(Long.valueOf(LIZ), "zip_show_duration");
        LIZ2.LJIJJ(Long.valueOf(this.LIZ), "gift_id");
        if (C88133YiP.LIZ.LIZ) {
            str = "call";
        } else {
            str = "click";
        }
        C1FL.LJI(LIZ2, str, "show_type");
        this.LIZ = 0L;
    }

    public final void LIZJ(long j) {
        String str;
        long LIZ = C30725C4b.LIZ();
        Long last = this.LIZJ.get(j, Long.valueOf(LIZ));
        o.LJIIIIZZ(last, "last");
        long longValue = LIZ - last.longValue();
        BZI LIZ2 = C28787BRn.LIZ("gift_zip_load_time");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIJJ(Long.valueOf(longValue), "zip_load_time");
        if (C88133YiP.LIZ.LIZ) {
            str = "call";
        } else {
            str = "click";
        }
        C06490Nh.LIZLLL(LIZ2, str, "show_type", "-1", "is_zip_local");
    }

    public static void LIZIZ(long j, String str) {
        String str2;
        BZI LIZ = C28787BRn.LIZ("gift_dynamic_preview_fail");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(j), "gift_id");
        if (C88133YiP.LIZ.LIZ) {
            str2 = "call";
        } else {
            str2 = "click";
        }
        C06490Nh.LIZLLL(LIZ, str2, "show_type", str, "error_code");
    }

    public final void LIZ(int i, long j) {
        this.LIZJ.put(j, Long.valueOf(C30725C4b.LIZ()));
        this.LIZ = j;
        this.LIZIZ = C30725C4b.LIZ();
        this.LIZLLL = i;
    }
}
