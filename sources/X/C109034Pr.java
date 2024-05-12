package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109034Pr extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final SharePanelViewModel LJLIL;
    public final C4OT LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final List<Integer> LJLJJI;
    public final List<Integer> LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public final List<IMContact> getData() {
        return (List) this.LJLJJLL.getValue();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return getData().size();
    }

    public C109034Pr(SharePanelViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = null;
        this.LJLJI = C221108m2.LIZIZ(C4QQ.LJLIL);
        this.LJLJJI = new ArrayList();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = C221108m2.LIZIZ(C4QF.LJLIL);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(getData(), i);
        if (obj instanceof C108724Om) {
            return 2;
        }
        if (obj instanceof C4QH) {
            return 3;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setData(List<? extends IMContact> list) {
        Integer num;
        getData().clear();
        if (list == null) {
            if (C4VT.LIZJ()) {
                int i = 0;
                do {
                    getData().add(this.LJLJI.getValue());
                    i++;
                } while (i < 3);
            }
        } else if (!list.isEmpty()) {
            getData().addAll(list);
            getData().add(new C108724Om());
        }
        notifyDataSetChanged();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setData: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        LIZ.append(getData().size());
        C34B.LIZIZ("DownloadShareListAdapter", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o.LJIIIZ(viewHolder, "viewHolder");
        if (viewHolder instanceof C109054Pt) {
            ((C109054Pt) viewHolder).L((IMContact) ListProtector.get(getData(), i), this.LJLIL);
            return;
        }
        if (!(viewHolder instanceof C108904Pe)) {
            return;
        }
        ((C108904Pe) viewHolder).L((IMContact) ListProtector.get(getData(), i), i, ((ArrayList) this.LJLJJI).contains(Integer.valueOf(i)), ((ArrayList) this.LJLJJL).contains(Integer.valueOf(i)), this.LJLIL, null, null, null);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder LIZ;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (i != 2) {
            if (i != 3) {
                LIZ = C108934Ph.LIZ(parent, this.LJLIL, this.LJLILLLLZI, true, false);
            } else {
                LIZ = C4Q1.LIZ(parent);
            }
        } else {
            LIZ = C109084Pw.LIZ(parent, this.LJLIL, false);
        }
        C0AX.LIZ(parent, LIZ.itemView, R.id.lj7);
        View view = LIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LIZ.getClass().getName();
        return LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        C108904Pe c108904Pe;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
        } else {
            if (!(holder instanceof C108904Pe) || (c108904Pe = (C108904Pe) holder) == null) {
                return;
            }
            Object obj = ListProtector.get(payloads, 0);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
            c108904Pe.Q(((Boolean) obj).booleanValue());
        }
    }
}
