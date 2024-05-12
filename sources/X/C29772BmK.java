package X;

import android.graphics.Bitmap;

/* renamed from: X.BmK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29772BmK implements InterfaceC31664Cbk {
    public final /* synthetic */ C76732zl LIZ;
    public final /* synthetic */ C76732zl LIZIZ;

    @Override // X.InterfaceC31664Cbk
    public final void onFail() {
        this.LIZ.element++;
    }

    @Override // X.InterfaceC31664Cbk
    public final void LIZIZ(Bitmap bitmap) {
        this.LIZIZ.element++;
    }

    public C29772BmK(C76732zl c76732zl, C76732zl c76732zl2) {
        this.LIZ = c76732zl;
        this.LIZIZ = c76732zl2;
    }
}
