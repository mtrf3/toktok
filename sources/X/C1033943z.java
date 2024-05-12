package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.43z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1033943z {
    public final View LIZ;
    public TuxTextView LIZIZ;
    public C252709vu LIZJ;
    public AqS151S0100000_1 LIZLLL;
    public C1033843y LJ;

    public C1033943z(Activity activity, View view) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = view;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.drs);
        this.LIZIZ = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText(activity.getString(R.string.sld));
        }
        this.LIZJ = (C252709vu) view.findViewById(R.id.b_5);
        this.LJ = (C1033843y) view.findViewById(R.id.i7c);
        TuxTextView tuxTextView2 = this.LIZIZ;
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS21S0100000_1(this, 198));
        }
    }
}
