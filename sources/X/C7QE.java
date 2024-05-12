package X;

import com.ss.android.ugc.now.interaction.assem.NowKeyboardInputAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7QE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7QE extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7QE LJLIL = new C7QE();

    public C7QE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(NowKeyboardInputAssem.class);
        uiSlotAssem.LJIIIZ = new NowKeyboardInputAssem();
        uiSlotAssem.LJI = R.id.eou;
        return C76800UCe.LIZ;
    }
}
