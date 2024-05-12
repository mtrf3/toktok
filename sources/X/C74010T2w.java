package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.ss.android.ugc.aweme.detail.operators.JediWidget;
import com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListState;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T2w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74010T2w implements InterfaceC51679KPz {
    public final CommonListViewModel<Object, MusicAwemeListState> LJLIL;
    public JediWidget LJLILLLLZI;
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
        return LivePlayerResourceReleaseSetting.ENABLE;
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

    public C74010T2w(CommonListViewModel<Object, MusicAwemeListState> commonListViewModel) {
        this.LJLIL = commonListViewModel;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA panel) {
        o.LJIIIZ(panel, "panel");
        CommonListViewModel<Object, MusicAwemeListState> commonListViewModel = this.LJLIL;
        if (commonListViewModel != null) {
            JediWidget jediWidget = this.LJLILLLLZI;
            if (jediWidget != null) {
                ListViewModel.Mv0(commonListViewModel, jediWidget, null, new T30(T33.INSTANCE, T31.INSTANCE, new AqS174S0200000_12(panel, this, 5)), new C74013T2z(new AqS143S0200000_12(panel, this, 26), new AqS174S0200000_12(panel, this, 6), new AqS174S0200000_12(panel, this, 7)), 242);
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
        this.LJLILLLLZI = new JediWidget();
        C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
        View view = owner.getView();
        o.LJI(view);
        c72714SgI.getClass();
        C72713SgH LIZ = C72714SgI.LIZ(view, owner);
        JediWidget jediWidget = this.LJLILLLLZI;
        if (jediWidget != null) {
            LIZ.LJ(jediWidget);
            return true;
        }
        o.LJIJI("jediView");
        throw null;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        CommonListViewModel<Object, MusicAwemeListState> commonListViewModel;
        o.LJIIIZ(feedParam, "feedParam");
        if (i != 1) {
            if (i != 4 || (commonListViewModel = this.LJLIL) == null) {
                return;
            }
            commonListViewModel.LJIIJJI();
            return;
        }
        CommonListViewModel<Object, MusicAwemeListState> commonListViewModel2 = this.LJLIL;
        if (commonListViewModel2 == null) {
            return;
        }
        commonListViewModel2.refresh();
    }
}
