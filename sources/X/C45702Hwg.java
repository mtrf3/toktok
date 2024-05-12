package X;

import android.graphics.Bitmap;

/* renamed from: X.Hwg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45702Hwg implements InterfaceC78660Uu0 {
    public final /* synthetic */ C45700Hwe LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            C45700Hwe c45700Hwe = this.LJLIL;
            C37344ElA c37344ElA = c45700Hwe.LJLJL;
            String str = this.LJLILLLLZI;
            synchronized (c37344ElA) {
                c45700Hwe.LJLJL.put(str, bitmap);
            }
        }
    }

    public C45702Hwg(C45700Hwe c45700Hwe, String str) {
        this.LJLIL = c45700Hwe;
        this.LJLILLLLZI = str;
    }
}
