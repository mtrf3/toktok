package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.view.hub.ProfileNaviSwitcherBottomSheet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.B9m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28318B9m extends AbstractC029409q<C70645Ro1> {
    public final List<ProfileNaviDataModel> LJLIL;
    public final InterfaceC28320B9o LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size() + 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C70645Ro1 c70645Ro1, int i) {
        C70645Ro1 holder = c70645Ro1;
        o.LJIIIZ(holder, "holder");
        if (i == 0) {
            holder.L(null, 0, this.LJLILLLLZI, this.LJLJI);
        } else {
            holder.L((ProfileNaviDataModel) ListProtector.get(this.LJLIL, i - 1), 1, this.LJLILLLLZI, this.LJLJI);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C70645Ro1 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View view;
        o.LJIIIZ(parent, "parent");
        if (i == 0) {
            view = C28289B8j.LIZ(parent, R.layout.c7i, parent, false);
        } else {
            view = C28289B8j.LIZ(parent, R.layout.c7j, parent, false);
        }
        o.LJIIIIZZ(view, "view");
        C70645Ro1 c70645Ro1 = new C70645Ro1(view);
        C0AX.LIZ(parent, c70645Ro1.itemView, R.id.lj7);
        View view2 = c70645Ro1.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c70645Ro1.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C70645Ro1.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c70645Ro1.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c70645Ro1.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C70645Ro1.class.getName();
        return c70645Ro1;
    }

    public C28318B9m(List list, ProfileNaviSwitcherBottomSheet profileNaviSwitcherBottomSheet, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = profileNaviSwitcherBottomSheet;
        this.LJLJI = z;
    }
}
