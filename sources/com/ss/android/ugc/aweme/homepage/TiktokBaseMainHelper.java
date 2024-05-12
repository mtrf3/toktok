package com.ss.android.ugc.aweme.homepage;

import X.C0RN;
import X.C16880lQ;
import X.C36093EEn;
import X.C36980EfI;
import X.C40328FsC;
import X.C84541XFx;
import X.C84542XFy;
import X.C84543XFz;
import X.C88045Ygz;
import X.EE1;
import X.EFK;
import X.EI0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC54150LNa;
import X.XG3;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class TiktokBaseMainHelper implements InterfaceC54150LNa {
    public final Activity LIZ;
    public long LIZIZ;

    @Override // X.InterfaceC54150LNa
    public final void onCreate() {
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new AppStartJobTask(), true);
        LIZJ.LIZJ();
    }

    /* loaded from: classes16.dex */
    public final class AppStartJobTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "TiktokBaseMainHelper$AppStartJobTask";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EE1
        public final EFK type() {
            if (((Boolean) C88045Ygz.LIZJ.getValue()).booleanValue()) {
                return EFK.APP_BACKGROUND;
            }
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        public AppStartJobTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            C84541XFx c84541XFx = new C84541XFx(TiktokBaseMainHelper.this.LIZ);
            if (!C84541XFx.LJIIIIZZ) {
                long j = 0;
                try {
                    j = 0 + C36980EfI.LIZLLL(new File(C84541XFx.LIZJ));
                } catch (Throwable unused) {
                }
                if (j >= 62914560) {
                    XG3.LJLL.LJLIL = System.currentTimeMillis();
                    C84541XFx.LJIIIIZZ = true;
                    new C84543XFz(c84541XFx).LIZ();
                }
            }
            if (!C84541XFx.LJIIIIZZ) {
                XG3 xg3 = XG3.LJLL;
                long j2 = xg3.LJLIL;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - j2 < 86400000) {
                    try {
                        xg3.LIZ(c84541XFx);
                    } catch (Exception unused2) {
                    }
                } else {
                    xg3.LJLIL = currentTimeMillis;
                    C84541XFx.LJIIIIZZ = true;
                    new C84542XFy(c84541XFx).LIZ();
                }
            }
            IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    public TiktokBaseMainHelper(Activity mContext) {
        o.LJIIIZ(mContext, "mContext");
        this.LIZ = mContext;
        new Handler();
        o.LJII(C16880lQ.LLILIL(mContext, "notification"), "null cannot be cast to non-null type android.app.NotificationManager");
    }
}
