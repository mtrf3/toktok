package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.commerce.tools.music.promote.PromoteRepalceMusicServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.61x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1538161x extends AbstractC29891Fh<InterfaceC145315n5> implements InterfaceC145315n5 {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final C40871j1<Boolean> LJLJJL;
    public final C0IB<Boolean> LJLJJLL;
    public final C29901Fi<C76800UCe> LJLJL;
    public final LiveEvent<C76800UCe> LJLJLJ;
    public final C29901Fi<Boolean> LJLJLLL;
    public final LiveEvent<Boolean> LJLL;
    public final C29901Fi<Boolean> LJLLI;
    public final LiveEvent<Boolean> LJLLILLLL;
    public boolean LJLLJ;

    public InterfaceC145315n5 LJJLI() {
        return this;
    }

    @Override // X.InterfaceC145315n5
    public void J60() {
        this.LJLJL.LJII(C76800UCe.LIZ);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLILLLLZI.add(this.LJLJI, new C1537661s(this.LJLIL), "ReplaceMusicToolbarScene");
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        if (!this.LJLLJ && (this.LJLILLLLZI instanceof InterfaceC145445nI)) {
            if (C00F.LIZ(31744, 0, "auto_apply_first_recommended_sound_when_sound_removed", true) != 1 || H92.LJ()) {
                PromoteRepalceMusicServiceImpl.LIZJ().LIZ();
                if (!C42622Go6.LJI()) {
                    return;
                }
            }
            ((InterfaceC145445nI) this.LJLILLLLZI).LJLJLJ();
            this.LJLLJ = true;
        }
    }

    @Override // X.InterfaceC145315n5
    public LiveEvent<Boolean> Id() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC145315n5
    public LiveEvent<C76800UCe> Lb() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC145315n5 getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC145315n5
    public C0IB<Boolean> hq() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC145315n5
    public LiveEvent<Boolean> pF() {
        return this.LJLL;
    }

    @Override // X.InterfaceC145315n5
    public void Gw(boolean z) {
        this.LJLLI.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC145315n5
    public void Im(boolean z) {
        this.LJLJLLL.LJII(Boolean.valueOf(z));
    }

    public C1538161x(C82622Wbi diContainer, WMH parentScene, int i, int i2) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = i2;
        C40871j1<Boolean> c40871j1 = new C40871j1<>(null);
        this.LJLJJL = c40871j1;
        this.LJLJJLL = c40871j1;
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJL = c29901Fi;
        this.LJLJLJ = c29901Fi;
        C29901Fi<Boolean> c29901Fi2 = new C29901Fi<>();
        this.LJLJLLL = c29901Fi2;
        this.LJLL = c29901Fi2;
        C29901Fi<Boolean> c29901Fi3 = new C29901Fi<>();
        this.LJLLI = c29901Fi3;
        this.LJLLILLLL = c29901Fi3;
    }
}
