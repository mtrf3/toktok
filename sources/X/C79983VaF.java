package X;

import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.lynx.tasm.base.LLog;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.VaF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79983VaF extends YS8 {
    public final String LJLIL;
    public final LynxVideoUI LJLILLLLZI;
    public final C79982VaE LJLJI;

    public C79983VaF(LynxVideoUI videoUI, C79982VaE videoView) {
        o.LJIIJ(videoUI, "videoUI");
        o.LJIIJ(videoView, "videoView");
        this.LJLILLLLZI = videoUI;
        this.LJLJI = videoView;
        this.LJLIL = "LynxVideoPlayListener";
    }

    @Override // X.YS8, X.YS9
    public final void onRenderStart(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onRenderStart(interfaceC48221IwD, c79985VaH);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            C79982VaE c79982VaE = this.LJLJI;
            if (c79982VaE.LJLILLLLZI.getVisibility() != 8) {
                c79982VaE.LJLILLLLZI.setVisibility(8);
            }
            this.LJLILLLLZI.LJJII("firstframe", new HashMap());
            LynxVideoUI lynxVideoUI = this.LJLILLLLZI;
            EnumC79984VaG state = EnumC79984VaG.PLAYING;
            lynxVideoUI.getClass();
            o.LJIIJ(state, "state");
            lynxVideoUI.LJLJI = state;
            String str = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRenderStart: url: ");
            LIZ.append(c79985VaH.LJ);
            LIZ.append(", vid: ");
            C13870gZ.LIZJ(LIZ, c79985VaH.LIZ, LIZ, 2, str);
        }
    }

    @Override // X.YS8, X.YS9
    public final void onVideoCompleted(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoCompleted(interfaceC48221IwD, c79985VaH);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            this.LJLILLLLZI.LJJII("ended", new HashMap());
            LynxVideoUI lynxVideoUI = this.LJLILLLLZI;
            EnumC79984VaG state = EnumC79984VaG.STOP;
            lynxVideoUI.getClass();
            o.LJIIJ(state, "state");
            lynxVideoUI.LJLJI = state;
            String str = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoCompleted: url: ");
            LIZ.append(c79985VaH.LJ);
            LIZ.append(", vid: ");
            C13870gZ.LIZJ(LIZ, c79985VaH.LIZ, LIZ, 2, str);
        }
    }

    @Override // X.YS8, X.YS9
    public final void onVideoPause(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoPause(interfaceC48221IwD, c79985VaH);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            this.LJLILLLLZI.LJJII("pause", new HashMap());
            LynxVideoUI lynxVideoUI = this.LJLILLLLZI;
            EnumC79984VaG state = EnumC79984VaG.STOP;
            lynxVideoUI.getClass();
            o.LJIIJ(state, "state");
            lynxVideoUI.LJLJI = state;
            String str = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoPause: url: ");
            LIZ.append(c79985VaH.LJ);
            LIZ.append(", vid: ");
            C13870gZ.LIZJ(LIZ, c79985VaH.LIZ, LIZ, 2, str);
        }
    }

    @Override // X.YS8, X.YS9
    public final void onVideoPlay(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoPlay(interfaceC48221IwD, c79985VaH);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            LynxVideoUI lynxVideoUI = this.LJLILLLLZI;
            EnumC79984VaG state = EnumC79984VaG.PLAYING;
            lynxVideoUI.getClass();
            o.LJIIJ(state, "state");
            lynxVideoUI.LJLJI = state;
            this.LJLILLLLZI.LJJII("play", new HashMap());
            String str = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoPlay: url: ");
            LIZ.append(c79985VaH.LJ);
            LIZ.append(", vid: ");
            C13870gZ.LIZJ(LIZ, c79985VaH.LIZ, LIZ, 2, str);
        }
    }

    @Override // X.YS8, X.YS9
    public final void onVideoPreRelease(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH) {
        super.onVideoPreRelease(interfaceC48221IwD, c79985VaH);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            this.LJLILLLLZI.LJJII("release", new HashMap());
            String str = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoPreRelease: ");
            LIZ.append(c79985VaH);
            LLog.LIZLLL(2, str, X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.YS8, X.YS9
    public final void onBufferingUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i) {
        super.onBufferingUpdate(interfaceC48221IwD, c79985VaH, i);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            this.LJLILLLLZI.LJJII("bufferingchange", C113554cx.LJJJLZIJ(new OSZ("percent", Integer.valueOf(i))));
            String str = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBufferingUpdate: url: ");
            LIZ.append(c79985VaH.LJ);
            LIZ.append(", vid: ");
            LLog.LIZLLL(0, str, C40084FoG.LIZ(LIZ, c79985VaH.LIZ, ", percent: ", i, LIZ));
        }
    }

    @Override // X.YS8, X.YS9
    public final void onError(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47789IpF c47789IpF) {
        HashMap hashMap;
        super.onError(interfaceC48221IwD, c79985VaH, c47789IpF);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            if (c47789IpF != null) {
                hashMap = C113554cx.LJJJLZIJ(new OSZ("errorCode", Integer.valueOf(c47789IpF.LIZ)), new OSZ("errorMsg", c47789IpF.LIZLLL), new OSZ("url", c79985VaH.LJ));
            } else {
                hashMap = new HashMap();
            }
            this.LJLILLLLZI.LJJII("error", hashMap);
            LLog.LIZLLL(4, this.LJLIL, "onError: url: " + c79985VaH.LJ + ", vid: " + c79985VaH.LIZ + ", error: " + c47789IpF);
        }
    }

    @Override // X.YS8, X.YS9
    public final void onVideoEngineInfos(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, C47620ImW c47620ImW) {
        String str;
        super.onVideoEngineInfos(interfaceC48221IwD, c79985VaH, c47620ImW);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI) && c47620ImW != null) {
            String str2 = c47620ImW.LIZ;
            o.LJFF(str2, "videoEngineInfos.key");
            if (s.LJJJLZIJ(str2, "mdlhitcachesize", false)) {
                LynxVideoUI lynxVideoUI = this.LJLILLLLZI;
                OSZ[] oszArr = new OSZ[2];
                String str3 = c47620ImW.LIZLLL;
                if (str3 != null && str3.length() > 0) {
                    str = c47620ImW.LIZLLL;
                } else {
                    str = c79985VaH.LJI;
                }
                oszArr[0] = new OSZ("key", str);
                oszArr[1] = new OSZ("cacheSize", Long.valueOf(c47620ImW.LJ));
                lynxVideoUI.LJJII("videoinfos", C113554cx.LJJJLZIJ(oszArr));
            }
        }
    }

    @Override // X.YS8, X.YS9
    public final void onVideoSeekComplete(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z) {
        super.onVideoSeekComplete(interfaceC48221IwD, c79985VaH, z);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            this.LJLILLLLZI.LJJII("seek", C113554cx.LJJJLZIJ(new OSZ("success", Boolean.valueOf(z))));
        }
    }

    @Override // X.YS8, X.YS9
    public final void onProgressUpdate(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, int i, int i2) {
        super.onProgressUpdate(interfaceC48221IwD, c79985VaH, i, i2);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            this.LJLILLLLZI.LJJII("timeupdate", C113554cx.LJJJLZIJ(new OSZ("current", Integer.valueOf(i)), new OSZ("total", Integer.valueOf(i2))));
        }
    }

    @Override // X.YS8, X.InterfaceC87408YSe
    public final void onFullScreen(InterfaceC48221IwD interfaceC48221IwD, C79985VaH c79985VaH, boolean z, int i, boolean z2, boolean z3) {
        super.onFullScreen(interfaceC48221IwD, c79985VaH, z, i, z2, z3);
        if (c79985VaH != null && o.LJ(c79985VaH, this.LJLILLLLZI.LJLILLLLZI)) {
            this.LJLILLLLZI.LJJII("fullscreenchange", C113554cx.LJJJLZIJ(new OSZ("fullscreen", Integer.valueOf(z ? 1 : 0))));
            String str = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFullScreen: fullscreen: ");
            LIZ.append(z);
            LLog.LIZLLL(2, str, X1D.LIZIZ(LIZ));
        }
    }
}
