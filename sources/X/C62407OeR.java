package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.OeR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62407OeR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final UrlModel LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final UrlModel LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62407OeR)) {
            return false;
        }
        C62407OeR c62407OeR = (C62407OeR) obj;
        return o.LJ(this.LIZ, c62407OeR.LIZ) && o.LJ(this.LIZIZ, c62407OeR.LIZIZ) && o.LJ(this.LIZJ, c62407OeR.LIZJ) && o.LJ(this.LIZLLL, c62407OeR.LIZLLL) && o.LJ(this.LJ, c62407OeR.LJ) && o.LJ(this.LJFF, c62407OeR.LJFF) && o.LJ(this.LJI, c62407OeR.LJI) && o.LJ(this.LJII, c62407OeR.LJII) && o.LJ(this.LJIIIIZZ, c62407OeR.LJIIIIZZ) && o.LJ(this.LJIIIZ, c62407OeR.LJIIIZ);
    }

    public C62407OeR() {
        this("", "", "", "", "", "", null, "", "", null);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31);
        UrlModel urlModel = this.LJI;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.LJIIIIZZ, C79062V1e.LJ(this.LJII, (LJ + hashCode) * 31, 31), 31);
        UrlModel urlModel2 = this.LJIIIZ;
        if (urlModel2 != null) {
            i = urlModel2.hashCode();
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Product(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", title=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", queryParams=");
        LIZ.append(this.LIZJ);
        LIZ.append(", deepLink=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", price=");
        LIZ.append(this.LJ);
        LIZ.append(", sales=");
        LIZ.append(this.LJFF);
        LIZ.append(", picture=");
        LIZ.append(this.LJI);
        LIZ.append(", sellerId=");
        LIZ.append(this.LJII);
        LIZ.append(", sellerName=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", sellerAvatar=");
        return C31461Li.LIZLLL(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C62407OeR(String id, String title, String queryParams, String deepLink, String price, String sales, UrlModel urlModel, String sellerId, String sellerName, UrlModel urlModel2) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(queryParams, "queryParams");
        o.LJIIIZ(deepLink, "deepLink");
        o.LJIIIZ(price, "price");
        o.LJIIIZ(sales, "sales");
        o.LJIIIZ(sellerId, "sellerId");
        o.LJIIIZ(sellerName, "sellerName");
        this.LIZ = id;
        this.LIZIZ = title;
        this.LIZJ = queryParams;
        this.LIZLLL = deepLink;
        this.LJ = price;
        this.LJFF = sales;
        this.LJI = urlModel;
        this.LJII = sellerId;
        this.LJIIIIZZ = sellerName;
        this.LJIIIZ = urlModel2;
    }
}
