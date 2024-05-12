package X;

import android.view.View;
import kotlin.jvm.internal.IDqS426S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.Gyk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43282Gyk implements C33Q {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final CharSequence LJLJJI;
    public final String LJLJJL;
    public final InterfaceC88472Yns<String, C76800UCe> LJLJJLL;
    public final InterfaceC88473Ynt<View, String, Boolean, C76800UCe> LJLJL;

    public C43282Gyk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43282Gyk)) {
            return false;
        }
        C43282Gyk c43282Gyk = (C43282Gyk) obj;
        return this.LJLIL == c43282Gyk.LJLIL && this.LJLILLLLZI == c43282Gyk.LJLILLLLZI && this.LJLJI == c43282Gyk.LJLJI && o.LJ(this.LJLJJI, c43282Gyk.LJLJJI) && o.LJ(this.LJLJJL, c43282Gyk.LJLJJL) && o.LJ(this.LJLJJLL, c43282Gyk.LJLJJLL) && o.LJ(this.LJLJL, c43282Gyk.LJLJL);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoReviewState(type=");
        LIZ.append(this.LJLIL);
        LIZ.append(", bgColorRes=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", iconRes=");
        LIZ.append(this.LJLJI);
        LIZ.append(", title=");
        LIZ.append((Object) this.LJLJJI);
        LIZ.append(", url=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", showAction=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", clickAction=");
        LIZ.append(this.LJLJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLJJL, (this.LJLJJI.hashCode() + (((((this.LJLIL * 31) + this.LJLILLLLZI) * 31) + this.LJLJI) * 31)) * 31, 31);
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        int i = 0;
        if (interfaceC88472Yns == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88472Yns.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        InterfaceC88473Ynt<View, String, Boolean, C76800UCe> interfaceC88473Ynt = this.LJLJL;
        if (interfaceC88473Ynt != null) {
            i = interfaceC88473Ynt.hashCode();
        }
        return i2 + i;
    }

    public /* synthetic */ C43282Gyk(int i) {
        this(0, -1, -1, "", "", null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43282Gyk(int i, int i2, int i3, CharSequence title, String url, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super View, ? super String, ? super Boolean, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(url, "url");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = title;
        this.LJLJJL = url;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88473Ynt;
    }

    public static C43282Gyk LIZ(C43282Gyk c43282Gyk, int i, int i2, int i3, CharSequence charSequence, String str, IDqS426S0100000_1 iDqS426S0100000_1, int i4) {
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns;
        InterfaceC88473Ynt<View, String, Boolean, C76800UCe> interfaceC88473Ynt = iDqS426S0100000_1;
        String url = str;
        CharSequence title = charSequence;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if ((i4 & 1) != 0) {
            i6 = c43282Gyk.LJLIL;
        }
        if ((i4 & 2) != 0) {
            i7 = c43282Gyk.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            i5 = c43282Gyk.LJLJI;
        }
        if ((i4 & 8) != 0) {
            title = c43282Gyk.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            url = c43282Gyk.LJLJJL;
        }
        if ((i4 & 32) != 0) {
            interfaceC88472Yns = c43282Gyk.LJLJJLL;
        } else {
            interfaceC88472Yns = null;
        }
        if ((i4 & 64) != 0) {
            interfaceC88473Ynt = c43282Gyk.LJLJL;
        }
        c43282Gyk.getClass();
        o.LJIIIZ(title, "title");
        o.LJIIIZ(url, "url");
        return new C43282Gyk(i6, i7, i5, title, url, interfaceC88472Yns, interfaceC88473Ynt);
    }
}
