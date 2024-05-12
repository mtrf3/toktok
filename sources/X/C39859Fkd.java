package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Fkd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39859Fkd implements InterfaceC39860Fke {
    @Override // X.InterfaceC39860Fke
    public final C39878Fkw bootSSPLifecycle(Context context, C60737Nsb hybridContext, HybridSchemaParam schemaParams) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(hybridContext, "hybridContext");
        o.LJIIIZ(schemaParams, "schemaParams");
        C39878Fkw c39878Fkw = new C39878Fkw(hybridContext, schemaParams);
        C37755Ern.LIZ(new ARunnableS42S0100000_6(c39878Fkw, 91));
        return c39878Fkw;
    }
}
