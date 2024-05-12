package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gq3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42743Gq3 extends AbstractC42769GqT<AnchorCell, C42744Gq4> {
    public C42743Gq3(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        C42744Gq4 holder = (C42744Gq4) viewHolder;
        AnchorCell cell = (AnchorCell) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(cell, "cell");
        C119654mn c119654mn = holder.LJLIL;
        AnchorIcon anchorIcon = cell.icon;
        if (anchorIcon != null) {
            str = anchorIcon.uri;
        } else {
            str = null;
        }
        C78765Uvh.LJIIIZ(c119654mn, str, -1, -1);
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb3, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…tion_icon, parent, false)");
        return new C42744Gq4(this, LLLLIILL);
    }
}
