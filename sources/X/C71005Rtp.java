package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Rtp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71005Rtp {
    public final String LIZ;
    public final String LIZIZ;

    public C71005Rtp(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.LIZ = key;
        this.LIZIZ = value;
    }

    public /* synthetic */ C71005Rtp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
