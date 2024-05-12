package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.assem.GroupTitleBarRightAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7QQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7QQ extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7QQ LJLIL = new C7QQ();

    public C7QQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(GroupTitleBarRightAssem.class);
        uiSlotAssem.LJIIIZ = new GroupTitleBarRightAssem();
        uiSlotAssem.LJI = R.id.j2_;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZIZ;
        return C76800UCe.LIZ;
    }
}
