package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113734dF extends AbstractC65781Prl implements InterfaceC88472Yns<C78888Uxg<EnumC113744dG>, C76800UCe> {
    public static final C113734dF LJLIL = new C113734dF();

    public C113734dF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C78888Uxg<EnumC113744dG> c78888Uxg) {
        C78888Uxg<EnumC113744dG> inputFeatures = c78888Uxg;
        o.LJIIIZ(inputFeatures, "$this$inputFeatures");
        if (C113774dJ.LIZ()) {
            inputFeatures.LIZ(EnumC113744dG.MULTI_MEDIA_UPLOAD, null);
        }
        inputFeatures.LIZ(EnumC113744dG.EMOJI, null);
        inputFeatures.LIZ(EnumC113744dG.REPLY, null);
        inputFeatures.LIZ(EnumC113744dG.SEND_BUTTON, null);
        inputFeatures.LIZ(EnumC113744dG.SUGGESTED_EMOJI, null);
        if (C113634d5.LIZ()) {
            inputFeatures.LIZ(EnumC113744dG.EMOJI_RED_DOT, null);
        }
        return C76800UCe.LIZ;
    }
}
