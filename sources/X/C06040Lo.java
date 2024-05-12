package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.0Lo */
/* loaded from: classes.dex */
public final class C06040Lo {
    public static /* synthetic */ void LIZ(IRoomFunctionService iRoomFunctionService, String str, ActivityC45651qj activityC45651qj, DataChannel dataChannel, int i) {
        boolean z;
        String str2;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        iRoomFunctionService.u00(str, activityC45651qj, dataChannel, z, str2);
    }
}
