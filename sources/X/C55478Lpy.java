package X;

import Y.AfS58S0200000_9;
import Y.AfS61S0100000_9;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lpy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C55478Lpy implements InterfaceC51679KPz {
    public static final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C55479Lpz.LJLIL);
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public KQA LJLILLLLZI;
    public List<Aweme> LJLJI;
    public boolean LJLJJI;

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return null;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        List<Aweme> list = this.LJLJI;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLIL.dispose();
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return this.LJLJJI;
    }

    public final void LIZ(List<? extends Aweme> list) {
        this.LJLJI = ORZ.LLJILJILJ(list);
        KQA kqa = this.LJLILLLLZI;
        if (kqa != null) {
            kqa.J5(list, false);
        }
        KQA kqa2 = this.LJLILLLLZI;
        if (kqa2 != null) {
            kqa2.ZF(new OSZ<>(0, ListProtector.get(list, 0)));
        }
    }

    public void LIZIZ(M89 feedParam) {
        o.LJIIIZ(feedParam, "feedParam");
        C55480Lq0.LIZIZ.LIZLLL(249372176, 4);
        StoryApi storyApi = StoryApi.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(feedParam.getAid());
        LIZ.append(']');
        C78999UzT.LJFF(storyApi.queryBatchAwemeRx(X1D.LIZIZ(LIZ), feedParam.getEventType(), feedParam.getPushParams(), 1).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 34), new AfS58S0200000_9(this, feedParam, 12)), this.LJLIL);
    }

    public final void LIZJ(int i) {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        KQA kqa = this.LJLILLLLZI;
        if (kqa != null && (fragment = kqa.getFragment()) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            String string = mo49getActivity.getString(i);
            o.LJIIIIZZ(string, "activity.getString(strRes)");
            C26045AKb c26045AKb = new C26045AKb(mo49getActivity);
            c26045AKb.LJIIIZ(string);
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.LJLILLLLZI = detailFragmentPanel;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        this.LJLJJI = true;
        LIZIZ(feedParam);
    }
}
