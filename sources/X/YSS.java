package X;

import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes16.dex */
public final class YSS {
    public TTVideoEngine LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public EnumC47176IfM LJI;
    public String LJII;
    public long LJIIIIZZ;

    public final boolean LIZ() {
        TTVideoEngine tTVideoEngine = this.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJJJL()) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(boolean z) {
        TTVideoEngine tTVideoEngine = this.LIZ;
        if (tTVideoEngine != null) {
            int LJJII = this.LIZ.LJJII(84) + tTVideoEngine.LJJII(83);
            this.LIZJ = this.LIZ.LJJJJI() - this.LIZIZ;
            this.LJ = LJJII - this.LIZLLL;
            if (z) {
                if (LIZ()) {
                    this.LIZIZ = this.LIZ.LJJJJI();
                    this.LIZLLL = LJJII;
                } else {
                    this.LIZIZ = 0;
                    this.LIZLLL = 0;
                }
            }
        }
    }
}
