package X;

import com.ss.android.ugc.network.observer.bean.DetectorParam;

/* loaded from: classes15.dex */
public final class VST extends AbstractC65781Prl implements InterfaceC88472Yns<Long, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ DetectorParam LJLILLLLZI;
    public final /* synthetic */ HHM LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VST(long j, DetectorParam detectorParam, HHM hhm, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = detectorParam;
        this.LJLJI = hhm;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        l.longValue();
        try {
            VSS.LIZ.remove(Long.valueOf(this.LJLIL));
            VSR.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }
}
