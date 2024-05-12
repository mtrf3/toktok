package X;

import Y.ACListenerS21S0101000_2;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.W1t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC81625W1t extends Dialog {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public C81626W1u LJLIL;

    public DialogC81625W1t(Context context) {
        super(context, R.style.a50);
    }

    public static DialogC81625W1t LIZ(Context context) {
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://support.tiktok.com/");
        LIZ.append(UZF.LIZ());
        LIZ.append("/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok");
        c81626W1u.LIZ = X1D.LIZIZ(LIZ);
        return c81626W1u.LIZ(context);
    }

    public static DialogC81625W1t LIZIZ(Context context) {
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        c81626W1u.LIZ = UZF.LIZIZ("privacy-policy");
        return c81626W1u.LIZ(context);
    }

    public static DialogC81625W1t LIZJ(ActivityC45651qj activityC45651qj) {
        C81626W1u c81626W1u = new C81626W1u();
        UZF.LIZ.getClass();
        c81626W1u.LIZ = UZF.LIZIZ("terms-of-use");
        return c81626W1u.LIZ(activityC45651qj);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getWindow() != null) {
            if (C60178Nja.LIZIZ(getContext())) {
                getWindow().clearFlags(1024);
            }
            getWindow().requestFeature(1);
        }
        try {
            setContentView(R.layout.ny);
        } catch (Resources.NotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(-1, -1);
        }
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        this.LJLIL.getClass();
        if (!TextUtils.isEmpty(null)) {
            this.LJLIL.getClass();
            textView.setText((CharSequence) null);
        } else {
            textView.setText(R.string.c2h);
        }
        C16880lQ.LJIIJ(new ACListenerS21S0101000_2(0, this, 2), findViewById(R.id.aej));
        WebView webView = (WebView) findViewById(R.id.nie);
        webView.getSettings().setJavaScriptEnabled(true);
        C16880lQ.LLZLI(webView, new WebViewClient());
        C16880lQ.LLZZ(webView, this.LJLIL.LIZ);
    }
}
