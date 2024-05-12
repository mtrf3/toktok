package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WII extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final Boolean LJLJJL;
    public final C82632Wbs LJLJJLL;
    public boolean LJLJL;
    public final WI8 LJLJLJ;
    public final C82632Wbs LJLJLLL;

    static {
        TBT tbt = new TBT(WII.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WII.class, "beautyApi", "getBeautyApi()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        if (o.LJ(this.LJLJJL, Boolean.TRUE)) {
            this.LJLJL = false;
            this.LJLJLJ.LJIIIZ = false;
        }
        ((I37) this.LJLJLLL.LIZ(this, LJLL[1])).Hg0().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 412));
    }

    @Override // X.WJB
    public final void LJFF() {
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_beautify_entrance");
        boolean z = true;
        this.LJLJL = !this.LJLJL;
        I37 i37 = (I37) this.LJLJJLL.LIZ(this, LJLL[0]);
        boolean z2 = this.LJLJL;
        this.LJLJLJ.getClass();
        if (C86798Y4s.LIZJ() != R.string.rtw) {
            z = false;
        }
        i37.tk0(z2, z);
        this.LJLJLJ.LJIIIZ = this.LJLJL;
        LJ();
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return HYV.LIZ();
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public WII(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        Boolean bool;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        RecordPageOptionalConfig recordPageOptionalConfig;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        ShortVideoContext shortVideoContext = (ShortVideoContext) diContainer.LJIIIIZZ(null, ShortVideoContext.class);
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (creativeInitialModel = creativeModel.initialModel) != null && (recordPageOptionalConfig = creativeInitialModel.recordPageOptionalConfig) != null) {
            bool = Boolean.valueOf(recordPageOptionalConfig.nopeMemory);
        } else {
            bool = null;
        }
        this.LJLJJL = bool;
        this.LJLJJLL = UCI.LJI(diContainer, I37.class, null);
        this.LJLJL = C78886Uxe.LJFF().LIZIZ();
        this.LJLJLJ = new WI8();
        this.LJLJLLL = UCI.LJI(diContainer, I37.class, null);
    }
}
