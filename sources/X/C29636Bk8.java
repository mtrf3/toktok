package X;

import com.bytedance.android.livesdk.model.Sticker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Bk8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29636Bk8 {
    public final boolean LIZ;
    public final java.util.Map<Long, Integer> LIZIZ = new LinkedHashMap();

    public C29636Bk8(boolean z) {
        this.LIZ = z;
    }

    public final boolean LIZ(int i, Long l) {
        Integer num;
        if (l == null || (num = (Integer) ((LinkedHashMap) this.LIZIZ).get(l)) == null || num.intValue() != i) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(int i, List list) {
        if (!this.LIZ) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sticker sticker = (Sticker) it.next();
            if (sticker != null && Long.valueOf(sticker.id) != null && sticker.type == 4) {
                this.LIZIZ.put(Long.valueOf(sticker.id), Integer.valueOf(i));
            }
        }
    }
}
