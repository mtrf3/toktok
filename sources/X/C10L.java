package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.10L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10L {
    public final AssetManager LIZLLL;
    public final C264011w<String> LIZ = new C264011w<>();
    public final java.util.Map<C264011w<String>, Typeface> LIZIZ = new HashMap();
    public final java.util.Map<String, Typeface> LIZJ = new HashMap();
    public final String LJ = ".ttf";

    public C10L(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            this.LIZLLL = null;
        } else {
            this.LIZLLL = ((View) callback).getContext().getAssets();
        }
    }
}
