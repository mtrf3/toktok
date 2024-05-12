package X;

/* renamed from: X.Ohm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62614Ohm implements C2NO {
    public final /* synthetic */ C62826OlC LJLIL;

    @Override // X.C2NO
    public final void LJLIIIL() {
        if ((this.LJLIL.LIZIZ == 1 && Z89.LIZIZ.LJII()) || ((this.LJLIL.LIZIZ == 1 && Z89.LIZIZ.LIZ()) || (this.LJLIL.LIZIZ == 1 && Z89.LIZIZ.LJIILIIL()))) {
            this.LJLIL.LIZJ(false);
        }
    }

    public C62614Ohm(C62826OlC c62826OlC) {
        this.LJLIL = c62826OlC;
    }

    @Override // X.C2NO
    public final void LJLIIL(boolean z) {
        if (z) {
            C57082Lw.LIZ.LIZJ("photo_click_try").postValue(C44938HkM.LJFF);
        } else {
            this.LJLIL.LIZJ(false);
            C57082Lw.LIZ.LIZJ("video_click_retry").postValue(C44938HkM.LJFF);
        }
    }
}
