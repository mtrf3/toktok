package com.ss.android.ugc.aweme.request_combine.common;

import X.C0RN;
import X.C10K;
import X.C16880lQ;
import X.C34195DbT;
import X.C36093EEn;
import X.C36922EeM;
import X.C40328FsC;
import X.C58096Mr6;
import X.EE1;
import X.EE4;
import X.EF7;
import X.EFK;
import X.EI0;
import X.EI6;
import X.EKF;
import X.EKG;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F9J;
import X.InterfaceC36076EDw;
import Y.ACallableS109S0100000_6;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ServerPortraitCollections implements IServerPortraitService {
    public volatile m LIZ;
    public volatile m LIZIZ;

    /* loaded from: classes7.dex */
    public final class PortraitRequestTask implements EE1, InterfaceC36076EDw {
        @Override // X.InterfaceC36076EDw
        public final /* synthetic */ String[] deps() {
            return null;
        }

        @Override // X.EEY
        public final String key() {
            return "ServerPortraitCollections$PortraitRequestTask";
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

        @Override // X.InterfaceC36076EDw
        public final EE4 threadType() {
            if (((Boolean) C34195DbT.LJIIIIZZ.getValue()).booleanValue()) {
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
            return EFK.BOOT_FINISH;
        }

        public PortraitRequestTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            C36922EeM.LJ("PortraitRequestTask");
            try {
                m LIZ = UserPortraitApi.LIZ();
                ServerPortraitCollections serverPortraitCollections = ServerPortraitCollections.this;
                synchronized (serverPortraitCollections) {
                    if (LIZ != null) {
                        try {
                            serverPortraitCollections.LIZ = LIZ;
                            m mVar = serverPortraitCollections.LIZ;
                            o.LJI(mVar);
                            ServerPortraitCollections.LJFF(mVar);
                        } catch (Exception e) {
                            C36922EeM.LIZ(e);
                        }
                    }
                }
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    public final synchronized void LIZLLL() {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = (m) GsonProtectorUtils.fromJson(new Gson(), F9J.LIZIZ(EF7.LIZIZ(), 0, "user_portraits_sp").getString("user_portraits_sp", null), new EKG().getType());
            }
        } finally {
        }
    }

    public static IServerPortraitService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IServerPortraitService.class, false);
        if (LIZ != null) {
            return (IServerPortraitService) LIZ;
        }
        if (C58096Mr6.A4 == null) {
            synchronized (IServerPortraitService.class) {
                if (C58096Mr6.A4 == null) {
                    C58096Mr6.A4 = new ServerPortraitCollections();
                }
            }
        }
        return C58096Mr6.A4;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IServerPortraitService
    public final m LIZIZ() {
        if (this.LIZ != null) {
            m mVar = this.LIZ;
            o.LJI(mVar);
            if (mVar.size() > 0) {
                return this.LIZ;
            }
        }
        if (this.LIZIZ != null) {
            m mVar2 = this.LIZIZ;
            o.LJI(mVar2);
            if (mVar2.size() > 0) {
                return this.LIZIZ;
            }
        }
        return null;
    }

    public final void LJ() {
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new PortraitRequestTask(), true);
        LIZJ.LIZJ();
    }

    public ServerPortraitCollections() {
        if (EI6.LIZ) {
            C10K.LIZJ(new ACallableS109S0100000_6(this, 5));
            ColdLaunchRequestCombinerImpl.LIZJ().LIZ(new EKF(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IServerPortraitService
    public final m LIZ() {
        LIZLLL();
        return this.LIZIZ;
    }

    public static void LJFF(m mVar) {
        SharedPreferences LIZIZ = F9J.LIZIZ(EF7.LIZIZ(), 0, "user_portraits_sp");
        LIZIZ.edit().putString("user_portraits_sp", GsonProtectorUtils.toJson(new Gson(), (j) mVar)).apply();
    }
}
