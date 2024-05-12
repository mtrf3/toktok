package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.4Gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106604Gi extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final int LJLILLLLZI;
    public final InterfaceC106584Gg LJLJJL;
    public final int LJLJL;
    public final ArrayList<C105454Bx> LJLJJI = new ArrayList<>();
    public final View LJLJJLL = null;
    public final int LJLIL = -1;
    public final boolean LJLJI = false;

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return R.layout.atj;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int i;
        int i2 = 0;
        if (this.LJLJJLL == null) {
            i = 0;
        } else {
            i = 1;
        }
        ArrayList<C105454Bx> arrayList = this.LJLJJI;
        if (arrayList != null) {
            i2 = arrayList.size();
        }
        return i2 + i;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof ViewOnClickListenerC106594Gh) {
            ViewOnClickListenerC106594Gh viewOnClickListenerC106594Gh = (ViewOnClickListenerC106594Gh) viewHolder;
            C105454Bx c105454Bx = (C105454Bx) ListProtector.get(this.LJLJJI, i);
            if (c105454Bx == null) {
                viewOnClickListenerC106594Gh.getClass();
            } else {
                viewOnClickListenerC106594Gh.LJLJJI = c105454Bx;
                if (!TextUtils.isEmpty(c105454Bx.LIZIZ)) {
                    viewOnClickListenerC106594Gh.LJLILLLLZI.setText(c105454Bx.LIZIZ);
                }
            }
            viewHolder.itemView.setContentDescription(((C105454Bx) ListProtector.get(this.LJLJJI, i)).LIZIZ);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        ViewOnClickListenerC106594Gh viewOnClickListenerC106594Gh = new ViewOnClickListenerC106594Gh(C28289B8j.LIZ(viewGroup, R.layout.atj, viewGroup, false), this.LJLJJL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJL);
        C0AX.LIZ(viewGroup, viewOnClickListenerC106594Gh.itemView, R.id.lj7);
        View view = viewOnClickListenerC106594Gh.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (viewOnClickListenerC106594Gh.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(ViewOnClickListenerC106594Gh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewOnClickListenerC106594Gh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(viewOnClickListenerC106594Gh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = ViewOnClickListenerC106594Gh.class.getName();
        return viewOnClickListenerC106594Gh;
    }

    public C106604Gi(InterfaceC106584Gg interfaceC106584Gg, int i, int i2) {
        this.LJLJJL = interfaceC106584Gg;
        this.LJLJL = i2;
        this.LJLILLLLZI = i;
    }
}
