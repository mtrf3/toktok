package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcLiveVideoParam;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.U6k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76650U6k implements U8M {
    public final InterfaceC75973Trl LIZ;
    public final InterfaceC76652U6m LIZIZ;
    public final InterfaceC75011TcF LIZJ;

    @Override // X.U8M
    public final DataChannel LJIIL() {
        return null;
    }

    @Override // X.U8M
    public final void LJIILLIIL(String str, boolean z) {
    }

    @Override // X.U8M
    public final void LJIJJ(java.util.Map<String, String> map) {
    }

    @Override // X.U8M
    public final void LJJIIZ(String str) {
    }

    @Override // X.U8M
    public final void LJJIJ() {
    }

    @Override // X.U8M
    public final boolean LJJIJIIJI(String str) {
        return false;
    }

    @Override // X.U8M
    public final ILayerControl.ILayer LJJIJIIJIL() {
        return null;
    }

    @Override // X.U8M
    public final void LJJIJIL(RtcLiveVideoParam rtcLiveVideoParam) {
    }

    @Override // X.U8M
    public final void LJJIJLIJ(LinkLayerRTCMessage linkLayerRTCMessage) {
    }

    @Override // X.U8M
    public final void LJJIL() {
    }

    @Override // X.U8M
    public final void LJJIZ(String waterMarkId, Client.RTCWaterMarkRegion rTCWaterMarkRegion) {
        o.LJIIIZ(waterMarkId, "waterMarkId");
    }

    @Override // X.U8M
    public final boolean LJJJ() {
        return false;
    }

    @Override // X.U8M
    public final void LJJJIL(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
    }

    @Override // X.U8M
    public final boolean LJJJJ() {
        return false;
    }

    @Override // X.U8M
    public final void LJJJJI() {
    }

    @Override // X.U8M
    public final void LJJJJIZL(List<LinkUser> oldLinkedList, List<LinkUser> newLinkedList) {
        o.LJIIIZ(oldLinkedList, "oldLinkedList");
        o.LJIIIZ(newLinkedList, "newLinkedList");
    }

    @Override // X.U8M
    public final void LLLLLLLLL(InterfaceC76768UAy<JoinRtcChannelResult> interfaceC76768UAy) {
    }

    @Override // X.U8M
    public final ILayerControl.ILayer getLayer(String str) {
        return null;
    }

    @Override // X.U8M
    public final void removeAllWaterMarks() {
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LIZLLL() {
        return this.LIZIZ.LIZLLL();
    }

    @Override // X.U8M
    public final List<LinkUser> LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.U8M
    public final int LJIIIIZZ() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // X.U8M
    public final boolean LJIIIZ() {
        return this.LIZIZ.LJIIIZ();
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LJIILJJIL() {
        return this.LIZIZ.LJIILJJIL();
    }

    @Override // X.U8M
    public final int LJIJ() {
        return this.LIZIZ.LJIJ();
    }

    @Override // X.U8M
    public final void LJJIFFI() {
        this.LIZ.LJJIFFI();
    }

    @Override // X.U8M
    public final String LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // X.U8M
    public final java.util.Map<String, OnLineMicInfo> LJJIIJZLJL() {
        return this.LIZIZ.LJJIIJZLJL();
    }

    @Override // X.U8M
    public final List<LinkUser> LJJIIZI() {
        return this.LIZ.LJJIIZI();
    }

    @Override // X.U8M
    public final EnumC53637L3h LJJIJL() {
        return EnumC53637L3h.NONE;
    }

    @Override // X.U8M
    public final OnLineMicInfo LIZIZ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LIZIZ.LIZIZ(linkMicId);
    }

    @Override // X.U8M
    public final void LIZJ(java.util.Map<Integer, Integer> map) {
        this.LIZIZ.LIZJ(map);
    }

    @Override // X.U8M
    public final void LJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
        this.LIZIZ.LJ(seiAppData);
    }

    @Override // X.U8M
    public final LinkUser LJI(String str) {
        return this.LIZ.LJI(str);
    }

    @Override // X.U8M
    public final OnLineMicInfo LJII(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LIZIZ.LJII(linkMicId);
    }

    @Override // X.U8M
    public final void LJIIJ(InterfaceC75804Tp2 seiAppData) {
        o.LJIIIZ(seiAppData, "seiAppData");
        this.LIZ.LJIIJ(seiAppData);
    }

    @Override // X.U8M
    public final int LJIILIIL(int i) {
        return this.LIZIZ.LJIILIIL(i);
    }

    @Override // X.U8M
    public final boolean LJIILL(String layoutId) {
        o.LJIIIZ(layoutId, "layoutId");
        return this.LIZJ.LJIILL(layoutId);
    }

    @Override // X.U8M
    public final LinkUser LJIJI(long j) {
        return this.LIZ.LJIJI(j);
    }

    @Override // X.U8M
    public final OnLineMicInfo LJIJJLI(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LIZIZ.LJIJJLI(linkMicId);
    }

    @Override // X.U8M
    public final LinkUser LJIL(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LIZ.LJIL(linkMicId);
    }

    @Override // X.U8M
    public final LinkUser LJJ(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LIZ.LJJ(linkMicId);
    }

    @Override // X.U8M
    public final OnLineMicInfo LJJII(String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return this.LIZIZ.LJJII(linkMicId);
    }

    @Override // X.U8M
    public final LinkUser LJJIII(long j) {
        return this.LIZ.LJJIII(j);
    }

    @Override // X.U8M
    public final void LJJJI(U8L u8l) {
        this.LIZIZ.LJJIIZ(u8l);
    }

    public C76650U6k(U7Z u7z, C76669U7d c76669U7d, InterfaceC75011TcF dslManager) {
        o.LJIIIZ(dslManager, "dslManager");
        this.LIZ = u7z;
        this.LIZIZ = c76669U7d;
        this.LIZJ = dslManager;
    }

    @Override // X.U8M
    public final void LJIIZILJ(int i, String layoutId, UC6 uc6) {
        o.LJIIIZ(layoutId, "layoutId");
        this.LIZJ.LJIIZILJ(i, layoutId, uc6);
    }

    @Override // X.U8M
    public final void LJJI(int i, int i2, UC4 uc4) {
        this.LIZJ.LJJI(i, i2, uc4);
    }
}
