package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I6g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46070I6g extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ AbstractC46064I6a LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46070I6g(AbstractC46064I6a abstractC46064I6a, boolean z, boolean z2) {
        super(0);
        this.LJLIL = abstractC46064I6a;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long LJIIIIZZ;
        int i;
        InterfaceC139535dl fB;
        if (this.LJLIL.LJLIIL().multiEditVideoRecordData != null) {
            this.LJLIL.LJLIIL().multiEditVideoRecordData.isMultiEditRetake = false;
        }
        C46084I6u c46084I6u = this.LJLIL.LLIIJI;
        if (c46084I6u != null) {
            InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(c46084I6u);
            if (LIZIZ != null) {
                LIZIZ.unRegisterActivityOnKeyDownListener(this.LJLIL.LLIIJLIL);
            }
            this.LJLIL.LJLL = false;
            AbstractC46064I6a abstractC46064I6a = this.LJLIL;
            abstractC46064I6a.LJLLLL = null;
            abstractC46064I6a.LJLLL().s3(true);
            this.LJLIL.LJJLL().getClass();
            InterfaceC153045zY interfaceC153045zY = this.LJLIL.LJLLJ;
            if (interfaceC153045zY != null) {
                interfaceC153045zY.LJJIJLIJ(true);
            }
            this.LJLIL.WW(true);
            this.LJLIL.LJJZZIII().p1();
            InterfaceC147865rC LJLJLJ = AbstractC46064I6a.LJLJLJ(this.LJLIL);
            if (LJLJLJ != null && (fB = LJLJLJ.fB()) != null) {
                fB.M9();
            }
            if (this.LJLILLLLZI) {
                C145905o2.LIZIZ(this.LJLIL.LJLIIL().mShootWay, this.LJLIL.LJLJLLL);
            }
            if (!this.LJLJI) {
                this.LJLIL.LJJLL().LJIJJLI(null);
                this.LJLIL.LJJLIIIJJI();
                I6Z LJJLL = this.LJLIL.LJJLL();
                InterfaceC153045zY interfaceC153045zY2 = this.LJLIL.LJLLJ;
                if (interfaceC153045zY2 != null) {
                    i = interfaceC153045zY2.getDuration();
                } else {
                    i = -1;
                }
                I6Z.LJIIZILJ(LJJLL, i, 1);
                I7S.LIZ(this.LJLIL.LLF(), -1L, null, 6);
            } else if (this.LJLILLLLZI) {
                this.LJLIL.LJJLIIIJLLLLLLLZ();
            } else {
                this.LJLIL.LLJLIL();
            }
            AbstractC46064I6a abstractC46064I6a2 = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            boolean z2 = this.LJLJI;
            InterfaceC153045zY interfaceC153045zY3 = abstractC46064I6a2.LJLLJ;
            if (interfaceC153045zY3 != null) {
                LJIIIIZZ = interfaceC153045zY3.getDuration();
            } else {
                LJIIIIZZ = abstractC46064I6a2.LJJLL().LJIIIIZZ();
            }
            abstractC46064I6a2.LLILL(z, z2, LJIIIIZZ);
            if (this.LJLILLLLZI) {
                C42562Gn8.LIZIZ.LIZIZ(this.LJLIL.LJLIIL().getCreationId(), new C42097Gfd(EnumC42099Gff.EDIT_DELETE_CLIP, this.LJLIL.LJLIIL(), null), C78688UuS.LJIJJ(this.LJLIL));
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }
}
