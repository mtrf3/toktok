package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.80T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80T {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final Drawable LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80T)) {
            return false;
        }
        C80T c80t = (C80T) obj;
        return o.LJ(this.LIZ, c80t.LIZ) && o.LJ(this.LIZIZ, c80t.LIZIZ) && o.LJ(this.LIZJ, c80t.LIZJ) && o.LJ(this.LIZLLL, c80t.LIZLLL) && o.LJ(this.LJ, c80t.LJ) && o.LJ(this.LJFF, c80t.LJFF);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        int hashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.LIZJ;
        int hashCode3 = (hashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Drawable drawable = this.LIZLLL;
        int hashCode4 = (hashCode3 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        String str2 = this.LJ;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJFF;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimateItem(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", eventType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", urlModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", channelDrawable=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", channelKey=");
        LIZ.append(this.LJ);
        LIZ.append(", toUserId=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C80T(Aweme aweme, String str, UrlModel urlModel, Drawable drawable, String str2, String str3, int i) {
        urlModel = (i & 4) != 0 ? null : urlModel;
        drawable = (i & 8) != 0 ? null : drawable;
        str2 = (i & 16) != 0 ? null : str2;
        str3 = (i & 32) != 0 ? null : str3;
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = urlModel;
        this.LIZLLL = drawable;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
