package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.0og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18900og {
    public final int LIZ;
    public C18890of LIZIZ;
    public C18890of LIZJ;
    public int LIZLLL;
    public Long LJ;
    public boolean LJFF;

    public C18900og() {
        this(0);
    }

    public C18900og(int i) {
        this.LIZ = ImagePreloadExperiment.PRIORITY_DEFAULT;
    }

    public final void LIZ(C15010iP value) {
        C15010iP c15010iP;
        String str;
        C18890of c18890of;
        C15010iP c15010iP2;
        o.LJIIIZ(value, "value");
        this.LJFF = false;
        C18890of c18890of2 = this.LIZIZ;
        if (c18890of2 != null) {
            c15010iP = c18890of2.LIZIZ;
        } else {
            c15010iP = null;
        }
        if (o.LJ(value, c15010iP)) {
            return;
        }
        String str2 = value.LIZ.LJLIL;
        C18890of c18890of3 = this.LIZIZ;
        if (c18890of3 != null && (c15010iP2 = c18890of3.LIZIZ) != null) {
            str = c15010iP2.LIZ.LJLIL;
        } else {
            str = null;
        }
        if (o.LJ(str2, str)) {
            C18890of c18890of4 = this.LIZIZ;
            if (c18890of4 == null) {
                return;
            }
            c18890of4.LIZIZ = value;
            return;
        }
        this.LIZIZ = new C18890of(this.LIZIZ, value);
        this.LIZJ = null;
        int length = value.LIZ.LJLIL.length() + this.LIZLLL;
        this.LIZLLL = length;
        if (length <= this.LIZ || (c18890of = this.LIZIZ) == null || c18890of.LIZ == null) {
            return;
        }
        while (c18890of != null) {
            C18890of c18890of5 = c18890of.LIZ;
            if (c18890of5 != null) {
                if (c18890of5.LIZ != null) {
                    c18890of = c18890of.LIZ;
                } else if (c18890of == null) {
                    return;
                }
            }
            c18890of.LIZ = null;
            return;
        }
    }
}
