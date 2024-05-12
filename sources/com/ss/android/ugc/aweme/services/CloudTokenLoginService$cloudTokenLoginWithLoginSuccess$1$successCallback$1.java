package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C68322mC;
import X.C68922R3e;
import X.C68972R5c;
import X.C68985R5p;
import X.C76800UCe;
import X.C78685UuP;
import X.InterfaceC68974R5e;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.QTX;
import android.app.Activity;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CloudTokenLoginService$cloudTokenLoginWithLoginSuccess$1$successCallback$1 extends AbstractC65781Prl implements InterfaceC88472Yns<C68922R3e, C76800UCe> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ boolean $keepActivity;
    public final /* synthetic */ C68322mC<InterfaceC68974R5e> $mobProvider;
    public final /* synthetic */ Map<String, Object> $newMobParam;
    public final /* synthetic */ InterfaceC88471Ynr<String, String, C76800UCe> $onSuccess;
    public final /* synthetic */ String $platform;
    public final /* synthetic */ String $uid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CloudTokenLoginService$cloudTokenLoginWithLoginSuccess$1$successCallback$1(String str, C68322mC<InterfaceC68974R5e> c68322mC, Map<String, Object> map, Activity activity, boolean z, InterfaceC88471Ynr<? super String, ? super String, C76800UCe> interfaceC88471Ynr, String str2) {
        super(1);
        this.$platform = str;
        this.$mobProvider = c68322mC;
        this.$newMobParam = map;
        this.$activity = activity;
        this.$keepActivity = z;
        this.$onSuccess = interfaceC88471Ynr;
        this.$uid = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C68922R3e response) {
        o.LJIIIZ(response, "response");
        C68972R5c.LJIIIZ(false, this.$platform, this.$mobProvider.element, response.LJIIIZ, this.$newMobParam);
        Activity activity = this.$activity;
        QTX qtx = response.LJIIIZ;
        o.LJIIIIZZ(qtx, "response.userInfo");
        C68985R5p.LIZ(activity, qtx, null, this.$keepActivity);
        if (C78685UuP.LJJJZ(JSONObjectProtectorUtils.getString(response.LJIILJJIL, "cloud_token"))) {
            InterfaceC88471Ynr<String, String, C76800UCe> interfaceC88471Ynr = this.$onSuccess;
            String str = this.$uid;
            String string = JSONObjectProtectorUtils.getString(response.LJIILJJIL, "cloud_token");
            o.LJIIIIZZ(string, "response.data.getString(\"cloud_token\")");
            interfaceC88471Ynr.invoke(str, string);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(C68922R3e c68922R3e) {
        invoke2(c68922R3e);
        return C76800UCe.LIZ;
    }
}
