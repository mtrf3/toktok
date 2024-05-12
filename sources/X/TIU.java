package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIU extends AbstractC163776bl<EditFilterIndicatorViewModel> implements InterfaceC135635Tz {
    public final boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final TIV LJLL;
    public final C82622Wbi LJLLI;
    public final WMH LJLLILLLL;
    public final int LJLLJ;
    public final FilterBean LJLLL;
    public final InterfaceC82236WPg LJLLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        if (this.LJLLILLLL.isAdded((WM7) this.LJLJLLL.getValue())) {
            this.LJLLILLLL.hide((WM7) this.LJLJLLL.getValue());
        }
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        if (!this.LJLLILLLL.isAdded((WM7) this.LJLJLLL.getValue())) {
            this.LJLLILLLL.add(this.LJLLJ, (WM7) this.LJLJLLL.getValue(), "EditFilterIndicatorScene");
        }
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EditFilterIndicatorViewModel> LJJLIIIJILLIZJL() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    public TIU(C82622Wbi diContainer, WMH parentScene, FilterBean filterBean, InterfaceC82236WPg filterRepository) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(filterRepository, "filterRepository");
        this.LJLLI = diContainer;
        this.LJLLILLLL = parentScene;
        this.LJLLJ = R.id.coo;
        this.LJLLL = filterBean;
        this.LJLLLL = filterRepository;
        this.LJLJLJ = true;
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1214));
        this.LJLL = TIV.LJLIL;
    }
}
