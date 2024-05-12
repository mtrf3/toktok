package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.TakoChatSendButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.4dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113754dH extends AbstractC65781Prl implements InterfaceC88472Yns<C78888Uxg<EnumC113744dG>, C76800UCe> {
    public static final C113754dH LJLIL = new C113754dH();

    public C113754dH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C78888Uxg<EnumC113744dG> c78888Uxg) {
        C78888Uxg<EnumC113744dG> inputFeatures = c78888Uxg;
        o.LJIIIZ(inputFeatures, "$this$inputFeatures");
        inputFeatures.LIZ(EnumC113744dG.EMOJI, null);
        inputFeatures.LIZ(EnumC113744dG.SEND_BUTTON, C65352Pkq.LIZ(TakoChatSendButtonAssem.class));
        return C76800UCe.LIZ;
    }
}
