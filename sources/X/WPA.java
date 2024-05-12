package X;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS118S0300000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPA extends AbstractC163776bl<FilterPanelViewModel> implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJZ;
    public boolean LJLJLJ;
    public final C5H3 LJLJLLL;
    public final AqS164S0100000_14 LJLL;
    public final WPB LJLLI;
    public final WMH LJLLILLLL;
    public final C82622Wbi LJLLJ;
    public final int LJLLL;
    public final String LJLLLL;
    public final InterfaceC82245WPp LJLLLLLL;
    public final InterfaceC81328Vvw LJLZ;

    static {
        TBT tbt = new TBT(WPA.class, "context", "getContext()Landroid/app/Activity;", 0);
        C65352Pkq.LIZ.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt};
    }

    public WPA() {
        throw null;
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        WP0 wp0 = (WP0) this.LJLJLLL.getValue();
        if (wp0.LJLJJL) {
            WP7 wp7 = wp0.LJLJJI;
            if (wp7 != null) {
                wp7.LIZ(WP8.HIDE);
            } else {
                o.LJIJI("combiner");
                throw null;
            }
        }
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        if (!this.LJLJLJ) {
            this.LJLLILLLL.add(this.LJLLL, (WM7) this.LJLJLLL.getValue(), "RecordFilterPanelScene");
            this.LJLJLJ = true;
        }
        WP0 wp0 = (WP0) this.LJLJLLL.getValue();
        wp0.getClass();
        new AqS180S0100000_14(wp0, 1).invoke(wp0.LJLJLLL.getValue());
        if (wp0.LJLL) {
            C74216TAu c74216TAu = C74216TAu.LIZIZ;
            if (c74216TAu.LIZIZ() && !c74216TAu.LJIIIZ()) {
                wp0.LJLL = false;
                C78596Usy.LJJJLIIL(wp0.requireApplicationContext(), true);
            }
        }
    }

    public final WPD LJJLIIJ() {
        LiveData<List<WPD>> filterSources;
        List<WPD> value;
        WPD wpd = null;
        WRP wrp = (WRP) ((C1EP) this.LJLLJ.LJ(C1EP.class, null)).sO(WRP.class);
        if (wrp != null && (filterSources = wrp.getFilterSources()) != null && (value = filterSources.getValue()) != null) {
            Iterator<WPD> it = value.iterator();
            while (it.hasNext()) {
                wpd = it.next();
                if (o.LJ(wpd.LJLIL, this.LJLLLL)) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return wpd;
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FilterPanelViewModel> LJJLIIIJILLIZJL() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLLJ;
    }

    public WPA(WMH parentScene, C82622Wbi diContainer, WQI wqi, InterfaceC81328Vvw interfaceC81328Vvw, AqS118S0300000_14 aqS118S0300000_14) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLLILLLL = parentScene;
        this.LJLLJ = diContainer;
        this.LJLLL = R.id.iri;
        this.LJLLLL = "build_in";
        this.LJLLLLLL = wqi;
        this.LJLZ = interfaceC81328Vvw;
        UCI.LJI(diContainer, Activity.class, null);
        this.LJLJLLL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS164S0100000_14(this, 4));
        this.LJLL = new AqS164S0100000_14(this, 5);
        WPB wpb = new WPB(0);
        this.LJLLI = wpb;
        aqS118S0300000_14.invoke(wpb);
    }
}
