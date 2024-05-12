package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.8ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220858ld {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Aweme aweme) {
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
        if (aweme != null && aweme.getVideo() != null && aweme.getVideo().getVideoLength() > 0 && ((aweme.getVideo().getVideoLength() <= shortVideoConfig.maxConsumerDuetOrStitchVideoTime() || aweme.isSupportGameChallenge() || (C78996UzQ.LJJIIZI(aweme) && aweme.getVideo().getVideoLength() <= shortVideoConfig.extendedDuetOrStitchTime())) && aweme.canDuetVideoType() && !aweme.isVr() && aweme.getDuetSetting() != 2 && (((aweme.getDuetSetting() != 1 && !aweme.isSubOnlyVideo()) || C78996UzQ.LJJIIZI(aweme)) && !LJFF(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null))) {
            o.LJIIIIZZ(aweme.getMusic().getPlayUrl().getUrlList(), "aweme.music.playUrl.urlList");
            if ((!r1.isEmpty()) && !aweme.isWithPromotionalMusic()) {
                return true;
            }
        }
        return false;
    }

    public static final EnumC44070HRi LIZIZ(Aweme aweme) {
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
        if (aweme == null || aweme.getVideo() == null) {
            return EnumC44070HRi.VIDEO_IS_NOT_EXIT;
        }
        if (aweme.getVideo().getVideoLength() <= 0) {
            return EnumC44070HRi.VIDEO_IS_NOT_EXIT;
        }
        if (!aweme.canDuetVideoType()) {
            return EnumC44070HRi.AWEME_TYPE;
        }
        if (aweme.isVr()) {
            return EnumC44070HRi.AWEME_IS_VR;
        }
        if (aweme.getDuetSetting() == 2) {
            return EnumC44070HRi.COMMERCE_CLOSE_DUET_OR_STITCH;
        }
        if (aweme.getDuetSetting() == 1 && !C78996UzQ.LJJIIZI(aweme)) {
            return EnumC44070HRi.USER_CLOSE_DUET_OR_STITCH_AND_NOT_SELF;
        }
        if (LJFF(aweme) || aweme.getMusic() == null || aweme.getMusic().getPlayUrl() == null || aweme.getMusic().getPlayUrl().getUrlList() == null || aweme.getMusic().getPlayUrl().getUrlList().isEmpty()) {
            return EnumC44070HRi.MUSIC_NULL;
        }
        if (aweme.isWithPromotionalMusic()) {
            return EnumC44070HRi.AWEME_IS_WITH_PROMOTIONAL_MUSIC;
        }
        if (!C78996UzQ.LJJIIZI(aweme) && aweme.getVideo().getVideoLength() > shortVideoConfig.maxConsumerDuetOrStitchVideoTime() && !aweme.isSupportGameChallenge()) {
            return EnumC44070HRi.VIDEO_LENGTH_RESTRICT;
        }
        if (C78996UzQ.LJJIIZI(aweme) && aweme.getVideo().getVideoLength() > shortVideoConfig.extendedDuetOrStitchTime() && !aweme.isSupportGameChallenge()) {
            return EnumC44070HRi.VIDEO_LENGTH_RESTRICT;
        }
        return EnumC44070HRi.NO_ERROR;
    }

    public static EnumC44070HRi LIZJ(Aweme aweme) {
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
        if (aweme == null || aweme.getVideo() == null) {
            return EnumC44070HRi.VIDEO_IS_NOT_EXIT;
        }
        if (aweme.getVideo().getVideoLength() <= 0) {
            return EnumC44070HRi.VIDEO_IS_NOT_EXIT;
        }
        if (!aweme.canStitchVideoType()) {
            return EnumC44070HRi.AWEME_TYPE;
        }
        if (aweme.isVr()) {
            return EnumC44070HRi.AWEME_IS_VR;
        }
        if (aweme.getStitchSetting() == 2) {
            return EnumC44070HRi.COMMERCE_CLOSE_DUET_OR_STITCH;
        }
        if (aweme.getStitchSetting() == 1 && !C78996UzQ.LJJIIZI(aweme)) {
            return EnumC44070HRi.USER_CLOSE_DUET_OR_STITCH_AND_NOT_SELF;
        }
        if (LJFF(aweme) || aweme.getMusic() == null || aweme.getMusic().getPlayUrl() == null || aweme.getMusic().getPlayUrl().getUrlList() == null || aweme.getMusic().getPlayUrl().getUrlList().isEmpty()) {
            return EnumC44070HRi.MUSIC_NULL;
        }
        if (aweme.isWithPromotionalMusic()) {
            return EnumC44070HRi.AWEME_IS_WITH_PROMOTIONAL_MUSIC;
        }
        if (CommerceMediaServiceImpl.LIZJ().LJIILLIIL(aweme.getMusic())) {
            return EnumC44070HRi.COMMERCE_USER_NOT_COMMERCE_MUSIC;
        }
        if ((!C78996UzQ.LJJIIZI(aweme) && aweme.getVideo().getVideoLength() > shortVideoConfig.maxConsumerDuetOrStitchVideoTime()) || (C78996UzQ.LJJIIZI(aweme) && aweme.getVideo().getVideoLength() > shortVideoConfig.extendedDuetOrStitchTime())) {
            return EnumC44070HRi.VIDEO_LENGTH_RESTRICT;
        }
        return EnumC44070HRi.NO_ERROR;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.LIZ().configService().shortVideoConfig();
        if (aweme.getVideo() != null && (((aweme.getVideo().getVideoLength() > 0 && aweme.getVideo().getVideoLength() <= shortVideoConfig.maxConsumerDuetOrStitchVideoTime()) || (C78996UzQ.LJJIIZI(aweme) && aweme.getVideo().getVideoLength() <= shortVideoConfig.extendedDuetOrStitchTime())) && aweme.canStitchVideoType() && !aweme.isVr() && aweme.getStitchSetting() != 2 && (((aweme.getStitchSetting() != 1 && !aweme.isSubOnlyVideo()) || C78996UzQ.LJJIIZI(aweme)) && !LJFF(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null))) {
            o.LJIIIIZZ(aweme.getMusic().getPlayUrl().getUrlList(), "aweme.music.playUrl.urlList");
            if ((!r1.isEmpty()) && !aweme.isWithPromotionalMusic() && !LJ(aweme)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        if (aweme == null || (anchors = aweme.getAnchors()) == null || anchors.isEmpty()) {
            return false;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() || anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJFF(Aweme aweme) {
        if (aweme != null && aweme.getMusic() != null && aweme.getMusic().getMusicStatus() == 0) {
            C73340SqO.LJJIIZI().getClass();
            if (!C59252NNg.LJI(aweme)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJI(Aweme aweme) {
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        AwemeStatus status2;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        if (aweme == null || (status = aweme.getStatus()) == null || (videoMuteInfo = status.getVideoMuteInfo()) == null || !videoMuteInfo.getIsCopyrightViolation()) {
            return false;
        }
        if (aweme != null && (status2 = aweme.getStatus()) != null && (videoMuteInfo2 = status2.getVideoMuteInfo()) != null && videoMuteInfo2.getAudioChangeStatus() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(Aweme aweme) {
        if (aweme != null && aweme.getMusic() != null && aweme.getMusic().getMusicStatus() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        Boolean showMask;
        Boolean showMask2;
        if (aweme == null || aweme.getReportMaskInfo() == null || aweme.getGeneralMaskInfo() == null || aweme.getPhotosensitiveMaskInfo() == null || aweme.getContentClassificationMaskInfo() == null) {
            return false;
        }
        Boolean showMask3 = aweme.getContentClassificationMaskInfo().getShowMask();
        if ((showMask3 == null || !showMask3.booleanValue() || C2060386t.LIZ(aweme.getContentClassificationMaskInfo().getTitle())) && (((showMask = aweme.getReportMaskInfo().getShowMask()) == null || !showMask.booleanValue() || C2060386t.LIZ(aweme.getReportMaskInfo().getTitle()) || C2060386t.LIZ(aweme.getReportMaskInfo().getCancelMaskLabel())) && ((showMask2 = aweme.getGeneralMaskInfo().getShowMask()) == null || !showMask2.booleanValue() || C2060386t.LIZ(aweme.getGeneralMaskInfo().getTitle()) || C2060386t.LIZ(aweme.getGeneralMaskInfo().getContent())))) {
            Boolean showMask4 = aweme.getPhotosensitiveMaskInfo().getShowMask();
            if (showMask4 == null || !showMask4.booleanValue()) {
                return false;
            }
            Integer valueOf = Integer.valueOf(a.LJFF().LJJIIJZLJL());
            o.LJI(valueOf);
            if (valueOf.intValue() <= 0 || a.LJFF().LJJIJIIJI() == 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJIIIZ(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getGeneralMaskInfo() == null || LJIIJJI(aweme) || (showMask = aweme.getGeneralMaskInfo().getShowMask()) == null || !showMask.booleanValue() || C2060386t.LIZ(aweme.getGeneralMaskInfo().getTitle()) || C2060386t.LIZ(aweme.getGeneralMaskInfo().getContent())) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getPhotosensitiveMaskInfo() == null) {
            return false;
        }
        Integer valueOf = Integer.valueOf(a.LJFF().LJJIIJZLJL());
        o.LJI(valueOf);
        if (valueOf.intValue() <= 0 || a.LJFF().LJJIJIIJI() == 2 || LJIIJJI(aweme) || LJIIIZ(aweme) || (showMask = aweme.getPhotosensitiveMaskInfo().getShowMask()) == null || !showMask.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getReportMaskInfo() == null || (showMask = aweme.getReportMaskInfo().getShowMask()) == null || !showMask.booleanValue() || C2060386t.LIZ(aweme.getReportMaskInfo().getTitle()) || C2060386t.LIZ(aweme.getReportMaskInfo().getCancelMaskLabel())) {
            return false;
        }
        return true;
    }
}
