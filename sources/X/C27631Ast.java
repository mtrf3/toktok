package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import defpackage.s0;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Ast, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27631Ast implements InterfaceC27632Asu {
    public final String LJLIL;
    public final Integer LJLILLLLZI;
    public AqS143S0200000_12 LJLJI;
    public Padding LJLJJI;
    public int LJLJJL;

    public C27631Ast() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27631Ast)) {
            return false;
        }
        C27631Ast c27631Ast = (C27631Ast) obj;
        return o.LJ(this.LJLIL, c27631Ast.LJLIL) && o.LJ(this.LJLILLLLZI, c27631Ast.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LJLILLLLZI;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // X.InterfaceC27632Asu
    public final BrickStyle m() {
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GlobalTitleVO(title=");
        LIZ.append(this.LJLIL);
        LIZ.append(", titleId=");
        return s0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.InterfaceC27632Asu
    public final int getBrickName() {
        return this.LJLJJL;
    }

    public C27631Ast(String str, Integer num, int i) {
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        this.LJLIL = str;
        this.LJLILLLLZI = num;
        this.LJLJJL = EnumC27721AuL.UNSET.getValue();
    }
}
