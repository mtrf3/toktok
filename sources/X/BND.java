package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBag;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BND implements InterfaceC62096OYq {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ BR1 LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;

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

    public BND(Room room, BR1 br1, JSONObject jSONObject) {
        this.LJLIL = room;
        this.LJLILLLLZI = br1;
        this.LJLJI = jSONObject;
    }

    @Override // X.InterfaceC62096OYq
    public final void LJFF(String str, String str2, Bundle bundle) {
        String str3;
        long j;
        String str4;
        long j2;
        long j3;
        String str5 = str2;
        String str6 = null;
        if (bundle == null || (str3 = bundle.getString("shareIdList", "")) == null) {
            str3 = "";
        }
        Room room = this.LJLIL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        if (str5 == null) {
            str5 = "";
        }
        Room room2 = this.LJLIL;
        if (room2 != null) {
            str6 = room2.getLabels();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        String str7 = (String) dataChannelGlobal.mv0(C29038BaU.class);
        DataChannel dataChannel = this.LJLILLLLZI.LIZ;
        if (dataChannel != null) {
            dataChannel.qv0(ShareJoinInGoodyBag.class, str4);
        }
        BR1 br1 = this.LJLILLLLZI;
        Room room3 = this.LJLIL;
        JSONObject jSONObject = this.LJLJI;
        br1.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("share_success");
        LIZ.append(System.currentTimeMillis());
        String bindId = MD5Utils.getMD5String(X1D.LIZIZ(LIZ));
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("share_info")) {
            BZI LIZ2 = C28787BRn.LIZ("share_info");
            LIZ2.LJIJJ(bindId, "bind_id");
            LIZ2.LJIJJ(str3, "to_user_id");
            LIZ2.LJJIIJZLJL();
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("share_platform", str);
        hashMap.put("share_type", str5);
        o.LJIIIIZZ(bindId, "bindId");
        hashMap.put("bind_id", bindId);
        if (room3 != null && room3.getLog_pb() != null) {
            String log_pb = room3.getLog_pb();
            o.LJIIIIZZ(log_pb, "room.log_pb");
            hashMap.put("log_pb", log_pb);
        }
        String LJIIIZ = BJM.LJIIIZ();
        Room room4 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (room4 != null) {
            j2 = room4.getOwnerUserId();
        } else {
            j2 = -1;
        }
        if (LIZIZ != null) {
            j3 = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j3 = -2;
        }
        if (j2 != j3 && ((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            hashMap.put("connection_type", "manual_pk");
            hashMap.put("pk_id", String.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()));
        }
        if (!TextUtils.isEmpty(LJIIIZ) && o.LJ("click_push_live_cd_user", LJIIIZ)) {
            hashMap.put("is_subscribe", "1");
        } else {
            hashMap.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (C15380j0.LJIILLIIL()) {
            hashMap.put("room_orientation", "portrait");
        } else {
            hashMap.put("room_orientation", "landscape");
        }
        BZI LIZ3 = C28787BRn.LIZ("share");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LIZJ("click");
        LIZ3.LJIIZILJ();
        LIZ3.LJJ(jSONObject);
        LIZ3.LJJIIJZLJL();
        ((IShareService) CN1.LIZ(IShareService.class)).Ib(str6, j, str3, str7).LJJJLIIL(BNC.LJLIL, BTJ.LIZ);
    }
}
