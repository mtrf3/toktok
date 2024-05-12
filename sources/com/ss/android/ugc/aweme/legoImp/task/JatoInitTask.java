package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C16880lQ;
import X.C1FP;
import X.C34325DdZ;
import X.C34327Ddb;
import X.C34834Dlm;
import X.C34871DmN;
import X.C34873DmP;
import X.C35214Dru;
import X.C35242DsM;
import X.C35274Dss;
import X.C35526Dww;
import X.C35810E3q;
import X.C36121EFp;
import X.C36122EFq;
import X.C36125EFt;
import X.C36496EUa;
import X.C36531EVj;
import X.C37179EiV;
import X.C62822Ol8;
import X.C90O;
import X.DSR;
import X.DVD;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EUS;
import X.EVM;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FCD;
import X.FKM;
import X.FKN;
import X.FMW;
import X.InterfaceC36076EDw;
import X.RunnableC36129EFx;
import Y.ARunnableS20S0000000_14;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.memory.los.HeapLargeObjectExclusion;
import java.util.List;

/* loaded from: classes7.dex */
public final class JatoInitTask implements EE1, InterfaceC36076EDw {
    public static final /* synthetic */ int LJLIL = 0;

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "JatoInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 17;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        if (((Boolean) C35274Dss.LJJ.getValue()).booleanValue()) {
            return EE4.IO;
        }
        return EE4.CPU;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        int i;
        if (context == null) {
            return;
        }
        if (FCD.LJI(context)) {
            C36125EFt.LIZ(context);
            if (FKN.LIZIZ(context) == 0) {
                JatoXL.disableClassVerify();
            }
            JatoXL.initScheduler(4867);
            Handler handler = C37179EiV.LJFF;
            handler.postDelayed(new ARunnableS44S0100000_8(context, 56), 5000L);
            handler.post(new ARunnableS42S0100000_6(context, 63));
            if (C36531EVj.LJ) {
                C35810E3q.LJ(3000L);
            }
            if (DSR.LJFF() || (DVD.LIZ() & 8) == 8) {
                JatoXL.boostRenderThread(FKM.LIZ(), -10);
            }
            if (!C90O.LIZ && ((Boolean) C34327Ddb.LIZ.getValue()).booleanValue()) {
                C90O.LIZ = true;
                FMW.LIZIZ("JatoPlayerQueueBufferHelper#tryStartQueueBufferOpt", C36121EFp.LJLIL);
            }
            if (((Boolean) C34325DdZ.LIZ.getValue()).booleanValue()) {
                JatoXL.boostHwui(true, true, true);
            } else {
                JatoXL.boostGLESInit(false);
            }
            if (((Boolean) C34871DmN.LIZ.getValue()).booleanValue()) {
                try {
                    HeapLargeObjectExclusion.nativeExcludeLOS();
                } catch (UnsatisfiedLinkError unused) {
                }
            }
            C62822Ol8 c62822Ol8 = C34873DmP.LIZ;
            if (((Number) c62822Ol8.getValue()).intValue() > 0 && Build.VERSION.SDK_INT > 22) {
                try {
                    HeapLargeObjectExclusion.nativeSetLargeObjectThreshold(((Number) c62822Ol8.getValue()).intValue());
                } catch (UnsatisfiedLinkError unused2) {
                }
            }
            C1FP.LJIJI(C35526Dww.LJLIL);
            if (C35214Dru.LIZLLL) {
                C35810E3q.LJIIJJI(C34834Dlm.LIZ);
            }
            if (((Boolean) C35274Dss.LIZLLL.getValue()).booleanValue()) {
                Thread thread = C16880lQ.LLJJJJ().getThread();
                if (JatoXL.isInited()) {
                    try {
                        i = EUS.LIZIZ(((Long) C36496EUa.LIZ(Thread.class, "nativePeer").get(thread)).longValue() + 12);
                    } catch (Throwable unused3) {
                        i = -1;
                    }
                    EVM.LIZ(i, -20);
                    CpusetManager.bindBigCore(i);
                }
                C37179EiV.LIZ().post(RunnableC36129EFx.LJLIL);
            }
            Handler handler2 = C37179EiV.LJFF;
            handler2.post(new ARunnableS42S0100000_6(context, 36));
            C62822Ol8 c62822Ol82 = C35242DsM.LIZ;
            if (((Number) c62822Ol82.getValue()).intValue() > 0) {
                JatoXL.setLockMaxSpinsAsync(((Number) c62822Ol82.getValue()).intValue());
            }
            if (((Boolean) C36122EFq.LIZIZ.getValue()).booleanValue()) {
                handler2.post(new ARunnableS20S0000000_14(4));
                return;
            }
            return;
        }
        C36125EFt.LIZIZ(context);
        JatoXL.disableClassVerify();
    }
}
