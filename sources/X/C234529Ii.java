package X;

import com.bytedance.tux.icon.TuxIconView;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234529Ii extends AbstractC234519Ih {
    public C2068389v LJ;
    public InterfaceC88472Yns<? super TuxIconView, C76800UCe> LJFF;
    public CharSequence LJII;
    public int LIZJ = -1;
    public boolean LIZLLL = true;
    public boolean LJI = true;

    public final void LIZJ() {
        this.LIZJ = -1;
        this.LJ = null;
        this.LJFF = null;
    }

    public final void LIZ(C2068389v icon) {
        o.LJIIIZ(icon, "icon");
        LIZJ();
        this.LJ = icon;
    }

    public final void LIZIZ(final InterfaceC65784Pro listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ = new InterfaceC252739vx() { // from class: X.9Ij
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                listener.invoke();
            }
        };
    }

    public final void LIZLLL(Object tag) {
        o.LJIIIZ(tag, "tag");
        this.LIZIZ = tag;
    }
}
