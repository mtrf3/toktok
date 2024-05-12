package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KD1 extends KD0 {
    public final /* synthetic */ C51341KCz LIZJ;

    @Override // X.KD0
    public final RecyclerView.ViewHolder LIZIZ() {
        C51341KCz c51341KCz = this.LIZJ;
        InterfaceC51343KDb interfaceC51343KDb = c51341KCz.LIZIZ;
        ViewGroup parent = c51341KCz.LIZ;
        interfaceC51343KDb.getClass();
        o.LJIIIZ(parent, "parent");
        return new KD8(C1FL.LIZIZ(parent, R.layout.cgk, parent, false, "from(parent.context)\n   …sug_title, parent, false)"));
    }

    public KD1(C51341KCz c51341KCz) {
        this.LIZJ = c51341KCz;
    }
}
