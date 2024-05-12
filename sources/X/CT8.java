package X;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import uw.c0;

/* loaded from: classes6.dex */
public final class CT8<MODEL extends c0<? extends CR6>> extends CSR<MODEL, CUU<MODEL>> {
    @Override // X.CSR
    public final int LJI() {
        return R.layout.dhm;
    }

    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "greeting_common";
    }

    @Override // X.CSR
    public final LayoutInflater LJII(LayoutInflater layoutInflater) {
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), C259710f.LIZ.LIZJ()));
        o.LJIIIIZZ(cloneInContext, "getDarkLayoutInflater(su…LayoutInflater(inflater))");
        return cloneInContext;
    }

    @Override // X.CSR
    public final CSF LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new CUU(itemView);
    }
}
