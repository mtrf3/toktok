package X;

import Y.ACallableS24S0001000_6;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.anchor.service.AnchorListServiceImpl;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.compliance.sandbox.serviceimpl.SandboxServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.feed.consumption.impl.ConsumeLoginLoginServiceImpl;
import com.ss.android.ugc.aweme.feed.count.impl.FeedPlayNumServiceImpl;
import com.ss.android.ugc.aweme.feed.ui.progressguidance.NewUserProgressBarManager;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.Ft9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class CallableC40387Ft9 implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$clearCacheNoDiskManager$15;
        switch (this.LJLIL) {
            case 0:
                C54980Lhw c54980Lhw = (C54980Lhw) this.LJLILLLLZI;
                c54980Lhw.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", 200);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C09900aA.LJ("feed_error", jSONObject);
                c54980Lhw.LJZI.LJIIL("[onSuccess] feed error" + jSONObject);
                return null;
            case 1:
                Bundle bundle = (Bundle) this.LJLILLLLZI;
                SandboxServiceImpl.LIZ().activeOrInActiveOrbu(EnumC40383Ft5.SWITCH_ACCOUNT);
                C40384Ft6.LIZ("Switch Account", ((RBX) HG3.LJIILL()).getCurUserId());
                if (C19N.LJ("after_switch_account_update_vids", false)) {
                    FH1.LJI.getClass();
                    FH1.LIZLLL();
                }
                C40384Ft6.LIZJ();
                C40384Ft6.LIZ = true;
                bundle.putBoolean("is_start_by_switch_account", true);
                C40535FvX.LIZIZ(false);
                SharePrefCache.inst().clearCache();
                QBA.LIZIZ().LIZLLL(3, Collections.singletonList("kakaotalk"));
                C10K.LIZJ(new ACallableS24S0001000_6(1, 1));
                EJB.LIZIZ.LJFF(null);
                C78966Uyw.LJJIJ().LIZLLL();
                Z9N.LIZIZ.LJJLIL(2);
                SettingManagerServiceImpl.LIZJ().LIZ(1);
                HybridKitTaskImpl.LJIIJJI().LJII();
                ((RBX) HG3.LJIILL()).checkIn();
                User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                if (curUser != null) {
                    String accountRegion = curUser.getAccountRegion();
                    if (!TextUtils.isEmpty(accountRegion)) {
                        QJY.LIZJ("account_region", accountRegion);
                    }
                } else {
                    C78996UzQ.LJJIJL();
                }
                if (Build.VERSION.SDK_INT >= 25) {
                    TiktokShortcutManager.LJIIJ().LJIIIIZZ("afterSwitchAccount", true);
                }
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (((RBY) HG3.LJIILL()).isChildrenMode() && ((RBX) HG3.LJIILL()).allUidList().size() > 1) {
                    ((RBX) HG3.LJIILL()).logoutAllBackgroundUser();
                    bundle.putString("switch_account_success_toast_text", LJIIIIZZ.getString(R.string.gei));
                } else {
                    bundle.putString("switch_account_success_toast_text", LJIIIIZZ.getString(R.string.ty9, ((RBX) HG3.LJIILL()).getCurUser().getNickname()));
                }
                IMService.createIIMServicebyMonsterPlugin(false).getImInitializeService().LIZ();
                C3GN.LIZIZ.LIZJ();
                C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
                if (LJJIJIL != null) {
                    LJJIJIL.LJJJ();
                }
                a.LJIILL().LJIIIIZZ();
                a.LJ().LJIIJ();
                if (!AV1.LJIIJJI()) {
                    a.LJ().LJFF();
                    a.LJIILL().LJIILIIL(new V3N());
                    a.LJIILL().LIZLLL();
                    a.LJIJJ().LIZIZ(1);
                } else {
                    a.LJIJJ().LJIILIIL(2);
                }
                C86580XyS.LIZ = null;
                bundle.putBoolean("need_restart", bundle.getBoolean("need_restart", true));
                LiveOuterService.LJJJLL().LJJIJIL().getClass();
                Live.refreshLoginState();
                Z8A.LIZIZ.LIZ.runYoutubeRefreshTask(EF7.LIZIZ());
                AnchorListServiceImpl.LIZLLL().LIZ();
                C40384Ft6.LIZLLL();
                AV1.LIZ = null;
                AV1.LIZIZ = null;
                SpecActServiceImpl.LJJJIL().LJI();
                a.LJIJJ().LIZJ();
                MusicService.LJJLIIIJJI().LJJIJIIJI();
                MH2.LIZ.getClass();
                MH2.LIZJ.LJIIIIZZ(-1);
                MH2.LIZLLL.LJIIIIZZ(-1);
                TTSVoiceRecordService.LIZLLL().LIZJ();
                VoiceConversionRecordService.LJ().LIZLLL();
                ShareServiceImpl.LJJJLZIJ().LJJI(EF7.LIZIZ(), AV1.LJIILLIIL());
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService().curUserId");
                C2OE.LJIIJ = curUserId;
                C2OF.LJ(true);
                C2OF.LIZLLL();
                NewUserProgressBarManager.LIZLLL();
                CommonFeedApiService.LIZ().LJI();
                C7HV.LIZIZ.clearCache();
                if (AccountService.LJIJ().LJFF().isLogin()) {
                    AV1.LJIILLIIL();
                }
                C72802tQ.LIZ().LJJI();
                C178736zt.LIZIZ();
                SecApiImpl.LIZ().reportData(FWZ.LOGGED.getReportName());
                QnaService.LIZ().clearSearchHistoryKeva();
                FeedPlayNumServiceImpl.LJ().LIZ();
                ConsumeLoginLoginServiceImpl.LIZLLL().LIZ();
                return bundle;
            default:
                lambda$clearCacheNoDiskManager$15 = ((I18nSettingNewVersionFragment) this.LJLILLLLZI).lambda$clearCacheNoDiskManager$15();
                return lambda$clearCacheNoDiskManager$15;
        }
    }

    public /* synthetic */ CallableC40387Ft9(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
