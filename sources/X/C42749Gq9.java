package X;

import Y.ARunnableS20S0200000_1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gq9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42749Gq9 extends AbstractC42769GqT<AnchorModule, RecyclerView.ViewHolder> {
    public C42749Gq9(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder holder, Object module) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(module, "module");
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        final View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb8, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…end_empty, parent, false)");
        return new RecyclerView.ViewHolder(LLLLIILL) { // from class: X.3eD
            {
                super(LLLLIILL);
                LLLLIILL.post(new ARunnableS20S0200000_1(LLLLIILL, this, 57));
            }
        };
    }
}
