package X;

/* loaded from: classes8.dex */
public final class HR7 implements HPI {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ HPI LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final /* synthetic */ InterfaceC88471Ynr<String[], int[], C76800UCe> LJ;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        HVO.LIZIZ(strArr, iArr, this.LIZ, this.LIZIZ);
        if (C78605Ut7.LIZIZ(iArr)) {
            this.LIZJ.LIZ(iArr, strArr);
            this.LIZLLL.invoke();
        } else {
            this.LJ.invoke(strArr, iArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HR7(ActivityC45651qj activityC45651qj, String str, HPI hpi, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super String[], ? super int[], C76800UCe> interfaceC88471Ynr) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = str;
        this.LIZJ = hpi;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = interfaceC88471Ynr;
    }
}
