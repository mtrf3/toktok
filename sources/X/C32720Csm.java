package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Csm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32720Csm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(long j, int i, int i2, long j2) {
        String str;
        BZI LIZ2 = C28787BRn.LIZ("gift_longpress");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(j2), "anchor_id");
        LIZ2.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ2.LJIJJ(Integer.valueOf(i), "gift_position");
        LIZ2.LJIJJ(Integer.valueOf(i2 + 1), "actual_gift_position");
        if (C88137YiT.LIZ.LIZ) {
            str = "first_screen";
        } else {
            str = "other_screen";
        }
        C06490Nh.LIZLLL(LIZ2, str, "is_first_screen", CardStruct.IStatusCode.DEFAULT, "can_group_send");
    }
}
