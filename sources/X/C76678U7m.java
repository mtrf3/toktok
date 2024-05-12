package X;

import Y.ARunnableS0S1202000_13;
import Y.ARunnableS12S1200000_13;
import Y.ARunnableS14S1100000_13;
import Y.ARunnableS16S0400000_13;
import Y.ARunnableS1S1201200_13;
import Y.ARunnableS2S1200100_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS3S0100200_13;
import Y.ARunnableS49S0100000_13;
import Y.ARunnableS4S1101000_13;
import Y.ARunnableS4S1201000_13;
import Y.ARunnableS5S2100000_13;
import Y.ARunnableS8S1100100_13;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.RtcErrorCalledBeforeStateChange;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.U7m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76678U7m implements U9U {
    public int LIZ = -1;
    public final /* synthetic */ U7U LIZIZ;

    @Override // X.U9U
    public final void LJI() {
    }

    @Override // X.U9U
    public final void LJIIIIZZ() {
        U4R.LIZLLL("RtcManager", "onEndSuccess start");
        C76129TuH.LIZJ = 4;
        this.LIZIZ.LIZ = false;
        U7U.LJJJJ = false;
        U7U u7u = this.LIZIZ;
        u7u.LJ = false;
        u7u.LIZIZ = false;
        this.LIZIZ.LIZLLL = false;
        U7U u7u2 = this.LIZIZ;
        u7u2.LJJIIJZLJL = null;
        u7u2.LJIIIZ("rtc_end");
        C15610jN.LIZIZ(new ARunnableS49S0100000_13(this.LIZIZ, 273));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (r1.intValue() != 4) goto L27;
     */
    @Override // X.U9U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            r11 = this;
            java.lang.String r2 = "RtcManager"
            java.lang.String r0 = "onStartSuccess start"
            X.U4R.LIZLLL(r2, r0)
            X.U7U r0 = r11.LIZIZ
            r1 = 1
            r0.LJJIJIIJI = r1
            com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkRtcRoomManagerFixSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkRtcRoomManagerFixSetting.INSTANCE
            boolean r0 = r0.isOpt()
            if (r0 == 0) goto L1d
            X.U84.LIZ(r1)
            X.U7U r0 = r11.LIZIZ
            com.ss.avframework.livestreamv2.core.interact.Client r0 = r0.LJII
            X.U84.LIZJ = r0
        L1d:
            X.U7U r0 = r11.LIZIZ
            boolean r0 = r0.LJJIIJ()
            if (r0 != 0) goto L2b
            X.TYs r0 = X.C74838TYs.LJ()
            r0.LJJIIJ = r1
        L2b:
            X.U7U r0 = r11.LIZIZ
            X.U66 r4 = r0.LJIIIZ
            if (r4 == 0) goto L4f
        L32:
            long r8 = r0.LJJIJ
            long r6 = X.C31012CFc.LIZIZ()
            X.UAs r5 = X.UA9.LIZJ()
            r5.getClass()
            Y.ARunnableS0S0200200_13 r3 = new Y.ARunnableS0S0200200_13
            r10 = 0
            r3.<init>(r4, r5, r6, r8, r10)
            X.UC0.LJJLIIIIJ(r3)
            X.U7W r0 = r4.LLLZIIL()
            r0.LJIIZILJ(r4)
        L4f:
            X.U7U r0 = r11.LIZIZ
            r0.LIZ = r1
            X.U7U r0 = r11.LIZIZ
            r3 = 0
            r0.LIZIZ = r3
            X.U7U r0 = r11.LIZIZ
            r0.LIZJ = r3
            X.U7U r0 = r11.LIZIZ
            X.U7r r0 = r0.LJIIJJI
            r4 = 4
            if (r0 == 0) goto L66
            r0.LIZIZ(r4)
        L66:
            X.U7U r0 = r11.LIZIZ
            boolean r0 = r0.LJIILIIL
            r1 = 0
            if (r0 != 0) goto L79
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting.isEnable()
            if (r0 == 0) goto L82
            X.U7U r0 = r11.LIZIZ
            boolean r0 = r0.LJJIJIIJIL
            if (r0 == 0) goto L82
        L79:
            X.U7U r0 = r11.LIZIZ
            r0.LJJJZ(r1)
            X.U7U r0 = r11.LIZIZ
            r0.LJJIJIIJIL = r3
        L82:
            X.U7U r0 = r11.LIZIZ
            X.U66 r0 = r0.LJIIIZ
            if (r0 == 0) goto L90
            int r0 = r0.getScene()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L90:
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostCrossRoomPushSDKSetting.isEnable()
            if (r0 == 0) goto Le1
            if (r1 != 0) goto Ld0
        L98:
            java.lang.String r1 = ""
        L9a:
            X.U7U r4 = r11.LIZIZ
            r4.LJJIIZI = r1
            X.Ol8 r0 = X.UB5.LIZ
            java.lang.Object r0 = r0.getValue()
            X.UBG r0 = (X.UBG) r0
            r0.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "perf start, scene="
            r1.append(r0)
            java.lang.String r0 = r4.LJJIIZI
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.U4R.LIZLLL(r2, r0)
            Y.ARunnableS49S0100000_13 r2 = new Y.ARunnableS49S0100000_13
            X.U7U r1 = r11.LIZIZ
            r0 = 274(0x112, float:3.84E-43)
            r2.<init>(r1, r0)
            X.C15610jN.LIZIZ(r2)
            X.U7U r0 = r11.LIZIZ
            r0.LIZLLL(r3)
            return
        Ld0:
            int r0 = r1.intValue()
            if (r0 != r4) goto Ld7
            goto Lea
        Ld7:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L98
            java.lang.String r1 = "com.ss.android.ugc.aweme.multihost"
            goto L9a
        Le1:
            if (r1 != 0) goto Le4
            goto L98
        Le4:
            int r0 = r1.intValue()
            if (r0 != r4) goto L98
        Lea:
            java.lang.String r1 = "com.ss.android.ugc.aweme.multiguest"
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76678U7m.LJIILIIL():void");
    }

    @Override // X.U9U
    public final void LJIIIZ() {
        U66 u66;
        if (MtCoHostCrossRoomPushSDKSetting.isEnable() && (u66 = this.LIZIZ.LJIIIZ) != null && u66.getScene() == 2) {
            Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
            while (it.hasNext()) {
                it.next().LJIIL();
            }
        }
    }

    public C76678U7m(U7U u7u) {
        this.LIZIZ = u7u;
    }

    @Override // X.U9U
    public final void LJIIJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWarn message ");
        LIZ.append(str);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        C15610jN.LIZIZ(new ARunnableS49S0100000_13(this.LIZIZ, str, 275));
    }

    @Override // X.U9U
    public final void LJIILL(String str) {
        C76683U7r c76683U7r;
        UC7.LJ("onFirstRemoteAudio linkMicId = ", str, "RtcManager");
        if (this.LIZIZ.LJIIIZ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFirstRemoteAudio mLinker is null linkMicId=");
            LIZ.append(str);
            U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        }
        U7U u7u = this.LIZIZ;
        U66 u66 = u7u.LJIIIZ;
        if (u66 != null) {
            UC0.LJJLIIIIJ(new ARunnableS14S1100000_13(u66, str, 13));
            if (u7u.LJJIFFI(u66, str)) {
                u66.LLLZIIL().LJIIJJI(u66, str, "2");
            }
        }
        Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().LJIILL(str);
        }
        U66 u662 = this.LIZIZ.LJIIIZ;
        if (u662 != null && u662.getScene() == 4 && (c76683U7r = this.LIZIZ.LJIIJJI) != null) {
            c76683U7r.LIZIZ(5);
        }
        C15610jN.LIZIZ(new ARunnableS14S1100000_13(this.LIZIZ, str, 19));
    }

    public final void LJIJJ(String str) {
        if (C76726U9i.LIZ(str)) {
            this.LIZIZ.getClass();
        }
        if (this.LIZIZ.LJIIIZ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFirstRemoteVideoFrame mLinker is null linkMicId=");
            LIZ.append(str);
            U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        }
        U66 u66 = this.LIZIZ.LJIIIZ;
        if (u66 != null) {
            UC0.LJJLIIIIJ(new ARunnableS14S1100000_13(u66, str, 14));
        }
    }

    public final void LJIJJLI(String str) {
        if (this.LIZIZ.LJIIIZ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFirstRemoteVideoFrameRender mLinker is null linkMicId=");
            LIZ.append(str);
            U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        }
        U7U u7u = this.LIZIZ;
        U66 u66 = u7u.LJIIIZ;
        if (u66 != null) {
            UC0.LJJLIIIIJ(new ARunnableS14S1100000_13(u66, str, 15));
            if (u7u.LJJIFFI(u66, str)) {
                u66.LLLZIIL().LJIIJJI(u66, str, "1");
            }
        }
        Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().onFirstRemoteVideoFrameRender(str);
        }
        C76683U7r c76683U7r = this.LIZIZ.LJIIJJI;
        if (c76683U7r != null) {
            c76683U7r.LIZIZ(5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r6 != null) goto L11;
     */
    @Override // X.U9U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRemoteVideoStats(com.ss.bytertc.engine.type.RemoteStreamStats r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L6
            java.lang.String r4 = r6.uid
            if (r4 != 0) goto L8
        L6:
            java.lang.String r4 = ""
        L8:
            r3 = 0
            if (r6 == 0) goto L22
            com.ss.bytertc.engine.type.RemoteVideoStats r0 = r6.videoStats
            if (r0 == 0) goto L22
            float r2 = r0.receivedKBitrate
        L11:
            com.ss.bytertc.engine.type.RemoteAudioStats r0 = r6.audioStats
            if (r0 == 0) goto L17
            float r3 = r0.receivedKBitrate
        L17:
            X.U9G r1 = new X.U9G
            X.U7U r0 = r5.LIZIZ
            r1.<init>(r0, r4, r2, r3)
            X.C15610jN.LIZIZ(r1)
            return
        L22:
            r2 = 0
            if (r6 == 0) goto L17
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76678U7m.onRemoteVideoStats(com.ss.bytertc.engine.type.RemoteStreamStats):void");
    }

    @Override // X.U9U
    public final void onUserJoined(String str) {
        UC7.LJ("onUserJoined start linkMicId=", str, "RtcManager");
        if (this.LIZIZ.LJIIIZ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onUserJoined mLinker is null linkMicId=");
            LIZ.append(str);
            U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        }
        U66 u66 = this.LIZIZ.LJIIIZ;
        if (u66 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS12S1200000_13(u66, LIZJ, str, 7));
        }
        C15610jN.LIZIZ(new ARunnableS14S1100000_13(this.LIZIZ, str, 20));
        this.LIZIZ.LJJ.add(str);
    }

    @Override // X.U9U
    public final void LIZ(SurfaceView surfaceView, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameRender start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" surfaceView=");
        LIZ.append(surfaceView);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        LJIJJLI(str);
        C15610jN.LIZIZ(new ARunnableS12S1200000_13(this.LIZIZ, str, surfaceView, 11));
    }

    @Override // X.U9U
    public final void LIZIZ(int i, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMsgSentResult start msgId = ");
        LIZ.append(j);
        LIZ.append(" code=");
        LIZ.append(i);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        C15610jN.LIZIZ(new ARunnableS49S0100000_13(this.LIZIZ, j, i, 276));
    }

    @Override // X.U9U
    public final void LIZLLL(long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserLeaved linkMicId=");
        LIZ.append(str);
        LIZ.append(" leaveReason=");
        LIZ.append(j);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        if (C76726U9i.LIZ(str)) {
            this.LIZIZ.getClass();
        }
        this.LIZIZ.LJIL.remove(str);
        U7U u7u = this.LIZIZ;
        U66 u66 = u7u.LJIIIZ;
        if (u66 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS2S1200100_13(u66, LIZJ, str, j, 1));
            if (u7u.LJJIFFI(u66, str)) {
                u66.LLLZIIL().LJIIJ(str, u66, false, j, -1L, "");
            }
            u66.LLLZIIL().LJIJJ(j, u66, str);
        }
        Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().LJJJJJ(j, str);
        }
        C15610jN.LIZIZ(new ARunnableS8S1100100_13(j, this.LIZIZ, str, 4));
        this.LIZIZ.LJJ.remove(str);
    }

    @Override // X.U9U
    public final void LJ(long j, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomMsgSentResult start msgId = ");
        LIZ.append(j);
        LIZ.append(" code=");
        LIZ.append(i);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        C15610jN.LIZIZ(new RunnableC76720U9c(this.LIZIZ, j, i));
    }

    @Override // X.U9U
    public final void LJIIJJI(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMsgReceived start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" message=");
        LIZ.append(str2);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U78.LIZ(this.LIZIZ.LJIIIZ, str, str2, "receive");
        Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().LJIIJJI(str, str2);
        }
        C15610jN.LIZIZ(new ARunnableS5S2100000_13(this.LIZIZ, str, str2, 5));
    }

    @Override // X.U9U
    public final void LJIIL(long j, long j2) {
        C15610jN.LIZIZ(new ARunnableS3S0100200_13(j, j2, this.LIZIZ, 2));
    }

    @Override // X.U9U
    public final void LJIILLIIL(Boolean bool, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRemoteAudioMute start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" mute=");
        LIZ.append(bool);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U66 u66 = this.LIZIZ.LJIIIZ;
        if (u66 != null) {
            UC0.LJJLIIIIJ(new ARunnableS12S1200000_13(u66, str, bool, 5));
        }
        if (bool != null) {
            bool.booleanValue();
            C15610jN.LIZIZ(new ARunnableS12S1200000_13(this.LIZIZ, str, bool, 12));
        }
    }

    @Override // X.U9U
    public final void LJIIZILJ(String str, ILayerControl.ILayer iLayer) {
        LJIJJ(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrame start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" layer=");
        LIZ.append(iLayer);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
    }

    @Override // X.U9U
    public final void LJIJ(String str, ILayerControl.ILayer iLayer) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameRender start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" layer=");
        LIZ.append(iLayer);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        LJIJJLI(str);
        C15610jN.LIZIZ(new ARunnableS12S1200000_13(this.LIZIZ, str, iLayer, 10));
    }

    @Override // X.U9U
    public final void LJIJI(Boolean bool, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRemoteVideoMute start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" mute=");
        LIZ.append(bool);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        U66 u66 = this.LIZIZ.LJIIIZ;
        if (u66 != null) {
            UC0.LJJLIIIIJ(new ARunnableS12S1200000_13(u66, str, bool, 6));
        }
        if (bool != null) {
            bool.booleanValue();
            C15610jN.LIZIZ(new ARunnableS12S1200000_13(this.LIZIZ, str, bool, 13));
        }
    }

    @Override // X.U9U
    public final void LJJIII(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomMsgReceived start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" message=");
        LIZ.append(str2);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        C76671U7f c76671U7f = this.LIZIZ.LJJIJLIJ;
        if (c76671U7f != null) {
            c76671U7f.LIZIZ(new ARunnableS5S2100000_13(c76671U7f, str2, str, 3));
        }
        Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL(str, str2);
        }
        C15610jN.LIZIZ(new ARunnableS5S2100000_13(this.LIZIZ, str, str2, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Throwable] */
    @Override // X.U9U
    public final void LIZJ(int i, String str, Exception exc) {
        Long l;
        U4R.LIZIZ("RtcManager", "onEndFailed start");
        C76129TuH.LIZJ = 4;
        this.LIZIZ.LIZ = false;
        U7U.LJJJJ = false;
        U7U u7u = this.LIZIZ;
        u7u.LJ = false;
        u7u.LJJIIJZLJL = null;
        if (u7u.LJI) {
            U4R.LIZIZ("RtcManager", "onEndFailed mUnrecoverableErrorHappened == true");
            return;
        }
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this.LIZIZ, new LinkCoreError(i, str), 145));
        C75516TkO c75516TkO = C75516TkO.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("channelId: ");
        U66 u66 = this.LIZIZ.LJIIIZ;
        if (u66 != null) {
            l = Long.valueOf(u66.LJJLI());
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(" code ");
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        Exception exc2 = exc;
        if (exc == null) {
            exc2 = new Throwable("onEndFailed");
        }
        c75516TkO.LIZIZ(20002, LIZIZ, exc2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Throwable] */
    @Override // X.U9U
    public final void LJFF(int i, String str, Exception exc) {
        Long l;
        C76683U7r c76683U7r;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError start code=");
        LIZ.append(i);
        LIZ.append(" desc=");
        LIZ.append(str);
        U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        U66 u66 = this.LIZIZ.LJIIIZ;
        if (u66 != null) {
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS4S1201000_13(i, u66, LIZJ, str, 7));
            u66.LLLZIIL().LJIILJJIL(i, u66, str);
        }
        this.LIZIZ.LIZIZ = false;
        this.LIZIZ.LJI = true;
        if (RtcErrorCalledBeforeStateChange.INSTANCE.getValue()) {
            Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
            while (it.hasNext()) {
                it.next().LJJI(new LinkCoreError(i, str));
            }
        }
        U66 u662 = this.LIZIZ.LJIIIZ;
        if (u662 != null && u662.getScene() == 2 && (c76683U7r = this.LIZIZ.LJIIJJI) != null) {
            c76683U7r.LIZIZ(0);
        }
        if (!RtcErrorCalledBeforeStateChange.INSTANCE.getValue()) {
            Iterator<InterfaceC76734U9q> it2 = this.LIZIZ.LJIIL.iterator();
            while (it2.hasNext()) {
                it2.next().LJJI(new LinkCoreError(i, str));
            }
        }
        this.LIZIZ.LJIIIZ("rtc_error");
        C15610jN.LIZIZ(new ARunnableS4S1101000_13(i, this.LIZIZ, str, 4));
        C75516TkO c75516TkO = C75516TkO.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("channelId: ");
        U66 u663 = this.LIZIZ.LJIIIZ;
        if (u663 != null) {
            l = Long.valueOf(u663.LJJLI());
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(" code ");
        LIZ2.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        Exception exc2 = exc;
        if (exc == null) {
            exc2 = new Throwable("onError");
        }
        c75516TkO.LIZIZ(20001, LIZIZ, exc2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Throwable] */
    @Override // X.U9U
    public final void LJII(int i, String str, Exception exc) {
        Long l;
        C76683U7r c76683U7r;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStartFailed start code:");
        LIZ.append(i);
        LIZ.append(", desc:");
        LIZ.append(str);
        U4R.LIZIZ("RtcManager", X1D.LIZIZ(LIZ));
        this.LIZIZ.LJJIJIIJI = false;
        if (!this.LIZIZ.LJJIIJ()) {
            C74838TYs.LJ().LJJIIJ = false;
        }
        U7U u7u = this.LIZIZ;
        U66 u66 = u7u.LJIIIZ;
        if (u66 != null) {
            long j = u7u.LJJIJ;
            long LIZIZ = C31012CFc.LIZIZ();
            C76762UAs LIZJ = UA9.LIZJ();
            LIZJ.getClass();
            UC0.LJJLIIIIJ(new ARunnableS1S1201200_13(u66, str, i, LIZJ, LIZIZ, j, 0));
            u66.LLLZIIL().LJIILL(i, u66, str);
        }
        this.LIZIZ.LIZIZ = false;
        this.LIZIZ.LIZJ = false;
        U66 u662 = this.LIZIZ.LJIIIZ;
        if (u662 != null && u662.getScene() == 2 && (c76683U7r = this.LIZIZ.LJIIJJI) != null) {
            c76683U7r.LIZIZ(0);
        }
        Iterator<InterfaceC76734U9q> it = this.LIZIZ.LJIIL.iterator();
        while (it.hasNext()) {
            it.next().LJJJJIZL(new LinkCoreError(i, str));
        }
        this.LIZIZ.LJIIIZ("join_channel_error");
        C15610jN.LIZIZ(new ARunnableS4S1101000_13(i, this.LIZIZ, str, 5));
        C75516TkO c75516TkO = C75516TkO.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("channelId: ");
        U66 u663 = this.LIZIZ.LJIIIZ;
        if (u663 != null) {
            l = Long.valueOf(u663.LJJLI());
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(" code: ");
        LIZ2.append(i);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        Exception exc2 = exc;
        if (exc == null) {
            exc2 = new Throwable("onStartFailed");
        }
        c75516TkO.LIZIZ(20000, LIZIZ2, exc2, null);
    }

    @Override // X.U9U
    public final void LJIILJJIL(int i, long j, Object... objArr) {
        C15610jN.LIZIZ(new ARunnableS32S0200000_13(this.LIZIZ, i, j, objArr, 146));
    }

    @Override // X.U9U
    public final void LJJII(int i, int i2, String str) {
        String str2;
        U66 u66 = this.LIZIZ.LJIIIZ;
        if (u66 != null) {
            str2 = u66.LLZLL();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, str) && this.LIZ != i) {
            StringBuilder LJ = AnonymousClass028.LJ("onNetworkQualityUpdate linkMicId = ", str, ", txQuality = ", i, ", rxQuality = ");
            LJ.append(i2);
            U4R.LIZLLL("RtcManager", X1D.LIZIZ(LJ));
            this.LIZ = i;
        }
        C15610jN.LIZIZ(new RunnableC76735U9r(this.LIZIZ, str, i, i2));
    }

    @Override // X.U9U
    public final void LJJIIJ(String[] strArr, boolean[] zArr, int[] iArr) {
        C15610jN.LIZIZ(new ARunnableS16S0400000_13(this.LIZIZ, strArr, zArr, iArr, 15));
    }

    @Override // X.U9U
    public final void LJJIJIL(String str, SurfaceView surfaceView, int i, int i2) {
        LJIJJ(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrame start linkMicId = ");
        LIZ.append(str);
        LIZ.append(" surfaceView=");
        LIZ.append(surfaceView);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        C15610jN.LIZIZ(new ARunnableS0S1202000_13(this.LIZIZ, str, i, i2, surfaceView, 4));
    }
}
