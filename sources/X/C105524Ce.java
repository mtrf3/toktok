package X;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105524Ce extends LayoutInflater {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105524Ce(Context context) {
        super(C16880lQ.LLZIL(context), context);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context newContext) {
        o.LJIIIZ(newContext, "newContext");
        return new C105524Ce(newContext);
    }
}
