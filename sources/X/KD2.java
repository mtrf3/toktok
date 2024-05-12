package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KD2 extends KD0 {
    public final /* synthetic */ C51341KCz LIZJ;

    @Override // X.KD0
    public final RecyclerView.ViewHolder LIZIZ() {
        C51341KCz c51341KCz = this.LIZJ;
        InterfaceC51343KDb interfaceC51343KDb = c51341KCz.LIZIZ;
        ViewGroup viewGroup = c51341KCz.LIZ;
        interfaceC51343KDb.getClass();
        View v = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.chd, viewGroup, false);
        o.LJIIIIZZ(v, "v");
        return new KDH(v);
    }

    public KD2(C51341KCz c51341KCz) {
        this.LIZJ = c51341KCz;
    }
}
