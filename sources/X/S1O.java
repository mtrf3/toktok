package X;

import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S1O extends AbstractC28801Bc<S1P, S1R> {
    public int LJLIL;
    public final java.util.Set<String> LJLILLLLZI;

    public S1O() {
        super(S1S.LIZ);
        this.LJLIL = -1;
        this.LJLILLLLZI = C77275UUl.LJIIIIZZ(String.valueOf(EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE()), String.valueOf(EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE()));
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        S1E s1e = getItem(holder.getLayoutPosition()).LIZJ;
        if ((s1e instanceof S0Q) && holder.getLayoutPosition() > this.LJLIL) {
            S0Q s0q = (S0Q) s1e;
            s0q.LJLJLJ.LJIIIZ(holder.getLayoutPosition(), s0q.LJIIIZ());
        }
        this.LJLIL = Math.max(this.LJLIL, holder.getLayoutPosition());
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        S1R holder = (S1R) viewHolder;
        o.LJIIIZ(holder, "holder");
        S1P item = getItem(i);
        o.LJIIIIZZ(item, "getItem(position)");
        S1P s1p = item;
        ((TextView) holder.LJLIL.findViewById(R.id.hz4)).setText(s1p.LIZIZ);
        SmartImageView anchorIcon = (SmartImageView) holder.LJLIL.findViewById(R.id.hz3);
        S1E s1e = s1p.LIZJ;
        o.LJIIIIZZ(anchorIcon, "anchorIcon");
        s1e.LIZLLL(anchorIcon);
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(s1p, 179), holder.LJLIL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c1v, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        S1R s1r = new S1R(view);
        C0AX.LIZ(viewGroup, s1r.itemView, R.id.lj7);
        View view2 = s1r.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (s1r.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(S1R.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) s1r.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(s1r.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = S1R.class.getName();
        return s1r;
    }
}
