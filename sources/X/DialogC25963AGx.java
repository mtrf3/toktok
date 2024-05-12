package X;

import Y.ACListenerS24S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* renamed from: X.AGx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC25963AGx extends AGF implements G27 {
    public final int LJLILLLLZI;

    @Override // X.AGF
    public final void LIZ() {
        String string;
        if (o.LJ(AccountService.LJIJ().LJIILL(), "TR")) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            TuxTextView tv_msg = (TuxTextView) findViewById(R.id.mbf);
            o.LJIIIIZZ(tv_msg, "tv_msg");
            C251959uh.LIZ(context, tv_msg, new ACListenerS24S0100000_4(this, 336), new ACListenerS24S0100000_4(this, 337), R.string.t5f);
        } else if (o.LJ(AccountService.LJIJ().LJIILL(), "CO")) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            TuxTextView tv_msg2 = (TuxTextView) findViewById(R.id.mbf);
            o.LJIIIIZZ(tv_msg2, "tv_msg");
            C251959uh.LIZ(context2, tv_msg2, new ACListenerS24S0100000_4(this, 338), new ACListenerS24S0100000_4(this, 339), R.string.due);
        } else if (!this.LJLIL) {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            TuxTextView tv_msg3 = (TuxTextView) findViewById(R.id.mbf);
            o.LJIIIIZZ(tv_msg3, "tv_msg");
            C251959uh.LIZ(context3, tv_msg3, new ACListenerS24S0100000_4(this, 340), new ACListenerS24S0100000_4(this, 341), R.string.dud);
        } else {
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            TextView tv_msg4 = (TextView) findViewById(R.id.mbf);
            o.LJIIIIZZ(tv_msg4, "tv_msg");
            ACListenerS24S0100000_4 aCListenerS24S0100000_4 = new ACListenerS24S0100000_4(this, 342);
            ACListenerS24S0100000_4 aCListenerS24S0100000_42 = new ACListenerS24S0100000_4(this, 343);
            ACListenerS24S0100000_4 aCListenerS24S0100000_43 = new ACListenerS24S0100000_4(this, 344);
            String string2 = context4.getString(R.string.dua);
            String LIZIZ = OKG.LIZIZ(string2, "context.getString(R.stri…tbox_link_termsofservice)", context4, R.string.du_, "context.getString(R.stri…ntbox_link_privacypolicy)");
            String string3 = context4.getString(R.string.du9);
            o.LJIIIIZZ(string3, "context.getString(R.stri…ntbox_link_cookiespolicy)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context4.getString(R.string.duc, string2, LIZIZ, string3));
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.d4, context4);
            C251949ug c251949ug = new C251949ug(LJIIIIZZ, aCListenerS24S0100000_4);
            C251949ug c251949ug2 = new C251949ug(LJIIIIZZ, aCListenerS24S0100000_42);
            C251949ug c251949ug3 = new C251949ug(LJIIIIZZ, aCListenerS24S0100000_43);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
            int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder2, string2, 0, false, 6);
            int LJJLIIIJL2 = s.LJJLIIIJL(spannableStringBuilder2, LIZIZ, 0, false, 6);
            int LJJLIIIJL3 = s.LJJLIIIJL(spannableStringBuilder2, string3, 0, false, 6);
            if (LJJLIIIJL >= 0) {
                spannableStringBuilder.setSpan(c251949ug, LJJLIIIJL, string2.length() + LJJLIIIJL, 34);
            }
            if (LJJLIIIJL2 >= 0) {
                spannableStringBuilder.setSpan(c251949ug2, LJJLIIIJL2, LIZIZ.length() + LJJLIIIJL2, 34);
            }
            if (LJJLIIIJL3 >= 0) {
                spannableStringBuilder.setSpan(c251949ug3, LJJLIIIJL3, string3.length() + LJJLIIIJL3, 34);
            }
            tv_msg4.setHighlightColor(C04330Ez.LIZIZ(context4, R.color.cz));
            tv_msg4.setText(spannableStringBuilder);
            tv_msg4.setMovementMethod(LinkMovementMethod.getInstance());
            if (AGI.LIZ()) {
                LIZJ("cookie-policy");
            }
        }
        TextView textView = (TextView) findViewById(R.id.auo);
        if (o.LJ(AccountService.LJIJ().LJIILL(), "TR")) {
            string = getContext().getString(R.string.t5e);
        } else {
            string = getContext().getString(R.string.dub);
        }
        textView.setText(string);
        if (!AGI.LIZ()) {
            return;
        }
        LIZJ("terms-of-use");
        LIZJ("privacy-policy");
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(KL2.LJIIJJI(getContext()) - (this.LJLILLLLZI * 2), -2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC25963AGx(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = (int) KL2.LIZJ(C58725N2z.LIZ(), 20.0f);
        C9XU.LIZ(context.hashCode(), this);
    }

    public static final void LIZJ(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZ(new O0X(AGJ.CONSENT_BOX_ROW_OLD.getValue(), str, false, false, 28));
        }
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = (int) KL2.LIZJ(getContext(), newConfig.screenWidthDp - 20.0f);
            }
            if (window == null) {
                return;
            }
            window.setAttributes(attributes);
        }
    }
}
