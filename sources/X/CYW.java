package X;

import android.content.Context;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CYW {
    public final Object LIZ;
    public Object LIZIZ;

    public /* synthetic */ CYW(Context context) {
        o.LJIIJ(context, "context");
        Object LLILL = C16880lQ.LLILL(context, "audio");
        if (LLILL != null) {
            this.LIZ = LLILL;
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.media.AudioManager");
    }

    public /* synthetic */ CYW(OnlineRankListResponse onlineRankListResponse, String str) {
        this.LIZ = onlineRankListResponse;
        this.LIZIZ = str;
    }
}
