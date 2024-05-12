package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67422kk extends AbstractC65781Prl implements InterfaceC88471Ynr<String, java.util.Map<String, ? extends String>, C76800UCe> {
    public static final C67422kk LJLIL = new C67422kk();

    public C67422kk() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, java.util.Map<String, ? extends String> map) {
        String eventName = str;
        java.util.Map<String, ? extends String> data = map;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(data, "data");
        if (((Boolean) C67432kl.LIZ.getValue()).booleanValue()) {
            if (eventName.length() == 0) {
                FMX.LJIIL("btm_page_start", data);
            } else {
                FMX.LJIIL(eventName, data);
            }
        }
        return C76800UCe.LIZ;
    }
}
