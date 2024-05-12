package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.assem.TakoTitleBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7QK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7QK extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7QK LJLIL = new C7QK();

    public C7QK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(TakoTitleBarAssem.class);
        uiSlotAssem.LJIIIZ = new TakoTitleBarAssem();
        uiSlotAssem.LJI = R.id.b_4;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZLLL;
        return C76800UCe.LIZ;
    }
}
