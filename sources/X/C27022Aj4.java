package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Aj4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27022Aj4 extends AbstractC029409q<AbstractViewOnClickListenerC27027Aj9> {
    public List<CandInputData> LJLIL;
    public String LJLILLLLZI;
    public InterfaceC27028AjA LJLJI;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        List<CandInputData> list = this.LJLIL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(AbstractViewOnClickListenerC27027Aj9 abstractViewOnClickListenerC27027Aj9, int i) {
        CandInputData candInputData;
        AbstractViewOnClickListenerC27027Aj9 viewHolder = abstractViewOnClickListenerC27027Aj9;
        o.LJIIIZ(viewHolder, "viewHolder");
        List<CandInputData> list = this.LJLIL;
        if (list != null) {
            candInputData = (CandInputData) ListProtector.get(list, i);
        } else {
            candInputData = null;
        }
        viewHolder.L(candInputData, getItemCount(), null, this.LJLILLLLZI);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final AbstractViewOnClickListenerC27027Aj9 com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C27025Aj7 c27025Aj7 = new C27025Aj7(this, viewGroup, C06490Nh.LIZIZ(viewGroup, "parent", R.layout.wv, viewGroup, false));
        c27025Aj7.LJLIL = this.LJLJI;
        C0AX.LIZ(viewGroup, c27025Aj7.itemView, R.id.lj7);
        View view = c27025Aj7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c27025Aj7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C27025Aj7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c27025Aj7.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c27025Aj7.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C27025Aj7.class.getName();
        return c27025Aj7;
    }
}
