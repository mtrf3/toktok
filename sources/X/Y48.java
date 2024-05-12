package X;

/* loaded from: classes16.dex */
public final class Y48 implements C6NL {
    public final /* synthetic */ Y47 LIZ;

    @Override // X.C6NL
    public final void onCancel() {
        C60903NvH.LJJI(this.LIZ.LIZIZ, "cancel");
    }

    @Override // X.C6NL
    public final void onShow() {
        C60903NvH.LJJIFFI(this.LIZ.LIZIZ);
    }

    public Y48(Y47 y47) {
        this.LIZ = y47;
    }

    @Override // X.C6NL
    public final void LIZ(int i) {
        H7B.LIZ("RecordExitController -> click tooltips item");
        C60903NvH.LJJI(this.LIZ.LIZIZ, HHD.LIZLLL(i));
    }
}
