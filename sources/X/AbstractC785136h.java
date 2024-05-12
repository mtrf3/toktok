package X;

import android.app.Activity;
import android.content.res.Configuration;
import kotlin.jvm.internal.o;

/* renamed from: X.36h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC785136h implements G27 {
    public final Activity LJLIL;
    public final AbstractC90763hI LJLILLLLZI;
    public final C3L4 LJLJI;
    public final C63120Opw LJLJJI;
    public final String LJLJJL;
    public C26231ARf LJLJJLL;

    public abstract void LIZ();

    public abstract int LIZIZ();

    public abstract int LIZJ();

    public int LIZLLL() {
        return 0;
    }

    public boolean LJ() {
        return false;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        C26231ARf c26231ARf = this.LJLJJLL;
        if (c26231ARf != null) {
            c26231ARf.LIZIZ(null);
        }
        this.LJLJJLL = null;
    }

    public AbstractC785136h(Activity activity, AbstractC90763hI abstractC90763hI, C3L4 c3l4) {
        this.LJLIL = activity;
        this.LJLILLLLZI = abstractC90763hI;
        this.LJLJI = c3l4;
        this.LJLJJI = abstractC90763hI.LIZLLL();
        this.LJLJJL = abstractC90763hI.LJ();
        C9XU.LIZJ(this);
    }
}
