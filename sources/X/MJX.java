package X;

import android.os.Handler;
import android.widget.TextSwitcher;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class MJX {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final TextSwitcher LIZ;
    public String LIZIZ;
    public long LIZJ;
    public List<String> LIZLLL;
    public int LJ;
    public final AtomicInteger LJFF = new AtomicInteger(-2);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C35884E6m.INSTANCE);
    public final List<InterfaceC56594MJa> LJII = new ArrayList();
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 29));

    public final Handler LIZ() {
        return (Handler) this.LJI.getValue();
    }

    public MJX(TextSwitcher textSwitcher) {
        this.LIZ = textSwitcher;
    }

    public static void LIZIZ(MJX mjx) {
        long j = mjx.LIZJ;
        List<String> list = mjx.LIZLLL;
        if (list != null && list.size() > 1) {
            mjx.LIZ().removeCallbacks((Runnable) mjx.LJIIIIZZ.getValue());
            if (j < 0) {
                j = 0;
            }
            mjx.LIZ().postDelayed((Runnable) mjx.LJIIIIZZ.getValue(), j);
        }
    }

    public final void LIZJ(int i, boolean z) {
        List<String> list = this.LIZLLL;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.LJ = i;
        if (i < 0 || i >= list.size()) {
            this.LJ = 0;
        }
        String str = (String) ListProtector.get(list, this.LJ);
        this.LIZIZ = str;
        if (z) {
            this.LIZ.setText(str);
        } else {
            this.LIZ.setCurrentText(str);
        }
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            ((InterfaceC56594MJa) it.next()).LIZ(this.LJ);
        }
    }
}
