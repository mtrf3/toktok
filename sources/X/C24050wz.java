package X;

import java.util.List;
import org.json.JSONArray;

/* renamed from: X.0wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24050wz {
    public final JSONArray LIZ;
    public final String LIZIZ;
    public final JSONArray LIZJ;
    public List<Integer> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mCvvLength=");
        LIZ.append(this.LIZ);
        LIZ.append(", mCvvLengthList=");
        LIZ.append((Object) null);
        LIZ.append(", mCardBrandRegex='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", mCardBrandLength=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mCardBrandLengthList=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mCardBrandDisplayName='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", mCardBrand='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mPaymentMethodId='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", mIconUrl='");
        Q89.LIZIZ(LIZ, this.LJII, '\'', ", mDarkIconUrl='");
        return C77800Ug8.LIZJ(LIZ, this.LJIIIIZZ, '\'', '}', LIZ);
    }

    public C24050wz(C23980ws c23980ws, C24030wx c24030wx) {
        this.LIZ = c23980ws.LIZIZ;
        this.LIZIZ = c23980ws.LIZJ;
        this.LIZJ = c23980ws.LIZLLL;
        this.LJ = c23980ws.LJ;
        this.LJFF = c23980ws.LJFF;
        this.LJI = c24030wx.LIZ;
        this.LJII = c24030wx.LIZJ;
        this.LJIIIIZZ = c24030wx.LIZLLL;
    }
}
