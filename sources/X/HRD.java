package X;

/* loaded from: classes8.dex */
public final class HRD implements HPI {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ HPI LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;
    public final /* synthetic */ InterfaceC88471Ynr<String[], int[], C76800UCe> LIZLLL;

    @Override // X.HPI
    public final void LIZ(int[] iArr, String[] strArr) {
        HVO.LIZIZ(strArr, iArr, this.LIZ, "shoot_page");
        if (C78605Ut7.LIZIZ(iArr)) {
            this.LIZIZ.LIZ(iArr, strArr);
            this.LIZJ.invoke();
        } else {
            this.LIZLLL.invoke(strArr, iArr);
        }
    }

    public HRD(ActivityC45651qj activityC45651qj, HPI hpi, InterfaceC65784Pro interfaceC65784Pro, HRF hrf) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = hpi;
        this.LIZJ = interfaceC65784Pro;
        this.LIZLLL = hrf;
    }
}
