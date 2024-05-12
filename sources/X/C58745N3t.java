package X;

import android.text.TextUtils;
import java.util.zip.CRC32;

/* renamed from: X.N3t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58745N3t extends N3C {
    @Override // X.N3C
    public final boolean LIZJ(N3H n3h) {
        int LIZ = LIZ();
        if (LIZ < 0) {
            return true;
        }
        if (LIZ > 0 || n3h == null || TextUtils.isEmpty(n3h.LIZIZ)) {
            return false;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(n3h.LIZIZ.getBytes());
        if (crc32.getValue() % 10000 >= this.LIZ) {
            return true;
        }
        return false;
    }

    public C58745N3t(int i, java.util.Map map, java.util.Map map2, java.util.Set set) {
        super(i, map, map2, set);
    }
}
