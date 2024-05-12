package X;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* renamed from: X.0OY, reason: invalid class name */
/* loaded from: classes.dex */
public class C0OY {
    public final ColorStateList LIZ;
    public final Configuration LIZIZ;
    public final int LIZJ;

    public C0OY(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.LIZ = colorStateList;
        this.LIZIZ = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.LIZJ = hashCode;
    }
}
