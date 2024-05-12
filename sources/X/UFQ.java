package X;

import Y.ACListenerS30S0101000_13;
import Y.IDComparatorS41S0000000_13;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS39S0300000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UFQ extends AbstractC029409q<UFR> {
    public final Context LJLIL;
    public final List<C76876UFc> LJLILLLLZI;
    public final InterfaceC88473Ynt<C76876UFc, Integer, List<C76876UFc>, C76800UCe> LJLJI;
    public final LayoutInflater LJLJJI;
    public RecyclerView LJLJJL;

    public final void LJLZ() {
        List<C76876UFc> list = this.LJLILLLLZI;
        if (list.size() > 1) {
            C40675Fxn.LJJLIIIJ(list, new IDComparatorS41S0000000_13(12));
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int size = this.LJLILLLLZI.size();
        if (size < 10) {
            return size + 1;
        }
        return size;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJL = recyclerView;
    }

    public static void LJLLLLLL(UFR ufr, View... viewArr) {
        ufr.LJLILLLLZI.setVisibility(8);
        ufr.LJLJJL.setVisibility(8);
        ufr.LJLJJLL.setVisibility(8);
        ufr.LJLJL.setVisibility(8);
        for (View view : viewArr) {
            view.setVisibility(0);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(UFR ufr, int i) {
        UFR holder = ufr;
        o.LJIIIZ(holder, "holder");
        ConstraintLayout constraintLayout = holder.LJLJLJ;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (this.LJLJJL != null) {
            int width = (int) ((r0.getWidth() - C87277YNd.LJIIJ(8)) / 2);
            layoutParams.width = width;
            layoutParams.height = (width / 11) * 6;
        }
        constraintLayout.setLayoutParams(layoutParams);
        if (i > this.LJLILLLLZI.size()) {
            return;
        }
        if (i == this.LJLILLLLZI.size()) {
            ImageView imageView = holder.LJLIL;
            imageView.setImageBitmap(null);
            C16880lQ.LJIILLIIL(imageView, new ACListenerS30S0101000_13(i, this, 4));
            LJLLLLLL(holder, holder.LJLJJLL);
            return;
        }
        holder.LJLIL.setImageBitmap(((C76876UFc) ListProtector.get(this.LJLILLLLZI, i)).LIZ());
        C16880lQ.LJIILLIIL(holder.LJLIL, new ACListenerS30S0101000_13(i, this, 5));
        if (((C76876UFc) ListProtector.get(this.LJLILLLLZI, i)).LIZJ) {
            LJLLLLLL(holder, holder.LJLJJL, holder.LJLJL);
            return;
        }
        Integer num = ((C76876UFc) ListProtector.get(this.LJLILLLLZI, i)).LIZIZ;
        if (num != null) {
            if (num.intValue() == 2) {
                LJLLLLLL(holder, holder.LJLILLLLZI, holder.LJLJL);
                int LIZIZ = C259910h.LIZIZ(R.attr.ar8, this.LJLIL);
                holder.LJLJI.setIcon(C259910h.LIZLLL(R.attr.att, this.LJLIL));
                holder.LJLJI.setIconTint(LIZIZ);
                holder.LJLJJI.setText(R.string.oam);
                holder.LJLJJI.setTextColor(LIZIZ);
                return;
            }
            if (num.intValue() == 3) {
                LJLLLLLL(holder, holder.LJLILLLLZI, holder.LJLJL);
                int LIZIZ2 = C259910h.LIZIZ(R.attr.awl, this.LJLIL);
                holder.LJLJI.setIcon(C259910h.LIZLLL(R.attr.atc, this.LJLIL));
                holder.LJLJI.setIconTint(LIZIZ2);
                holder.LJLJJI.setText(R.string.oan);
                holder.LJLJJI.setTextColor(LIZIZ2);
                return;
            }
        }
        LJLLLLLL(holder, holder.LJLJL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final UFR com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(this.LJLJJI, R.layout.d5j, parent, false);
        o.LJIIIIZZ(LLLLIILL, "mInflater.inflate(\n     …         false,\n        )");
        UFR ufr = new UFR(LLLLIILL);
        C0AX.LIZ(parent, ufr.itemView, R.id.lj7);
        View view = ufr.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (ufr.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(UFR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) ufr.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(ufr.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = UFR.class.getName();
        return ufr;
    }

    public UFQ(Context context, List data, IDqS39S0300000_13 iDqS39S0300000_13) {
        o.LJIIIZ(data, "data");
        this.LJLIL = context;
        this.LJLILLLLZI = data;
        this.LJLJI = iDqS39S0300000_13;
        this.LJLJJI = C16880lQ.LLZIL(context);
    }
}
