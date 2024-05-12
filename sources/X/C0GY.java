package X;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0GY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0GY {
    public java.util.Map<String, List<C274816a>> LIZJ;
    public java.util.Map<String, C04750Gp> LIZLLL;
    public java.util.Map<String, C263511r> LJ;
    public C0MB<C263611s> LJFF;
    public C0M5<C274816a> LJI;
    public List<C274816a> LJII;
    public Rect LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final C04640Ge LIZ = new C04640Ge();
    public final HashSet<String> LIZIZ = new HashSet<>();
    public String LJIILJJIL = "";

    public final float LIZIZ() {
        return ((this.LJIIJ - this.LJIIIZ) / this.LJIIJJI) * 1000.0f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<C274816a> it = this.LJII.iterator();
        while (it.hasNext()) {
            sb.append(it.next().LIZ("\t"));
        }
        return sb.toString();
    }

    public final void LIZ(String str) {
        this.LIZIZ.add(str);
    }
}
