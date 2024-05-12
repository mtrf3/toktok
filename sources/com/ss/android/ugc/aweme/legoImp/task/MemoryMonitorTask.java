package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C88045Ygz;
import X.EE1;
import X.EFK;
import X.EnumC35465Dvx;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import java.util.List;

/* loaded from: classes7.dex */
public class MemoryMonitorTask implements EE1 {
    public EnumC35465Dvx LJLIL = EnumC35465Dvx.LOCALTEST_MODE;

    @Override // X.EEY
    public final String key() {
        return "MemoryMonitorTask";
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        return !((Boolean) C88045Ygz.LJ.getValue()).booleanValue();
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
    public final int targetProcess() {
        return 1;
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

    /* JADX WARN: Can't wrap try/catch for region: R(9:94|95|(2:97|98)|(5:100|101|102|103|(2:105|106)(1:107))|112|113|114|103|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0269, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x026a, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.MemoryMonitorTask.run(android.content.Context):void");
    }
}
