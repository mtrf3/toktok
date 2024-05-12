package Y;

import X.BLD;
import X.C28253B6z;
import X.C38995FSd;
import X.C76800UCe;
import X.CN1;
import X.EFJ;
import X.InterfaceC65784Pro;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.widget.WatchLiveBackBtnWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftTrayWidgetV2;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.RequestAudienceApiAllowList;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import com.bytedance.android.livesdk.widget.RecommendSwipeOldWidget;
import com.ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivityArgs;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.ShareSettingApi;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class AObjectS21S0001000_5 implements InterfaceC65784Pro {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public AObjectS21S0001000_5(int i) {
        this.$t = i;
        this.i0 = 257;
    }

    public static final Object invoke$0(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        switch (aObjectS21S0001000_5.i0) {
            case 0:
                return new WatchLiveBackBtnWidget();
            default:
                return new LiveGiftTrayWidgetV2();
        }
    }

    public static final Object invoke$1(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        switch (aObjectS21S0001000_5.i0) {
            case 0:
                return ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).yG();
            case 1:
                return new BLD(1);
            default:
                return new AvatarCutActivityArgs();
        }
    }

    public static final Object invoke$2(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        switch (aObjectS21S0001000_5.i0) {
            case 0:
                return Boolean.valueOf(C28253B6z.LIZ);
            default:
                C38995FSd.LIZLLL().execute(new ARunnableS0S0001000_5(1, 6));
                return null;
        }
    }

    public static final Object invoke$3(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        switch (aObjectS21S0001000_5.i0) {
            case 0:
                return AbsAudienceInteractionFragment.lambda$endWidgetLoading$60();
            default:
                return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(ShareSettingApi.class);
        }
    }

    public static final Object invoke$4(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        switch (aObjectS21S0001000_5.i0) {
            case 0:
                return new RecommendSwipeNewWidget();
            default:
                return new BLD(0);
        }
    }

    public static final Object invoke$5(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        switch (aObjectS21S0001000_5.i0) {
            case 0:
                return C76800UCe.LIZ;
            case 1:
                return new RecommendSwipeOldWidget();
            default:
                return SettingNewVersionFragment.lambda$onCreate$0();
        }
    }

    public static final Object invoke$6(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        return new LiveNormalPollEffectWidget(aObjectS21S0001000_5.i0);
    }

    public static final Object invoke$7(AObjectS21S0001000_5 aObjectS21S0001000_5) {
        switch (aObjectS21S0001000_5.i0) {
            case 0:
                return Arrays.asList(RequestAudienceApiAllowList.INSTANCE.getValue());
            default:
                return null;
        }
    }

    public AObjectS21S0001000_5(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }
}
