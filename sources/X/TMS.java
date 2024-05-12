package X;

import Y.AfS64S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TMS<CATEGORY, DOWNLOAD_EVENT> implements TMP<CATEGORY, DOWNLOAD_EVENT> {
    public final ConcurrentHashMap<String, CATEGORY> LIZ;
    public final TN3 LIZIZ;
    public final TMV<CATEGORY> LIZJ;
    public final TMU<Effect> LIZLLL;

    @Override // X.TMP
    public final AbstractC73672Svk<List<RTW>> LIZJ() {
        return this.LIZIZ.request();
    }

    @Override // X.TMP
    public final C73422Sri LIZ(TFO tfo) {
        return this.LIZJ.LIZ(tfo).LJIJJLI(new AfS64S0100000_12(this, 128));
    }

    @Override // X.TMP
    public final TMR<Effect, CategoryEffectModel> LIZIZ(C69610RTq listMeta) {
        o.LJIIIZ(listMeta, "listMeta");
        return this.LIZLLL.LIZ(listMeta);
    }

    public TMS(TN3 listMetaFetcher, TMW tmw, TMT tmt, C74517TMj c74517TMj) {
        o.LJIIIZ(listMetaFetcher, "listMetaFetcher");
        this.LIZIZ = listMetaFetcher;
        this.LIZJ = tmw;
        this.LIZLLL = tmt;
        this.LIZ = new ConcurrentHashMap<>();
    }
}
