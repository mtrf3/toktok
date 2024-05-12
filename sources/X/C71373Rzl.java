package X;

import com.lynx.tasm.TemplateData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71373Rzl {
    public final String LIZ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final List<String> LJI;
    public final int[] LJIIIIZZ;
    public final HashMap<String, String> LJIIJ;
    public final String LJIIJJI;
    public final String LIZIZ = "video";
    public final String LIZJ = "video";
    public final int LJII = 2;
    public final String LJIIIZ = "video_anchor_landing_page_guess_like";
    public final TemplateData LJIIL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71373Rzl)) {
            return false;
        }
        C71373Rzl c71373Rzl = (C71373Rzl) obj;
        return o.LJ(this.LIZ, c71373Rzl.LIZ) && o.LJ(this.LIZIZ, c71373Rzl.LIZIZ) && o.LJ(this.LIZJ, c71373Rzl.LIZJ) && o.LJ(this.LIZLLL, c71373Rzl.LIZLLL) && o.LJ(this.LJ, c71373Rzl.LJ) && this.LJFF == c71373Rzl.LJFF && o.LJ(this.LJI, c71373Rzl.LJI) && this.LJII == c71373Rzl.LJII && o.LJ(this.LJIIIIZZ, c71373Rzl.LJIIIIZZ) && o.LJ(this.LJIIIZ, c71373Rzl.LJIIIZ) && o.LJ(this.LJIIJ, c71373Rzl.LJIIJ) && o.LJ(this.LJIIJJI, c71373Rzl.LJIIJJI) && o.LJ(this.LJIIL, c71373Rzl.LJIIL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        String str = this.LIZLLL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.LJFF) * 31;
        List<String> list = this.LJI;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJIIIZ, (Arrays.hashCode(this.LJIIIIZZ) + ((((i3 + hashCode3) * 31) + this.LJII) * 31)) * 31, 31);
        HashMap<String, String> hashMap = this.LJIIJ;
        if (hashMap == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = hashMap.hashCode();
        }
        int LJ3 = C79062V1e.LJ(this.LJIIJJI, (LJ2 + hashCode4) * 31, 31);
        TemplateData templateData = this.LJIIL;
        if (templateData != null) {
            i = templateData.hashCode();
        }
        return LJ3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GylLynxData(enterFrom=");
        sb.append(this.LIZ);
        sb.append(", pageName=");
        sb.append(this.LIZIZ);
        sb.append(", previousPage=");
        sb.append(this.LIZJ);
        sb.append(", videoId=");
        sb.append(this.LIZLLL);
        sb.append(", authorId=");
        sb.append(this.LJ);
        sb.append(", anchorType=");
        sb.append(this.LJFF);
        sb.append(", productIds=");
        sb.append(this.LJI);
        sb.append(", trafficSource=");
        sb.append(this.LJII);
        sb.append(", trafficSourceList=");
        C0JT.LIZLLL(this.LJIIIIZZ, sb, ", bizScene=");
        sb.append(this.LJIIIZ);
        sb.append(", defaultTrackParams=");
        sb.append(this.LJIIJ);
        sb.append(", schema=");
        sb.append(this.LJIIJJI);
        sb.append(", templateData=");
        sb.append(this.LJIIL);
        sb.append(')');
        return sb.toString();
    }

    public C71373Rzl(String str, String str2, String str3, int i, List list, int[] iArr, HashMap hashMap, String str4) {
        this.LIZ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = i;
        this.LJI = list;
        this.LJIIIIZZ = iArr;
        this.LJIIJ = hashMap;
        this.LJIIJJI = str4;
    }
}
