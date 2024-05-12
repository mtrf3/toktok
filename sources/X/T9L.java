package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T9L implements InterfaceC69602oG {
    public final /* synthetic */ T9K LJLIL;

    public T9L(T9K t9k) {
        this.LJLIL = t9k;
    }

    @Override // X.InterfaceC69602oG
    public final void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt currentType) {
        o.LJIIIZ(currentType, "currentType");
        if (currentType == EnumC111394Yt.AVAILABLE) {
            this.LJLIL.getClass();
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LIZ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            T9K t9k = this.LJLIL;
            C7XR c7xr = t9k.LJII;
            if (c7xr != null) {
                t9k.LJ.removeCallbacks(c7xr);
            }
            C2NU.LIZ.LIZLLL(this.LJLIL.LJIIIIZZ);
        }
    }
}
