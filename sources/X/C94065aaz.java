package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.ActionFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aaz, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94065aaz extends AbstractC029409q<C94064aay> {
    public List<C94384ag8> LJLIL = C61878OQg.INSTANCE;
    public final /* synthetic */ ActionFragment LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public C94065aaz(ActionFragment actionFragment) {
        this.LJLILLLLZI = actionFragment;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return ((C94384ag8) ListProtector.get(this.LJLIL, i)).LJLILLLLZI.getMark();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C94064aay holder, int i) {
        View view;
        o.LJIIIZ(holder, "holder");
        View view2 = holder.itemView;
        if (!(view2 instanceof C93806aWo)) {
            view = null;
        } else {
            view = view2;
        }
        C93806aWo c93806aWo = (C93806aWo) view;
        if (!(view2 instanceof C93804aWm)) {
            view2 = null;
        }
        C93804aWm c93804aWm = (C93804aWm) view2;
        if (c93806aWo != null) {
            C93806aWo.LIZ(c93806aWo, (C94384ag8) ListProtector.get(this.LJLIL, i), new IDqS419S0100000_42(this, 2));
        }
        if (c93804aWm != null) {
            c93804aWm.LIZ((C94384ag8) ListProtector.get(this.LJLIL, i), new IDqS419S0100000_42(this, 3));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C94064aay com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        View c93804aWm;
        o.LJIIIZ(parent, "parent");
        RecyclerView recyclerView = (RecyclerView) parent;
        if (i == EnumC94003aZz.NORMAL.getMark()) {
            Context context = recyclerView.getContext();
            o.LJIIIIZZ(context, "parent.context");
            c93804aWm = new C93806aWo(context);
            c93804aWm.setLayoutParams(C93902aYM.LJ(recyclerView, -2, 0, 0, null, Integer.valueOf(C93742aVm.LIZIZ(24)), 124));
        } else {
            Context context2 = recyclerView.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            c93804aWm = new C93804aWm(context2);
            c93804aWm.setLayoutParams(C93902aYM.LJ(recyclerView, -2, 0, 0, null, Integer.valueOf(C93742aVm.LIZIZ(24)), 124));
        }
        C94064aay c94064aay = new C94064aay(c93804aWm);
        c94064aay.itemView.setTag(R.id.lj7, Integer.valueOf(parent.hashCode()));
        View view = c94064aay.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c94064aay.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C94064aay.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c94064aay.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c94064aay.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C94064aay.class.getName();
        return c94064aay;
    }
}
