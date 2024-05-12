package X;

/* renamed from: X.INp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46521INp implements HPI {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C46521INp(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        if (strArr != null && iArr != null) {
            if (strArr.length != 0 && iArr.length != 0) {
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZ;
                for (int i : iArr) {
                    if (i != 0) {
                        interfaceC88472Yns.invoke(Boolean.FALSE);
                        return;
                    }
                }
                this.LIZ.invoke(Boolean.TRUE);
                return;
            }
        }
        this.LIZ.invoke(Boolean.FALSE);
    }
}
