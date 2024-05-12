package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import java.util.HashMap;

/* renamed from: X.Paq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64732Paq {
    public boolean LIZ;
    public java.util.Map<String, Integer> LIZJ;
    public String LJIIJJI;
    public boolean LIZIZ = true;
    public int LIZLLL = 10;
    public int LJ = 3;
    public int LJFF = 3;
    public int LJI = 10;
    public int LJII = 3;
    public int LJIIIIZZ = 3;
    public int LJIIIZ = 900;
    public int LJIIJ = LiveTryModeCountDownThresholdSetting.DEFAULT;

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder(" localEnable: ");
        sb.append(this.LIZ);
        sb.append(" probeEnable: ");
        sb.append(this.LIZIZ);
        sb.append(" hostFilter: ");
        java.util.Map<String, Integer> map = this.LIZJ;
        if (map != null) {
            i = ((HashMap) map).size();
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append(" reqTo: ");
        sb.append(this.LIZLLL);
        sb.append("#");
        sb.append(this.LJ);
        sb.append("#");
        sb.append(this.LJFF);
        sb.append(" reqErr: ");
        sb.append(this.LJI);
        sb.append("#");
        sb.append(this.LJII);
        sb.append("#");
        sb.append(this.LJIIIIZZ);
        sb.append(" updateInterval: ");
        sb.append(this.LJIIIZ);
        sb.append(" updateRandom: ");
        sb.append(this.LJIIJ);
        sb.append(" httpBlack: ");
        sb.append(this.LJIIJJI);
        return sb.toString();
    }
}
