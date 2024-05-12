package com.ss.android.ugc.aweme.services;

import X.ARI;
import X.AbstractC65781Prl;
import X.C68322mC;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import kotlin.jvm.internal.AqS32S1300000_10;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NetworkStandardUIServiceImpl$showDiagnoseDialog$8 extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ C68322mC<Runnable> $action;
    public final /* synthetic */ C76732zl $errorType;
    public final /* synthetic */ C76732zl $primaryBtnText;
    public final /* synthetic */ String $sceneName;
    public final /* synthetic */ C76732zl $secondaryBtnText;
    public final /* synthetic */ NetworkStandardUIServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStandardUIServiceImpl$showDiagnoseDialog$8(C76732zl c76732zl, C76732zl c76732zl2, C68322mC<Runnable> c68322mC, NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C76732zl c76732zl3, String str) {
        super(1);
        this.$primaryBtnText = c76732zl;
        this.$secondaryBtnText = c76732zl2;
        this.$action = c68322mC;
        this.this$0 = networkStandardUIServiceImpl;
        this.$errorType = c76732zl3;
        this.$sceneName = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ARI actionGroup) {
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        int i = this.$primaryBtnText.element;
        if (i != 0) {
            actionGroup.LJI(i, new AqS32S1300000_10((C68322mC) this.$action, (C68322mC<Runnable>) this.this$0, (NetworkStandardUIServiceImpl) this.$errorType, (C76732zl) this.$sceneName, (String) 2));
        }
        int i2 = this.$secondaryBtnText.element;
        if (i2 != 0) {
            actionGroup.LJIIIIZZ(i2, new AqS52S1200000_10(this.this$0, this.$errorType, this.$sceneName, 1));
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(ARI ari) {
        invoke2(ari);
        return C76800UCe.LIZ;
    }
}
