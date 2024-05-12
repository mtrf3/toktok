package X;

import com.ss.android.ugc.aweme.ecommerce.mall.ui.floating.MallUserBubbleAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SW0 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SW0 LJLIL = new SW0();

    public SW0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(MallUserBubbleAssem.class);
        uiSlotAssem.LJIIIZ = new MallUserBubbleAssem();
        uiSlotAssem.LJI = R.id.myk;
        return C76800UCe.LIZ;
    }
}
