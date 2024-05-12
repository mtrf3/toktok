package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TnD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75691TnD<T> implements InterfaceC64592gB {
    public static final C75691TnD<T> LJLIL = new C75691TnD<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C0NB.LJI("QuickPairManager", (Throwable) obj);
        if (RandomLinkMicManager.LJLJLJ == EnumC75692TnE.WAITING) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.k0p));
            RandomLinkMicManager.LJLIL.getClass();
            RandomLinkMicManager.LIZ();
            C75545Tkr.LJ();
        }
    }
}
