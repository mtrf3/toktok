package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TeK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75140TeK extends AbstractC76219Tvj {
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C75140TeK(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LIZJ = interfaceC88472Yns;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfn, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …      false\n            )");
        return new C75139TeJ(LLLLIILL, this.LIZJ);
    }
}
