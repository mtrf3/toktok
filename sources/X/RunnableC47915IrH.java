package X;

import android.os.Bundle;
import com.ss.texturerender.VideoSurface;

/* renamed from: X.IrH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC47915IrH implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C48262Iws LJLJJLL;
    public final /* synthetic */ C79320VBc LJLJL;

    public final void LIZ() {
        boolean z;
        Bundle LIZLLL = C1DG.LIZLLL("effect_type", 5, "action", 21);
        LIZLLL.putInt("srAlgType", this.LJLIL);
        LIZLLL.putInt("srMaxSizeWidth", this.LJLILLLLZI);
        LIZLLL.putInt("srMaxSizeHeight", this.LJLJI);
        LIZLLL.putString("kernelBinPath", this.LJLJJI);
        LIZLLL.putString("oclModleName", "test");
        LIZLLL.putString("dspModleName", "test");
        if (this.LJLJJL == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL.putBoolean("srIsMaliSync", z);
        VideoSurface LIZIZ = this.LJLJL.LJIILJJIL.LIZIZ(this.LJLJJLL, 1);
        if (LIZIZ != null) {
            LIZIZ.LJIJI(LIZLLL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47915IrH(C79320VBc c79320VBc, int i, int i2, int i3, String str, int i4, C48262Iws c48262Iws) {
        this.LJLJL = c79320VBc;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = str;
        this.LJLJJL = i4;
        this.LJLJJLL = c48262Iws;
    }
}
