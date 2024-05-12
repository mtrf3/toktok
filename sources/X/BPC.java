package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.notificatoin.AudioLiveService;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BPC<T> implements InterfaceC64592gB {
    public final /* synthetic */ BKC LJLIL;

    public BPC(BKC bkc) {
        this.LJLIL = bkc;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Activity topActivity;
        boolean LIZIZ;
        Class<?> cls;
        BKC bkc = this.LJLIL;
        bkc.getClass();
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL instanceof Activity) {
            topActivity = (Activity) LIZLLL;
        } else {
            topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
        }
        boolean LIZJ = BKC.LIZJ(topActivity);
        Context LIZLLL2 = C15380j0.LIZLLL();
        if (LIZLLL2 == null) {
            LIZIZ = false;
        } else {
            LIZIZ = new AnonymousClass078(LIZLLL2).LIZIZ();
        }
        boolean rk = ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).rk();
        if (LIZIZ) {
            Boolean LIZJ2 = InterfaceC30442Bx8.LLJJJJLIIL.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_BG_AUDIO_PLAY_OPEN.value");
            if (LIZJ2.booleanValue()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PipController updateNotification isAppBackground=");
                LIZ.append(bkc.LJI);
                LIZ.append(",topActivity=");
                if (topActivity != null) {
                    cls = topActivity.getClass();
                } else {
                    cls = null;
                }
                LIZ.append(cls);
                LIZ.append(",isNotificationCancelled=");
                LIZ.append(bkc.LJIIIIZZ);
                LIZ.append(",isMicRoom=");
                LIZ.append(rk);
                C0NB.LIZIZ("AudioLiveService", X1D.LIZIZ(LIZ));
                if (bkc.LJI && LIZJ && !bkc.LJIIIIZZ && !rk) {
                    AudioLiveService.Companion.getClass();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("startService begin isRunning=");
                    LIZ2.append(AudioLiveService.isRunning);
                    LIZ2.append(" isStopping=");
                    LIZ2.append(AudioLiveService.isStopping);
                    C0NB.LIZIZ("AudioLiveService", X1D.LIZIZ(LIZ2));
                    Context applicationContext = GlobalContext.getApplicationContext();
                    if (applicationContext == null || !new AnonymousClass078(applicationContext).LIZIZ()) {
                        return;
                    }
                    Intent intent = new Intent(applicationContext, (Class<?>) AudioLiveService.class);
                    intent.setAction("com.bytedance.android.livesdk.audio_action.SHOW");
                    try {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 26 && i < 31) {
                            applicationContext.startForegroundService(intent);
                        } else {
                            C16880lQ.LLLL(applicationContext, intent);
                        }
                    } catch (Throwable th) {
                        JSONObject jSONObject = new JSONObject();
                        C05630Jz.LJI(jSONObject, "error_code", th.getMessage());
                        C0K2.LJIIIIZZ("ttlive_audio_live_service_start_error", 1, jSONObject);
                        C0NB.LJI("AudioLiveService", th);
                    }
                    C0NB.LIZIZ("AudioLiveService", "startService end");
                    return;
                }
                AudioLiveService.Companion.getClass();
                BPD.LIZ();
            }
        }
    }
}
