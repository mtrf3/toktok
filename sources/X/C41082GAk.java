package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserSettingsActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GAk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41082GAk extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final InterfaceC41084GAm LJLIL;
    public List<AdvertiserModel> LJLILLLLZI = new ArrayList();
    public final String LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C41082GAk(Context context, AdvertiserSettingsActivity advertiserSettingsActivity) {
        this.LJLIL = advertiserSettingsActivity;
        String string = context.getString(R.string.i4);
        o.LJIIIIZZ(string, "context.getString(R.stri…dv_settings_blocked_text)");
        this.LJLJI = string;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        C41083GAl c41083GAl = (C41083GAl) holder;
        c41083GAl.LJLIL.setTitle(((AdvertiserModel) ListProtector.get(this.LJLILLLLZI, i)).getAdvName());
        AI9 accessory = c41083GAl.LJLIL.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AEY aey = (AEY) accessory;
        Integer advStatus = ((AdvertiserModel) ListProtector.get(this.LJLILLLLZI, i)).getAdvStatus();
        if (advStatus == null || advStatus.intValue() != 1) {
            aey.LJIILIIL(false);
            c41083GAl.LJLIL.setSubtitle(this.LJLJI);
        } else {
            aey.LJIILIIL(true);
            c41083GAl.LJLIL.setSubtitle(null);
        }
        aey.LJIILJJIL(new AqS107S0101000_7(this, i, 5));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bb1, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C41083GAl c41083GAl = new C41083GAl(view);
        C0AX.LIZ(viewGroup, c41083GAl.itemView, R.id.lj7);
        View view2 = c41083GAl.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c41083GAl.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C41083GAl.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c41083GAl.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c41083GAl.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C41083GAl.class.getName();
        return c41083GAl;
    }
}
