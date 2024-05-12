package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final /* synthetic */ class SL2 extends TBS implements InterfaceC88472Yns<Integer, C76800UCe> {
    public SL2(Object obj) {
        super(1, obj, SL1.class, "onSelect", "onSelect(I)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        String str;
        int intValue = num.intValue();
        SL1 sl1 = (SL1) this.receiver;
        sl1.LJLLI.lv0(intValue);
        String enterMethod = sl1.LJLL.LJLIL;
        o.LJIIIZ(enterMethod, "enterMethod");
        if (intValue == 1) {
            str = "all_filter_on_ck";
        } else {
            str = "all_filter_off_ck";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", enterMethod);
        FMX.LJIIL(str, c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
