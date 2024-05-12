package X;

import com.ss.android.ugc.aweme.im.sdk.common.ui.titlebar.TitleBarLeftAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7QZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7QZ extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7QZ LJLIL = new C7QZ();

    public C7QZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(TitleBarLeftAssem.class);
        uiSlotAssem.LJIIIZ = new TitleBarLeftAssem();
        uiSlotAssem.LJI = R.id.for;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZIZ;
        return C76800UCe.LIZ;
    }
}
