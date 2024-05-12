package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ESw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36466ESw extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36466ESw(long j, long j2, long j3, long j4, long j5) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = j3;
        this.LJLJJI = j4;
        this.LJLJJL = j5;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        C37284EkC.LIZ = false;
        C37284EkC.LIZJ(EnumC36113EFh.CLEAN_STORAGE_WITH_LOADING, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, false, false);
        return C76800UCe.LIZ;
    }
}
