package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;

/* renamed from: X.XkT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85713XkT implements InterfaceC113674d9 {
    public final /* synthetic */ InputCodeFragment LIZ;

    public C85713XkT(InputCodeFragment inputCodeFragment) {
        this.LIZ = inputCodeFragment;
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
        C85735Xkp.LIZ().put(this.LIZ.LLFF, Boolean.valueOf(z));
        this.LIZ.LLIIII = z;
    }
}
