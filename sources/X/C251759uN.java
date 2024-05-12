package X;

import android.text.TextUtils;

/* renamed from: X.9uN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class C251759uN extends AbstractC251749uM {
    public String LJLJJI;
    public String LJLJJL;
    public final Boolean LJLJJLL = Boolean.TRUE;

    public static final int LJJIII() {
        if (TextUtils.equals(null, "music_detail")) {
            return 1;
        }
        if (TextUtils.equals(null, "prop_page")) {
            return 3;
        }
        TextUtils.equals(null, "general_search");
        TextUtils.equals(null, "general_search");
        TextUtils.equals(null, "general_search");
        return 0;
    }

    public C251759uN() {
        LJJ(new C251769uO(this));
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        return super.LJIILL(objArr);
    }

    @Override // X.C8BR, X.C8BT
    public void onFailed(Exception exc) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("to_user_id", this.LJLJJI);
        c188727au.LJIIIZ("enter_from", null);
        c188727au.LIZLLL(0, "is_success");
        c188727au.LJIIIZ("fail_info", exc.getMessage());
        if (exc instanceof C38333F2r) {
            c188727au.LJI("response", ((C38333F2r) exc).getResponse());
        }
        java.util.Map<String, String> map = c188727au.LIZ;
        FMX.LJIIL("profile_request_response", map);
        C36922EeM.LIZLLL(4, "aweme/v1/user", map.toString());
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC251779uP) k).K20();
        }
    }
}
