package com.ss.android.ugc.aweme.profile.edit;

import X.C06M;
import X.C0RN;
import X.C158056If;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C2YJ;
import X.C31094CIg;
import X.C62822Ol8;
import X.C66552QAa;
import X.C82544WaS;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import X.HG3;
import X.InterfaceC38821FLl;
import X.RBX;
import Y.ARunnableS30S0200000_11;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class YoutubeRefreshTask implements EE1, InterfaceC38821FLl, WeakHandler.IHandler {
    public Context LJLIL;
    public WeakHandler LJLILLLLZI;
    public int LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C66552QAa.LJLIL);

    @Override // X.EEY
    public final String key() {
        return "YoutubeRefreshTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.profile.model.User r17) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.edit.YoutubeRefreshTask.LIZLLL(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    @Override // X.InterfaceC38821FLl
    public final void change(IESSettingsProxy iesSettings) {
        o.LJIIIZ(iesSettings, "iesSettings");
        WeakHandler weakHandler = this.LJLILLLLZI;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        Context context = this.LJLIL;
        if (context != null) {
            run(context);
        } else {
            o.LJIJI("context");
            throw null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            WeakHandler weakHandler = this.LJLILLLLZI;
            if (weakHandler != null) {
                weakHandler.removeMessages(1);
            }
            int i = this.LJLJI + 1;
            this.LJLJI = i;
            if (i > 3) {
                SettingsManagerProxy.inst().removeSettingsWatcher(this);
                WeakHandler weakHandler2 = this.LJLILLLLZI;
                if (weakHandler2 != null) {
                    weakHandler2.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            }
            WeakHandler weakHandler3 = this.LJLILLLLZI;
            if (weakHandler3 == null) {
                return;
            }
            weakHandler3.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        boolean z;
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        C31094CIg LIZ = C31094CIg.LIZ();
        LIZ.getClass();
        synchronized (C31094CIg.class) {
            z = LIZ.LIZ;
        }
        if (!z) {
            SettingsManagerProxy.inst().registerSettingsWatcher(this, true);
            if (this.LJLILLLLZI == null) {
                this.LJLILLLLZI = new WeakHandler(C06M.LIZ("youtube-refresh-timer").getLooper(), this);
            }
            WeakHandler weakHandler = this.LJLILLLLZI;
            o.LJI(weakHandler);
            if (weakHandler.hasMessages(1)) {
                WeakHandler weakHandler2 = this.LJLILLLLZI;
                o.LJI(weakHandler2);
                weakHandler2.removeMessages(1);
            }
            WeakHandler weakHandler3 = this.LJLILLLLZI;
            o.LJI(weakHandler3);
            weakHandler3.sendEmptyMessage(1);
            return;
        }
        try {
            Integer thirdPartyDataRefresh = C2YJ.LIZIZ.LIZ.getThirdPartyDataRefresh();
            if (thirdPartyDataRefresh != null) {
                if (thirdPartyDataRefresh.intValue() == 1) {
                    User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    long youTubeLastRefreshTime = curUser.getYouTubeLastRefreshTime();
                    if (youTubeLastRefreshTime > 0 && currentTimeMillis - youTubeLastRefreshTime > TimeUnit.DAYS.toSeconds(30L)) {
                        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                            C82544WaS.LIZIZ(new ARunnableS30S0200000_11(curUser, this, 17), "YoutubeRefreshTask");
                        } else {
                            LIZLLL(curUser);
                        }
                    }
                }
            }
        } catch (C158056If unused) {
        }
    }

    public static void LJ(YoutubeRefreshTask youtubeRefreshTask, boolean z, Boolean bool, Exception exc, Integer num, YoutubeApi.YouTubeResponse youTubeResponse, int i) {
        Integer num2 = null;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            exc = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            youTubeResponse = null;
        }
        youtubeRefreshTask.getClass();
        Context context = youtubeRefreshTask.LJLIL;
        if (context != null) {
            String LIZ = YoutubeApi.LIZ(context, exc, num, youTubeResponse);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("platform", "youtube");
            c188727au.LJFF(Boolean.valueOf(z), "is_success");
            c188727au.LIZLLL(o.LJ(bool, Boolean.TRUE) ? 1 : 0, "auto_unlink");
            if (youTubeResponse != null) {
                num2 = youTubeResponse.statusCode;
            }
            c188727au.LJIIIZ("error_code", String.valueOf(num2));
            c188727au.LJIIIZ("error_desc", LIZ);
            FMX.LJIIL("social_profile_check", c188727au.LIZ);
            return;
        }
        o.LJIJI("context");
        throw null;
    }
}
