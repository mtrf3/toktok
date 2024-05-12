package X;

import Y.IDeS358S0100000_13;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.UtG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78614UtG implements IHostUserDepend {
    public InterfaceC78617UtJ LIZ;

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getAvatarURL() {
        User curUser;
        UrlModel avatarMedium;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = LJIILL.getCurUser()) != null && (avatarMedium = curUser.getAvatarMedium()) != null && avatarMedium.getUrlList() != null) {
            o.LJIIIIZZ(avatarMedium.getUrlList(), "mediumAvatar.urlList");
            if (!r1.isEmpty()) {
                return (String) ListProtector.get(avatarMedium.getUrlList(), 0);
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getBoundEmail() {
        User curUser;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = LJIILL.getCurUser()) != null) {
            return curUser.getEmail();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getBoundPhone() {
        User curUser;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = LJIILL.getCurUser()) != null) {
            return curUser.getBindPhone();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final List<String> getBoundThirdPartyPlatforms() {
        IBindService LJFF = HG3.LJFF();
        List<String> socialPlatformNames = LJFF.getSocialPlatformNames();
        if (socialPlatformNames == null || socialPlatformNames.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String platform : socialPlatformNames) {
            if (LJFF.isPlatformBound(platform)) {
                o.LJIIIIZZ(platform, "platform");
                String lowerCase = platform.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                arrayList.add(lowerCase);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getNickname() {
        User curUser;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = LJIILL.getCurUser()) != null) {
            return curUser.getNickname();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getSecUid() {
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            return LJIILL.getCurSecUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUniqueID() {
        User curUser;
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null && (curUser = LJIILL.getCurUser()) != null) {
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                return curUser.getShortId();
            }
            return curUser.getUniqueId();
        }
        return "";
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final String getUserId() {
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            return LJIILL.getCurUserId();
        }
        return null;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final IHostUserDepend.UserModelExt getUserModelExt() {
        User user;
        IAccountUserService LJIILL = HG3.LJIILL();
        String str = null;
        if (LJIILL != null) {
            user = LJIILL.getCurUser();
        } else {
            user = null;
        }
        IHostUserDepend.UserModelExt userModelExt = new IHostUserDepend.UserModelExt();
        if (user != null) {
            try {
                if (TextUtils.isEmpty(user.getShortId())) {
                    str = user.getUniqueId();
                } else {
                    str = user.getShortId();
                }
            } catch (Exception unused) {
                str = "";
            }
        }
        userModelExt.setShortID(str);
        return userModelExt;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final boolean hasLogin() {
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            return LJIILL.isLogin();
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void login(Activity context, InterfaceC78617UtJ loginStatusCallback, java.util.Map<String, String> map) {
        java.util.Set<Map.Entry<String, String>> entrySet;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(loginStatusCallback, "loginStatusCallback");
        this.LIZ = loginStatusCallback;
        Bundle bundle = new Bundle();
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry<String, String> entry : entrySet) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
        C78450Uqc c78450Uqc = new C78450Uqc();
        c78450Uqc.LIZLLL = bundle;
        c78450Uqc.LIZ = context;
        c78450Uqc.LJI = true;
        c78450Uqc.LJ = new IDeS358S0100000_13(this, 4);
        LJIIIIZZ.showLoginAndRegisterView(c78450Uqc.LIZ());
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void logout(Activity context, InterfaceC78618UtK logoutStatusCallback, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(logoutStatusCallback, "logoutStatusCallback");
        HG3.LJIIIIZZ().logout("", "user_logout", new C78616UtI(logoutStatusCallback));
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostUserDepend
    public final void login(Activity activity, InterfaceC78617UtJ loginStatusCallback, java.util.Map<String, String> map, IHostUserDepend.LoginParamsExt params) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(loginStatusCallback, "loginStatusCallback");
        o.LJIIIZ(params, "params");
        login(activity, loginStatusCallback, map);
    }
}
