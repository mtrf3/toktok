package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XkQ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85710XkQ implements InterfaceC113674d9 {
    public final /* synthetic */ InputCodeFragmentV2 LIZ;

    public C85710XkQ(InputCodeFragmentV2 inputCodeFragmentV2) {
        this.LIZ = inputCodeFragmentV2;
    }

    @Override // X.InterfaceC113674d9
    public final void LIZ(boolean z) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Voice code ");
        if (z) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        HashMap LIZ2 = C85735Xkp.LIZ();
        C85621Xiz c85621Xiz = this.LIZ.LLD;
        if (c85621Xiz != null) {
            LIZ2.put(c85621Xiz.LIZ(), Boolean.valueOf(z));
            this.LIZ.LLFFF = z;
        } else {
            o.LJIJI("config");
            throw null;
        }
    }
}
