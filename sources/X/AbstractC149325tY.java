package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.5tY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC149325tY extends AbstractC29891Fh<InterfaceC153185zm> implements InterfaceC135635Tz, InterfaceC153185zm {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final C40871j1<Boolean> LJLJJLL;
    public final C40871j1<String> LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public final C40871j1<Integer> LJLJLLL;
    public final C40871j1<Integer> LJLL;
    public final LiveEvent<C76800UCe> LJLLI;
    public final LiveData<Boolean> LJLLILLLL;
    public final LiveData<Boolean> LJLLJ;

    public InterfaceC153185zm LJJLI() {
        return this;
    }

    private final MutableLiveData<Boolean> LJJLIIIIJ() {
        return (MutableLiveData) this.LJLJI.getValue();
    }

    private final MutableLiveData<Boolean> LJJLIIIJJI() {
        return (MutableLiveData) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC153185zm
    public void LJLIIIL() {
        LiveEvent<C76800UCe> Pi = Pi();
        o.LJII(Pi, "null cannot be cast to non-null type com.bytedance.als.MutableLiveEvent<kotlin.Unit>");
        ((C29901Fi) Pi).LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC153185zm
    public LiveData<Boolean> I6() {
        return this.LJLLILLLL;
    }

    public WMH LJJLIIIJILLIZJL() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC153185zm
    public LiveEvent<C76800UCe> Pi() {
        return this.LJLLI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC153185zm getApiComponent() {
        LJJLI();
        return this;
    }

    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC153185zm
    public LiveData<Boolean> n2() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC153185zm
    public void LZ(int i) {
        this.LJLL.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC153185zm
    public void V10(boolean z) {
        this.LJLJJLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153185zm
    public void cm(String value) {
        o.LJIIIZ(value, "value");
        this.LJLJL.LJI(value);
    }

    @Override // X.InterfaceC153185zm
    public void du(boolean z) {
        LJJLIIIIJ().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153185zm
    public void f0(int i) {
        this.LJLJLLL.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC153185zm
    public void xD(boolean z) {
        LJJLIIIJJI().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153185zm
    public void yd(boolean z) {
        this.LJLJJL.setValue(Boolean.valueOf(z));
    }

    public AbstractC149325tY(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = C221108m2.LIZIZ(C149315tX.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(C149305tW.LJLIL);
        this.LJLJJL = new MutableLiveData<>(null);
        this.LJLJJLL = new C40871j1<>(null);
        this.LJLJL = new C40871j1<>(null);
        this.LJLJLJ = new C29901Fi<>();
        this.LJLJLLL = new C40871j1<>(null);
        this.LJLL = new C40871j1<>(null);
        this.LJLLI = new C29901Fi();
        this.LJLLILLLL = LJJLIIIIJ();
        this.LJLLJ = LJJLIIIJJI();
    }

    @Override // X.InterfaceC153185zm
    public void Mw(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super String, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        this.LJLJL.LIZIZ(this, new AObjectS84S0100000_2(func, 219));
    }

    @Override // X.InterfaceC153185zm
    public void lz(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Integer, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        this.LJLJLLL.LIZIZ(this, new AObjectS84S0100000_2(func, 222));
    }

    @Override // X.InterfaceC153185zm
    public void xe(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Boolean, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        this.LJLJJLL.LIZIZ(this, new AObjectS84S0100000_2(func, 220));
    }

    @Override // X.InterfaceC153185zm
    public void xy(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Boolean, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        this.LJLJJL.observe(this, new AObserverS70S0100000_2(func, 198));
    }

    @Override // X.InterfaceC153185zm
    public void zk(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Integer, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        this.LJLL.LIZIZ(this, new AObjectS84S0100000_2(func, 221));
    }
}
