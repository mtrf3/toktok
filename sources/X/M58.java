package X;

import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.ContinuousTimeCalculator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class M58 implements M5A {
    public static boolean LJLILLLLZI;
    public static int LJLJJI;
    public static final M58 LJLIL = new M58();
    public static final CopyOnWriteArrayList<M5A> LJLJI = new CopyOnWriteArrayList<>();

    public final synchronized void LIZ() {
        if (LJLILLLLZI) {
            return;
        }
        if (FCD.LJI(EF7.LIZIZ())) {
            ContinuousTimeCalculator.Companion.getClass();
            ContinuousTimeCalculator LIZIZ = C84369X9h.LIZIZ();
            if (LIZIZ != null) {
                LJLIL.LIZIZ(LIZIZ);
            }
        }
        LJLILLLLZI = true;
    }

    @Override // X.M5A
    public final synchronized void onAppEnterBackGround() {
        LIZ();
        int i = LJLJJI - 1;
        LJLJJI = i;
        if (i == 0) {
            Iterator<M5A> it = LJLJI.iterator();
            while (it.hasNext()) {
                it.next().onAppEnterBackGround();
            }
        }
    }

    @Override // X.M5A
    public final synchronized void onAppEnterForeground() {
        LIZ();
        int i = LJLJJI + 1;
        LJLJJI = i;
        if (i == 1) {
            Iterator<M5A> it = LJLJI.iterator();
            while (it.hasNext()) {
                it.next().onAppEnterForeground();
            }
        }
    }

    public final synchronized void LIZIZ(M5A m5a) {
        CopyOnWriteArrayList<M5A> copyOnWriteArrayList = LJLJI;
        if (!copyOnWriteArrayList.contains(m5a)) {
            copyOnWriteArrayList.add(m5a);
        }
    }
}
