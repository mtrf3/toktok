package X;

import android.content.Context;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.VtE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class BinderC81160VtE extends AbstractBinderC173836rz {
    public final java.util.Map<C232819Bt<ImageView>, C81159VtD> LJLILLLLZI;

    public BinderC81160VtE(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = new LinkedHashMap();
    }

    @Override // X.InterfaceC172226pO
    public final boolean LIZ(Context context, android.net.Uri uri, C173656rh c173656rh, int i, int i2) {
        if (!W5I.LIZLLL) {
            W5I.LIZIZ(context, null);
        }
        c173656rh.setImageBitmap(null);
        Iterator it = ((LinkedHashMap) this.LJLILLLLZI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object obj = ((C232819Bt) entry.getKey()).LIZ.get();
            if (obj == null || o.LJ(obj, c173656rh)) {
                C81159VtD c81159VtD = (C81159VtD) entry.getValue();
                C81392Vwy<W5A> c81392Vwy = c81159VtD.LJ;
                if (c81392Vwy != null) {
                    C81392Vwy.LJ(c81392Vwy);
                }
                c81159VtD.LJ = null;
                c81159VtD.LIZIZ.clear();
                c81159VtD.LIZJ.close();
                it.remove();
            }
        }
        C81159VtD c81159VtD2 = new C81159VtD(uri, c173656rh);
        this.LJLILLLLZI.put(new C232819Bt<>(c173656rh), c81159VtD2);
        c81159VtD2.LIZJ.LJ(c81159VtD2.LIZLLL, C79561VKj.LJLIL);
        return true;
    }
}
