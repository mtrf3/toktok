package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class US6 extends AbstractC65781Prl implements InterfaceC88472Yns<USH, C76800UCe> {
    public static final US6 LJLIL = new US6();

    public US6() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(USH ush) {
        USH pipelineConfig = ush;
        o.LJIIIZ(pipelineConfig, "$this$pipelineConfig");
        pipelineConfig.LIZ(EnumC77147UPn.CONTACT);
        boolean z = true;
        pipelineConfig.LIZIZ = true;
        pipelineConfig.LIZIZ(URJ.BLACK_BACKGROUND_ACTUAL_DIALOG_USER);
        if (C77177UQr.LJFF != null) {
            z = false;
        }
        pipelineConfig.LIZLLL = z;
        return C76800UCe.LIZ;
    }
}
