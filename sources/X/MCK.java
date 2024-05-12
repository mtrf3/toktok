package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.model.ItemLikeListPreview;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCK {
    public final boolean LIZ;
    public final List<Aweme> LIZIZ;
    public final List<ItemLikeListPreview> LIZJ;
    public final List<UrlModel> LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;

    public MCK() {
        this(false, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MCK)) {
            return false;
        }
        MCK mck = (MCK) obj;
        return this.LIZ == mck.LIZ && o.LJ(this.LIZIZ, mck.LIZIZ) && o.LJ(this.LIZJ, mck.LIZJ) && o.LJ(this.LIZLLL, mck.LIZLLL) && this.LJ == mck.LJ && o.LJ(this.LJFF, mck.LJFF) && o.LJ(this.LJI, mck.LJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZLLL, AnonymousClass391.LIZIZ(this.LIZJ, AnonymousClass391.LIZIZ(this.LIZIZ, r0 * 31, 31), 31), 31);
        if (!this.LJ) {
            i = 0;
        }
        int i2 = (LIZIZ + i) * 31;
        String str = this.LJFF;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.LJI;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowWidgetBean(isEnabled=");
        LIZ.append(this.LIZ);
        LIZ.append(", nowInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", likeList=");
        LIZ.append(this.LIZJ);
        LIZ.append(", coverUrls=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isCameraBtnExpOn=");
        LIZ.append(this.LJ);
        LIZ.append(", widgetFeedLogId=");
        LIZ.append(this.LJFF);
        LIZ.append(", likeListLogId=");
        return q.LIZIZ(LIZ, this.LJI, ')', LIZ);
    }

    public MCK(boolean z, List list, List list2, List list3, String str, int i) {
        List list4 = list3;
        List list5 = list;
        List list6 = list2;
        z = (i & 1) != 0 ? false : z;
        list5 = (i & 2) != 0 ? C61878OQg.INSTANCE : list5;
        list6 = (i & 4) != 0 ? C61878OQg.INSTANCE : list6;
        list4 = (i & 8) != 0 ? C61878OQg.INSTANCE : list4;
        boolean LIZ = (i & 16) != 0 ? MAN.LIZIZ.LIZ() : false;
        str = (i & 32) != 0 ? null : str;
        C00F.LJ(list5, "nowInfo", list6, "likeList", list4, "coverUrls");
        this.LIZ = z;
        this.LIZIZ = list5;
        this.LIZJ = list6;
        this.LIZLLL = list4;
        this.LJ = LIZ;
        this.LJFF = str;
        this.LJI = null;
    }
}
