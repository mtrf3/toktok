package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBW extends AbstractC65781Prl implements InterfaceC88473Ynt<Context, String, C60737Nsb, InterfaceC60833Nu9> {
    public static final CBW LJLIL = new CBW();

    public CBW() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC60833Nu9 invoke(Context context, String str, C60737Nsb c60737Nsb) {
        Context context2 = context;
        String schema = str;
        C60737Nsb c60737Nsb2 = c60737Nsb;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(schema, "schema");
        if (c60737Nsb2 instanceof SparkContext) {
            C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
            SparkContext sparkContext = (SparkContext) c60737Nsb2;
            sparkContext.usePreload = true;
            return KMP.LIZJ(c40342FsQ, context2, sparkContext);
        }
        C40342FsQ c40342FsQ2 = C40343FsR.LJIILJJIL;
        SparkContext LIZIZ = C42193GhB.LIZIZ(schema);
        LIZIZ.usePreload = true;
        return KMP.LIZJ(c40342FsQ2, context2, LIZIZ);
    }
}
