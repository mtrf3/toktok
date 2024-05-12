package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.217, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass217 extends AbstractC42841mC {
    public final AssetManager LJII;
    public final String LJIIIIZZ;

    public final int hashCode() {
        return this.LIZJ.hashCode() + (this.LJIIIIZZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Font(assetManager, path=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", weight=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", style=");
        LIZ.append((Object) C13570g5.LIZ(this.LJ));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC42841mC
    public final Typeface LIZLLL(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C13410fp.LIZ(this.LJII, this.LJIIIIZZ, context, this.LIZJ);
        }
        return Typeface.createFromAsset(this.LJII, this.LJIIIIZZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass217)) {
            return false;
        }
        AnonymousClass217 anonymousClass217 = (AnonymousClass217) obj;
        if (o.LJ(this.LJIIIIZZ, anonymousClass217.LJIIIIZZ) && o.LJ(this.LIZJ, anonymousClass217.LIZJ)) {
            return true;
        }
        return false;
    }

    public AnonymousClass217(AssetManager assetManager, String str, C13640gC c13640gC, int i, C13610g9 c13610g9) {
        super(c13640gC, i, c13610g9);
        this.LJII = assetManager;
        this.LJIIIIZZ = str;
        this.LJI = LIZLLL(null);
        C1JX.LJIIIIZZ("asset:", str);
    }
}
