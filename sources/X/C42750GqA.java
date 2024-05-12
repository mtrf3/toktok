package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GqA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42750GqA extends AbstractC42769GqT<AnchorModule, C42755GqF> {
    public C42750GqA(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C42755GqF holder = (C42755GqF) viewHolder;
        AnchorModule module = (AnchorModule) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(module, "module");
        if (TextUtils.isEmpty(module.name)) {
            holder.LJLIL.setVisibility(8);
        } else {
            holder.LJLIL.setVisibility(0);
            holder.LJLIL.setText(module.name);
        }
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb7, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…mmend_add, parent, false)");
        return new C42755GqF(this, LLLLIILL);
    }
}
