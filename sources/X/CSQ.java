package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import uw.c0;

/* loaded from: classes6.dex */
public final class CSQ<MODEL extends c0<? extends CR6>> extends CSR<MODEL, CSE<MODEL>> {
    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "common";
    }

    @Override // X.CSR
    public final int LJI() {
        if (LJIIIZ().LIZLLL) {
            return R.layout.dhl;
        }
        return R.layout.dhn;
    }

    @Override // X.CSR
    public final CSF LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new CSE(itemView);
    }
}
