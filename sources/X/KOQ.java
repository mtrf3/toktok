package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KOQ extends AbstractC65781Prl implements InterfaceC88473Ynt<Context, String, C60737Nsb, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS> {
    public static final KOQ LJLIL = new KOQ();

    public KOQ() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS invoke(Context context, String str, C60737Nsb c60737Nsb) {
        SparkContext LIZIZ;
        Context context2 = context;
        String schema = str;
        C60737Nsb c60737Nsb2 = c60737Nsb;
        o.LJIIIZ(context2, "context");
        o.LJIIIZ(schema, "schema");
        if (c60737Nsb2 instanceof SparkContext) {
            LIZIZ = (SparkContext) c60737Nsb2;
        } else {
            LIZIZ = C42193GhB.LIZIZ(schema);
        }
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        LIZIZ.usePreload = true;
        return KMP.LIZJ(c40342FsQ, context2, LIZIZ);
    }
}
