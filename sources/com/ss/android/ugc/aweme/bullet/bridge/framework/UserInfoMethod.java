package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.AV1;
import X.C225378sv;
import X.EnumC38014Evy;
import X.F3T;
import X.HG3;
import X.InterfaceC37146Ehy;
import X.RBX;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class UserInfoMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "userInfo";
        this.LJLILLLLZI = EnumC38014Evy.PROTECT;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        boolean z;
        String phoneCountryCode;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        JSONObject jSONObject = new JSONObject();
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        boolean z2 = false;
        String str6 = "";
        if (curUser == null || !((RBX) HG3.LJIILL()).isLogin()) {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
            str5 = "";
            j = -1;
            z = false;
        } else {
            j = CastLongProtector.parseLong(((RBX) HG3.LJIILL()).getCurUserId());
            str = curUser.getNickname();
            if (str == null) {
                str = "";
            }
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str2 = curUser.getShortId();
            } else {
                str2 = curUser.getUniqueId();
            }
            str3 = curUser.getBindPhone();
            str4 = curUser.getSecUid();
            str5 = curUser.getEmail();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium != null && avatarMedium.getUrlList() != null && !avatarMedium.getUrlList().isEmpty()) {
                jSONObject.put("avatar_url", ListProtector.get(avatarMedium.getUrlList(), 0));
            }
            boolean shieldTemplateExp = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getShieldTemplateExp();
            if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getMvThemeRecordMode() && !shieldTemplateExp) {
                z2 = true;
            }
            z = z2;
            z2 = true;
        }
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (phoneCountryCode = ((RBX) LJIILL).getPhoneCountryCode()) != null) {
            str6 = phoneCountryCode;
        }
        jSONObject.put("is_login", z2);
        jSONObject.put("success", z2);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", str);
        jSONObject.put("unique_id", str2);
        jSONObject.put("bind_phone", str3);
        jSONObject.put("code", 1);
        jSONObject.put("sec_user_id", str4);
        jSONObject.put("isSupportMV", z);
        jSONObject.put("isChildMode", AV1.LJIIJJI() ? 1 : 0);
        jSONObject.put("email", str5);
        jSONObject.put("bind_phone_region", str6);
        Long LIZ = C225378sv.LIZ(curUser);
        if (LIZ != null) {
            jSONObject.put("decoration_id", LIZ.longValue());
        }
        iReturn.LIZIZ(jSONObject);
    }
}
