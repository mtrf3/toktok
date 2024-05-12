package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem.SingleTitleBarCenterAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7QS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7QS extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7QS LJLIL = new C7QS();

    public C7QS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(SingleTitleBarCenterAssem.class);
        uiSlotAssem.LJIIIZ = new SingleTitleBarCenterAssem();
        uiSlotAssem.LJI = R.id.b8b;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZIZ;
        return C76800UCe.LIZ;
    }
}
