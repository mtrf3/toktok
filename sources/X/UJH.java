package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioSupportCohostSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UJH {
    public boolean LIZ;
    public final int LIZIZ;
    public C32208CkW LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public int LJII;

    public UJH(C1O4 layeredElementContext) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LIZIZ = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.a5v) + layeredElementContext.LJFF;
    }

    public final void LIZIZ(C28429BDt value) {
        int i;
        o.LJIIIZ(value, "value");
        if (this.LIZ) {
            return;
        }
        if (value.LIZ() && (i = value.LIZIZ) > 0) {
            this.LIZLLL = true;
            this.LJ = true;
            this.LJI = i;
            this.LJFF = i;
            this.LJII = i;
            return;
        }
        this.LIZLLL = false;
        this.LJ = false;
        this.LJI = 0;
        this.LJII = 0;
    }

    public static boolean LIZ(UJH ujh, C32208CkW c32208CkW, boolean z, boolean z2, int i) {
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        ujh.getClass();
        if (c32208CkW != null && (c32208CkW.LIZ == 0 || c32208CkW.LIZ == 2 || c32208CkW.LIZ == 4 || c32208CkW.LIZ == 5)) {
            int i3 = c32208CkW.LIZIZ;
            if (i3 <= 0) {
                return false;
            }
            C32208CkW c32208CkW2 = ujh.LIZJ;
            if (c32208CkW2 != null && c32208CkW2.LIZIZ == i3 && c32208CkW2.LIZJ == c32208CkW.LIZJ && !z) {
                return false;
            }
            ujh.LIZJ = c32208CkW;
            ujh.LJII = i3;
            if (c32208CkW.LIZJ && !z) {
                if (z2) {
                    i2 = ujh.LIZIZ;
                }
                i3 += i2;
            }
            ujh.LIZ = true;
            ujh.LIZLLL = true;
            ujh.LJI = i3;
        } else {
            ujh.LIZJ = null;
            ujh.LIZ = false;
            if (LiveGameLiveStudioSupportCohostSetting.INSTANCE.isExperimentGroup()) {
                boolean z3 = ujh.LJ;
                ujh.LIZLLL = z3;
                int i4 = ujh.LJFF;
                if (z3) {
                    ujh.LJII = i4;
                    ujh.LJI = i4;
                } else {
                    ujh.LJII = 0;
                    ujh.LJI = 0;
                }
            } else {
                ujh.LIZLLL = false;
                ujh.LJII = 0;
                ujh.LJI = 0;
            }
        }
        return true;
    }
}
