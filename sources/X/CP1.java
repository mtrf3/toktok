package X;

import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CP1 implements CP2 {
    public final String LIZ;

    public CP1(String str) {
        this.LIZ = str;
    }

    @Override // X.CP2
    public final void LIZ(String str, boolean z) {
        if (z) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.tu8);
            c5s1.LJ();
            C62011OVj.LJIIIIZZ(0, "");
        } else {
            C62011OVj.LJIIIIZZ(1, str);
        }
        String str2 = this.LIZ;
        if (str2 != null) {
            C62011OVj.LJIIJ(str2, "share", str, z);
        }
        C31268COy c31268COy = C31268COy.LJI;
        if (((HashMap) c31268COy.LJ).size() == 0) {
            return;
        }
        ((HashMap) c31268COy.LJ).remove("video_share");
    }
}
