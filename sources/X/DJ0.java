package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJ0 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJ0 LJLIL = new DJ0();

    public DJ0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("mission_publish_do_not_remind", 0);
    }
}
