package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Uyv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78965Uyv extends AbstractC65781Prl implements InterfaceC88472Yns<C2068389v, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78965Uyv(long j, int i, int i2, int i3, boolean z) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C2068389v c2068389v) {
        Integer valueOf;
        C2068389v tuxIcon = c2068389v;
        o.LJIIIZ(tuxIcon, "$this$tuxIcon");
        tuxIcon.LIZ = this.LJLIL;
        if (C11850dJ.LIZJ(this.LJLILLLLZI, C11850dJ.LJI)) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(C78897Uxp.LJJJZ(this.LJLILLLLZI));
        }
        tuxIcon.LIZLLL = valueOf;
        tuxIcon.LIZIZ = this.LJLJI;
        tuxIcon.LIZJ = this.LJLJJI;
        tuxIcon.LJFF = this.LJLJJL;
        return C76800UCe.LIZ;
    }
}
