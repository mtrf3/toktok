package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.Ag9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26841Ag9 implements InterfaceC27632Asu {
    public final BrickStyle LJLIL;
    public final int LJLILLLLZI = EnumC27721AuL.BLANK.getValue();

    public final int hashCode() {
        BrickStyle brickStyle = this.LJLIL;
        if (brickStyle == null) {
            return 0;
        }
        return brickStyle.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlankBrickVO(brickStyle=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return this.LJLIL;
    }

    public C26841Ag9(BrickStyle brickStyle) {
        this.LJLIL = brickStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C26841Ag9) && o.LJ(this.LJLIL, ((C26841Ag9) obj).LJLIL)) {
            return true;
        }
        return false;
    }
}
