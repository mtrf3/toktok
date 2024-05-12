package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJG extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82046WHy LJLJJLL;
    public final C82632Wbs LJLJL;

    static {
        TBT tbt = new TBT(WJG.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WJG.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        ((WLB) this.LJLJL.LIZ(this, LJLJLJ[1])).cE().LIZIZ(this.LJLJI, new AObjectS89S0100000_14(this, 427));
    }

    @Override // X.WJB
    public final void LJFF() {
        I27 LIZ = ((WLB) this.LJLJL.LIZ(this, LJLJLJ[1])).cE().LIZ();
        if (LIZ != null) {
            LIZ.openMusicPanel();
        }
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public WJG(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        C82632Wbs LJI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJJL = LJI;
        C82046WHy c82046WHy = new C82046WHy();
        c82046WHy.LJFF = MusicBeanUtilKt.extractAVMusic(((ShortVideoContext) LJI.LIZ(this, LJLJLJ[0])).creativeModel.musicBuzModel) != null;
        this.LJLJJLL = c82046WHy;
        this.LJLJL = UCI.LJI(diContainer, WLB.class, null);
    }
}
