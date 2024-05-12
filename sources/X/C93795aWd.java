package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;

/* renamed from: X.aWd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93795aWd extends FrameLayout {
    public final C94195ad5 LJLIL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLILLLLZI;

    public C93795aWd(Context context) {
        super(context, null, 0);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dvf, this, false);
        addView(LLLLIILL);
        int i = R.id.f51;
        C94163acZ c94163acZ = (C94163acZ) LLLLIILL.findViewById(R.id.f51);
        if (c94163acZ != null) {
            i = R.id.nq2;
            TextView textView = (TextView) LLLLIILL.findViewById(R.id.nq2);
            if (textView != null) {
                i = R.id.nqa;
                View findViewById = LLLLIILL.findViewById(R.id.nqa);
                if (findViewById != null) {
                    LinearLayout linearLayout = (LinearLayout) LLLLIILL;
                    this.LJLIL = new C94195ad5(linearLayout, c94163acZ, textView, findViewById);
                    C93750aVu.LIZ(linearLayout, 800L, new IDqS419S0100000_42(this, 71));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }
}
