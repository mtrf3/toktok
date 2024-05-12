package X;

import java.util.UUID;

/* renamed from: X.P5v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63895P5v extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C63895P5v LJLIL = new C63895P5v();

    public C63895P5v() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
