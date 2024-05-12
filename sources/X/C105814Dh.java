package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.4Dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105814Dh extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public C105814Dh() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105814Dh(String msg) {
        super(msg);
        o.LJIIIZ(msg, "msg");
    }

    public /* synthetic */ C105814Dh(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "no valid content" : str);
    }
}
