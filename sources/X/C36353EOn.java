package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.EOn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36353EOn extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36353EOn(String message, Throwable th) {
        super(message, th);
        o.LJIIIZ(message, "message");
    }

    public /* synthetic */ C36353EOn(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
