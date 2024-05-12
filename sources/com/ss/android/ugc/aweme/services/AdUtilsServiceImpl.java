package com.ss.android.ugc.aweme.services;

import X.AM0;
import X.AW4;
import X.C158056If;
import X.C2IR;
import X.C2U8;
import X.C2YJ;
import X.C59406NTe;
import X.C63081OpJ;
import X.InterfaceC59418NTq;
import X.InterfaceC59609NaP;
import X.NN1;
import X.NO5;
import X.NO7;
import X.NOD;
import X.NOG;
import X.NOH;
import X.NOP;
import X.NOX;
import X.NWF;
import X.YG6;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileFragment;
import com.ss.android.ugc.aweme.commercialize.profile.FakeUserProfileFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AdUtilsServiceImpl implements YG6 {
    @Override // X.YG6
    public AW4 createFakeUserProfileFragment() {
        return new FakeUserProfileFragment();
    }

    @Override // X.YG6
    public AW4 createNewFakeUserProfileFragment() {
        return new AdNewFakeUserProfileFragment();
    }

    @Override // X.YG6
    public boolean shouldShowBioEmail() {
        try {
            return C2YJ.LIZIZ.LIZ.getBioSettings().getEnableBioEmail().booleanValue();
        } catch (C158056If unused) {
            return false;
        }
    }

    @Override // X.YG6
    public boolean shouldShowBioUrl() {
        try {
            return C2YJ.LIZIZ.LIZ.getBioSettings().getEnableBioUrl().booleanValue();
        } catch (C158056If unused) {
            return false;
        }
    }

    @Override // X.YG6
    public InterfaceC59609NaP getAdFlutterLandPageUtil() {
        return NOG.LIZ;
    }

    @Override // X.YG6
    public NOH getAdLynxLandPageUtil() {
        return NOX.LIZ;
    }

    @Override // X.YG6
    public void closeProfilePopUpWebPage(Activity activity) {
        o.LJIIIZ(activity, "activity");
        NWF LIZ = NO7.LIZ(activity);
        if (LIZ != null && LIZ.LJIIJJI()) {
            LIZ.LIZLLL(true);
            FrameLayout LIZIZ = NO7.LIZIZ(activity);
            if (LIZIZ == null) {
                return;
            }
            LIZIZ.setVisibility(8);
        }
    }

    @Override // X.YG6
    public boolean shouldShowAdBrowser(Aweme aweme) {
        if (aweme != null && aweme.isAd() && C63081OpJ.LJLJJL(aweme) && (!TextUtils.isEmpty(C63081OpJ.LJJIIZI(aweme)) || (C63081OpJ.LJJLJ(aweme) && NOX.LIZ.LIZIZ(aweme)))) {
            return true;
        }
        return false;
    }

    @Override // X.YG6
    public boolean shouldShowFakeUserProfile(Aweme aweme) {
        return C63081OpJ.LJJ(aweme);
    }

    public void logFeedRawAdOpenUrlH5(Context context, Aweme aweme) {
        NN1.LJJJJI(context, "open_url_h5", aweme, NN1.LJIIIZ(context, aweme));
    }

    public void logFeedRawFlutterAdOpenUrlH5(Context context, Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("render_type", "flutter");
        NN1.LJJJJI(context, "open_url_h5", aweme, NN1.LJIIL(context, aweme, false, NN1.LJFF(hashMap)));
    }

    public void logFeedRawLynxAdOpenUrlH5(Context context, Aweme aweme) {
        NN1.LJJIJIL(context, aweme);
    }

    @Override // X.YG6
    public JSONObject getExtJson(Context context, Aweme aweme, String str) {
        return NN1.LJIIIZ(context, aweme);
    }

    @Override // X.YG6
    public void onProfileWebPageHide(Context context, Aweme aweme, String str) {
        if (context == null) {
            return;
        }
        C2U8.LIZ(new C2IR(context.hashCode(), 2, aweme, str));
    }

    @Override // X.YG6
    public void onProfileWebPageShow(Context context, Aweme aweme, String str) {
        if (context == null) {
            return;
        }
        C2U8.LIZ(new C2IR(context.hashCode(), 1, aweme, str));
    }

    @Override // X.YG6
    public boolean openProfilePopUpWebPageInSixTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 5, false);
    }

    @Override // X.YG6
    public boolean openProfilePopUpWebPageInTwoExpandMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 6, false);
    }

    @Override // X.YG6
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str) {
        return openProfilePopUpWebPage(context, aweme, str, 1, false);
    }

    @Override // X.YG6
    public void feedLiveProfileAvatarOpen(Context context, Aweme aweme, int i, User user) {
        C59406NTe.LJIIIZ(context, aweme, i, user);
    }

    @Override // X.YG6
    public boolean openProfilePopUpWebPageInTwoMode(Context context, Aweme aweme, String str, boolean z) {
        return openProfilePopUpWebPage(context, aweme, str, 4, z);
    }

    @Override // X.YG6
    public boolean openTopViewLive(Context context, Aweme aweme, int i, InterfaceC59418NTq interfaceC59418NTq) {
        return AM0.LIZ(context, aweme, i, interfaceC59418NTq);
    }

    public boolean openAdWebUrl(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return NOP.LIZJ(context, str, str2, z, map, true, null, 0);
    }

    public boolean openProfilePopUpWebPage(Context context, Aweme aweme, String str, int i, boolean z) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        NOD nod = new NOD();
        nod.LIZ = context;
        nod.LIZIZ = aweme.getAwemeRawAd();
        nod.LIZJ = i;
        nod.LIZ(str);
        nod.LJIIIIZZ = aweme;
        return NO5.LJIILLIIL(nod, z);
    }
}
