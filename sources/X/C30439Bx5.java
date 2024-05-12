package X;

import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.livesdk.broadcast.GamePartnershipEntrance;
import com.bytedance.android.livesdk.broadcast.PartnershipVideoLivePermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bx5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30439Bx5 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel) {
        BroadcastSettingResponse broadcastSettingResponse;
        if (dataChannel != null && (broadcastSettingResponse = (BroadcastSettingResponse) dataChannel.kv0(BroadcastSettingResponseChannel.class)) != null) {
            return broadcastSettingResponse.liveCommercial;
        }
        return false;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        Object obj;
        C30440Bx6 c30440Bx6;
        C30441Bx7 c30441Bx7;
        if (dataChannel != null) {
            obj = dataChannel.kv0(LiveModeChannel.class);
        } else {
            obj = null;
        }
        if (obj == LiveMode.VIDEO) {
            if (dataChannel != null && (c30441Bx7 = (C30441Bx7) dataChannel.kv0(PartnershipVideoLivePermission.class)) != null) {
                return c30441Bx7.LJLIL;
            }
        } else if (dataChannel != null && (c30440Bx6 = (C30440Bx6) dataChannel.kv0(GamePartnershipEntrance.class)) != null) {
            return c30440Bx6.LIZ;
        }
        return false;
    }
}
