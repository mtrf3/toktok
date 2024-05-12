package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M2F extends AbstractC65781Prl implements InterfaceC88473Ynt<Context, String, C60737Nsb, InterfaceC60833Nu9> {
    public final /* synthetic */ M2M LJLIL;
    public final /* synthetic */ ALE LJLILLLLZI;
    public final /* synthetic */ AbstractC60815Ntr LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2F(M2M m2m, ALE ale, C61002Nws c61002Nws) {
        super(3);
        this.LJLIL = m2m;
        this.LJLILLLLZI = ale;
        this.LJLJI = c61002Nws;
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC60833Nu9 invoke(Context context, String str, C60737Nsb c60737Nsb) {
        Context context2 = context;
        String schema = str;
        C60737Nsb c60737Nsb2 = c60737Nsb;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(schema, "schema");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("->EComSparkLoader.preloadFactory,\nschema: ");
        LIZ.append(schema);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        this.LJLIL.LJIJJLI.getClass();
        this.LJLIL.LIZJ.putAll(new HashMap());
        if (c60737Nsb2 instanceof SparkContext) {
            SparkContext sparkContext = (SparkContext) c60737Nsb2;
            sparkContext.usePreload = this.LJLILLLLZI.LJIIIZ;
            sparkContext.LJJIJLIJ(schema);
            sparkContext.LJJIIJ("enable_pending_js_task", CardStruct.IStatusCode.DEFAULT);
            sparkContext.LJJIJ(this.LJLIL.LIZJ);
            sparkContext.LJJ(this.LJLJI);
            InterfaceC60814Ntq interfaceC60814Ntq = this.LJLIL.LJIIL;
            if (interfaceC60814Ntq != null) {
                sparkContext.LJJIJIL(interfaceC60814Ntq);
            }
            for (Map.Entry<Class<?>, M2E<?>> entry : this.LJLIL.LJIILL.entrySet()) {
                Class<?> key = entry.getKey();
                o.LJII(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
                sparkContext.LJII(key, entry.getValue().LIZIZ());
            }
            return KMP.LIZJ(C40343FsR.LJIILJJIL, context2, sparkContext);
        }
        M2M m2m = this.LJLIL;
        m2m.getClass();
        m2m.LJIILLIIL = schema;
        return KMP.LIZJ(C40343FsR.LJIILJJIL, context2, m2m.LIZ(C0JU.LIZ("enable_pending_js_task", CardStruct.IStatusCode.DEFAULT), this.LJLILLLLZI.LJIIIZ));
    }
}
