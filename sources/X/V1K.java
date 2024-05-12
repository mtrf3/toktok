package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V1K {
    public static final /* synthetic */ int LJIJI = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final Bundle LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;
    public final UrlModel LJIILIIL;
    public final int LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final MusicModel LJIIZILJ;
    public final boolean LJIJ;

    static {
        new HNH();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V1K)) {
            return false;
        }
        V1K v1k = (V1K) obj;
        return o.LJ(this.LIZ, v1k.LIZ) && this.LIZIZ == v1k.LIZIZ && this.LIZJ == v1k.LIZJ && this.LIZLLL == v1k.LIZLLL && o.LJ(this.LJ, v1k.LJ) && o.LJ(this.LJFF, v1k.LJFF) && o.LJ(this.LJI, v1k.LJI) && this.LJII == v1k.LJII && this.LJIIIIZZ == v1k.LJIIIIZZ && this.LJIIIZ == v1k.LJIIIZ && this.LJIIJ == v1k.LJIIJ && this.LJIIJJI == v1k.LJIIJJI && o.LJ(this.LJIIL, v1k.LJIIL) && o.LJ(this.LJIILIIL, v1k.LJIILIIL) && this.LJIILJJIL == v1k.LJIILJJIL && o.LJ(this.LJIILL, v1k.LJIILL) && o.LJ(this.LJIILLIIL, v1k.LJIILLIIL) && o.LJ(this.LJIIZILJ, v1k.LJIIZILJ) && this.LJIJ == v1k.LJIJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LIZLLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Bundle bundle = this.LJ;
        int hashCode2 = (i4 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        String str2 = this.LJFF;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.LJII;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode4 + i5) * 31;
        boolean z4 = this.LJIIIIZZ;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.LJIIIZ;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.LJIIJ;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.LJIIJJI;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        String str4 = this.LJIIL;
        int hashCode5 = (i14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel = this.LJIILIIL;
        int hashCode6 = (((hashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LJIILJJIL) * 31;
        String str5 = this.LJIILL;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIILLIIL;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MusicModel musicModel = this.LJIIZILJ;
        return ((hashCode8 + (musicModel != null ? musicModel.hashCode() : 0)) * 31) + (this.LJIJ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMusicRequestBean(title=");
        sb.append(this.LIZ);
        sb.append(", musicChooseType=");
        sb.append(this.LIZIZ);
        sb.append(", allowClear=");
        sb.append(this.LIZJ);
        sb.append(", isPhotoMvMode=");
        sb.append(this.LIZLLL);
        sb.append(", bundle=");
        sb.append(this.LJ);
        sb.append(", shootWay=");
        sb.append(this.LJFF);
        sb.append(", creationId=");
        sb.append(this.LJI);
        sb.append(", isBeatMusicSticker=");
        sb.append(this.LJII);
        sb.append(", hideLocalMusic=");
        sb.append(this.LJIIIIZZ);
        sb.append(", isMvThemeMusic=");
        sb.append(this.LJIIIZ);
        sb.append(", isLongVideo=");
        sb.append(this.LJIIJ);
        sb.append(", allowCut=");
        sb.append(this.LJIIJJI);
        sb.append(", reuseOriginalSoundId=");
        sb.append(this.LJIIL);
        sb.append(", reuseOriginalSoundUrls=");
        sb.append(this.LJIILIIL);
        sb.append(", reuseOriginalSoundLength=");
        sb.append(this.LJIILJJIL);
        sb.append(", fromLocation=");
        sb.append(this.LJIILL);
        sb.append(", type=");
        sb.append(this.LJIILLIIL);
        sb.append(", currentUsedMusic=");
        sb.append(this.LJIIZILJ);
        sb.append(", isCarousel=");
        return C08880Wm.LIZJ(sb, this.LJIJ, ')');
    }

    public V1K(String str, int i, boolean z, boolean z2, Bundle bundle, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str4, UrlModel urlModel, int i2, String str5, String str6, MusicModel musicModel, boolean z8) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = bundle;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = z5;
        this.LJIIJ = z6;
        this.LJIIJJI = z7;
        this.LJIIL = str4;
        this.LJIILIIL = urlModel;
        this.LJIILJJIL = i2;
        this.LJIILL = str5;
        this.LJIILLIIL = str6;
        this.LJIIZILJ = musicModel;
        this.LJIJ = z8;
    }
}
