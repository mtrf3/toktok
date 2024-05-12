package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class HS6 extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final HS6 LJLIL = new HS6();

    public HS6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("EditorProKeva");
    }
}
