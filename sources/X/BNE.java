package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.broadcast.preview.widget.share.PreviewShareWidget;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BNE implements InterfaceC62096OYq {
    public final /* synthetic */ PreviewShareWidget LJLIL;
    public final /* synthetic */ User LJLILLLLZI;

    @Override // X.InterfaceC62096OYq
    public final void LIZ(Throwable th) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJI(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void LJIIIZ(Dialog dialog) {
    }

    @Override // X.InterfaceC62096OYq
    public final /* synthetic */ void onDismiss() {
    }

    public BNE(PreviewShareWidget previewShareWidget, User user) {
        this.LJLIL = previewShareWidget;
        this.LJLILLLLZI = user;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String platform, String shareType, Bundle bundle) {
        String l;
        String str;
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(shareType, "shareType");
        PreviewShareWidget previewShareWidget = this.LJLIL;
        User user = this.LJLILLLLZI;
        previewShareWidget.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("share_success");
        LIZ.append(System.currentTimeMillis());
        String bindId = MD5Utils.getMD5String(X1D.LIZIZ(LIZ));
        String str2 = "";
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("share_info")) {
            if (bundle == null || (str = bundle.getString("shareIdList")) == null) {
                str = "";
            }
            BZI LIZ2 = C28787BRn.LIZ("share_info");
            LIZ2.LJIJJ(bindId, "bind_id");
            LIZ2.LJIJJ(str, "to_user_id");
            LIZ2.LJJIIJZLJL();
        }
        HashMap LIZ3 = C45243HpH.LIZ("share_platform", platform, "share_type", shareType);
        LIZ3.put("user_type", "anchor");
        LIZ3.put("request_page", "live_take");
        o.LJIIIIZZ(bindId, "bindId");
        LIZ3.put("bind_id", bindId);
        String idStr = user.getIdStr();
        o.LJIIIIZZ(idStr, "user.idStr");
        LIZ3.put("anchor_id", idStr);
        LIZ3.put("initiator", "anchor");
        String LJIIIZ = BJM.LJIIIZ();
        if (!TextUtils.isEmpty(LJIIIZ) && o.LJ("click_push_live_cd_user", LJIIIZ)) {
            LIZ3.put("is_subscribe", "1");
        } else {
            LIZ3.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (C15380j0.LJIILLIIL()) {
            LIZ3.put("room_orientation", "portrait");
        } else {
            LIZ3.put("room_orientation", "landscape");
        }
        Hashtag hashtag = (Hashtag) previewShareWidget.dataChannel.kv0(HashtagChangedChannel.class);
        if (hashtag != null) {
            String str3 = hashtag.title;
            if (str3 == null) {
                str3 = "";
            }
            LIZ3.put("hash_type", str3);
            Long l2 = hashtag.id;
            if (l2 != null && (l = l2.toString()) != null) {
                str2 = l;
            }
            LIZ3.put("hashtag_id", str2);
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ3.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        LIZ3.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        BZI LIZ4 = C28787BRn.LIZ("share");
        LIZ4.LJIILLIIL(previewShareWidget.dataChannel);
        LIZ4.LIZLLL(C28835BTj.LIZIZ(null, previewShareWidget.dataChannel, "user_live_share"));
        LIZ4.LJJIFFI(LIZ3);
        LIZ4.LJJIIJZLJL();
    }
}
