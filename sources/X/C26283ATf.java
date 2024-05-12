package X;

import Y.ACListenerS27S0400000_3;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.ATf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26283ATf extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final List<WikipediaInfo> LJLIL;
    public final C26285ATh<List<WikipediaInfo>> LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < this.LJLIL.size()) {
            return this.LJLILLLLZI.LIZIZ(i, this.LJLIL);
        }
        return super.getItemViewType(i);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLILLLLZI.LIZJ();
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLILLLLZI.LJFF();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        this.LJLILLLLZI.LIZLLL(i, holder, this.LJLIL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        RecyclerView.ViewHolder LJ = this.LJLILLLLZI.LJ(parent, i);
        C0AX.LIZ(parent, LJ.itemView, R.id.lj7);
        View view = LJ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJ.getClass().getName();
        return LJ;
    }

    public C26283ATf(List data, final java.util.Map params, final AqS169S0100000_3 aqS169S0100000_3) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(params, "params");
        this.LJLIL = data;
        C26285ATh<List<WikipediaInfo>> c26285ATh = new C26285ATh<>();
        this.LJLILLLLZI = c26285ATh;
        c26285ATh.LIZ(new AbstractC26286ATi<List<? extends WikipediaInfo>>(params, aqS169S0100000_3) { // from class: X.8qb
            public final java.util.Map<String, String> LIZ;
            public final InterfaceC88472Yns<WikipediaInfo, C76800UCe> LIZIZ;

            @Override // X.AbstractC26286ATi
            public final void LIZ(Object items) {
                o.LJIIIZ(items, "items");
            }

            @Override // X.AbstractC26286ATi
            public final RecyclerView.ViewHolder LIZJ(ViewGroup viewGroup) {
                View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bi1, viewGroup, false);
                o.LJIIIIZZ(view, "view");
                return new C223948qc(view);
            }

            {
                o.LJIIIZ(params, "params");
                this.LIZ = params;
                this.LIZIZ = aqS169S0100000_3;
            }

            @Override // X.AbstractC26286ATi
            public final void LIZIZ(List<? extends WikipediaInfo> list, int i, RecyclerView.ViewHolder holder, List payloads) {
                List<? extends WikipediaInfo> items = list;
                o.LJIIIZ(items, "items");
                o.LJIIIZ(holder, "holder");
                o.LJIIIZ(payloads, "payloads");
                if (holder instanceof C223948qc) {
                    C223948qc c223948qc = (C223948qc) holder;
                    WikipediaInfo info = (WikipediaInfo) ListProtector.get(items, i);
                    java.util.Map<String, String> params2 = this.LIZ;
                    InterfaceC88472Yns<WikipediaInfo, C76800UCe> clickItemAction = this.LIZIZ;
                    o.LJIIIZ(info, "info");
                    o.LJIIIZ(params2, "params");
                    o.LJIIIZ(clickItemAction, "clickItemAction");
                    C16880lQ.LJIIJ(new ACListenerS27S0400000_3(clickItemAction, info, c223948qc, params2, 3), c223948qc.itemView);
                    c223948qc.LJLIL.setText(info.getKeyword());
                }
            }
        });
    }
}
