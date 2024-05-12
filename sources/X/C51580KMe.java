package X;

import java.util.UUID;

/* renamed from: X.KMe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51580KMe extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C51580KMe LJLIL = new C51580KMe();

    public C51580KMe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
