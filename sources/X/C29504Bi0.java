package X;

import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.impl.RankService;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.Bi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29504Bi0 {
    public static InterfaceC29505Bi1 LIZ;

    public static BorderInfo LIZ(User user) {
        if (user == null) {
            return null;
        }
        if (user.getBorders() == null || user.getBorders().isEmpty()) {
            if (LIZ != null && user.getBorder() != null) {
                if (((RankService) LIZ).LIZ(user.getBorder())) {
                    return user.getBorder();
                }
            }
        } else {
            if (LIZ == null) {
                return (BorderInfo) ListProtector.get(user.getBorders(), 0);
            }
            for (BorderInfo borderInfo : user.getBorders()) {
                if (borderInfo != null && ((RankService) LIZ).LIZ(borderInfo)) {
                    return borderInfo;
                }
            }
        }
        return null;
    }

    public static void LIZIZ(User user, String str, boolean z, BorderInfo borderInfo) {
        PrivilegeLogExtra privilegeLogExtra;
        boolean z2;
        Object obj;
        if (borderInfo != null && LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_privilege_show", LiveLogMonitorSampleSetting.getSAMPLE_0()) && (privilegeLogExtra = borderInfo.borderLogExtra) != null) {
            if (user.getLiveRoomId() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_privilege_show");
            String str2 = "anchor";
            if (z) {
                obj = "anchor";
            } else {
                obj = "user";
            }
            LIZ2.LJIJJ(obj, "user_type");
            if (!z2) {
                str2 = "user";
            }
            LIZ2.LJIJJ(str2, "to_user_type");
            LIZ2.LJIJJ(str, "privilege_scenario");
            LIZ2.LJIJJ("avatar_frame", "privilege_type");
            LIZ2.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
            LIZ2.LJIJJ(Long.valueOf(user.getId()), "to_user_id");
            LIZ2.LJIJJ(privilegeLogExtra.privilege_id, "privilege_id");
            LIZ2.LJIJJ(privilegeLogExtra.privilege_order_id, "privilege_order_id");
            LIZ2.LJIJJ(privilegeLogExtra.privilege_version, "privilege_version_id");
            LIZ2.LJIJJ(privilegeLogExtra.data_version, "data_version_id");
            LIZ2.LJIJJ(Integer.valueOf(BM1.LIZJ), "online_user");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIIZILJ();
                LIZ2.LJJIIJZLJL();
                return;
            }
            LIZ2.LJJIJ();
            BJM bjm = BJM.LJLIL;
            LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
            LIZ2.LJIJJ(bjm.LIZJ(), "live_type");
            LIZ2.LJI();
            LIZ2.LJJIIZI();
        }
    }
}
