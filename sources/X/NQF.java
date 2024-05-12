package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NQF extends C7OW {
    @Override // X.C7OW, X.C7OX
    public final C7OY LIZ(NI7 ni7) {
        ViewStub viewStub;
        if ((ni7 instanceof NQD) && (viewStub = ((NQD) ni7).LJFF) != null) {
            viewStub.setLayoutResource(R.layout.bc5);
            View inflate = viewStub.inflate();
            o.LJII(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            return new C59393NSr((LinearLayout) inflate);
        }
        return null;
    }
}
