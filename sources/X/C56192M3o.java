package X;

import com.bytedance.keva.Keva;

/* renamed from: X.M3o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56192M3o implements InterfaceC85634XjC {
    public static String LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static C56192M3o LIZJ;
    public final Keva LIZ;

    @Override // X.InterfaceC85634XjC
    public final void LIZ() {
        this.LIZ.storeInt("click_delete_icon_times", this.LIZ.getInt("click_delete_icon_times", 0) + 1);
    }

    @Override // X.InterfaceC85634XjC
    public final void LIZJ() {
        this.LIZ.erase("click_delete_icon_times");
    }

    public C56192M3o() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bind_phone_pop_");
        LIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC85634XjC
    public final void LIZIZ(long j) {
        this.LIZ.storeLong("last_unbind_time", j);
    }
}
