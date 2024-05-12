package X;

import Y.IDhS107S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WPk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82240WPk implements InterfaceC81328Vvw {
    public final TPO LIZ;
    public final InterfaceC82236WPg LIZIZ;

    @Override // X.InterfaceC81328Vvw
    public final C73634Sv8 edit() {
        AbstractC73672Svk request = this.LIZ.request();
        request.getClass();
        return new C73487Ssl(request).LJIJI(new IDhS107S0100000_14(this, 4));
    }

    public C82240WPk(WR5 wr5, InterfaceC82236WPg filterRepository) {
        o.LJIIIZ(filterRepository, "filterRepository");
        this.LIZ = wr5;
        this.LIZIZ = filterRepository;
    }
}
