package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPS {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final View LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;

    public JPS(ViewStub viewStub, AqS158S0100000_8 aqS158S0100000_8) {
        this.LIZ = aqS158S0100000_8;
        viewStub.setLayoutResource(R.layout.cim);
        View inflate = viewStub.inflate();
        o.LJIIIIZZ(inflate, "stub.apply {\n        lay…ad_header\n    }.inflate()");
        this.LIZIZ = inflate;
        this.LIZJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 564));
        this.LIZLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 565));
        this.LJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 566));
    }
}
