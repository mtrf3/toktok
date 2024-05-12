package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6IR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IR {
    public static C6IR LIZJ;
    public final List<C6IS> LIZ;
    public int LIZIZ;

    public static C6IR LIZIZ() {
        if (LIZJ == null) {
            synchronized (C6IR.class) {
                if (LIZJ == null) {
                    LIZJ = new C6IR();
                }
            }
        }
        return LIZJ;
    }

    public final C6IS LIZ() {
        if (this.LIZIZ == ((ArrayList) this.LIZ).size()) {
            this.LIZIZ = 0;
        }
        return (C6IS) ListProtector.get(this.LIZ, this.LIZIZ);
    }

    public C6IR() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.add(new C6IS(-1, new int[]{-16716612, -16745761}));
        arrayList.add(new C6IS(-1, new int[]{-20071, -55717}));
        arrayList.add(new C6IS(-1, new int[]{-14625300, -5938690, -119723}));
        arrayList.add(new C6IS(-1, new int[]{-468142, -42147}));
        arrayList.add(new C6IS(-1, new int[]{-16352892, -15726275}));
        arrayList.add(new C6IS(-16777216, new int[]{-1773591, -7100977}));
        arrayList.add(new C6IS(-1, new int[]{-12369085, -16777216}));
    }
}
