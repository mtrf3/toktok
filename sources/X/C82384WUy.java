package X;

/* renamed from: X.WUy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82384WUy implements WV3 {
    public final WV3 LJLIL;
    public final /* synthetic */ ViewOnTouchListenerC82377WUr LJLILLLLZI;

    @Override // X.WV3
    public final void LJJIJIIJIL() {
        this.LJLIL.LJJIJIIJIL();
    }

    @Override // X.WV3
    public final void LJJJJI() {
        I3Q.LIZ(I3P.START_RECORD);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordLayout onRecordStart isRecording: ");
        LIZ.append(this.LJLILLLLZI.LLILLIZIL);
        H7B.LJ(X1D.LIZIZ(LIZ));
        if (!this.LJLILLLLZI.LLILLIZIL) {
            this.LJLIL.LJJJJI();
            this.LJLILLLLZI.LLILLIZIL = true;
        }
    }

    @Override // X.WV3
    public final boolean LJLLLLLL() {
        return this.LJLIL.LJLLLLLL();
    }

    @Override // X.WV3
    public final void LLLLIILLL() {
        this.LJLIL.LLLLIILLL();
    }

    @Override // X.WV3
    public final boolean LLLLZ() {
        return this.LJLIL.LLLLZ();
    }

    @Override // X.WV3
    public final void LLLZL() {
        this.LJLIL.LLLZL();
    }

    @Override // X.WV3
    public final void ba() {
        this.LJLIL.ba();
    }

    @Override // X.WV3
    public final void LLJJJJJIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordLayout onRecordEnd isRecording: ");
        LIZ.append(this.LJLILLLLZI.LLILLIZIL);
        H7B.LJ(X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI.LLILLIZIL) {
            this.LJLIL.LLJJJJJIL();
            this.LJLILLLLZI.LLILLIZIL = false;
        }
    }

    @Override // X.WV3
    public final void LLIL(int i) {
        this.LJLIL.LLIL(i);
    }

    @Override // X.WV3
    public final void LLLLLZL(float f) {
        this.LJLIL.LLLLLZL(f);
    }

    public C82384WUy(ViewOnTouchListenerC82377WUr viewOnTouchListenerC82377WUr, WV3 wv3) {
        this.LJLILLLLZI = viewOnTouchListenerC82377WUr;
        this.LJLIL = wv3;
    }
}
