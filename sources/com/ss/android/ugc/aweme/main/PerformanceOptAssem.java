package com.ss.android.ugc.aweme.main;

import X.ActivityC45651qj;
import X.AnonymousClass027;
import X.C109434Rf;
import X.C16300kU;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C29S;
import X.C2K0;
import X.C2NG;
import X.C2NW;
import X.C2QU;
import X.C32I;
import X.C33778DNm;
import X.C33827DPj;
import X.C33839DPv;
import X.C33842DPy;
import X.C33867DQx;
import X.C33873DRd;
import X.C34710Djm;
import X.C34843Dlv;
import X.C34851Dm3;
import X.C35216Drw;
import X.C35331Dtn;
import X.C35478DwA;
import X.C35818E3y;
import X.C36152EGu;
import X.C37179EiV;
import X.C38612FDk;
import X.C38619FDr;
import X.C38816FLg;
import X.C38891fp;
import X.C38995FSd;
import X.C39082FVm;
import X.C39106FWk;
import X.C39670Fha;
import X.C3SZ;
import X.C56662Kg;
import X.C56672Kh;
import X.C57022Lq;
import X.C62822Ol8;
import X.C76800UCe;
import X.C86801Y4v;
import X.C99O;
import X.DPY;
import X.DQB;
import X.DR6;
import X.DRV;
import X.DVD;
import X.E3F;
import X.FDU;
import X.FDV;
import X.FDW;
import X.FDX;
import X.FDY;
import X.FE5;
import X.FE8;
import X.FEH;
import X.FET;
import X.FGN;
import X.FN6;
import X.InterfaceC38616FDo;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.JF1;
import X.RunnableC36095EEp;
import X.RunnableC38602FDa;
import Y.ARunnableS17S0300000_6;
import Y.ARunnableS25S0200000_6;
import Y.ARunnableS2S1201000_6;
import Y.ARunnableS40S0100000_4;
import Y.ARunnableS42S0100000_6;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.services.BusinessModuleService;
import com.ss.android.ugc.aweme.services.BusinessModuleServiceImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PerformanceOptAssem extends BaseMainContainerAssem implements IPerformanceAbility, InterfaceC55102Lju {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(FDV.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(FDX.LJLIL);

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1222730094) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8W0
    public final void onCreate() {
        Integer LJJIJIL;
        List<InterfaceC38616FDo> list;
        Integer LJJIJIL2;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(PerformanceOptAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        C38816FLg.LIZLLL(new ARunnableS40S0100000_4(this, 65), 10000);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            if (((Boolean) FDY.LIZLLL.getValue()).booleanValue() && FDY.LJFF.compareAndSet(false, true) && (LJJIJIL2 = C38891fp.LJJIJIL("common_feed_item_feed")) != null) {
                int intValue = LJJIJIL2.intValue();
                C38619FDr.LIZLLL.getClass();
                C38619FDr.LJ(LIZ, intValue, "common_feed_item_feed");
            }
            if (((Boolean) FDY.LIZJ.getValue()).booleanValue() && FDY.LJII.compareAndSet(false, true) && (LJJIJIL = C38891fp.LJJIJIL("common_feed_item_feed")) != null) {
                int intValue2 = LJJIJIL.intValue();
                C38619FDr.LIZLLL.getClass();
                if (C38619FDr.LIZ.get()) {
                    if (C109434Rf.LIZJ(LIZ) != null) {
                        FEH LIZLLL = FE8.LJ.LIZLLL(LIZ);
                        ReentrantReadWriteLock.ReadLock readLock = FE8.LIZIZ.readLock();
                        readLock.lock();
                        try {
                            List LIZLLL2 = FE8.LIZJ.LIZLLL(intValue2);
                            synchronized (LIZLLL2) {
                                FDU fdu = new FDU();
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : LIZLLL2) {
                                    if (((Boolean) fdu.invoke(obj)).booleanValue()) {
                                        arrayList.add(obj);
                                    }
                                }
                                if (!(true ^ arrayList.isEmpty())) {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    FE8.LIZJ.getClass();
                                    C39670Fha.LJI(LIZLLL2, arrayList, LIZ, LIZLLL);
                                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((FE5) it.next()).LJLJJL);
                                    }
                                    list = Collections.unmodifiableList(arrayList2);
                                } else {
                                    list = null;
                                }
                            }
                            if (list != null) {
                                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list, 10));
                                for (InterfaceC38616FDo interfaceC38616FDo : list) {
                                    RunnableC38602FDa runnableC38602FDa = new RunnableC38602FDa(new ARunnableS2S1201000_6(interfaceC38616FDo, LIZ, intValue2, 3));
                                    interfaceC38616FDo.LJ(runnableC38602FDa);
                                    arrayList3.add(runnableC38602FDa);
                                }
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    RunnableC38602FDa runnableC38602FDa2 = (RunnableC38602FDa) it2.next();
                                    C38619FDr.LIZLLL.getClass();
                                    C38612FDk c38612FDk = C38619FDr.LIZIZ;
                                    if (c38612FDk != null) {
                                        c38612FDk.LIZJ.execute(runnableC38602FDa2);
                                    } else {
                                        o.LJIJI("config");
                                        throw null;
                                    }
                                }
                            }
                        } finally {
                            readLock.unlock();
                        }
                    } else {
                        throw new IllegalArgumentException("activityContext must be an Activity or a ContextWrapper which holds an Activity.");
                    }
                }
            }
            FDY.LIZIZ();
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public final void v3() {
        boolean z = false;
        if (((AtomicBoolean) this.LJLILLLLZI.getValue()).compareAndSet(false, true)) {
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 383);
            AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(this, 54);
            if ((C33778DNm.LIZ() & 1) == 1) {
                z = true;
            }
            E3F.LIZJ("calllazy_idle", aqS154S0100000_4, aqS156S0100000_6, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void S5() {
        C29S c29s;
        FGN.LJ = C16880lQ.LLIIIJ();
        if (((Boolean) C34710Djm.LJJIIZI.getValue()).booleanValue() || C34710Djm.LIZIZ()) {
            BusinessModuleService createBusinessModuleServicebyMonsterPlugin = BusinessModuleServiceImpl.createBusinessModuleServicebyMonsterPlugin(false);
            Choreographer LLIIIJ = C16880lQ.LLIIIJ();
            o.LJIIIIZZ(LLIIIJ, "getInstance()");
            createBusinessModuleServicebyMonsterPlugin.doAtTheEndOfMeasure(LLIIIJ, new ARunnableS42S0100000_6(this, 41));
        }
        C56672Kh.LIZ().LIZLLL("main_act_decor_view_opt");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if ((LIZ instanceof C29S) && (c29s = (C29S) LIZ) != null) {
            int intValue = ((Number) C34710Djm.LJIILIIL.getValue()).intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    C56662Kg.LIZ().LIZJ("method_main_get_delegate", false);
                    AnonymousClass027 delegate = c29s.getDelegate();
                    o.LJIIIIZZ(delegate, "activity.delegate");
                    C56662Kg.LIZ().LJFF("method_main_get_delegate", true);
                    C38995FSd.LIZIZ().execute(new ARunnableS42S0100000_6(delegate, 49));
                }
            } else {
                C38995FSd.LIZIZ().execute(new ARunnableS42S0100000_6(c29s, 48));
            }
        }
        C56672Kh.LIZ().LJFF(SystemClock.uptimeMillis(), "main_act_decor_view_opt");
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((LinkedHashMap) C2QU.LIZIZ).clear();
        C2NG c2ng = C57022Lq.LIZ;
        if (c2ng.LJLIL.hasMessages(2022)) {
            c2ng.LJLIL.removeMessages(2022);
        }
        if (((Boolean) C34851Dm3.LIZ.getValue()).booleanValue()) {
            FN6.LJII = false;
        }
        ((ArrayList) C35818E3y.LIZ).clear();
        ((LinkedHashMap) C35818E3y.LIZIZ).clear();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        if (C34710Djm.LJ() != -1) {
            C39106FWk.LIZ().LIZIZ();
        }
    }

    public final void x3() {
        Handler target;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        HomePageDataViewModel LIZ2 = C3SZ.LIZ(LIZ);
        if (((Boolean) C99O.LIZ.getValue()).booleanValue()) {
            Message message = LIZ2.LJLJI;
            Bundle data = message.getData();
            if (data.getBoolean("is_from_feed_cache", false)) {
                Object obj = message.obj;
                o.LJIIIIZZ(obj, "message.obj");
                if (CommonFeedServiceImpl.LJJIJLIJ().LJJIJIIJI(obj) && (target = message.getTarget()) != null) {
                    if (((Boolean) C99O.LIZLLL.getValue()).booleanValue() && !data.getBoolean("has_used_feed_cache", false)) {
                        synchronized (data) {
                            data.putBoolean("has_used_feed_cache", true);
                        }
                        if (((Boolean) C34710Djm.LJJIIZI.getValue()).booleanValue()) {
                            target.handleMessage(message);
                        } else if (C34710Djm.LIZIZ()) {
                            target.postAtFrontOfQueue(new ARunnableS17S0300000_6(LIZ, target, message, 7));
                        } else {
                            C16300kU.LJIIL(LIZ.getWindow().getDecorView(), new ARunnableS25S0200000_6(message, target, 15));
                        }
                    }
                    if (((Boolean) C99O.LIZJ.getValue()).booleanValue()) {
                        target.sendMessageAtFrontOfQueue(message);
                    }
                }
            }
        }
        BusinessModuleServiceImpl.createBusinessModuleServicebyMonsterPlugin(false).notifyFeedCacheCallback(LIZ2.LJLILLLLZI);
    }

    @Override // com.ss.android.ugc.aweme.main.IPerformanceAbility
    public final void uf(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ((CopyOnWriteArrayList) this.LJLIL.getValue()).add(interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        long j;
        ActivityC45651qj LIZ;
        boolean booleanValue;
        if (z && z2) {
            C38816FLg.LIZLLL(new ARunnableS42S0100000_6(this, 42), 300);
            BusinessModuleService createBusinessModuleServicebyMonsterPlugin = BusinessModuleServiceImpl.createBusinessModuleServicebyMonsterPlugin(false);
            if (((Boolean) DVD.LIZJ.getValue()).booleanValue()) {
                createBusinessModuleServicebyMonsterPlugin.setMainLooperOptServiceEnable(false);
            } else if (!((Boolean) C99O.LIZIZ.getValue()).booleanValue()) {
                createBusinessModuleServicebyMonsterPlugin.getMainLooperOptServiceAndUpdateWatchUIFrame();
            }
            x3();
            if (C36152EGu.LJ()) {
                booleanValue = C36152EGu.LIZIZ(FDW.LJLIL);
            } else {
                booleanValue = ((Boolean) C34843Dlv.LIZIZ.getValue()).booleanValue();
            }
            if (booleanValue) {
                DoFrameController.LIZIZ = 3;
            }
            LinkedHashMap LIZIZ = JF1.LIZIZ("monitor_scene", "scene_launch", "launch_type", "launch_type_main");
            LIZIZ.put("vv_code", 5000);
            LIZIZ.put("launch_has_main", 1);
            C39082FVm.LIZJ(LIZIZ);
            if (C2NW.LIZ().LJIIIIZZ(1L)) {
                ((Boolean) DR6.LJ.getValue()).booleanValue();
            }
            if (C2NW.LIZ().LJIIIIZZ(7L)) {
                if (!C86801Y4v.LIZ()) {
                    DRV.LIZ();
                } else {
                    C33873DRd.LIZ();
                }
            }
            if (C2NW.LIZ().isNewUser()) {
                ((Number) C33867DQx.LIZ.getValue()).intValue();
                ((Number) DPY.LIZ.getValue()).intValue();
                C33827DPj.LIZ();
                C33842DPy.LIZ();
                ((Boolean) C33839DPv.LJ.getValue()).booleanValue();
                ((Boolean) C33827DPj.LIZJ.getValue()).booleanValue();
                ((Boolean) DQB.LIZJ.getValue()).booleanValue();
            }
        }
        if (((Number) C35331Dtn.LIZ.getValue()).intValue() == 1 && ((Boolean) C35216Drw.LIZ.getValue()).booleanValue() && (LIZ = C212428Vi.LIZ(this)) != null) {
            FET.LIZIZ(1, LIZ);
        }
        if (C2NW.LIZ().LJJIIZ()) {
            Handler LIZ2 = C37179EiV.LIZ();
            RunnableC36095EEp runnableC36095EEp = RunnableC36095EEp.LJLIL;
            if (C35478DwA.LIZIZ()) {
                j = LivePlayEnforceIntervalSetting.DEFAULT;
            } else {
                j = 5000;
            }
            LIZ2.postDelayed(runnableC36095EEp, j);
        }
        if (((Number) C34710Djm.LJJJJZ.getValue()).intValue() == 1) {
            BlockHelper.endBlock();
        }
    }
}
