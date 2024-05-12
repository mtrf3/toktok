package X;

import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Es5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37773Es5 extends AbstractC37668EqO {
    public final /* synthetic */ InterfaceC37774Es6 LJLIL;

    @Override // X.AbstractC37668EqO, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        String value = this.LJLIL.getAccess().getValue();
        Locale US = Locale.US;
        o.LJIIIIZZ(US, "US");
        String upperCase = value.toUpperCase(US);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return EnumC38004Evo.valueOf(upperCase);
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLIL.getName();
    }

    public C37773Es5(InterfaceC37774Es6 interfaceC37774Es6) {
        this.LJLIL = interfaceC37774Es6;
    }

    @Override // X.InterfaceC37666EqM
    public final void LIZIZ(java.util.Map<String, ? extends Object> map, EX0 ex0, EnumC37844EtE type) {
        o.LJIIIZ(type, "type");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle ");
        LIZ.append(getName());
        LIZ.append(", params = ");
        LIZ.append(map);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIJ(msg, "msg");
        this.LJLIL.LIZJ(new C78530Uru(C38381F4n.LJIIJ(map)), new EX2(ex0), EnumC37847EtH.ALL);
    }
}
