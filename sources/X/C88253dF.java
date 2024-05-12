package X;

import Y.IDCListenerS202S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3dF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88253dF extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<AuthorizedScope> LJLIL = new ArrayList();

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (((AuthorizedScope) ListProtector.get(this.LJLIL, i)).getScopeRequired() != null && o.LJ(((AuthorizedScope) ListProtector.get(this.LJLIL, i)).getScopeRequired(), Boolean.TRUE)) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        if (holder instanceof C88263dG) {
            AuthorizedScope item = (AuthorizedScope) ListProtector.get(this.LJLIL, i);
            o.LJIIIZ(item, "item");
            ((C88263dG) holder).LJLILLLLZI.setText(item.getScopeDesc());
            return;
        }
        C88273dH c88273dH = (C88273dH) holder;
        AuthorizedScope item2 = (AuthorizedScope) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(item2, "item");
        c88273dH.LJLILLLLZI.setTitle(item2.getScopeDesc());
        AI2 ai2 = c88273dH.LJLJI;
        Boolean isEnabled = item2.isEnabled();
        if (isEnabled != null) {
            z = isEnabled.booleanValue();
        } else {
            z = true;
        }
        ai2.LJIILIIL(z);
        c88273dH.LJLJI.LJIILL(new IDCListenerS202S0100000_1(item2, 0));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder c88273dH;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            c88273dH = new C88263dG(C1FL.LIZIZ(parent, R.layout.cek, parent, false, "from(parent.context).inf…_required, parent, false)"));
        } else {
            c88273dH = new C88273dH(C1FL.LIZIZ(parent, R.layout.cel, parent, false, "from(parent.context).inf…th_toggle, parent, false)"));
        }
        C0AX.LIZ(parent, c88273dH.itemView, R.id.lj7);
        View view = c88273dH.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c88273dH.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c88273dH.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c88273dH.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c88273dH.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = c88273dH.getClass().getName();
        return c88273dH;
    }
}
