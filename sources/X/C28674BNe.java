package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdkapi.host.IHostAction;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BNe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28674BNe extends BTV<C28826BTa> {
    public final List<String> LIZIZ = C47261Igj.LJJIJ("webcast_open_host_safety_tools");

    @Override // X.BTV
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.BTZ
    public final boolean LIZJ(Context context, C28826BTa c28826BTa, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJIILL = g0.LJIILL(((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity());
        if (LJIILL != null) {
            Intent createBroadcastEndSafetyToolsIntent = ((IHostAction) CN1.LIZ(IHostAction.class)).createBroadcastEndSafetyToolsIntent(LJIILL, c28826BTa.LIZ);
            if (createBroadcastEndSafetyToolsIntent != null) {
                C16880lQ.LIZLLL(LJIILL, createBroadcastEndSafetyToolsIntent);
                return true;
            }
            return true;
        }
        return false;
    }
}
