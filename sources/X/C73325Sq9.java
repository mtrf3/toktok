package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sq9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73325Sq9 extends AbstractC73313Spx {
    public static final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C45747HxP.LJLIL);
    public final C73326SqA LJLILLLLZI;
    public final C73326SqA LJLJI;
    public final C73326SqA LJLJJI;
    public final C73330SqE LJLJJL;

    public C73325Sq9() {
        C73326SqA c73326SqA = new C73326SqA();
        this.LJLILLLLZI = c73326SqA;
        C73326SqA c73326SqA2 = new C73326SqA();
        this.LJLJI = c73326SqA2;
        this.LJLJJI = new C73326SqA();
        C73330SqE c73330SqE = new C73330SqE();
        this.LJLJJL = c73330SqE;
        LJJIJL(UC0.LJI(c73326SqA), UC0.LJ(c73330SqE), C73302Spm.LIZ(C73324Sq8.LJLIL));
        InterfaceC68914R2w LJI = UC0.LJI(c73326SqA2);
        InterfaceC68914R2w LJ = UC0.LJ(c73330SqE);
        C45746HxO key = C45746HxO.LJLIL;
        C45745HxN merge = C45745HxN.LJLIL;
        o.LJIIJ(key, "key");
        o.LJIIJ(merge, "merge");
        LJJIJL(LJI, LJ, new C73918Szi(key, merge));
    }

    public final AbstractC73672Svk<C45743HxL> LLLLZ(C45744HxM c45744HxM, AbstractC45692HwW mediaRequestType) {
        InterfaceC68907R2p interfaceC68907R2p;
        C73985T1x LJJIIJZLJL;
        o.LJIIIZ(mediaRequestType, "mediaRequestType");
        if (o.LJ(mediaRequestType, C45693HwX.LIZ)) {
            LJJIIJZLJL = C77117UOj.LJJIIJZLJL(this.LJLILLLLZI, this.LJLJJL, C77118UOk.LJLIL);
            interfaceC68907R2p = LJJIIJZLJL.LIZ(C73327SqB.LJLIL);
        } else if (o.LJ(mediaRequestType, C45691HwV.LIZ)) {
            interfaceC68907R2p = this.LJLJI;
        } else if (o.LJ(mediaRequestType, C45694HwY.LIZ)) {
            interfaceC68907R2p = this.LJLJJI;
        } else {
            throw new C162476Zf();
        }
        return interfaceC68907R2p.LIZ(c45744HxM);
    }
}
