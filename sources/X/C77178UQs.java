package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;

/* renamed from: X.UQs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77178UQs implements URK {
    public final Keva LIZ = UQ2.LIZ().LIZ;

    public final boolean LIZIZ() {
        C55719Ltr.LIZ.getClass();
        if (!C55719Ltr.LIZ().addFFPToNecessaryScene) {
            return true;
        }
        if (System.currentTimeMillis() - this.LIZ.getLong("last_click_cancel_time", 0L) > 86400000) {
            return true;
        }
        return false;
    }

    public final RelationFreqControlData LIZJ() {
        int i = this.LIZ.getInt("reask_count", 0) + this.LIZ.getInt("rules_major_stage", 0);
        long j = this.LIZ.getLong("last_show_contact_time", 0L);
        return new RelationFreqControlData(i, this.LIZ.getInt("rules_major_stage", 0), this.LIZ.getInt("reask_count", 0), Math.max(this.LIZ.getInt("total_pop_up_count", 0), this.LIZ.getInt("reask_count", 0) + this.LIZ.getInt("rules_major_stage", 0)), j);
    }

    public final boolean LJ() {
        boolean z;
        Keva keva = this.LIZ;
        if (keva.getBoolean("finish_contact_permission_process", false) && keva.getBoolean("finish_facebook_permission_process", false)) {
            z = true;
        } else {
            z = false;
        }
        if ((!this.LIZ.getBoolean("has_go_through_process", false) && !z && this.LIZ.getInt("rules_major_stage", 0) < 4) || C53154Kta.LIZ().group == 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(int i) {
        OSZ<Boolean, Long> LJ;
        ISocialFriendsService LJJIL = C77266UUc.LIZIZ.LJJIL();
        if (LJJIL != null && (LJ = LJJIL.LJ(i)) != null && LJ.getFirst().booleanValue()) {
            if (System.currentTimeMillis() < (C51788KUe.LIZ().interval * 86400000) + LJ.getSecond().longValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
    
        if (((java.util.List) com.bytedance.mt.protector.impl.collections.ListProtector.get(X.C53154Kta.LIZ().rules, r6 - 1)).contains(java.lang.Integer.valueOf(r5.getValue())) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a6, code lost:
    
        if (((java.lang.Number) com.bytedance.mt.protector.impl.collections.ListProtector.get(((com.ss.android.ugc.aweme.experiment.Rules) com.bytedance.mt.protector.impl.collections.ListProtector.get(X.C51788KUe.LIZ().rules, r6)).stage, r3)).intValue() == r5.getValue()) goto L14;
     */
    @Override // X.USJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C77208URw r23, X.InterfaceC67352kd<? super X.URP> r24) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77178UQs.LIZ(X.URw, X.2kd):java.lang.Object");
    }
}
