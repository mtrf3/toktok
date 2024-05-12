package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public class QIW extends AbstractC39028FTk<HashMap<String, QI2>> {
    @Override // X.AbstractC39028FTk
    public final Object LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("page", new QID());
        hashMap.put("launch", new QIH());
        hashMap.put("terminate", new QIM());
        hashMap.put("pack", new C66750QHq());
        QI2[] LJ = QI2.LJ();
        int i = 0;
        do {
            QI2 qi2 = LJ[i];
            hashMap.put(qi2.LJIIIZ(), qi2);
            i++;
        } while (i < 3);
        return hashMap;
    }
}
