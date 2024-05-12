package X;

import android.os.Bundle;

/* loaded from: classes12.dex */
public final class RAZ<T> implements InterfaceC64592gB {
    public final /* synthetic */ RAY LJLIL;

    public RAZ(RAY ray) {
        this.LJLIL = ray;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        RAY ray = this.LJLIL;
        InterfaceC69056R8i interfaceC69056R8i = ray.LIZIZ;
        Bundle arguments = ray.LIZ.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC69113RAn.PHONE_SMS_LOGIN.getValue());
        arguments.putBoolean("code_sent", true);
        arguments.putBoolean("bind_secure", true);
        interfaceC69056R8i.rh(arguments);
    }
}
