package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91763iu extends AbstractC65781Prl implements InterfaceC88472Yns<C116144h8, CharSequence> {
    public static final C91763iu LJLIL = new C91763iu();

    public C91763iu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(C116144h8 c116144h8) {
        C116144h8 item = c116144h8;
        o.LJIIIZ(item, "item");
        String uid = item.LJLIL.getUid();
        o.LJIIIIZZ(uid, "item.contact.uid");
        return uid;
    }
}
