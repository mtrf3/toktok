package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJ6 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJ6 LJLIL = new DJ6();

    public DJ6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("share_campaign_repo", 1);
    }
}
