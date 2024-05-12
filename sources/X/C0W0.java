package X;

import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;

/* renamed from: X.0W0, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0W0 {
    DisconnectTypeNormalExit(1000, "normal disconnect"),
    DisconnectTypeServerError(1001, "server error"),
    DisconnectTypeAutoDetectionClickStartLive(3000, "interrupt auto speed detection because click start live"),
    DisconnectTypeAutoDetectionOpenDefinitionDialog(3001, "interrupt auto speed detection because open definition dialog"),
    DisconnectTypeAutoDetectionExitPreviewPage(3002, "interrupt auto speed detection because exit preview page"),
    DisconnectTypeAutoDetectionPermissionRecycled(3003, "interrupt auto speed detection because permission was recycled"),
    DisconnectTypeManuallyDetectionClickCancel(3500, "interrupt manually speed detection because click cancel"),
    DisconnectTypeManuallyDetectionCloseDialog(3501, "interrupt manually speed detection because close speed detection dialog"),
    DisconnectTypeDetectionWithIllegalParameters(3502, "Speed test with illegal parameters"),
    DisconnectTypeWaitReportTimeOut(LivePlayerResourceReleaseSetting.ENABLE, "wait report timeout"),
    DisconnectTypeBroadcastBlocked(4001, "broadcast blocked"),
    DISCONNECT_TYPE_ON_START_PUSH_STREAM(4002, "stop auto speed detection when start push stream."),
    DISCONNECT_TYPE_ON_PREPARATION_START_SPEED_TEST(4003, "stop auto speed detection when start manual speed test in preparation page"),
    DISCONNECT_TYPE_ON_PREPARATION_SELECT_DEFINITION(4004, "stop auto speed detection when select definition in preparation page"),
    DISCONNECT_TYPE_ON_SPEED_TEST_TIME_DELAY(4005, "stop auto speed detection because reaching speed test delay time ");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static C0W0 valueOf(String str) {
        return (C0W0) V0N.LJJJ(C0W0.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getMessage() {
        return this.LJLILLLLZI;
    }

    C0W0(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
