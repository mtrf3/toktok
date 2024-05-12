package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.R9m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69086R9m extends AbstractC69088R9o {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    @Override // X.AbstractC69088R9o
    public final boolean LIZ() {
        InterfaceC69056R8i interfaceC69056R8i = this.LIZIZ;
        Bundle bundle = new Bundle();
        bundle.putInt("next_page", EnumC69113RAn.PHONE_RECYCLE_PROCESS.getValue());
        bundle.putString("sms_code_key", this.LIZJ);
        bundle.putString("username", this.LIZLLL);
        bundle.putString("avatar_url", this.LJ);
        bundle.putSerializable("args_phone_number", RBV.LJ(this.LIZ));
        interfaceC69056R8i.rh(bundle);
        return true;
    }

    public C69086R9m(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3) {
        super(fragment, interfaceC69056R8i);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
