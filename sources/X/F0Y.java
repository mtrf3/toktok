package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.hybridkit.experiment.SparkLynxBridgeThreadDispatcherSettings;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class F0Y extends C37979EvP {
    @Override // X.C37979EvP
    public final void LIZ(C37955Ev1 c37955Ev1, AqS110S0300000_6 aqS110S0300000_6) {
        C60737Nsb hybridContext;
        String str;
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel = SparkLynxBridgeThreadDispatcherSettings.LIZ;
        SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel sparkLynxBridgeThreadDispatcherModel2 = (SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel) LIZLLL.LJIIIIZZ("spark_lynx_bridge_thread_dispatcher", SparkLynxBridgeThreadDispatcherSettings.SparkLynxBridgeThreadDispatcherModel.class, sparkLynxBridgeThreadDispatcherModel);
        if (sparkLynxBridgeThreadDispatcherModel2 != null) {
            sparkLynxBridgeThreadDispatcherModel = sparkLynxBridgeThreadDispatcherModel2;
        }
        if (!sparkLynxBridgeThreadDispatcherModel.enable) {
            C37993Evd.LJFF(aqS110S0300000_6);
            return;
        }
        if (sparkLynxBridgeThreadDispatcherModel.oldEnable) {
            C37993Evd.LJI(c37955Ev1, sparkLynxBridgeThreadDispatcherModel, aqS110S0300000_6);
            return;
        }
        String str2 = c37955Ev1.LJJIIZI.LJI;
        if (str2 != null) {
            C31999Ch9.LIZJ.getClass();
            InterfaceC60761Nsz LIZIZ = C31999Ch9.LIZIZ(str2);
            if (LIZIZ != null && (hybridContext = LIZIZ.getHybridContext()) != null && (hybridContext instanceof SparkContext)) {
                String str3 = hybridContext.url;
                List<String> list = sparkLynxBridgeThreadDispatcherModel.denyChannelList;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str4 : list) {
                        if (o.LJ("*", str4) || s.LJJJLZIJ(str3, str4, false)) {
                            C37993Evd.LJI(c37955Ev1, sparkLynxBridgeThreadDispatcherModel, aqS110S0300000_6);
                            return;
                        }
                    }
                }
                List<String> list2 = sparkLynxBridgeThreadDispatcherModel.allowChannelList;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (String str5 : list2) {
                        if (o.LJ("*", str5) || s.LJJJLZIJ(str3, str5, false)) {
                            if (c37955Ev1.LJJIIZI.LIZIZ(c37955Ev1)) {
                                str = c37955Ev1.LJJIIZI.LIZ();
                            } else {
                                str = "host";
                            }
                            List<String> list3 = sparkLynxBridgeThreadDispatcherModel.lynxThreadList.get(str);
                            if (list3 != null && list3.contains(c37955Ev1.LIZLLL)) {
                                c37955Ev1.LJIJI = "LYNX_THREAD";
                                C37993Evd.LJ(aqS110S0300000_6, F0Z.LYNX_THREAD);
                                return;
                            }
                            List<String> list4 = sparkLynxBridgeThreadDispatcherModel.normalThreadList.get(str);
                            if (list4 != null && list4.contains(c37955Ev1.LIZLLL)) {
                                c37955Ev1.LJIJI = "TT_NORMAL_THREAD";
                                C37993Evd.LJ(aqS110S0300000_6, F0Z.TT_NORMAL_THREAD);
                                return;
                            }
                            List<String> list5 = sparkLynxBridgeThreadDispatcherModel.cpuThreadList.get(str);
                            if (list5 != null && list5.contains(c37955Ev1.LIZLLL)) {
                                c37955Ev1.LJIJI = "TT_CPU_THREAD";
                                C37993Evd.LJ(aqS110S0300000_6, F0Z.TT_CPU_THREAD);
                                return;
                            }
                            List<String> list6 = sparkLynxBridgeThreadDispatcherModel.ioThreadList.get(str);
                            if (list6 != null && list6.contains(c37955Ev1.LIZLLL)) {
                                c37955Ev1.LJIJI = "TT_IO_THREAD";
                                C37993Evd.LJ(aqS110S0300000_6, F0Z.TT_IO_THREAD);
                                return;
                            }
                            List<String> list7 = sparkLynxBridgeThreadDispatcherModel.serialThreadList.get(str);
                            if (list7 != null && list7.contains(c37955Ev1.LIZLLL)) {
                                c37955Ev1.LJIJI = "TT_SERIAL_THREAD";
                                C37993Evd.LJ(aqS110S0300000_6, F0Z.TT_SERIAL_THREAD);
                                return;
                            }
                            List<String> list8 = sparkLynxBridgeThreadDispatcherModel.backgroundThreadList.get(str);
                            if (list8 != null && list8.contains(c37955Ev1.LIZLLL)) {
                                c37955Ev1.LJIJI = "TT_BACKGROUND_THREAD";
                                C37993Evd.LJ(aqS110S0300000_6, F0Z.TT_BACKGROUND_THREAD);
                                return;
                            } else {
                                c37955Ev1.LJIJI = "MAIN_THREAD";
                                C37993Evd.LJ(aqS110S0300000_6, F0Z.MAIN_THREAD);
                                return;
                            }
                        }
                    }
                }
                C37993Evd.LJI(c37955Ev1, sparkLynxBridgeThreadDispatcherModel, aqS110S0300000_6);
                return;
            }
        }
        C37993Evd.LJI(c37955Ev1, sparkLynxBridgeThreadDispatcherModel, aqS110S0300000_6);
    }
}
