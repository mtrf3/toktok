package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: X.XVl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84945XVl implements OUN {
    public final /* synthetic */ Effect LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C84942XVi LIZJ;

    @Override // X.OUN
    public final void onStart() {
    }

    @Override // X.OUN
    public final void LIZ() {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            if (AV1.LJIIJJI()) {
                return;
            }
            C84942XVi c84942XVi = this.LIZJ;
            Effect effect = this.LIZ;
            String str = this.LIZIZ;
            c84942XVi.getClass();
            new C84944XVk(c84942XVi, effect, str).onSuccess();
        }
        OUJ.LIZ.remove(this);
    }

    public C84945XVl(C84942XVi c84942XVi, Effect effect, String str) {
        this.LIZJ = c84942XVi;
        this.LIZ = effect;
        this.LIZIZ = str;
    }
}
