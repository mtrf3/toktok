package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.QYp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67191QYp {
    public final C68033Qmz LIZ;

    public C67191QYp(C68033Qmz c68033Qmz) {
        this.LIZ = c68033Qmz;
    }

    public final boolean LIZIZ() {
        if (this.LIZ.LJIILLIIL().LJIJJ.LIZ() > 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (!LIZIZ()) {
            return false;
        }
        this.LIZ.LJIILIIL.getClass();
        if (System.currentTimeMillis() - this.LIZ.LJIILLIIL().LJIJJ.LIZ() <= this.LIZ.LJI.LJIIJJI(null, C68555QvP.LJJJJI)) {
            return false;
        }
        return true;
    }

    public final void LIZ(Bundle bundle, String str) {
        String uri;
        this.LIZ.LIZIZ().LJFF();
        if (!this.LIZ.LJII()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.LIZ.LJIILLIIL().LJIJI.LIZIZ(uri);
                C67194QYs c67194QYs = this.LIZ.LJIILLIIL().LJIJJ;
                this.LIZ.LJIILIIL.getClass();
                c67194QYs.LIZIZ(System.currentTimeMillis());
            }
        }
    }
}
