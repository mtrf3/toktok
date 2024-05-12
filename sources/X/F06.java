package X;

import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes7.dex */
public final class F06 implements InterfaceC40275FrL {
    public final /* synthetic */ InterfaceC60761Nsz LJLIL;

    public F06(InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJLIL = interfaceC60761Nsz;
    }

    @Override // X.InterfaceC40275FrL
    public final void LIZ(String str) {
        InterfaceC60844NuK interfaceC60844NuK;
        if ((this.LJLIL.getHybridContext() instanceof SparkContext) && (interfaceC60844NuK = (InterfaceC60844NuK) this.LJLIL.getHybridContext().LIZIZ(InterfaceC60844NuK.class)) != null) {
            interfaceC60844NuK.LJJIII(str);
        }
    }
}
