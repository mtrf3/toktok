package com.ss.android.ugc.aweme.user.lego;

import X.AnonymousClass030;
import X.C16880lQ;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FLX;
import X.HG3;
import X.RBX;
import X.RunnableC38813FLd;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes7.dex */
public final class FetchUserInfoRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchUserInfoRequest";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.NORMAL;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            if (((Boolean) FLX.LIZIZ.getValue()).booleanValue()) {
                new Handler(C16880lQ.LLJJJJ()).postDelayed(RunnableC38813FLd.LJLIL, 5000L);
            } else {
                ((RBX) HG3.LJIILL()).queryUser();
            }
            ((RBX) HG3.LJIILL()).refreshPassportUserInfo();
            HG3.LJIIIIZZ().checkin();
        }
    }
}
