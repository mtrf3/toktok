package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.QHo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66748QHo {
    public static final List<String> LIZLLL = Collections.singletonList("AppLogCache");
    public final LinkedList<QI2> LIZ = new LinkedList<>();
    public final LinkedList<String> LIZIZ = new LinkedList<>();
    public final QI3 LIZJ;

    public C66748QHo(QI3 qi3) {
        this.LIZJ = qi3;
    }

    public final int LIZ(ArrayList<QI2> arrayList) {
        int size;
        synchronized (this.LIZ) {
            size = this.LIZ.size();
            arrayList.addAll(this.LIZ);
            this.LIZ.clear();
        }
        return size;
    }
}
