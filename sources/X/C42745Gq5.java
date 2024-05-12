package X;

import Y.ACListenerS42S0200000_7;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Gq5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42745Gq5 extends AbstractC42769GqT<AnchorModule, C42746Gq6> {
    public C42745Gq5(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        C42746Gq6 holder = (C42746Gq6) viewHolder;
        AnchorModule module = (AnchorModule) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(module, "module");
        TextView textView = holder.LJLILLLLZI;
        if (TextUtils.isEmpty(module.name)) {
            str = textView.getContext().getString(R.string.dn7);
        } else {
            str = module.name;
        }
        textView.setText(str);
        TextView textView2 = holder.LJLIL;
        C42745Gq5 c42745Gq5 = holder.LJLJI;
        ArrayList<AnchorCell> arrayList = module.cells;
        int i = 0;
        if (arrayList == null || arrayList.size() <= 3) {
            i = 4;
        }
        textView2.setVisibility(i);
        C16880lQ.LJIJI(textView2, new ACListenerS42S0200000_7(c42745Gq5, module, 50));
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bb6, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…ently_add, parent, false)");
        return new C42746Gq6(this, LLLLIILL);
    }
}
