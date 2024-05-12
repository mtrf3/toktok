package X;

import Y.IDcS172S0100000_13;
import com.bytedance.android.live.design.app.LiveDialog;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Trh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75969Trh extends AbstractC75856Tps {
    public static final /* synthetic */ int LIZJ = 0;
    public final C75971Trj LIZIZ;

    static {
        new C75970Tri();
    }

    @Override // X.AbstractC75856Tps, X.InterfaceC75855Tpr
    public final String tag() {
        return "MultiCoHostPrivateAccountDialog";
    }

    @Override // X.InterfaceC75855Tpr
    public final void show() {
        C47071t1 c47071t1 = new C47071t1(this.LIZIZ.LIZ);
        c47071t1.LJ(R.drawable.ccj);
        c47071t1.LJIILLIIL(this.LIZIZ.LIZIZ.getTitleResId());
        c47071t1.LJFF(this.LIZIZ.LIZIZ.getContentResId());
        c47071t1.LJIIIZ(R.string.me7, new IDcS172S0100000_13(this, 18));
        c47071t1.LJIIL(R.string.kkh, new IDcS172S0100000_13(this, 19));
        c47071t1.LJIILL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        this.LIZ = LIZ;
        C16880lQ.LIZ(LIZ);
    }

    public C75969Trh(C75971Trj c75971Trj) {
        this.LIZIZ = c75971Trj;
    }
}
