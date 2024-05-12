package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JqY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50418JqY implements InterfaceC73226SoY<SearchMixFeed> {
    @Override // X.InterfaceC73226SoY
    public final void LJJIIJ(List<? extends SearchMixFeed> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(list, "list");
    }

    @Override // X.InterfaceC73226SoY
    public final C73231Sod<SearchMixFeed> LJJIIZI() {
        return new C73231Sod<>(new AbstractC029409q<RecyclerView.ViewHolder>() { // from class: X.5Wq
            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return 0;
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(RecyclerView.ViewHolder p0, int i) {
                o.LJIIIZ(p0, "p0");
            }

            @Override // X.AbstractC029409q
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup p0, int i) {
                o.LJIIIZ(p0, "p0");
                final View view = new View(p0.getContext());
                RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(view) { // from class: X.5Wr
                };
                C0AX.LIZ(p0, viewHolder.itemView, R.id.lj7);
                View view2 = viewHolder.itemView;
                if (view2 != null) {
                    view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(p0));
                }
                try {
                    if (viewHolder.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C136335Wr.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(p0.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                            if (viewGroup != null) {
                                C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C136335Wr.class.getName();
                return viewHolder;
            }
        }, new C73262Sp8());
    }
}
