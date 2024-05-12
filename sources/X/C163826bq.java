package X;

import Y.AObjectS84S0100000_2;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163826bq extends AbstractC29891Fh<InterfaceC150355vD> implements InterfaceC135635Tz, InterfaceC150355vD {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final C5H3 LJLJJI;
    public final C29901Fi<Boolean> LJLJJL;
    public final LiveEvent<Boolean> LJLJJLL;
    public final C29901Fi<C76800UCe> LJLJL;
    public final LiveEvent<C76800UCe> LJLJLJ;
    public final C29901Fi<C76800UCe> LJLJLLL;
    public final LiveEvent<C76800UCe> LJLL;
    public final MutableLiveData<Boolean> LJLLI;

    public InterfaceC150355vD LJJLI() {
        return this;
    }

    @Override // X.InterfaceC150355vD
    public void EE() {
        this.LJLJLLL.LJII(C76800UCe.LIZ);
    }

    public final C163806bo LJJLIIIIJ() {
        return (C163806bo) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC150355vD
    public void dG() {
        this.LJLJL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC150355vD
    public void hide() {
        this.LJLJJL.LJII(Boolean.FALSE);
    }

    @Override // X.InterfaceC150355vD
    public void show() {
        this.LJLJJL.LJII(Boolean.TRUE);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, LJJLIIIIJ(), "ImageSwitchModeScene");
        fs0().LIZLLL(this, new AObjectS84S0100000_2(this, 20));
    }

    @Override // X.InterfaceC150355vD
    public LiveEvent<C76800UCe> Oq0() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC150355vD
    public LiveEvent<Boolean> fs0() {
        return this.LJLJJLL;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC150355vD getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC150355vD
    public LiveEvent<C76800UCe> iZ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC150355vD
    public MutableLiveData<Boolean> yI() {
        return this.LJLLI;
    }

    public C163826bq(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 96));
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this.LJLJJL = c29901Fi;
        this.LJLJJLL = c29901Fi;
        C29901Fi<C76800UCe> c29901Fi2 = new C29901Fi<>();
        this.LJLJL = c29901Fi2;
        this.LJLJLJ = c29901Fi2;
        C29901Fi<C76800UCe> c29901Fi3 = new C29901Fi<>();
        this.LJLJLLL = c29901Fi3;
        this.LJLL = c29901Fi3;
        this.LJLLI = new MutableLiveData<>();
    }
}
