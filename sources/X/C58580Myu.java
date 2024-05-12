package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivePkConnectTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostReplyTimeOutSetting;

/* renamed from: X.Myu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58580Myu {
    public static final N39 LIZ;

    static {
        int value = LivePkConnectTimeoutIntervalSetting.INSTANCE.getValue();
        MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        MtCoHostReplyTimeOutSetting.INSTANCE.getValue();
        LIZ = new N39(value, null, null, null);
    }
}
