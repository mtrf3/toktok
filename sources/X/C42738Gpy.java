package X;

import Y.ACListenerS33S0300000_7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gpy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42738Gpy extends AbstractC42769GqT<LiveEventModule, C42739Gpz> {
    public C42738Gpy(InterfaceC42726Gpm interfaceC42726Gpm, String str) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C42739Gpz holder = (C42739Gpz) viewHolder;
        LiveEventModule module = (LiveEventModule) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(module, "module");
        W5F LJ = W5U.LJ(R.drawable.b9e);
        LJ.LJJIIJ = holder.LJLIL;
        C16880lQ.LLJJJ(LJ);
        holder.LJLILLLLZI.setText(module.title);
        holder.LJLJI.setText(C86036Xpg.LJI(module.startTime));
        holder.LJLJJI.setChecked(module.LIZ);
        if (module.LIZIZ) {
            holder.LJLJJL.setVisibility(8);
        }
        C16880lQ.LJIIJ(new ACListenerS33S0300000_7(holder, module, holder.LJLJJLL, 2), holder.itemView);
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb4, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…ive_event, parent, false)");
        return new C42739Gpz(this, LLLLIILL);
    }
}
