package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS70S0201000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GAe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41076GAe extends AbstractC029409q<C41078GAg> {
    public final List<Integer> LJLIL;
    public int LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final InterfaceC41079GAh LJLJJI;
    public RecyclerView LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<Integer> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJL = recyclerView;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C41078GAg c41078GAg, int i) {
        int i2;
        C41078GAg holder = c41078GAg;
        o.LJIIIZ(holder, "holder");
        AI8 ai8 = holder.LJLIL;
        Context LIZ = C5L7.LIZ();
        List<Integer> list = this.LJLIL;
        boolean z = false;
        if (list != null) {
            i2 = ((Number) ListProtector.get(list, i)).intValue();
        } else {
            i2 = 0;
        }
        ai8.setTitle(LIZ.getString(i2));
        if (i == 2) {
            holder.LJLIL.setSubtitle(C44172HVg.LIZ.getString(R.string.chq));
        } else {
            holder.LJLIL.setSubtitle(null);
        }
        AI9 accessory = holder.LJLIL.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        AEY aey = (AEY) accessory;
        if (this.LJLILLLLZI == i) {
            z = true;
        }
        aey.LJIILIIL(z);
        AI9 accessory2 = holder.LJLIL.getAccessory();
        o.LJII(accessory2, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        ((AEY) accessory2).LJIILJJIL(new AqS70S0201000_7(this, i, holder, 1));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C41078GAg com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C41078GAg c41078GAg = new C41078GAg(C1FL.LIZIZ(parent, R.layout.beh, parent, false, "from(parent.context).inf…ext_radio, parent, false)"));
        C0AX.LIZ(parent, c41078GAg.itemView, R.id.lj7);
        View view = c41078GAg.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c41078GAg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C41078GAg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c41078GAg.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c41078GAg.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C41078GAg.class.getName();
        return c41078GAg;
    }

    public C41076GAe(List list, int i, ActivityC45651qj context, C41080GAi c41080GAi) {
        o.LJIIIZ(context, "context");
        this.LJLIL = list;
        this.LJLILLLLZI = i;
        this.LJLJI = context;
        this.LJLJJI = c41080GAi;
    }
}
