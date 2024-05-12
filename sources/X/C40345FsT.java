package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.FsT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40345FsT extends MutableContextWrapper {
    public final int LIZ;

    @Override // android.content.ContextWrapper
    public final Context getBaseContext() {
        Context baseContext = super.getBaseContext();
        if (baseContext != null) {
            Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
            o.LJFF(baseContext2, "(super.getBaseContext() …ThemeWrapper).baseContext");
            return baseContext2;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.utils.HybridContextThemeWrapper");
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context base) {
        o.LJIIJ(base, "base");
        Context context = null;
        if (base instanceof C40347FsV) {
            context = base;
        }
        C40347FsV c40347FsV = (C40347FsV) context;
        if (c40347FsV != null && c40347FsV.LIZ == this.LIZ) {
            super.setBaseContext(c40347FsV);
        } else {
            super.setBaseContext(new C40347FsV(base, this.LIZ));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40345FsT(Context context, int i) {
        super(context);
        o.LJIIJ(context, "context");
        this.LIZ = i;
        setBaseContext(context);
    }
}
