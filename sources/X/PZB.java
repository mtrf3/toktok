package X;

import com.bytedance.retrofit2.RequestBuilder;
import defpackage.a1;
import java.util.Map;

/* loaded from: classes12.dex */
public final class PZB extends AbstractC64937Pe9<java.util.Map<String, PVP>> {
    public final String LIZ;

    public PZB(String str) {
        this.LIZ = str;
    }

    @Override // X.AbstractC64937Pe9
    public final void LIZ(RequestBuilder requestBuilder, java.util.Map<String, PVP> map) {
        java.util.Map<String, PVP> map2 = map;
        if (map2 != null) {
            for (Map.Entry<String, PVP> entry : map2.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    PVP value = entry.getValue();
                    if (value != null) {
                        C64606PXe LJII = C64606PXe.LJII("Content-Disposition", a1.LJ("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.LIZ);
                        C64552PVc c64552PVc = requestBuilder.LJIJI;
                        c64552PVc.getClass();
                        c64552PVc.LIZ(C64553PVd.LIZ(LJII, value));
                    } else {
                        throw new IllegalArgumentException(a1.LJ("Part map contained null value for key '", key, "'."));
                    }
                } else {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
            }
            requestBuilder.LJIJJLI = true;
            return;
        }
        throw new IllegalArgumentException("Part map was null.");
    }
}
