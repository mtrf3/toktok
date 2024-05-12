package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.text.TextUtils;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.ss.android.ugc.aweme.push.downgrade.ListenMainProcessService;
import com.ss.android.ugc.aweme.push.downgrade.notice.MainProcessWsChannelService;

/* loaded from: classes7.dex */
public final class FUU {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static boolean LIZ(Context context, Intent intent) {
        ComponentName component;
        if (context == null || intent == null || (component = intent.getComponent()) == null || !TextUtils.equals(context.getPackageName(), component.getPackageName()) || !TextUtils.equals(component.getClassName(), WsChannelService.class.getName()) || (!LIZ && ((C84763XOl.LJIIJJI && !C38987FRv.LIZLLL().booleanValue()) || !FGT.LIZIZ(context) || FGG.LIZLLL(context)))) {
            return false;
        }
        LIZ = true;
        if (intent != null) {
            intent.setComponent(new ComponentName(context, (Class<?>) MainProcessWsChannelService.class));
        }
        if (FGT.LIZ() && !LIZIZ) {
            synchronized (FUU.class) {
                if (!LIZIZ) {
                    LIZIZ = true;
                    Context LIZIZ2 = EF7.LIZIZ();
                    Intent intent2 = new Intent(LIZIZ2, (Class<?>) ListenMainProcessService.class);
                    Messenger messenger = new Messenger(new Handler(C16880lQ.LLJJJJ()));
                    Bundle bundle = new Bundle();
                    bundle.putBinder("main_process_binder", messenger.getBinder());
                    intent2.putExtra("main_process_bundle", bundle);
                    C16880lQ.LLLJL(LIZIZ2, intent2, new FUV(), 1);
                }
            }
        }
        return true;
    }
}
