package X;

import Y.ARunnableS8S1100100_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestMonitorConfigSetting;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.U7f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76671U7f implements InterfaceC76734U9q {
    public U66 LIZIZ;
    public U7U LIZJ;
    public boolean LJ;
    public volatile boolean LJFF;
    public long LIZ = -1;
    public final long LIZLLL = LiveSdkMultiGuestMonitorConfigSetting.INSTANCE.getValue().timeOUt * 1000;
    public final HashMap<String, HashSet<Long>> LJI = new HashMap<>();
    public final C62822Ol8 LJII = C221108m2.LIZIZ(UBE.LJLIL);
    public final HashSet<String> LJIIIIZZ = C77275UUl.LIZLLL("linkMicLayerFloatPosition", "linkMicSDKLayoutChange", "linkMicSDKVideoMute", "linkMicSDKAudioMute");

    @Override // X.InterfaceC76734U9q
    public final void LJIIJJI(String str, String str2) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIIL() {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILL(String str) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJIILLIIL(String str, String str2) {
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJIZL(LinkCoreError linkCoreError) {
    }

    @Override // X.InterfaceC76734U9q
    public final void onFirstRemoteVideoFrameRender(String str) {
    }

    public final void LIZIZ(Runnable runnable) {
        if (!this.LJFF) {
            ((C76765UAv) this.LJII.getValue()).LIZIZ(runnable);
        } else {
            U4R.LIZLLL("RtcRoomMsgSuccessRateMonitor", "RtcRoomMsgSuccessRateMonitor isDestroy, you need to create a new RtcRoomMsgSuccessRateMonitor to use");
        }
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJI(LinkCoreError error) {
        o.LJIIIZ(error, "error");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r1 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76671U7f.LIZ(java.lang.String, java.util.HashMap):void");
    }

    @Override // X.InterfaceC76734U9q
    public final void LJJJJJ(long j, String str) {
        LIZIZ(new ARunnableS8S1100100_13(j, this, str, 2));
    }
}
