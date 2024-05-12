package X;

import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class R8S<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;

    public R8S(BaseUpdatePasswordFragment baseUpdatePasswordFragment, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = baseUpdatePasswordFragment;
        this.LIZJ = str2;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R8J r8j = new R8J(this.LIZIZ, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C69093R9t.LJJIIJ(this.LIZ, linkedHashMap);
        this.LIZIZ.bi(r8j);
        this.LIZIZ.r9().LJIILL(this.LIZJ, linkedHashMap, r8j);
    }
}
