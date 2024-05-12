package X;

/* loaded from: classes8.dex */
public final class HYP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C44226HXi LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HYP(int i, boolean z, C44226HXi c44226HXi) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = c44226HXi;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C82085WJl LIZ;
        int i = this.LJLIL;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.LJLILLLLZI) {
                        LIZ = C82085WJl.LIZIZ();
                    } else {
                        LIZ = C82085WJl.LIZ();
                    }
                    this.LJLJI.getCameraApiComponent().Bc().LJI(LIZ, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_MSG_PROP, null), null);
                }
            } else if (this.LJLILLLLZI) {
                this.LJLJI.getCameraApiComponent().Bc().LJI(C82085WJl.LIZIZ(), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_MSG_PROP_REAR, null), null);
            }
        } else if (!this.LJLILLLLZI) {
            this.LJLJI.getCameraApiComponent().Bc().LJI(C82085WJl.LIZ(), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SWITCH_CAMERA_MSG_PROP_FRONT, null), null);
        }
        return C76800UCe.LIZ;
    }
}
