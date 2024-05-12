package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C73305Spp;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NetworkStandardUIServiceImpl$setStatusView$diagnosisFunc$1 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean $dateExpire;
    public final /* synthetic */ int $networkStatus;
    public final /* synthetic */ String $sceneName;
    public final /* synthetic */ C73305Spp $tuxStatusView;
    public final /* synthetic */ NetworkStandardUIServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStandardUIServiceImpl$setStatusView$diagnosisFunc$1(NetworkStandardUIServiceImpl networkStandardUIServiceImpl, C73305Spp c73305Spp, int i, boolean z, String str) {
        super(0);
        this.this$0 = networkStandardUIServiceImpl;
        this.$tuxStatusView = c73305Spp;
        this.$networkStatus = i;
        this.$dateExpire = z;
        this.$sceneName = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NetworkStandardUIServiceImpl networkStandardUIServiceImpl = this.this$0;
        Context context = this.$tuxStatusView.getContext();
        o.LJIIIIZZ(context, "tuxStatusView.context");
        networkStandardUIServiceImpl.showDiagnoseDialog(context, this.$networkStatus, this.$dateExpire, this.$sceneName);
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
