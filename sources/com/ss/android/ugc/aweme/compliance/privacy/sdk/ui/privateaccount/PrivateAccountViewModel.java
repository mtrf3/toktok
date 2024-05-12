package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount;

import X.AbstractC73672Svk;
import X.C188727au;
import X.C1A7;
import X.C26227ARb;
import X.C2U8;
import X.C38333F2r;
import X.C71945SLl;
import X.C72024SOm;
import X.C72025SOn;
import X.C72026SOo;
import X.C72027SOp;
import X.C72041SPd;
import X.C72045SPh;
import X.C72062SPy;
import X.C73969T1h;
import X.C79723Ay;
import X.FMX;
import X.QD3;
import X.RBY;
import X.SNL;
import X.T16;
import X.UC0;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes13.dex */
public final class PrivateAccountViewModel extends BasePrivacySettingViewModel {
    public Context LJLJJL;
    public int LJLJJLL;

    public final Context getContext() {
        Context context = this.LJLJJL;
        if (context != null) {
            return context;
        }
        o.LJIJI("context");
        throw null;
    }

    public PrivateAccountViewModel() {
        Integer num;
        EventBus.LIZJ().LJIILJJIL(this);
        MutableLiveData<Integer> mutableLiveData = this.LJLJI;
        C72041SPd.LIZ.getClass();
        PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
        if (LJI != null) {
            num = LJI.M("private_account");
        } else {
            num = null;
        }
        mutableLiveData.setValue(num);
        SNL.LIZIZ().getClass();
        C72045SPh.LIZ(false);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        C72041SPd LIZIZ = SNL.LIZIZ();
        int i2 = this.LJLJJLL;
        this.LJLJJLL = 0;
        LIZIZ.getClass();
        return C72041SPd.LJII(i, i2, "private_account").LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C72024SOm.LJLIL);
    }

    @QD3
    public final void onPrivacyUserSettingsChange(C79723Ay event) {
        o.LJIIIZ(event, "event");
        this.LJLJI.setValue(event.LJLIL.M("private_account"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void gv0(int i, Throwable e) {
        o.LJIIIZ(e, "e");
        if (e instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) e;
            int errorCode = c38333F2r.getErrorCode();
            if (errorCode != -5007) {
                if (errorCode != -5002) {
                    if (errorCode != 3026002) {
                        if (errorCode != 3026006) {
                            super.gv0(i, e);
                            return;
                        }
                        String string = getContext().getString(R.string.eiy);
                        o.LJIIIIZZ(string, "context.getString(\n     …er,\n                    )");
                        C26227ARb c26227ARb = new C26227ARb(getContext());
                        c26227ARb.LJFF(getContext().getString(R.string.ej0, string));
                        c26227ARb.LIZIZ(getContext().getString(R.string.eix, string));
                        UC0.LIZJ(c26227ARb, new AqS99S0101000_12(this, i, 4));
                        c26227ARb.LJII = false;
                        c26227ARb.LJI().LIZLLL();
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
                        FMX.LJIIL("show_live_change_privacy_account_popup", c188727au.LIZ);
                        return;
                    }
                    C26227ARb c26227ARb2 = new C26227ARb(getContext());
                    c26227ARb2.LJ(R.string.c3y);
                    C72062SPy c72062SPy = new C72062SPy();
                    c72062SPy.LIZJ(R.string.c3x);
                    c72062SPy.LJ(2);
                    c72062SPy.LIZ = false;
                    c72062SPy.LIZIZ(42);
                    c72062SPy.LJFF = new AqS162S0100000_12(c26227ARb2, 171);
                    c26227ARb2.LIZIZ(C1A7.LJIJ(c26227ARb2.LIZ, R.string.c3w, c72062SPy.LIZ(c26227ARb2.LIZ)));
                    UC0.LIZJ(c26227ARb2, C72026SOo.LJLIL);
                    c26227ARb2.LJI().LIZLLL();
                    return;
                }
                C26227ARb c26227ARb3 = new C26227ARb(getContext());
                c26227ARb3.LJ(R.string.b4c);
                c26227ARb3.LIZ(R.string.b4v);
                UC0.LIZJ(c26227ARb3, new AqS99S0101000_12(this, i, 3));
                c26227ARb3.LJII = false;
                c26227ARb3.LJI().LIZLLL();
                return;
            }
            C26227ARb c26227ARb4 = new C26227ARb(getContext());
            c26227ARb4.LIZIZ(c38333F2r.getErrorMsg());
            UC0.LIZJ(c26227ARb4, C72025SOn.LJLIL);
            c26227ARb4.LJII = false;
            c26227ARb4.LJI().LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        boolean z;
        o.LJIIIZ(response, "response");
        RBY LJFF = C71945SLl.LJ().LJFF();
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        LJFF.updateCurSecret(z);
        if (i == 1) {
            AccountService.LJIJ().LJFF().updateCurAdAuthorization(false);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "privacy_and_safety_settings");
            FMX.LJIIL("confirm_private_account_on", c188727au.LIZ);
        } else {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "privacy_and_safety_settings");
            FMX.LJIIL("confirm_private_account_off", c188727au2.LIZ);
        }
        C2U8.LIZ(new C72027SOp());
    }
}
