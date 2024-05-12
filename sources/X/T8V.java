package X;

import android.os.Handler;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS162S0100000_12;

/* loaded from: classes13.dex */
public final class T8V {
    public final TextView LIZ;
    public final TextSwitcher LIZIZ;
    public long LIZLLL;
    public List<String> LJ;
    public int LJFF;
    public boolean LIZJ = true;
    public final AtomicInteger LJI = new AtomicInteger(-2);
    public final C62822Ol8 LJII = C221108m2.LIZIZ(T8W.INSTANCE);
    public final List<T8X> LJIIIIZZ = new ArrayList();
    public final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1096));

    public final Handler LIZ() {
        return (Handler) this.LJII.getValue();
    }

    public final void LIZIZ(long j) {
        if (!this.LIZJ) {
            return;
        }
        List<String> list = this.LJ;
        if (list != null && list.size() > 1) {
            LIZ().removeCallbacks((Runnable) this.LJIIIZ.getValue());
            if (j < 0) {
                j = 0;
            }
            LIZ().postDelayed((Runnable) this.LJIIIZ.getValue(), j);
        }
        this.LIZJ = false;
    }

    public T8V(TextView textView, TextSwitcher textSwitcher) {
        this.LIZ = textView;
        this.LIZIZ = textSwitcher;
    }

    public final void LIZJ(int i, boolean z) {
        List<String> list = this.LJ;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.LJFF = i;
        if (i < 0 || i >= list.size()) {
            this.LJFF = 0;
        }
        String str = (String) ListProtector.get(list, this.LJFF);
        if (z) {
            TextSwitcher textSwitcher = this.LIZIZ;
            if (textSwitcher != null) {
                textSwitcher.setText(str);
            }
        } else {
            TextSwitcher textSwitcher2 = this.LIZIZ;
            if (textSwitcher2 != null) {
                textSwitcher2.setCurrentText(str);
            }
        }
        Iterator it = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it.hasNext()) {
            ((T8X) it.next()).LIZ();
        }
    }
}
