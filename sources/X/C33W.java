package X;

import com.ss.android.ugc.aweme.models.RssArticle;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.33W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33W implements C33Q {
    public final AbstractC72932td<List<RssArticle>> LJLIL;
    public final AbstractC72932td<List<String>> LJLILLLLZI;
    public final Boolean LJLJI;
    public final boolean LJLJJI;
    public final Integer LJLJJL;

    public C33W() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33W)) {
            return false;
        }
        C33W c33w = (C33W) obj;
        return o.LJ(this.LJLIL, c33w.LJLIL) && o.LJ(this.LJLILLLLZI, c33w.LJLILLLLZI) && o.LJ(this.LJLJI, c33w.LJLJI) && this.LJLJJI == c33w.LJLJJI && o.LJ(this.LJLJJL, c33w.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        Boolean bool = this.LJLJI;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (LIZ + hashCode) * 31;
        boolean z = this.LJLJJI;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Integer num = this.LJLJJL;
        if (num != null) {
            i = num.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RssFeedState(rssFeedResult=");
        LIZ.append(this.LJLIL);
        LIZ.append(", fetchImagesResult=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isRssFeedEmpty=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isInteractionEnabled=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", selectedArticleId=");
        return s0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C33W(int r7) {
        /*
            r6 = this;
            X.33X r1 = X.C33X.LIZ
            r3 = 0
            r4 = 1
            r0 = r6
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33W.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33W(AbstractC72932td<? extends List<RssArticle>> rssFeedResult, AbstractC72932td<? extends List<String>> fetchImagesResult, Boolean bool, boolean z, Integer num) {
        o.LJIIIZ(rssFeedResult, "rssFeedResult");
        o.LJIIIZ(fetchImagesResult, "fetchImagesResult");
        this.LJLIL = rssFeedResult;
        this.LJLILLLLZI = fetchImagesResult;
        this.LJLJI = bool;
        this.LJLJJI = z;
        this.LJLJJL = num;
    }

    public static C33W LIZ(C33W c33w, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, Boolean bool, boolean z, Integer num, int i) {
        Integer num2 = num;
        boolean z2 = z;
        Boolean bool2 = bool;
        AbstractC72932td rssFeedResult = abstractC72932td;
        AbstractC72932td fetchImagesResult = abstractC72932td2;
        if ((i & 1) != 0) {
            rssFeedResult = c33w.LJLIL;
        }
        if ((i & 2) != 0) {
            fetchImagesResult = c33w.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            bool2 = c33w.LJLJI;
        }
        if ((i & 8) != 0) {
            z2 = c33w.LJLJJI;
        }
        if ((i & 16) != 0) {
            num2 = c33w.LJLJJL;
        }
        c33w.getClass();
        o.LJIIIZ(rssFeedResult, "rssFeedResult");
        o.LJIIIZ(fetchImagesResult, "fetchImagesResult");
        return new C33W(rssFeedResult, fetchImagesResult, bool2, z2, num2);
    }
}
