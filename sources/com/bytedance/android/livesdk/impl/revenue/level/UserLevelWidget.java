package com.bytedance.android.livesdk.impl.revenue.level;

import X.BCW;
import X.C0K2;
import X.C0NB;
import X.C15420j4;
import X.C29774BmM;
import X.C29791Bmd;
import X.C29794Bmg;
import X.C29799Bml;
import X.C29800Bmm;
import X.C29805Bmr;
import X.C29809Bmv;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C68322mC;
import X.C76800UCe;
import X.C87095YGd;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.XJ8;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.api.revenue.level.event.UserLevelEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.impl.revenue.level.viewmodel.UserLevelViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelDynamicConfig;
import com.bytedance.android.livesdk.livesetting.level.UserLevelFirstRequestGradeInfoApiSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGradeInfoOptSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveBadgeLoadOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS152S0200000_5;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import org.json.JSONObject;
import tikcast.api.privilege.GradeConfig;
import ujb.o;

/* loaded from: classes6.dex */
public final class UserLevelWidget extends RoomRecycleWidget {
    public Room LJLIL;
    public final C5H3 LJLILLLLZI;
    public boolean LJLJI;

    public UserLevelWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(UserLevelViewModel.class);
        this.LJLILLLLZI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS155S0100000_5(LIZ, 216), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C29800Bmm gr;
        this.LJLJI = false;
        LJZ();
        UserLevelViewModel LJZ = LJZ();
        if (LJZ != null && (gr = LJZ.gr()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentLevel", gr.LIZ);
            jSONObject.put("currentScore", gr.LIZIZ);
            jSONObject.put("fromLevel", gr.LJIIJJI);
            jSONObject.put("levelStatus", gr.LJFF);
            jSONObject.put("avatarBorderColor", gr.LJIIJ);
            jSONObject.put("barrageEffectConfig", gr.LJIIIZ);
            jSONObject.put("levelMaxScore", gr.LJII);
            jSONObject.put("levelMinScore", gr.LJI);
            jSONObject.put("secondToSleep", gr.LJIIIIZZ);
            jSONObject.put("version", gr.LJIILIIL);
            InterfaceC30442Bx8.f1.LIZJ(jSONObject.toString());
        }
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            Handler LIZ = C29774BmM.LIZ();
            if (LIZ != null) {
                LIZ.removeMessages(0);
            }
        } else {
            C29791Bmd.LIZJ.LIZ.removeMessages(0);
        }
        super.onUnload();
        IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
        if (iUserLevelService instanceof UserLevelService) {
            iUserLevelService.Q1();
        }
    }

    public static boolean LJLZ() {
        if (C29809Bmv.LIZ && UserLevelFirstRequestGradeInfoApiSetting.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }

    public final UserLevelViewModel LJZ() {
        return (UserLevelViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.io.File] */
    public final void LJZL(List<GradeConfig> list) {
        boolean z;
        int i;
        if (Math.abs(System.currentTimeMillis() - C29805Bmr.LIZLLL) < C29805Bmr.LIZ) {
            z = false;
        } else {
            z = true;
        }
        C29805Bmr.LIZLLL = System.currentTimeMillis();
        if (!z || LiveBadgeLoadOptSetting.INSTANCE.diskCacheOpt()) {
            return;
        }
        UserLevelDynamicConfig userLevelDynamicConfig = UserLevelSettings.INSTANCE.getUserLevelConfig().userLevelDynamicConfig;
        if (userLevelDynamicConfig != null) {
            i = userLevelDynamicConfig.preloadBadgeIconDelayTime;
        } else {
            i = 9;
        }
        long j = i * 1000;
        if (j < 0) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        Context context = this.context;
        if (context != null) {
            c68322mC.element = C15420j4.LIZJ(context);
        }
        LJZI(new AqS152S0200000_5(list, (List<GradeConfig>) c68322mC, (C68322mC<File>) 10), j);
    }

    public final void LL(boolean z) {
        int i;
        UserLevelDynamicConfig userLevelDynamicConfig = UserLevelSettings.INSTANCE.getUserLevelConfig().userLevelDynamicConfig;
        if (userLevelDynamicConfig != null) {
            i = userLevelDynamicConfig.fetchFeGeckoDelayTime;
        } else {
            i = 7;
        }
        long j = i * 1000;
        if (j < 0) {
            return;
        }
        if (!z) {
            j = 0;
        }
        LJZI(new AqS155S0100000_5(this, 217), j);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C0NB.LJIIIZ("UserLevelWidget", "onInIt");
        try {
            UserLevelViewModel LJZ = LJZ();
            if (LJZ != null && LJZ.LJLJI) {
                LJZ.hv0();
            }
        } catch (Exception e) {
            C0K2.LIZ("UserLevel load state from cache exception", e);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        String str;
        boolean z;
        int i;
        Boolean bool;
        Boolean bool2;
        boolean z2 = true;
        this.LJLJI = true;
        LJZ();
        super.onLoad(objArr);
        C0NB.LJIIIZ("UserLevelWidget", "onLoad");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLIL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.kv0(UserIsAnchorChannel.class)) != null) {
            bool2.booleanValue();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.kv0(BCW.class)) != null) {
            bool.booleanValue();
        }
        IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
        if (iUserLevelService instanceof UserLevelService) {
            UserLevelViewModel LJZ = LJZ();
            if (LJZ != null) {
                iUserLevelService.d90(LJZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        try {
            str = (String) ((IBrowserService) CN1.LIZ(IBrowserService.class)).Wn(this.context, "user_level_upgrade_config");
        } catch (Throwable th) {
            C29794Bmg.LIZ("user_level", th.getMessage());
            C0K2.LIZ("user level getJsSavedLevelConfig exception ", th);
        }
        if (str == null) {
            str = "";
        }
        C0NB.LJ("UserLevelWidget", str);
        if (UserLevelGradeInfoOptSetting.INSTANCE.getValue()) {
            if ((!o.LJJJJJL(str)) && !LJLZ() && C29799Bml.LIZ != null) {
                if (!kotlin.jvm.internal.o.LJ(C29799Bml.LJIIIIZZ, C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale()))) {
                    String LIZ = C87095YGd.LIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale());
                    kotlin.jvm.internal.o.LJIIIIZZ(LIZ, "getWebcastLanguage(Servi…ss.java).currentLocale())");
                    C29799Bml.LJIIIIZZ = LIZ;
                } else {
                    UserLevelViewModel LJZ2 = LJZ();
                    if (LJZ2 != null) {
                        UserLevelViewModel.kv0(LJZ2, C29799Bml.LIZ, false, 1, "user_level_data_holder", null, null, 48);
                    }
                }
            }
            if ((!o.LJJJJJL(str)) && !LJLZ()) {
                UserLevelViewModel LJZ3 = LJZ();
                if (LJZ3 != null) {
                    LJZ3.DK(true, new AqS171S0100000_5(this, 391), "enter_room", Boolean.FALSE, "");
                }
            } else {
                UserLevelViewModel LJZ4 = LJZ();
                if (LJZ4 != null) {
                    LJZ4.iv0(new AqS171S0100000_5(this, 392));
                }
            }
        } else if ((!o.LJJJJJL(str)) && !LJLZ()) {
            UserLevelViewModel LJZ5 = LJZ();
            if (LJZ5 != null) {
                LJZ5.DK(true, new AqS171S0100000_5(this, 393), "enter_room", Boolean.FALSE, "");
            }
        } else {
            UserLevelViewModel LJZ6 = LJZ();
            if (LJZ6 != null) {
                LJZ6.iv0(new AqS171S0100000_5(this, 394));
            }
        }
        C29809Bmv.LIZ = false;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.lv0(this, UserLevelEvent.class, new AqS171S0100000_5(this, 395));
        }
        UserLevelViewModel LJZ7 = LJZ();
        if (LJZ7 != null) {
            CopyOnWriteArraySet<Double> LIZJ = InterfaceC30442Bx8.k0.LIZJ();
            kotlin.jvm.internal.o.LJIIIIZZ(LIZJ, "USER_LEVEL_NEW_UNLOCK_GIFT_ID_SET.value");
            LJZ7.LJLIL = LIZJ;
        }
        C0NB.LIZIZ("UserLevelWidget", "read new unlock gift success");
        long abs = Math.abs(System.currentTimeMillis() - C29805Bmr.LIZIZ);
        long j = C29805Bmr.LIZ;
        if (abs < j) {
            z = false;
        } else {
            z = true;
        }
        C29805Bmr.LIZIZ = System.currentTimeMillis();
        if (z) {
            LL(true);
        }
        if (Math.abs(System.currentTimeMillis() - C29805Bmr.LIZJ) < j) {
            z2 = false;
        }
        C29805Bmr.LIZJ = System.currentTimeMillis();
        if (z2) {
            UserLevelDynamicConfig userLevelDynamicConfig = UserLevelSettings.INSTANCE.getUserLevelConfig().userLevelDynamicConfig;
            if (userLevelDynamicConfig != null) {
                i = userLevelDynamicConfig.fetchNativeGeckoDelayTime;
            } else {
                i = 4;
            }
            long j2 = i * 1000;
            if (j2 >= 0) {
                LJZI(new AqS155S0100000_5(this, 318), j2);
            }
        }
        C0NB.LIZIZ("UserLevelWidget", "update user level success");
    }

    public final void LJZI(InterfaceC65784Pro interfaceC65784Pro, long j) {
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            ARunnableS37S0100000_1 aRunnableS37S0100000_1 = new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 76);
            Handler LIZ = C29774BmM.LIZ();
            if (LIZ != null) {
                LIZ.postDelayed(aRunnableS37S0100000_1, j);
                return;
            }
            return;
        }
        C29791Bmd c29791Bmd = C29791Bmd.LIZJ;
        Looper looper = c29791Bmd.LIZIZ.getLooper();
        kotlin.jvm.internal.o.LJIIIIZZ(looper, "backGroundThread.looper");
        if (!kotlin.jvm.internal.o.LJ(looper, Looper.myLooper())) {
            C0NB.LIZIZ("UserLevelWidget", "current thread is background looper");
            c29791Bmd.LIZ(j, new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 77));
        } else {
            interfaceC65784Pro.invoke();
        }
    }
}
