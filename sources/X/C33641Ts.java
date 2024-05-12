package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1Ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C33641Ts implements PMO {
    public final /* synthetic */ C42981mQ LIZ;

    public C33641Ts(C42981mQ c42981mQ) {
        this.LIZ = c42981mQ;
    }

    public final void LIZ(long j, float f) {
        synchronized (this.LIZ.LJLLILLLL) {
            if (TextUtils.isEmpty(this.LIZ.LJLL)) {
                return;
            }
            C42981mQ c42981mQ = this.LIZ;
            if (c42981mQ.LJLILLLLZI || c42981mQ.LJLZ) {
                c42981mQ.LJIILL();
                return;
            }
            if (c42981mQ.LJLLJ == 0) {
                C64125PEr.LIZLLL().getClass();
                c42981mQ.LJLLLL = FQS.LIZ();
                C42981mQ c42981mQ2 = this.LIZ;
                c42981mQ2.LJLLLLLL = c42981mQ2.LJZ.LIZ();
                this.LIZ.LJZI.clear();
            }
            C42981mQ c42981mQ3 = this.LIZ;
            long j2 = c42981mQ3.LJLLJ + 1;
            c42981mQ3.LJLLJ = j2;
            float f2 = c42981mQ3.LJLLL + f;
            c42981mQ3.LJLLL = f2;
            if (j2 > 20) {
                if (f2 > 200.0f) {
                    C14580hi c14580hi = new C14580hi();
                    c14580hi.LIZ = f2 / ((float) j2);
                    c14580hi.LIZLLL = j;
                    C64125PEr.LIZLLL().getClass();
                    long LIZ = FQS.LIZ();
                    C42981mQ c42981mQ4 = this.LIZ;
                    c14580hi.LIZIZ = LIZ - c42981mQ4.LJLLLL;
                    long LIZ2 = c42981mQ4.LJZ.LIZ();
                    C42981mQ c42981mQ5 = this.LIZ;
                    c14580hi.LIZJ = LIZ2 - c42981mQ5.LJLLLLLL;
                    CopyOnWriteArrayList<Long> copyOnWriteArrayList = c42981mQ5.LJZI;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() != 0) {
                        for (int i = 0; i < copyOnWriteArrayList.size() - 1; i++) {
                            StringBuilder sb = c14580hi.LJ;
                            sb.append(ListProtector.get(copyOnWriteArrayList, i));
                            sb.append(',');
                        }
                        c14580hi.LJ.append(ListProtector.get(copyOnWriteArrayList, copyOnWriteArrayList.size() - 1));
                    }
                    C42981mQ c42981mQ6 = this.LIZ;
                    c42981mQ6.LJLLI.put(c42981mQ6.LJLL, c14580hi);
                }
                this.LIZ.LJIILLIIL();
            }
        }
    }
}
