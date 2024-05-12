package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BHp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28529BHp extends AbstractC65781Prl implements InterfaceC88472Yns<EnumC28526BHm, C76800UCe> {
    public static final C28529BHp LJLIL = new C28529BHp();

    public C28529BHp() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EnumC28526BHm enumC28526BHm) {
        EnumC28526BHm event = enumC28526BHm;
        o.LJIIIZ(event, "event");
        int i = C28528BHo.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C71227RxP.LIZJ("tiktokec_popup_click", "remove");
                }
            } else {
                C71227RxP.LIZJ("tiktokec_popup_click", "yes");
            }
        } else {
            C71227RxP.LIZJ("tiktokec_popup_show", null);
        }
        return C76800UCe.LIZ;
    }
}
