package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* loaded from: classes7.dex */
public final class FKL extends ContextWrapper {
    public final Resources LIZ;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.LIZ;
    }

    public FKL(Context context, FQU fqu) {
        super(context);
        this.LIZ = fqu;
    }
}
