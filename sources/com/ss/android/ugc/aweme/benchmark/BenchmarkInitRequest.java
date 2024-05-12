package com.ss.android.ugc.aweme.benchmark;

import X.C09580Ze;
import X.C0RN;
import X.C10920bo;
import X.C10930bp;
import X.C16880lQ;
import X.C1FO;
import X.C34650Dio;
import X.C36089EEj;
import X.C43075GvP;
import X.EE1;
import X.EE4;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FRD;
import X.InterfaceC09240Xw;
import X.InterfaceC36076EDw;
import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BenchmarkInitRequest implements EE1, InterfaceC36076EDw {
    @Override // X.InterfaceC36076EDw
    public /* bridge */ /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public String key() {
        return "BenchmarkInitRequest";
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public /* bridge */ /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.EE1
    public /* bridge */ /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public /* bridge */ /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    private final String getWordSpace() {
        String str;
        if (FRD.LIZ()) {
            str = null;
            File LLIIJI = C16880lQ.LLIIJI(EF7.LIZIZ(), null);
            if (LLIIJI != null) {
                str = LLIIJI.getPath();
            }
        } else {
            str = C43075GvP.LIZ;
        }
        String absolutePath = new File(str, "bytebench").getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "File(\n            if (En…h\"\n        ).absolutePath");
        return absolutePath;
    }

    private final void initStrategy() {
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(EF7.LJIIIZ);
        C10920bo c10920bo = new C10920bo();
        c10920bo.LIZ = "a5fafb0vf8ba061000qzbwg0irxc02afaf4";
        c10920bo.LIZIZ = "00qzdilcy900ojjtxy674bozlqmt0yja";
        c10920bo.LIZJ = 1233;
        LIZIZ.LIZJ(new C10930bp(c10920bo));
    }

    @Override // X.EEY
    public EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public EE4 threadType() {
        return EE4.IO;
    }

    @Override // X.EE1
    public EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public void run(Context context) {
        C1FO.LJLIL = new BenchmarkInitRequest$run$1();
        initStrategy();
        if ((((Number) C34650Dio.LIZ.getValue()).intValue() & 1) == 1) {
            C36089EEj c36089EEj = new C36089EEj(false, false);
            c36089EEj.LIZIZ(new BenckmarkCollection(), true);
            c36089EEj.LIZJ();
            return;
        }
        new BenckmarkCollection().run(context);
    }
}
