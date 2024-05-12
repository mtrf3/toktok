package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;

/* renamed from: X.8VO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8VO extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ AssemSupervisor LJLIL;
    public final /* synthetic */ ReusedAssem<?> LJLILLLLZI;
    public final /* synthetic */ C8VP LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8VO(AssemSupervisor assemSupervisor, ReusedAssem<?> reusedAssem, C8VP c8vp, Object obj, long j) {
        super(0);
        this.LJLIL = assemSupervisor;
        this.LJLILLLLZI = reusedAssem;
        this.LJLJI = c8vp;
        this.LJLJJI = obj;
        this.LJLJJL = j;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.assem.arch.reused.ReusedAssem, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        AssemSupervisor assemSupervisor = this.LJLIL;
        ReusedAssem<?> reusedAssem = this.LJLILLLLZI;
        this.LJLJI.LIZ();
        if (assemSupervisor.LJI(reusedAssem, null)) {
            C8XE c8xe = this.LJLJJI.LJLJLJ;
            if (c8xe != null) {
                c8xe.LJIIJ(this.LJLILLLLZI, this.LJLJJL);
            }
            this.LJLIL.LIZ(this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }
}
