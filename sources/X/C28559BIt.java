package X;

import android.net.Uri;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.broadcast.BroadcastSettingResponse;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePermissionApplyLynx;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.BIt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28559BIt {
    public static BaseDialogFragment LIZ;
    public static SparkContext LIZIZ;

    public static void LIZ(DataChannel dataChannel, String str) {
        int i;
        String str2;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        o.LJIIIZ(dataChannel, "dataChannel");
        java.util.Map map = (java.util.Map) dataChannel.kv0(PermissionApplyInfoChannel.class);
        if (map != null && (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null && permissionApplyInfo2.mAnchorFansNum >= permissionApplyInfo2.mApplyNeedFansNum) {
            i = 1;
        } else {
            i = 0;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_live_access_apply_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Integer.valueOf(i), "apply_threshold");
        LiveMode liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class);
        Integer num = null;
        if (liveMode != null) {
            str2 = C28509BGv.LIZ(liveMode);
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(str2, "live_type");
        java.util.Map map2 = (java.util.Map) dataChannel.kv0(PermissionApplyInfoChannel.class);
        if (map2 != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map2.get(str)) != null) {
            num = Integer.valueOf(permissionApplyInfo.mAnchorFansNum);
        }
        LIZ2.LJIJJ(String.valueOf(num), "fans_cnt ");
        LIZ2.LJJIIJZLJL();
    }

    public static int LIZJ(int i, android.net.Uri uri, String str) {
        String queryParameter;
        if (uri != null && (queryParameter = UriProtector.getQueryParameter(uri, str)) != null) {
            return CastIntegerProtector.parseInt(queryParameter);
        }
        return i;
    }

    public static void LIZLLL(DataChannel dataChannel, String str, ActivityC45651qj activityC45651qj) {
        boolean z;
        String uri;
        o.LJIIIZ(dataChannel, "dataChannel");
        String value = LivePermissionApplyLynx.INSTANCE.getValue();
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        boolean z2 = false;
        if (iHostAction != null) {
            z = iHostAction.hostInterceptSpark(value);
        } else {
            z = false;
        }
        int i = 482;
        if (z) {
            String builder = LIZIZ(str, value, (java.util.Map) dataChannel.kv0(PermissionApplyInfoChannel.class), (BroadcastSettingResponse) dataChannel.kv0(BroadcastSettingResponseChannel.class)).toString();
            o.LJIIIIZZ(builder, "addApplyUrlParams(\n     …\n            ).toString()");
            C29682Bks LIZIZ2 = C29683Bkt.LIZIZ(builder);
            if (o.LJ(str, "live")) {
                i = 438;
            }
            LIZIZ2.LJIIJ(i, BY3.DP);
            C29682Bks.LJIJI(LIZIZ2, 8);
            LIZIZ2.LJIIIZ("bottom");
            String uri2 = LIZIZ2.LIZ().toString();
            o.LJIIIIZZ(uri2, "SparkPopupSchemaBuilder.…      .build().toString()");
            IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
            SparkContext sparkContext = null;
            if (iHybridContainerService != null) {
                sparkContext = iHybridContainerService.Vs0(activityC45651qj, uri2, null);
            }
            LIZIZ = sparkContext;
            return;
        }
        Uri.Builder LIZIZ3 = LIZIZ(str, value, (java.util.Map) dataChannel.kv0(PermissionApplyInfoChannel.class), (BroadcastSettingResponse) dataChannel.kv0(BroadcastSettingResponseChannel.class));
        android.net.Uri parse = UriProtector.parse(LIZIZ3.toString());
        String str2 = "";
        BNW K90 = C7N.LJFF().K90(LIZIZ3.toString(), "");
        K90.LJFF(8, 8);
        if (str.equals("live")) {
            i = 438;
        }
        K90.LIZJ = LIZJ(i, parse, "height");
        K90.LIZIZ = LIZJ((int) C15380j0.LJIJ(C15380j0.LJIIL()), parse, "width");
        K90.LIZLLL = LIZJ(0, parse, "margin");
        K90.LJIIIZ = 80;
        LIZJ(0, parse, "show_close");
        K90.LJIIL = true;
        K90.LIZJ("0.5");
        if (parse != null && (uri = parse.toString()) != null) {
            str2 = uri;
        }
        K90.LJIILLIIL = str2;
        if (LIZJ(0, parse, "landscape_custom_height") == 1) {
            z2 = true;
        }
        K90.LJIIJJI = z2;
        HybridDialogFragment LIZ2 = K90.LIZ();
        LIZ = LIZ2;
        BaseDialogFragment.wl(activityC45651qj, LIZ2);
    }

    public static Uri.Builder LIZIZ(String str, String str2, java.util.Map map, BroadcastSettingResponse broadcastSettingResponse) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Boolean bool;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo2;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo3;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo4;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo5;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo6;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo7;
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo8;
        Uri.Builder buildUpon = UriProtector.parse(str2).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("permission_type", str);
        Long l = null;
        if (map != null && (permissionApplyInfo8 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num = Integer.valueOf(permissionApplyInfo8.mAnchorFansNum);
        } else {
            num = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("anchor_fans_num", String.valueOf(num));
        if (map != null && (permissionApplyInfo7 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num2 = Integer.valueOf(permissionApplyInfo7.mForbiddenApplyCountdown);
        } else {
            num2 = null;
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("forbidden_apply_countdown", String.valueOf(num2));
        if (map != null && (permissionApplyInfo6 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num3 = Integer.valueOf(permissionApplyInfo6.mApplyNeedFansNum);
        } else {
            num3 = null;
        }
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("apply_need_fans_num", String.valueOf(num3));
        if (map != null && (permissionApplyInfo5 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num4 = Integer.valueOf(permissionApplyInfo5.mTargetLiveTime);
        } else {
            num4 = null;
        }
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("target_live_time", String.valueOf(num4));
        if (map != null && (permissionApplyInfo4 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num5 = Integer.valueOf(permissionApplyInfo4.mForbiddenApplyDays);
        } else {
            num5 = null;
        }
        Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("forbidden_apply_days", String.valueOf(num5));
        if (map != null && (permissionApplyInfo3 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num6 = Integer.valueOf(permissionApplyInfo3.mApplyInvalidTime);
        } else {
            num6 = null;
        }
        Uri.Builder appendQueryParameter7 = appendQueryParameter6.appendQueryParameter("apply_invalid_time", String.valueOf(num6));
        if (map != null && (permissionApplyInfo2 = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num7 = Integer.valueOf(permissionApplyInfo2.mNeedLiveTime);
        } else {
            num7 = null;
        }
        Uri.Builder appendQueryParameter8 = appendQueryParameter7.appendQueryParameter("need_live_time", String.valueOf(num7));
        if (map != null && (permissionApplyInfo = (LivePermissionApplyResponse.PermissionApplyInfo) map.get(str)) != null) {
            num8 = Integer.valueOf(permissionApplyInfo.mApplyStatus);
        } else {
            num8 = null;
        }
        Uri.Builder appendQueryParameter9 = appendQueryParameter8.appendQueryParameter("apply_status", String.valueOf(num8));
        if (broadcastSettingResponse != null) {
            bool = Boolean.valueOf(broadcastSettingResponse.LIZ());
        } else {
            bool = null;
        }
        Uri.Builder appendQueryParameter10 = appendQueryParameter9.appendQueryParameter("can_receive_gift", String.valueOf(bool));
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null) {
            l = Long.valueOf(((C29374Bfu) LIZIZ2).getCurrentUserId());
        }
        appendQueryParameter10.appendQueryParameter("user_id", String.valueOf(l));
        return buildUpon;
    }
}
