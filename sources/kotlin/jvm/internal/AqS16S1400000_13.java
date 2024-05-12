package kotlin.jvm.internal;

import X.AA0;
import X.AA1;
import X.AA2;
import X.AA3;
import X.AA5;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C1E4;
import X.C221018lt;
import X.C25780A9w;
import X.C33X;
import X.C52790Kni;
import X.C52792Knk;
import X.C57738MlK;
import X.C57778Mly;
import X.C75247Tg3;
import X.C76800UCe;
import X.C78632UtY;
import X.C78636Utc;
import X.EnumC25783A9z;
import X.EnumC57876MnY;
import X.EnumC75250Tg6;
import X.IWF;
import X.InterfaceC25781A9x;
import X.InterfaceC78626UtS;
import X.InterfaceC88472Yns;
import X.M43;
import X.ORZ;
import X.UPK;
import X.UPT;
import X.UQ7;
import X.X1D;
import android.graphics.Rect;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.recommend.RecUserInMainActivityViewModel;
import com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public class AqS16S1400000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS16S1400000_13 aqS16S1400000_13, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C75247Tg3((Integer) aqS16S1400000_13.l2, (Integer) aqS16S1400000_13.l3, aqS16S1400000_13.s0, ((EnumC75250Tg6) aqS16S1400000_13.l1).type, (Rect) aqS16S1400000_13.l4);
    }

    public static final Object invoke$1(AqS16S1400000_13 aqS16S1400000_13, Object obj) {
        AA5 it = (AA5) obj;
        o.LJIIIZ(it, "it");
        InterfaceC78626UtS interfaceC78626UtS = (InterfaceC78626UtS) aqS16S1400000_13.l1;
        if (interfaceC78626UtS != null) {
            interfaceC78626UtS.Hs0(new C78632UtY());
        }
        RecUserInMainActivityViewModel recUserInMainActivityViewModel = ((RecUserPopupInMainActivityController) aqS16S1400000_13.l2).LJLJJI;
        EnumC57876MnY scene = (EnumC57876MnY) aqS16S1400000_13.l3;
        String enterFrom = aqS16S1400000_13.s0;
        recUserInMainActivityViewModel.getClass();
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(enterFrom, "enterFrom");
        C78636Utc gv0 = recUserInMainActivityViewModel.gv0();
        boolean z = true;
        if (gv0.LIZJ) {
            gv0.LIZJ = false;
            long currentTimeMillis = (System.currentTimeMillis() - gv0.LIZLLL) + gv0.LIZ;
            gv0.LIZ = currentTimeMillis;
            if (!gv0.LIZIZ && currentTimeMillis <= TimeUnit.SECONDS.toMillis(((Number) C52790Kni.LIZ.getValue()).intValue())) {
                C221018lt.LIZ("ClientAIDebug", "is negative action");
                AA0 LIZ = AA1.LIZ();
                int i = LIZ.LIZ.getInt("dialog_close_without_action_in_times", 0) + 1;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("incrementing negative action times to ");
                LIZ2.append(i);
                C221018lt.LIZ("ClientAIDebug", X1D.LIZIZ(LIZ2));
                LIZ.LIZ.storeInt("dialog_close_without_action_in_times", i);
                if (i >= 2) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Keva keva = LIZ.LIZ;
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    keva.storeLong("dialog_close_without_action_in_times_maximum_timestamp", timeUnit.toMillis(((Number) C52792Knk.LIZ.getValue()).intValue()) + currentTimeMillis2);
                    LIZ.LIZ.storeLong("dialog_close_without_action_in_times_minimum_timestamp", timeUnit.toMillis(14L) + currentTimeMillis2);
                    LIZ.LIZ.storeLong("dialog_last_negative_feedback_timestamp", currentTimeMillis2);
                }
            } else {
                C221018lt.LIZ("ClientAIDebug", "is positive action");
                AA1.LIZ().LIZ.storeInt("dialog_close_without_action_in_times", 0);
            }
        }
        if (scene == EnumC57876MnY.FYP_POPUP) {
            IWF.LJJLIIIIJ().LIZIZ();
            recUserInMainActivityViewModel.LJLIL = false;
        }
        long j = recUserInMainActivityViewModel.gv0().LIZ;
        if (AA1.LIZ().LIZ.getInt("dialog_close_without_action_in_times", 0) < 2) {
            z = false;
        }
        new AA3(enterFrom, j, it, null, Boolean.valueOf(z), 8).LIZLLL(null);
        C78636Utc gv02 = recUserInMainActivityViewModel.gv0();
        gv02.LIZ = 0L;
        gv02.LIZIZ = false;
        gv02.LIZJ = false;
        gv02.LIZLLL = 0L;
        if (scene == EnumC57876MnY.INBOX_PROFILE_POPUP) {
            recUserInMainActivityViewModel.LJLJL.setValue(Boolean.FALSE);
        }
        InterfaceC25781A9x interfaceC25781A9x = (InterfaceC25781A9x) aqS16S1400000_13.l4;
        M43 m432 = ((RecUserPopupInMainActivityController) aqS16S1400000_13.l2).LJLILLLLZI;
        interfaceC25781A9x.destroy();
        RecUserPopupInMainActivityController.LJLJJL.remove(m432);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS16S1400000_13 aqS16S1400000_13, Object obj) {
        Aweme aweme;
        String str;
        String authorUid;
        C57778Mly listState = (C57778Mly) obj;
        o.LJIIIZ(listState, "listState");
        UPK upk = (UPK) aqS16S1400000_13.l1;
        InterfaceC25781A9x interfaceC25781A9x = (InterfaceC25781A9x) aqS16S1400000_13.l2;
        int intValue = ((Number) ORZ.LJLLJ((List) aqS16S1400000_13.l3)).intValue();
        upk.getClass();
        int LJIIL = UPK.LJIIL(intValue);
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS16S1400000_13.l4;
        String str2 = aqS16S1400000_13.s0;
        if (!(listState.LIZJ instanceof C33X) && !upk.LJII && !C1E4.LJIJJLI()) {
            if (listState.LIZLLL > 0) {
                upk.LJII = true;
                UPT.LJ(LJIIL, UQ7.RECOMMEND.getValue());
                C57738MlK.LIZIZ.LJIIIIZZ(str2);
                HomePageDataViewModel homePageDataViewModel = upk.LIZJ;
                if (homePageDataViewModel != null) {
                    aweme = homePageDataViewModel.LJLJLLL;
                } else {
                    aweme = null;
                }
                FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                String str3 = "";
                if (str == null) {
                    str = "";
                }
                if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
                    str3 = authorUid;
                }
                LJJIJLIJ.LJIILJJIL(str2, str, str3, "4");
                new AA2(upk.LIZLLL.invoke(), EnumC25783A9z.AUTHORIZE, null, null).LIZLLL(null);
                FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                C25780A9w.LIZ(interfaceC25781A9x, supportFragmentManager, new AqS144S0200000_13(interfaceC25781A9x, upk, 106));
            } else {
                UPK.LJIIIZ();
                interfaceC25781A9x.destroy();
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S1400000_13(EnumC75250Tg6 enumC75250Tg6, Integer num, Integer num2, String str, Rect rect, int i) {
        super(1);
        this.$t = i;
        this.l1 = enumC75250Tg6;
        this.l2 = num;
        this.l3 = num2;
        this.s0 = str;
        this.l4 = rect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS16S1400000_13(UPK upk, UPK upk2, InterfaceC25781A9x interfaceC25781A9x, List<Integer> list, ActivityC45651qj activityC45651qj, String str) {
        super(1);
        this.$t = str;
        this.l1 = upk;
        this.l2 = upk2;
        this.l3 = interfaceC25781A9x;
        this.l4 = list;
        this.s0 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S1400000_13(InterfaceC78626UtS interfaceC78626UtS, RecUserPopupInMainActivityController recUserPopupInMainActivityController, EnumC57876MnY enumC57876MnY, String str, InterfaceC25781A9x interfaceC25781A9x, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC78626UtS;
        this.l2 = recUserPopupInMainActivityController;
        this.l3 = enumC57876MnY;
        this.s0 = str;
        this.l4 = interfaceC25781A9x;
    }
}
