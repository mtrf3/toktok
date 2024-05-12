package X;

import Y.ACListenerS36S0100000_16;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Z9g, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89464Z9g extends C6DA {
    @Override // X.C6DA
    public final View LJFF() {
        LinearLayout LIZLLL = LIZLLL();
        LinearLayout LIZIZ = LIZIZ(R.drawable.t9, R.string.e43);
        C16880lQ.LJIIZILJ(LIZIZ, new ACListenerS36S0100000_16(this, 0));
        LIZLLL.addView(LIZIZ);
        LinearLayout LIZIZ2 = LIZIZ(R.drawable.ay0, R.string.bxf);
        C16880lQ.LJIIZILJ(LIZIZ2, new ACListenerS36S0100000_16(this, 1));
        LIZLLL.addView(LIZIZ2);
        return LIZLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89464Z9g(View contentView, C1552567l c1552567l) {
        super(contentView, c1552567l);
        o.LJIIIZ(contentView, "contentView");
    }
}
