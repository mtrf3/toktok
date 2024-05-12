package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.share.model.SharePhoto;
import kotlin.jvm.internal.o;

/* renamed from: X.Q7r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66491Q7r extends AbstractC66499Q7z<SharePhoto, C66491Q7r> {
    public static final /* synthetic */ int LJI = 0;
    public Bitmap LIZJ;
    public android.net.Uri LIZLLL;
    public boolean LJ;
    public String LJFF;

    public final C66491Q7r LIZ(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bundle parameters = sharePhoto.params;
            o.LJIIIZ(parameters, "parameters");
            this.LIZ.putAll(parameters);
            this.LIZJ = sharePhoto.bitmap;
            this.LIZLLL = sharePhoto.imageUrl;
            this.LJ = sharePhoto.userGenerated;
            this.LJFF = sharePhoto.caption;
        }
        return this;
    }
}
