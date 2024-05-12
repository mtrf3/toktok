package com.bytedance.pitaya.api;

import X.C93258aNy;
import android.content.Context;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl;

/* loaded from: classes30.dex */
public final class PitayaHostDefault$asyncSetup$injectWrapper$1 implements PTYSetupCallback {
    public final /* synthetic */ PTYSetupCallback $callback;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ CoreDefaultImpl $hostCore;
    public final /* synthetic */ boolean $provideAppLog;
    public final /* synthetic */ SetupInfo $setupInfo;
    public final /* synthetic */ C93258aNy this$0;

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(15:5|6|(1:8)(1:53)|9|(4:17|(1:19)|20|21)|52|(2:24|(1:26)(2:49|50))(1:51)|27|(2:29|(1:31))|32|(1:34)|35|(1:37)|10f|45)|56|57|9|(7:11|13|15|17|(0)|20|21)|52|(0)(0)|27|(0)|32|(0)|35|(0)|10f) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0046, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[LOOP:0: B:18:0x0061->B:19:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    @Override // com.bytedance.pitaya.api.PTYSetupCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResult(boolean r7, com.bytedance.pitaya.api.bean.PTYError r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pitaya.api.PitayaHostDefault$asyncSetup$injectWrapper$1.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError):void");
    }

    public PitayaHostDefault$asyncSetup$injectWrapper$1(C93258aNy c93258aNy, SetupInfo setupInfo, CoreDefaultImpl coreDefaultImpl, boolean z, Context context, PTYSetupCallback pTYSetupCallback) {
        this.this$0 = c93258aNy;
        this.$setupInfo = setupInfo;
        this.$hostCore = coreDefaultImpl;
        this.$provideAppLog = z;
        this.$context = context;
        this.$callback = pTYSetupCallback;
    }
}
