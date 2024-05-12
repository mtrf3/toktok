package com.ss.android.ugc.aweme.profile.editprofile.ui;

import X.ActivityC45651qj;
import X.C244379iT;
import X.C45804HyK;
import X.C84R;
import X.C86V;
import X.C9V9;
import X.C9VA;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class EmailEditPage implements IRouteAction {
    public C244379iT LIZ;

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        final String str2;
        if (context == null) {
            return Boolean.FALSE;
        }
        this.LIZ = new C244379iT();
        if (bundle == null || (str2 = bundle.getString("content")) == null) {
            str2 = "";
        }
        String LJFF = C86V.LJFF(R.string.fka);
        o.LJIIIIZZ(LJFF, "getString(R.string.edit_profile_mail_title)");
        String string = C86V.LJ().getString(R.string.g23);
        o.LJIIIIZZ(string, "getResources().getString(R.string.email_valid)");
        ProfileEditContentFragment LIZ = C9V9.LIZ(LJFF, str2, string);
        LIZ.setUserVisibleHint(true);
        LIZ.LLD = new C9VA() { // from class: X.9WL
            @Override // X.C9VA
            public final void LIZ(String content) {
                java.util.Map<String, String> map;
                o.LJIIIZ(content, "content");
                if (TextUtils.equals(content, str2)) {
                    return;
                }
                this.getClass();
                while (s.LJJJLZIJ(content, "\n\n", false)) {
                    content = QZP.LIZIZ("\n\n", content, "\n");
                }
                int length = content.length() - 1;
                if (length >= 0 && content.charAt(length) == '\n') {
                    content = content.substring(0, length);
                    o.LJIIIIZZ(content, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                C244379iT c244379iT = this.LIZ;
                if (c244379iT != null) {
                    c244379iT.LJII = content;
                }
                UserPresenter userPresenter = new UserPresenter();
                C244379iT c244379iT2 = this.LIZ;
                if (c244379iT2 != null) {
                    map = c244379iT2.LIZ();
                } else {
                    map = null;
                }
                userPresenter.updateUserInfo(map);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("email", content);
                long currentTimeMillis = System.currentTimeMillis();
                new F15();
                C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(linkedHashMap), "profile_email_edited"));
            }
        };
        LIZ.LJLZ = C84R.LJLIL;
        LIZ.LJLLLLLL = false;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            LIZ.show(supportFragmentManager, "EditMailDialog");
        }
        return Boolean.TRUE;
    }
}
