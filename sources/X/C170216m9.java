package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.effect.StickerEffectTabFragment;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170216m9 extends C1BD {
    public List<EffectCategoryResponse> LJLJLJ;
    public final Context LJLJLLL;
    public Fragment LJLL;
    public final List<Effect> LJLLI;
    public final C84507XEp LJLLILLLL;
    public final boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJLJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        if (i == getCount() - 1) {
            return this.LJLJLLL.getString(R.string.s0m);
        }
        return ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(this.LJLJLJ, i)).getName();
    }

    @Override // X.C1BD
    public final Fragment LJJIII(int i) {
        if (i == getCount() - 1 && !this.LJLLL) {
            return new TimeEffectTabFragment();
        }
        if (!C132425Hq.LIZ() && C164996dj.LIZIZ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(this.LJLJLJ, i)).getKey())) {
            StickerEffectTabFragment Gl = StickerEffectTabFragment.Gl(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(this.LJLJLJ, i)).getKey(), ((EffectCategoryResponseTemplate) ListProtector.get(this.LJLJLJ, i)).getTotalEffects(), this.LJLLJ);
            Gl.LJLJLJ = this.LJLLILLLL;
            return Gl;
        }
        FilterEffectTabFragment Jl = FilterEffectTabFragment.Jl(((EffectCategoryResponseTemplate) ListProtector.get(this.LJLJLJ, i)).getTotalEffects(), this.LJLLLL, this.LJLLJ, ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(this.LJLJLJ, i)).getKey());
        Jl.LJLJLJ = this.LJLLILLLL;
        return Jl;
    }

    public final EffectCategoryResponse LJJIIJ(int i) {
        if (i < this.LJLJLJ.size()) {
            return (EffectCategoryResponse) ListProtector.get(this.LJLJLJ, i);
        }
        return null;
    }

    public final void setData(List<EffectCategoryResponse> list) {
        this.LJLJLJ = list;
        ((ArrayList) this.LJLLI).clear();
        ArrayList arrayList = new ArrayList();
        Iterator<EffectCategoryResponse> it = this.LJLJLJ.iterator();
        while (it.hasNext()) {
            List<Effect> totalEffects = it.next().getTotalEffects();
            if (totalEffects != null) {
                arrayList.addAll(totalEffects);
            }
        }
        int LIZIZ = C60903NvH.LJIIJJI().LJIJI().LIZIZ();
        if (LIZIZ >= 0) {
            for (int i = 0; i < LIZIZ && i < arrayList.size(); i++) {
                Effect effect = (Effect) ListProtector.get(arrayList, i);
                this.LJLLILLLL.getClass();
                if (!C84507XEp.LJ(effect)) {
                    ((ArrayList) this.LJLLI).add(effect);
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Effect effect2 = (Effect) it2.next();
                this.LJLLILLLL.getClass();
                if (!C84507XEp.LJ(effect2)) {
                    ((ArrayList) this.LJLLI).add(effect2);
                }
            }
        }
        this.LJLLILLLL.LJIIIIZZ(this.LJLLI);
        notifyDataSetChanged();
    }

    public C170216m9(FragmentManager fragmentManager, ActivityC45651qj activityC45651qj, boolean z) {
        super(fragmentManager, 0);
        this.LJLJLJ = new ArrayList();
        this.LJLLI = new ArrayList();
        this.LJLLL = false;
        this.LJLLLL = true;
        this.LJLJLLL = activityC45651qj;
        this.LJLLJ = z;
        C17N c17n = new C17N();
        C170266mE c170266mE = new C170266mE();
        c170266mE.LIZ = 3;
        c170266mE.LIZIZ = c17n;
        this.LJLLILLLL = c170266mE.LIZ();
        C60903NvH.LJIIJJI().initDownloadableModel();
    }

    @Override // X.C1BD, androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup viewGroup, Object obj) {
        this.LJLL = (Fragment) obj;
        super.LJIL(i, viewGroup, obj);
    }
}
