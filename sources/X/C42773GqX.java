package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GqX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42773GqX extends AbstractC42769GqT<String, C42772GqW> {
    public C42776Gqa LIZLLL;

    public C42773GqX(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C42772GqW holder = (C42772GqW) viewHolder;
        String name = (String) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(name, "name");
        holder.LJLIL.setText(name);
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb9, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…h_history, parent, false)");
        return new C42772GqW(this, LLLLIILL);
    }
}
