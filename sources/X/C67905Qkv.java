package X;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: X.Qkv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67905Qkv implements InterfaceC67815QjT {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC67815QjT
    public final Account LJJJIL() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), null, Boolean.valueOf(this.LJLJI)});
    }

    public C67905Qkv() {
        this(new C67958Qlm());
    }

    public C67905Qkv(C67958Qlm c67958Qlm) {
        this.LJLIL = c67958Qlm.LIZ;
        this.LJLILLLLZI = 1;
        this.LJLJI = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C67905Qkv) {
            C67905Qkv c67905Qkv = (C67905Qkv) obj;
            if (C64363PNv.LIZ(Integer.valueOf(this.LJLIL), Integer.valueOf(c67905Qkv.LJLIL)) && C64363PNv.LIZ(Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(c67905Qkv.LJLILLLLZI)) && C64363PNv.LIZ(null, null) && C64363PNv.LIZ(Boolean.valueOf(this.LJLJI), Boolean.valueOf(c67905Qkv.LJLJI))) {
                return true;
            }
        }
        return false;
    }
}
