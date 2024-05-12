package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;

/* renamed from: X.Xwy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86488Xwy extends C86492Xx2 {
    public final /* synthetic */ InnerPushMessage LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ InnerPushUITemplate LJLJI;

    @Override // X.C86492Xx2, X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        InnerPushUITemplate innerPushUITemplate;
        super.LIZIZ(bitmap);
        if (bitmap != null && (innerPushUITemplate = this.LJLJI) != null) {
            innerPushUITemplate.setPreloadAvatar(C47261Igj.LJJIJ(bitmap));
        }
        this.LJLIL.getTracker().LJII = System.currentTimeMillis() - this.LJLILLLLZI.element;
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        C86478Xwo.LIZJ("InnerPushViewPreload", "InnerPushImageLoadListener onFailed", th);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("avatarUrls onProgress progress:");
        LIZ.append(f);
        C86478Xwo.LIZ("InnerPushViewPreload", X1D.LIZIZ(LIZ));
    }

    public C86488Xwy(InnerPushMessage innerPushMessage, C72242sW c72242sW, InnerPushUITemplate innerPushUITemplate) {
        this.LJLIL = innerPushMessage;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = innerPushUITemplate;
    }
}
