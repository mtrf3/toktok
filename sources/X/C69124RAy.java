package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.RAy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69124RAy<T> implements InterfaceC64592gB {
    public final /* synthetic */ CreatePasswordFragment LJLIL;

    public C69124RAy(CreatePasswordFragment createPasswordFragment) {
        this.LJLIL = createPasswordFragment;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        this.LJLIL.LLIIIL = true;
        R41.LJIIL(13, 1, null);
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            arguments.putBoolean("is_success", true);
        }
        Bundle arguments2 = this.LJLIL.getArguments();
        o.LJI(arguments2);
        if (arguments2.getBoolean("phone_signup")) {
            Bundle arguments3 = this.LJLIL.getArguments();
            o.LJI(arguments3);
            arguments3.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            Bundle arguments4 = this.LJLIL.getArguments();
            o.LJI(arguments4);
            arguments4.putInt("previous_page", EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE.getValue());
            CreatePasswordFragment createPasswordFragment = this.LJLIL;
            Bundle arguments5 = createPasswordFragment.getArguments();
            o.LJI(arguments5);
            createPasswordFragment.rh(arguments5);
            return;
        }
        Bundle arguments6 = this.LJLIL.getArguments();
        o.LJI(arguments6);
        arguments6.putInt("next_page", EnumC69113RAn.FINISH.getValue());
        CreatePasswordFragment createPasswordFragment2 = this.LJLIL;
        Bundle arguments7 = createPasswordFragment2.getArguments();
        o.LJI(arguments7);
        createPasswordFragment2.rh(arguments7);
    }
}
