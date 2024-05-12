package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ec7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36783Ec7 {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\"");
        String LJFF = JBR.LJFF(LIZ, this.LIZ, "\":[", LIZ);
        if (this.LIZIZ != null) {
            for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
                StringBuilder LIZJ = b1.LIZJ(LJFF, "\"");
                LJFF = JBR.LJFF(LIZJ, (String) ListProtector.get(this.LIZIZ, i), "\"", LIZJ);
                if (i != ((ArrayList) this.LIZIZ).size() - 1) {
                    LJFF = i0.LJFF(LJFF, ",");
                }
            }
        }
        return i0.LJFF(LJFF, "]");
    }

    public C36783Ec7(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZ = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
