package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar.QuickTitleBarCenterSingleAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Q8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Q8 extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7Q8 LJLIL = new C7Q8();

    public C7Q8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(QuickTitleBarCenterSingleAssem.class);
        uiSlotAssem.LJIIIZ = new QuickTitleBarCenterSingleAssem();
        uiSlotAssem.LJI = R.id.b8b;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZIZ;
        return C76800UCe.LIZ;
    }
}