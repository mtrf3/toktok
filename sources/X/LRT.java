package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.SafeInfoNoticePopupWindowHelp;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsg;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsgResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LRT implements InterfaceC73463SsN<SafeInfoNoticeMsgResponse> {
    public final /* synthetic */ SafeInfoNoticePopupWindowHelp LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    public LRT(SafeInfoNoticePopupWindowHelp safeInfoNoticePopupWindowHelp) {
        this.LJLIL = safeInfoNoticePopupWindowHelp;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(SafeInfoNoticeMsgResponse safeInfoNoticeMsgResponse) {
        SafeInfoNoticeMsgResponse response = safeInfoNoticeMsgResponse;
        o.LJIIIZ(response, "response");
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("last_time_fetch_safe_info_");
        String LJ = UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
        long currentTimeMillis = System.currentTimeMillis();
        SettingsManager.LIZLLL().getClass();
        repo.storeLong(LJ, (SettingsManager.LJFF("safe_info_notice_frequency", 86400L) * 1000) + currentTimeMillis);
        SafeInfoNoticeMsg safeInfoNoticeMsg = response.data;
        if (safeInfoNoticeMsg != null && !TextUtils.isEmpty(safeInfoNoticeMsg.notice)) {
            Gson gson = new Gson();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("safe_info_");
            repo.storeString(UPJ.LJ((RBX) HG3.LJIILL(), LIZ2, LIZ2), GsonProtectorUtils.toJson(gson, safeInfoNoticeMsg));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("safe_info_need_show_");
            LIZ3.append(((RBX) HG3.LJIILL()).getCurUserId());
            repo.storeBoolean(X1D.LIZIZ(LIZ3), true);
        }
        this.LJLIL.LIZIZ(true);
    }
}
