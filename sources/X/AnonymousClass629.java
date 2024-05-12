package X;

import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.629, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class AnonymousClass629 implements InterfaceC162186Yc {
    public static String LIZ(String str) {
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, str);
        return uuid;
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }
}
