package X;

/* renamed from: X.24v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C526524v extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C1OH LJLJI;
    public final /* synthetic */ InterfaceC21550sx LJLJJI;
    public final /* synthetic */ InterfaceC11790dD LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526524v(boolean z, boolean z2, C1OH c1oh, InterfaceC21550sx interfaceC21550sx, InterfaceC11790dD interfaceC11790dD, int i, int i2) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = c1oh;
        this.LJLJJI = interfaceC21550sx;
        this.LJLJJL = interfaceC11790dD;
        this.LJLJJLL = i;
        this.LJLJL = i2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            C21600t2 c21600t2 = C21600t2.LIZ;
            boolean z = this.LJLIL;
            boolean z2 = this.LJLILLLLZI;
            C1OH c1oh = this.LJLJI;
            InterfaceC21550sx interfaceC21550sx = this.LJLJJI;
            InterfaceC11790dD interfaceC11790dD = this.LJLJJL;
            int i = ((this.LJLJJLL >> 9) & 14) | 12582912;
            int i2 = this.LJLJL;
            c21600t2.LIZ(z, z2, c1oh, interfaceC21550sx, interfaceC11790dD, 0.0f, 0.0f, interfaceC24520xk2, i | ((i2 << 3) & 112) | ((i2 >> 12) & 896) | ((i2 >> 15) & 7168) | ((i2 >> 9) & 57344), 96);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
