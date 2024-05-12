package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BE8<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ BEA LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ BE7 LJLJL;

    public BE8(int i, BEA bea, Integer num, int i2, String str, boolean z, BE7 be7) {
        this.LJLIL = i;
        this.LJLILLLLZI = bea;
        this.LJLJI = num;
        this.LJLJJI = i2;
        this.LJLJJL = str;
        this.LJLJJLL = z;
        this.LJLJL = be7;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        int i = this.LJLIL;
        BEA.LIZ.getClass();
        boolean LJ = BEA.LJ();
        String firstPanelFrom = BEA.LJJIIZI;
        o.LJIIIZ(firstPanelFrom, "firstPanelFrom");
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_limit_notification_open");
        LIZ.LJIJJ(Integer.valueOf(i), "is_open");
        LIZ.LJIJJ(Integer.valueOf(LJ ? 1 : 0), "is_anchor");
        LIZ.LJIJJ(firstPanelFrom, "first_panel_from");
        LIZ.LJIIZILJ();
        LIZ.LJJIIJZLJL();
        this.LJLILLLLZI.getClass();
        BEA.LJJIIJZLJL.setValue(Integer.valueOf(this.LJLIL));
        if (this.LJLJI != null) {
            if (BEA.LJIILL) {
                this.LJLILLLLZI.getClass();
                BEA.LJIJJLI = "COIN";
                BEA.LJIL = this.LJLJI.intValue();
            }
            this.LJLILLLLZI.getClass();
            BEA.LJJ.setValue(this.LJLJI);
        }
        if (this.LJLIL == 1 && this.LJLJI != null) {
            boolean LJ2 = BEA.LJ();
            String region = BEA.LJIJ;
            String currency = BEA.LJIILIIL;
            int intValue = this.LJLJI.intValue();
            String firstPanelFrom2 = BEA.LJJIIZI;
            String secondPanelFrom = BEA.LJJIJ;
            int i2 = this.LJLJJI;
            String applyType = this.LJLJJL;
            boolean z = this.LJLJJLL;
            boolean z2 = BEA.LJIILL;
            o.LJIIIZ(region, "region");
            String str2 = "currency";
            o.LJIIIZ(currency, "currency");
            o.LJIIIZ(firstPanelFrom2, "firstPanelFrom");
            o.LJIIIZ(secondPanelFrom, "secondPanelFrom");
            o.LJIIIZ(applyType, "applyType");
            BZI LIZ2 = C28787BRn.LIZ("livesdk_gift_limit_notification_set");
            KNV.LJ(LJ2 ? 1 : 0, LIZ2, "is_anchor", region, "region");
            C78895Uxn.LIZIZ(LIZ2, currency, "currency", intValue, "gift_limit_gear");
            LIZ2.LJIJJ(firstPanelFrom2, "first_panel_from");
            C78895Uxn.LIZIZ(LIZ2, secondPanelFrom, "second_panel_from", i2, "if_use_apply");
            LIZ2.LJIJJ(applyType, "apply_type");
            if (z) {
                str = "1";
            } else {
                str = "2";
            }
            LIZ2.LJIJJ(str, "style");
            if (z2) {
                str2 = "coins";
            }
            C1FL.LJI(LIZ2, str2, "coins_or_currency");
        }
        this.LJLJL.onSuccess();
    }
}
