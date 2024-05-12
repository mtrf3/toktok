package X;

import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Rcw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69958Rcw {
    public final String LIZ;
    public final Image LIZIZ;
    public final WeakReference<SmartImageView> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69958Rcw)) {
            return false;
        }
        C69958Rcw c69958Rcw = (C69958Rcw) obj;
        return o.LJ(this.LIZ, c69958Rcw.LIZ) && o.LJ(this.LIZIZ, c69958Rcw.LIZIZ) && o.LJ(this.LIZJ, c69958Rcw.LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LowImgLoadListener(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", image=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageView=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C69958Rcw(String str, Image image, WeakReference<SmartImageView> weakReference) {
        this.LIZ = str;
        this.LIZIZ = image;
        this.LIZJ = weakReference;
    }
}
