package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GtI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42944GtI extends AbstractC029409q<C42943GtH> {
    public final List<EffectAttribution> LJLIL;
    public final InterfaceC88472Yns<EffectAttribution, Boolean> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C42944GtI(AqS138S0200000_7 aqS138S0200000_7, List list) {
        o.LJIIIZ(list, "list");
        this.LJLIL = list;
        this.LJLILLLLZI = aqS138S0200000_7;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C42943GtH c42943GtH, int i) {
        C42943GtH holder = c42943GtH;
        o.LJIIIZ(holder, "holder");
        EffectAttribution model = (EffectAttribution) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(model, "model");
        TuxTextView tuxTextView = holder.LJLILLLLZI;
        String name = model.getName();
        C116724i4 c116724i4 = new C116724i4();
        String str = "";
        if (name == null) {
            name = "";
        }
        c116724i4.LIZIZ(name);
        tuxTextView.setText(c116724i4.LIZ);
        TuxTextView tuxTextView2 = holder.LJLJI;
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        tuxTextView2.setText(C42946GtK.LIZ(model, context));
        TuxTextView tuxTextView3 = holder.LJLJJI;
        String license = model.getLicense();
        C116724i4 c116724i42 = new C116724i4();
        if (license != null) {
            str = license;
        }
        c116724i42.LIZIZ(str);
        tuxTextView3.setText(c116724i42.LIZ);
        holder.itemView.setOnLongClickListener(new ViewOnLongClickListenerC42945GtJ(holder, model));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C42943GtH com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View itemView = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.clv, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        C42943GtH c42943GtH = new C42943GtH(itemView, this.LJLILLLLZI);
        C0AX.LIZ(viewGroup, c42943GtH.itemView, R.id.lj7);
        View view = c42943GtH.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c42943GtH.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C42943GtH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c42943GtH.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c42943GtH.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C42943GtH.class.getName();
        return c42943GtH;
    }
}
