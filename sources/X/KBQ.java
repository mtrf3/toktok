package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.middle.ui.EcAbstractSearchIntermediateFragmentNew;
import com.ss.android.ugc.aweme.ecomsearch.middle.viewmodel.EcSearchIntermediateViewModelNew;
import com.ss.android.ugc.aweme.ecomsearch.model.EcKeyboardModel;
import com.ss.android.ugc.aweme.search.ecommerce.SearchMiddleForEcService;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class KBQ extends AbstractC029409q<RecyclerView.ViewHolder> {
    public List<SearchSugEntity> LJLIL = new ArrayList();
    public String LJLILLLLZI;
    public String LJLJI;
    public EcAbstractSearchIntermediateFragmentNew LJLJJI;
    public final EcSearchIntermediateViewModelNew LJLJJL;
    public K75 LJLJJLL;
    public final KBR LJLJL;
    public final ActivityC45651qj LJLJLJ;
    public String LJLJLLL;
    public SearchSugEntity LJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    public KBQ(ActivityC45651qj activityC45651qj) {
        this.LJLJLJ = activityC45651qj;
        if (activityC45651qj != null) {
            this.LJLJJL = (EcSearchIntermediateViewModelNew) ViewModelProviders.of(activityC45651qj).get(EcSearchIntermediateViewModelNew.class);
            ViewModelProviders.of(activityC45651qj).get(EcKeyboardModel.class);
        }
        this.LJLJL = new KBR(this);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        SearchSugEntity searchSugEntity;
        if (!C79004UzY.LJJIFFI(this.LJLIL) && (searchSugEntity = (SearchSugEntity) ListProtector.get(this.LJLIL, i)) != null) {
            return C78840Uwu.LJIJJLI(searchSugEntity);
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        if (C34485Dg9.LJLILLLLZI.LJJII()) {
            recyclerView.getRecycledViewPool().setMaxRecycledViews(2, 10);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(0, 10);
            recyclerView.getRecycledViewPool().setMaxRecycledViews(1, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof KCS) {
            ((KCS) viewHolder).onViewAttachedToWindow();
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C51321KCf) {
            ((C51321KCf) viewHolder).onViewDetachedFromWindow();
        }
        if (viewHolder instanceof C51320KCe) {
            ((C51320KCe) viewHolder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            ((C51320KCe) viewHolder).L((SearchSugEntity) ListProtector.get(this.LJLIL, i), this.LJLILLLLZI, i, new XWV(this));
            return;
        }
        if (itemViewType == 2) {
            ((C51321KCf) viewHolder).L(i, (SearchSugEntity) ListProtector.get(this.LJLIL, i), this.LJLILLLLZI);
            return;
        }
        if (itemViewType == 0) {
            ((C51322KCg) viewHolder).L((SearchSugEntity) ListProtector.get(this.LJLIL, i), this.LJLILLLLZI, i);
            return;
        }
        if (itemViewType != 5 || !(viewHolder instanceof C51293KBd)) {
            return;
        }
        C51293KBd c51293KBd = (C51293KBd) viewHolder;
        ActivityC45651qj activityC45651qj = this.LJLJLJ;
        if (activityC45651qj != null) {
            str = activityC45651qj.getString(R.string.ub);
        } else {
            str = "";
        }
        c51293KBd.LJLILLLLZI.setText(str);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C51141K5h c51141K5h = C51141K5h.LIZ;
        ActivityC45651qj activityC45651qj = this.LJLJLJ;
        c51141K5h.getClass();
        if (C51141K5h.LIZ(activityC45651qj)) {
            SearchMiddleForEcService.LJJJJLI().LJJIIZI(this.LJLJLJ, "sug");
        } else if (C51090K3i.LIZLLL != 0) {
            C51090K3i.LJ = System.currentTimeMillis();
            C51090K3i.LIZJ();
        }
        RecyclerView.ViewHolder viewHolder = null;
        boolean z = true;
        if (i == 1) {
            viewHolder = KBT.LIZ(viewGroup, this.LJLJI, this.LJLJJI, this.LJLJJLL, null);
        } else if (i == 2) {
            String str = this.LJLJI;
            viewHolder = KBS.LIZ(viewGroup, null, this.LJLJL, this.LJLJJLL, this.LJLJJI, str);
        } else if (i == 3) {
            viewHolder = KBU.LIZ(viewGroup);
        } else if (i == 0) {
            String str2 = this.LJLJI;
            viewHolder = C51322KCg.M(viewGroup, null, this.LJLJL, this.LJLJJLL, this.LJLJJI, str2);
        } else if (i == 5) {
            viewHolder = C51295KBf.LIZ(viewGroup);
        }
        C0AX.LIZ(viewGroup, viewHolder.itemView, R.id.lj7);
        View view = viewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    public final void LJLLLLLL(SearchSugEntity searchSugEntity, int i, String str, String str2, String str3) {
        Word word = searchSugEntity.mWord;
        if (word == null) {
            return;
        }
        K8H k8h = new K8H();
        k8h.LJIILL("raw_query", this.LJLJLLL);
        k8h.LJIILL("words_content", word.getWord());
        k8h.LJIIZILJ(Integer.valueOf(i));
        k8h.LJIILL("impr_id", this.LJLILLLLZI);
        k8h.LJIILL("group_id", word.getId());
        k8h.LJIILL("button_type", str);
        k8h.LJIILL("words_source", "sug");
        k8h.LJIILL("sug_type", str2);
        k8h.LJ("feedback_id", str3, InterfaceC1798974f.LIZ);
        k8h.LJIILIIL();
    }
}
