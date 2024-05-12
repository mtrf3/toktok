package X;

import android.view.View;
import kotlin.jvm.internal.AqS159S0100000_9;

/* renamed from: X.MMc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56674MMc extends MMX<C56673MMb> {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;

    public final C223338pd c0() {
        return (C223338pd) this.LJLJLLL.getValue();
    }

    public final C223338pd f0() {
        return (C223338pd) this.LJLL.getValue();
    }

    public C56674MMc(View view) {
        super(view);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 969));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 970));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(view, 968));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 967));
        View view2 = (View) C221108m2.LIZIZ(new AqS159S0100000_9(view, 966)).getValue();
        view2.getClass();
        C56204M4a.LJFF(view2, MMA.LJLIL);
    }

    @Override // X.MMX
    public final void V(C56673MMb c56673MMb) {
        C56673MMb c56673MMb2 = c56673MMb;
        super.V(c56673MMb2);
        int i = c56673MMb2.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    f0().setVisibility(0);
                    f0().LIZIZ();
                    ((View) this.LJLLI.getValue()).setVisibility(8);
                    ((View) this.LJLLILLLL.getValue()).setVisibility(8);
                    c0().setVisibility(8);
                    return;
                }
                c0().setVisibility(0);
                c0().LIZIZ();
                ((View) this.LJLLI.getValue()).setVisibility(8);
                ((View) this.LJLLILLLL.getValue()).setVisibility(8);
                f0().setVisibility(8);
                return;
            }
            ((View) this.LJLLILLLL.getValue()).setVisibility(0);
            ((View) this.LJLLI.getValue()).setVisibility(8);
            c0().setVisibility(8);
            f0().setVisibility(8);
            return;
        }
        ((View) this.LJLLI.getValue()).setVisibility(0);
        ((View) this.LJLLILLLL.getValue()).setVisibility(8);
        c0().setVisibility(8);
        f0().setVisibility(8);
    }
}
