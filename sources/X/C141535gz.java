package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141535gz extends AbstractC29891Fh<InterfaceC140305f0> implements InterfaceC140305f0, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C5H3 LJLJL;
    public final C40871j1<Boolean> LJLJLJ;
    public final C29901Fi<OSZ<Float, Long>> LJLJLLL;
    public final C29901Fi<OSJ<Float, Float, Float>> LJLL;
    public final C5H3 LJLLI;

    static {
        TBT tbt = new TBT(C141535gz.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C141535gz.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C141535gz.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    public InterfaceC140305f0 LJJLI() {
        return this;
    }

    private final InterfaceC142515iZ LJJLIIIIJ() {
        return (InterfaceC142515iZ) this.LJLJJL.LIZ(this, LJLLILLLL[1]);
    }

    private final InterfaceC146235oZ LJJLIIIJILLIZJL() {
        return (InterfaceC146235oZ) this.LJLJJI.LIZ(this, LJLLILLLL[0]);
    }

    private final VideoPublishEditModel LJJLIIIJJI() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJLLILLLL[2]);
    }

    private final C145135mn LJJLIIIJJIZ() {
        return (C145135mn) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC140305f0
    public MutableLiveData<FilterBean> YG() {
        return (MutableLiveData) this.LJLLI.getValue();
    }

    @Override // X.InterfaceC140305f0
    public void f90() {
        if (!this.LJLILLLLZI.isAdded(LJJLIIIJJIZ())) {
            this.LJLILLLLZI.add(this.LJLJI, LJJLIIIJJIZ(), "EditGestureScene");
        }
        if (H7R.LJJLIIIJJIZ(LJJLIIIJJI()) || !H7R.LJJJJI(LJJLIIIJJI()) || !C78541Us5.LIZJ()) {
            return;
        }
        LJJLIIIJILLIZJL().Yn0(true);
    }

    @Override // X.InterfaceC140305f0
    public void zv() {
        if (this.LJLILLLLZI.isAdded(LJJLIIIJJIZ())) {
            this.LJLILLLLZI.hide(LJJLIIIJJIZ());
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIIJ().fc(this);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLIIIIJ().fc(null);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC140305f0 getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC140305f0
    public LiveEvent<OSJ<Float, Float, Float>> hI() {
        return this.LJLL;
    }

    @Override // X.InterfaceC140305f0
    public LiveEvent<OSZ<Float, Long>> r60() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC140305f0
    public C0IB<Boolean> xp() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC140305f0
    public void L6(boolean z) {
        this.LJLJLJ.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC140305f0
    public void ic(float f, long j) {
        this.LJLJLLL.LJII(new OSZ<>(Float.valueOf(f), Long.valueOf(j)));
    }

    public C141535gz(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC146235oZ.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 394));
        this.LJLJLJ = new C40871j1<>(null);
        this.LJLJLLL = new C29901Fi<>();
        this.LJLL = new C29901Fi<>();
        this.LJLLI = C221108m2.LIZIZ(C141545h0.LJLIL);
    }

    @Override // X.InterfaceC140305f0
    public void hM(float f, float f2, float f3) {
        this.LJLL.LJII(new OSJ<>(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }
}
