package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TtM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76072TtM extends AbstractC76212Tvc {
    public final InterfaceC75774ToY LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76072TtM(InterfaceC75774ToY container) {
        super(0);
        o.LJIIIZ(container, "container");
        this.LIZJ = container;
        this.LIZLLL = true;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d96, parent, false);
        o.LJIIIIZZ(it, "it");
        C76073TtN c76073TtN = new C76073TtN(this, it);
        C76070TtK.LJJIFFI(c76073TtN);
        return c76073TtN;
    }
}
