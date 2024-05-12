package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJB extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJB LJLIL = new DJB();

    public DJB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("push_permission", 1);
    }
}
