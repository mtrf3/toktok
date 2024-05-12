package X;

import Y.ACListenerS25S0101000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GAY extends AbstractC029409q<C41074GAc> {
    public final G97 LJLIL;
    public final List<G99> LJLILLLLZI;
    public String LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C41074GAc c41074GAc, int i) {
        C41074GAc holder = c41074GAc;
        o.LJIIIZ(holder, "holder");
        ((TextView) holder.LJLIL.getValue()).setText(((G99) ListProtector.get(this.LJLILLLLZI, i)).LIZIZ);
        Object value = holder.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-selectionCheckbox>(...)");
        ((C63044Ooi) value).setChecked(((G99) ListProtector.get(this.LJLILLLLZI, i)).LIZ.equals(this.LJLJI));
        C16880lQ.LJIIJ(new ACListenerS25S0101000_7(i, this, 1), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C41074GAc com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C41074GAc c41074GAc = new C41074GAc(C1FL.LIZIZ(parent, R.layout.i5, parent, false, "from(parent.context)\n   …item_view, parent, false)"));
        C0AX.LIZ(parent, c41074GAc.itemView, R.id.lj7);
        View view = c41074GAc.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c41074GAc.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C41074GAc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c41074GAc.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c41074GAc.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C41074GAc.class.getName();
        return c41074GAc;
    }

    public GAY(G97 delegate, List<G99> languageViewModels, String selectedLanguageCode) {
        o.LJIIIZ(delegate, "delegate");
        o.LJIIIZ(languageViewModels, "languageViewModels");
        o.LJIIIZ(selectedLanguageCode, "selectedLanguageCode");
        this.LJLIL = delegate;
        this.LJLILLLLZI = languageViewModels;
        this.LJLJI = selectedLanguageCode;
    }
}
