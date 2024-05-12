package X;

import android.view.ViewGroup;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.HashMap;

/* renamed from: X.VQm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79720VQm {
    public final LynxUI LIZ;
    public int LIZIZ;
    public ViewGroup LIZJ;
    public UIGroup LIZLLL;
    public C79713VQf LJ;
    public C79713VQf LJFF;
    public C79713VQf LJI;
    public C79713VQf LJII;
    public String LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public volatile boolean LJIIJ;
    public final HashMap<String, VRC> LJIIJJI = new HashMap<>();

    public final boolean LIZ() {
        if (this.LJIIIZ || this.LJIIJ) {
            return true;
        }
        return false;
    }

    public C79720VQm(LynxUI lynxUI) {
        this.LIZ = lynxUI;
    }
}
