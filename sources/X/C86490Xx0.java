package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;

/* renamed from: X.Xx0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86490Xx0 extends C86492Xx2 {
    public final /* synthetic */ InnerPushMessage LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ InnerPushUITemplate LJLJI;

    @Override // X.C86492Xx2, X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        InnerPushUITemplate innerPushUITemplate;
        super.LIZIZ(bitmap);
        if (bitmap != null && (innerPushUITemplate = this.LJLJI) != null) {
            innerPushUITemplate.setPreloadRightImage(bitmap);
        }
        this.LJLIL.getTracker().LJIIIZ = System.currentTimeMillis() - this.LJLILLLLZI.element;
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        C86478Xwo.LIZJ("InnerPushViewPreload", "InnerPushImageLoadListener onFailed", th);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("rightImageUrl onProgress progress:");
        LIZ.append(f);
        C86478Xwo.LIZ("InnerPushViewPreload", X1D.LIZIZ(LIZ));
    }

    public C86490Xx0(InnerPushMessage innerPushMessage, C72242sW c72242sW, InnerPushUITemplate innerPushUITemplate) {
        this.LJLIL = innerPushMessage;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = innerPushUITemplate;
    }
}
