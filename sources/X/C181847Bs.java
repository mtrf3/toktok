package X;

import android.os.Bundle;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7Bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C181847Bs implements InterfaceC87283bg {
    public final AbstractC193937jJ LJLIL;
    public final String LJLILLLLZI;
    public final Bundle LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C181847Bs)) {
            return false;
        }
        C181847Bs c181847Bs = (C181847Bs) obj;
        return o.LJ(this.LJLIL, c181847Bs.LJLIL) && o.LJ(this.LJLILLLLZI, c181847Bs.LJLILLLLZI) && o.LJ(this.LJLJI, c181847Bs.LJLJI) && o.LJ(this.LJLJJI, c181847Bs.LJLJJI) && o.LJ(this.LJLJJL, c181847Bs.LJLJJL) && o.LJ(this.LJLJJLL, c181847Bs.LJLJJLL);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.LJLJI.hashCode() + C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31)) * 31;
        String str = this.LJLJJI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.LJLJJL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.LJLJJLL;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowsFeedHierarchyData(nowPostScene=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", feedListBundle=");
        LIZ.append(this.LJLJI);
        LIZ.append(", enterPosition=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", previousPage=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", nowEnterMethod=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C181847Bs(AbstractC193937jJ nowPostScene, String enterFrom, String str, int i) {
        Bundle feedListBundle;
        enterFrom = (i & 2) != 0 ? "homepage_now" : enterFrom;
        if ((i & 4) != 0) {
            feedListBundle = new Bundle();
        } else {
            feedListBundle = null;
        }
        str = (i & 8) != 0 ? null : str;
        o.LJIIIZ(nowPostScene, "nowPostScene");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(feedListBundle, "feedListBundle");
        this.LJLIL = nowPostScene;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = feedListBundle;
        this.LJLJJI = str;
        this.LJLJJL = null;
        this.LJLJJLL = null;
    }
}
