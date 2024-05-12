package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* renamed from: X.HBp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43661HBp extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ HD3 LJLIL;
    public final /* synthetic */ ShortVideoContext LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43661HBp(HD3 hd3, ShortVideoContext shortVideoContext, long j, long j2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, boolean z) {
        super(0);
        this.LJLIL = hd3;
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = j;
        this.LJLJJI = j2;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LJ();
        C43664HBs.LIZ(this.LJLILLLLZI, System.currentTimeMillis() - this.LJLJI, this.LJLJJI, this.LJLIL.LIZIZ, null);
        this.LJLJJL.invoke(Boolean.valueOf(this.LJLJJLL));
        return C76800UCe.LIZ;
    }
}
