package X;

import android.os.Bundle;

/* loaded from: classes12.dex */
public final class RAW<T> implements InterfaceC64592gB {
    public final /* synthetic */ RAX LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public RAW(RAX rax, String str) {
        this.LJLIL = rax;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        RAX rax = this.LJLIL;
        InterfaceC69056R8i interfaceC69056R8i = rax.LIZIZ;
        Bundle arguments = rax.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        String str = this.LJLILLLLZI;
        arguments.putBoolean("code_sent", true);
        arguments.putInt("next_page", EnumC69113RAn.EMAIL_SMS_SIGN_UP.getValue());
        arguments.putString("password", str);
        interfaceC69056R8i.rh(arguments);
    }
}
