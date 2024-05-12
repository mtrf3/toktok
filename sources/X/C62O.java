package X;

import Y.AObserverS70S0100000_2;
import com.ss.android.ugc.aweme.nows.ui.NowsEditRootScene;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.62O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62O extends AbstractC165596eh<EditToolbarViewModel> implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final WMH LJLJLJ;
    public final C82622Wbi LJLJLLL;
    public final int LJLL;
    public final C62P LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C82632Wbs LJLLJ;

    static {
        TBT tbt = new TBT(C62O.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        this.LJLJLJ.add(this.LJLL, (WM7) this.LJLLILLLL.getValue(), "EditSideToolbarComponent");
        ((InterfaceC143655kP) this.LJLLJ.LIZ(this, LJLLL[0])).Zq0().observe(this, new AObserverS70S0100000_2(this, 41));
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EditToolbarViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLLL;
    }

    public C62O(NowsEditRootScene parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJLJ = parentScene;
        this.LJLJLLL = diContainer;
        this.LJLL = R.id.cq2;
        this.LJLLI = C62P.LJLIL;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 134));
        this.LJLLJ = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
    }
}
