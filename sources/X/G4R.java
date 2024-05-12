package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AqS59S1100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G4R implements View.OnLongClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C82733WdV LJLILLLLZI;

    public G4R(String str, C82733WdV c82733WdV) {
        this.LJLIL = str;
        this.LJLILLLLZI = c82733WdV;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZIZ(this.LJLIL);
        UC0.LIZJ(c26227ARb, new AqS59S1100000_6(this.LJLIL, this.LJLILLLLZI, 1));
        c26227ARb.LJI().LIZLLL();
        return true;
    }
}
