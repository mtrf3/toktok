package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.WHu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82042WHu extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82043WHv LJLJJLL;

    static {
        TBT tbt = new TBT(C82042WHu.class, "filterPanelApi", "getFilterPanelApi()Lcom/bytedance/creativex/recorder/filter/api/FilterPanelApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82042WHu.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_modify_entrance");
        ((THT) this.LJLJJL.LIZ(this, LJLJL[0])).vc0(true);
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C82042WHu(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, THT.class, null);
        this.LJLJJLL = new C82043WHv();
        UCI.LJI(diContainer, ShortVideoContext.class, null);
    }
}
