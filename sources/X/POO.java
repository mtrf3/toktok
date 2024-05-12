package X;

import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class POO extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public final /* synthetic */ TraceLogWrapApiImpl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POO(TraceLogWrapApiImpl traceLogWrapApiImpl, String str, JSONObject jSONObject) {
        super(1);
        this.LJLIL = traceLogWrapApiImpl;
        this.LJLILLLLZI = str;
        this.LJLJI = jSONObject;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        POK pok;
        long longValue = l.longValue();
        Collection<POK> values = C64375POh.LIZJ.values();
        o.LJIIIIZZ(values, "spanMapInfo.values");
        TraceLogWrapApiImpl traceLogWrapApiImpl = this.LJLIL;
        String str = this.LJLILLLLZI;
        Iterator<POK> it = values.iterator();
        while (true) {
            if (it.hasNext()) {
                pok = it.next();
                if (o.LJ(traceLogWrapApiImpl.LIZIZ.LIZ(pok.LIZ), str)) {
                    break;
                }
            } else {
                pok = null;
                break;
            }
        }
        POK pok2 = pok;
        if (pok2 != null) {
            TraceLogWrapApiImpl traceLogWrapApiImpl2 = this.LJLIL;
            JSONObject extra = this.LJLJI;
            POL pol = traceLogWrapApiImpl2.LIZIZ;
            String spanId = pok2.LIZ;
            pol.getClass();
            o.LJIIIZ(spanId, "spanId");
            o.LJIIIZ(extra, "extra");
            POK LIZJ = C64375POh.LIZJ(spanId);
            if (LIZJ != null) {
                pol.LIZ.getClass();
                LIZJ.LJFF = extra;
            }
            traceLogWrapApiImpl2.LIZIZ.LIZIZ(longValue, pok2.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
