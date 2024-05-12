package com.ss.android.ugc.aweme.ecommerce.mall.preload;

import X.ActivityC45651qj;
import X.C0RN;
import X.C116694i1;
import X.C36746EbW;
import X.C51738KSg;
import X.C56092Lzs;
import X.C780334l;
import X.C78613UtF;
import X.C84339X8d;
import X.C84340X8e;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC55058LjC;
import X.K1H;
import X.K1P;
import X.K1Q;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECColdStartFetchTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ECColdStartFetchTask";
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

    public static void LJ() {
        K1H k1h = ShopMainLynxDataPreload.Companion;
        Bundle bundle = new Bundle();
        k1h.getClass();
        C36746EbW.LIZ(3, "ShopTabV3 Prefetch TRY_PRELOAD");
        ShopMainLynxDataPreload.isPrefetch = true;
        long currentTimeMillis = System.currentTimeMillis();
        C56092Lzs.LJIIZILJ(C56092Lzs.LIZ, 0, K1Q.TRY_PRELOAD.getStage(), 0L, 12);
        C84340X8e c84340X8e = C84339X8d.LIZJ;
        K1P k1p = new K1P(currentTimeMillis, bundle);
        c84340X8e.getClass();
        C84340X8e.LIZIZ(k1p);
    }

    public static Activity LIZLLL() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJIIIIZZ instanceof InterfaceC55058LjC) && (LJIIIIZZ instanceof ActivityC45651qj)) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) LJIIIIZZ;
            if (!o.LJ(C116694i1.LIZ(activityC45651qj).nv0(), "SHOP_MALL") && (!o.LJ("HOME", C116694i1.LIZ(activityC45651qj).nv0()) || !Hox.LJLLI.LIZ(activityC45651qj).vv0("Shop"))) {
                return LJIIIIZZ;
            }
        }
        return null;
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
    public final void run(Context context) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C51738KSg(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(int r9, X.InterfaceC67352kd<? super X.C76800UCe> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.KJX
            if (r0 == 0) goto L83
            r6 = r10
            X.KJX r6 = (X.KJX) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r7 = 1
            if (r0 == 0) goto L31
            if (r0 != r7) goto L89
            com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask r0 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            r0.getClass()
            android.app.Activity r0 = LIZLLL()
            if (r0 == 0) goto L2e
            LJ()
        L2e:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L31:
            X.C141335gf.LIZJ(r1)
            long r2 = java.lang.System.currentTimeMillis()
            X.FAM r0 = X.C56662Kg.LIZ()
            long r0 = r0.LJIIJ
            long r2 = r2 - r0
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "ec_prefetch preloadDuration = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4 = 3
            X.C36746EbW.LIZ(r4, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "ec_prefetch prefetchDelay = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C36746EbW.LIZ(r4, r0)
            if (r9 != 0) goto L73
            android.app.Activity r0 = LIZLLL()
            if (r0 == 0) goto L2e
            LJ()
            goto L2e
        L73:
            if (r9 <= 0) goto L2e
            long r0 = (long) r9
            r6.LJLIL = r8
            r6.LJLJJI = r7
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r6)
            if (r0 != r5) goto L81
            return r5
        L81:
            r0 = r8
            goto L22
        L83:
            X.KJX r6 = new X.KJX
            r6.<init>(r8, r10)
            goto L12
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask.LJII(int, X.2kd):java.lang.Object");
    }
}
