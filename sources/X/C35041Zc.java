package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35041Zc extends AbstractC22370uH {
    public final String LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35041Zc(String requestJson) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", C22430uN.LIZ(requestJson, null, false), C22430uN.LIZ(requestJson, null, false));
        o.LJIIIZ(requestJson, "requestJson");
        this.LIZJ = requestJson;
        if (requestJson.length() > 0) {
            return;
        }
        "requestJson must not be empty".toString();
        throw new IllegalArgumentException("requestJson must not be empty");
    }
}
