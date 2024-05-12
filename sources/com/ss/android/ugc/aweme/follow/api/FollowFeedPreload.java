package com.ss.android.ugc.aweme.follow.api;

import X.C38827FLr;
import X.C47261Igj;
import X.C54492La4;
import X.C54960Lhc;
import X.C56662Kg;
import X.C65352Pkq;
import X.C76L;
import X.C78688UuS;
import X.EU3;
import X.HG3;
import X.InterfaceC88472Yns;
import X.J7H;
import X.LW9;
import X.LWC;
import X.RBY;
import X.X1D;
import X.X8M;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.commercialize.data.utils.AdSessionPositionHelper;
import com.ss.android.ugc.aweme.experiment.FollowFeedPreloadExceedSetting;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.legacy.FollowTabBubbleGuideHelperImpl;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class FollowFeedPreload implements X8M<FollowFeedApiV2, C76L<FollowFeedList>> {
    public Bundle preloadBundle;

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        int i;
        if (((Boolean) LWC.LIZJ.getValue()).booleanValue() || ((Boolean) LWC.LJ.getValue()).booleanValue()) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel followFeedPreloadExceedSettingModel = FollowFeedPreloadExceedSetting.LIZ;
            FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel followFeedPreloadExceedSettingModel2 = (FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel) LIZLLL.LJIIIIZZ("follow_feed_preload_exceed_duration", FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel.class, followFeedPreloadExceedSettingModel);
            if (followFeedPreloadExceedSettingModel2 != null) {
                followFeedPreloadExceedSettingModel = followFeedPreloadExceedSettingModel2;
            }
            i = followFeedPreloadExceedSettingModel.firstGroup;
        } else if (((Boolean) LWC.LIZLLL.getValue()).booleanValue() || ((Boolean) LWC.LJFF.getValue()).booleanValue()) {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel followFeedPreloadExceedSettingModel3 = FollowFeedPreloadExceedSetting.LIZ;
            FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel followFeedPreloadExceedSettingModel4 = (FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel) LIZLLL2.LJIIIIZZ("follow_feed_preload_exceed_duration", FollowFeedPreloadExceedSetting.FollowFeedPreloadExceedSettingModel.class, followFeedPreloadExceedSettingModel3);
            if (followFeedPreloadExceedSettingModel4 != null) {
                followFeedPreloadExceedSettingModel3 = followFeedPreloadExceedSettingModel4;
            }
            i = followFeedPreloadExceedSettingModel3.secondGroup;
        } else {
            i = 0;
        }
        return new C38827FLr(i, Api.LIZ, true);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        Long l;
        long j;
        o.LJIIIZ(exception, "exception");
        Bundle bundle = this.preloadBundle;
        if (bundle != null) {
            l = Long.valueOf(bundle.getLong("preload_start_time"));
        } else {
            l = null;
        }
        long j2 = -1;
        if (l != null) {
            j = l.longValue() - C56662Kg.LIZ().LJIIJJI;
            j2 = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = -1;
        }
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        String message = exception.getMessage();
        if (message == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onFail ");
            LIZ.append(C65352Pkq.LIZ(exception.getClass()).LJFF());
            message = X1D.LIZIZ(LIZ);
        }
        C54492La4.LIZ(valueOf, valueOf2, false, -1, message);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public C76L<FollowFeedList> preload(Bundle bundle, InterfaceC88472Yns<? super Class<FollowFeedApiV2>, ? extends FollowFeedApiV2> create) {
        String LIZIZ;
        int i;
        o.LJIIIZ(create, "create");
        this.preloadBundle = bundle;
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(-1, "others_homepage", "others_homepage", "/aweme/v2/follow/feed/", C47261Igj.LJJIJIIJI("follow_req_index", "cursor", "level", "pull_type", "feed_style"));
        int[] LIZ = J7H.LIZ(101);
        String str = "";
        if (LIZ == null) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ[0]);
            LIZ2.append('_');
            LIZ2.append(LIZ[1]);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        FollowFeedApiV2 invoke = create.invoke(FollowFeedApiV2.class);
        String LIZJ = C54960Lhc.LIZ.LIZJ();
        FollowTabBubbleGuideHelperImpl.LIZJ().LIZIZ();
        if (((RBY) HG3.LJIILL()).isUidContactPermisioned()) {
            i = 1;
        } else {
            i = 2;
        }
        Integer valueOf = Integer.valueOf(a.LJIIJ().LJIILIIL());
        String LIZJ2 = a.LJIIZILJ().LIZJ();
        if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
            str = EU3.LIZLLL();
        }
        return invoke.getFollowFeedListNew(1, 0L, 1, 20, 0, 1, 0L, LIZJ, null, null, null, "", i, 2, null, null, null, null, null, null, 0, LIZIZ, "feed", valueOf, LIZJ2, str, C78688UuS.LJJIIJZLJL(), C78688UuS.LJJIIJ(), AdSessionPositionHelper.LJIIIIZZ("following"), LW9.LIZ(), 1, preloadExtraInfo);
    }
}
