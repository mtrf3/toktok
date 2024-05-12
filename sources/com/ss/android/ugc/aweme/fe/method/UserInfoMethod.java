package com.ss.android.ugc.aweme.fe.method;

import X.AV1;
import X.C225378sv;
import X.C38049EwX;
import X.HG3;
import X.InterfaceC36488ETs;
import X.RBX;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class UserInfoMethod extends BaseCommonJavaMethod {
    public UserInfoMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public UserInfoMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        String str2;
        long j;
        boolean z;
        boolean z2;
        JSONObject jSONObject2 = new JSONObject();
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        boolean z3 = false;
        String str3 = "";
        if (curUser == null || !((RBX) HG3.LJIILL()).isLogin()) {
            str = "";
            str2 = "";
            j = -1;
            z = false;
            z2 = false;
        } else {
            j = CastLongProtector.parseLong(((RBX) HG3.LJIILL()).getCurUserId());
            String nickname = curUser.getNickname();
            if (nickname != null) {
                str3 = nickname;
            }
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str = curUser.getShortId();
            } else {
                str = curUser.getUniqueId();
            }
            str2 = curUser.getSecUid();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium != null && avatarMedium.getUrlList() != null && !avatarMedium.getUrlList().isEmpty()) {
                jSONObject2.put("avatar_url", ListProtector.get(avatarMedium.getUrlList(), 0));
            }
            z2 = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getMvThemeRecordMode();
            z = curUser.isPrivateAccount();
            z3 = true;
        }
        jSONObject2.put("is_login", z3);
        jSONObject2.put("success", z3);
        jSONObject2.put("user_id", String.valueOf(j));
        jSONObject2.put("nickname", str3);
        jSONObject2.put("unique_id", str);
        jSONObject2.put("code", 1);
        jSONObject2.put("sec_user_id", str2);
        jSONObject2.put("isSupportMV", z2);
        jSONObject2.put("isChildMode", AV1.LJIIJJI() ? 1 : 0);
        jSONObject2.put("is_private_account", z);
        Long LIZ = C225378sv.LIZ(curUser);
        if (LIZ != null) {
            jSONObject2.put("decoration_id", LIZ.longValue());
        }
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(jSONObject2);
        }
    }
}
