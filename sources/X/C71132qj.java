package X;

/* renamed from: X.2qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71132qj extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, String, C76800UCe> {
    public static final C71132qj LJLIL = new C71132qj();

    public C71132qj() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, String str) {
        int intValue = num.intValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changePlayMode errCode: ");
        LIZ.append(intValue);
        LIZ.append(", errMsg: ");
        LIZ.append(str);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
