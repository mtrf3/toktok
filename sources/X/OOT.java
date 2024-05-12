package X;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* loaded from: classes11.dex */
public final class OOT implements View.OnClickListener {
    public final /* synthetic */ OOS LJLIL;

    public OOT(OOS oos) {
        this.LJLIL = oos;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OOS oos = this.LJLIL;
        if (oos.LJLJJL && oos.isShowing()) {
            OOS oos2 = this.LJLIL;
            if (!oos2.LJLJL) {
                TypedArray obtainStyledAttributes = oos2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                oos2.LJLJJLL = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                oos2.LJLJL = true;
            }
            if (oos2.LJLJJLL) {
                this.LJLIL.cancel();
            }
        }
    }
}
