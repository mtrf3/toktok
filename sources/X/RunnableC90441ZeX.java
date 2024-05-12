package X;

import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.api.ICastSource;

/* renamed from: X.ZeX, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class RunnableC90441ZeX implements Runnable {
    public long LJLIL;
    public int LJLILLLLZI = 0;
    public final /* synthetic */ C90442ZeY LJLJI;

    public final void LIZ() {
        ICastSource iCastSource;
        synchronized (this.LJLJI.LJI) {
            for (String str : this.LJLJI.LJI.keySet()) {
                if (TextUtils.equals(this.LJLJI.LJIIJJI.LIZJ, str) && (iCastSource = this.LJLJI.LJI.get(str)) != null) {
                    CastLogger castLogger = this.LJLJI.LJIIL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" seekTo progress:");
                    LIZ.append(this.LJLIL);
                    LIZ.append(", tag:");
                    LIZ.append(this.LJLILLLLZI);
                    castLogger.d("PlayerController", X1D.LIZIZ(LIZ));
                    iCastSource.seekTo(this.LJLIL, this.LJLILLLLZI);
                    this.LJLJI.LJIJJ.sendEmptyMessage(1);
                    return;
                }
            }
            this.LJLJI.LJIJJ.sendEmptyMessage(1);
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

    public RunnableC90441ZeX(C90442ZeY c90442ZeY, long j) {
        this.LJLJI = c90442ZeY;
        this.LJLIL = j;
    }
}
