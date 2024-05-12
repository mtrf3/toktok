package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CTC extends CSR<CTF<? extends CR6>, CTD> {
    @Override // X.CSR
    public final int LJI() {
        return R.layout.di9;
    }

    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "action";
    }

    @Override // X.CSR
    public final CTD LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new CTD(itemView);
    }
}
