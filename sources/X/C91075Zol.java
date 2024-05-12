package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Zol, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91075Zol {
    public final ArrayList<C91077Zon> LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final String toString() {
        Integer num;
        StringBuilder sb = new StringBuilder();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("list size: ");
        ArrayList<C91077Zon> arrayList = this.LIZ;
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" mediaStructId: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" request view HashCode: ");
        LIZ.append(this.LIZJ);
        sb.append(X1D.LIZIZ(LIZ));
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sp.toString()");
        return sb2;
    }

    public C91075Zol(int i, String str, ArrayList arrayList) {
        this.LIZ = arrayList;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
