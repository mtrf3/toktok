package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.C45804HyK;
import X.C78685UuP;
import X.F3T;
import X.HG3;
import X.InterfaceC37146Ehy;
import Y.IDeS358S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class PopDigitalWellbeingVerifyViewMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopDigitalWellbeingVerifyViewMethod(F3T factory) {
        super(factory);
        o.LJIIIZ(factory, "factory");
        this.LJLIL = "popDigitalWellbeingVerifyView";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        User curUser;
        User curUser2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            String optString = params.optString("verifyType");
            String str = null;
            if (o.LJ(CardStruct.IStatusCode.DEFAULT, optString)) {
                IAccountUserService LJIILL = HG3.LJIILL();
                if (LJIILL != null && (curUser2 = LJIILL.getCurUser()) != null) {
                    str = curUser2.getBindPhone();
                }
                if (C78685UuP.LJJJZ(str)) {
                    Context context = getContext();
                    if (context != null) {
                        IBindService LJFF = HG3.LJFF();
                        Activity LJIJJ = C45804HyK.LJIJJ(context);
                        o.LJI(LJIJJ);
                        LJFF.verifyMobileForTicket(LJIJJ, "digital_wellbeing", "", new Bundle(), new IDeS358S0100000_13(iReturn, 9));
                        return;
                    }
                    iReturn.LIZ(0, "context is null");
                    return;
                }
                Context context2 = getContext();
                if (context2 != null) {
                    IBindService LJFF2 = HG3.LJFF();
                    Activity LJIJJ2 = C45804HyK.LJIJJ(context2);
                    o.LJI(LJIJJ2);
                    LJFF2.bindMobile(LJIJJ2, "digital_wellbeing", "", new Bundle(), new IDeS358S0100000_13(iReturn, 7));
                    return;
                }
                iReturn.LIZ(0, "context is null");
                return;
            }
            if (o.LJ("1", optString)) {
                IAccountUserService LJIILL2 = HG3.LJIILL();
                if (LJIILL2 != null && (curUser = LJIILL2.getCurUser()) != null) {
                    str = curUser.getEmail();
                }
                if (C78685UuP.LJJJZ(str)) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        IBindService LJFF3 = HG3.LJFF();
                        Activity LJIJJ3 = C45804HyK.LJIJJ(context3);
                        o.LJI(LJIJJ3);
                        LJFF3.verifyEmailForTicket(LJIJJ3, "digital_wellbeing", "", new Bundle(), new IDeS358S0100000_13(iReturn, 8));
                        return;
                    }
                    iReturn.LIZ(0, "context is null");
                    return;
                }
                Context context4 = getContext();
                if (context4 != null) {
                    IBindService LJFF4 = HG3.LJFF();
                    Activity LJIJJ4 = C45804HyK.LJIJJ(context4);
                    o.LJI(LJIJJ4);
                    LJFF4.bindEmail(LJIJJ4, "digital_wellbeing", "", new Bundle(), new IDeS358S0100000_13(iReturn, 6));
                    return;
                }
                iReturn.LIZ(0, "context is null");
            }
        } catch (Exception e) {
            iReturn.LIZ(-1, e.getMessage());
        }
    }
}
