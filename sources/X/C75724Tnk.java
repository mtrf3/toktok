package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tnk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75724Tnk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ() {
        int size = C8E.LIZLLL().LJIILJJIL().size();
        if (size <= 1) {
            C75877TqD.LJIILJJIL = "one_apply";
        } else {
            if (size != 2) {
                return;
            }
            C75877TqD.LJIILJJIL = "two_apply_two";
        }
    }

    public static void LIZ(long j) {
        boolean z;
        C75883TqJ LJI = C8E.LIZLLL().LJI(j);
        if (LJI == null) {
            C44878HjO.LIZJ("logConnectionAnchorTurnOverForApply, APPLY, rivalUserId=", j, "MultiCoHostMonitorHelper");
            return;
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (LJI.LJFF()) {
            z = true;
        } else {
            z = false;
        }
        if (z && B5G.LIZIZ().LJJJLL == EnumC75672Tmu.APPLY) {
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "is_invited_by_self", 1, true);
        } else {
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "is_invited_by_self", 0, true);
        }
        c75878TqE.LJIILLIIL("apply_linked");
    }

    public static void LIZIZ(long j) {
        boolean z;
        C75883TqJ LJI = C8E.LIZLLL().LJI(j);
        if (LJI == null) {
            C44878HjO.LIZJ("logConnectionAnchorTurnOverForApply, APPLY, rivalUserId=", j, "MultiCoHostMonitorHelper");
            return;
        }
        C75878TqE c75878TqE = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (LJI.LJFF()) {
            z = true;
        } else {
            z = false;
        }
        if (z && LJI.LJJIFFI) {
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "is_invited_by_self", 1, true);
        } else {
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "is_invited_by_self", 0, true);
        }
        c75878TqE.LJIILLIIL("invite_linked");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static void LIZLLL(boolean z, C75981Trt item, String str) {
        ?? r8;
        o.LJIIIZ(item, "item");
        long LJIIL = C44432HcC.LJIIL(item.LJLIL);
        if (C8E.LIZLLL().eU("MultiCoHostMonitorHelper") && LJIIL > 0) {
            r8 = 1;
        } else {
            r8 = 0;
        }
        if (z) {
            C75878TqE c75878TqE = new C75878TqE();
            long ownerUserId = item.LJLIL.getOwnerUserId();
            String source = C75545Tkr.LIZIZ(item.LJLJI);
            o.LJIIIZ(source, "source");
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(ownerUserId), true);
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "block_type", str, true);
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "source", source, true);
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "is_cross_arc_active", Integer.valueOf((int) r8), true);
            c75878TqE.LJIILLIIL("apply_request_block");
            return;
        }
        new C75878TqE().LJJJJZ(item.LJLIL.getOwnerUserId(), C75545Tkr.LIZIZ(item.LJLJI), str, r8);
    }

    public static void LIZJ(boolean z, int i, long j, CR6 cr6) {
        if (i <= 0 || cr6 == null) {
            return;
        }
        String str = "";
        String str2 = "in_match_process";
        if (z) {
            C75878TqE c75878TqE = new C75878TqE();
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZIZ, "block_type", Integer.valueOf(i), true);
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            if (i != 3) {
                if (i != 4) {
                    if (i != 8) {
                        if (i != 9) {
                            if (i == 17) {
                                str = "mic_room";
                            }
                        }
                        AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "block_type_string", str2, true);
                        c75878TqE.LJIILLIIL("apply_popup_block");
                        return;
                    }
                    str = "not_connected";
                } else {
                    str = "processing_invite";
                }
            } else {
                str = "multi_permmision_not_support";
            }
            str2 = str;
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "block_type_string", str2, true);
            c75878TqE.LJIILLIIL("apply_popup_block");
            return;
        }
        C75878TqE c75878TqE2 = new C75878TqE();
        AbstractC75865Tq1.LJIIIZ(c75878TqE2.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(c75878TqE2.LIZIZ, "block_type", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(c75878TqE2.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
        if (i != 11) {
            if (i != 16) {
                if (i != 13) {
                    if (i == 14) {
                        str = "draw_and_guess";
                    }
                } else {
                    str = "open_camera_dialog_showing";
                }
            }
            AbstractC75865Tq1.LJIIIZ(c75878TqE2.LIZLLL, "block_type_string", str2, true);
            c75878TqE2.LJIILLIIL("invite_popup_block");
        }
        str = "multi_live_connecting";
        str2 = str;
        AbstractC75865Tq1.LJIIIZ(c75878TqE2.LIZLLL, "block_type_string", str2, true);
        c75878TqE2.LJIILLIIL("invite_popup_block");
    }
}
