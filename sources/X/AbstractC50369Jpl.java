package X;

import Y.ARunnableS22S0200000_3;
import Y.ARunnableS43S0100000_7;
import Y.ARunnableS44S0100000_8;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jpl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50369Jpl<T extends Fragment> extends AbstractC51499KJb {
    public final int LJLJL;
    public final HashMap<Integer, T> LJLJLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        HashMap<Integer, T> hashMap = this.LJLJLJ;
        if (hashMap != null) {
            hashMap.clear();
        }
        super.notifyDataSetChanged();
    }

    public final void LJJIJIIJI() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJL;
    }

    public AbstractC50369Jpl(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.LJLJL = i;
        this.LJLJLJ = new LinkedHashMap();
    }

    @Override // X.AbstractC51499KJb, androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup viewGroup) {
        Object LJIILLIIL = super.LJIILLIIL(i, viewGroup);
        this.LJLJLJ.put(Integer.valueOf(i), LJIILLIIL);
        return LJIILLIIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51502KJe
    public final Object LJJIII(int i, ViewGroup viewGroup) {
        HashMap hashMap;
        HashMap hashMap2;
        C50370Jpm c50370Jpm = (C50370Jpm) this;
        if (i == C50605JtZ.LJIIJJI()) {
            ActivityC45651qj context = c50370Jpm.LJLJLLL;
            if (C34160Dau.LJFF()) {
                java.util.Map<String, Integer> map = KK8.LIZ;
                if ((map instanceof LinkedHashMap) && (hashMap2 = (HashMap) map) != null) {
                    hashMap2.put("search_layout_search_bot", 1);
                }
                if ((map instanceof LinkedHashMap) && (hashMap = (HashMap) map) != null) {
                    hashMap.put("search_bot_video_holder", 4);
                }
            }
            if (C49500Jbk.LIZ()) {
                o.LJIIIZ(context, "context");
                C38995FSd.LIZJ().execute(new ARunnableS22S0200000_3(KK8.LIZ, context, 52));
            } else if (context instanceof InterfaceC45601Hv3) {
                if (C34082DZe.LJLILLLLZI.LJJII()) {
                    InterfaceC45601Hv3 inflaterOwner = (InterfaceC45601Hv3) context;
                    o.LJIIIZ(inflaterOwner, "inflaterOwner");
                    C37190Eig.LIZ.post(new ARunnableS44S0100000_8(inflaterOwner, 117));
                }
                if (C50086JlC.LIZ().enableVideoLayoutPreInflate) {
                    InterfaceC45601Hv3 inflaterOwner2 = (InterfaceC45601Hv3) context;
                    o.LJIIIZ(inflaterOwner2, "inflaterOwner");
                    C37190Eig.LIZ.post(new ARunnableS43S0100000_7(inflaterOwner2, 127));
                }
                if (C34160Dau.LJFF()) {
                    InterfaceC45601Hv3 inflaterOwner3 = (InterfaceC45601Hv3) context;
                    o.LJIIIZ(inflaterOwner3, "inflaterOwner");
                    C37190Eig.LIZ.post(new ARunnableS43S0100000_7(inflaterOwner3, 126));
                }
            }
            if ((context instanceof InterfaceC45601Hv3) && C34516Dge.LIZ) {
                SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) ViewModelProviders.of(context).get(SearchGlobalViewModel.class);
                boolean z = false;
                if (!o.LJ(searchGlobalViewModel.hv0(false), "auto")) {
                    z = searchGlobalViewModel.lv0();
                }
                C50365Jph.LIZJ((InterfaceC45601Hv3) context, z);
            }
        }
        AbsSearchBaseFragment LIZ = C50003Jjr.LIZ(c50370Jpm.LJLJLLL, c50370Jpm.LJLLI, i, c50370Jpm.LJLL);
        LIZ.Dl(i);
        return LIZ;
    }
}
