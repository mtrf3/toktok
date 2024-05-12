package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class HSU extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final HSU LJLIL = new HSU();

    public HSU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("anchor_offline_record");
    }
}
