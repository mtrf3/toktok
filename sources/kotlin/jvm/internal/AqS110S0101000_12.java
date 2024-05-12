package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC72031SOt;
import X.C72037SOz;
import X.C72207SVn;
import X.C72209SVp;
import X.C76800UCe;
import X.C78939UyV;
import X.InterfaceC65784Pro;
import X.SN1;
import X.SN3;
import X.TNT;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.refactor.VideoMusicTitleRefactorAssem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;

/* loaded from: classes13.dex */
public class AqS110S0101000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AqS110S0101000_12 aqS110S0101000_12) {
        ((VideoMusicTitleAssem) aqS110S0101000_12.l0).getContainerView().setVisibility(aqS110S0101000_12.i1);
        ((VideoMusicTitleAssem) aqS110S0101000_12.l0).Y3().setVisibility(aqS110S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS110S0101000_12 aqS110S0101000_12) {
        ((VideoMusicTitleRefactorAssem) aqS110S0101000_12.l0).getContainerView().setVisibility(aqS110S0101000_12.i1);
        ((VideoMusicTitleRefactorAssem) aqS110S0101000_12.l0).Y3().setVisibility(aqS110S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS110S0101000_12 aqS110S0101000_12) {
        ((C72209SVp) aqS110S0101000_12.l0).setIconRes(aqS110S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS110S0101000_12 aqS110S0101000_12) {
        ((C72207SVn) aqS110S0101000_12.l0).setPanelItemHeight(aqS110S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS110S0101000_12 aqS110S0101000_12) {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = ((C72037SOz) aqS110S0101000_12.l0).LJLLI;
        if (privacySettingsRestrictionItem != null) {
            privacySettingsRestrictionOption = C78939UyV.LJJIFFI(privacySettingsRestrictionItem, Integer.valueOf(aqS110S0101000_12.i1));
        } else {
            privacySettingsRestrictionOption = null;
        }
        SN3.LIZ(privacySettingsRestrictionOption, ((C72037SOz) aqS110S0101000_12.l0).LJLLILLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS110S0101000_12 aqS110S0101000_12) {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        PrivacySettingsRestrictionItem LLII = ((SN1) aqS110S0101000_12.l0).LLII();
        if (LLII != null) {
            privacySettingsRestrictionOption = C78939UyV.LJJIFFI(LLII, Integer.valueOf(aqS110S0101000_12.i1));
        } else {
            privacySettingsRestrictionOption = null;
        }
        SN3.LIZ(privacySettingsRestrictionOption, ((SN1) aqS110S0101000_12.l0).LJLLI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS110S0101000_12 aqS110S0101000_12) {
        TNT tnt = (TNT) aqS110S0101000_12.l0;
        tnt.LJI.onProgress(tnt.LJFF, aqS110S0101000_12.i1, tnt.LJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS110S0101000_12 aqS110S0101000_12) {
        ((AbstractC72031SOt) aqS110S0101000_12.l0).LLIIIZ(aqS110S0101000_12.i1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS110S0101000_12(SN1 sn1, SN1<? extends VM> sn12, int i) {
        super(0);
        this.$t = i;
        this.l0 = sn1;
        this.i1 = sn12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS110S0101000_12(AbstractC72031SOt abstractC72031SOt, AbstractC72031SOt<BaseVideoPrivacySettingViewModel> abstractC72031SOt2, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC72031SOt;
        this.i1 = abstractC72031SOt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0101000_12(C72037SOz c72037SOz, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c72037SOz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0101000_12(C72207SVn c72207SVn, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c72207SVn;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0101000_12(C72209SVp c72209SVp, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c72209SVp;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0101000_12(TNT tnt, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = tnt;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0101000_12(VideoMusicTitleAssem videoMusicTitleAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = videoMusicTitleAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS110S0101000_12(VideoMusicTitleRefactorAssem videoMusicTitleRefactorAssem, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = videoMusicTitleRefactorAssem;
        this.i1 = i;
    }
}
