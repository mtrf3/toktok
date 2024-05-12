package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BBx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28381BBx extends AbstractC029409q<C28382BBy> {
    public final Context LJLIL;
    public final boolean LJLILLLLZI;
    public final List<C05490Jl> LJLJI = new ArrayList();
    public Integer LJLJJI;
    public C05490Jl LJLJJL;
    public InterfaceC88472Yns<? super C05490Jl, C76800UCe> LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public final void LJLLLLLL(List<C05490Jl> data) {
        o.LJIIIZ(data, "data");
        ((ArrayList) this.LJLJI).clear();
        ((ArrayList) this.LJLJI).addAll(data);
        this.LJLJJI = null;
        this.LJLJJL = null;
        notifyDataSetChanged();
    }

    public final void LJLZ(C05490Jl duration) {
        o.LJIIIZ(duration, "duration");
        int indexOf = ((ArrayList) this.LJLJI).indexOf(duration);
        Integer num = this.LJLJJI;
        if ((num == null || indexOf != num.intValue()) && indexOf >= 0) {
            Integer num2 = this.LJLJJI;
            this.LJLJJI = Integer.valueOf(indexOf);
            this.LJLJJL = duration;
            notifyItemChanged(indexOf);
            if (num2 != null) {
                notifyItemChanged(num2.intValue());
            }
            InterfaceC88472Yns<? super C05490Jl, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(duration);
            }
        }
    }

    public C28381BBx(Context context, boolean z) {
        this.LJLIL = context;
        this.LJLILLLLZI = z;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C28382BBy c28382BBy, int i) {
        String quantityString;
        boolean z;
        C28382BBy holder = c28382BBy;
        o.LJIIIZ(holder, "holder");
        TextView textView = holder.LJLIL;
        C05490Jl c05490Jl = (C05490Jl) ListProtector.get(this.LJLJI, i);
        Context context = this.LJLIL;
        o.LJIIIZ(c05490Jl, "<this>");
        o.LJIIIZ(context, "context");
        long j = c05490Jl.LIZ;
        if (j == -1) {
            quantityString = context.getString(R.string.mjk);
            o.LJIIIIZZ(quantityString, "context.getString(R.stri…ve_mute_duration_default)");
        } else if (j < 60) {
            Resources resources = context.getResources();
            int i2 = (int) c05490Jl.LIZ;
            quantityString = resources.getQuantityString(R.plurals.nv, i2, Integer.valueOf(i2));
            o.LJIIIIZZ(quantityString, "context.resources.getQua…toInt(), seconds.toInt())");
        } else {
            int i3 = (int) (j / 60);
            quantityString = context.getResources().getQuantityString(R.plurals.nu, i3, Integer.valueOf(i3));
            o.LJIIIIZZ(quantityString, "{\n        val min = seco…Int(), min.toInt())\n    }");
        }
        textView.setText(quantityString);
        RadioButton radioButton = holder.LJLILLLLZI;
        Integer num = this.LJLJJI;
        if (num == null || i != num.intValue()) {
            z = false;
        } else {
            z = true;
        }
        radioButton.setChecked(z);
        if (i == getItemCount() - 1) {
            holder.LJLJI.setVisibility(8);
        } else {
            holder.LJLJI.setVisibility(0);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C28382BBy com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.d8g, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        C28382BBy c28382BBy = new C28382BBy(this, view);
        C0AX.LIZ(viewGroup, c28382BBy.itemView, R.id.lj7);
        View view2 = c28382BBy.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c28382BBy.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C28382BBy.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c28382BBy.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c28382BBy.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C28382BBy.class.getName();
        return c28382BBy;
    }
}
