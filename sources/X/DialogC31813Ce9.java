package X;

import android.content.Context;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ce9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC31813Ce9 extends DialogC38611fN {
    public CharSequence LJLILLLLZI;
    public T4W LJLJI;

    public DialogC31813Ce9(Context context) {
        super(context, R.style.lo);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        T4W t4w = new T4W(getContext());
        this.LJLJI = t4w;
        setContentView(t4w);
        this.LJLJI.setMessage(this.LJLILLLLZI);
    }
}
