package com.bytedance.android.livesdk.comp.impl.game.linkmic.interceptor;

import X.ActivityC45651qj;
import X.BZI;
import X.C28787BRn;
import X.C29212BdI;
import X.C29306Beo;
import X.C45804HyK;
import X.C74838TYs;
import X.C74969TbZ;
import X.C78983UzD;
import X.CN1;
import X.InterfaceC74833TYn;
import X.InterfaceC74834TYo;
import X.TTV;
import X.TV2;
import X.TVD;
import X.TWL;
import Y.AObserverS76S0200000_13;
import Y.IDDListenerS152S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkFollowAndApplyDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class FansRequiredInterceptor implements InterfaceC74833TYn {
    public InterfaceC74834TYo LIZ;
    public GameLinkFollowAndApplyDialog LIZIZ;

    @Override // X.InterfaceC74833TYn
    public final boolean LIZ(final C29212BdI checkParam) {
        Room room;
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(checkParam, "checkParam");
        Context context = checkParam.LIZ;
        final DataChannel dataChannel = checkParam.LIZIZ;
        if (checkParam.LJFF == 101) {
            return false;
        }
        MultiLiveAnchorPanelSettings LJI = TV2.LJI();
        if (!TV2.LJIILIIL(LJI) || !TV2.LJIIL(LJI) || dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || TV2.LJIIJ(room) || !TV2.LJIIJJI()) {
            return false;
        }
        GameLinkFollowAndApplyDialog.Companion.OnFollowRequestListener onFollowRequestListener = new GameLinkFollowAndApplyDialog.Companion.OnFollowRequestListener() { // from class: com.bytedance.android.livesdk.comp.impl.game.linkmic.interceptor.FansRequiredInterceptor$interceptor$1
            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkFollowAndApplyDialog.Companion.OnFollowRequestListener
            public final void LJJIIZI(boolean z) {
                int i;
                Room LJJIJLIJ;
                User owner;
                FollowInfo followInfo;
                if (z) {
                    C29212BdI.this.LJFF = 101;
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null && (LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel2)) != null && (owner = LJJIJLIJ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                        i = (int) followInfo.getFollowStatus();
                    } else {
                        i = 0;
                    }
                    int i2 = C74838TYs.LJ().LJJ;
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_relationship", String.valueOf(i));
                    if (!TextUtils.isEmpty(C78983UzD.LJLLILLLL)) {
                        hashMap.put("request_page", C78983UzD.LJLLILLLL);
                    }
                    TVD LIZ = TTV.LIZ();
                    if (LIZ != null) {
                        hashMap.put("guest_permission", LIZ.LIZ());
                    }
                    hashMap.put("connected_guest_cnt", String.valueOf(i2));
                    hashMap.put("layout_setting", TWL.LJFF().getFirst());
                    hashMap.put("window_setting", TWL.LJFF().getSecond());
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_click_follow_and_apply");
                    LIZ2.LJIIZILJ();
                    LIZ2.LJIIJJI("live_take_detail");
                    LIZ2.LJJIFFI(hashMap);
                    LIZ2.LJJIIJZLJL();
                    C29212BdI c29212BdI = C29212BdI.this;
                    c29212BdI.LIZJ.invoke(Integer.valueOf(c29212BdI.LJ));
                    FansRequiredInterceptor fansRequiredInterceptor = this;
                    DataChannel dataChannel3 = dataChannel;
                    fansRequiredInterceptor.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
                    linkedHashMap.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
                    linkedHashMap.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
                    IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
                    if (iInteractService.mT()) {
                        if (iInteractService.FZ().equals("punish")) {
                            linkedHashMap.put("match_status", "punish");
                        } else {
                            linkedHashMap.put("match_status", "pk_phase");
                        }
                        Map<String, String> L00 = iInteractService.L00();
                        o.LJIIIIZZ(L00, "it.matchLogParams");
                        linkedHashMap.putAll(L00);
                    }
                    BZI LIZ3 = C28787BRn.LIZ("follow");
                    LIZ3.LJIJJ("live_audience_c_anchor", "request_page");
                    LIZ3.LJIJJ("guest_connection_apply_auto", "click_user_position");
                    LIZ3.LJJIFFI(linkedHashMap);
                    LIZ3.LJIILLIIL(dataChannel3);
                    LIZ3.LJIIIZ("live_interact");
                    LIZ3.LJIIJJI("live_room");
                    LIZ3.LJIIL("core");
                    LIZ3.LJJIIJZLJL();
                } else {
                    C29212BdI.this.LJFF = 102;
                }
                GameLinkFollowAndApplyDialog gameLinkFollowAndApplyDialog = this.LIZIZ;
                if (gameLinkFollowAndApplyDialog != null && gameLinkFollowAndApplyDialog.isShowing()) {
                    gameLinkFollowAndApplyDialog.dismiss();
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                o.LJIIIZ(dest, "dest");
            }
        };
        GameLinkFollowAndApplyDialog gameLinkFollowAndApplyDialog = new GameLinkFollowAndApplyDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("OnLinkMicBuiltListener", onFollowRequestListener);
        gameLinkFollowAndApplyDialog.setArguments(bundle);
        gameLinkFollowAndApplyDialog.setOnDismissListener(new IDDListenerS152S0100000_13(this, 11));
        this.LIZIZ = gameLinkFollowAndApplyDialog;
        InterfaceC74834TYo interfaceC74834TYo = (InterfaceC74834TYo) dataChannel.kv0(C74969TbZ.class);
        if (interfaceC74834TYo != null) {
            this.LIZ = interfaceC74834TYo;
            if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                interfaceC74834TYo.addToShow(1000, LJJIFFI, new AObserverS76S0200000_13(dataChannel, this, 5));
            }
        }
        return true;
    }
}
