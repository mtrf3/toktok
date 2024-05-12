package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.a9s, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92384a9s extends AbstractC65781Prl implements InterfaceC88473Ynt<Context, String, C60737Nsb, InterfaceC60833Nu9> {
    public static final C92384a9s LJLIL = new C92384a9s();

    public C92384a9s() {
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
            sparkContext.LJJ(new C92386a9u(context2));
            sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_id", C91824a0q.LIZ.LIZ)));
            sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_user_id", C91824a0q.LIZ.LIZIZ)));
            sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("bnpl_merchant_id", C91824a0q.LIZ())));
            sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("priority_region", C91824a0q.LIZIZ)));
            sparkContext.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("source_id", C91824a0q.LJFF)));
            c40342FsQ.getClass();
            return C40343FsR.LIZ(C40342FsQ.LIZ(context2, sparkContext));
        }
        C40342FsQ c40342FsQ2 = C40343FsR.LJIILJJIL;
        SparkContext sparkContext2 = new SparkContext();
        sparkContext2.LJJIJLIJ(schema);
        sparkContext2.usePreload = true;
        sparkContext2.LJJ(new C92386a9u(context2));
        sparkContext2.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_id", C91824a0q.LIZ.LIZ)));
        sparkContext2.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("merchant_user_id", C91824a0q.LIZ.LIZIZ)));
        sparkContext2.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("bnpl_merchant_id", C91824a0q.LIZ())));
        sparkContext2.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("priority_region", C91824a0q.LIZIZ)));
        sparkContext2.LJJIJ(C113554cx.LJJLIIIIJ(new OSZ("source_id", C91824a0q.LJFF)));
        c40342FsQ2.getClass();
        return C40343FsR.LIZ(C40342FsQ.LIZ(context2, sparkContext2));
    }
}
