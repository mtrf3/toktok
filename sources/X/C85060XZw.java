package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.IDqS462S0100000_15;

/* renamed from: X.XZw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85060XZw implements R47 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ InterfaceC88475Ynv<Boolean, String, String, List<String>, Integer, C76800UCe> LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ TwoStepVerificationActivityViewModel LJI;

    public C85060XZw(int i, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, String str, String str2, List list, IDqS462S0100000_15 iDqS462S0100000_15, boolean z) {
        this.LIZ = str;
        this.LIZIZ = iDqS462S0100000_15;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = list;
        this.LJFF = i;
        this.LJI = twoStepVerificationActivityViewModel;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        AuthDeviceResponse authDeviceResponse;
        Bundle bundle;
        boolean z = obj instanceof Bundle;
        Serializable serializable = null;
        if (z && (bundle = (Bundle) obj) != null) {
            serializable = bundle.getSerializable("auth_device_response");
        }
        if ((serializable instanceof AuthDeviceResponse) && (authDeviceResponse = (AuthDeviceResponse) serializable) != null) {
            this.LJI.LJLJJI.setAuthDeviceListStatus(authDeviceResponse);
        }
        if (!z || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket", this.LIZ)) == null) {
            str = this.LIZ;
        }
        this.LIZIZ.invoke(Boolean.valueOf(this.LIZJ), this.LIZLLL, str, this.LJ, Integer.valueOf(this.LJFF));
    }
}
