package X;

import android.os.Bundle;
import com.ss.texturerender.VideoSurface;

/* renamed from: X.IpJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47793IpJ implements InterfaceC47825Ipp {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public Bundle LJ;

    @Override // X.InterfaceC47825Ipp
    public final boolean LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC47825Ipp
    public final boolean LJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC47825Ipp
    public final boolean LIZ(C48262Iws c48262Iws) {
        this.LIZJ = this.LIZ;
        if (this.LIZLLL) {
            c48262Iws.LIZJ(1, 1);
        }
        return this.LIZLLL;
    }

    @Override // X.InterfaceC47825Ipp
    public final void LJFF(VideoSurface videoSurface) {
        this.LJ.putInt("enable_bmf", C47149Iev.LIZ.LJFF);
        this.LJ.putString("moduleName", "");
        videoSurface.LJIJI(this.LJ);
    }

    @Override // X.InterfaceC47825Ipp
    public final void LJII(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC47825Ipp
    public final void LIZJ(VideoSurface videoSurface, boolean z) {
        LJIIIIZZ(false, videoSurface, z);
        this.LIZ = false;
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = null;
    }

    @Override // X.InterfaceC47825Ipp
    public final void LJI(Bundle bundle, VideoSurface videoSurface) {
        if (bundle.getInt("action") == 21) {
            this.LIZ = true;
            this.LIZIZ = bundle.getBoolean("use_effect");
            this.LIZLLL = bundle.getBoolean("asyncInit");
            this.LJ = bundle;
            return;
        }
        if (bundle.getInt("action") != 19) {
            return;
        }
        this.LIZIZ = bundle.getBoolean("use_effect");
        LJIIIIZZ(this.LIZIZ, videoSurface, bundle.getBoolean("HasFirstFrameShown"));
    }

    @Override // X.InterfaceC47825Ipp
    public final void LIZIZ(float f, VideoSurface videoSurface, boolean z) {
        boolean z2 = this.LIZIZ;
        if (f >= 31.0f || f <= 0.0f) {
            z2 = false;
        }
        this.LIZIZ = z2;
        LJIIIIZZ(z2, videoSurface, z);
    }

    public final void LJIIIIZZ(boolean z, VideoSurface videoSurface, boolean z2) {
        this.LIZIZ = z;
        if (videoSurface != null && z2) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("action", 19);
                int i = 1;
                bundle.putInt("effect_type", 1);
                if (!this.LIZIZ) {
                    i = 0;
                }
                bundle.putInt("int_value", i);
                videoSurface.LJIJI(bundle);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[SALog]doOpenSharpen catch exception e=");
                LIZ.append(e);
                C78253UnR.LJI("[SALog]", X1D.LIZIZ(LIZ));
            }
        }
    }
}
