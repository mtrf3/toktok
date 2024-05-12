package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.DyE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35606DyE {
    public final List<String> LIZ;
    public String LIZIZ;

    public final String LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            sb.append('/');
            sb.append(str2);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        this.LIZIZ = sb2;
        return sb2;
    }

    public C35606DyE() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add("");
    }
}
