package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor;

import X.BZI;
import X.C28787BRn;
import X.C29215BdL;
import X.C29306Beo;
import X.C59994Ngc;
import X.C74752TVk;
import X.C74776TWi;
import X.C74800TXg;
import X.C74824TYe;
import X.C74838TYs;
import X.C74969TbZ;
import X.C75017TcL;
import X.CN1;
import X.EnumC74778TWk;
import X.InterfaceC74802TXi;
import X.InterfaceC74834TYo;
import X.InterfaceC74869TZx;
import X.TRK;
import Y.AObserverS76S0200000_13;
import Y.IDDListenerS152S0100000_13;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.MultiGuestFollowAndApplyDialog;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class FansRequiredInterceptor implements InterfaceC74869TZx {
    public InterfaceC74834TYo LIZ;
    public MultiGuestFollowAndApplyDialog LIZIZ;

    @Override // X.InterfaceC74869TZx
    public final boolean LIZ(final C29215BdL checkParam) {
        Room room;
        o.LJIIIZ(checkParam, "checkParam");
        Object obj = checkParam.LIZ;
        final DataChannel dataChannel = checkParam.LIZIZ;
        if (checkParam.LJFF == 101) {
            return false;
        }
        MultiLiveAnchorPanelSettings LJI = C74776TWi.LJI();
        if (!C74776TWi.LJIILL(LJI) || !C74776TWi.LJIILIIL(LJI) || dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || C74776TWi.LJIIJJI(room) || !C74776TWi.LJIIL()) {
            return false;
        }
        MultiGuestFollowAndApplyDialog.Companion.OnFollowRequestListener onFollowRequestListener = new MultiGuestFollowAndApplyDialog.Companion.OnFollowRequestListener() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.guest.interceptor.FansRequiredInterceptor$interceptor$1
            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.link.apply.guest.MultiGuestFollowAndApplyDialog.Companion.OnFollowRequestListener
            public final void LJJIIZI(boolean z) {
                int i;
                String str;
                Room LJJIJLIJ;
                User owner;
                FollowInfo followInfo;
                if (z) {
                    C29215BdL.this.LJFF = 101;
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null && (LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel2)) != null && (owner = LJJIJLIJ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                        i = (int) followInfo.getFollowStatus();
                    } else {
                        i = 0;
                    }
                    EnumC74778TWk LIZJ = C59994Ngc.LIZJ();
                    int i2 = C74838TYs.LJ().LJJ;
                    HashMap hashMap = new HashMap();
                    DeepLinkEnterMultiLiveRoomDataHandler LIZ = C74752TVk.LIZ();
                    InterfaceC74802TXi LIZIZ = C74800TXg.LIZIZ();
                    hashMap.put("anchor_relationship", String.valueOf(i));
                    if (LIZIZ != null) {
                        str = LIZIZ.LIZ();
                    } else {
                        str = "";
                    }
                    if (LIZ != null && !LIZ.LIZIZ().isEmpty()) {
                        hashMap.put("request_page", LIZ.LIZIZ());
                    } else if (LIZIZ != null && !TextUtils.isEmpty(str)) {
                        hashMap.put("request_page", str);
                    } else if (!TextUtils.isEmpty(C75017TcL.LIZ)) {
                        hashMap.put("request_page", C75017TcL.LIZ);
                    }
                    MultiGuestDataHolder LIZ2 = TRK.LIZ();
                    if (LIZ2 != null) {
                        hashMap.put("guest_permission", LIZ2.LJIIIIZZ());
                    }
                    hashMap.put("connected_guest_cnt", String.valueOf(i2));
                    hashMap.put("layout_setting", C74824TYe.LJI(LIZJ).getFirst());
                    hashMap.put("window_setting", C74824TYe.LJI(LIZJ).getSecond());
                    BZI LIZ3 = C28787BRn.LIZ("livesdk_guest_connection_click_follow_and_apply");
                    LIZ3.LJIIZILJ();
                    LIZ3.LJIIJJI("live_take_detail");
                    LIZ3.LJJIFFI(hashMap);
                    LIZ3.LJJIIJZLJL();
                    C29215BdL c29215BdL = C29215BdL.this;
                    c29215BdL.LIZJ.invoke(Integer.valueOf(c29215BdL.LJ));
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
                    BZI LIZ4 = C28787BRn.LIZ("follow");
                    LIZ4.LJIJJ("live_audience_c_anchor", "request_page");
                    LIZ4.LJIJJ("guest_connection_apply_auto", "click_user_position");
                    LIZ4.LJJIFFI(linkedHashMap);
                    LIZ4.LJIILLIIL(dataChannel3);
                    LIZ4.LJIIIZ("live_interact");
                    LIZ4.LJIIJJI("live_room");
                    LIZ4.LJIIL("core");
                    LIZ4.LJJIIJZLJL();
                } else {
                    C29215BdL.this.LJFF = 102;
                }
                MultiGuestFollowAndApplyDialog multiGuestFollowAndApplyDialog = this.LIZIZ;
                if (multiGuestFollowAndApplyDialog != null && multiGuestFollowAndApplyDialog.isShowing()) {
                    multiGuestFollowAndApplyDialog.dismiss();
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                o.LJIIIZ(dest, "dest");
            }
        };
        MultiGuestFollowAndApplyDialog multiGuestFollowAndApplyDialog = new MultiGuestFollowAndApplyDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("OnLinkMicBuiltListener", onFollowRequestListener);
        multiGuestFollowAndApplyDialog.setArguments(bundle);
        multiGuestFollowAndApplyDialog.setOnDismissListener(new IDDListenerS152S0100000_13(this, 4));
        this.LIZIZ = multiGuestFollowAndApplyDialog;
        InterfaceC74834TYo interfaceC74834TYo = (InterfaceC74834TYo) dataChannel.kv0(C74969TbZ.class);
        if (interfaceC74834TYo != null) {
            this.LIZ = interfaceC74834TYo;
            o.LJII(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            interfaceC74834TYo.addToShow(1000, (LifecycleOwner) obj, new AObserverS76S0200000_13(dataChannel, this, 2));
        }
        return true;
    }
}
