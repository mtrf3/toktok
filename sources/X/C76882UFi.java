package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UFi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76882UFi {
    public final FragmentManager LIZ;
    public final String LIZIZ;
    public final EnumC76880UFg LIZJ;
    public final UG0 LIZLLL;
    public final java.util.Map<String, Object> LJ;
    public final C76878UFe LJFF;
    public final List<Bitmap> LJI;
    public final List<android.net.Uri> LJII;
    public final List<String> LJIIIIZZ;
    public final C73974T1m LJIIIZ;

    public C76882UFi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76882UFi)) {
            return false;
        }
        C76882UFi c76882UFi = (C76882UFi) obj;
        return o.LJ(this.LIZ, c76882UFi.LIZ) && o.LJ(this.LIZIZ, c76882UFi.LIZIZ) && this.LIZJ == c76882UFi.LIZJ && this.LIZLLL == c76882UFi.LIZLLL && o.LJ(this.LJ, c76882UFi.LJ) && o.LJ(this.LJFF, c76882UFi.LJFF) && o.LJ(this.LJI, c76882UFi.LJI) && o.LJ(this.LJII, c76882UFi.LJII) && o.LJ(this.LJIIIIZZ, c76882UFi.LJIIIIZZ) && o.LJ(this.LJIIIZ, c76882UFi.LJIIIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SpotlightImageListParams(fragmentManager=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", imageCropType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", emoteEditType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", logInfo=");
        LIZ.append(this.LJ);
        LIZ.append(", imageParams=");
        LIZ.append(this.LJFF);
        LIZ.append(", imageBitmap=");
        LIZ.append(this.LJI);
        LIZ.append(", imageUri=");
        LIZ.append(this.LJII);
        LIZ.append(", imageUrl=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", listener=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJIIIIZZ, AnonymousClass391.LIZIZ(this.LJII, AnonymousClass391.LIZIZ(this.LJI, (this.LJFF.hashCode() + C12400eC.LIZ(this.LJ, (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
        C73974T1m c73974T1m = this.LJIIIZ;
        if (c73974T1m == null) {
            hashCode = 0;
        } else {
            hashCode = c73974T1m.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public C76882UFi(FragmentManager fragmentManager, String enterFrom, EnumC76880UFg imageCropType, UG0 emoteEditType, C93833mF c93833mF, C76878UFe imageParams, List list, UFP ufp) {
        C61878OQg imageUrl = C61878OQg.INSTANCE;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(imageCropType, "imageCropType");
        o.LJIIIZ(emoteEditType, "emoteEditType");
        o.LJIIIZ(imageParams, "imageParams");
        o.LJIIIZ(imageUrl, "imageUri");
        o.LJIIIZ(imageUrl, "imageUrl");
        this.LIZ = fragmentManager;
        this.LIZIZ = enterFrom;
        this.LIZJ = imageCropType;
        this.LIZLLL = emoteEditType;
        this.LJ = c93833mF;
        this.LJFF = imageParams;
        this.LJI = list;
        this.LJII = imageUrl;
        this.LJIIIIZZ = imageUrl;
        this.LJIIIZ = ufp;
    }
}
