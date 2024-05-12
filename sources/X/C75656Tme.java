package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Tme, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75656Tme<T> implements InterfaceC64592gB {
    public static final C75656Tme<T> LJLIL = new C75656Tme<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("time out count down failed, exception: ");
        LIZ.append(obj);
        C0NB.LJ("TopicPairManager", X1D.LIZIZ(LIZ));
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.onk));
        C75650TmY.LIZ(false);
    }
}
