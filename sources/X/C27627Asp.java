package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Asp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27627Asp implements InterfaceC27632Asu {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final int LJLIL;
    public final BrickStyle LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final int LJLJJL;

    public final int hashCode() {
        int hashCode;
        int i = this.LJLIL * 31;
        BrickStyle brickStyle = this.LJLILLLLZI;
        int i2 = 0;
        if (brickStyle == null) {
            hashCode = 0;
        } else {
            hashCode = brickStyle.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str = this.LJLJI;
        if (str != null) {
            i2 = str.hashCode();
        }
        return C79062V1e.LJ(this.LJLJJI, (i3 + i2) * 31, 31) + this.LJLJJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxBrickVO(brickName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", brickStyle=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", brickData=");
        LIZ.append(this.LJLJI);
        LIZ.append(", brickSchema=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", brickType=");
        return b0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27627Asp)) {
            return false;
        }
        C27627Asp c27627Asp = (C27627Asp) obj;
        if (this.LJLIL == c27627Asp.LJLIL && o.LJ(this.LJLILLLLZI, c27627Asp.LJLILLLLZI) && o.LJ(this.LJLJI, c27627Asp.LJLJI) && o.LJ(this.LJLJJI, c27627Asp.LJLJJI) && this.LJLJJL == c27627Asp.LJLJJL) {
            return true;
        }
        return false;
    }

    public C27627Asp(int i, BrickStyle brickStyle, String str, String str2, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = brickStyle;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = i2;
    }
}
