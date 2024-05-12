package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBP extends LinearLayout {
    public final ImageView LJLIL;
    public final SY4 LJLILLLLZI;

    public final SY4 getBtnDismiss() {
        return this.LJLILLLLZI;
    }

    public final ImageView getIvClose() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBP(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        View inflate = View.inflate(context, R.layout.cmo, this);
        View findViewById = inflate.findViewById(R.id.f0h);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.iv_close)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.avu);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.btn_dismiss)");
        this.LJLILLLLZI = (SY4) findViewById2;
    }
}
