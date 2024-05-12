package X;

import com.bytedance.keva.Keva;

/* loaded from: classes10.dex */
public final class LTZ extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final LTZ LJLIL = new LTZ();

    public LTZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("stem_keva_repo");
    }
}
