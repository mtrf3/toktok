package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ncz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59769Ncz extends C7OW {
    @Override // X.C7OW, X.C7OX
    public final C7OY LIZ(NI7 ni7) {
        ViewStub viewStub;
        if ((ni7 instanceof C59773Nd3) && (viewStub = ((C59773Nd3) ni7).LIZ) != null) {
            viewStub.setLayoutResource(R.layout.c1b);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            return new C59765Ncv((LinearLayout) inflate);
        }
        return null;
    }
}
