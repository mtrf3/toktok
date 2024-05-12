package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SHU {
    public final Context LIZ;
    public final C25860ACy LIZIZ;
    public final TuxTextView LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C73318Sq2 LJFF;
    public String LJI;

    public SHU(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        String string = context.getString(R.string.cbn);
        o.LJIIIIZZ(string, "context.getString(R.stri…age_account_verification)");
        this.LIZIZ = C77273UUj.LIZ(string, new ACListenerS32S0100000_12(this, 195));
        boolean z = false;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(41);
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context2));
        this.LIZJ = tuxTextView;
        String LIZJ = C31461Li.LIZJ("blue_v_verification_setting_url", "", "getInstance().getStringV…onExperiment::class.java)");
        this.LIZLLL = LIZJ;
        if (!((RBY) HG3.LJIILL()).isChildrenMode() && LIZJ.length() > 0) {
            z = true;
        }
        this.LJ = z;
        this.LJFF = new C73318Sq2();
        this.LJI = "unknown";
    }

    public final void LIZ(String str) {
        String str2;
        this.LJI = str;
        if (o.LJ(str, "under_assessment")) {
            str2 = this.LIZ.getString(R.string.cbo);
        } else if (o.LJ(str, "verified")) {
            str2 = this.LIZ.getString(R.string.cbp);
        } else {
            str2 = "";
        }
        o.LJIIIIZZ(str2, "when (value) {\n         … else -> \"\"\n            }");
        this.LIZJ.setText(str2);
        C77273UUj.LIZLLL(this.LIZIZ, this.LIZJ, null);
    }
}
