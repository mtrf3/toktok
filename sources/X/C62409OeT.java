package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.OeT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62409OeT {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62409OeT)) {
            return false;
        }
        C62409OeT c62409OeT = (C62409OeT) obj;
        return o.LJ(this.LIZ, c62409OeT.LIZ) && o.LJ(this.LIZIZ, c62409OeT.LIZIZ) && o.LJ(this.LIZJ, c62409OeT.LIZJ) && o.LJ(this.LIZLLL, c62409OeT.LIZLLL) && o.LJ(this.LJ, c62409OeT.LJ) && o.LJ(this.LJFF, c62409OeT.LJFF) && o.LJ(this.LJI, c62409OeT.LJI) && o.LJ(this.LJII, c62409OeT.LJII) && o.LJ(this.LJIIIIZZ, c62409OeT.LJIIIIZZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJII, C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, (LJ + hashCode) * 31, 31), 31), 31), 31), 31);
        String str2 = this.LJIIIIZZ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowExternalContentShareParams(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", fromUid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", toUid=");
        LIZ.append(this.LIZJ);
        LIZ.append(", title=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", content=");
        LIZ.append(this.LJ);
        LIZ.append(", defaultMsgText=");
        LIZ.append(this.LJFF);
        LIZ.append(", externalLink=");
        LIZ.append(this.LJI);
        LIZ.append(", coverUrl=");
        LIZ.append(this.LJII);
        LIZ.append(", filterScene=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public C62409OeT(String fromUid, String str, String title, String content, String defaultMsgText, String externalLink, String coverUrl, String str2) {
        o.LJIIIZ(fromUid, "fromUid");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content, "content");
        o.LJIIIZ(defaultMsgText, "defaultMsgText");
        o.LJIIIZ(externalLink, "externalLink");
        o.LJIIIZ(coverUrl, "coverUrl");
        this.LIZ = "TTN_referral";
        this.LIZIZ = fromUid;
        this.LIZJ = str;
        this.LIZLLL = title;
        this.LJ = content;
        this.LJFF = defaultMsgText;
        this.LJI = externalLink;
        this.LJII = coverUrl;
        this.LJIIIIZZ = str2;
    }
}
