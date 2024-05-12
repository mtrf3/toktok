package X;

import com.ss.android.ugc.aweme.popularfeed.ui.PopularFeedToFYPAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUX extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SUX LJLIL = new SUX();

    public SUX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(PopularFeedToFYPAssem.class);
        uiSlotAssem.LJIIIZ = new PopularFeedToFYPAssem();
        uiSlotAssem.LJI = R.id.dft;
        return C76800UCe.LIZ;
    }
}
