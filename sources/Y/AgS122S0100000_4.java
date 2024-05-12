package Y;

import X.AOJ;
import X.AOV;
import X.C10I;
import X.C10K;
import X.C242419fJ;
import X.C244289iK;
import X.C245639kV;
import X.C253359wx;
import X.C253569xI;
import X.C76800UCe;
import X.C79004UzY;
import X.C82544WaS;
import com.google.gson.internal.i;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.main.PerformanceOptAssem;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell;
import com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.survey.SurveyData;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AgS122S0100000_4 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            default:
                return null;
        }
    }

    public AgS122S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS122S0100000_4 agS122S0100000_4, C10K c10k) {
        i.LIZJ(new ARunnableS40S0100000_4((PerformanceOptAssem) agS122S0100000_4.l0, 63));
        return null;
    }

    public static final Object then$1(AgS122S0100000_4 agS122S0100000_4, C10K c10k) {
        AOV aov = (AOV) agS122S0100000_4.l0;
        aov.getClass();
        if (!C82544WaS.LJ(c10k)) {
            AOJ aoj = aov.LIZ;
            if (aoj != null) {
                c10k.LJIIJ();
                aoj.LIZIZ();
            }
        } else {
            SurveyData surveyData = (SurveyData) c10k.LJIIJJI();
            AOJ aoj2 = aov.LIZ;
            if (aoj2 != null) {
                if (surveyData == null || surveyData.dialogId == 0) {
                    surveyData = null;
                }
                aoj2.LIZ(surveyData);
            }
        }
        return null;
    }

    public static final Object then$2(AgS122S0100000_4 agS122S0100000_4, C10K c10k) {
        ((ProfileEditFragment) agS122S0100000_4.l0).Nl();
        ProfileEditFragment profileEditFragment = (ProfileEditFragment) agS122S0100000_4.l0;
        profileEditFragment.Hl(profileEditFragment.Nl());
        return null;
    }

    public static final Object then$3(AgS122S0100000_4 agS122S0100000_4, C10K c10k) {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (c10k.LJIIL() || c10k.LJIILJJIL() || !createIUserServicebyMonsterPlugin.isLogin()) {
            ((VideoTagFriendsListViewModel) agS122S0100000_4.l0).setState(C244289iK.LJLIL);
            return null;
        }
        ((VideoTagFriendsListViewModel) agS122S0100000_4.l0).setState(new AqS170S0100000_4(c10k, (C10K<C242419fJ>) 981));
        return null;
    }

    public static final Object then$4(AgS122S0100000_4 agS122S0100000_4, C10K c10k) {
        C245639kV c245639kV = (C245639kV) agS122S0100000_4.l0;
        ArrayList arrayList = (ArrayList) c10k.LJIIJJI();
        if (c245639kV.LJIILIIL != null) {
            InteractStickerViewModel interactStickerViewModel = c245639kV.LJIIIIZZ;
            if (interactStickerViewModel != null) {
                interactStickerViewModel.iv0(arrayList, "interact_sticker_video_data");
            }
        } else if (!C79004UzY.LJJIFFI(arrayList)) {
            c245639kV.LJFF();
            InteractStickerViewModel interactStickerViewModel2 = c245639kV.LJIIIIZZ;
            if (interactStickerViewModel2 != null) {
                interactStickerViewModel2.iv0(arrayList, "interact_sticker_video_data");
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$5(AgS122S0100000_4 agS122S0100000_4, C10K c10k) {
        if (!C82544WaS.LJ(c10k)) {
            return null;
        }
        Object LJIIJJI = c10k.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "it.result");
        if (((Boolean) LJIIJJI).booleanValue()) {
            C253359wx c253359wx = (C253359wx) ((SecurityAlertsCell) agS122S0100000_4.l0).getItem();
            if (c253359wx != null) {
                c253359wx.LJLILLLLZI = R.raw.icon_exclamation_mark_circle_fill;
            }
            C253359wx c253359wx2 = (C253359wx) ((SecurityAlertsCell) agS122S0100000_4.l0).getItem();
            if (c253359wx2 != null) {
                c253359wx2.LJLJI = R.attr.e7;
            }
            ((SecurityAlertsCell) agS122S0100000_4.l0).L();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$6(AgS122S0100000_4 agS122S0100000_4, C10K c10k) {
        Object LJIIJJI;
        int i;
        if (C82544WaS.LJ(c10k) && (LJIIJJI = c10k.LJIIJJI()) != null) {
            C253569xI c253569xI = (C253569xI) ((SecurityVerificationCell) agS122S0100000_4.l0).getItem();
            if (c253569xI != null) {
                if (o.LJ(LJIIJJI, Boolean.TRUE)) {
                    i = R.string.rn0;
                } else {
                    i = R.string.rmy;
                }
                c253569xI.LJLILLLLZI = i;
            }
            ((SecurityVerificationCell) agS122S0100000_4.l0).L();
        }
        return null;
    }
}
