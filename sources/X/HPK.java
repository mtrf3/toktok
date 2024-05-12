package X;

/* loaded from: classes8.dex */
public final class HPK implements HPI {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ HPI LIZIZ;
    public final /* synthetic */ InterfaceC88471Ynr<String[], int[], C76800UCe> LIZJ;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        if (HPJ.LIZ(strArr, this.LIZ)) {
            this.LIZIZ.LIZ(iArr, strArr);
        } else {
            this.LIZJ.invoke(strArr, iArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HPK(ActivityC45651qj activityC45651qj, HPI hpi, InterfaceC88471Ynr<? super String[], ? super int[], C76800UCe> interfaceC88471Ynr) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = hpi;
        this.LIZJ = interfaceC88471Ynr;
    }
}
