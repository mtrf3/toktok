package X;

import android.content.Context;
import android.text.SpannableString;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.livesdk.broadcast.ColdDownNotifyEvent;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BUV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, DataChannel dataChannel) {
        boolean z;
        int i;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        Object kv0 = dataChannel.kv0(LiveModeChannel.class);
        o.LJI(kv0);
        String modeFromServer = ((LiveMode) kv0).getModeFromServer();
        java.util.Map map = (java.util.Map) dataChannel.kv0(PermissionApplyInfoChannel.class);
        if (map != null && (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(modeFromServer)) != null && permissionApplyInfo2.mApplyStatus == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            java.util.Map map2 = (java.util.Map) dataChannel.kv0(PermissionApplyInfoChannel.class);
            if (map2 != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map2.get(modeFromServer)) != null) {
                i = permissionApplyInfo.mForbiddenApplyDays;
            } else {
                i = 0;
            }
            SpannableString spannableString = new SpannableString(C15380j0.LJIIIIZZ(R.plurals.mw, i, Integer.valueOf(i)));
            spannableString.setSpan(new BUU(context, dataChannel, modeFromServer), 0, spannableString.length(), 17);
            dataChannel.qv0(ColdDownNotifyEvent.class, new C28913BWj(0, BUW.COLD_DOWN_BLOCK, spannableString, 8));
            return;
        }
        dataChannel.qv0(ColdDownNotifyEvent.class, new C28913BWj(8, BUW.COLD_DOWN_BLOCK, "", 8));
    }
}
