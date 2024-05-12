package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MIY extends AbstractC65781Prl implements InterfaceC88472Yns<C58620MzY, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C56438MDa LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIY(boolean z, int i, C56438MDa c56438MDa) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = c56438MDa;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C58620MzY c58620MzY) {
        EnumC56572MIe enumC56572MIe;
        C58620MzY log = c58620MzY;
        o.LJIIIZ(log, "$this$log");
        C56569MIb.LIZ.getClass();
        log.LJII(C56569MIb.LIZJ, EnumC56570MIc.REQUEST);
        N20<EnumC56572MIe, Integer> n20 = C56569MIb.LJIIJJI;
        if (this.LJLIL) {
            enumC56572MIe = EnumC56572MIe.BEFORE;
        } else {
            enumC56572MIe = EnumC56572MIe.AFTER;
        }
        log.LJII(n20, enumC56572MIe);
        log.LJII(C56569MIb.LJII, Integer.valueOf(this.LJLILLLLZI));
        java.util.Map<String, Long> map = this.LJLJI.LIZ;
        C56593MIz c56593MIz = C56569MIb.LIZLLL;
        Long l = (Long) ((LinkedHashMap) map).get(c56593MIz.LIZ);
        if (l != null) {
            log.LJII(c56593MIz, Long.valueOf(l.longValue()));
        }
        java.util.Map<String, Long> map2 = this.LJLJI.LIZ;
        C56593MIz c56593MIz2 = C56569MIb.LJ;
        Long l2 = (Long) ((LinkedHashMap) map2).get(c56593MIz2.LIZ);
        if (l2 != null) {
            log.LJII(c56593MIz2, Long.valueOf(l2.longValue()));
        }
        java.util.Map<String, Long> map3 = this.LJLJI.LIZ;
        C56593MIz c56593MIz3 = C56569MIb.LJFF;
        Long l3 = (Long) ((LinkedHashMap) map3).get(c56593MIz3.LIZ);
        if (l3 != null) {
            log.LJII(c56593MIz3, Long.valueOf(l3.longValue()));
        }
        java.util.Map<String, Long> map4 = this.LJLJI.LIZ;
        C56593MIz c56593MIz4 = C56569MIb.LJI;
        Long l4 = (Long) ((LinkedHashMap) map4).get(c56593MIz4.LIZ);
        if (l4 != null) {
            log.LJII(c56593MIz4, Long.valueOf(l4.longValue()));
        }
        java.util.Map<String, Long> map5 = this.LJLJI.LIZ;
        C56593MIz c56593MIz5 = C56569MIb.LJIIJ;
        Long l5 = (Long) ((LinkedHashMap) map5).get(c56593MIz5.LIZ);
        if (l5 != null) {
            log.LJII(c56593MIz5, Long.valueOf(l5.longValue()));
        }
        return C76800UCe.LIZ;
    }
}
