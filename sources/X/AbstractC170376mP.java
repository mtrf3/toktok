package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.6mP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC170376mP {
    public final String LJLIL;
    public final C164926dc LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJI;
    public C170366mO LJLJJL;
    public boolean LJLJJLL;

    public void LIZ() {
    }

    public abstract String LIZLLL();

    public void LJFF() {
    }

    public abstract View LJI();

    public final C170366mO LIZJ() {
        C170366mO c170366mO = this.LJLJJL;
        if (c170366mO != null) {
            return c170366mO;
        }
        o.LJIJI("headerAdapter");
        throw null;
    }

    public final View LJ() {
        View view = this.LJLJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("view");
        throw null;
    }

    public C164926dc LIZIZ() {
        return this.LJLILLLLZI;
    }

    public boolean LJII() {
        return this.LJLJJI;
    }

    public void LJIIIIZZ(boolean z) {
        if (this.LJLJJLL == z || this.LJLJI == null) {
            return;
        }
        this.LJLJJLL = z;
        if (!z) {
            return;
        }
        LJFF();
    }

    public AbstractC170376mP(WM7 scene, String categoryKey, C164926dc config) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(categoryKey, "categoryKey");
        o.LJIIIZ(config, "config");
        this.LJLIL = categoryKey;
        this.LJLILLLLZI = config;
    }
}
