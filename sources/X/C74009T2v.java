package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileDetailJediWidget;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T2v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74009T2v implements InterfaceC51679KPz {
    public final EffectProfileListViewModel LJLIL;
    public EffectProfileDetailJediWidget LJLILLLLZI;
    public boolean LJLJI;

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
        return i + 10000;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
    }

    @Override // X.InterfaceC51679KPz
    public final /* bridge */ /* synthetic */ Object getViewModel() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return this.LJLJI;
    }

    public C74009T2v(EffectProfileListViewModel effectProfileListViewModel) {
        this.LJLIL = effectProfileListViewModel;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA panel) {
        o.LJIIIZ(panel, "panel");
        EffectProfileListViewModel effectProfileListViewModel = this.LJLIL;
        if (effectProfileListViewModel != null) {
            EffectProfileDetailJediWidget effectProfileDetailJediWidget = this.LJLILLLLZI;
            if (effectProfileDetailJediWidget != null) {
                ListViewModel.Mv0(effectProfileListViewModel, effectProfileDetailJediWidget, null, new C74012T2y(T34.INSTANCE, T32.INSTANCE, new AqS174S0200000_12(panel, this, 25)), new C74011T2x(new AqS143S0200000_12(panel, this, 150), new AqS174S0200000_12(panel, this, 26), new AqS174S0200000_12(panel, this, 27)), 242);
            } else {
                o.LJIJI("jediView");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        if (this.LJLIL == null) {
            return false;
        }
        o.LJI(owner.mo49getActivity());
        this.LJLILLLLZI = new EffectProfileDetailJediWidget();
        C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
        View view = owner.getView();
        c72714SgI.getClass();
        C72713SgH LIZ = C72714SgI.LIZ(view, owner);
        EffectProfileDetailJediWidget effectProfileDetailJediWidget = this.LJLILLLLZI;
        if (effectProfileDetailJediWidget != null) {
            LIZ.LJ(effectProfileDetailJediWidget);
            return true;
        }
        o.LJIJI("jediView");
        throw null;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        EffectProfileListViewModel effectProfileListViewModel;
        o.LJIIIZ(feedParam, "feedParam");
        if (i != 1) {
            if (i != 4 || (effectProfileListViewModel = this.LJLIL) == null) {
                return;
            }
            effectProfileListViewModel.LJIIJJI();
            return;
        }
        EffectProfileListViewModel effectProfileListViewModel2 = this.LJLIL;
        if (effectProfileListViewModel2 == null) {
            return;
        }
        effectProfileListViewModel2.refresh();
    }
}
