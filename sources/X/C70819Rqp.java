package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragment;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rqp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70819Rqp extends AbstractC029409q<C70820Rqq> {
    public final List<Option> LJLIL;
    public String LJLILLLLZI;
    public Option LJLJI;
    public final /* synthetic */ OptionPickerDialogFragment LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C70819Rqp(OptionPickerDialogFragment optionPickerDialogFragment, List<Option> list) {
        this.LJLJJI = optionPickerDialogFragment;
        this.LJLIL = list;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C70820Rqq c70820Rqq, int i) {
        C70820Rqq holder = c70820Rqq;
        o.LJIIIZ(holder, "holder");
        boolean z = true;
        if (i >= 0 && i <= this.LJLIL.size()) {
            Option option = (Option) ListProtector.get(this.LJLIL, i);
            o.LJIIIZ(option, "option");
            TextView textView = (TextView) holder.itemView.findViewById(R.id.m_d);
            textView.setText(option.value);
            textView.setEnabled(option.isEnabled);
            C63044Ooi c63044Ooi = (C63044Ooi) holder.itemView.findViewById(R.id.ioh);
            C70819Rqp c70819Rqp = holder.LJLIL;
            c63044Ooi.setEnabled(option.isEnabled);
            if (!option.isEnabled || !o.LJ(option.key, c70819Rqp.LJLILLLLZI)) {
                z = false;
            }
            c63044Ooi.setChecked(z);
            View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            C16880lQ.LJIIJ(new Au2S11S0300000_12(option, this, this.LJLJJI, 14), view);
        }
    }

    @Override // X.AbstractC029409q
    public final C70820Rqq onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C70820Rqq c70820Rqq = new C70820Rqq(this, parent);
        C0AX.LIZ(parent, c70820Rqq.itemView, R.id.lj7);
        View view = c70820Rqq.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c70820Rqq.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C70820Rqq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c70820Rqq.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c70820Rqq.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C70820Rqq.class.getName();
        return c70820Rqq;
    }
}
