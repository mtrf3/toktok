package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4PW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PW extends C109004Po {
    public final Context LJLLLLLL;
    public final InterfaceC113814dN LJLZ;
    public final SharePanelViewModel LJZ;
    public final C62822Ol8 LJZI;
    public LifecycleOwner LJZL;

    public final C113854dR LJZL() {
        return (C113854dR) this.LJZI.getValue();
    }

    @Override // X.C109004Po, X.AbstractC029409q
    public final int getItemCount() {
        return LJZL().getItemCount() + getData().size();
    }

    @Override // X.C109004Po, X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < getData().size()) {
            return 1001;
        }
        return LJZL().getItemViewType(i - getData().size());
    }

    @Override // X.C109004Po, X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int LIZIZ;
        int i2;
        o.LJIIIZ(viewHolder, "viewHolder");
        if (i == 0) {
            LIZIZ = (int) KL2.LIZJ(this.LJLLLLLL, 9.0f);
        } else {
            LIZIZ = C7MY.LIZIZ(5);
        }
        if (i == getItemCount() - 1) {
            i2 = this.LJLLLLLL.getResources().getDimensionPixelOffset(R.dimen.a78);
        } else {
            i2 = 0;
        }
        if (viewHolder instanceof C108994Pn) {
            super.onBindViewHolder(viewHolder, i);
        } else if (viewHolder instanceof C113864dS) {
            LJZL().onBindViewHolder(viewHolder, i - getData().size());
        }
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        C26338AVi.LJI(view, Integer.valueOf(LIZIZ), 0, Integer.valueOf(i2), 0, false, 16);
    }

    @Override // X.C109004Po, X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder LJLLLLLL;
        o.LJIIIZ(parent, "parent");
        if (i == 1001) {
            LJLLLLLL = C4PY.LIZ(parent, this.LJZ, false, (int) C4PX.LJZI, false, true, 2, false, R.attr.gu);
        } else {
            LJLLLLLL = LJZL().LJLLLLLL(i, parent);
        }
        C0AX.LIZ(parent, LJLLLLLL.itemView, R.id.lj7);
        View view = LJLLLLLL.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJLLLLLL.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJLLLLLL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJLLLLLL.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJLLLLLL.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJLLLLLL.getClass().getName();
        return LJLLLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4PW(ActivityC45651qj context, InterfaceC113814dN callback, SharePanelViewModel sharePanelViewModel) {
        super(sharePanelViewModel);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(callback, "callback");
        this.LJLLLLLL = context;
        this.LJLZ = callback;
        this.LJZ = sharePanelViewModel;
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 899));
    }

    @Override // X.C109004Po, X.C4P0
    public final void LJZ(Context context, LifecycleOwner lifecycleOwner, List list) {
        List<IMContact> data = getData();
        if (list == null || list.isEmpty() || data == null) {
            return;
        }
        data.clear();
        o.LJI(list);
        data.addAll(list);
        this.LJZL = lifecycleOwner;
        notifyDataSetChanged();
    }
}
