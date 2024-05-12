package X;

import Y.ACListenerS19S0201000_1;
import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85453Wz extends AbstractC029409q<C85423Ww> {
    public final IMReactionListSheetViewModel LJLIL;
    public final List<C80353Dj> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C85453Wz(IMReactionListSheetViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = new ArrayList();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C85423Ww c85423Ww, int i) {
        C85423Ww holder = c85423Ww;
        o.LJIIIZ(holder, "holder");
        C80353Dj c80353Dj = (C80353Dj) ListProtector.get(this.LJLILLLLZI, i);
        if (c80353Dj.LJLJJLL) {
            holder.L(c80353Dj, new ACListenerS19S0201000_1(this, c80353Dj, i, 8));
        } else {
            holder.L(c80353Dj, new ACListenerS36S0200000_1(c80353Dj, this, 56));
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C85423Ww com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C85423Ww c85423Ww = new C85423Ww(C1FL.LIZIZ(parent, R.layout.b6j, parent, false, "from(parent.context)\n   …_reaction, parent, false)"));
        C0AX.LIZ(parent, c85423Ww.itemView, R.id.lj7);
        View view = c85423Ww.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c85423Ww.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C85423Ww.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c85423Ww.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c85423Ww.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C85423Ww.class.getName();
        return c85423Ww;
    }
}
