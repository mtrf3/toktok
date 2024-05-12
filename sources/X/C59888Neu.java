package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Neu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59888Neu extends AbstractC59890New {
    public final String LJLJJL = "PreloadKitViewMethodIDL";

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC59889Nev interfaceC59889Nev = (InterfaceC59889Nev) xBaseParamModel;
        o.LJIIJ(type, "type");
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        C59886Nes c59886Nes = new C59886Nes();
        String biz = interfaceC59889Nev.getBiz();
        o.LJIIJ(biz, "<set-?>");
        c59886Nes.LIZ = biz;
        Number maxCacheKeyCount = interfaceC59889Nev.getMaxCacheKeyCount();
        if (maxCacheKeyCount != null) {
            c59886Nes.LIZIZ = ((Integer) maxCacheKeyCount).intValue();
        }
        Number maxPrerenderCountPerCacheKey = interfaceC59889Nev.getMaxPrerenderCountPerCacheKey();
        if (maxPrerenderCountPerCacheKey != null) {
            c59886Nes.LIZJ = ((Integer) maxPrerenderCountPerCacheKey).intValue();
        }
        Boolean keepAliveWhenUsed = interfaceC59889Nev.getKeepAliveWhenUsed();
        Boolean bool = Boolean.TRUE;
        c59886Nes.LIZLLL = o.LJ(keepAliveWhenUsed, bool);
        c59886Nes.LJ = o.LJ(interfaceC59889Nev.getPendingLoad(), bool);
        String matchCacheRegex = interfaceC59889Nev.getMatchCacheRegex();
        if (matchCacheRegex != null) {
            if (matchCacheRegex.length() < 5) {
                C37682Eqc.LIZ(null, this.LJLJJL, "Invalid param, matchCacheRegex too short...");
            } else if (!new OJD(matchCacheRegex).containsMatchIn(interfaceC59889Nev.getCacheKey())) {
                C37682Eqc.LIZ(null, this.LJLJJL, "Invalid param, matchCacheRegex cannot match the cacheKey, please check...");
            } else {
                c59886Nes.LJII = matchCacheRegex;
            }
        }
        c59886Nes.LJFF = new AqS192S0100000_10(c59886Nes, 52);
        c60827Nu3.getClass();
        C60827Nu3.LJIIJJI(c59886Nes, bool);
        String cacheKey = interfaceC59889Nev.getCacheKey();
        String biz2 = interfaceC59889Nev.getBiz();
        boolean LJ = o.LJ(interfaceC59889Nev.getNow(), bool);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(interfaceC59889Nev.getCacheKey());
        C60827Nu3.LJIIIZ(cacheKey, biz2, sparkContext, new C59891Nex(c37356ElM), LJ, bool);
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC59892Ney.class, null), "");
    }
}
