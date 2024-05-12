package X;

import java.util.UUID;

/* renamed from: X.P5u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63894P5u extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C63894P5u LJLIL = new C63894P5u();

    public C63894P5u() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
