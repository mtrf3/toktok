package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SVQ extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final SVQ LJLIL = new SVQ();

    public SVQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LJI = R.id.h2v;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZLLL;
        uiSlotAssem.LIZ = C65352Pkq.LIZ(NonPersonalizedAssem.class);
        uiSlotAssem.LJIIIZ = new NonPersonalizedAssem();
        return C76800UCe.LIZ;
    }
}
