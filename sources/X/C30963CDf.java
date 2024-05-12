package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CDf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30963CDf extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final ViewGroup LJLIL;
    public final int LJLILLLLZI;
    public final SubscriptionPrivilegeDetailFragment LJLJI;
    public final List<EmoteModel> LJLJJI;
    public final float LJLJJL;
    public PopupWindow LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJI).size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        CDI cdi = (CDI) viewHolder;
        cdi.L(cdi, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        VA9 va9;
        o.LJIIIZ(viewGroup, "viewGroup");
        C30962CDe c30962CDe = new C30962CDe(this, viewGroup);
        View view = c30962CDe.itemView;
        int i2 = this.LJLILLLLZI;
        view.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
        View view2 = c30962CDe.itemView;
        if (view2 instanceof C47061t0) {
            va9 = (VA9) view2;
        } else {
            va9 = null;
        }
        V8L LIZIZ = V8L.LIZIZ(this.LJLJJL);
        LIZIZ.LIZIZ = false;
        C79077V1t c79077V1t = new C79077V1t(C15380j0.LJIIJ());
        c79077V1t.LJIILL = LIZIZ;
        V92 LIZ = c79077V1t.LIZ();
        if (va9 != null) {
            va9.setHierarchy(LIZ);
        }
        C0AX.LIZ(viewGroup, c30962CDe.itemView, R.id.lj7);
        View view3 = c30962CDe.itemView;
        if (view3 != null) {
            view3.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c30962CDe.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C30962CDe.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c30962CDe.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c30962CDe.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C30962CDe.class.getName();
        return c30962CDe;
    }

    public C30963CDf(ViewGroup parent, int i, SubscriptionPrivilegeDetailFragment fragment) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = parent;
        this.LJLILLLLZI = i;
        this.LJLJI = fragment;
        this.LJLJJI = new ArrayList();
        this.LJLJJL = C15380j0.LIZ(6.0f);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
        }
    }
}
