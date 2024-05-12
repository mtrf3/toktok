package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107284Iy {
    public C4J0 LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<IMContact> LIZLLL;
    public final String LJ;
    public final SharePackage LJFF;
    public final BaseContent LJI;
    public final java.util.Map<String, String> LJII;
    public final java.util.Map<String, String> LJIIIIZZ;
    public final String LJIIIZ;
    public final C4J3 LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107284Iy)) {
            return false;
        }
        C107284Iy c107284Iy = (C107284Iy) obj;
        return this.LIZ == c107284Iy.LIZ && o.LJ(this.LIZIZ, c107284Iy.LIZIZ) && o.LJ(this.LIZJ, c107284Iy.LIZJ) && o.LJ(this.LIZLLL, c107284Iy.LIZLLL) && o.LJ(this.LJ, c107284Iy.LJ) && o.LJ(this.LJFF, c107284Iy.LJFF) && o.LJ(this.LJI, c107284Iy.LJI) && o.LJ(this.LJII, c107284Iy.LJII) && o.LJ(this.LJIIIIZZ, c107284Iy.LJIIIIZZ) && o.LJ(this.LJIIIZ, c107284Iy.LJIIIZ) && o.LJ(this.LJIIJ, c107284Iy.LJIIJ);
    }

    public final String toString() {
        return "ShareMessageParams(status=" + this.LIZ + ", shareId=" + this.LIZIZ + ", aid=" + this.LIZJ + ", contactList=" + this.LIZLLL + ", msg=" + this.LJ + ", sharePackage=" + this.LJFF + ", shareContent=" + this.LJI + ", extMap=" + this.LJII + ", localExtMap=" + this.LJIIIIZZ + ", processId=" + this.LJIIIZ + ", shareComplete=" + this.LJIIJ + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        List<IMContact> list = this.LIZLLL;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        SharePackage sharePackage = this.LJFF;
        if (sharePackage == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = sharePackage.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        BaseContent baseContent = this.LJI;
        if (baseContent == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = baseContent.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        java.util.Map<String, String> map = this.LJII;
        if (map == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = map.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        java.util.Map<String, String> map2 = this.LJIIIIZZ;
        if (map2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = map2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str3 = this.LJIIIZ;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        C4J3 c4j3 = this.LJIIJ;
        if (c4j3 != null) {
            i = c4j3.hashCode();
        }
        return i9 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C107284Iy(C4J0 status, String shareId, String str, List<? extends IMContact> list, String str2, SharePackage sharePackage, BaseContent baseContent, java.util.Map<String, String> map, java.util.Map<String, String> map2, String str3, C4J3 c4j3) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(shareId, "shareId");
        this.LIZ = status;
        this.LIZIZ = shareId;
        this.LIZJ = str;
        this.LIZLLL = list;
        this.LJ = str2;
        this.LJFF = sharePackage;
        this.LJI = baseContent;
        this.LJII = map;
        this.LJIIIIZZ = map2;
        this.LJIIIZ = str3;
        this.LJIIJ = c4j3;
    }
}
