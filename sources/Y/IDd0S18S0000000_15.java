package Y;

import X.AbstractC03300Ba;
import X.C0BI;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes16.dex */
public class IDd0S18S0000000_15 extends C0BI {
    public final int $t;

    public static final String LIZIZ$0(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM record WHERE rid = ?";
    }

    public static final String LIZIZ$1(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM translation";
    }

    public static final String LIZIZ$10(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM runtimeBehaviorEntity";
    }

    public static final String LIZIZ$11(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "UPDATE IM_USER_BASE_INFO SET FOLLOW_STATUS = ? WHERE UID = ?";
    }

    public static final String LIZIZ$12(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM IM_USER_BASE_INFO WHERE UID = ?";
    }

    public static final String LIZIZ$13(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM IM_USER_BASE_INFO";
    }

    public static final String LIZIZ$14(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM SHARE_PERMISSION WHERE UID = ?";
    }

    public static final String LIZIZ$15(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM SHARE_PERMISSION";
    }

    public static final String LIZIZ$16(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM now_self_aweme_cache WHERE aid = ?";
    }

    public static final String LIZIZ$17(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "delete from showAd";
    }

    public static final String LIZIZ$18(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM SIMPLE_USER WHERE UID = ?";
    }

    public static final String LIZIZ$19(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM SIMPLE_USER";
    }

    public static final String LIZIZ$2(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM offline_mode_feed_pb WHERE SEC_UID = ?";
    }

    public static final String LIZIZ$20(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM MAF_USER WHERE UID = ?";
    }

    public static final String LIZIZ$21(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "UPDATE MAF_USER SET FOLLOW_STATUS = ? WHERE UID = ?";
    }

    public static final String LIZIZ$22(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM MAF_USER";
    }

    public static final String LIZIZ$23(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "UPDATE RECENT_SHARE SET SEND_TIME = ? WHERE ID = ?";
    }

    public static final String LIZIZ$24(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM RECENT_SHARE WHERE CURR_UID = ? AND ID NOT IN (SELECT ID FROM RECENT_SHARE ORDER BY SHARE_TIME DESC LIMIT ?) AND ID NOT IN (SELECT ID FROM RECENT_SHARE ORDER BY SEND_TIME DESC LIMIT ?)";
    }

    public static final String LIZIZ$25(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM friends_feed_resp_cache where uid = ?";
    }

    public static final String LIZIZ$26(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM friends_feed_resp_cache";
    }

    public static final String LIZIZ$27(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM AWEME_READ_RECORD WHERE READ_TIME <= ?";
    }

    public static final String LIZIZ$28(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM AWEME_READ_RECORD WHERE READ_TIME <= ? AND READ_TIME >= ?";
    }

    public static final String LIZIZ$29(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM AWEME_READ_RECORD WHERE SCENE = 2";
    }

    public static final String LIZIZ$3(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "\n        UPDATE offline_mode_feed_pb\n        SET has_cached = ?, cached_time = ?\n        WHERE sec_uid = ? AND aid = ? AND has_cached != ?\n    ";
    }

    public static final String LIZIZ$30(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM AWEME_READ_RECORD WHERE SCENE = ?";
    }

    public static final String LIZIZ$31(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM AWEME_READ_RECORD";
    }

    public static final String LIZIZ$4(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "\n        UPDATE offline_mode_feed_pb\n        SET url_key = ?\n        WHERE sec_uid = ? AND aid = ?\n    ";
    }

    public static final String LIZIZ$5(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "\n        UPDATE offline_mode_feed_pb\n        SET has_watched = ?\n        WHERE sec_uid = ? AND aid = ? AND has_watched != ?\n    ";
    }

    public static final String LIZIZ$6(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "\n        DELETE FROM offline_mode_feed_pb\n        WHERE sec_uid = ?\n        And aid = ?\n    ";
    }

    public static final String LIZIZ$7(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "\n        DELETE FROM offline_mode_feed_pb\n    ";
    }

    public static final String LIZIZ$8(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT ?)";
    }

    public static final String LIZIZ$9(IDd0S18S0000000_15 iDd0S18S0000000_15) {
        return "DELETE FROM runtimeBehaviorEntity where type = ? and time < ?";
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
            case 23:
                return LIZIZ$23(this);
            case 24:
                return LIZIZ$24(this);
            case 25:
                return LIZIZ$25(this);
            case 26:
                return LIZIZ$26(this);
            case 27:
                return LIZIZ$27(this);
            case 28:
                return LIZIZ$28(this);
            case 29:
                return LIZIZ$29(this);
            case 30:
                return LIZIZ$30(this);
            case 31:
                return LIZIZ$31(this);
            default:
                return super.LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDd0S18S0000000_15(AbstractC03300Ba abstractC03300Ba, int i) {
        super(abstractC03300Ba);
        this.$t = i;
    }
}
