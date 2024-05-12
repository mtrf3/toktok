package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LMD extends AbstractC65781Prl implements InterfaceC88472Yns<LM4, C76800UCe> {
    public static final LMD LJLIL = new LMD();

    public LMD() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LM4 lm4) {
        LM4 runIconLifecycle = lm4;
        o.LJIIIZ(runIconLifecycle, "$this$runIconLifecycle");
        runIconLifecycle.onCreate();
        return C76800UCe.LIZ;
    }
}
