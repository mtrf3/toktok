package X;

import android.content.Context;
import android.view.LayoutInflater;
import kotlin.jvm.internal.o;

/* renamed from: X.46A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46A extends LayoutInflater {
    public final Context LIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46A(Context context) {
        super(C16880lQ.LLZIL(context), context);
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context newContext) {
        o.LJIIIZ(newContext, "newContext");
        return new C46A(this.LIZ);
    }
}
