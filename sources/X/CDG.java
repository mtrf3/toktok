package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscribeNoticeDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public final class CDG extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final SubscriptionPrivilegeDetailFragment LJLIL;
    public final List<CDP> LJLILLLLZI;
    public GetSubPrivilegeDetailResponse.Data LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public CDG(SubscriptionPrivilegeDetailFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = fragment;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJI = "";
        this.LJLJJL = "";
        this.LJLJL = "";
        this.LJLJLJ = "";
    }

    public final void LJLLLLLL(String str) {
        FragmentManager fragmentManager = this.LJLIL.getFragmentManager();
        if (fragmentManager != null) {
            SubscribeNoticeDialog subscribeNoticeDialog = new SubscribeNoticeDialog();
            subscribeNoticeDialog.LJLIL = str;
            subscribeNoticeDialog.show(fragmentManager, "SubscribeNoticeDialog");
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((CDP) ListProtector.get(this.LJLILLLLZI, i)).LIZ;
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
        RecyclerView.ViewHolder cd7;
        o.LJIIIZ(viewGroup, "viewGroup");
        switch (i) {
            case -6:
                cd7 = new CD7(this, viewGroup);
                break;
            case -5:
                cd7 = new CDB(this, viewGroup);
                break;
            case -4:
                cd7 = new CDO(this, viewGroup);
                break;
            case -3:
                cd7 = new CD8(this, viewGroup);
                break;
            case -2:
                cd7 = new CDM(this, viewGroup);
                break;
            case -1:
                cd7 = new CDV(this, viewGroup);
                break;
            case 0:
            case 3:
            default:
                cd7 = new CD8(this, viewGroup);
                break;
            case 1:
                cd7 = new C30975CDr(viewGroup, this.LJLJI, this.LJLIL);
                break;
            case 2:
                cd7 = new CDS(viewGroup, this.LJLJI, this.LJLIL);
                break;
            case 4:
                cd7 = new CDH(viewGroup);
                break;
            case 5:
                cd7 = new CDE(this, viewGroup);
                break;
            case 6:
                cd7 = new CDD(this, viewGroup);
                break;
            case 7:
                cd7 = new CDK(this, viewGroup);
                break;
            case 8:
                cd7 = new C30961CDd(this, viewGroup);
                break;
        }
        C0AX.LIZ(viewGroup, cd7.itemView, R.id.lj7);
        View view = cd7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (cd7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(cd7.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cd7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(cd7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = cd7.getClass().getName();
        return cd7;
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
