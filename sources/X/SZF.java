package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZF extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC65350Pko<? extends AbstractC88493YoD<Object>> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<Object> LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SZF(C65776Prg c65776Prg, String str, long j, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        super(0);
        this.LJLIL = c65776Prg;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ConcurrentHashMap<SZH, Long> concurrentHashMap = SZE.LIZ;
        InterfaceC65350Pko<? extends AbstractC88493YoD<Object>> interfaceC65350Pko = this.LJLIL;
        Long remove = concurrentHashMap.remove(new SZH(C39557Ffl.LIZ(interfaceC65350Pko).getName(), this.LJLILLLLZI));
        if (remove != null) {
            long longValue = remove.longValue();
            if (C37306EkY.LIZ(this.LJLIL)) {
                long j = this.LJLJI - longValue;
                Object invoke = this.LJLJJI.invoke();
                String str = this.LJLILLLLZI;
                boolean z = this.LJLJJL;
                SZD szd = (SZD) invoke;
                szd.LIZ = j;
                o.LJIIIZ(str, "<set-?>");
                szd.LIZIZ = z;
                C37306EkY.LIZIZ(this.LJLIL, szd);
            }
        }
        return C76800UCe.LIZ;
    }
}
