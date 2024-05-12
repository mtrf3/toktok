package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.AlZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27177AlZ implements InterfaceC27624Asm {
    public final Image LJLIL;
    public final boolean LJLILLLLZI;
    public final Float LJLJI;
    public final int LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27177AlZ)) {
            return false;
        }
        C27177AlZ c27177AlZ = (C27177AlZ) obj;
        return o.LJ(this.LJLIL, c27177AlZ.LJLIL) && this.LJLILLLLZI == c27177AlZ.LJLILLLLZI && o.LJ(this.LJLJI, c27177AlZ.LJLJI);
    }

    @Override // X.InterfaceC27624Asm
    public final String getStyle() {
        return "image";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Float f = this.LJLJI;
        return i2 + (f == null ? 0 : f.hashCode());
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductImageVO(image=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showViewMore=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", lastHeight=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJJI;
    }

    public /* synthetic */ C27177AlZ(Image image) {
        this(image, false, null);
    }

    public C27177AlZ(Image image, boolean z, Float f) {
        o.LJIIIZ(image, "image");
        this.LJLIL = image;
        this.LJLILLLLZI = z;
        this.LJLJI = f;
        this.LJLJJI = EnumC27721AuL.DESCRIPTION.getValue();
    }
}
