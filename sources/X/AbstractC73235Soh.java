package X;

import X.AbstractC73265SpB;
import X.C73236Soi;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Soh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73235Soh<VH extends AbstractC73265SpB<?>, M extends C73236Soi<VH>> extends AbstractC029409q<VH> implements InterfaceC73258Sp4<VH, M> {
    public abstract void LJLLLLLL(C73242Soo c73242Soo);

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((AbstractC73234Sog) this).LJLILLLLZI.LIZIZ(i);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIJ(recyclerView, "recyclerView");
        ((AbstractC73234Sog) this).LJLILLLLZI.LJ(recyclerView);
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIJ(recyclerView, "recyclerView");
        C73236Soi c73236Soi = ((AbstractC73234Sog) this).LJLILLLLZI;
        c73236Soi.getClass();
        C73240Som c73240Som = c73236Soi.LIZLLL;
        c73240Som.getClass();
        ViewOnAttachStateChangeListenerC73199So7 viewOnAttachStateChangeListenerC73199So7 = c73240Som.LIZIZ;
        viewOnAttachStateChangeListenerC73199So7.getClass();
        viewOnAttachStateChangeListenerC73199So7.LJLIL = null;
        recyclerView.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73199So7);
        c73240Som.LIZJ = null;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIJ(holder, "holder");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIJ(parent, "parent");
        AbstractC73265SpB LIZ = ((AbstractC73234Sog) this).LJLILLLLZI.LIZ(i, parent);
        C0AX.LIZ(parent, LIZ.itemView, R.id.lj7);
        View view = LIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LIZ.itemView.getParent() != null) {
                boolean z = true;
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
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List payloads) {
        AbstractC73265SpB holder = (AbstractC73265SpB) viewHolder;
        o.LJIIJ(holder, "holder");
        o.LJIIJ(payloads, "payloads");
        C73236Soi c73236Soi = ((AbstractC73234Sog) this).LJLILLLLZI;
        Object LJLZ = ((AbstractC73232Soe) this).LJLZ(i, true);
        c73236Soi.getClass();
        if (LJLZ == null) {
            return;
        }
        holder.bind(LJLZ, i, payloads);
    }
}
