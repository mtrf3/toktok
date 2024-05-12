package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HyI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45802HyI extends AbstractC45801HyH<C157166Eu> {
    public final /* synthetic */ TL5 LJLILLLLZI;

    public C45802HyI(TL5 tl5) {
        this.LJLILLLLZI = tl5;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        C157166Eu c157166Eu = (C157166Eu) ListProtector.get(this.LJLIL, i);
        this.LJLILLLLZI.LJII(holder, i, c157166Eu.LJLIL, (TEA) c157166Eu.LJLILLLLZI, (Integer) c157166Eu.LJLJI);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        TL5 tl5 = this.LJLILLLLZI;
        RecyclerView.ViewHolder LJIIIZ = tl5.LJIIIZ(parent, tl5.LJIJJLI);
        InterfaceC88472Yns<? super RecyclerView.ViewHolder, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI.LIZ.LIZLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(LJIIIZ);
        }
        C0AX.LIZ(parent, LJIIIZ.itemView, R.id.lj7);
        View view = LJIIIZ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJIIIZ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJIIIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJIIIZ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJIIIZ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJIIIZ.getClass().getName();
        return LJIIIZ;
    }
}
