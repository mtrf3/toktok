package X;

import Y.ACListenerS29S0201000_13;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UwG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78800UwG extends AbstractC029409q<C78799UwF> {
    public final InterfaceC78821Uwb LJLIL;
    public final List<C78801UwH> LJLILLLLZI;
    public final C78804UwK LJLJI;
    public final InterfaceC88472Yns<C78820Uwa, C76800UCe> LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C78799UwF c78799UwF, int i) {
        C78799UwF holder = c78799UwF;
        o.LJIIIZ(holder, "holder");
        C78801UwH c78801UwH = (C78801UwH) ListProtector.get(this.LJLILLLLZI, i);
        holder.LJLILLLLZI.setText(c78801UwH.LIZIZ);
        RecyclerView recyclerView = holder.LJLIL;
        InterfaceC78821Uwb interfaceC78821Uwb = this.LJLIL;
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "holder.recyclerView.context");
        recyclerView.setLayoutManager(interfaceC78821Uwb.LJ(context));
        recyclerView.setAdapter(new C78788Uw4(i, c78801UwH.LIZ, c78801UwH.LJ, c78801UwH.LIZLLL, this.LJLJJI));
        C78804UwK c78804UwK = this.LJLJI;
        if (c78804UwK != null) {
            recyclerView.LJLI(c78804UwK.LJLJJLL);
        }
        TuxTextView tuxTextView = holder.LJLJI;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS29S0201000_13(this, i, c78801UwH, 2));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C78799UwF com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C39687Fhr.LJIIL(parent.getContext());
        View v = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.bz3, parent, false);
        o.LJIIIIZZ(v, "v");
        C78799UwF c78799UwF = new C78799UwF(v);
        C0AX.LIZ(parent, c78799UwF.itemView, R.id.lj7);
        View view = c78799UwF.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c78799UwF.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C78799UwF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c78799UwF.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c78799UwF.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C78799UwF.class.getName();
        return c78799UwF;
    }

    public C78800UwG(InterfaceC78821Uwb manager, List parentCategory, C78804UwK c78804UwK, AqS179S0100000_13 aqS179S0100000_13) {
        o.LJIIIZ(manager, "manager");
        o.LJIIIZ(parentCategory, "parentCategory");
        this.LJLIL = manager;
        this.LJLILLLLZI = parentCategory;
        this.LJLJI = c78804UwK;
        this.LJLJJI = aqS179S0100000_13;
    }
}
