package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.GlobalSpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70253Rhh implements InterfaceC70245RhZ {
    public final String LJLIL;
    public final Image LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public ISpecUiStyle LJLJJLL;

    @Override // X.InterfaceC70245RhZ
    public final void LJJLIIIIJ(String str) {
        o.LJIIIZ(str, "<set-?>");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70253Rhh)) {
            return false;
        }
        C70253Rhh c70253Rhh = (C70253Rhh) obj;
        return o.LJ(this.LJLIL, c70253Rhh.LJLIL) && o.LJ(this.LJLILLLLZI, c70253Rhh.LJLILLLLZI) && o.LJ(this.LJLJI, c70253Rhh.LJLJI) && this.LJLJJI == c70253Rhh.LJLJJI && this.LJLJJL == c70253Rhh.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        Image image = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.LJLJI;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode3 + i) * 31) + (this.LJLJJL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkcBlockSpecVO(id=");
        LIZ.append(this.LJLIL);
        LIZ.append(", image=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", text=");
        LIZ.append(this.LJLJI);
        LIZ.append(", hasStock=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isSelected=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC70245RhZ
    public final void LJLJLJ(ISpecUiStyle iSpecUiStyle) {
        o.LJIIIZ(iSpecUiStyle, "<set-?>");
        this.LJLJJLL = iSpecUiStyle;
    }

    public C70253Rhh(String id, Image image, String str, boolean z, boolean z2) {
        o.LJIIIZ(id, "id");
        this.LJLIL = id;
        this.LJLILLLLZI = image;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        new GlobalSpecUiStyle();
    }
}
