package com.ss.android.ugc.aweme.bullet.bridge.framework;

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
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class BulletUserInfoMethod extends BaseBridgeMethod {
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
    public BulletUserInfoMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "uniUserInfo";
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
        long j;
        String str2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        JSONObject jSONObject = new JSONObject();
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        boolean z = false;
        String str3 = "";
        if (curUser == null || !((RBX) HG3.LJIILL()).isLogin()) {
            str = "";
            j = -1;
            str2 = "";
        } else {
            j = CastLongProtector.parseLong(((RBX) HG3.LJIILL()).getCurUserId());
            String nickname = curUser.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            try {
                if (TextUtils.isEmpty(curUser.getUniqueId())) {
                    str = curUser.getShortId();
                } else {
                    str = curUser.getUniqueId();
                }
                o.LJIIIIZZ(str, "{\n                if (Te…er.uniqueId\n            }");
            } catch (NullPointerException unused) {
                str = "";
            }
            String secUid = curUser.getSecUid();
            if (secUid != null) {
                str3 = secUid;
            }
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (avatarMedium != null && avatarMedium.getUrlList() != null && !avatarMedium.getUrlList().isEmpty()) {
                jSONObject.put("avatar_url", ListProtector.get(avatarMedium.getUrlList(), 0));
            }
            z = true;
            str2 = str3;
            str3 = nickname;
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", str3);
        jSONObject.put("unique_id", str);
        jSONObject.put("code", 1);
        jSONObject.put("sec_user_id", str2);
        Long LIZ = C225378sv.LIZ(curUser);
        if (LIZ != null) {
            jSONObject.put("decoration_id", LIZ.longValue());
        }
        iReturn.onSuccess(jSONObject);
    }
}
