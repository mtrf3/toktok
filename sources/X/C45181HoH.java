package X;

import com.bytedance.keva.Keva;

/* renamed from: X.HoH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45181HoH extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C45181HoH LJLIL = new C45181HoH();

    public C45181HoH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo("AutoCutResourceCache");
    }
}
