package com.ss.android.ugc.aweme.ml.common;

import X.C0RN;
import X.C16880lQ;
import X.C36089EEj;
import X.C36093EEn;
import X.C38891fp;
import X.C46434IKg;
import X.C48536J3c;
import X.C48541J3h;
import X.C78857UxB;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.IE2;
import X.InterfaceC48540J3g;
import X.J34;
import X.J3O;
import X.J4B;
import android.content.Context;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ClientAiInitServiceImpl implements IInferenceEngineService {
    @Override // com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService
    public final void init(Context context) {
        int i;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            o.LJI(context);
            IE2.LIZ = J3O.LIZJ;
            C38891fp c38891fp = new C38891fp();
            C16880lQ.LLLLL(context);
            C48541J3h.LIZ = c38891fp;
            J34.LIZ(context);
            C48536J3c c48536J3c = InterfaceC48540J3g.LJJJJ;
            C78857UxB c78857UxB = new C78857UxB();
            c48536J3c.getClass();
            C48536J3c.LIZ = c78857UxB;
            if (C48536J3c.LIZJ && !(z = C48536J3c.LIZIZ)) {
                synchronized (Boolean.valueOf(z)) {
                    InterfaceC48540J3g interfaceC48540J3g = C48536J3c.LIZ;
                    if (interfaceC48540J3g != null) {
                        C48536J3c.LIZIZ = true;
                        interfaceC48540J3g.tryInit();
                    }
                }
            }
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(new EE1() { // from class: com.ss.android.ugc.aweme.ml.common.ClientAiInitServiceImpl$init$1
                @Override // X.EEY
                public final String key() {
                    return "ClientAiInitServiceImpl$init$1";
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

                @Override // X.EEY
                public final void run(Context context2) {
                    o.LJIIIZ(context2, "context");
                    MLCommonService.Companion.getClass();
                    C46434IKg.LIZ.checkAndInit(2);
                }
            }, true);
            LJIIIZ.LIZJ();
            i = 0;
        } catch (Throwable unused) {
            i = -1;
        }
        J4B.LIZ = System.currentTimeMillis() - currentTimeMillis;
        J4B.LIZIZ = i;
    }
}
