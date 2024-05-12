package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NB4 extends NB0 {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        C60737Nsb c60737Nsb;
        InterfaceC60761Nsz interfaceC60761Nsz;
        o.LJIIIZ(type, "type");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (interfaceC60761Nsz = (InterfaceC60761Nsz) interfaceC38263Ezz.LJ(InterfaceC60761Nsz.class)) != null) {
            c60737Nsb = interfaceC60761Nsz.getHybridContext();
        } else {
            c60737Nsb = null;
        }
        if (!(c60737Nsb instanceof SparkContext)) {
            c60737Nsb = null;
        }
        if (c60737Nsb == null) {
            c37356ElM.onFailure(0, "spark context is null or not Spark Context.", (XBaseResultModel) ED5.LIZJ(NB2.class, null));
            return;
        }
        NB5 nb5 = (NB5) c60737Nsb.LIZIZ(NB5.class);
        if (nb5 != null) {
            nb5.LIZ();
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(NB2.class, null), "");
            c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(NB2.class, null), "");
            return;
        }
        c37356ElM.onFailure(0, "callback is null", (XBaseResultModel) ED5.LIZJ(NB2.class, null));
    }
}
