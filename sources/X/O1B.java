package X;

import Y.ACallableS34S1100000_7;
import Y.AgS85S0101000_2;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;

/* loaded from: classes11.dex */
public final class O1B implements View.OnClickListener {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (Build.VERSION.SDK_INT < 33 && C04330Ez.LIZ(this.LJLIL, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            C61115Nyh.LIZIZ(C27740Aue.LIZ(this.LJLIL), TokenCert.with("bpea-hybrid_webview_image_longpress_saveimages"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new O1C(this));
        } else {
            C10K.LIZJ(new ACallableS34S1100000_7(this.LJLIL, this.LJLILLLLZI, 4)).LJ(new AgS85S0101000_2(0, this.LJLIL, 0), C10K.LJIIIIZZ, null);
        }
    }

    public O1B(Context context, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
    }
}
