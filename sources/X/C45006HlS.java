package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: X.HlS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C45006HlS extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C68322mC<InterfaceC92693kP> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45006HlS(C68322mC<InterfaceC92693kP> c68322mC) {
        super(0, C43383H0x.class, "manualCancel", "tryInitData$manualCancel(Lkotlin/jvm/internal/Ref$ObjectRef;)V", 0);
        this.LJLIL = c68322mC;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C68322mC<InterfaceC92693kP> c68322mC = this.LJLIL;
        C5Z5.LIZIZ("HWCompileProbe ; ManualCancel");
        InterfaceC92693kP interfaceC92693kP = c68322mC.element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        TEVideoUtils.nativeCancelCompileProbe();
        return C76800UCe.LIZ;
    }
}
