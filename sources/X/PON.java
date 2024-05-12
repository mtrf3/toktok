package X;

import com.ss.android.ugc.aweme.trace.TraceLogWrapApiImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PON extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public final /* synthetic */ TraceLogWrapApiImpl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PON(TraceLogWrapApiImpl traceLogWrapApiImpl, String str, String str2, String str3) {
        super(1);
        this.LJLIL = traceLogWrapApiImpl;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        PIU piu;
        l.longValue();
        POL pol = this.LJLIL.LIZIZ;
        String traceId = this.LJLILLLLZI;
        String key = this.LJLJI;
        String value = this.LJLJJI;
        pol.getClass();
        o.LJIIIZ(traceId, "traceId");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        POJ poj = C64375POh.LIZIZ.get(traceId);
        if (poj != null) {
            pol.LIZ.getClass();
            Object obj = poj.LIZLLL;
            if ((obj instanceof PIU) && (piu = (PIU) obj) != null) {
                piu.LJ(key, value);
            }
        }
        return C76800UCe.LIZ;
    }
}
