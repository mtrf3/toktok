package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPQ extends JPN {
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final View LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;

    public final boolean LIZIZ() {
        return ((Boolean) this.LJFF.getValue()).booleanValue();
    }

    public JPQ(ViewStub viewStub, AqS158S0100000_8 aqS158S0100000_8) {
        this.LIZLLL = aqS158S0100000_8;
        viewStub.setLayoutResource(R.layout.cgb);
        View inflate = viewStub.inflate();
        o.LJIIIIZZ(inflate, "stub.apply {\n        lay…ot_header\n    }.inflate()");
        this.LJ = inflate;
        this.LJFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 8));
        this.LJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 9));
        this.LJII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 10));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 11));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 13));
        this.LJIIJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 12));
    }
}
