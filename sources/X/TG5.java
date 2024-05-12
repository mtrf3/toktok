package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TG5<T> implements InterfaceC64592gB<OSZ<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ AbstractStickerView LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public TG5(AbstractStickerView abstractStickerView, int i) {
        this.LJLIL = abstractStickerView;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(OSZ<? extends Integer, ? extends Integer> osz) {
        C2067989r c2067989r;
        C2067989r c2067989r2;
        LiveData<TEN> pageState;
        OSZ<? extends Integer, ? extends Integer> osz2 = osz;
        this.LJLIL.LJLLLLLL = osz2.getSecond().intValue();
        TEN ten = null;
        if (osz2.getFirst().intValue() == this.LJLILLLLZI) {
            SearchStickerViewContainer searchStickerViewContainer = this.LJLIL.LJLLL;
            if (searchStickerViewContainer != null && !searchStickerViewContainer.LJIIL()) {
                AbstractStickerView.LIZJ(this.LJLIL).bb(false);
            }
            if (C74216TAu.LIZIZ.LIZIZ()) {
                TGS LJ = this.LJLIL.LJ();
                if (LJ != null && (pageState = LJ.getPageState()) != null) {
                    ten = pageState.getValue();
                }
                if (ten == TEN.ERROR && (c2067989r2 = this.LJLIL.LJLLILLLL) != null) {
                    c2067989r2.show(true);
                    return;
                }
                return;
            }
            return;
        }
        if (osz2.getSecond().intValue() != this.LJLILLLLZI) {
            return;
        }
        SearchStickerViewContainer searchStickerViewContainer2 = this.LJLIL.LJLLL;
        if (searchStickerViewContainer2 != null) {
            C74272TCy c74272TCy = searchStickerViewContainer2.LJLL;
            if (c74272TCy != null) {
                c74272TCy.LJLLI = false;
                if (!searchStickerViewContainer2.LIZLLL(null)) {
                    AbstractStickerView.LIZJ(this.LJLIL).bb(true);
                    if (C74216TAu.LIZIZ.LIZIZ() || (c2067989r = this.LJLIL.LJLLILLLL) == null) {
                    }
                    c2067989r.show(false);
                    return;
                }
            } else {
                o.LJIJI("stickerAdapter");
                throw null;
            }
        }
        AbstractStickerView.LIZJ(this.LJLIL).bb(false);
        if (C74216TAu.LIZIZ.LIZIZ()) {
        }
    }
}
