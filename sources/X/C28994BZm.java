package X;

/* renamed from: X.BZm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28994BZm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_detail_page_entrance_show");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIJJ(C32257ClJ.LJ(), "user_id");
        if (C32257ClJ.LJI()) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ2.LJIJJ(str, "user_type");
        LIZ2.LJJIIJZLJL();
    }
}
