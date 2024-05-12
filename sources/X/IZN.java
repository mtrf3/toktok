package X;

import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes9.dex */
public final class IZN implements InterfaceC47787IpD {
    public final /* synthetic */ C46882Iac LJLIL;
    public final /* synthetic */ IZM LJLILLLLZI;

    public final void LIZIZ() {
        IZM izm = this.LJLILLLLZI;
        SimRadar.keyScan("EngineDataSourceHelper", "replayWhenVidFailed", izm.LJLJI, this.LJLIL, izm.LJLJJI);
        IXO ixo = (IXO) C78926UyI.LJIJI("header_dashinfo", this.LJLILLLLZI.LJLJJL);
        if (ixo != null) {
            ixo.LJ = null;
        }
        String LJJIIJ = C78926UyI.LJJIIJ("header_url", this.LJLILLLLZI.LJLJJL);
        try {
            IZM izm2 = this.LJLILLLLZI;
            ((IZL) izm2.LJLILLLLZI).LJJLIIIIJ(null, LJJIIJ, izm2.LJLJJL);
        } catch (Exception unused) {
            IZM izm3 = this.LJLILLLLZI;
            SimRadar.keyScan("EngineDataSourceHelper", "replayWhenVidFailed - Error", izm3.LJLJI, this.LJLIL, izm3.LJLJJI);
        }
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onABRPredictBitrate(int i, int i2) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onAVBadInterlaced(java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onBufferEnd(int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onBufferStart(int i, int i2, int i3) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onCompletion(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onCurrentPlaybackTimeUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onFrameAboutToBeRendered(TTVideoEngine tTVideoEngine, int i, long j, long j2, java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onFrameDraw(int i, java.util.Map map) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onInfoIdChanged(int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onReadyForDisplay(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onRenderStart(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onSARChanged(int i, int i2) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
    }

    @Override // X.InterfaceC47787IpD
    public final /* synthetic */ void onVideoURLRouteFailed(C47789IpF c47789IpF, String str) {
    }

    public final boolean LIZ() {
        boolean z;
        String LJJIIJ = C78926UyI.LJJIIJ("header_url", this.LJLILLLLZI.LJLJJL);
        IXO ixo = (IXO) C78926UyI.LJIJI("header_dashinfo", this.LJLILLLLZI.LJLJJL);
        boolean z2 = !TextUtils.isEmpty(LJJIIJ);
        if (ixo != null && !TextUtils.isEmpty(ixo.LJ)) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && z && ((Boolean) IZ8.LJJZZI.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47787IpD
    public final void onError(C47789IpF c47789IpF) {
        IZM izm = this.LJLILLLLZI;
        SimRadar.keyScan("EngineDataSourceHelper", "onError", izm.LJLJI, this.LJLIL, izm.LJLJJI, c47789IpF);
        if (LIZ()) {
            LIZIZ();
            return;
        }
        SimRadar.errorScan("TTPlayer", "onError", new IUM(c47789IpF.toString()), new Object[0]);
        SimRadar.analyzer().getClass();
        IVN.LIZIZ("PF-Error1");
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onError() called with: error = [");
            LIZ.append(c47789IpF);
            LIZ.append("]");
            IXB.LIZIZ("EngineDataSourceHelper", X1D.LIZIZ(LIZ));
        }
        this.LJLILLLLZI.LJLILLLLZI.u7().LJIIIZ(c47789IpF.LIZ, c47789IpF.LIZIZ, c47789IpF, c47789IpF.LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    @Override // X.InterfaceC47787IpD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoStatusException(int r8) {
        /*
            r7 = this;
            r0 = 5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            X.IZM r2 = r7.LJLILLLLZI
            X.IZY r0 = r2.LJLJI
            r5 = 0
            r3[r5] = r0
            r1 = 1
            X.Iac r0 = r7.LJLIL
            r3[r1] = r0
            r1 = 2
            java.lang.String r0 = r2.LJLJJI
            r3[r1] = r0
            r2 = 3
            java.lang.String r0 = "status"
            r3[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1 = 4
            r3[r1] = r0
            java.lang.String r0 = "EngineDataSourceHelper"
            java.lang.String r6 = "onVideoStatusException"
            com.ss.android.ugc.playerkit.radar.SimRadar.keyScan(r0, r6, r3)
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L31
            r7.LIZIZ()
            return
        L31:
            r4 = 0
            if (r8 == r2) goto L7c
            if (r8 == r1) goto L7c
            r0 = 20
            if (r8 == r0) goto L7c
            r0 = 30
            if (r8 == r0) goto L7c
            r0 = 40
            if (r8 == r0) goto L79
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r8 == r0) goto L7c
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r8 == r0) goto L79
            r3 = r4
        L4b:
            X.IUM r2 = new X.IUM
            if (r3 != 0) goto L77
            java.lang.String r0 = ""
            java.lang.String r0 = X.KMP.LJ(r0, r8)
        L55:
            r2.<init>(r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "TTPlayer"
            com.ss.android.ugc.playerkit.radar.SimRadar.errorScan(r0, r6, r2, r1)
            X.IVN r0 = com.ss.android.ugc.playerkit.radar.SimRadar.analyzer()
            r0.getClass()
            java.lang.String r0 = "PF-Error2"
            X.IVN.LIZIZ(r0)
            X.IZM r0 = r7.LJLILLLLZI
            X.IYm r0 = r0.LJLILLLLZI
            X.IZf r0 = r0.u7()
            r0.LJIIIZ(r8, r5, r3, r4)
            return
        L77:
            r0 = r3
            goto L55
        L79:
            java.lang.String r3 = "Video deleted, play failed."
            goto L4b
        L7c:
            java.lang.String r3 = "Transcoding, play failed."
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZN.onVideoStatusException(int):void");
    }

    public IZN(IZM izm, C46882Iac c46882Iac) {
        this.LJLILLLLZI = izm;
        this.LJLIL = c46882Iac;
    }

    @Override // X.InterfaceC47787IpD
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        IZM izm = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append("*");
        LIZ.append(i2);
        izm.LJLJJLL = X1D.LIZIZ(LIZ);
    }
}
