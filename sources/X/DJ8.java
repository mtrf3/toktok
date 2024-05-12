package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class DJ8 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final DJ8 LJLIL = new DJ8();

    public DJ8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("local_notify", 1);
    }
}
