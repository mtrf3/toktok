package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePostForWatchSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import kotlin.jvm.internal.o;

/* renamed from: X.BvG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30326BvG implements FluencyOpt {
    public static final C30326BvG LIZ = new C30326BvG();
    public static boolean LIZIZ;

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final boolean shouldReleaseAsyncLayoutInflaterTaskQueue() {
        return false;
    }

    public static final void LIZ(Runnable runnable) {
        C38995FSd.LIZIZ().submit(runnable);
    }

    public static final void LIZIZ(Runnable runnable) {
        LIZ.post(runnable, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final View getPreloadLayout(int i) {
        if (C20780ri.LIZ(i) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            Context context = C20910rv.LJIIIIZZ;
            if (context == null) {
                return null;
            }
            return C20780ri.LIZIZ(i, context, null, false);
        }
        return C20910rv.LJIIIZ(i);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void removeMessages(Object obj) {
        o.LJIIIZ(obj, "obj");
        B73.LIZJ(obj);
    }

    public static final void LIZLLL(Runnable runnable, DataChannel dataChannel) {
        if (LivePostForWatchSetting.INSTANCE.enable() && dataChannel != null) {
            LIZ.post(runnable, dataChannel);
        } else {
            runnable.run();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void post(Runnable runnable, Object obj) {
        o.LJIIIZ(runnable, "runnable");
        LIZJ(runnable, obj, 0L);
    }

    public static final void LIZJ(Runnable runnable, Object obj, long j) {
        o.LJIIIZ(runnable, "runnable");
        C10640bM.LIZIZ(B73.LIZ(), runnable, obj, j);
    }

    public static final void LJ(int i, long j, Object obj, InterfaceC65784Pro action) {
        o.LJIIIZ(action, "action");
        if (!LIZIZ || i < 1) {
            action.invoke();
        } else {
            LIZJ(new RunnableC30327BvH(i, j, obj, action), obj, j);
        }
    }
}
