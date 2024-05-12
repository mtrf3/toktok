package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes14.dex */
public final class VA2 implements VA3 {
    public final List<VA3> LIZ;

    @Override // X.VA3
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        for (VA3 va3 : this.LIZ) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(va3.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }

    @Override // X.VA3
    public final W6U getPostprocessorCacheKey() {
        LinkedList linkedList = new LinkedList();
        Iterator<VA3> it = this.LIZ.iterator();
        while (it.hasNext()) {
            linkedList.push(it.next().getPostprocessorCacheKey());
        }
        return new C81748W6m(linkedList);
    }

    public VA2(List<VA3> list) {
        this.LIZ = new LinkedList(list);
    }

    @Override // X.VA3
    public final C81392Vwy<Bitmap> process(Bitmap bitmap, AbstractC78853Ux7 abstractC78853Ux7) {
        Bitmap bitmap2;
        C81392Vwy<Bitmap> c81392Vwy = null;
        try {
            C81392Vwy c81392Vwy2 = null;
            for (VA3 va3 : this.LIZ) {
                if (c81392Vwy2 != null) {
                    bitmap2 = (Bitmap) c81392Vwy2.LJI();
                } else {
                    bitmap2 = bitmap;
                }
                c81392Vwy = va3.process(bitmap2, abstractC78853Ux7);
                C81392Vwy.LJ(c81392Vwy2);
                c81392Vwy2 = C81392Vwy.LIZJ(c81392Vwy);
            }
            return C81392Vwy.LIZJ(c81392Vwy);
        } finally {
            C81392Vwy.LJ(c81392Vwy);
        }
    }
}
