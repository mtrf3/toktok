package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class OUG {
    public static void LIZ(Bundle bundle) {
        if (!OUJ.LIZIZ.isEmpty()) {
            ((OUM) ListProtector.remove(OUJ.LIZIZ, 0)).LIZ(bundle);
            return;
        }
        Iterator<OUN> it = OUJ.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }
}
