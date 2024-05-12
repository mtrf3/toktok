package X;

import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* renamed from: X.6eC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165286eC extends AbstractC48231ut<InterfaceC146365om, C5U0, C76800UCe, C76800UCe> implements InterfaceC146365om {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final InterfaceC65784Pro<C76800UCe> LJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;

    static {
        TBT tbt = new TBT(C165286eC.class, "asyncRenderService", "getAsyncRenderService()Lcom/ss/android/ugc/aweme/shortvideo/autocut/asyncrender/AutoCutAsyncRenderService;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C165286eC.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    private final InterfaceC143655kP LJZI() {
        return (InterfaceC143655kP) this.LJLLJ.LIZ(this, LJLLL[1]);
    }

    public final Y50 LJLZ() {
        return (Y50) this.LJLLILLLL.LIZ(this, LJLLL[0]);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        LiveData<C76800UCe> kn0;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        super.onCreate();
        Y50 LJLZ = LJLZ();
        if (LJLZ != null && (mutableLiveData2 = LJLZ.LIZJ) != null && o.LJ(mutableLiveData2.getValue(), Boolean.FALSE)) {
            show();
        }
        Y50 LJLZ2 = LJLZ();
        if (LJLZ2 != null && (mutableLiveData = LJLZ2.LIZJ) != null) {
            mutableLiveData.observe(this, new AObserverS70S0100000_2(this, 44));
        }
        InterfaceC143655kP LJZI = LJZI();
        if (LJZI != null && (kn0 = LJZI.kn0()) != null) {
            kn0.observe(this, new AObserverS70S0100000_2(this, 45));
        }
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C76800UCe> LJJLIIIJJI() {
        return this.LJLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C76800UCe> LJJLIIIJJIZ() {
        return this.LJLLI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165286eC(C82622Wbi diContainer, WMH parentScene) {
        super(parentScene);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLL = C165296eD.LJLIL;
        this.LJLLI = C165306eE.LJLIL;
        this.LJLLILLLL = UCI.LJII(diContainer, Y50.class, null);
        this.LJLLJ = UCI.LJII(diContainer, InterfaceC143655kP.class, null);
    }
}
