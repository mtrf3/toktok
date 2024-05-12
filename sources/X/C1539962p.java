package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.62p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1539962p {
    public static C1539962p LIZJ;
    public final List<C1540462u> LIZ;
    public int LIZIZ;

    public static C1539962p LIZIZ() {
        if (LIZJ == null) {
            synchronized (C1539962p.class) {
                if (LIZJ == null) {
                    LIZJ = new C1539962p();
                }
            }
        }
        return LIZJ;
    }

    public final C1540462u LIZ() {
        if (this.LIZIZ == ((ArrayList) this.LIZ).size()) {
            this.LIZIZ = 0;
        }
        return (C1540462u) ListProtector.get(this.LIZ, this.LIZIZ);
    }

    public final void LIZJ() {
        int i = this.LIZIZ + 1;
        this.LIZIZ = i;
        if (i == ((ArrayList) this.LIZ).size()) {
            this.LIZIZ = 0;
        }
    }

    public C1539962p() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add(new C1540462u(-1, new int[]{-16716612, -16745761}));
        arrayList.add(new C1540462u(-1, new int[]{-20071, -55717}));
        arrayList.add(new C1540462u(-1, new int[]{-14625300, -5938690, -119723}));
        arrayList.add(new C1540462u(-1, new int[]{-468142, -42147}));
        arrayList.add(new C1540462u(-1, new int[]{-16352892, -15726275}));
        arrayList.add(new C1540462u(-16777216, new int[]{-1773591, -7100977}));
        arrayList.add(new C1540462u(-1, new int[]{-12369085, -16777216}));
    }
}
