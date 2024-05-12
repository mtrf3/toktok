package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBP extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final ActivityC45651qj LJLIL;
    public C51261K9x LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public final List<SearchSugEntity> LJLJJLL = new ArrayList();
    public SearchSugEntity LJLJL;
    public final EcSearchIntermediateViewModelNew LJLJLJ;
    public final C51262K9y LJLJLLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJJLL).size();
    }

    public KBP(ActivityC45651qj activityC45651qj) {
        EcSearchIntermediateViewModelNew ecSearchIntermediateViewModelNew;
        this.LJLIL = activityC45651qj;
        if (activityC45651qj != null) {
            ecSearchIntermediateViewModelNew = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(activityC45651qj).get(EcSearchIntermediateViewModelNew.class);
        } else {
            ecSearchIntermediateViewModelNew = null;
        }
        this.LJLJLJ = ecSearchIntermediateViewModelNew;
        this.LJLJLLL = new C51262K9y(this);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        SearchSugEntity searchSugEntity;
        if ((!((ArrayList) this.LJLJJLL).isEmpty()) && (searchSugEntity = (SearchSugEntity) ListProtector.get(this.LJLJJLL, i)) != null) {
            return C78840Uwu.LJIJJLI(searchSugEntity);
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (C34485Dg9.LJLILLLLZI.LJJII()) {
            recyclerView.getRecycledViewPool().setMaxRecycledViews(2, 10);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 10);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(1, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder instanceof KCS) {
            ((KCS) holder).onViewAttachedToWindow();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof KCS) {
            ((KCS) holder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        C51322KCg c51322KCg;
        C51320KCe c51320KCe;
        C51321KCf c51321KCf;
        C51293KBd c51293KBd;
        String string;
        o.LJIIIZ(holder, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            String str = "";
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    if (itemViewType != 5 || !(holder instanceof C51293KBd) || (c51293KBd = (C51293KBd) holder) == null) {
                        return;
                    }
                    ActivityC45651qj activityC45651qj = this.LJLIL;
                    if (activityC45651qj != null && (string = activityC45651qj.getString(R.string.ub)) != null) {
                        str = string;
                    }
                    c51293KBd.LJLILLLLZI.setText(str);
                    return;
                }
                if (!(holder instanceof C51321KCf) || (c51321KCf = (C51321KCf) holder) == null) {
                    return;
                }
                c51321KCf.L(i, (SearchSugEntity) ListProtector.get(this.LJLJJLL, i), this.LJLJJI);
                return;
            }
            if (!(holder instanceof C51320KCe) || (c51320KCe = (C51320KCe) holder) == null) {
                return;
            }
            SearchSugEntity searchSugEntity = (SearchSugEntity) ListProtector.get(this.LJLJJLL, i);
            String str2 = this.LJLJJI;
            if (str2 != null) {
                str = str2;
            }
            c51320KCe.L(searchSugEntity, str, i, null);
            return;
        }
        if (!(holder instanceof C51322KCg) || (c51322KCg = (C51322KCg) holder) == null) {
            return;
        }
        c51322KCg.L((SearchSugEntity) ListProtector.get(this.LJLJJLL, i), this.LJLJJI, i);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        RecyclerView.ViewHolder M;
        o.LJIIIZ(parent, "parent");
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        c51141K5h.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            SearchMiddleForEcService.LJJJJLI().LJJIIZI(this.LJLIL, "sug");
        } else if (C51090K3i.LIZLLL != 0) {
            C51090K3i.LJ = System.currentTimeMillis();
            C51090K3i.LIZJ();
        }
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("ecSearch sugView Type: ");
                            LIZ.append(i);
                            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
                            String str = this.LJLJI;
                            M = C51322KCg.M(parent, this.LJLILLLLZI, this.LJLJLLL, null, null, str);
                        } else {
                            M = C51295KBf.LIZ(parent);
                        }
                    } else {
                        M = KBU.LIZ(parent);
                    }
                } else {
                    String str2 = this.LJLJI;
                    M = KBS.LIZ(parent, this.LJLILLLLZI, this.LJLJLLL, null, null, str2);
                }
            } else {
                M = KBT.LIZ(parent, this.LJLJI, null, null, this.LJLILLLLZI);
            }
        } else {
            String str3 = this.LJLJI;
            M = C51322KCg.M(parent, this.LJLILLLLZI, this.LJLJLLL, null, null, str3);
        }
        C0AX.LIZ(parent, M.itemView, R.id.lj7);
        View view = M.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (M.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(M.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) M.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(M.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = M.getClass().getName();
        return M;
    }
}
