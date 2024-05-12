package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.H5x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43513H5x {
    public static final /* synthetic */ int LJ = 0;
    public final H60 LIZ;
    public final C43512H5w LIZIZ;
    public C43515H5z LIZJ;
    public final int LIZLLL = 100;

    public C43513H5x(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C42982Gtu) it.next()).LJLILLLLZI;
        }
        if (i == this.LIZLLL) {
            H60 h60 = new H60(arrayList);
            this.LIZ = h60;
            this.LIZIZ = new C43512H5w(h60);
            this.LIZJ = new C43515H5z(0.0f, 0, ((C42982Gtu) ListProtector.get(arrayList, 0)).LJLIL);
            return;
        }
        throw new RuntimeException("ProgressCalculator totalProgress not equal");
    }
}
