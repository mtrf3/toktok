package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.SingleChatInputAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7QM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7QM extends AbstractC65781Prl implements InterfaceC88472Yns<C8V5, C76800UCe> {
    public static final C7QM LJLIL = new C7QM();

    public C7QM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8V5 c8v5) {
        C8V5 uiSlotAssem = c8v5;
        o.LJIIIZ(uiSlotAssem, "$this$uiSlotAssem");
        uiSlotAssem.LIZ = C65352Pkq.LIZ(SingleChatInputAssem.class);
        uiSlotAssem.LJIIIZ = new SingleChatInputAssem();
        uiSlotAssem.LJI = R.id.msl;
        uiSlotAssem.LJIIIIZZ = C212518Vr.LIZ;
        return C76800UCe.LIZ;
    }
}