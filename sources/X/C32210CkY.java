package X;

import com.bytedance.android.livesdk.model.Gift;
import com.google.gson.g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.CkY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32210CkY {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Collection collection) {
        g gVar = new g();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gVar.LJJIII(Long.valueOf(((Gift) it.next()).id));
        }
        String jVar = gVar.toString();
        o.LJIIIIZZ(jVar, "jsonArray.toString()");
        return jVar;
    }
}
