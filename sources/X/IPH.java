package X;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.b0;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class IPH {
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public Bundle LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final HashMap<String, Object> LJIIL;
    public java.util.Map<String, Object> LJIILIIL;
    public int LJIILJJIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerEvent{id='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", codecType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZJ);
        LIZ.append(", onRenderTime=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", elapsedRealtime=");
        LIZ.append(this.LJ);
        LIZ.append(", currentTimeMillis=");
        LIZ.append(this.LJFF);
        LIZ.append(", enablePlayerSdkEventTracking=");
        LIZ.append(this.LJI);
        LIZ.append(", isMute=");
        LIZ.append(this.LJII);
        LIZ.append(", gaussianPrams=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", urlProtocolType=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", requestType=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", prerenderType=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", extraInfo=");
        LIZ.append(this.LJIIL);
        LIZ.append(", firstFrameInfo=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", modelType=");
        return b0.LIZJ(LIZ, this.LJIILJJIL, '}', LIZ);
    }

    public IPH(String str) {
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJIIIZ = -1;
        this.LJIIJJI = -1;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = -1;
        this.LIZ = str;
    }

    public final void LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJIIL.put("strategy_tokens", str);
        }
    }

    public IPH(String str, long j) {
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJIIIZ = -1;
        this.LJIIJJI = -1;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = -1;
        this.LIZ = str;
        this.LIZIZ = 0;
        this.LIZJ = j;
    }

    public IPH(int i, long j, String str, boolean z) {
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJIIIZ = -1;
        this.LJIIJJI = -1;
        this.LJIIL = new HashMap<>();
        this.LJIILJJIL = -1;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LJI = z;
    }
}
