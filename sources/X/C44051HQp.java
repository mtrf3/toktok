package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot;
import com.zhiliaoapp.musically.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import q03.IDaS486S0100000_7;

/* renamed from: X.HQp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44051HQp extends AbstractC029409q<C44052HQq> implements InterfaceC88472Yns<View, C76800UCe> {
    public final HQU LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public InterfaceC88471Ynr<? super Integer, ? super UgcTemplateSlot, C76800UCe> LJLJJI;
    public final DecimalFormat LJLJJL;
    public final boolean LJLJJLL;
    public Boolean LJLJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL.LJ).size();
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        Integer num;
        View v = view;
        o.LJIIIZ(v, "v");
        Object tag = v.getTag();
        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
            int intValue = num.intValue();
            InterfaceC88471Ynr<? super Integer, ? super UgcTemplateSlot, C76800UCe> interfaceC88471Ynr = this.LJLJJI;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Integer.valueOf(intValue), ListProtector.get(this.LJLIL.LJ, intValue));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C44052HQq c44052HQq, int i) {
        boolean z;
        C44052HQq holder = c44052HQq;
        o.LJIIIZ(holder, "holder");
        UgcTemplateSlot data = (UgcTemplateSlot) ListProtector.get(this.LJLIL.LJ, i);
        o.LJIIIZ(data, "data");
        holder.itemView.setTag(Integer.valueOf(i));
        double duration = data.getDuration();
        TextView textView = (TextView) holder.itemView.findViewById(R.id.time);
        DecimalFormat decimalFormat = holder.LJLIL.LJLJJL;
        if (duration < 0.1d) {
            duration = 0.1d;
        }
        textView.setText(decimalFormat.format(duration));
        View findViewById = holder.itemView.findViewById(R.id.hem);
        o.LJIIIIZZ(findViewById, "itemView.outline");
        C44051HQp c44051HQp = holder.LJLIL;
        if (c44051HQp.LJLJJLL && !o.LJ(c44051HQp.LJLJL, Boolean.FALSE) && holder.LJLIL.LJLIL.LJIIIZ.contains(data)) {
            z = true;
        } else {
            z = false;
        }
        C87277YNd.LJJIJIIJI(findViewById, z);
        holder.itemView.findViewById(R.id.hem).setTag(data);
    }

    @Override // X.AbstractC029409q
    public final C44052HQq onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C44052HQq c44052HQq = new C44052HQq(this, C1FL.LIZIZ(parent, R.layout.ben, parent, false, "from(parent.context).inf…te_single, parent, false)"));
        View view = c44052HQq.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        C16880lQ.LJIIJ(new IDaS486S0100000_7(this, 2), view);
        ViewGroup.LayoutParams layoutParams = c44052HQq.itemView.getLayoutParams();
        layoutParams.width = this.LJLILLLLZI;
        layoutParams.height = this.LJLJI;
        c44052HQq.itemView.setLayoutParams(layoutParams);
        C0AX.LIZ(parent, c44052HQq.itemView, R.id.lj7);
        View view2 = c44052HQq.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c44052HQq.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C44052HQq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c44052HQq.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c44052HQq.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C44052HQq.class.getName();
        return c44052HQq;
    }

    public C44051HQp(HQU previewContext, int i, int i2) {
        o.LJIIIZ(previewContext, "previewContext");
        this.LJLIL = previewContext;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJL = new DecimalFormat("0.0");
        this.LJLJJLL = C1JI.LJJI();
    }
}
