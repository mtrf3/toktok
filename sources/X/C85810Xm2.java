package X;

import Y.ACListenerS35S0100000_15;
import Y.ARunnableS51S0100000_15;
import Y.AgS131S0100000_15;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xm2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85810Xm2 extends C85814Xm6 implements InterfaceC80500Via {
    public static final /* synthetic */ int LJLLLL = 0;
    public C85714XkU LJLJJLL;
    public C80498ViY LJLJL;
    public C74086T5u LJLJLJ;
    public TextView LJLJLLL;
    public View LJLL;
    public TextView LJLLI;
    public View LJLLILLLL;
    public boolean LJLLJ;
    public final C85690Xk6 LJLLL;

    @Override // X.C85814Xm6
    public final View LIZJ() {
        int i;
        int i2;
        if (this.LJLIL.getLayoutResource() <= 0) {
            this.LJLIL.setLayoutResource(R.layout.np);
        }
        View view = this.LJLIL.inflate();
        o.LJIIIIZZ(view, "view");
        View findViewById = view.findViewById(R.id.k68);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.s…de_authenticator_loading)");
        this.LJLJLJ = (C74086T5u) findViewById;
        View findViewById2 = view.findViewById(R.id.k64);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.s…_code_authenticator_desc)");
        this.LJLJLLL = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.k67);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.s…code_authenticator_input)");
        this.LJLJL = (C80498ViY) findViewById3;
        View findViewById4 = view.findViewById(R.id.k69);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.s…ode_authenticator_resend)");
        this.LJLL = findViewById4;
        View findViewById5 = view.findViewById(R.id.k6_);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.s…code_authenticator_timer)");
        this.LJLJJLL = (C85714XkU) findViewById5;
        View findViewById6 = view.findViewById(R.id.k65);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.s…thenticator_error_layout)");
        this.LJLLILLLL = findViewById6;
        View findViewById7 = view.findViewById(R.id.k66);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.s…authenticator_error_text)");
        this.LJLLI = (TextView) findViewById7;
        TextView textView = (TextView) view.findViewById(R.id.k6a);
        if (C35338Dtu.LIZ()) {
            i = R.string.dqn;
        } else {
            i = R.string.hxv;
        }
        textView.setText(i);
        C85714XkU c85714XkU = this.LJLJJLL;
        if (c85714XkU != null) {
            c85714XkU.LJZI = "s";
            c85714XkU.LJLZ = 60000L;
            c85714XkU.LJZ = 1000L;
            c85714XkU.setText(String.valueOf(60000 / 1000) + "s");
            C85714XkU c85714XkU2 = this.LJLJJLL;
            if (c85714XkU2 != null) {
                c85714XkU2.setCallback(new C85817Xm9(this));
                View view2 = this.LJLL;
                if (view2 != null) {
                    view2.setEnabled(false);
                    View view3 = this.LJLL;
                    if (view3 != null) {
                        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 253), view3);
                        C80498ViY c80498ViY = this.LJLJL;
                        if (c80498ViY != null) {
                            c80498ViY.setEnabled(false);
                            C80498ViY c80498ViY2 = this.LJLJL;
                            if (c80498ViY2 != null) {
                                c80498ViY2.LJIIIIZZ();
                                C80498ViY c80498ViY3 = this.LJLJL;
                                if (c80498ViY3 != null) {
                                    c80498ViY3.LJI();
                                    C80498ViY c80498ViY4 = this.LJLJL;
                                    if (c80498ViY4 != null) {
                                        c80498ViY4.setCallback(this);
                                        C80498ViY c80498ViY5 = this.LJLJL;
                                        if (c80498ViY5 != null) {
                                            if (C35338Dtu.LIZ()) {
                                                i2 = 6;
                                            } else {
                                                i2 = 4;
                                            }
                                            c80498ViY5.setInputLength(i2);
                                            if (this.LJLJJI == null) {
                                                LJFF(null, "JSON is empty");
                                            } else {
                                                C82544WaS.LIZ(new ARunnableS51S0100000_15(this, 119));
                                            }
                                            this.LJLLL.LIZIZ();
                                            return view;
                                        }
                                        o.LJIJI("codeInputView");
                                        throw null;
                                    }
                                    o.LJIJI("codeInputView");
                                    throw null;
                                }
                                o.LJIJI("codeInputView");
                                throw null;
                            }
                            o.LJIJI("codeInputView");
                            throw null;
                        }
                        o.LJIJI("codeInputView");
                        throw null;
                    }
                    o.LJIJI("resendCodeBtn");
                    throw null;
                }
                o.LJIJI("resendCodeBtn");
                throw null;
            }
            o.LJIJI("timerText");
            throw null;
        }
        o.LJIJI("timerText");
        throw null;
    }

    public final void LIZLLL() {
        View view = this.LJLLILLLL;
        if (view != null) {
            view.setVisibility(8);
            C80498ViY c80498ViY = this.LJLJL;
            if (c80498ViY != null) {
                c80498ViY.LJII();
                return;
            } else {
                o.LJIJI("codeInputView");
                throw null;
            }
        }
        o.LJIJI("errorLayout");
        throw null;
    }

    public final void LJ() {
        C74086T5u c74086T5u = this.LJLJLJ;
        if (c74086T5u != null) {
            c74086T5u.LIZJ();
            C74086T5u c74086T5u2 = this.LJLJLJ;
            if (c74086T5u2 != null) {
                c74086T5u2.setVisibility(8);
                return;
            } else {
                o.LJIJI("loadingView");
                throw null;
            }
        }
        o.LJIJI("loadingView");
        throw null;
    }

    public final void LJI() {
        TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
        String str = this.LJLJJL;
        twoStepAuthApi.getClass();
        TwoStepAuthApi.LIZIZ().sendSmsCode(str, Integer.valueOf(C35338Dtu.LIZ() ? 1 : 0), 22).LJ(new AgS131S0100000_15(this, 25), C10K.LJIIIIZZ, null);
    }

    @Override // X.InterfaceC80500Via
    public final void LLFZ() {
        this.LJLLL.LIZJ();
    }

    @Override // X.InterfaceC80500Via
    public final void LJJLIL(String str) {
        if (this.LJLLJ) {
            C80498ViY c80498ViY = this.LJLJL;
            if (c80498ViY != null) {
                c80498ViY.setText("");
                this.LJLLJ = false;
            } else {
                o.LJIJI("codeInputView");
                throw null;
            }
        }
        LIZLLL();
    }

    @Override // X.InterfaceC80500Via
    public final void LJLL(String str) {
        this.LJLLJ = false;
        C74086T5u c74086T5u = this.LJLJLJ;
        if (c74086T5u != null) {
            c74086T5u.setVisibility(0);
            C74086T5u c74086T5u2 = this.LJLJLJ;
            if (c74086T5u2 != null) {
                c74086T5u2.LIZIZ();
                LIZLLL();
                TwoStepAuthApi twoStepAuthApi = TwoStepAuthApi.LIZ;
                String str2 = this.LJLJJL;
                twoStepAuthApi.getClass();
                TwoStepAuthApi.Api LIZIZ = TwoStepAuthApi.LIZIZ();
                String LJIIL = C78946Uyc.LJIIL(null);
                String LJIIL2 = C78946Uyc.LJIIL(str);
                o.LJIIIIZZ(LJIIL2, "encryptWithXor(code)");
                LIZIZ.verifySmsCode(1, LJIIL, LJIIL2, 22, str2).LJ(new AgS131S0100000_15(this, 24), C10K.LJIIIIZZ, null);
                return;
            }
            o.LJIJI("loadingView");
            throw null;
        }
        o.LJIJI("loadingView");
        throw null;
    }

    public final void LJFF(Integer num, String str) {
        this.LJLLL.LIZ(false);
        LJ();
        String LIZIZ = LIZIZ(num, str);
        View view = this.LJLLILLLL;
        if (view != null) {
            view.setVisibility(0);
            TextView textView = this.LJLLI;
            if (textView != null) {
                textView.setText(LIZIZ);
                C80498ViY c80498ViY = this.LJLJL;
                if (c80498ViY != null) {
                    c80498ViY.LJIIIZ();
                    InterfaceC85818XmA interfaceC85818XmA = this.LJLILLLLZI;
                    if (interfaceC85818XmA != null) {
                        interfaceC85818XmA.LJJLL();
                        return;
                    }
                    return;
                }
                o.LJIJI("codeInputView");
                throw null;
            }
            o.LJIJI("errorText");
            throw null;
        }
        o.LJIJI("errorLayout");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85810Xm2(C29S activity, ViewStub viewStub, InterfaceC85818XmA authCallback) {
        super(activity, viewStub, authCallback);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(authCallback, "authCallback");
        this.LJLLL = new C85690Xk6(EnumC85691Xk7.SMS);
    }
}
