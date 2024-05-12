package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.603, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass603 extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;

    static {
        TBT tbt = new TBT(AnonymousClass603.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/optimize/EditToolbarApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(AnonymousClass603.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(AnonymousClass603.class, "titlebarApi", "getTitlebarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/TitlebarApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return new WI1() { // from class: X.604
            public final C6MP LJIIIZ = C6MP.EMPTY;

            @Override // X.WI1
            public final WI0 LIZJ() {
                return new WI0(null, Integer.MAX_VALUE, true, 1);
            }

            @Override // X.WI1
            public final C6MP LJIIIIZZ() {
                return this.LJIIIZ;
            }
        };
    }

    @Override // X.WJB
    public final void LIZLLL() {
        Integer num = C151105wQ.LJI;
        if (num != null) {
            ((InterfaceC153275zv) this.LJLJJL.LIZ(this, LJLJL[0])).M0(num.intValue());
        }
        ((InterfaceC153185zm) this.LJLJJLL.LIZ(this, LJLJL[2])).lz(this.LJLJI, new AqS168S0100000_2(this, 394));
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public AnonymousClass603(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, C148195rj config) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(config, "config");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, C6MS.class, null);
        UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC153185zm.class, null);
    }
}
