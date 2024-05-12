package com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel;

import X.AbstractC73946T0k;
import X.C1HQ;
import X.C73318Sq2;
import X.C73969T1h;
import X.C772831o;
import X.C77800Ug8;
import X.C85323Wm;
import X.C92573kD;
import X.C92613kH;
import X.C92623kI;
import X.EFJ;
import X.HXX;
import X.T16;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.api.ChatAuthorityService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessagingPrivacyViewModel extends ViewModel {
    public static final /* synthetic */ int LJLLL = 0;
    public final ChatAuthorityService LJLIL;
    public final IIMService LJLILLLLZI;
    public final AbstractC73946T0k LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final C92623kI LJLJJL;
    public final C92613kH LJLJJLL;
    public int LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public final MutableLiveData<PrivacySettingsRestrictionOption> LJLL;
    public final MutableLiveData<PrivacySettingsRestrictionOption> LJLLI;
    public final MutableLiveData<Boolean> LJLLILLLL;
    public final C73318Sq2 LJLLJ;

    public MessagingPrivacyViewModel() {
        ChatAuthorityService.LIZ.getClass();
        if (C92573kD.LIZIZ == null) {
            IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
            String str = EFJ.LIZJ;
            C92573kD.LIZIZ = (ChatAuthorityService) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, ChatAuthorityService.class);
        }
        ChatAuthorityService chatAuthorityService = C92573kD.LIZIZ;
        o.LJI(chatAuthorityService);
        IIMService imService = IMService.Companion.get();
        AbstractC73946T0k LIZIZ = C73969T1h.LIZIZ();
        AbstractC73946T0k LIZ = T16.LIZ();
        o.LJIIIIZZ(LIZ, "io()");
        C92623kI c92623kI = C92623kI.LIZ;
        C92613kH c92613kH = C92613kH.LIZ;
        o.LJIIIZ(imService, "imService");
        this.LJLIL = chatAuthorityService;
        this.LJLILLLLZI = imService;
        this.LJLJI = LIZIZ;
        this.LJLJJI = LIZ;
        this.LJLJJL = c92623kI;
        this.LJLJJLL = c92613kH;
        this.LJLJLJ = "";
        this.LJLJLLL = "";
        MutableLiveData<PrivacySettingsRestrictionOption> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        this.LJLL = mutableLiveData;
        this.LJLLI = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(Boolean.FALSE);
        this.LJLLILLLL = mutableLiveData2;
        this.LJLLJ = new C73318Sq2();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLLJ.LIZLLL();
    }

    public final void gv0(boolean z) {
        String toStatus;
        Integer num;
        if (!z) {
            toStatus = "";
        } else {
            C92623kI c92623kI = this.LJLJJL;
            PrivacySettingsRestrictionOption value = this.LJLL.getValue();
            if (value != null) {
                num = Integer.valueOf(value.getValue());
            } else {
                num = null;
            }
            c92623kI.getClass();
            if (num != null) {
                if (num.intValue() == 1) {
                    toStatus = "everyone";
                } else if (num.intValue() == 2) {
                    toStatus = "friends";
                } else if (num.intValue() == 3) {
                    toStatus = "no_one";
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("chat_set value ");
            LIZ.append(num);
            toStatus = X1D.LIZIZ(LIZ);
        }
        C92613kH c92613kH = this.LJLJJLL;
        String enterFrom = this.LJLJLLL;
        String userType = this.LJLJLJ;
        int i = this.LJLJL;
        C85323Wm onEventV3 = C772831o.LIZ();
        c92613kH.getClass();
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(userType, "userType");
        o.LJIIIZ(toStatus, "toStatus");
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ LIZJ = HXX.LIZJ("enter_from", enterFrom, "user_type", userType);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(z ? 1 : 0);
        LIZJ.put("action_type", X1D.LIZIZ(LIZ2));
        if (z) {
            LIZJ.put("to_status", toStatus);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("");
        LIZ3.append(i);
        LIZJ.put("times", X1D.LIZIZ(LIZ3));
        onEventV3.LIZIZ("click_dm_permission_pop_up", LIZJ);
    }
}
