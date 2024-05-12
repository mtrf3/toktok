package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.AccountBannedDetail;
import com.ss.android.ugc.aweme.compliance.api.model.BanInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lh6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54928Lh6<T> implements InterfaceC64592gB {
    public static final C54928Lh6<T> LJLIL = new C54928Lh6<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        AccountBannedDetail accountBannedDetail = (AccountBannedDetail) obj;
        if (accountBannedDetail.status_code == 0 && accountBannedDetail.getBanInfos() != null) {
            List<BanInfo> banInfos = accountBannedDetail.getBanInfos();
            o.LJI(banInfos);
            C62914Omc c62914Omc = C62913Omb.LIZIZ;
            c62914Omc.LIZJ = banInfos;
            c62914Omc.LIZIZ.storeString("account_banned_detail", GsonProtectorUtils.toJson(new Gson(), banInfos));
            C25574A1y.LIZ(0, "tns_api_status", "/tiktok/account/ban/detail/get/v1/");
            return;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = accountBannedDetail.extra;
        if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
            str = "";
        }
        C25574A1y.LJFF(1, "/tiktok/account/ban/detail/get/v1/", str, String.valueOf(accountBannedDetail.status_code));
    }
}
