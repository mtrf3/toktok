package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.35Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35Z implements C33Q {
    public final List<PoiListApi.PoiYMALModel> LJLIL;

    public C35Z() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35Z) && o.LJ(this.LJLIL, ((C35Z) obj).LJLIL);
    }

    public final int hashCode() {
        List<PoiListApi.PoiYMALModel> list = this.LJLIL;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiDetailYmalState(ymalList=");
        return C1NE.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C35Z(List<PoiListApi.PoiYMALModel> list) {
        this.LJLIL = list;
    }
}
