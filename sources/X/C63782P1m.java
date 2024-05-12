package X;

import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.P1m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C63782P1m extends SIT {
    public final Class<? extends PowerCell<?>>[] LJLJJLL;
    public List<? extends InterfaceC57784Mm4> LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        Class<? extends PowerCell<?>>[] clsArr = this.LJLJJLL;
        LJIIIIZZ((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        List<? extends InterfaceC57784Mm4> list = this.LJLJL;
        if (list != null) {
            this.LJLJJL.LJIILLIIL(list);
            this.LJLJL = null;
        }
        View view = this.LJLJLJ;
        if (view != null) {
            LIZIZ(0, view);
            this.LJLJLJ = null;
        }
        View view2 = this.LJLJLLL;
        if (view2 != null) {
            LIZ(view2);
            this.LJLJLLL = null;
        }
    }

    public C63782P1m(Class<? extends PowerCell<?>>... clsArr) {
        this.LJLJJLL = clsArr;
    }

    public final void LJIIJ(C84773Uj c84773Uj) {
        if (c84773Uj != null && o.LJ(c84773Uj.getTag(-1000), Boolean.TRUE)) {
            return;
        }
        if (LJI()) {
            LIZIZ(0, c84773Uj);
        } else {
            this.LJLJLJ = c84773Uj;
        }
        if (c84773Uj != null) {
            c84773Uj.setTag(-1000, Boolean.TRUE);
        }
    }

    public final void LJIIJJI(List<? extends InterfaceC57784Mm4> list) {
        o.LJIIIZ(list, "list");
        if (LJI()) {
            this.LJLJJL.LJIILLIIL(list);
        } else {
            this.LJLJL = list;
        }
    }
}
