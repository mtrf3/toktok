package X;

import android.content.Context;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bde, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractDialogC29234Bde extends DialogC38611fN {
    public boolean LJLILLLLZI;

    public abstract int LJJIIJ();

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LJLILLLLZI = true;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLILLLLZI = false;
    }

    public AbstractDialogC29234Bde(Context context) {
        super(context, R.style.ab9);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C16880lQ.LLLZIIL(LJJIIJ(), C16880lQ.LLZIL(getContext()), null));
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
    }
}
