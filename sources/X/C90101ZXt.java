package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.ZXt, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90101ZXt {
    public static final C90101ZXt LIZJ = new C90101ZXt(new Bundle(), null);
    public final Bundle LIZ;
    public List<String> LIZIZ;

    public final void LIZ() {
        if (this.LIZIZ == null) {
            ArrayList<String> stringArrayList = this.LIZ.getStringArrayList("controlCategories");
            this.LIZIZ = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.LIZIZ = Collections.emptyList();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteSelector{ controlCategories=");
        LIZ();
        sb.append(Arrays.toString(this.LIZIZ.toArray()));
        sb.append(" }");
        return sb.toString();
    }

    public final boolean LIZJ() {
        LIZ();
        return this.LIZIZ.isEmpty();
    }

    public final int hashCode() {
        LIZ();
        return this.LIZIZ.hashCode();
    }

    public static C90101ZXt LIZIZ(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new C90101ZXt(bundle, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C90101ZXt) {
            C90101ZXt c90101ZXt = (C90101ZXt) obj;
            LIZ();
            c90101ZXt.LIZ();
            return this.LIZIZ.equals(c90101ZXt.LIZIZ);
        }
        return false;
    }

    public C90101ZXt(Bundle bundle, List<String> list) {
        this.LIZ = bundle;
        this.LIZIZ = list;
    }
}
