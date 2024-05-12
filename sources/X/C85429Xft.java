package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Xft, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85429Xft extends C85433Xfx {
    public UrlModel LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;

    public C85429Xft() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        UrlModel urlModel = this.LJLJI;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = ((hashCode * 31) + this.LJLJJI) * 31;
        String str = this.LJLJJL;
        if (str != null) {
            i = str.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.LJLJJLL;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddFeedToMixListItem(cover=");
        LIZ.append(this.LJLJI);
        LIZ.append(", type=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", mixId=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", select=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    @Override // X.C85433Xfx
    public final boolean LIZ() {
        return this.LJLJJLL;
    }

    public C85429Xft(int i) {
        super(0);
        this.LJLJI = null;
        this.LJLJJI = 0;
        this.LJLJJL = null;
        this.LJLJJLL = false;
    }

    @Override // X.C85433Xfx
    public final void LIZIZ(boolean z) {
        this.LJLJJLL = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C85429Xft)) {
            return false;
        }
        C85429Xft c85429Xft = (C85429Xft) obj;
        if (o.LJ(this.LJLJI, c85429Xft.LJLJI) && this.LJLJJI == c85429Xft.LJLJJI && o.LJ(this.LJLJJL, c85429Xft.LJLJJL) && this.LJLJJLL == c85429Xft.LJLJJLL) {
            return true;
        }
        return false;
    }
}
