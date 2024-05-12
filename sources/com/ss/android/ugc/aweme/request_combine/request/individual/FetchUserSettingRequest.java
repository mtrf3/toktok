package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.AnonymousClass030;
import X.C188727au;
import X.C85920Xno;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import X.HG3;
import X.RBX;
import android.content.Context;
import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import java.util.List;
import yq4.a;

/* loaded from: classes7.dex */
public final class FetchUserSettingRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchUserSettingRequest";
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

    public static void LIZLLL() {
        String str;
        if (a.LJFF().LJJIJIIJI() == 1) {
            str = "on";
        } else {
            str = "off";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", str);
        FMX.LJIIL("tns_remove_photosensitive_status", c188727au.LIZ);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.IDLE;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (((RBX) HG3.LJIILL()).isLogin()) {
            SettingsRequestServiceImpl.LJIILLIIL().LJIIL(new C85920Xno(this));
        }
    }
}
