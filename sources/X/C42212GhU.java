package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.GhU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42212GhU extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C42210GhS LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42212GhU(boolean z, C42210GhS c42210GhS, int i, int i2) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = c42210GhS;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (!this.LJLIL) {
            if (this.LJLILLLLZI.LJLJJLL() && this.LJLILLLLZI.LJLIIL()) {
                C42210GhS c42210GhS = this.LJLILLLLZI;
                c42210GhS.LJLLLL++;
                c42210GhS.LJJLJLI().LIZJ();
                this.LJLILLLLZI.LJJLJLI().LIZLLL();
                C42210GhS.LLI.getClass();
                C42213GhV.LIZ(0, 0L, "preview");
            }
        } else if (this.LJLILLLLZI.LJJLI() && this.LJLILLLLZI.LJLJLJ()) {
            this.LJLILLLLZI.LJJLJLI().LJ();
            C42210GhS c42210GhS2 = this.LJLILLLLZI;
            c42210GhS2.LJLLLLLL = this.LJLJI + this.LJLJJI;
            C42213GhV c42213GhV = C42210GhS.LLI;
            long LIZIZ = c42210GhS2.LJJLJLI().LIZIZ(TimeUnit.MILLISECONDS);
            c42213GhV.getClass();
            C42213GhV.LIZ(1, LIZIZ, "preview");
        }
        this.LJLILLLLZI.LJJLIIIIJ(this.LJLIL);
        this.LJLILLLLZI.LJJLIIIJILLIZJL();
        this.LJLILLLLZI.LJLJLJ.setValue(Boolean.valueOf(this.LJLIL));
        return C76800UCe.LIZ;
    }
}
