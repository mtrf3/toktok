package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.J5o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48600J5o {
    public boolean LIZ;

    public abstract boolean LIZ(String str);

    public void LIZIZ() {
    }

    public abstract String LIZJ(String str);

    public abstract ConcurrentHashMap<String, String> LJFF();

    public final float LIZLLL(String str) {
        String LIZJ = LIZJ(str);
        if (LIZJ != null && C48605J5t.LIZ(LIZJ)) {
            try {
                return CastFloatProtector.parseFloat(LIZJ);
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    public final int LJ(int i, String str) {
        String LIZJ = LIZJ(str);
        if (LIZJ != null && C48605J5t.LIZ(LIZJ)) {
            try {
                return (int) CastDoubleProtector.parseDouble(LIZJ);
            } catch (Exception unused) {
                return i;
            }
        }
        return i;
    }
}
