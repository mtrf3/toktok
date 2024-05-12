package X;

import org.json.JSONObject;

/* renamed from: X.YDr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87031YDr {
    public static final boolean LJI = C0NB.LIZJ();
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public final ChoreographerFrameCallbackC87032YDs LJFF = new ChoreographerFrameCallbackC87032YDs(this);

    public final void LIZ(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 30;
        }
        long j = this.LIZJ;
        if (j >= i) {
            long j2 = this.LIZ;
            long j3 = this.LIZIZ;
            if (j2 > j3) {
                float f = (((float) j) * 1.0E9f) / ((float) (j2 - j3));
                if (!z) {
                    JSONObject jSONObject = new JSONObject();
                    C05630Jz.LJ(jSONObject, "feed_fps", f);
                    C0K2.LJIIJJI(0, "ttlive_feed_list_fps_all", jSONObject);
                    this.LJ++;
                }
                if (LJI) {
                    StringBuilder LJI2 = JBR.LJI("report: realTime = ", z, ", frameCount = ");
                    LJI2.append(this.LIZJ);
                    LJI2.append(", fps = ");
                    LJI2.append(f);
                    C0NB.LIZIZ("FPSMonitor", X1D.LIZIZ(LJI2));
                }
            }
        }
    }
}
