package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageP2PParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCP2PMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS80S1100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U77 implements InterfaceC76734U9q {
    public final /* synthetic */ U7T LIZ;

    @Override // X.InterfaceC76734U9q
    public final void LJIILL(String str) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILLIIL(String str, String str2) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIL() {
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            this.LIZ.LLLZLL("rtc_forward_stream_fail", null);
        }
    }

    public U77(U7T u7t) {
        this.LIZ = u7t;
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJI(LinkCoreError error) {
        int i;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcError start errorCode=");
        LIZ.append(error.getErrorCode());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U7T u7t = this.LIZ;
            if (u7t.LJFF == 2) {
                U7V.LJIILJJIL(new AqS160S0200000_13(error, u7t, 36));
                return;
            }
        }
        if (this.LIZ.LJFF != 4) {
            return;
        }
        if (o.LJ(error, LinkCoreError.Companion.getRTC_INIT_BACKGROUND())) {
            i = 10015;
        } else {
            i = 10031;
        }
        this.LIZ.LJJJJZ(i, "rtc_error", true);
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJIZL(LinkCoreError linkCoreError) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcStartFailed start errorCode=");
        LIZ.append(linkCoreError.getErrorCode());
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7T u7t = this.LIZ;
        int i = u7t.LJFF;
        if (i == 2) {
            U7V.LJIILJJIL(new AqS160S0200000_13(linkCoreError, u7t, 37));
        } else {
            if (i != 4) {
                return;
            }
            u7t.LJJJJZ(10032, "rtc_error", true);
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void onFirstRemoteVideoFrameRender(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameRender start linkMicId=");
        LIZ.append(str);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U7T u7t = this.LIZ;
            if (u7t.LJFF == 2) {
                U7V.LJIILJJIL(new AqS80S1100000_13(u7t, str, 5));
            }
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIJJI(String str, String str2) {
        LinkLayerRTCMessageP2PParam param;
        String linkMicId;
        String LJJJJJ = U7T.LJJJJJ(247);
        StringBuilder LIZLLL = C06540Nm.LIZLLL("onUserMsgReceived start linkMicId=", str, " message=", str2, " channelId=");
        LIZLLL.append(this.LIZ.LJI);
        LIZLLL.append(" state=");
        LIZLLL.append(this.LIZ.LJIILJJIL.LIZ);
        C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZLLL));
        LinkLayerRTCP2PMessage linkLayerRTCP2PMessage = (LinkLayerRTCP2PMessage) U7V.LJIILLIIL(LinkLayerRTCP2PMessage.class, str2);
        if (linkLayerRTCP2PMessage != null) {
            U7T u7t = this.LIZ;
            if (!o.LJ(linkLayerRTCP2PMessage.getMethod(), "linkMicSDKKickout") || (param = linkLayerRTCP2PMessage.getParam()) == null || (linkMicId = param.getLinkMicId()) == null) {
                return;
            }
            LinkUser LJJ = u7t.LJIIJJI.LJJ(linkMicId);
            Long l = null;
            if (LJJ != null) {
                l = LJJ.getUserId();
            }
            long j = u7t.LJIILIIL;
            if (l == null || l.longValue() != j) {
                return;
            }
            u7t.LJJJLL(1);
            OnLineMicInfo build = new OnLineMicInfo.Builder().build();
            U7B u7b = new U7B();
            u7b.LIZ = u7t.LLZL();
            u7b.LIZIZ = u7t.LJIIJ;
            u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(l, build));
            U7A u7a = new U7A(u7b);
            java.util.Map<Long, OnLineMicInfo> map = u7a.LIZJ;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Long, OnLineMicInfo> entry : map.entrySet()) {
                    RtcUserInfo rtcUserInfo = u7a.LIZ;
                    if (rtcUserInfo != null && entry.getKey().longValue() == rtcUserInfo.getUserId()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    u7t.LJIIIZ.LJJLIIIJILLIZJL(C78857UxB.LJJIIJ(1476788483, "bpea-linkmic_normalrtc_onKickOutRtcMessage"), "leave_with_kicked_out");
                }
            }
            Iterator<InterfaceC76675U7j> it = u7t.LJIIIIZZ.iterator();
            while (it.hasNext()) {
                it.next().LJIIIZ(u7t, u7a);
            }
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJJ(long j, String str) {
        Room room;
        LinkUser LJJ;
        long j2;
        String LJJJJJ = U7T.LJJJJJ(285);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcUserLeft start linkMicId=");
        LIZ.append(str);
        LIZ.append(" leaveReason=");
        LIZ.append(j);
        C32014ChO.LJFF(LJJJJJ, X1D.LIZIZ(LIZ));
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U7T u7t = this.LIZ;
            if (u7t.LJFF == 2) {
                U7V.LJIILJJIL(new U79(j, u7t, str));
                return;
            }
        }
        U7T u7t2 = this.LIZ;
        if (u7t2.LJFF != 4 || (room = u7t2.LJ) == null || u7t2.LJIILIIL != room.getOwnerUserId() || j != 1 || (LJJ = this.LIZ.LJIIJJI.LJJ(str)) == null) {
            return;
        }
        U7T u7t3 = this.LIZ;
        LiveRoomUser.Builder builder = new LiveRoomUser.Builder();
        Long roomId = LJJ.getRoomId();
        long j3 = -1;
        if (roomId != null) {
            j2 = roomId.longValue();
        } else {
            j2 = -1;
        }
        builder.setRoomId(j2);
        Long userId = LJJ.getUserId();
        if (userId != null) {
            j3 = userId.longValue();
        }
        builder.setUserId(j3);
        builder.setLinkMicId(str);
        LiveRoomUser build = builder.build();
        if (build.getUserId() < 0) {
            C32014ChO.LIZJ(U7T.LJJJJJ(296), "onRtcUserLeft There is an exception in live room user uid.", null);
            return;
        }
        KickOutData.Builder builder2 = new KickOutData.Builder(build);
        builder2.setKickOutReason(3);
        KickOutData build2 = builder2.build();
        String LJJJJJ2 = U7T.LJJJJJ(302);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onRtcUserLeft kick out user: ");
        LIZ2.append(build);
        LIZ2.append(", data: ");
        LIZ2.append(build2);
        C32014ChO.LJFF(LJJJJJ2, X1D.LIZIZ(LIZ2));
        u7t3.LLLLZIL(build2, null);
    }
}
