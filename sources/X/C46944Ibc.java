package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Ibc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46944Ibc extends C46946Ibe {
    public InterfaceC46926IbK LJFF;

    public C46944Ibc(InterfaceC46949Ibh interfaceC46949Ibh) {
        super(interfaceC46949Ibh);
    }

    @Override // X.C46946Ibe, X.InterfaceC46926IbK
    public final IYO LIZIZ(List<? extends IYN> list, java.util.Map<String, Object> map) {
        Float f;
        IYO iyo = new IYO();
        if (list != null && !list.isEmpty()) {
            map.get("source_id");
            Object obj = map.get("KEY_AUTO_BITRATE_SET");
            if (obj instanceof IY3) {
                this.LJFF.LIZ((IY3) obj);
                return this.LJFF.LIZIZ(list, map);
            }
            C46687ITz c46687ITz = IE2.LIZ;
            if (c46687ITz == null) {
                c46687ITz = IFR.LIZ;
            }
            AbstractC48510J2c LIZIZ = c46687ITz.LIZIZ("smart_model_play_selection");
            if (LIZIZ != null && LIZIZ.LIZLLL()) {
                C47322Ihi c47322Ihi = new C47322Ihi();
                java.util.Map map2 = c47322Ihi.LIZLLL;
                if (map2 == null) {
                    map2 = new HashMap();
                    c47322Ihi.LIZLLL = map2;
                }
                map2.putAll(map);
                C47333Iht LJIIIIZZ = LIZIZ.LJIIIIZZ(c47322Ihi);
                if (LJIIIIZZ != null && LJIIIIZZ.LIZ() && (f = LJIIIIZZ.LIZJ) != null) {
                    double doubleValue = f.doubleValue();
                    iyo.LJLJI = doubleValue;
                    LJ(iyo, new C46945Ibd(true, doubleValue), list);
                    C16880lQ.LLLZ("smart select success: calcBitRate:%s, finalBitRate:%s", new Object[]{Double.valueOf(iyo.LJLJI), iyo.LJLIL});
                    return iyo;
                }
            }
            return this.LJFF.LIZIZ(list, map);
        }
        iyo.LJLILLLLZI = new C46892Iam(0, "bitrate list is empty...");
        return iyo;
    }
}
