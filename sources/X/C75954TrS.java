package X;

import Y.IDcS94S0200000_13;
import com.bytedance.android.live.design.app.LiveDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;

/* renamed from: X.TrS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75954TrS extends AbstractC75856Tps {
    public static final /* synthetic */ int LIZJ = 0;
    public final C75962Tra LIZIZ;

    @Override // X.AbstractC75856Tps, X.InterfaceC75855Tpr
    public final String tag() {
        return "TopicConflictDialog";
    }

    @Override // X.InterfaceC75855Tpr
    public final void show() {
        C34K c34k = new C34K();
        C39471gl c39471gl = new C39471gl();
        c39471gl.LIZ = C15380j0.LJIILJJIL(R.string.ono);
        c39471gl.LIZJ = new IDcS94S0200000_13(this, c34k, 10);
        C39481gm c39481gm = new C39481gm(c39471gl);
        C39491gn c39491gn = new C39491gn();
        c39491gn.LIZ = C15380j0.LJIILJJIL(R.string.onh);
        c39491gn.LIZJ = C75960TrY.LJLIL;
        C39501go c39501go = new C39501go(c39491gn);
        AnonymousClass175 anonymousClass175 = new AnonymousClass175();
        anonymousClass175.LIZ(c39481gm);
        anonymousClass175.LIZ(c39501go);
        AnonymousClass176 anonymousClass176 = new AnonymousClass176(anonymousClass175);
        C47071t1 c47071t1 = new C47071t1(this.LIZIZ.LIZ);
        c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.onq);
        c47071t1.LJII(C15380j0.LJIILJJIL(R.string.onp));
        c47071t1.LIZJ(anonymousClass176);
        c47071t1.LJIJI = new C75957TrV(new AqS179S0100000_13(c34k, 659));
        c47071t1.LJIILL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        this.LIZ = LIZ;
        C16880lQ.LIZ(LIZ);
    }

    public C75954TrS(C75962Tra c75962Tra) {
        this.LIZIZ = c75962Tra;
    }
}