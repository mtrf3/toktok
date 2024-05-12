package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.9y4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class DialogC254049y4 extends Dialog {
    public final int LJLIL;
    public final int LJLILLLLZI;

    static {
        KL2.LIZJ(((AbstractC247499nV) C95J.LIZ(0)).LJ(), 20.0f);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(this.LJLIL, this.LJLILLLLZI);
    }

    public DialogC254049y4(Context context) {
        super(context, R.style.a96);
        requestWindowFeature(1);
        this.LJLIL = -1;
        this.LJLILLLLZI = -1;
    }
}
