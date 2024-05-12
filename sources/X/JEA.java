package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JEA {
    public final int LJLIL;
    public View LJLILLLLZI;
    public JEY LJLJI;
    public Resources LJLJJI;
    public Context LJLJJL;

    public JEA() {
        this(-1);
    }

    public abstract View LJI(Context context, JEE jee);

    public void LJIIJ() {
    }

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public void LJIILIIL() {
    }

    public void LJIILJJIL(View view) {
    }

    public final LifecycleOwner LJIIIIZZ() {
        JEY jey = this.LJLJI;
        if (jey != null) {
            return jey;
        }
        throw new IllegalStateException("should be called after onCreate or before onDestroy");
    }

    public JEA(int i) {
        this.LJLIL = i;
    }

    public final int LJII(int i) {
        Context context = this.LJLJJL;
        if (context != null) {
            Integer LJI = C79045V0n.LJI(i, context);
            if (LJI != null) {
                return LJI.intValue();
            }
            return -16777216;
        }
        o.LJIJI("context");
        throw null;
    }

    public final String LJIIIZ(int i) {
        Resources resources = this.LJLJJI;
        if (resources == null) {
            resources = EF7.LIZIZ().getResources();
            o.LJIIIIZZ(resources, "AppContextManager.getApp…cationContext().resources");
        }
        String string = resources.getString(i);
        o.LJIIIIZZ(string, "requireResources().getString(id)");
        return string;
    }
}
