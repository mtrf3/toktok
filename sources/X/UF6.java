package X;

import Y.ACListenerS29S0201000_13;
import Y.IDCListenerS143S0200000_13;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UF6 extends AbstractC029409q<UF7> {
    public List<UF8> LJLIL;
    public final InterfaceC88471Ynr<? super UF8, ? super Integer, C76800UCe> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public UF6(List sourceList, AqS195S0100000_13 aqS195S0100000_13) {
        o.LJIIIZ(sourceList, "sourceList");
        this.LJLIL = sourceList;
        this.LJLILLLLZI = aqS195S0100000_13;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(UF7 uf7, int i) {
        Object obj;
        UF7 holder = uf7;
        o.LJIIIZ(holder, "holder");
        UF8 uf8 = (UF8) ListProtector.get(this.LJLIL, i);
        holder.L(holder.LJLJI, holder.LJLILLLLZI, uf8);
        if (uf8 != null) {
            obj = uf8.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            C41071jL c41071jL = holder.LJLJJI;
            if (c41071jL != null) {
                c41071jL.setVisibility(0);
            }
            C41071jL c41071jL2 = holder.LJLJJI;
            if (c41071jL2 != null) {
                c41071jL2.setOnCheckedChangeListener(null);
            }
            C41071jL c41071jL3 = holder.LJLJJI;
            if (c41071jL3 != null) {
                Object obj2 = uf8.LIZIZ;
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                c41071jL3.setChecked(((Boolean) obj2).booleanValue());
            }
            C41071jL c41071jL4 = holder.LJLJJI;
            if (c41071jL4 != null) {
                c41071jL4.setOnCheckedChangeListener(new IDCListenerS143S0200000_13(uf8, holder, 0));
            }
        } else {
            C41071jL c41071jL5 = holder.LJLJJI;
            if (c41071jL5 != null) {
                c41071jL5.setVisibility(8);
            }
        }
        C16880lQ.LJIIJ(new ACListenerS29S0201000_13(uf8, i, holder, 1), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final UF7 com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        UF7 uf7 = new UF7(C1FL.LIZIZ(parent, R.layout.d7y, parent, false, "from(parent.context)\n   …eva_cache, parent, false)"), this.LJLILLLLZI);
        C0AX.LIZ(parent, uf7.itemView, R.id.lj7);
        View view = uf7.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (uf7.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(UF7.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) uf7.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(uf7.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = UF7.class.getName();
        return uf7;
    }
}
