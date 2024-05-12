package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TtL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76071TtL extends AbstractC76212Tvc {
    public final InterfaceC75774ToY LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76071TtL(InterfaceC75774ToY container) {
        super(0);
        o.LJIIIZ(container, "container");
        this.LIZJ = container;
        this.LIZLLL = true;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d95, parent, false);
        o.LJIIIIZZ(it, "it");
        C76074TtO c76074TtO = new C76074TtO(it);
        C76070TtK.LJJIFFI(c76074TtO);
        C2A7 LLLLLLLZIL = c76074TtO.LLLLLLLZIL();
        if (LLLLLLLZIL != null) {
            C75770ToU.LIZJ(LLLLLLLZIL, this.LIZJ, this.LIZLLL);
        }
        return c76074TtO;
    }
}
