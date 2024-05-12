package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTY {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final UrlModel LJ;
    public final String LJFF;
    public final float LJI;
    public final String LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RTY() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r6 = 255(0xff, float:3.57E-43)
            r0 = r7
            r3 = r2
            r4 = r1
            r5 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RTY.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RTY)) {
            return false;
        }
        RTY rty = (RTY) obj;
        return this.LIZ == rty.LIZ && this.LIZIZ == rty.LIZIZ && this.LIZJ == rty.LIZJ && Float.compare(this.LIZLLL, rty.LIZLLL) == 0 && o.LJ(this.LJ, rty.LJ) && o.LJ(this.LJFF, rty.LJFF) && Float.compare(this.LJI, rty.LJI) == 0 && o.LJ(this.LJII, rty.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r02 = this.LIZIZ;
        int i3 = r02;
        if (r02 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        if (!this.LIZJ) {
            i = 0;
        }
        int LIZIZ = C47959Irz.LIZIZ(this.LIZLLL, (i4 + i) * 31, 31);
        UrlModel urlModel = this.LJ;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        return this.LJII.hashCode() + C47959Irz.LIZIZ(this.LJI, C79062V1e.LJ(this.LJFF, (LIZIZ + hashCode) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerFakeFeedModel(rightVisible=");
        LIZ.append(this.LIZ);
        LIZ.append(", topVisible=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bottomVisible=");
        LIZ.append(this.LIZJ);
        LIZ.append(", alpha=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", avatarUrl=");
        LIZ.append(this.LJ);
        LIZ.append(", userName=");
        LIZ.append(this.LJFF);
        LIZ.append(", nameTextSize=");
        LIZ.append(this.LJI);
        LIZ.append(", musicText=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public static RTY LIZ(RTY rty, boolean z, boolean z2, boolean z3, int i) {
        float f;
        UrlModel urlModel;
        String userName;
        float f2;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        if ((i & 1) != 0) {
            z5 = rty.LIZ;
        }
        if ((i & 2) != 0) {
            z6 = rty.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = rty.LIZJ;
        }
        if ((i & 8) != 0) {
            f = rty.LIZLLL;
        } else {
            f = 0.0f;
        }
        String musicText = null;
        if ((i & 16) != 0) {
            urlModel = rty.LJ;
        } else {
            urlModel = null;
        }
        if ((i & 32) != 0) {
            userName = rty.LJFF;
        } else {
            userName = null;
        }
        if ((i & 64) != 0) {
            f2 = rty.LJI;
        } else {
            f2 = 0.0f;
        }
        if ((i & 128) != 0) {
            musicText = rty.LJII;
        }
        rty.getClass();
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(musicText, "musicText");
        return new RTY(z5, z6, z4, f, urlModel, userName, f2, musicText);
    }

    public /* synthetic */ RTY(float f, UrlModel urlModel, String str, float f2, String str2, int i) {
        this(false, false, false, (i & 8) != 0 ? 0.5f : f, (i & 16) != 0 ? null : urlModel, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? 15.0f : f2, (i & 128) == 0 ? str2 : "");
    }

    public RTY(boolean z, boolean z2, boolean z3, float f, UrlModel urlModel, String userName, float f2, String musicText) {
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(musicText, "musicText");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = f;
        this.LJ = urlModel;
        this.LJFF = userName;
        this.LJI = f2;
        this.LJII = musicText;
    }
}
