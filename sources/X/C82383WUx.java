package X;

/* renamed from: X.WUx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82383WUx implements WV0 {
    public final WV0 LIZ;
    public final /* synthetic */ ViewOnTouchListenerC82375WUp LIZIZ;

    @Override // X.WV0
    public final void LJJIJIIJIL() {
        this.LIZ.LJJIJIIJIL();
    }

    @Override // X.WV0
    public final void LJJJJIZL() {
        this.LIZ.LJJJJIZL();
    }

    @Override // X.WV0
    public final boolean LJLLLLLL() {
        return this.LIZ.LJLLLLLL();
    }

    @Override // X.WV0
    public final void LLLLIILLL() {
        this.LIZ.LLLLIILLL();
    }

    @Override // X.WV0
    public final boolean LLLLZ() {
        return this.LIZ.LLLLZ();
    }

    @Override // X.WV0
    public final void LLLZL() {
        this.LIZ.LLLZL();
    }

    @Override // X.WV0
    public final void LLLZLZ() {
        this.LIZ.LLLZLZ();
    }

    @Override // X.WV0
    public final void LLLZZIL() {
        this.LIZ.LLLZZIL();
    }

    @Override // X.WV0
    public final void LLZ() {
        this.LIZ.LLZ();
    }

    @Override // X.WV0
    public final void LJJJJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordLayout onRecordStart isRecording: ");
        LIZ.append(this.LIZIZ.LLL);
        H7B.LJ(X1D.LIZIZ(LIZ));
        if (!this.LIZIZ.LLL) {
            this.LIZ.LJJJJI();
            this.LIZIZ.LLL = true;
        }
    }

    @Override // X.WV0
    public final void LLIL(int i) {
        this.LIZ.LLIL(i);
    }

    @Override // X.WV0
    public final void LLLLLZL(float f) {
        this.LIZ.LLLLLZL(f);
    }

    @Override // X.WV0
    public final void LLLZLL(long j) {
        this.LIZ.LLLZLL(j);
    }

    @Override // X.WV0
    public final void LLLZZ(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordLayout onRecordEnd isRecording: ");
        LIZ.append(this.LIZIZ.LLL);
        H7B.LJ(X1D.LIZIZ(LIZ));
        ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp = this.LIZIZ;
        if (viewOnTouchListenerC82375WUp.LLL) {
            if (!viewOnTouchListenerC82375WUp.LJLJJI) {
                this.LIZ.LLLZZ(z);
            }
            this.LIZIZ.LLL = false;
        }
    }

    public C82383WUx(ViewOnTouchListenerC82375WUp viewOnTouchListenerC82375WUp, WV0 wv0) {
        this.LIZIZ = viewOnTouchListenerC82375WUp;
        this.LIZ = wv0;
    }
}
