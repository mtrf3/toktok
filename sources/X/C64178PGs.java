package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PGs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64178PGs {
    public final int LIZ;
    public int LIZIZ;
    public C64177PGr LIZJ;
    public final List<C64177PGr> LIZLLL = new ArrayList();

    public final List<C64177PGr> LIZ() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (((ArrayList) this.LIZLLL).size() == this.LIZ) {
            for (int i2 = this.LIZIZ - 1; i2 < ((ArrayList) this.LIZLLL).size(); i2++) {
                arrayList.add(ListProtector.get(this.LIZLLL, i2));
            }
            while (i < this.LIZIZ - 1) {
                arrayList.add(ListProtector.get(this.LIZLLL, i));
                i++;
            }
        } else {
            while (i < ((ArrayList) this.LIZLLL).size()) {
                arrayList.add(ListProtector.get(this.LIZLLL, i));
                i++;
            }
        }
        return arrayList;
    }

    public final C64177PGr LIZIZ() {
        int i = this.LIZIZ;
        if (i <= 0) {
            return null;
        }
        return (C64177PGr) ListProtector.get(this.LIZLLL, i - 1);
    }

    public C64178PGs(int i) {
        this.LIZ = i;
    }
}
