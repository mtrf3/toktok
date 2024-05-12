package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestWatermarkBugfixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U63 implements U9F {
    public int LJLIL = -1;
    public final HashMap<String, HashSet<String>> LJLILLLLZI = new HashMap<>();
    public final /* synthetic */ U65 LJLJI;

    @Override // X.U9F
    public final void LJIIL(long j, long j2) {
    }

    @Override // X.U9F
    public final void LJLLLLLL(LinkCoreError linkCoreError) {
    }

    @Override // X.U9F
    public final void LLFF() {
    }

    @Override // X.U9F
    public final void LLIFFJFJJ() {
    }

    @Override // X.U9F
    public final void LLIIIL(Object... objArr) {
    }

    @Override // X.U9F
    public final void LJJIFFI() {
        U4R.LIZLLL("LiveLinkMicSession", "onStartJoinRtcChannel start");
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJIFFI();
        }
    }

    @Override // X.U9F
    public final void LJJIJIIJIL() {
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJIJIIJIL();
        }
    }

    @Override // X.U9F
    public final RTCClientData LJJIJL() {
        UB9 ub9;
        U4R.LIZLLL("LiveLinkMicSession", "onRtcEngineTurnOn start");
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJLIIIJLJLI(u65, u65.LJLJL);
        }
        C75745To5 c75745To5 = this.LJLJI.LJLJL;
        String str = null;
        if (c75745To5 == null) {
            return null;
        }
        U65 u652 = this.LJLJI;
        u652.getClass();
        RTCClientData.Builder builder = new RTCClientData.Builder();
        InterfaceC76645U6f interfaceC76645U6f = c75745To5.LIZJ;
        if (interfaceC76645U6f != null) {
            ub9 = interfaceC76645U6f.create();
        } else {
            ub9 = null;
        }
        builder.setClient(ub9);
        builder.setShouldMixStream(c75745To5.LIZ);
        MixInfo.Builder builder2 = new MixInfo.Builder();
        MixInfo mixInfo = c75745To5.LIZIZ;
        if (mixInfo != null) {
            str = mixInfo.getStreamUrl();
        }
        builder2.setStreamUrl(str);
        builder2.setStreamMixer(u652.LJFF().LJJIIZI());
        builder.setMixerInfo(builder2.build());
        builder.setPushAdvance(c75745To5.LIZLLL);
        builder.setInitInBackground(c75745To5.LJ);
        builder.setBackground(c75745To5.LJFF);
        builder.setGenerateRTCParamByRole(c75745To5.LJI);
        builder.setBusinessSideEnableIndependentMixStreamParams(c75745To5.LJII);
        builder.setSharedBgUrl(c75745To5.LJIIJ);
        return builder.build();
    }

    @Override // X.U9F
    public final void LJLJJL() {
        U4R.LIZLLL("LiveLinkMicSession", "onStartPushStream start");
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLILZ(u65);
        }
    }

    public U63(U65 u65) {
        this.LJLJI = u65;
    }

    @Override // X.U9F
    public final void LJIILL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        UC7.LJ("onFirstRemoteAudio start linkMicId=", linkMicId, "LiveLinkMicSession");
        if (this.LJLJI.LJLILLLLZI == 4) {
            LIZIZ(linkMicId, null, null);
        }
    }

    @Override // X.U9F
    public final HashSet<String> LJIILLIIL(String str) {
        return this.LJLILLLLZI.get(str);
    }

    @Override // X.U9F
    public final void LJIJJLI(String source) {
        o.LJIIIZ(source, "source");
        UC7.LJ("onTurnOffEngine start source=", source, "LiveLinkMicSession");
        this.LJLJI.LJFF().LJJJJIZL.LIZLLL(this.LJLJI.LJLJJL.LLZL().getLinkMicId(), -1L);
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJIJJLI(source);
        }
    }

    @Override // X.U9F
    public final void LJJI(LinkCoreError error) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcError start error=");
        LIZ.append(error);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJJLL(u65, error);
        }
    }

    @Override // X.U9F
    public final void LJLIIL(RtcStartResultMessage rtcStartResultMessage) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcStartResult start rtcStartResultMessage=");
        LIZ.append(rtcStartResultMessage);
        LIZ.append(" baseRtcCallback = ");
        LIZ.append(this.LJLJI.LJFF().LJJJJIZL.hashCode());
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        if (rtcStartResultMessage.getStartSuccess()) {
            U8I u8i = this.LJLJI.LJFF().LJJJJIZL;
            u8i.LIZ.getClass();
            String LJJJ = U8H.LJJJ(580);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onStartSuccess, config.liveType:");
            LIZ2.append(u8i.LIZ.LIZ.LIZLLL);
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ2));
            if (!o.LJ(u8i.LIZ.LIZ.LIZLLL, "live_voice")) {
                U8Q u8q = (U8Q) u8i.LIZ.LJJIJIIJIL.getValue();
                u8q.getClass();
                if (LinkMicMultiGuestWatermarkBugfixSetting.INSTANCE.getValue()) {
                    C29306Beo.LJJJ(new AqS163S0100000_13(u8q, 502));
                } else {
                    u8q.LIZJ = null;
                    u8q.LIZIZ.clear();
                }
            }
            u8i.LIZ.LJJIJIIJIL("start success");
        }
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLIIIJ(u65, rtcStartResultMessage);
        }
    }

    @Override // X.U9F
    public final void LLILLL(String str) {
        UC7.LJ("onSendRtcRoomMessage start msgStr=", str, "LiveLinkMicSession");
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJJJZI(u65, str);
        }
    }

    @Override // X.U9F
    public final void LLIZLLLIL(LinkCoreError error) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.U9F
    public final void onUserJoined(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        UC7.LJ("onUserJoined start linkMicId=", linkMicId, "LiveLinkMicSession");
        this.LJLJI.LJFF().LJJJJIZL.LIZJ(linkMicId);
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            U62 it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            LinkUser.Builder builder = new LinkUser.Builder();
            builder.setLinkMicId(linkMicId);
            it2.LJLI(u65, builder.build(), null);
        }
        if (this.LJLJI.LLLLZLLIL() && this.LJLJI.LJLILLLLZI == 4) {
            LIZIZ(linkMicId, null, null);
        }
    }

    @Override // X.U9F
    public final void LIZ(SurfaceView surfaceView, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(surfaceView, "surfaceView");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrame start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" surfaceView=");
        LIZ.append(surfaceView);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        LIZIZ(linkMicId, surfaceView, null);
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LIZ(surfaceView, linkMicId);
        }
    }

    @Override // X.U9F
    public final void LJ(long j, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomMsgSentResult start msgId=");
        LIZ.append(j);
        LIZ.append(" code=");
        LIZ.append(i);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJ(j, i);
        }
    }

    @Override // X.U9F
    public final void LJIIJJI(String linkMicId, String message) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMsgReceived start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" message=");
        LIZ.append(message);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJLJLLL(u65, linkMicId, message);
        }
    }

    @Override // X.U9F
    public final void LJIJ(String linkMicId, ILayerControl.ILayer layer) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(layer, "layer");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrame start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" layer=");
        LIZ.append(layer);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        LIZIZ(linkMicId, null, layer);
    }

    @Override // X.U9F
    public final void LJIJI(String str, String str2) {
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            U62 next = it.next();
            try {
                next.LJIJI(str, str2);
            } catch (Throwable th) {
                String LJIIIIZZ = U65.LJIIIIZZ(1109);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(next);
                LIZ.append(" -->failed，");
                LIZ.append(th.getMessage());
                C32014ChO.LIZJ(LJIIIIZZ, X1D.LIZIZ(LIZ), null);
            }
        }
    }

    @Override // X.U9F
    public final void LJJIII(String linkMicId, String message) {
        String layoutId;
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(message, "message");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomMsgReceived start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" message=");
        LIZ.append(message);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        LinkLayerRTCMessage linkLayerRTCMessage = (LinkLayerRTCMessage) U7V.LJIILLIIL(LinkLayerRTCMessage.class, message);
        if (linkLayerRTCMessage != null) {
            U65 u65 = this.LJLJI;
            if (o.LJ(linkLayerRTCMessage.getMethod(), "linkMicSDKLayoutChange")) {
                U8I u8i = u65.LJFF().LJJJJIZL;
                u8i.getClass();
                u8i.LIZ.getClass();
                String LJJJ = U8H.LJJJ(522);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(u8i.LIZ.LJJIJ());
                LIZ2.append(":onRoomMsgReceived LINK_LAYER_LAYOUT_CHANGE param = ");
                LIZ2.append(linkLayerRTCMessage.getParam());
                C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ2));
                LinkLayerRTCMessageParam param = linkLayerRTCMessage.getParam();
                if (param != null && (layoutId = param.getLayoutId()) != null) {
                    U8H u8h = u8i.LIZ;
                    u8h.LIZ.LJFF.LJIIZILJ(u8h.LJIIL.LJLIL, layoutId, new U6G(u8h, linkMicId, layoutId));
                }
            }
        }
        U65 u652 = this.LJLJI;
        Iterator<U62> it = u652.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJLLI(u652, linkMicId, message);
        }
    }

    @Override // X.U9F
    public final void LJJIIZI(String linkMicId, long j) {
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserLeft start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" leaveReason=");
        LIZ.append(j);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        this.LJLJI.LJFF().LJJJJIZL.LIZLLL(linkMicId, j);
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJIIZI(linkMicId, j);
        }
    }

    @Override // X.U9F
    public final void LJJIL(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRemoteAudioMute start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" mute=");
        LIZ.append(z);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJIJIL(linkMicId, false, z);
        }
    }

    @Override // X.U9F
    public final void LJLLI(boolean z, LinkCoreError linkCoreError) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcEndResult start success=");
        LIZ.append(z);
        LIZ.append(" error=");
        LIZ.append(linkCoreError);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        U65 u65 = this.LJLJI;
        Iterator<U62> it = u65.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LLIIZ(u65, z, linkCoreError);
        }
    }

    @Override // X.U9F
    public final void LLF(String linkMicId, boolean z) {
        o.LJIIIZ(linkMicId, "linkMicId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRemoteVideoMute start linkMicId=");
        LIZ.append(linkMicId);
        LIZ.append(" mute=");
        LIZ.append(z);
        U4R.LIZLLL("LiveLinkMicSession", X1D.LIZIZ(LIZ));
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJIJIL(linkMicId, true, z);
        }
    }

    public final void LIZIZ(String str, SurfaceView surfaceView, ILayerControl.ILayer iLayer) {
        this.LJLJI.LJFF().LJJJJIZL.LIZ(str, surfaceView, iLayer);
        if (MtCoHostCrossRoomPushSDKSetting.isEnable()) {
            U65 u65 = this.LJLJI;
            if (u65.LJLILLLLZI == 2) {
                Iterator<U62> it = u65.LJLJJLL.iterator();
                while (it.hasNext()) {
                    it.next().LL(u65, str);
                }
                return;
            }
        }
        U65 u652 = this.LJLJI;
        if (u652.LJLILLLLZI == 4) {
            String linkMicId = u652.LJLJJL.LLZL().getLinkMicId();
            if (!this.LJLILLLLZI.containsKey(linkMicId)) {
                this.LJLILLLLZI.put(linkMicId, new HashSet<>());
            }
            HashSet<String> hashSet = this.LJLILLLLZI.get(linkMicId);
            if (hashSet != null) {
                U65 u653 = this.LJLJI;
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    Iterator<U62> it2 = u653.LJLJJLL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LL(u653, str);
                    }
                }
            }
        }
    }

    @Override // X.U9F
    public final void LJIIZILJ(String linkMicId, float f, float f2) {
        o.LJIIIZ(linkMicId, "linkMicId");
        U4R.LIZLLL("LiveLinkMicSession", "onRemoteVideoStats");
        U65 u65 = this.LJLJI;
        if (u65.LJLILLLLZI == 2) {
            Iterator<U62> it = u65.LJLJJLL.iterator();
            while (it.hasNext()) {
                it.next().LJIIZILJ(linkMicId, f, f2);
            }
        }
    }

    @Override // X.U9F
    public final void LJJII(int i, int i2, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        if (this.LJLJI.LJLJJI.getOwnerUserId() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId() && o.LJ(linkMicId, this.LJLJI.LJLJJL.LLZLL()) && i != this.LJLIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LiveLinkMicSession_onNetworkQualityUpdate linkMicId = ");
            LIZ.append(linkMicId);
            LIZ.append(" txQuality = ");
            LIZ.append(i);
            U4R.LIZ("NetworkStateTips", X1D.LIZIZ(LIZ));
            U65 u65 = this.LJLJI;
            Iterator<U62> it = u65.LJLJJLL.iterator();
            while (it.hasNext()) {
                it.next().LJJJJIZL(u65, i, i2);
            }
            this.LJLIL = i;
        }
    }

    @Override // X.U9F
    public final void LJJIIJ(String[] linkIds, boolean[] talkStates, int[] talkVolumes) {
        o.LJIIIZ(linkIds, "linkIds");
        o.LJIIIZ(talkStates, "talkStates");
        o.LJIIIZ(talkVolumes, "talkVolumes");
        Iterator<U62> it = this.LJLJI.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().LJJIZ(linkIds, talkStates, talkVolumes);
        }
    }

    @Override // X.U9F
    public final void LJJIJIL(String linkMicId, SurfaceView surfaceView, int i, int i2) {
        o.LJIIIZ(linkMicId, "linkMicId");
        o.LJIIIZ(surfaceView, "surfaceView");
    }
}
