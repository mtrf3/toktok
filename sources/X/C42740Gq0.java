package X;

import Y.ACListenerS42S0200000_7;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Gq0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42740Gq0 extends AbstractC42769GqT<AnchorCell, C42741Gq1> {
    public final String LIZLLL;

    public C42740Gq0(InterfaceC42726Gpm interfaceC42726Gpm, String str) {
        super(interfaceC42726Gpm);
        this.LIZLLL = str;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        ArrayList<String> arrayList;
        C42741Gq1 holder = (C42741Gq1) viewHolder;
        AnchorCell cell = (AnchorCell) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(cell, "cell");
        AnchorIcon anchorIcon = cell.icon;
        if (anchorIcon == null || (arrayList = anchorIcon.urlList) == null || (str = (String) ListProtector.get(arrayList, 0)) == null) {
            str = "";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJJIIJ = holder.LJLIL;
        C16880lQ.LLJJJ(LJIIIIZZ);
        holder.LJLILLLLZI.setText(cell.title);
        C16880lQ.LJJIZ(holder.LJLJI, new ACListenerS42S0200000_7(cell, holder.LJLJJI, 51));
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb5, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…hor_movie, parent, false)");
        return new C42741Gq1(this, LLLLIILL);
    }
}
