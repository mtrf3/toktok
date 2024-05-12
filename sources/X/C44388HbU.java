package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.HbU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44388HbU {
    public final C44421Hc1 LIZ;

    public final C44418Hby LIZ() {
        if (!TextUtils.isEmpty((String) this.LIZ.LIZIZ)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C44398Hbe c44398Hbe : this.LIZ.LIZ) {
                C44387HbT c44387HbT = new C44387HbT(this, c44398Hbe);
                if (c44398Hbe.LJFF == null) {
                    arrayList.add(c44387HbT);
                } else {
                    arrayList2.add(c44387HbT);
                }
            }
            if (arrayList.size() != 0 || this.LIZ.LIZLLL != null) {
                return new C44418Hby(this, arrayList, arrayList2);
            }
            throw new IllegalArgumentException("PlayItem or DashItem is required.");
        }
        throw new IllegalArgumentException("SourceID is required.");
    }

    public C44388HbU(C44421Hc1 c44421Hc1) {
        this.LIZ = c44421Hc1;
    }
}
