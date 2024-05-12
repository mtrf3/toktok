package X;

import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.LinkedHashMap;
import ujb.s;

/* renamed from: X.R7x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69045R7x<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    public C69045R7x(BaseUpdatePasswordFragment baseUpdatePasswordFragment, String str, String str2, String str3) {
        this.LIZ = baseUpdatePasswordFragment;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C68972R5c.LJIIIIZZ(Boolean.FALSE, "email", this.LIZ.q9(), true, null, 16);
        R8M r8m = new R8M(this.LIZ, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C69093R9t.LJJIIJ(this.LIZIZ, linkedHashMap);
        this.LIZ.bi(r8m);
        this.LIZ.r9().LJII(s.LJZI(this.LIZJ).toString(), this.LIZLLL, linkedHashMap, r8m);
    }
}
