package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.promote;

import X.ASL;
import X.ActivityC45651qj;
import X.C45804HyK;
import X.C770830u;
import X.C78966Uyw;
import X.C79045V0n;
import Y.AObserverS80S0100000_12;
import Y.IDDListenerS151S0100000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commerce.tools.common.EventCenter;
import com.ss.android.ugc.aweme.commerce.tools.promote.IEventCenter;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.VideoVisibilityViewModel;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.page.VideoVisibilitySelectFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PromoteVideoSettingSheet implements IRouteAction {
    public final void publishVideoStatusEventToFE(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        intValue = 2;
                    }
                } else {
                    intValue = 3;
                }
            } else {
                intValue = 1;
            }
            IEventCenter LIZIZ = EventCenter.LIZIZ();
            String jSONObject = C770830u.LIZLLL("status", intValue).toString();
            o.LJIIIIZZ(jSONObject, "JSONObject().apply {\n   …\n            }.toString()");
            LIZIZ.LIZ("promote_video_visibility_result", jSONObject);
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        ActivityC45651qj LJJIFFI;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            VideoVisibilitySelectFragment videoVisibilitySelectFragment = new VideoVisibilitySelectFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("use_new_style", true);
            bundle2.putBoolean("is_promote", true);
            videoVisibilitySelectFragment.setArguments(bundle2);
            Aweme aweme = C78966Uyw.LJLJJI;
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = videoVisibilitySelectFragment;
            asl.LJI(0);
            Integer LJI = C79045V0n.LJI(R.attr.c9, context);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLJL = LJI;
            tuxSheet.LJLJI = false;
            tuxSheet.LJLILLLLZI = new IDDListenerS151S0100000_12(videoVisibilitySelectFragment, 2);
            BaseVideoPrivacySettingViewModel baseVideoPrivacySettingViewModel = (BaseVideoPrivacySettingViewModel) new ViewModelProvider(LJJIFFI).get(VideoVisibilityViewModel.class);
            o.LJIIIIZZ(aweme, "aweme");
            baseVideoPrivacySettingViewModel.LJLJJL = aweme;
            baseVideoPrivacySettingViewModel.LJLJJLL = null;
            baseVideoPrivacySettingViewModel.LJLJI.setValue(Integer.valueOf(baseVideoPrivacySettingViewModel.ov0()));
            baseVideoPrivacySettingViewModel.LJLJI.observe(LJJIFFI, new AObserverS80S0100000_12(this, 18));
            FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "promote_video_setting");
        }
        return null;
    }
}
