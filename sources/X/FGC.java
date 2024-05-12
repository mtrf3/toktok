package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* loaded from: classes7.dex */
public final class FGC extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final FGC LJLIL = new FGC();

    public FGC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepo("firebase_config", 1);
    }
}
