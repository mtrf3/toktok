package com.ss.android.ugc.aweme.runnablemonitor.background;

import X.C0RN;
import X.C38528FAe;
import X.DML;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FAV;
import X.FAY;
import X.FAZ;
import X.InterfaceC36076EDw;
import X.InterfaceC38526FAc;
import X.ORZ;
import Y.IDComparatorS29S0000000_1;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RunableMonitorHelper {
    public static final Map<String, FAZ> LIZ = new LinkedHashMap();

    /* loaded from: classes7.dex */
    public static final class ColdBootRunableMonitorFinishTask implements EE1, InterfaceC36076EDw {
        public static final ColdBootRunableMonitorFinishTask LJLIL = new ColdBootRunableMonitorFinishTask();

        @Override // X.InterfaceC36076EDw
        public final /* synthetic */ String[] deps() {
            return null;
        }

        @Override // X.EEY
        public final String key() {
            return "RunableMonitorHelper$ColdBootRunableMonitorFinishTask";
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.InterfaceC36076EDw
        public final int priority() {
            return 2;
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
        public final boolean meetTrigger() {
            return DML.LIZ();
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.InterfaceC36076EDw
        public final EE4 threadType() {
            return EE4.CPU;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        @Override // X.EEY
        public final void run(Context context) {
            FAZ faz = (FAZ) ((LinkedHashMap) RunableMonitorHelper.LIZ).get("ColdBoot");
            if (faz != null) {
                InterfaceC38526FAc interfaceC38526FAc = faz.LIZLLL;
                if (interfaceC38526FAc != null) {
                    ArrayList arrayList = new ArrayList();
                    Collection<C38528FAe> values = faz.LIZIZ.values();
                    o.LJIIIIZZ(values, "topThreadRunnableMap.values");
                    List LLILII = ORZ.LLILII(new IDComparatorS29S0000000_1(5), ORZ.LLJILJILJ(values));
                    if (LLILII.size() > 10) {
                        LLILII = LLILII.subList(0, 10);
                    }
                    arrayList.add(new FAY("top_thread_runnable", LLILII));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(FAZ.LIZ(FAV.APPLICATION.getValue(), faz.LIZJ));
                    arrayList2.addAll(FAZ.LIZ(FAV.MAIN_ACT_CREATE.getValue(), faz.LIZJ));
                    arrayList2.addAll(FAZ.LIZ(FAV.RESUME_TO_FOCUS.getValue(), faz.LIZJ));
                    arrayList2.addAll(FAZ.LIZ(FAV.FEED_UI_TO_VIDEO.getValue(), faz.LIZJ));
                    arrayList.add(new FAY("top_thread_runnable_stage", arrayList2));
                    interfaceC38526FAc.LIZ(arrayList);
                }
                faz.LIZIZ.clear();
                faz.LIZJ.clear();
            }
        }
    }
}
