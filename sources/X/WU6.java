package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.tools.live.RecordLiveViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WU6<F, T> implements InterfaceC65644PpY {
    public final /* synthetic */ WU4 LJLIL;

    public WU6(WU4 wu4) {
        this.LJLIL = wu4;
    }

    @Override // X.InterfaceC65644PpY
    public final Object apply(Object obj) {
        FilterBean filterBean = (FilterBean) obj;
        if (filterBean != null) {
            WU4 wu4 = this.LJLIL;
            wu4.LLJJIJIIJIL().LIZJ();
            RecordLiveViewModel recordLiveViewModel = wu4.LJLJJL;
            if (recordLiveViewModel != null) {
                InterfaceC83727WtX effectController = recordLiveViewModel.gv0().getEffectController();
                String filterFolder = filterBean.getFilterFolder();
                o.LJIIIIZZ(filterFolder, "it.filterFolder");
                Float valueOf = Float.valueOf(effectController.getFilterIntensity(filterFolder));
                if (valueOf != null) {
                    return valueOf;
                }
            } else {
                o.LJIJI("recordLiveViewModel");
                throw null;
            }
        }
        return Float.valueOf(0.0f);
    }
}
