package X;

import com.bytedance.android.livesdk.model.message.Contributor;
import java.util.List;

/* loaded from: classes6.dex */
public final class CYP {
    public static CYP LIZJ;
    public List<Contributor> LIZ;
    public int LIZIZ;

    public static CYP LIZ() {
        if (LIZJ == null) {
            synchronized (CYP.class) {
                if (LIZJ == null) {
                    LIZJ = new CYP();
                }
            }
        }
        return LIZJ;
    }
}
