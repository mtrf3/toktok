package X;

import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148195rj {
    public final InterfaceC65784Pro<InterfaceC145495nN> LIZ;
    public final InterfaceC65784Pro<C63C> LIZIZ;
    public final InterfaceC65784Pro<C147295qH> LIZJ;
    public final InterfaceC65784Pro<C152175y9> LIZLLL;
    public final InterfaceC65784Pro<C5K1> LJ;
    public final InterfaceC65784Pro<ImageAlbumData> LJFF;
    public final List<MediaModel> LJI;
    public final boolean LJII;

    public C148195rj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C148195rj)) {
            return false;
        }
        C148195rj c148195rj = (C148195rj) obj;
        return o.LJ(this.LIZ, c148195rj.LIZ) && o.LJ(this.LIZIZ, c148195rj.LIZIZ) && o.LJ(this.LIZJ, c148195rj.LIZJ) && o.LJ(this.LIZLLL, c148195rj.LIZLLL) && o.LJ(this.LJ, c148195rj.LJ) && o.LJ(this.LJFF, c148195rj.LJFF) && o.LJ(this.LJI, c148195rj.LJI) && this.LJII == c148195rj.LJII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZLLL = C1JX.LIZLLL(this.LJFF, C1JX.LIZLLL(this.LJ, C1JX.LIZLLL(this.LIZLLL, C1JX.LIZLLL(this.LIZJ, C1JX.LIZLLL(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31);
        List<MediaModel> list = this.LJI;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i = (LIZLLL + hashCode) * 31;
        boolean z = this.LJII;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolbarOutsideState(musicControllerGetter=");
        LIZ.append(this.LIZ);
        LIZ.append(", stickerSceneGetter=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", editRootSceneGetter=");
        LIZ.append(this.LIZJ);
        LIZ.append(", imageViewPagerGetter=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", inlineCaptionCachesGetter=");
        LIZ.append(this.LJ);
        LIZ.append(", imageDataGetter=");
        LIZ.append(this.LJFF);
        LIZ.append(", mediaModelList=");
        LIZ.append(this.LJI);
        LIZ.append(", supportQuickPostOnEditPage=");
        return C48339Iy7.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public C148195rj(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, AqS152S0100000_2 aqS152S0100000_2, AqS152S0100000_2 aqS152S0100000_22, AqS152S0100000_2 aqS152S0100000_23, List list, boolean z, int i) {
        C148235rn inlineCaptionCachesGetter;
        InterfaceC65784Pro editRootSceneGetter = aqS152S0100000_2;
        editRootSceneGetter = (i & 4) != 0 ? C148215rl.LJLIL : editRootSceneGetter;
        InterfaceC65784Pro imageViewPagerGetter = aqS152S0100000_22;
        imageViewPagerGetter = (i & 8) != 0 ? C148225rm.LJLIL : imageViewPagerGetter;
        if ((i & 16) != 0) {
            inlineCaptionCachesGetter = C148235rn.LJLIL;
        } else {
            inlineCaptionCachesGetter = null;
        }
        InterfaceC65784Pro imageDataGetter = aqS152S0100000_23;
        imageDataGetter = (i & 32) != 0 ? C148245ro.LJLIL : imageDataGetter;
        list = (i & 64) != 0 ? null : list;
        z = (i & 128) != 0 ? false : z;
        o.LJIIIZ(editRootSceneGetter, "editRootSceneGetter");
        o.LJIIIZ(imageViewPagerGetter, "imageViewPagerGetter");
        o.LJIIIZ(inlineCaptionCachesGetter, "inlineCaptionCachesGetter");
        o.LJIIIZ(imageDataGetter, "imageDataGetter");
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC65784Pro2;
        this.LIZJ = editRootSceneGetter;
        this.LIZLLL = imageViewPagerGetter;
        this.LJ = inlineCaptionCachesGetter;
        this.LJFF = imageDataGetter;
        this.LJI = list;
        this.LJII = z;
    }
}
