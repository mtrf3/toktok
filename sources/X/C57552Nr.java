package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.2Nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57552Nr {
    public final View LIZ;
    public final TextView LIZIZ;
    public ViewGroup LIZJ;

    public C57552Nr(Context context) {
        o.LJIIIZ(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bnq, C16880lQ.LLZIL(context), null);
        this.LIZIZ = (TextView) LLLZIIL.findViewById(R.id.m2v);
        View findViewById = LLLZIIL.findViewById(R.id.j5n);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.ddr);
        }
        this.LIZ = LLLZIIL;
    }
}
