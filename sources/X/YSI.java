package X;

import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineImpl;

/* loaded from: classes16.dex */
public final class YSI extends AbstractC38521fE {
    public TTVideoEngine LJLJI;
    public YSU LJLJJI;
    public final C87412YSi LJLJJL;

    public YSI() {
        super(8);
        this.LJLJJL = new C87412YSi(this);
    }

    public final boolean LJIIL() {
        if (this.LJLJI == null) {
            return true;
        }
        return false;
    }

    public final void LJIILL(YSN ysn) {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLII(ysn.LIZ, ysn.LIZIZ);
            this.LJLJI.LLJIJIL(ysn.LIZJ);
            this.LJLJI.LLILZ(ysn.LIZLLL);
            this.LJLJI.LJLJI(ysn.LJI);
            this.LJLJI.LJLJLLL(ysn.LJ);
            this.LJLJI.LJLJJL(ysn.LJFF);
            this.LJLJI.LLIIIJ(ysn.LJII);
            this.LJLJI.LLFII(ysn.LJIIIIZZ);
            this.LJLJI.LJLZ(ysn.LJIIIZ);
            this.LJLJI.LJLJI(ysn.LJI);
            this.LJLJI.LJLLLL(4, ysn.LJIIJ);
            AbstractC47819Ipj abstractC47819Ipj = ysn.LJIIJJI;
            if (abstractC47819Ipj != null) {
                this.LJLJI.LLI(abstractC47819Ipj);
            }
            if (ysn.LJIIL != null && (((YSR) this.LJLILLLLZI).getVideoViewType() == 0 || ((YSR) this.LJLILLLLZI).getVideoViewType() == 2)) {
                LJIILLIIL(ysn.LJIIL);
            } else {
                SurfaceHolder surfaceHolder = ysn.LJIILIIL;
                if (surfaceHolder != null) {
                    LJIIZILJ(surfaceHolder);
                }
            }
            this.LJLJI.LLIIZ(ysn.LJIILJJIL);
        }
    }

    public final void LJIILLIIL(Surface surface) {
        Object obj;
        if (this.LJLJI != null && (obj = this.LJLILLLLZI) != null) {
            if (((YSR) obj).getVideoViewType() == 0) {
                this.LJLJI.LLILZIL(surface);
            } else {
                if (((YSR) this.LJLILLLLZI).getVideoViewType() != 2) {
                    return;
                }
                this.LJLJI.LLJ(surface);
            }
        }
    }

    public final void LJIIZILJ(SurfaceHolder surfaceHolder) {
        if (this.LJLJI != null) {
            Object obj = this.LJLILLLLZI;
            if (obj != null && ((YSR) obj).prepareCalledPlayNotCalled()) {
                this.LJLJI.LLIZ(surfaceHolder);
                VideoSurface LJJIL = this.LJLJI.LJJIL();
                if (LJJIL != null) {
                    LJJIL.LJJ(25, 1);
                    return;
                }
                return;
            }
            this.LJLJI.LLILZLL(surfaceHolder);
        }
    }

    public final void LJIJ(YSU ysu) {
        this.LJLJJI = ysu;
        switch (ysu.LIZ) {
            case 1:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("_vid:");
                LIZ.append(ysu.LIZIZ);
                LIZ.append(" title:");
                LIZ.append(ysu.LJI);
                X1D.LIZIZ(LIZ);
                TTVideoEngine tTVideoEngine = this.LJLJI;
                String str = ysu.LIZIZ;
                TTVideoEngineImpl tTVideoEngineImpl = tTVideoEngine.LIZ;
                if (tTVideoEngineImpl.b5.LIZ(false)) {
                    tTVideoEngineImpl.b5.LIZLLL(14, 0, 0, str);
                    return;
                } else {
                    tTVideoEngineImpl.LJJLIIIJL(str);
                    return;
                }
            case 2:
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("_cache_video_model. vid:");
                LIZ2.append(ysu.LIZIZ);
                LIZ2.append(" title:");
                LIZ2.append(ysu.LJI);
                X1D.LIZIZ(LIZ2);
                this.LJLJI.LLJJIJIIJIL(ysu.LIZJ);
                return;
            case 3:
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("_local_url:");
                LIZ3.append(ysu.LIZLLL);
                X1D.LIZIZ(LIZ3);
                this.LJLJI.LL(ysu.LIZLLL);
                return;
            case 4:
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("_direct_url:");
                LIZ4.append(ysu.LJ);
                X1D.LIZIZ(LIZ4);
                this.LJLJI.LJLJJLL(ysu.LJ);
                return;
            case 5:
                Pair<String, String> pair = ysu.LJFF;
                this.LJLJI.LJLJL((String) pair.first, (String) pair.second);
                return;
            case 6:
                throw null;
            default:
                return;
        }
    }

    public final void LJIILIIL(boolean z, boolean z2) {
        YSR ysr = (YSR) this.LJLILLLLZI;
        if (ysr != null && this.LJLJI != null) {
            int videoViewType = ysr.getVideoViewType();
            if (videoViewType == 0 || videoViewType == 2) {
                this.LJLJI.LLILZIL(null);
            } else {
                this.LJLJI.LLILZLL(null);
            }
        }
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null && z2) {
            if (z) {
                tTVideoEngine.LJJLIIIJJI();
            } else {
                tTVideoEngine.LJJLIIIJILLIZJL();
            }
        }
        this.LJLJI = null;
        this.LJLJJI = null;
    }

    public final void LJIILJJIL(int i, Object obj) {
        TTVideoEngine tTVideoEngine = this.LJLJI;
        if (tTVideoEngine != null) {
            if (obj instanceof Integer) {
                tTVideoEngine.LJLLLL(i, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                tTVideoEngine.LLFF(i, ((Long) obj).longValue());
            } else {
                if (!(obj instanceof String)) {
                    return;
                }
                tTVideoEngine.LLILL(i, (String) obj);
            }
        }
    }
}
