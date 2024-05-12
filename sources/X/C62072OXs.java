package X;

import android.os.BaseBundle;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OXs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62072OXs<T> implements InterfaceC73518StG {
    public final /* synthetic */ C62224ObU LIZ;
    public final /* synthetic */ WebSharePackage LIZIZ;

    public C62072OXs(C62224ObU c62224ObU, WebSharePackage webSharePackage) {
        this.LIZ = c62224ObU;
        this.LIZIZ = webSharePackage;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C62224ObU c62224ObU = this.LIZ;
        String str = this.LIZIZ.remoteImagePath;
        if (str == null) {
            str = "";
        }
        String downloadedPath = C78765Uvh.LJIIJJI(str);
        o.LJIIIIZZ(downloadedPath, "downloadedPath");
        if (downloadedPath.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C66580QBc.LJIILL(EF7.LIZIZ()));
            LIZ.append("image_for_share.jpg");
            String LIZIZ = X1D.LIZIZ(LIZ);
            C39579Fg7.LJIL(LIZIZ);
            C39579Fg7.LIZLLL(downloadedPath, LIZIZ);
            String uri = OYF.LJ(EF7.LIZIZ(), LIZIZ).toString();
            o.LJIIIIZZ(uri, "sharePath.pathToUri(AppC…tionContext()).toString()");
            ((BaseBundle) c62224ObU.LIZ).putString("image", uri);
        }
        c73516StE.onSuccess(c62224ObU);
    }
}
