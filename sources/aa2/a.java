package aa2;

import X.C113554cx;
import X.C1DD;
import X.C39048FUe;
import X.C47789IpF;
import X.EnumC39866Fkk;
import X.InterfaceC47814Ipe;
import X.InterfaceC47896Iqy;
import X.J0I;
import X.J0M;
import X.J0O;
import X.X1D;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class a implements J0O, InterfaceC47814Ipe, InterfaceC47896Iqy {
    public static final /* synthetic */ int LJLJI = 0;
    public final TTVideoEngine LJLIL;
    public J0I LJLILLLLZI;

    @Override // X.J0O
    public final int LJIJ() {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
    }

    @Override // X.J0O
    public final boolean LIZIZ() {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJL();
        }
        return false;
    }

    @Override // X.J0O
    public final double LIZLLL() {
        int i;
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            i = tTVideoEngine.LJIJ();
        } else {
            i = 0;
        }
        return i * 0.001d;
    }

    @Override // X.J0O
    public final int getDuration() {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJIL();
        }
        return 0;
    }

    @Override // X.J0O
    public final int getVideoHeight() {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJ();
        }
        return 0;
    }

    @Override // X.J0O
    public final int getVideoWidth() {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJIL();
        }
        return 0;
    }

    @Override // X.J0O
    public final boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            if (tTVideoEngine.LJJJJZ()) {
                return true;
            }
            if (!tTVideoEngine.LJJJJZI() || tTVideoEngine.LJJIJIIJIL() != 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.J0O
    public final void pause() {
        J0I j0i;
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJL();
        }
        if (this.LJLIL != null && (j0i = this.LJLILLLLZI) != null) {
            J0M j0m = (J0M) j0i;
            new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 145));
        }
    }

    @Override // X.J0O
    public final void play() {
        J0I j0i;
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLI();
        }
        if (this.LJLIL != null && (j0i = this.LJLILLLLZI) != null) {
            J0M j0m = (J0M) j0i;
            new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 144));
        }
    }

    @Override // X.J0O
    public final void prepare() {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIIJ();
        }
    }

    @Override // X.J0O
    public final void release() {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
        }
    }

    @Override // X.J0O
    public final void LIZ(J0M j0m) {
        this.LJLILLLLZI = j0m;
        if (j0m == null) {
            TTVideoEngine tTVideoEngine = this.LJLIL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJZI(null);
                return;
            }
            return;
        }
        TTVideoEngine tTVideoEngine2 = this.LJLIL;
        if (tTVideoEngine2 == null) {
            return;
        }
        tTVideoEngine2.LJZI(this);
    }

    @Override // X.J0O
    public final void LIZJ(double d) {
        float f;
        TTVideoEngine tTVideoEngine = this.LJLIL;
        float f2 = 0.0f;
        if (tTVideoEngine != null) {
            f = tTVideoEngine.LJJIIZ();
        } else {
            f = 0.0f;
        }
        if (d > 1) {
            f2 = 1.0f;
        } else if (d >= 0) {
            f2 = (float) d;
        }
        TTVideoEngine tTVideoEngine2 = this.LJLIL;
        if (tTVideoEngine2 != null) {
            float f3 = f2 * f;
            tTVideoEngine2.LLJJIJIL(f3, f3);
        }
    }

    @Override // X.J0O
    public final void LJ(double d) {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJLJLI((int) (d * 1000), this);
        }
    }

    @Override // X.InterfaceC47896Iqy
    public final void LJJIIJZLJL(boolean z) {
        J0I j0i = this.LJLILLLLZI;
        if (j0i != null) {
            J0M j0m = (J0M) j0i;
            new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 142));
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        J0I j0i = this.LJLILLLLZI;
        if (j0i != null) {
            J0M j0m = (J0M) j0i;
            new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, UserLevelGeckoUpdateSetting.DEFAULT));
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        J0I j0i = this.LJLILLLLZI;
        if (j0i != null) {
            J0M j0m = (J0M) j0i;
            new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 141));
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        J0I j0i = this.LJLILLLLZI;
        if (j0i != null) {
            ((J0M) j0i).LIZ(this);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        J0I j0i = this.LJLILLLLZI;
        if (j0i != null) {
            J0M j0m = (J0M) j0i;
            new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 143));
        }
    }

    @Override // X.J0O
    public final void setDataSource(String str) {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJLJJLL(str);
        }
    }

    @Override // X.J0O
    public final void setLooping(boolean z) {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLFII(z);
        }
    }

    @Override // X.J0O
    public final void setSurface(Surface surface) {
        TTVideoEngine tTVideoEngine = this.LJLIL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLILZIL(surface);
        }
    }

    public a(Context playerContext, Map<String, String> map) {
        String str;
        o.LJIIJ(playerContext, "playerContext");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        EnumC39866Fkk enumC39866Fkk = EnumC39866Fkk.I;
        c39048FUe.LIZ("init lynx video player with tt-engine impl", enumC39866Fkk, "LynxCanvasTTPlayer");
        TTVideoEngine tTVideoEngine = new TTVideoEngine(playerContext, 0);
        tTVideoEngine.LJLLLL(110, 1);
        tTVideoEngine.LLJIJIL("lynx_krypton");
        tTVideoEngine.LLILZ("lynx_krypton_for_tiktok");
        tTVideoEngine.LJLLLL(415, 1);
        if (map != null && (str = (String) C113554cx.LJJJLL("disable_tt_engine_hardware_decode", map)) != null && Boolean.parseBoolean(str)) {
            c39048FUe.LIZ("Lynx options disable hardware decode", enumC39866Fkk, "LynxCanvasTTPlayer");
        } else {
            try {
                JSONObject config = HybridSettings.INSTANCE.getConfig("HybridCanvas");
                if (config != null) {
                    if (JSONObjectProtectorUtils.getBoolean(config, "DISABLE_TT_ENGINE_HARDWARE_DECODE")) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("settings ");
                        LIZ.append("DISABLE_TT_ENGINE_HARDWARE_DECODE");
                        LIZ.append(" = true, disable hardware decode for tt-engine");
                        c39048FUe.LIZ(X1D.LIZIZ(LIZ), enumC39866Fkk, "LynxCanvasTTPlayer");
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("settings ");
                        LIZ2.append("DISABLE_TT_ENGINE_HARDWARE_DECODE");
                        LIZ2.append(" = false, allow hardware decode for tt-engine");
                        c39048FUe.LIZ(X1D.LIZIZ(LIZ2), enumC39866Fkk, "LynxCanvasTTPlayer");
                    }
                } else {
                    c39048FUe.LIZ("setting without key", enumC39866Fkk, "LynxCanvasTTPlayer");
                }
            } catch (Exception e) {
                C39048FUe.LIZIZ.LIZ(C1DD.LJ("setting exception ", e), EnumC39866Fkk.I, "LynxCanvasTTPlayer");
            }
            C39048FUe.LIZIZ.LIZ("default allow hardware decode for tt-engine", EnumC39866Fkk.I, "LynxCanvasTTPlayer");
            tTVideoEngine.LJLLLL(7, 1);
        }
        this.LJLIL = tTVideoEngine;
    }
}
