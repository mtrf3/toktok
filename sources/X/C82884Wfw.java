package X;

import android.graphics.Typeface;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82884Wfw extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC82885Wfx, C76800UCe> {
    public static final C82884Wfw LJLIL = new C82884Wfw();

    public C82884Wfw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC82885Wfx interfaceC82885Wfx) {
        InterfaceC82885Wfx style = interfaceC82885Wfx;
        o.LJIIIZ(style, "$this$style");
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL(EnumC49617Jdd.REGULAR.getFONT_NAME());
        if (LIZLLL != null) {
            style.LIZ(new AqS164S0100000_14(LIZLLL, 319));
        }
        style.LJ(new OFX());
        style.LJFF(C82850WfO.LJLIL);
        return C76800UCe.LIZ;
    }
}
