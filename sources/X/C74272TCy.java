package X;

import Y.AObserverS80S0100000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TCy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74272TCy extends AbstractC73295Spf<Effect> {
    public String LJLJL;
    public String LJLJLJ;
    public final HashSet<String> LJLJLLL;
    public List<? extends Effect> LJLL;
    public boolean LJLLI;
    public final ActivityC45651qj LJLLILLLL;
    public final TEZ LJLLJ;
    public final TEF LJLLL;
    public final TE0 LJLLLL;
    public final MutableLiveData<AbstractC72800Shg> LJLLLLLL;
    public final C0A2 LJLZ;
    public final int LJZ;
    public final InterfaceC65784Pro<String> LJZI;

    @Override // X.AbstractC73295Spf
    public final void LJLLLLLL(C73365Sqn<Effect> holder) {
        o.LJIIIZ(holder, "holder");
        holder.N(1.1f, this.LJLLLL.LJLJLJ.LJLLLLLL);
    }

    @Override // X.AbstractC73295Spf
    public final void LL(C73275SpL c73275SpL) {
        super.LL(c73275SpL);
        c73275SpL.LIZ(new AqS178S0100000_12(this, 691), new AqS178S0100000_12(this, 692));
        c73275SpL.LIZ(C2N4.LJLIL, new AqS178S0100000_12(this, 693));
    }

    public final int LLD(Effect effect) {
        if (this.LJZ == 3) {
            return ORZ.LJZ(effect, this.LJLL);
        }
        return LJLZ(effect);
    }

    @Override // X.AbstractC73295Spf, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        LifecycleOwner LJIIJJI = C1XY.LJIIJJI(recyclerView);
        if (LJIIJJI == null) {
            LJIIJJI = this.LJLLILLLL;
        }
        this.LJLLJ.LJIIIIZZ().LIZ().observe(LJIIJJI, new AObserverS80S0100000_12(this, 134));
        this.LJLJJL.Sg0().observe(LJIIJJI, new AObserverS80S0100000_12(this, 135));
        this.LJLJJL.qK().observe(LJIIJJI, new AObserverS80S0100000_12(this, 136));
    }

    public final void setData(List<? extends Effect> data) {
        o.LJIIIZ(data, "data");
        if (this.LJZ == 3) {
            this.LJLJL = "recommend";
            Iterator<? extends Effect> it = data.iterator();
            while (it.hasNext()) {
                it.next().setSearchType("prop_recommend");
            }
            this.LJLL = data;
        } else {
            this.LJLJL = "search";
            Iterator<? extends Effect> it2 = data.iterator();
            while (it2.hasNext()) {
                it2.next().setSearchType("prop_search");
            }
        }
        this.LJLILLLLZI = ORZ.LLJILJILJ(data);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC73295Spf
    /* renamed from: LJZ */
    public final void onBindViewHolder(C73365Sqn<Effect> holder, int i) {
        o.LJIIIZ(holder, "holder");
        super.onBindViewHolder(holder, i);
        Effect item = getItem(i);
        if (item == null || i <= 0 || this.LJLJLLL.contains(item.getEffectId())) {
            return;
        }
        this.LJLJLLL.add(item.getEffectId());
        this.LJLLLLLL.setValue(new C72795Shb(i, item, this.LJLJL, this.LJLJLJ, this.LJZI.invoke()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74272TCy(ActivityC45651qj activity, TEZ stickerDataManager, TEF tagHandler, T4I listViewModel, TE0 listViewConfigure, MutableLiveData searchPropMobEvent, C0A2 c0a2, int i, InterfaceC65784Pro interfaceC65784Pro) {
        super(listViewModel, listViewConfigure);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(listViewModel, "listViewModel");
        o.LJIIIZ(listViewConfigure, "listViewConfigure");
        o.LJIIIZ(searchPropMobEvent, "searchPropMobEvent");
        this.LJLLILLLL = activity;
        this.LJLLJ = stickerDataManager;
        this.LJLLL = tagHandler;
        this.LJLLLL = listViewConfigure;
        this.LJLLLLLL = searchPropMobEvent;
        this.LJLZ = c0a2;
        this.LJZ = i;
        this.LJZI = interfaceC65784Pro;
        this.LJLJL = "search";
        this.LJLJLJ = CardStruct.IStatusCode.DEFAULT;
        this.LJLJLLL = new HashSet<>();
        this.LJLL = new ArrayList();
        this.LJLJI = -1;
    }
}
