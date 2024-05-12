package X;

import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import kotlin.jvm.internal.o;

/* renamed from: X.7dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190497dl implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final PoiAnchorData LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final java.util.Map<String, String> LJLJLLL;

    public C190497dl() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190497dl)) {
            return false;
        }
        C190497dl c190497dl = (C190497dl) obj;
        return o.LJ(this.LJLIL, c190497dl.LJLIL) && o.LJ(this.LJLILLLLZI, c190497dl.LJLILLLLZI) && o.LJ(this.LJLJI, c190497dl.LJLJI) && o.LJ(this.LJLJJI, c190497dl.LJLJJI) && o.LJ(this.LJLJJL, c190497dl.LJLJJL) && o.LJ(this.LJLJJLL, c190497dl.LJLJJLL) && o.LJ(this.LJLJL, c190497dl.LJLJL) && o.LJ(this.LJLJLJ, c190497dl.LJLJLJ) && o.LJ(this.LJLJLLL, c190497dl.LJLJLLL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PoiAnchorData poiAnchorData = this.LJLJI;
        int hashCode3 = (hashCode2 + (poiAnchorData == null ? 0 : poiAnchorData.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJL;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJLJJLL;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJLJL;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LJLJLJ;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.util.Map<String, String> map = this.LJLJLLL;
        return hashCode8 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PoiVideoListHierarchyData(entranceEnterMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", entranceEnterPage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", poiAnchorData=");
        LIZ.append(this.LJLJI);
        LIZ.append(", groupId=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", authorId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", logPb=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", previousPage=");
        LIZ.append(this.LJLJL);
        LIZ.append(", poiId=");
        LIZ.append(this.LJLJLJ);
        LIZ.append(", searchParams=");
        return C15890jp.LIZ(LIZ, this.LJLJLLL, ')', LIZ);
    }

    public C190497dl(PoiAnchorData poiAnchorData, String str, String str2, String str3, String str4, String str5, String str6, String str7, java.util.Map map) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = poiAnchorData;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = str5;
        this.LJLJL = str6;
        this.LJLJLJ = str7;
        this.LJLJLLL = map;
    }
}
