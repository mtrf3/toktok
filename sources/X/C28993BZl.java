package X;

import android.graphics.Bitmap;

/* renamed from: X.BZl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28993BZl implements InterfaceC31664Cbk {
    public final /* synthetic */ C31563Ca7 LIZ;
    public final /* synthetic */ C68322mC<String> LIZIZ;

    @Override // X.InterfaceC31664Cbk
    public final void onFail() {
        C28991BZj.LIZJ(this.LIZIZ.element, false);
    }

    @Override // X.InterfaceC31664Cbk
    public final void LIZIZ(Bitmap bitmap) {
        this.LIZ.LLF.setImageBitmap(bitmap);
        C28991BZj.LIZJ(this.LIZIZ.element, true);
    }

    public C28993BZl(C31563Ca7 c31563Ca7, C68322mC<String> c68322mC) {
        this.LIZ = c31563Ca7;
        this.LIZIZ = c68322mC;
    }
}
