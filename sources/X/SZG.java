package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public final class SZG extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC65350Pko<? extends AbstractC88493YoD<?>> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SZG(C65776Prg c65776Prg, String str, long j) {
        super(0);
        this.LJLIL = c65776Prg;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ConcurrentHashMap<SZH, Long> concurrentHashMap = SZE.LIZ;
        InterfaceC65350Pko<? extends AbstractC88493YoD<?>> interfaceC65350Pko = this.LJLIL;
        concurrentHashMap.put(new SZH(C39557Ffl.LIZ(interfaceC65350Pko).getName(), this.LJLILLLLZI), Long.valueOf(this.LJLJI));
        return C76800UCe.LIZ;
    }
}
