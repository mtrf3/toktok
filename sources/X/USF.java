package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class USF extends AbstractC65781Prl implements InterfaceC88472Yns<USH, C76800UCe> {
    public static final USF LJLIL = new USF();

    public USF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(USH ush) {
        USH pipelineConfig = ush;
        o.LJIIIZ(pipelineConfig, "$this$pipelineConfig");
        pipelineConfig.LIZ(EnumC77147UPn.CONTACT);
        pipelineConfig.LIZIZ = true;
        pipelineConfig.LIZIZ(URJ.DIALOG_ACTUAL_AND_USER);
        pipelineConfig.LIZLLL = true;
        return C76800UCe.LIZ;
    }
}
