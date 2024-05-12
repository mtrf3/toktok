package X;

import Y.ACListenerS32S0101000_15;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class AE8 extends Dialog {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public AE7 LJLIL;

    public AE8(Context context) {
        super(context, R.style.a_j);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().addFlags(67108864);
        setContentView(R.layout.clg);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        ((TextView) findViewById(R.id.title)).setText(R.string.a80);
        C16880lQ.LJIIJ(new ACListenerS32S0101000_15(3, this, 12), findViewById(R.id.aej));
        C16880lQ.LLZZ((WebView) findViewById(R.id.nie), this.LJLIL.LIZ);
    }
}
