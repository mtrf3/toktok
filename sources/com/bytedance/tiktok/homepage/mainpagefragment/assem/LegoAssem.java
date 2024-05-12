package com.bytedance.tiktok.homepage.mainpagefragment.assem;

import X.ActivityC45651qj;
import X.C0RN;
import X.C212428Vi;
import X.C36093EEn;
import X.C38816FLg;
import X.C38995FSd;
import X.C40328FsC;
import X.C54063LJr;
import X.C73318Sq2;
import X.C78696Uua;
import X.C87787Ycp;
import X.EE1;
import X.EFK;
import X.EI0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.view.View;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import com.ss.android.ugc.aweme.legoImp.task.HwWallpaperMobEventTask;
import com.ss.android.ugc.aweme.legoImp.task.MultiProcessMobEventTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserverTabCheckTask;
import java.util.List;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public final class LegoAssem extends BaseMainPageFragmentAssem {
    public C78696Uua LJLIL;
    public C73318Sq2 LJLILLLLZI;

    public final void v3() {
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new DownloadFestivalTask(), true);
        LIZJ.LIZIZ(new HwWallpaperMobEventTask(), true);
        LIZJ.LIZIZ(new MultiProcessMobEventTask(), true);
        LIZJ.LIZIZ(new ObserverTabCheckTask(), true);
        LIZJ.LIZIZ(new SubscribeAuthStateTask(), true);
        LIZJ.LIZJ();
    }

    @Override // X.C8W0
    public final void onCreate() {
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            this.LJLIL = new C78696Uua(LIZ, new C54063LJr(this));
        }
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C78696Uua c78696Uua = this.LJLIL;
        if (c78696Uua != null) {
            EventBus.LIZJ().LJIJ(c78696Uua);
        }
        C73318Sq2 c73318Sq2 = this.LJLILLLLZI;
        if (c73318Sq2 != null) {
            c73318Sq2.LIZLLL();
        }
    }

    /* loaded from: classes10.dex */
    public final class DownloadFestivalTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "LegoAssem$DownloadFestivalTask";
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

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public DownloadFestivalTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            C78696Uua c78696Uua = LegoAssem.this.LJLIL;
            if (c78696Uua != null) {
                c78696Uua.LIZ();
            }
        }
    }

    /* loaded from: classes10.dex */
    public final class SubscribeAuthStateTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "LegoAssem$SubscribeAuthStateTask";
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

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public SubscribeAuthStateTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            C38816FLg.LIZJ(new ARunnableS45S0100000_9(LegoAssem.this, 13));
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC54059LJn
    public final void LLZILL(View container) {
        o.LJIIIZ(container, "container");
        if (((Boolean) C87787Ycp.LIZIZ.getValue()).booleanValue()) {
            C38995FSd.LIZIZ().execute(new ARunnableS45S0100000_9(this, 14));
        } else {
            v3();
        }
    }
}
