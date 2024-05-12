package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SmS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73096SmS extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, InterfaceC74334TFi> {
    public static final C73096SmS LJLIL = new C73096SmS();

    public C73096SmS() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final InterfaceC74334TFi invoke(String str, String str2) {
        String uid = str;
        o.LJIIIZ(uid, "uid");
        C44423Hc3 user = C60903NvH.LJIIJJI().getAccountService().LJII(uid, str2);
        o.LJIIIZ(user, "user");
        return new C45931I0x(user);
    }
}
