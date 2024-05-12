package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class BEP {
    public final Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;

    public BEP(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
    }

    public static BEP LIZ(Context context) {
        BEP bep = new BEP(context);
        TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.de6, C16880lQ.LLZIL(context), null);
        textView.setText(R.string.soj);
        bep.LIZJ = textView;
        TextView textView2 = (TextView) C16880lQ.LLLZIIL(R.layout.de5, C16880lQ.LLZIL(context), null);
        textView2.setText(R.string.sur);
        bep.LIZIZ = textView2;
        TextView textView3 = (TextView) C16880lQ.LLLZIIL(R.layout.de5, C16880lQ.LLZIL(context), null);
        textView3.setText(R.string.soq);
        C16880lQ.LJIIJ(null, textView3);
        bep.LIZLLL = textView3;
        return bep;
    }
}
