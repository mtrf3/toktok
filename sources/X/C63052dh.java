package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63052dh extends AbstractC65781Prl implements InterfaceC88471Ynr<String, java.util.Map<String, ? extends String>, C76800UCe> {
    public static final C63052dh LJLIL = new C63052dh();

    public C63052dh() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, java.util.Map<String, ? extends String> map) {
        String eventName = str;
        java.util.Map<String, ? extends String> data = map;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(data, "data");
        if (eventName.length() == 0) {
            FMX.LJIIL("btm_page_show", data);
        } else {
            FMX.LJIIL(eventName, data);
        }
        return C76800UCe.LIZ;
    }
}
