package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.ActivityC45651qj;
import X.B83;
import X.BJM;
import X.BNI;
import X.BTJ;
import X.BZI;
import X.C15380j0;
import X.C28787BRn;
import X.C29038BaU;
import X.C29044Baa;
import X.C29306Beo;
import X.C29334BfG;
import X.C29335BfH;
import X.C29336BfI;
import X.C29338BfK;
import X.C29374Bfu;
import X.C29929Bor;
import X.C29930Bos;
import X.C38131Exr;
import X.C45243HpH;
import X.C73411SrX;
import X.CN1;
import X.InterfaceC29343BfP;
import X.InterfaceC29405BgP;
import X.InterfaceC65349Pkn;
import X.X1D;
import Y.AfS17S0001000_5;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class SharePanelMethod extends AbstractC38123Exj<Params, Object> {
    public InterfaceC29343BfP LJLIL;
    public C73411SrX LJLILLLLZI;

    /* loaded from: classes6.dex */
    public static final class Params {

        @InterfaceC65349Pkn("desc")
        public String desc;

        @InterfaceC65349Pkn("image")
        public String image;

        @InterfaceC65349Pkn("title")
        public String title;

        @InterfaceC65349Pkn("url")
        public String url;
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLIL = null;
    }

    public SharePanelMethod(SparkContext sparkContext) {
        this.LJLIL = (InterfaceC29343BfP) sparkContext.LIZIZ(InterfaceC29343BfP.class);
    }

    public SharePanelMethod(InterfaceC29343BfP interfaceC29343BfP) {
        this.LJLIL = interfaceC29343BfP;
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Params params, C38131Exr c38131Exr) {
        C29336BfI c29336BfI;
        Params params2 = params;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Map<String, String> LJIILJJIL = C28787BRn.LIZ("").LJIILJJIL();
        if (room != null && TextUtils.isEmpty(params2.url)) {
            BNI un0 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
            ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(c38131Exr.LIZ);
            C29929Bor c29929Bor = new C29929Bor(room);
            c29929Bor.LJIJJLI = LJIILJJIL;
            c29929Bor.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
            ((C29338BfK) un0).LIZ(LIZIZ, new C29930Bos(c29929Bor), new C29334BfG(this, room));
            return;
        }
        InterfaceC29343BfP interfaceC29343BfP = this.LJLIL;
        if (interfaceC29343BfP != null) {
            c29336BfI = interfaceC29343BfP.getShareInfo();
        } else {
            c29336BfI = null;
        }
        if (params2 != null) {
            c29336BfI = new C29336BfI(params2.title, params2.desc, params2.image, params2.url);
        } else if (c29336BfI == null) {
            return;
        }
        if (TextUtils.isEmpty(c29336BfI.LIZLLL)) {
            return;
        }
        Uri.Builder buildUpon = UriProtector.parse(c29336BfI.LIZLLL).buildUpon();
        buildUpon.appendQueryParameter("share_ht_uid", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        BNI un02 = ((IShareService) CN1.LIZ(IShareService.class)).un0();
        ActivityC45651qj LIZIZ2 = C29306Beo.LIZIZ(c38131Exr.LIZ);
        C29929Bor c29929Bor2 = new C29929Bor();
        c29929Bor2.LJIIJJI = c29336BfI.LIZ;
        c29929Bor2.LJIIL = c29336BfI.LIZIZ;
        c29929Bor2.LJIILIIL = c29336BfI.LIZJ;
        c29929Bor2.LJIIJ = buildUpon.toString();
        c29929Bor2.LJIJJLI = LJIILJJIL;
        c29929Bor2.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
        ((C29338BfK) un02).LIZ(LIZIZ2, new C29930Bos(c29929Bor2), new C29335BfH(this, room));
    }

    public static void LJJI(Room room, String str, String str2, String str3) {
        long j;
        long j2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("share_success");
        LIZ.append(System.currentTimeMillis());
        String mD5String = MD5Utils.getMD5String(X1D.LIZIZ(LIZ));
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("share_info")) {
            BZI LIZ2 = C28787BRn.LIZ("share_info");
            LIZ2.LJIJJ(mD5String, "bind_id");
            LIZ2.LJIJJ(str3, "to_user_id");
            LIZ2.LJJIIJZLJL();
        }
        HashMap LIZ3 = C45243HpH.LIZ("share_platform", str, "share_type", str2);
        LIZ3.put("bind_id", mD5String);
        if (room != null && room.getLog_pb() != null) {
            LIZ3.put("log_pb", room.getLog_pb());
        }
        String LJIIIZ = BJM.LJIIIZ();
        Room room2 = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (room2 != null) {
            j = room2.getOwnerUserId();
        } else {
            j = -1;
        }
        if (LIZIZ != null) {
            j2 = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j2 = -2;
        }
        if (j != j2 && ((IInteractService) CN1.LIZ(IInteractService.class)).mT()) {
            LIZ3.put("connection_type", "manual_pk");
            LIZ3.put("pk_id", String.valueOf(((IInteractService) CN1.LIZ(IInteractService.class)).eq()));
        }
        if (!TextUtils.isEmpty(LJIIIZ) && "click_push_live_cd_user".equals(LJIIIZ)) {
            LIZ3.put("is_subscribe", "1");
        } else {
            LIZ3.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        if (C15380j0.LJIILLIIL()) {
            LIZ3.put("room_orientation", "portrait");
        } else {
            LIZ3.put("room_orientation", "landscape");
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ3.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        LIZ3.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        BZI LIZ4 = C28787BRn.LIZ("share");
        LIZ4.LJJIFFI(LIZ3);
        LIZ4.LIZJ("click");
        LIZ4.LJIIZILJ();
        LIZ4.LJJIIJZLJL();
    }

    public final void LJJIFFI(String str, String str2, long j, String str3) {
        this.LJLILLLLZI = (C73411SrX) ((IShareService) CN1.LIZ(IShareService.class)).Ib(str2, j, str3, (String) DataChannelGlobal.LJLJJI.mv0(C29038BaU.class)).LJJJLIIL(new AfS17S0001000_5(0, 2), BTJ.LIZ);
    }
}
