package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Umt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78219Umt extends C73994T2g {
    public final /* synthetic */ InterfaceC78213Umn LJLIL;
    public final /* synthetic */ C78216Umq LJLILLLLZI;

    @Override // X.InterfaceC38239Ezb
    public final java.util.Map<String, InterfaceC31920Cfs> LJI(SparkContext sparkContext) {
        o.LJIIIZ(sparkContext, "sparkContext");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("playGift", new C78221Umv(this.LJLIL, this.LJLILLLLZI));
        return linkedHashMap;
    }

    public C78219Umt(InterfaceC78213Umn interfaceC78213Umn, C78216Umq c78216Umq) {
        this.LJLIL = interfaceC78213Umn;
        this.LJLILLLLZI = c78216Umq;
    }
}
