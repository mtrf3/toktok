package com.bytedance.helios.nativeaudio;

import X.C0EH;
import X.C0MT;
import X.C16880lQ;
import X.C64401PPh;
import X.C66059PwF;
import X.C66063PwJ;
import X.C66120PxE;
import X.C66137PxV;
import X.C66138PxW;
import X.C66155Pxn;
import X.EnumC66158Pxq;
import X.HandlerThreadC64418PPy;
import X.InterfaceC66176Py8;
import X.PQ0;
import X.RunnableC66061PwH;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.helios.api.consumer.AnchorExtra;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AudioMonitorImpl implements InterfaceC66176Py8 {
    public static final String[] LIZIZ;
    public final List<C66120PxE> LIZ = new CopyOnWriteArrayList();

    public static String LIZLLL(int i) {
        return i != 0 ? i != 1 ? "Unknown" : "AAudio" : "OpenSLES";
    }

    public static native void startMonitor(AudioMonitorCallback audioMonitorCallback, boolean z, int i);

    @Override // X.InterfaceC66176Py8
    public final void LIZIZ() {
        ((CopyOnWriteArrayList) this.LIZ).clear();
    }

    public final void LIZJ() {
        C66063PwJ.LIZIZ("Helios-Log-Api-Call", "startMonitor: ");
        startMonitor(new Callback(), true, 32);
        C66138PxW.LIZIZ("nar", this);
    }

    static {
        ByteHook.init();
        C16880lQ.LLJJJIL("nativeaudio");
        LIZIZ = new String[]{"FORE_START_FORE_END", "FORE_START_BACK_END", "BACK_START_FORE_END", "BACK_START_BACK_END"};
    }

    @Override // X.InterfaceC66176Py8
    public final List<C66120PxE> LIZ() {
        return this.LIZ;
    }

    /* loaded from: classes12.dex */
    public class Callback implements AudioMonitorCallback {
        public Callback() {
        }

        public void onClosed(long j, int i, String str) {
            C66120PxE c66120PxE;
            Iterator it = ((CopyOnWriteArrayList) AudioMonitorImpl.this.LIZ).iterator();
            while (true) {
                if (it.hasNext()) {
                    c66120PxE = (C66120PxE) it.next();
                    if (c66120PxE.LJZ == j && TextUtils.equals(c66120PxE.LJLJJL, AudioMonitorImpl.LIZLLL(i))) {
                        break;
                    }
                } else {
                    c66120PxE = null;
                    break;
                }
            }
            if (c66120PxE != null) {
                String str2 = c66120PxE.LJLJL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append("\n");
                LIZ.append(str);
                String LIZIZ = X1D.LIZIZ(LIZ);
                o.LJIIIZ(LIZIZ, "<set-?>");
                c66120PxE.LJLJL = LIZIZ;
                c66120PxE.LLD = 1;
                int i2 = !c66120PxE.LJLJLLL ? 1 : 0;
                PQ0.LJFF.getClass();
                String str3 = AudioMonitorImpl.LIZIZ[(1 ^ (PQ0.LJ() ? 1 : 0)) | ((i2 ^ 1) << 1)];
                o.LJIIIZ(str3, "<set-?>");
                c66120PxE.LJLL = str3;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(AudioMonitorImpl.LIZLLL(i));
                LIZ2.append("Close");
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(LIZIZ2, "<set-?>");
                c66120PxE.LJLJJI = LIZIZ2;
                if (i == 0) {
                    c66120PxE.LJLJI = 100497;
                } else {
                    c66120PxE.LJLJI = 100499;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("monitorTrigger factors=nar_close calledTime=");
                LIZ3.append(c66120PxE.LJLLJ);
                C0MT.LIZLLL(LIZ3, " runtimeObjHashcode=", j, " eventCurrentPageHashCode=");
                C0EH.LIZLLL(LIZ3, c66120PxE.LJLLI, " type=", i, " msg=");
                LIZ3.append(str);
                C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ3));
                C66059PwF.LIZIZ(c66120PxE);
                AudioMonitorImpl audioMonitorImpl = AudioMonitorImpl.this;
                int size = ((CopyOnWriteArrayList) audioMonitorImpl.LIZ).size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C66120PxE c66120PxE2 = (C66120PxE) ListProtector.get(audioMonitorImpl.LIZ, size);
                        if (c66120PxE2.LJZ == j && TextUtils.equals(c66120PxE2.LJLJJL, AudioMonitorImpl.LIZLLL(i))) {
                            ListProtector.remove(audioMonitorImpl.LIZ, size);
                        }
                    } else {
                        return;
                    }
                }
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("monitorTrigger factors=nar_close no pair event! runtimeObjHashcode=");
                LIZ4.append(j);
                LIZ4.append(" type=");
                LIZ4.append(i);
                LIZ4.append(" msg=");
                LIZ4.append(str);
                C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ4));
            }
        }

        public void onOpened(long j, int i, String str) {
            String str2;
            PQ0.LJFF.getClass();
            boolean z = !PQ0.LJ();
            CopyOnWriteArrayList<C66155Pxn> copyOnWriteArrayList = C66137PxV.LIZIZ;
            C66120PxE c66120PxE = new C66120PxE();
            c66120PxE.LJLILLLLZI = "nar";
            c66120PxE.LLD = 0;
            c66120PxE.LJLZ = "SensitiveApiException";
            c66120PxE.LLIIIL = "NativeAudioRecord";
            c66120PxE.LJLJJL = AudioMonitorImpl.LIZLLL(i);
            c66120PxE.LJLJJI = "Open";
            c66120PxE.LJZ = j;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioMonitorImpl.java:\n");
            String[] split = str.split("\n");
            StringBuilder sb = new StringBuilder();
            for (String str3 : split) {
                if (!str3.contains("libart.so")) {
                    sb.append(str3);
                    sb.append("\n");
                }
            }
            LIZ.append(sb.toString());
            String LIZIZ = X1D.LIZIZ(LIZ);
            o.LJIIIZ(LIZIZ, "<set-?>");
            c66120PxE.LJLJL = LIZIZ;
            c66120PxE.LJLJLLL = !z;
            if (z) {
                str2 = "FORE_START";
            } else {
                str2 = "BACK_START";
            }
            c66120PxE.LJLL = str2;
            String name = C16880lQ.LLLLIIIILLL().getName();
            o.LJIIIZ(name, "<set-?>");
            c66120PxE.LL = name;
            PQ0 pq0 = PQ0.LJFF;
            pq0.getClass();
            c66120PxE.LJLLI = C64401PPh.LIZ();
            String copyOnWriteArrayList2 = pq0.LIZ.toString();
            o.LJIIIZ(copyOnWriteArrayList2, "<set-?>");
            c66120PxE.LJLJLJ = copyOnWriteArrayList2;
            c66120PxE.LJLLILLLL = PQ0.LIZJ();
            c66120PxE.LJLLJ = System.currentTimeMillis();
            AnchorExtra anchorExtra = new AnchorExtra(0, 0L, new HashSet(0), new HashSet(0));
            anchorExtra.getFloatingViewEvents().addAll(copyOnWriteArrayList);
            anchorExtra.getHistoryFloatingViewEvents().addAll(copyOnWriteArrayList);
            c66120PxE.LLII = anchorExtra;
            c66120PxE.LLIIJLIL.add("audio");
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.postDelayed(new RunnableC66061PwH(c66120PxE), HeliosEnvImpl.get().LJIIJ.crpConfig.reportDelayedMills);
            if ("decision_engine".equals(HeliosEnvImpl.get().LJIIJ.engineType)) {
                c66120PxE.LLI.getCheckModes().add(EnumC66158Pxq.ASYNC);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("monitorTrigger factors=nar_open calledTime=");
            LIZ2.append(c66120PxE.LJLLJ);
            C0MT.LIZLLL(LIZ2, " runtimeObjHashcode=", j, " eventCurrentPageHashCode=");
            C0EH.LIZLLL(LIZ2, c66120PxE.LJLLI, " type=", i, " msg=");
            LIZ2.append(str);
            C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ2));
            ((CopyOnWriteArrayList) AudioMonitorImpl.this.LIZ).add(c66120PxE);
            if (i == 0) {
                c66120PxE.LJLJI = 100496;
            } else {
                c66120PxE.LJLJI = 100498;
            }
            C66059PwF.LIZIZ(c66120PxE);
        }
    }
}
