package X;

import Y.ARunnableS2S1101000_7;

/* renamed from: X.HGl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43787HGl extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ ARunnableS2S1101000_7 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43787HGl(ARunnableS2S1101000_7 aRunnableS2S1101000_7, boolean z, int[] iArr, String str, long j, long j2) {
        super(1);
        this.LJLIL = aRunnableS2S1101000_7;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        ((C43786HGk) this.LJLIL.l1).LJIJI.LIZ();
        ARunnableS2S1101000_7 aRunnableS2S1101000_7 = this.LJLIL;
        C43786HGk c43786HGk = (C43786HGk) aRunnableS2S1101000_7.l1;
        String str = this.LJLILLLLZI;
        c43786HGk.LIZIZ(this.LJLJI, this.LJLJJI, str, aRunnableS2S1101000_7.s0, intValue, aRunnableS2S1101000_7.i2, null);
        return C76800UCe.LIZ;
    }
}
