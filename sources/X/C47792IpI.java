package X;

import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: X.IpI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47792IpI implements InterfaceC47921IrN {
    public int LIZ;
    public int LIZIZ;
    public final /* synthetic */ TTVideoEngineImpl LIZJ;

    @Override // X.InterfaceC47921IrN
    public final void onDraw() {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZJ;
        if (tTVideoEngineImpl.T0) {
            tTVideoEngineImpl.M5++;
            VideoSurface videoSurface = tTVideoEngineImpl.O0;
            if (videoSurface != null) {
                int LJ = videoSurface.LJ(6);
                int LJ2 = this.LIZJ.O0.LJ(15);
                if (this.LIZ != LJ || this.LIZIZ != LJ2) {
                    TTVideoEngineLog.d("TTVideoEngine", "[SRLog]using sr:" + LJ + " frameCount:" + this.LIZJ.M5 + "usingSharpe:" + LJ2);
                    this.LIZ = LJ;
                    this.LIZIZ = LJ2;
                    TTVideoEngineImpl tTVideoEngineImpl2 = this.LIZJ;
                    if (tTVideoEngineImpl2.LIZ(4005, tTVideoEngineImpl2.W4) > 0) {
                        if (this.LIZ > 0 || this.LIZIZ > 0) {
                            TTVideoEngineLog.d("TTVideoEngine", "sr latency mode");
                            this.LIZJ.LJIJI(4006, 0);
                        } else {
                            TTVideoEngineLog.d("TTVideoEngine", "non sr latency mode");
                            this.LIZJ.LJIJI(4006, 1);
                        }
                    }
                    this.LIZJ.r1.LIZLLL(LJ, 0);
                }
            }
            TTVideoEngineImpl tTVideoEngineImpl3 = this.LIZJ;
            C47772Ioy c47772Ioy = tTVideoEngineImpl3.LLZL;
            if (c47772Ioy != null) {
                c47772Ioy.onFrameDraw(tTVideoEngineImpl3.M5, null);
            }
        }
        TTVideoEngineImpl tTVideoEngineImpl4 = this.LIZJ;
        if (!tTVideoEngineImpl4.Q0 && tTVideoEngineImpl4.T0) {
            TTVideoEngineLog.d("TTVideoEngine", "recive first frame render from texture");
            this.LIZJ.Q0 = true;
        }
        TTVideoEngineImpl tTVideoEngineImpl5 = this.LIZJ;
        if (tTVideoEngineImpl5.R0 && !tTVideoEngineImpl5.LJJJJIZL && tTVideoEngineImpl5.LJJIIJZLJL && tTVideoEngineImpl5.LIZ(661, tTVideoEngineImpl5.P0) != 1) {
            TTVideoEngineLog.d("TTVideoEngine", "render start by texture, state =" + this.LIZJ.LJIIL);
            this.LIZJ.LJLLILLLL();
        }
    }

    public C47792IpI(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZJ = tTVideoEngineImpl;
    }
}
