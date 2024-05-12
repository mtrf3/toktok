package X;

import com.bytedance.ies.watcher.IWatcher;
import com.ss.android.ugc.aweme.legoImp.WatcherImpl;

/* renamed from: X.MtN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58237MtN extends AbstractC65781Prl implements InterfaceC65784Pro<FGQ> {
    public static final C58237MtN LJLIL = new C58237MtN();

    public C58237MtN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FGQ invoke() {
        IWatcher iWatcher;
        C62679Oip LIZ;
        Object LIZ2 = C58096Mr6.LIZ(IWatcher.class, false);
        if (LIZ2 != null) {
            iWatcher = (IWatcher) LIZ2;
        } else {
            if (C58096Mr6.l2 == null) {
                synchronized (IWatcher.class) {
                    if (C58096Mr6.l2 == null) {
                        C58096Mr6.l2 = new WatcherImpl();
                    }
                }
            }
            iWatcher = C58096Mr6.l2;
        }
        if (iWatcher != null && (LIZ = iWatcher.LIZ()) != null) {
            return LIZ;
        }
        return new FRX();
    }
}
