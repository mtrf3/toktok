package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import defpackage.b1;
import java.lang.ref.WeakReference;

/* renamed from: X.Gf1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42059Gf1 {
    public final WeakReference<Context> LIZ;

    public C42059Gf1(WeakReference<Context> weakReference) {
        this.LIZ = weakReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.net.Uri] */
    public final void LIZ(String str, C41273GHt c41273GHt) {
        if (TextUtils.isEmpty(str)) {
            new RuntimeException("Image url is empty.");
            c41273GHt.onFailure();
            return;
        }
        Context context = this.LIZ.get();
        if (context != null) {
            if (C78609UtB.LJJJJ(context)) {
                c41273GHt.LIZJ();
                StringBuilder LIZ = X1D.LIZ();
                String LIZIZ = b1.LIZIZ(str, LIZ, ".png", LIZ);
                C68322mC c68322mC = new C68322mC();
                ?? LJIIIIZZ = C268613q.LJIIIIZZ(this.LIZ.get(), LIZIZ, "image/png");
                c68322mC.element = LJIIIIZZ;
                if (LJIIIIZZ == 0) {
                    c68322mC.element = C268613q.LIZLLL(this.LIZ.get(), LIZIZ, "image/png");
                }
                if (!C268613q.LJIIJJI(this.LIZ.get(), (android.net.Uri) c68322mC.element) && this.LIZ.get() != null) {
                    X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                    with.LIZJ = LIZIZ;
                    with.LJ = String.valueOf(c68322mC.element);
                    with.LJIIL = new C42065Gf7(c41273GHt, c68322mC);
                    with.LIZJ();
                    return;
                }
                return;
            }
            OYF.LJII(context, TokenCert.Companion.with("bpea-share_jsb_save_web_image_permission"), null);
        }
    }
}
