package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.RefactorKeyboardPanelV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Q0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Q0 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7Q0 LJLIL = new C7Q0();

    public C7Q0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(RefactorKeyboardPanelV2.class);
        uiSlotAssem.LJIIIZ = new RefactorKeyboardPanelV2();
        uiSlotAssem.LJI = R.id.fea;
        return C76800UCe.LIZ;
    }
}