package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJ2 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJ2 LJLIL = new DJ2();

    public DJ2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("repo_multi_process_mob_event", 1);
    }
}
