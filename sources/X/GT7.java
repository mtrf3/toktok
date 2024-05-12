package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GT7 extends AbstractC029409q<GT9> implements GT8 {
    public final List<C42802Gr0> LJLIL;
    public final GT8 LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public GT7(List mItems, GTB gtb) {
        o.LJIIIZ(mItems, "mItems");
        this.LJLIL = mItems;
        this.LJLILLLLZI = gtb;
    }

    @Override // X.GT8
    public final void LIZ(int i, View view) {
        o.LJIIIZ(view, "view");
        GT8 gt8 = this.LJLILLLLZI;
        if (gt8 != null) {
            gt8.LIZ(i, view);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(GT9 gt9, int i) {
        GT9 vh = gt9;
        o.LJIIIZ(vh, "vh");
        C42802Gr0 item = (C42802Gr0) ListProtector.get(this.LJLIL, i);
        o.LJIIIZ(item, "item");
        TuxTextView tuxTextView = vh.LJLILLLLZI;
        if (tuxTextView == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("# ");
        LIZ.append(item.LIZ.challengeName);
        tuxTextView.setText(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC029409q
    public final GT9 onCreateViewHolder(ViewGroup root, int i) {
        o.LJIIIZ(root, "root");
        GT9 gt9 = new GT9(C1FL.LIZIZ(root, R.layout.j9, root, false, "from(parent.context).inf…g_sticker, parent, false)"), this);
        C0AX.LIZ(root, gt9.itemView, R.id.lj7);
        View view = gt9.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(root));
        }
        try {
            if (gt9.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(GT9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(root.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) gt9.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(gt9.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = GT9.class.getName();
        return gt9;
    }
}
