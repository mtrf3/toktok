package X;

import Y.IDCListenerS142S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253199wh extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final TuxSingleSelectionSheet LJLIL;
    public final List<C253179wf> LJLILLLLZI;
    public final int LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        C253179wf c253179wf = (C253179wf) ListProtector.get(this.LJLILLLLZI, i);
        View view = holder.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
        AI8 ai8 = (AI8) view;
        ai8.setTitle(c253179wf.LIZ);
        ai8.setSubtitle(c253179wf.LIZIZ);
        AI9 accessory = ai8.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        AEY aey = (AEY) accessory;
        if (this.LJLJI == i) {
            z = true;
        } else {
            z = false;
        }
        aey.LJIILIIL(z);
        aey.LJIILL(new IDCListenerS142S0200000_4(this, c253179wf, 0));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        final AI8 ai8 = new AI8(context, null, 6);
        ai8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        ai8.setAccessory(new C25991AHz(context2));
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(ai8) { // from class: X.9wi
        };
        C0AX.LIZ(parent, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C253209wi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C253209wi.class.getName();
        return viewHolder;
    }

    public C253199wh(TuxSingleSelectionSheet sheet, List<C253179wf> list, int i) {
        o.LJIIIZ(sheet, "sheet");
        this.LJLIL = sheet;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
    }
}
