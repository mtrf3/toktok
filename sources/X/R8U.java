package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.ChildrenChangePasswordFragment;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class R8U<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    public R8U(ChildrenChangePasswordFragment childrenChangePasswordFragment, String str, String str2) {
        this.LIZ = childrenChangePasswordFragment;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R84 r84 = new R84(this.LIZ, c73516StE);
        LinkedHashMap LIZ = C0JU.LIZ("rules_version", "v2");
        this.LIZ.bi(r84);
        this.LIZ.r9().LJJIFFI(this.LIZIZ, this.LIZJ, LIZ, r84);
    }
}
