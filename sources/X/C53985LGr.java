package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* renamed from: X.LGr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53985LGr {
    public final InterfaceC65784Pro<String> LIZ;
    public final Fragment LIZIZ;
    public final ScrollSwitchStateManager LIZJ;

    public final String LIZ(String str) {
        if (str == null) {
            return "";
        }
        if (TextUtils.equals(str, "HOME")) {
            String invoke = this.LIZ.invoke();
            if (invoke != null) {
                return invoke;
            }
            return "homepage_hot";
        }
        if (TextUtils.equals(str, "DISCOVER")) {
            return "discovery";
        }
        if (TextUtils.equals(str, "FRIENDS_TAB")) {
            return "homepage_friends";
        }
        if (TextUtils.equals(str, "NOTIFICATION")) {
            return "notification_page";
        }
        if (TextUtils.equals(str, "USER")) {
            InterfaceC36571c5 gv0 = this.LIZJ.gv0();
            if (gv0 instanceof InterfaceC53971LGd) {
                return ((InterfaceC53971LGd) gv0).getEnterFrom();
            }
            return "personal_homepage";
        }
        return "homepage_hot";
    }

    public C53985LGr(LK9 lk9, Fragment fragment, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.LIZ = lk9;
        this.LIZIZ = fragment;
        this.LIZJ = scrollSwitchStateManager;
    }
}
