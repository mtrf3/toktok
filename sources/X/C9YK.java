package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.anchor.HostInfo;

/* renamed from: X.9YK, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9YK extends AbstractC029409q<BFB> {
    public final InterfaceC28441BEf LJLIL;
    public final List<HostInfo> LJLILLLLZI;
    public final java.util.Set<Long> LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C9YK(DataChannel dataChannel, InterfaceC28441BEf onHostRemoveListener) {
        o.LJIIIZ(onHostRemoveListener, "onHostRemoveListener");
        this.LJLIL = onHostRemoveListener;
        this.LJLILLLLZI = new ArrayList();
        this.LJLJI = new HashSet();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(BFB bfb, int i) {
        BFB holder = bfb;
        o.LJIIIZ(holder, "holder");
        holder.LJJZZIII(ListProtector.get(this.LJLILLLLZI, i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final BFB com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        BFG bfg = new BFG(C06490Nh.LIZIZ(viewGroup, "parent", R.layout.def, viewGroup, false), this.LJLIL, this.LJLJI);
        C0AX.LIZ(viewGroup, bfg.itemView, R.id.lj7);
        View view = bfg.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (bfg.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(BFG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bfg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(bfg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = BFG.class.getName();
        return bfg;
    }
}
