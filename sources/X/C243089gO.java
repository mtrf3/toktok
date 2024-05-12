package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9gO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243089gO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(boolean z, String str) {
        C188727au LIZJ = C78920UyC.LIZJ(z ? 1 : 0, "result");
        LIZJ.LJIIIZ("reason", str);
        FMX.LJIIL("homepage_rec_card_state_update", LIZJ.LIZ);
    }

    public static /* synthetic */ void LIZJ(Boolean bool, Boolean bool2, Boolean bool3, int i) {
        boolean z;
        Boolean bool4 = bool2;
        Boolean bool5 = bool;
        if ((i & 1) != 0) {
            bool5 = null;
        }
        if ((i & 4) != 0) {
            bool4 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        LIZIZ(bool5, null, bool4, z, null, null, null, null, bool3);
    }

    public static void LIZ(EnumC55691LtP enterFrom, int i, int i2, EnumC56185M3h reqResult, int i3, String ownerUid, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(reqResult, "reqResult");
        o.LJIIIZ(ownerUid, "ownerUid");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", enterFrom.getValue());
        c188727au.LIZLLL(i, "response_item_count");
        c188727au.LIZLLL(i2, "append_item_conut");
        c188727au.LJIIIZ("is_success", reqResult.getValue());
        c188727au.LIZLLL(i3, "pull_count");
        c188727au.LJIIIZ("owner_uid", ownerUid);
        c188727au.LJIIIZ("has_more", String.valueOf(z));
        FMX.LJIIL("follow_page_item_load", c188727au.LIZ);
    }

    public static void LIZLLL(long j, int i, int i2, long j2, long j3, long j4, long j5, int i3) {
        C188727au c188727au = new C188727au();
        c188727au.LJ(j, "max_muf");
        c188727au.LIZLLL(i, "max_followers");
        c188727au.LIZLLL(i2, "hide_count");
        c188727au.LJ(j2, "x_day");
        c188727au.LJ(j3, "y_hide");
        c188727au.LJ(j4, "muf_bound");
        c188727au.LJ(j5, "follower_bound");
        c188727au.LIZLLL(i3, "j_time");
        FMX.LJIIL("homepage_rec_card_cur_state", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.7au] */
    public static void LIZIZ(Boolean bool, Boolean bool2, Boolean bool3, boolean z, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8) {
        ?? r1;
        ?? r12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? c188727au = new C188727au();
        ?? r2 = -1;
        if (bool != null) {
            r1 = bool.booleanValue();
        } else {
            r1 = -1;
        }
        c188727au.LIZLLL(r1, "result");
        if (bool2 != null) {
            r12 = bool2.booleanValue();
        } else {
            r12 = -1;
        }
        c188727au.LIZLLL(r12, "data_ready");
        if (bool3 != null) {
            r13 = bool3.booleanValue();
        } else {
            r13 = -1;
        }
        c188727au.LIZLLL(r13, "in_hide_mode");
        c188727au.LIZLLL(z ? 1 : 0, "no_guide");
        if (bool4 != null) {
            r14 = bool4.booleanValue();
        } else {
            r14 = -1;
        }
        c188727au.LIZLLL(r14, "publish_criteria");
        if (bool5 != null) {
            r15 = bool5.booleanValue();
        } else {
            r15 = -1;
        }
        c188727au.LIZLLL(r15, "hide_time");
        if (bool6 != null) {
            r16 = bool6.booleanValue();
        } else {
            r16 = -1;
        }
        c188727au.LIZLLL(r16, "hide_count");
        if (bool7 != null) {
            r17 = bool7.booleanValue();
        } else {
            r17 = -1;
        }
        c188727au.LIZLLL(r17, "enter_time");
        if (bool8 != null) {
            r2 = bool8.booleanValue();
        }
        c188727au.LIZLLL(r2, "not_show");
        FMX.LJIIL("homepage_rec_card_auto_expand", c188727au.LIZ);
    }
}
