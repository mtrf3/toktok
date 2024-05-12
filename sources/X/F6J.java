package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F6J implements InterfaceC37126Ehe {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public F6J(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC37126Ehe
    public final void onSuccess(String name, boolean z) {
        o.LJIIIZ(name, "name");
        C70922qO.LIZ("CastingPluginInstaller", "IPluginInstallListener onSuccess");
        if (F6I.LIZLLL()) {
            F6I.LIZIZ(this.LJLIL);
        }
    }

    @Override // X.InterfaceC37126Ehe
    public final void onFailed(String str, boolean z, int i) {
        C70922qO.LIZ("CastingPluginInstaller", "IPluginInstallListener onFailed");
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }
}
