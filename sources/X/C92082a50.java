package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a50, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92082a50<T> {
    public final EnumC92085a53 LIZ;
    public final String LIZIZ;
    public final T LIZJ;

    public C92082a50(EnumC92085a53 code, String message, T t) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(message, "message");
        this.LIZ = code;
        this.LIZIZ = message;
        this.LIZJ = t;
    }

    public /* synthetic */ C92082a50(EnumC92085a53 enumC92085a53, String str, Object obj, int i) {
        this(enumC92085a53, (i & 2) != 0 ? "success" : str, (i & 4) != 0 ? null : obj);
    }
}
