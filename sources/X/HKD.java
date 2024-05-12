package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class HKD extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final HKD LJLIL = new HKD();

    public HKD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("camera_widget");
    }
}
