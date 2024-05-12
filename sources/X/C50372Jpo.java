package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Jpo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50372Jpo<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ DynamicPatch LJLIL;
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;
    public final /* synthetic */ SparkContext LJLJI;

    public C50372Jpo(DynamicPatch dynamicPatch, java.util.Map<String, ? extends Object> map, SparkContext sparkContext) {
        this.LJLIL = dynamicPatch;
        this.LJLILLLLZI = map;
        this.LJLJI = sparkContext;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        DynamicPatch dynamicPatch = this.LJLIL;
        java.util.Map<String, Object> map = this.LJLILLLLZI;
        SparkContext sparkContext = this.LJLJI;
        o.LJIIIZ(dynamicPatch, "dynamicPatch");
        C50336JpE.LJI.getClass();
        return C50336JpE.LIZIZ(dynamicPatch, map, sparkContext);
    }
}
