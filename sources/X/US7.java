package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class US7 extends AbstractC65781Prl implements InterfaceC88472Yns<USH, C76800UCe> {
    public static final US7 LJLIL = new US7();

    public US7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(USH ush) {
        USH pipelineConfig = ush;
        o.LJIIIZ(pipelineConfig, "$this$pipelineConfig");
        pipelineConfig.LIZ(EnumC77147UPn.FACEBOOK);
        boolean z = true;
        pipelineConfig.LIZIZ = true;
        pipelineConfig.LIZIZ(URJ.DIALOG_ACTUAL_AND_USER);
        if (C77177UQr.LJFF != null) {
            z = false;
        }
        pipelineConfig.LIZLLL = z;
        return C76800UCe.LIZ;
    }
}
