package com.ss.android.ugc.aweme.authorize.viewmodel;

import X.AbstractC73638SvC;
import X.C61951OTb;
import X.C61957OTh;
import X.C73969T1h;
import X.InterfaceC61954OTe;
import X.OT6;
import X.OTD;
import X.OTE;
import X.OTH;
import X.OTM;
import X.OTP;
import X.T16;
import X.XKX;
import Y.ARunnableS29S0200000_10;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.openauthorize.entity.BCAuthorizationResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AuthCommonViewModel extends AndroidViewModel {
    public final AwemeAuthorizePlatformDepend LJLIL;
    public final InterfaceC61954OTe LJLILLLLZI;
    public final OT6 LJLJI;
    public final OTD LJLJJI;
    public final C61957OTh LJLJJL;
    public final MutableLiveData<AuthInfoResponseData> LJLJJLL;
    public final MutableLiveData<AuthInfoResponseData> LJLJL;
    public final MutableLiveData<AuthorizedPage> LJLJLJ;
    public final MutableLiveData<AuthorizedPage> LJLJLLL;
    public final MutableLiveData<List<AuthorizedScope>> LJLL;
    public final MutableLiveData<List<AuthorizedScope>> LJLLI;
    public final MutableLiveData<AuthCodeResponse> LJLLILLLL;
    public final MutableLiveData<AuthCodeResponse> LJLLJ;
    public final MutableLiveData<ScanCommonResponse> LJLLL;
    public final MutableLiveData<ScanCommonResponse> LJLLLL;
    public final MutableLiveData<ScanCommonResponse> LJLLLLLL;
    public final MutableLiveData<ScanCommonResponse> LJLZ;
    public final MutableLiveData<C61951OTb> LJZ;
    public final MutableLiveData<C61951OTb> LJZI;
    public final MutableLiveData<BCAuthorizationResponse> LJZL;
    public final MutableLiveData<BCAuthorizationResponse> LL;

    public final void gv0(OT6 authRequest) {
        o.LJIIIZ(authRequest, "authRequest");
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("open_platform_oauth2", false);
        } catch (Throwable unused) {
        }
        if (z) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new OTH(this, authRequest, null), 3);
            return;
        }
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LJLIL;
        awemeAuthorizePlatformDepend.LIZIZ.execute(new ARunnableS29S0200000_10(this, authRequest, 10));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthCommonViewModel(Application application, AwemeAuthorizePlatformDepend depend, InterfaceC61954OTe model, OT6 request, OTD authExtraRequestParams) {
        super(application);
        C61957OTh c61957OTh = new C61957OTh();
        o.LJIIIZ(application, "application");
        o.LJIIIZ(depend, "depend");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(authExtraRequestParams, "authExtraRequestParams");
        this.LJLIL = depend;
        this.LJLILLLLZI = model;
        this.LJLJI = request;
        this.LJLJJI = authExtraRequestParams;
        this.LJLJJL = c61957OTh;
        MutableLiveData<AuthInfoResponseData> mutableLiveData = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData;
        this.LJLJL = mutableLiveData;
        MutableLiveData<AuthorizedPage> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData2;
        this.LJLJLLL = mutableLiveData2;
        MutableLiveData<List<AuthorizedScope>> mutableLiveData3 = new MutableLiveData<>();
        this.LJLL = mutableLiveData3;
        this.LJLLI = mutableLiveData3;
        MutableLiveData<AuthCodeResponse> mutableLiveData4 = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData4;
        this.LJLLJ = mutableLiveData4;
        MutableLiveData<ScanCommonResponse> mutableLiveData5 = new MutableLiveData<>();
        this.LJLLL = mutableLiveData5;
        this.LJLLLL = mutableLiveData5;
        MutableLiveData<ScanCommonResponse> mutableLiveData6 = new MutableLiveData<>();
        this.LJLLLLLL = mutableLiveData6;
        this.LJLZ = mutableLiveData6;
        MutableLiveData<C61951OTb> mutableLiveData7 = new MutableLiveData<>();
        this.LJZ = mutableLiveData7;
        this.LJZI = mutableLiveData7;
        MutableLiveData<BCAuthorizationResponse> mutableLiveData8 = new MutableLiveData<>();
        this.LJZL = mutableLiveData8;
        this.LL = mutableLiveData8;
    }

    public final void hv0(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        AbstractC73638SvC<AuthorizedPage> authPageInfo;
        C61957OTh c61957OTh = this.LJLJJL;
        OTD otd = this.LJLJJI;
        String sdkName = otd.LIZ;
        String source = otd.LIZJ;
        OTM otm = new OTM(z, this, str2);
        c61957OTh.getClass();
        o.LJIIIZ(sdkName, "sdkName");
        o.LJIIIZ(source, "source");
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable unused) {
        }
        if (SettingsManager.LIZ("open_platform_oauth2", false) && (sdkName.length() > 0 || o.LJ(source, "web"))) {
            authPageInfo = OTE.LIZIZ.getAuthPageInfo(str, i, str2, str3, str4, str5, str6, sdkName, source, "v2");
            authPageInfo.LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new OTP(otm));
        }
        authPageInfo = OTE.LIZIZ.getAuthPageInfo(str, i, str2, str3, str4, str5, str6, sdkName, "", "");
        authPageInfo.LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new OTP(otm));
    }
}
