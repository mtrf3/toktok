package X;

import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPG extends AbstractC163776bl<EditFilterViewModel> implements InterfaceC135635Tz {
    public WPF LJLJLJ;
    public final AqS164S0100000_14 LJLJLLL;
    public final C82622Wbi LJLL;
    public final WMH LJLLI;
    public final int LJLLILLLL;
    public final InterfaceC82236WPg LJLLJ;
    public final InterfaceC84497XEf LJLLL;
    public final InterfaceC82231WPb LJLLLL;
    public final InterfaceC88472Yns<C82252WPw, C76800UCe> LJLLLLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        WMH wmh = this.LJLLI;
        WPF wpf = this.LJLJLJ;
        if (wpf != null) {
            if (!wmh.isAdded(wpf)) {
                WMH wmh2 = this.LJLLI;
                int i = this.LJLLILLLL;
                WPF wpf2 = this.LJLJLJ;
                if (wpf2 != null) {
                    wmh2.add(i, wpf2, "EditFilterScene");
                    return;
                } else {
                    o.LJIJI(WM7.SCENE_SERVICE);
                    throw null;
                }
            }
            return;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        this.LJLJLJ = new WPF(this.LJLL, this.LJLLJ, this.LJLLL, this.LJLLLLLL);
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLLI;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EditFilterViewModel> LJJLIIIJILLIZJL() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    public WPG(C82622Wbi diContainer, WMH parentScene, int i, InterfaceC82236WPg filterRepository, InterfaceC84498XEg effectPlatform, InterfaceC82231WPb interfaceC82231WPb, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(filterRepository, "filterRepository");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LJLL = diContainer;
        this.LJLLI = parentScene;
        this.LJLLILLLL = i;
        this.LJLLJ = filterRepository;
        this.LJLLL = effectPlatform;
        this.LJLLLL = interfaceC82231WPb;
        this.LJLLLLLL = interfaceC88472Yns;
        this.LJLJLLL = new AqS164S0100000_14(this, 201);
    }
}
