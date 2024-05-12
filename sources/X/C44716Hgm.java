package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44716Hgm {
    public final C63A LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final String LIZLLL;
    public AVMusic LJ;
    public String LJFF;
    public long LJI;
    public NLEModel LJII;
    public VecMeta LJIIIIZZ;
    public String LJIIIZ;
    public List<TextStickerData> LJIIJ;
    public String LJIIJJI;
    public java.util.Set<String> LJIIL;

    public final C44716Hgm LIZ() {
        return new C44716Hgm(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL);
    }

    public final boolean LIZJ() {
        if (this.LIZIZ >= 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutData(source = ");
        LIZ.append(this.LIZ);
        LIZ.append(", indexFromSource = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avMusic = ");
        AVMusic aVMusic = this.LJ;
        if (aVMusic != null) {
            str = aVMusic.musicName;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", templateType = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicPath = ");
        LIZ.append(this.LJFF);
        LIZ.append(", duration = ");
        LIZ.append(this.LJI);
        LIZ.append(", nleModel = ");
        LIZ.append(this.LJII);
        LIZ.append(", templateId = ");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", templateGroupId = ");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", preloadUrsSet=");
        LIZ.append(this.LJIIL);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LIZIZ(boolean z, boolean z2) {
        String str;
        if (!LIZJ()) {
            return false;
        }
        if (z && (this.LJ == null || (str = this.LJFF) == null || str.length() <= 0)) {
            return false;
        }
        if (z2 && this.LJII == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C44716Hgm(C63A c63a, int i, int i2, String str, AVMusic aVMusic, String str2, long j, NLEModel nLEModel, String str3, List list, String str4, int i3) {
        this(c63a, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue() : i2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : aVMusic, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? -1L : j, (i3 & 128) != 0 ? null : nLEModel, null, (i3 & 512) != 0 ? null : str3, (i3 & 1024) != 0 ? null : list, (i3 & 2048) == 0 ? str4 : null, null);
    }

    public C44716Hgm(C63A source, int i, int i2, String str, AVMusic aVMusic, String str2, long j, NLEModel nLEModel, VecMeta vecMeta, String str3, List<TextStickerData> list, String str4, java.util.Set<String> set) {
        o.LJIIIZ(source, "source");
        this.LIZ = source;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = aVMusic;
        this.LJFF = str2;
        this.LJI = j;
        this.LJII = nLEModel;
        this.LJIIIIZZ = vecMeta;
        this.LJIIIZ = str3;
        this.LJIIJ = list;
        this.LJIIJJI = str4;
        this.LJIIL = set;
    }
}
