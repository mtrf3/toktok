package X;

import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.Nn5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60395Nn5 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C60395Nn5 LJLIL = new C60395Nn5();

    public C60395Nn5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String uuid = UUID.randomUUID().toString();
        o.LJFF(uuid, "UUID.randomUUID().toString()");
        return uuid;
    }
}
