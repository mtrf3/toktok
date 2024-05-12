package X;

import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.LinkedHashMap;

/* renamed from: X.R7y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69046R7y<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    public C69046R7y(BaseUpdatePasswordFragment baseUpdatePasswordFragment, String str, String str2, String str3) {
        this.LIZ = baseUpdatePasswordFragment;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C68972R5c.LJIIIIZZ(Boolean.FALSE, "sms_verification", this.LIZ.q9(), true, null, 16);
        R8B r8b = new R8B(this.LIZ, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C69093R9t.LJJIIJ(this.LIZIZ, linkedHashMap);
        this.LIZ.bi(r8b);
        this.LIZ.r9().LJJ(this.LIZJ, this.LIZLLL, linkedHashMap, r8b);
    }
}
