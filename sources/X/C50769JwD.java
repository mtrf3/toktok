package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;

/* renamed from: X.JwD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50769JwD<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ DynamicPatch LJLJI;
    public final /* synthetic */ C1HQ<String, Object> LJLJJI;
    public final /* synthetic */ C50799Jwh LJLJJL;

    public C50769JwD(boolean z, boolean z2, DynamicPatch dynamicPatch, C1HQ<String, Object> c1hq, C50799Jwh c50799Jwh) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = dynamicPatch;
        this.LJLJJI = c1hq;
        this.LJLJJL = c50799Jwh;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        C1HQ it = (C1HQ) obj;
        o.LJIIIZ(it, "it");
        if (!this.LJLIL && this.LJLILLLLZI && C78857UxB.LJJJIL(this.LJLJI.getRawData())) {
            DynamicPatch dynamicPatch = this.LJLJI;
            C1HQ<String, Object> c1hq = this.LJLJJI;
            SparkContext sparkContext = this.LJLJJL.LJIIJJI.getSparkContext();
            o.LJIIIZ(dynamicPatch, "dynamicPatch");
            C50336JpE.LJI.getClass();
            return C50336JpE.LIZIZ(dynamicPatch, c1hq, sparkContext);
        }
        return TemplateData.LJ(it);
    }
}
