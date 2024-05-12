package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.QJs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66804QJs extends JFP<InterfaceC66764QIe> {
    public final /* synthetic */ C66765QIf LIZJ;

    public C66804QJs(C66765QIf c66765QIf) {
        this.LIZJ = c66765QIf;
    }

    @Override // X.JFP
    public final InterfaceC66764QIe LIZ(Object[] objArr) {
        if (C36860EdM.LIZLLL((Context) objArr[0])) {
            C66793QJh c66793QJh = new C66793QJh(this.LIZJ);
            Context context = (Context) objArr[0];
            if (!(context instanceof Application) && context != null) {
                context = C16880lQ.LLLLL(context);
            }
            Application application = (Application) context;
            if (application != null && C66793QJh.LJI.compareAndSet(false, true)) {
                application.registerActivityLifecycleCallbacks(C66795QJj.LIZ);
            }
            c66793QJh.LIZLLL = this.LIZJ.LJI;
            return c66793QJh;
        }
        C66803QJr c66803QJr = new C66803QJr(this.LIZJ);
        c66803QJr.LIZIZ = this.LIZJ.LJI;
        return c66803QJr;
    }
}
