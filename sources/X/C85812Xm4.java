package X;

import Y.ACListenerS35S0100000_15;
import Y.ARunnableS51S0100000_15;
import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xm4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85812Xm4 extends C85814Xm6 {
    public static final /* synthetic */ int LJLL = 0;
    public C74088T5w LJLJJLL;
    public C74090T5y LJLJL;
    public C252949wI LJLJLJ;
    public final C85690Xk6 LJLJLLL;

    @Override // X.C85814Xm6
    public final View LIZJ() {
        if (this.LJLIL.getLayoutResource() <= 0) {
            this.LJLIL.setLayoutResource(R.layout.no);
        }
        View view = this.LJLIL.inflate();
        o.LJIIIIZZ(view, "view");
        View findViewById = view.findViewById(R.id.hii);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.p…ord_authenticator_button)");
        this.LJLJJLL = (C74088T5w) findViewById;
        View findViewById2 = view.findViewById(R.id.hik);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.p…word_authenticator_input)");
        this.LJLJL = (C74090T5y) findViewById2;
        View findViewById3 = view.findViewById(R.id.hil);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.p…thenticator_input_result)");
        this.LJLJLJ = (C252949wI) findViewById3;
        C74090T5y c74090T5y = this.LJLJL;
        if (c74090T5y != null) {
            c74090T5y.setTextWatcher(new C85815Xm7(this));
            C74088T5w c74088T5w = this.LJLJJLL;
            if (c74088T5w != null) {
                c74088T5w.setEnabled(false);
                C74088T5w c74088T5w2 = this.LJLJJLL;
                if (c74088T5w2 != null) {
                    c74088T5w2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 251)));
                    if (this.LJLJJI == null) {
                        LIZLLL(null, "JSON is empty");
                    } else {
                        C82544WaS.LIZ(new ARunnableS51S0100000_15(this, 118));
                    }
                    this.LJLJLLL.LIZIZ();
                    return view;
                }
                o.LJIJI("loadingButton");
                throw null;
            }
            o.LJIJI("loadingButton");
            throw null;
        }
        o.LJIJI("passwordInput");
        throw null;
    }

    public final void LJ(String str) {
        C252949wI c252949wI = this.LJLJLJ;
        if (c252949wI != null) {
            c252949wI.LIZIZ(str);
            C74088T5w c74088T5w = this.LJLJJLL;
            if (c74088T5w != null) {
                c74088T5w.LIZ(true);
                return;
            } else {
                o.LJIJI("loadingButton");
                throw null;
            }
        }
        o.LJIJI("passwordInputResult");
        throw null;
    }

    public final void LIZLLL(Integer num, String str) {
        this.LJLJLLL.LIZ(false);
        LJ(LIZIZ(num, str));
        InterfaceC85818XmA interfaceC85818XmA = this.LJLILLLLZI;
        if (interfaceC85818XmA != null) {
            interfaceC85818XmA.LJJLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85812Xm4(C29S activity, ViewStub viewStub, InterfaceC85818XmA authCallback) {
        super(activity, viewStub, authCallback);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(authCallback, "authCallback");
        this.LJLJLLL = new C85690Xk6(EnumC85691Xk7.PASSWORD);
    }
}
