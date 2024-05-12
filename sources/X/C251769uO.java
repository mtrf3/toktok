package X;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;

/* renamed from: X.9uO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251769uO extends C8BS<UserResponse> {
    public final /* synthetic */ C251759uN LJLIL;

    public C251769uO(C251759uN c251759uN) {
        this.LJLIL = c251759uN;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        String str;
        if (!super.sendRequest(objArr)) {
            C188727au c188727au = new C188727au();
            this.LJLIL.getClass();
            c188727au.LJIIIZ("enter_from", null);
            if (objArr != null) {
                c188727au.LJI("params", TextUtils.join(",", objArr));
            }
            FMX.LJIIL("profile_request_request", c188727au.LIZ);
            return false;
        }
        C251759uN c251759uN = this.LJLIL;
        c251759uN.LJLJJI = (String) objArr[0];
        c251759uN.LJLJJL = (String) objArr[1];
        if (objArr.length > 2) {
            str = (String) objArr[2];
        } else {
            str = null;
        }
        if (C2YJ.LIZIZ.LIZ.getSecIdSwitch().intValue() == 0) {
            C251839uV LIZ = C251839uV.LIZ();
            WeakHandler weakHandler = this.mHandler;
            C251759uN c251759uN2 = this.LJLIL;
            String str2 = c251759uN2.LJLJJI;
            String str3 = c251759uN2.LJLJJL;
            int LJJIII = C251759uN.LJJIII();
            Boolean bool = this.LJLIL.LJLJJLL;
            LIZ.getClass();
            C251839uV.LIZJ(weakHandler, C251809uS.LIZJ(LJJIII, bool, str3, str2, str));
        } else if (!TextUtils.isEmpty(this.LJLIL.LJLJJL)) {
            C251839uV LIZ2 = C251839uV.LIZ();
            WeakHandler weakHandler2 = this.mHandler;
            String str4 = this.LJLIL.LJLJJL;
            int LJJIII2 = C251759uN.LJJIII();
            Boolean bool2 = this.LJLIL.LJLJJLL;
            LIZ2.getClass();
            C251839uV.LIZJ(weakHandler2, C251809uS.LIZJ(LJJIII2, bool2, str4, null, null));
        } else {
            C251839uV LIZ3 = C251839uV.LIZ();
            WeakHandler weakHandler3 = this.mHandler;
            String str5 = this.LJLIL.LJLJJI;
            int LJJIII3 = C251759uN.LJJIII();
            Boolean bool3 = this.LJLIL.LJLJJLL;
            LIZ3.getClass();
            C251839uV.LIZJ(weakHandler3, C251809uS.LIZJ(LJJIII3, bool3, null, str5, str));
        }
        C188727au c188727au2 = new C188727au();
        this.LJLIL.getClass();
        c188727au2.LJIIIZ("enter_from", null);
        c188727au2.LJIIIZ("sec_uid", this.LJLIL.LJLJJL);
        c188727au2.LJIIIZ("uid", this.LJLIL.LJLJJI);
        FMX.LJIIL("profile_request_request", c188727au2.LIZ);
        return true;
    }
}
