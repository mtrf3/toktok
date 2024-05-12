package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Ghn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42231Ghn extends ConstraintLayout {
    public View LJLIL;
    public SY4 LJLILLLLZI;
    public boolean LJLJI;

    private final int getLayoutResId() {
        return R.layout.cdk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42231Ghn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SY4 sy4;
        a1.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(getLayoutResId(), C16880lQ.LLZIL(context), this);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(layoutResId, this)");
        this.LJLIL = LLLZIIL;
        this.LJLILLLLZI = (SY4) LLLZIIL.findViewById(R.id.fqf);
        if (!C58B.LIZ() || (sy4 = this.LJLILLLLZI) == null) {
            return;
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
        sy4.setBackground(c110614Vt.LIZ(context));
    }
}
