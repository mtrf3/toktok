package X;

import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.Yab, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87649Yab<DO> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C87648Yaa.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS166S0100000_16(this, 1));

    public final void LIZJ(DO r3) {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-subject>(...)");
        ((C73849Syb) value).onNext(new C87646YaY(r3));
    }
}
