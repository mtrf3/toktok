package Y;

import X.AbstractC03300Ba;
import X.C0BI;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes12.dex */
public class IDd0S17S0000000_11 extends C0BI {
    public final int $t;

    public static final String LIZIZ$0(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM maf_info WHERE rec_type = ?";
    }

    public static final String LIZIZ$1(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM maf_info WHERE uid = ?";
    }

    public static final String LIZIZ$10(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "UPDATE t_sync_cursor SET report_cursor = ? WHERE sync_id = ? ";
    }

    public static final String LIZIZ$11(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "UPDATE t_sync_cursor SET recv_cursor = 0 WHERE sync_id=?";
    }

    public static final String LIZIZ$12(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM t_synclog WHERE sync_id = ?";
    }

    public static final String LIZIZ$13(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM t_snapshot WHERE sync_id = ?";
    }

    public static final String LIZIZ$14(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM t_report_synclog WHERE t_report_synclog.business not in (SELECT distinct id from t_business) ";
    }

    public static final String LIZIZ$15(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM t_report_synclog WHERE sync_id = ? AND cursor > 0 AND cursor <=?";
    }

    public static final String LIZIZ$16(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM FRIENDS_RELATION WHERE SEC_UID = ?";
    }

    public static final String LIZIZ$17(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM FRIENDS_RELATION";
    }

    public static final String LIZIZ$18(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "\n        DELETE \n        FROM workmanager_task\n        ";
    }

    public static final String LIZIZ$19(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "\n        DELETE\n        FROM workmanager_task\n        WHERE type = ?\n        ";
    }

    public static final String LIZIZ$2(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM maf_info WHERE uid = ? AND rec_type = ?";
    }

    public static final String LIZIZ$20(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "\n        DELETE \n        FROM workmanager_task\n        WHERE type = ? AND scheduled_timestamp < ?\n        ";
    }

    public static final String LIZIZ$21(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "\n        DELETE \n        FROM workmanager_task\n        WHERE scheduled_timestamp = ?\n        ";
    }

    public static final String LIZIZ$22(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "\n        UPDATE workmanager_task \n        SET is_executed = ?, actual_timestamp = ?\n        WHERE id = ?\n        ";
    }

    public static final String LIZIZ$3(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM maf_info WHERE version = ?";
    }

    public static final String LIZIZ$4(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM user_info WHERE version = ?";
    }

    public static final String LIZIZ$5(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM user_status WHERE version = ?";
    }

    public static final String LIZIZ$6(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM maf_info";
    }

    public static final String LIZIZ$7(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM user_info";
    }

    public static final String LIZIZ$8(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "DELETE FROM user_status";
    }

    public static final String LIZIZ$9(IDd0S17S0000000_11 iDd0S17S0000000_11) {
        return "UPDATE t_sync_cursor SET report_cursor = ?,did=?,uid=?,bucket=? WHERE sync_id = ? ";
    }

    @Override // X.C0BI
    public final String LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            case 2:
                return LIZIZ$2(this);
            case 3:
                return LIZIZ$3(this);
            case 4:
                return LIZIZ$4(this);
            case 5:
                return LIZIZ$5(this);
            case 6:
                return LIZIZ$6(this);
            case 7:
                return LIZIZ$7(this);
            case 8:
                return LIZIZ$8(this);
            case 9:
                return LIZIZ$9(this);
            case 10:
                return LIZIZ$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZIZ$11(this);
            case 12:
                return LIZIZ$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LIZIZ$13(this);
            case 14:
                return LIZIZ$14(this);
            case 15:
                return LIZIZ$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return LIZIZ$16(this);
            case 17:
                return LIZIZ$17(this);
            case 18:
                return LIZIZ$18(this);
            case 19:
                return LIZIZ$19(this);
            case 20:
                return LIZIZ$20(this);
            case 21:
                return LIZIZ$21(this);
            case 22:
                return LIZIZ$22(this);
            default:
                return super.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDd0S17S0000000_11(AbstractC03300Ba abstractC03300Ba, int i) {
        super(abstractC03300Ba);
        this.$t = i;
    }
}
