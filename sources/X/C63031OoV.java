package X;

import android.content.DialogInterface;
import kotlin.jvm.internal.AqS173S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OoV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63031OoV extends F9E {
    public final String LJLIL;
    public final EnumC63033OoX LJLILLLLZI;
    public final InterfaceC88471Ynr<DialogInterface, Integer, C76800UCe> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C63031OoV(String title, EnumC63033OoX style, AqS173S0200000_10 aqS173S0200000_10) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(style, "style");
        this.LJLIL = title;
        this.LJLILLLLZI = style;
        this.LJLJI = aqS173S0200000_10;
    }
}
