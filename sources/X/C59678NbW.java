package X;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NbW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59678NbW {
    public int LIZ;
    public Object LIZIZ;
    public Object LIZJ;
    public Object LIZLLL;
    public final Object LJ;

    public C59678NbW(C105394Br c105394Br) {
        this.LJ = c105394Br;
        this.LIZLLL = new ArrayList();
        if (c105394Br.LIZIZ) {
            if (this.LIZJ == null) {
                this.LIZJ = new C106624Gk(c105394Br.LJI);
            }
            Object obj = this.LIZJ;
            if (this.LIZLLL == null) {
                this.LIZLLL = new ArrayList();
            }
            ((List) this.LIZLLL).add(obj);
        }
        if (((List) this.LIZLLL).size() <= 0) {
            return;
        }
        this.LIZ = 0;
        this.LIZIZ = ListProtector.get((List) this.LIZLLL, 0);
    }

    public final Boolean LIZ(MotionEvent event) {
        o.LJIIJ(event, "event");
        int actionMasked = event.getActionMasked();
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                ((C16610kz) this.LIZLLL).LJIIL(0);
            } else {
                int y = (int) event.getY();
                int i2 = this.LIZ - y;
                if (((C16610kz) this.LIZLLL).LIZLLL(0, i2, (int[]) this.LIZIZ, (int[]) this.LIZJ)) {
                    i2 -= ((int[]) this.LIZIZ)[1];
                    event.offsetLocation(0.0f, ((int[]) this.LIZJ)[1]);
                }
                this.LIZ = y - ((int[]) this.LIZJ)[1];
                int scrollY = ((View) this.LJ).getScrollY();
                int i3 = scrollY + i2;
                if (i3 > 0) {
                    i = i3;
                }
                int i4 = i - scrollY;
                int i5 = i2 - i4;
                if (((C16610kz) this.LIZLLL).LJFF(0, i4, 0, i5, (int[]) this.LIZJ)) {
                    int i6 = ((int[]) this.LIZJ)[1];
                    this.LIZ -= i6;
                    if (i6 != 0) {
                        event.offsetLocation(0.0f, i6);
                        if (Math.abs(i6) == Math.abs(i5)) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
        } else {
            this.LIZ = (int) event.getY();
            ((C16610kz) this.LIZLLL).LJIIJJI(2, 0);
        }
        return null;
    }

    public /* synthetic */ C59678NbW(WebKitView view) {
        o.LJIIJ(view, "view");
        this.LJ = view;
        this.LIZIZ = new int[2];
        this.LIZJ = new int[2];
        C16610kz c16610kz = new C16610kz(view);
        this.LIZLLL = c16610kz;
        c16610kz.LJIIJ(true);
    }
}
