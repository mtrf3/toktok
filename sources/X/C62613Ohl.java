package X;

/* renamed from: X.Ohl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62613Ohl implements C2NO {
    public final /* synthetic */ C62825OlB LJLIL;

    @Override // X.C2NO
    public final void LJLIIIL() {
        this.LJLIL.LIZIZ(false);
    }

    public C62613Ohl(C62825OlB c62825OlB) {
        this.LJLIL = c62825OlB;
    }

    @Override // X.C2NO
    public final void LJLIIL(boolean z) {
        if (z) {
            C57082Lw.LIZ.LIZJ("photo_click_try").postValue(C44938HkM.LJFF);
        } else {
            this.LJLIL.LIZIZ(false);
            C57082Lw.LIZ.LIZJ("video_click_retry").postValue(C44938HkM.LJFF);
        }
    }
}
