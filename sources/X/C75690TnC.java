package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TnC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75690TnC<T> implements InterfaceC64592gB {
    public static final C75690TnC<T> LJLIL = new C75690TnC<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (RandomLinkMicManager.LJLJLJ == EnumC75692TnE.WAITING) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.k0p));
            RandomLinkMicManager.LJLIL.getClass();
            RandomLinkMicManager.LIZ();
            C75545Tkr.LJ();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("time out -->>>current State = ");
        LIZ.append(RandomLinkMicManager.LJLJLJ);
        C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
    }
}
