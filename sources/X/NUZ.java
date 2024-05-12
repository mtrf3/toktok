package X;

import android.webkit.WebResourceError;

/* loaded from: classes11.dex */
public final class NUZ {
    public final /* synthetic */ WebResourceError LIZ;

    public final CharSequence LIZ() {
        return this.LIZ.getDescription();
    }

    public final int LIZIZ() {
        return this.LIZ.getErrorCode();
    }

    public NUZ(WebResourceError webResourceError) {
        this.LIZ = webResourceError;
    }
}
