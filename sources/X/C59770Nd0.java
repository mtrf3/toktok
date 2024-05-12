package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Nd0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59770Nd0 extends C7OW {
    @Override // X.C7OW, X.C7OX
    public final C7OY LIZ(NI7 ni7) {
        ViewStub viewStub;
        if ((ni7 instanceof C59772Nd2) && (viewStub = ((C59772Nd2) ni7).LIZ) != null) {
            viewStub.setLayoutResource(R.layout.bwr);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            return new OAB((LinearLayout) inflate);
        }
        return null;
    }
}
