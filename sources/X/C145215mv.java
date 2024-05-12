package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* renamed from: X.5mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C145215mv extends AbstractC29891Fh<InterfaceC145325n6> implements InterfaceC145325n6, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final C40871j1<Boolean> LJLILLLLZI;
    public final C0IB<Boolean> LJLJI;
    public final C29901Fi<Integer> LJLJJI;
    public final LiveEvent<Integer> LJLJJL;
    public final C40871j1<AVMusic> LJLJJLL;
    public final C0IB<AVMusic> LJLJL;
    public final C29901Fi<AVMusic> LJLJLJ;
    public final LiveEvent<AVMusic> LJLJLLL;
    public final C29901Fi<C76800UCe> LJLL;
    public final LiveEvent<C76800UCe> LJLLI;
    public final C29901Fi<C76800UCe> LJLLILLLL;
    public final LiveEvent<C76800UCe> LJLLJ;
    public final C40871j1<Boolean> LJLLL;
    public final C0IB<Boolean> LJLLLL;
    public final C29901Fi<C76800UCe> LJLLLLLL;
    public final LiveEvent<C76800UCe> LJLZ;
    public final C29901Fi<Float> LJZ;
    public final LiveEvent<Float> LJZI;
    public final C29901Fi<Boolean> LJZL;
    public final LiveEvent<Boolean> LL;
    public final C29901Fi<C76800UCe> LLD;
    public final LiveEvent<C76800UCe> LLF;
    public boolean LLFF;

    public InterfaceC145325n6 LJJLI() {
        return this;
    }

    @Override // X.InterfaceC145325n6
    public void hide() {
        this.LLFF = false;
    }

    @Override // X.InterfaceC145325n6
    public void Ei() {
        this.LLD.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC145325n6
    public void Hk() {
        this.LJLLILLLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC145325n6
    public void ML() {
        this.LJLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC145325n6
    public void cv0() {
        this.LJLLLLLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<AVMusic> Am() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<Integer> Ev() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<Float> K30() {
        return this.LJZI;
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<C76800UCe> LD() {
        return this.LLF;
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<C76800UCe> RT() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<C76800UCe> co() {
        return this.LJLLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC145325n6 getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC145325n6
    public boolean isShowing() {
        return this.LLFF;
    }

    @Override // X.InterfaceC145325n6
    public C0IB<Boolean> oq0() {
        return this.LJLLLL;
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<C76800UCe> uL() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC145325n6
    public LiveEvent<Boolean> vQ() {
        return this.LL;
    }

    @Override // X.InterfaceC145325n6
    public C0IB<Boolean> wG() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC145325n6
    public C0IB<AVMusic> ya0() {
        return this.LJLJL;
    }

    public C145215mv(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        C40871j1<Boolean> c40871j1 = new C40871j1<>(null);
        this.LJLILLLLZI = c40871j1;
        this.LJLJI = c40871j1;
        C29901Fi<Integer> c29901Fi = new C29901Fi<>();
        this.LJLJJI = c29901Fi;
        this.LJLJJL = c29901Fi;
        C40871j1<AVMusic> c40871j12 = new C40871j1<>(null);
        this.LJLJJLL = c40871j12;
        this.LJLJL = c40871j12;
        C29901Fi<AVMusic> c29901Fi2 = new C29901Fi<>();
        this.LJLJLJ = c29901Fi2;
        this.LJLJLLL = c29901Fi2;
        C29901Fi<C76800UCe> c29901Fi3 = new C29901Fi<>();
        this.LJLL = c29901Fi3;
        this.LJLLI = c29901Fi3;
        C29901Fi<C76800UCe> c29901Fi4 = new C29901Fi<>();
        this.LJLLILLLL = c29901Fi4;
        this.LJLLJ = c29901Fi4;
        C40871j1<Boolean> c40871j13 = new C40871j1<>(Boolean.FALSE);
        this.LJLLL = c40871j13;
        this.LJLLLL = c40871j13;
        C29901Fi<C76800UCe> c29901Fi5 = new C29901Fi<>();
        this.LJLLLLLL = c29901Fi5;
        this.LJLZ = c29901Fi5;
        C29901Fi<Float> c29901Fi6 = new C29901Fi<>();
        this.LJZ = c29901Fi6;
        this.LJZI = c29901Fi6;
        C29901Fi<Boolean> c29901Fi7 = new C29901Fi<>();
        this.LJZL = c29901Fi7;
        this.LL = c29901Fi7;
        C29901Fi<C76800UCe> c29901Fi8 = new C29901Fi<>();
        this.LLD = c29901Fi8;
        this.LLF = c29901Fi8;
    }

    @Override // X.InterfaceC145325n6
    public void B8(boolean z) {
        this.LJLILLLLZI.LJI(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC145325n6
    public void Ro(boolean z) {
        this.LJZL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC145325n6
    public void Xn(float f) {
        this.LJZ.LJII(Float.valueOf(f));
    }

    @Override // X.InterfaceC145325n6
    public void ha0(int i) {
        this.LJLJJI.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC145325n6
    public void ra0(AVMusic model) {
        o.LJIIIZ(model, "model");
        this.LJLJJLL.LJI(model);
    }

    @Override // X.InterfaceC145325n6
    public void show(boolean z) {
        this.LJLLL.LJI(Boolean.valueOf(z));
        this.LLFF = true;
    }

    @Override // X.InterfaceC145325n6
    public void xl(AVMusic aVMusic) {
        this.LJLJLJ.LJII(aVMusic);
    }
}
