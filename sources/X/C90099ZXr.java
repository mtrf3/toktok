package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ZXr, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90099ZXr {
    public Bundle LIZ;
    public final List<C90089ZXh> LIZIZ;
    public final boolean LIZJ;

    public final boolean LIZIZ() {
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            C90089ZXh c90089ZXh = (C90089ZXh) ListProtector.get(this.LIZIZ, i);
            if (c90089ZXh == null || !c90089ZXh.LJIIIIZZ()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MediaRouteProviderDescriptor{ routes=" + Arrays.toString(this.LIZIZ.toArray()) + ", isValid=" + LIZIZ() + " }";
    }

    public static C90099ZXr LIZ(Bundle bundle) {
        C90089ZXh c90089ZXh;
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) ListProtector.get(parcelableArrayList, i);
                if (bundle2 != null) {
                    c90089ZXh = new C90089ZXh(bundle2);
                } else {
                    c90089ZXh = null;
                }
                arrayList2.add(c90089ZXh);
            }
            arrayList = arrayList2;
        }
        return new C90099ZXr(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public C90099ZXr(List<C90089ZXh> list, boolean z) {
        this.LIZIZ = list == null ? Collections.emptyList() : list;
        this.LIZJ = z;
    }
}
