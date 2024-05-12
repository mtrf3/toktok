package X;

import android.content.Context;
import com.google.android.play.core.appupdate.v;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class JEE extends JEY {
    public final v LJLJJL;

    @Override // X.JEY
    public final void LIZ() {
        Iterator it = ((List) this.LJLJJL.LIZ).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((JEO) it.next()).LIZ).iterator();
            while (it2.hasNext()) {
                ((JEA) it2.next()).LJIIL();
            }
        }
    }

    @Override // X.JEY
    public final void LIZIZ() {
        Iterator it = ((List) this.LJLJJL.LIZ).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((JEO) it.next()).LIZ).iterator();
            while (it2.hasNext()) {
                ((JEA) it2.next()).LJIILIIL();
            }
        }
    }

    public final void LIZJ() {
        v vVar = this.LJLJJL;
        vVar.getClass();
        Iterator it = ((List) vVar.LIZ).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((JEO) it.next()).LIZ).iterator();
            while (it2.hasNext()) {
                JEA jea = (JEA) it2.next();
                jea.getClass();
                jea.LJLJI = this;
                jea.LJIIJ();
            }
        }
    }

    public final void LIZLLL() {
        v vVar = this.LJLJJL;
        Iterator it = ((List) vVar.LIZ).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) ((JEO) it.next()).LIZ).iterator();
            while (it2.hasNext()) {
                ((JEA) it2.next()).LJIIJJI();
            }
        }
        ((List) vVar.LIZ).clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JEE(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLJJL = new v(C47261Igj.LJJIJIL(new JED()));
    }
}
