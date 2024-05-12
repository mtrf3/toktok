package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tem, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75168Tem extends AbstractC76219Tvj {
    public final InterfaceC88471Ynr<String, String, C76800UCe> LIZJ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZLLL;

    public C75168Tem(C75170Teo c75170Teo, C75172Teq c75172Teq) {
        super(1);
        this.LIZJ = c75172Teq;
        this.LIZLLL = c75170Teo;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfi, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new C76860UEm(LLLLIILL, this.LIZJ, this.LIZLLL);
    }
}
