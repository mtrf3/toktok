package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class M1W extends AbstractC65781Prl implements InterfaceC88472Yns<O26, Boolean> {
    public static final M1W LJLIL = new M1W();

    public M1W() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(O26 o26) {
        O26 resInfo = o26;
        o.LJIIIZ(resInfo, "resInfo");
        boolean z = false;
        if ((resInfo instanceof O2Z) && o.LJ(((O2Z) resInfo).LJIJJ, "template")) {
            String uri = resInfo.LJI.toString();
            o.LJIIIIZZ(uri, "resInfo.srcUri.toString()");
            if (s.LJJJLZIJ(uri, "tiktok_live_ecommerce_ttmall_ttf", false)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
