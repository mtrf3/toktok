package X;

import com.bytedance.mota.storage.motacache.IMotaCache;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final /* synthetic */ class XGC extends TBS implements InterfaceC88473Ynt<String, InterfaceC199277rv, Boolean, List<? extends IMotaCache>> {
    public XGC(C87Q c87q) {
        super(3, c87q, XGD.class, "convertMutationToMotaCache", "convertMutationToMotaCache(Ljava/lang/String;Lcom/bytedance/mota/Mutation$Data;Z)Ljava/util/List;", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final List<? extends IMotaCache> invoke(String str, InterfaceC199277rv p1, Boolean bool) {
        Object LJ;
        String p0 = str;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        XGD xgd = (XGD) this.receiver;
        if (booleanValue) {
            LJ = xgd.LJIILL(xgd.LJ(p0));
        } else {
            LJ = xgd.LJ(p0);
        }
        IMotaCache LJIIL = xgd.LJIIL(LJ, p0);
        if (LJIIL != null) {
            return C47261Igj.LJJIJ(LJIIL);
        }
        return C61878OQg.INSTANCE;
    }
}
