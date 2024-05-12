package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HuX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45569HuX {
    public final List<MyMediaModel> LIZ;
    public final boolean LIZIZ;

    public C45569HuX() {
        this(0);
    }

    public final int hashCode() {
        return C16880lQ.LLJILJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaRefreshData(mediaModelList=");
        LIZ.append(this.LIZ);
        LIZ.append(", allRefresh=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C45569HuX(int i) {
        this(new ArrayList(), true);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C45569HuX.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaRefreshData");
        C45569HuX c45569HuX = (C45569HuX) obj;
        if (this.LIZIZ != c45569HuX.LIZIZ || this.LIZ.size() != c45569HuX.LIZ.size()) {
            return false;
        }
        Iterator<MyMediaModel> it = this.LIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (ListProtector.get(c45569HuX.LIZ, i) != it.next()) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public C45569HuX(List<MyMediaModel> mediaModelList, boolean z) {
        o.LJIIIZ(mediaModelList, "mediaModelList");
        this.LIZ = mediaModelList;
        this.LIZIZ = z;
    }
}
