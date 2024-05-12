package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xzu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86670Xzu {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(IQM.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(VIV.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(Y1U.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C58231MtH.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C86303Xtz.LJLIL);

    public static ICLACaptionService LJFF() {
        return (ICLACaptionService) LIZ.getValue();
    }

    public static ITranslationService LJIJ() {
        return (ITranslationService) LIZJ.getValue();
    }

    public static String[] LJI() {
        String[] LJIIIIZZ;
        if (!C53150KtW.LIZ() || (LJIIIIZZ = C25792AAi.LIZ().LJIIIIZZ()) == null) {
            return new String[0];
        }
        return LJIIIIZZ;
    }

    public static boolean LJJIIZI() {
        if (LJJIJ()) {
            if (!C47261Igj.LJJIJIIJI(EnumC86688Y0m.HIDDEN_EXPANDED, EnumC86688Y0m.HIDDEN_COLLAPSED).contains(LJIIZILJ(LJIJ().LJJI(), Y1Z.LJLIL))) {
                return true;
            }
        } else if (!AK4.LIZ().LJJI()) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJ() {
        if (ACW.LIZIZ() && VIT.LIZ().LJ()) {
            return true;
        }
        return false;
    }

    public static Boolean LIZ(Aweme aweme) {
        boolean z;
        if (aweme == null) {
            return null;
        }
        if (LJIIIZ(aweme) == null || o.LJ(LJIIIZ(aweme), "un")) {
            return Boolean.FALSE;
        }
        if (!o.LJ(LJIIIZ(aweme), LJIJ().LJJIIZI())) {
            if (C53150KtW.LIZ()) {
                if (ORY.LJJIJIIJIL(LJIIIZ(aweme), LJI())) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    public static Boolean LIZIZ(Aweme aweme) {
        String str;
        String str2;
        boolean z;
        String str3 = null;
        if (aweme == null) {
            return null;
        }
        if (LJII(aweme) != null) {
            AutocaptionType LJII = LJII(aweme);
            if (LJII != null) {
                str = LJII.getLanguage();
            } else {
                str = null;
            }
            if (!o.LJ(str, "un")) {
                AutocaptionType LJII2 = LJII(aweme);
                if (LJII2 != null) {
                    str2 = LJII2.getLanguage();
                } else {
                    str2 = null;
                }
                if (!o.LJ(str2, LJIJ().LJJIIZI())) {
                    if (C53150KtW.LIZ()) {
                        String[] LJI = LJI();
                        AutocaptionType LJII3 = LJII(aweme);
                        if (LJII3 != null) {
                            str3 = LJII3.getLanguage();
                        }
                        if (ORY.LJJIJIIJIL(str3, LJI)) {
                            z = false;
                            return Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    public static final boolean LIZJ(Aweme aweme) {
        boolean z;
        if (aweme == null || AK4.LIZ().LJJIJIIJIL(aweme.getAid())) {
            return false;
        }
        boolean LJJIIJ = LJJIIJ(aweme);
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            while (it.hasNext()) {
                if (it.next().getCaptionStruct() != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!LJJIIJ && !z) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Aweme aweme) {
        if (C41032G8m.LIZ()) {
            if (LJJIIJZLJL(aweme)) {
                return AK4.LIZ().LIZIZ();
            }
            return AK4.LIZ().LJJIFFI();
        }
        if (!AK4.LIZ().LJ()) {
            return true;
        }
        return false;
    }

    public static final AutocaptionType LJII(Aweme aweme) {
        CaptionStruct LJIIL;
        List<AutocaptionType> autoCaptions;
        if (aweme != null && (LJIIL = LJIIL(aweme)) != null && (autoCaptions = LJIIL.getAutoCaptions()) != null) {
            return (AutocaptionType) ORZ.LJLLLLLL(0, autoCaptions);
        }
        return null;
    }

    public static final CaptionItemModel LJIIIIZZ(Aweme aweme) {
        Long l;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        CaptionItemModel captionItemModel = null;
        if (aweme == null) {
            return null;
        }
        Video video = aweme.getVideo();
        if (video != null && (captionModel2 = video.getCaptionModel()) != null && (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) != null) {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        } else {
            l = null;
            if (aweme == null) {
                return null;
            }
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel = video2.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null) {
            return null;
        }
        Iterator<CaptionItemModel> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CaptionItemModel next = it.next();
            long languageId = next.getLanguageId();
            if (l != null && l.longValue() == languageId) {
                captionItemModel = next;
                break;
            }
        }
        return captionItemModel;
    }

    public static final String LJIIIZ(Aweme aweme) {
        CaptionItemModel LJIIIIZZ = LJIIIIZZ(aweme);
        if (LJIIIIZZ != null) {
            return LJIIIIZZ.getLanguageCode();
        }
        return null;
    }

    public static final Long LJIIJ(Aweme aweme) {
        CaptionItemModel LJIIIIZZ = LJIIIIZZ(aweme);
        if (LJIIIIZZ != null) {
            return Long.valueOf(LJIIIIZZ.getClaSubtitleId());
        }
        return null;
    }

    public static final String LJIIJJI(Aweme aweme) {
        String value;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        String value2;
        String versionType;
        Video video;
        CaptionModel captionModel2;
        Video video2;
        CaptionModel captionModel3;
        CaptionLanguage originalCaptionLanguage;
        CaptionLanguage.ClaOriginalCaptionType claOriginalCaptionType = null;
        if (aweme != null && (video = aweme.getVideo()) != null && (captionModel2 = video.getCaptionModel()) != null && captionModel2.getOriginalCaptionLanguage() != null) {
            if (aweme != null && (video2 = aweme.getVideo()) != null && (captionModel3 = video2.getCaptionModel()) != null && (originalCaptionLanguage = captionModel3.getOriginalCaptionLanguage()) != null) {
                claOriginalCaptionType = originalCaptionLanguage.getOriginalCaptionType();
            }
            if (claOriginalCaptionType != CaptionLanguage.ClaOriginalCaptionType.CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED && claOriginalCaptionType != null && claOriginalCaptionType.getCaptionName() != null) {
                return claOriginalCaptionType.getCaptionName();
            }
        }
        if (aweme == null) {
            return "";
        }
        Video video3 = aweme.getVideo();
        if (video3 != null && (captionModel = video3.getCaptionModel()) != null && (captionList = captionModel.getCaptionList()) != null) {
            if (captionList.isEmpty()) {
                return "";
            }
            CaptionItemModel LJIIIIZZ = LJIIIIZZ(aweme);
            if (LJIIIIZZ != null && (versionType = LJIIIIZZ.getVersionType()) != null && CastIntegerProtector.parseInt(versionType) >= 100) {
                value2 = Y4K.CEC.getValue();
            } else {
                CaptionItemModel LJIIIIZZ2 = LJIIIIZZ(aweme);
                if (LJIIIIZZ2 != null && LJIIIIZZ2.isAutoGenerated()) {
                    value2 = Y4K.ASR.getValue();
                } else {
                    value2 = Y4K.CLOSED_CREATOR.getValue();
                }
            }
            if (value2 != null) {
                return value2;
            }
        }
        if (LJII(aweme) == null) {
            return "";
        }
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            while (it.hasNext()) {
                if (it.next().getType() == 20) {
                    value = Y4K.STICKER_CREATOR.getValue();
                    break;
                }
            }
        }
        value = Y4K.CLOSED_CREATOR.getValue();
        if (value == null) {
            return "";
        }
        return value;
    }

    public static final CaptionStruct LJIIL(Aweme aweme) {
        if (aweme != null && aweme.getInteractStickerStructs() != null) {
            o.LJIIIIZZ(aweme.getInteractStickerStructs(), "this.interactStickerStructs");
            if (!r1.isEmpty()) {
                for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                    if (interactStickerStruct.getCaptionStruct() != null) {
                        return interactStickerStruct.getCaptionStruct();
                    }
                }
            }
        }
        return null;
    }

    public static final String LJIILIIL(Aweme aweme) {
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        CaptionItemModel captionItemModel;
        String languageName;
        String languageName2;
        if (aweme == null) {
            return "";
        }
        if (LJFF().LJIIIIZZ(aweme)) {
            if ((Y04.LIZLLL(aweme) != null || LJIJ().LJIJJLI(aweme, LJIJ().LJJIIZI())) && ((ITranslationKevaService) LIZIZ.getValue()).LJ()) {
                return LJIJ().LJJIIZI();
            }
            CaptionItemModel LJIIIIZZ = LJIIIIZZ(aweme);
            if (LJIIIIZZ == null || (languageName2 = LJIIIIZZ.getLanguageName()) == null) {
                return "";
            }
            return languageName2;
        }
        Video video = aweme.getVideo();
        if (video != null && (captionModel = video.getCaptionModel()) != null && (captionList = captionModel.getCaptionList()) != null && (captionItemModel = (CaptionItemModel) ORZ.LJLLLLLL(0, captionList)) != null && (languageName = captionItemModel.getLanguageName()) != null) {
            return languageName;
        }
        return ((ISettingService) LJ.getValue()).getAppLanguage();
    }

    public static final String LJIILJJIL(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        String LJJIIZI = LJIJ().LJJIIZI();
        if (LJFF().LJIIIIZZ(aweme) && !LJIJ().LJIJJLI(aweme, LJJIIZI)) {
            return EnumC79546VJu.OFFLINE.getValue();
        }
        if (!LJFF().LJIIIIZZ(aweme) || !LJIJ().LJIJJLI(aweme, LJJIIZI)) {
            return "";
        }
        if (LJIJ().LJ().LIZIZ(aweme, LJJIIZI)) {
            return EnumC79546VJu.REALTIME.getValue();
        }
        return EnumC79546VJu.OFFLINE.getValue();
    }

    public static final String LJIILL(Aweme aweme) {
        String language;
        if (aweme == null) {
            return "";
        }
        if (LJIIIIZZ(aweme) != null) {
            CaptionItemModel LJIIIIZZ = LJIIIIZZ(aweme);
            if (LJIIIIZZ == null || (language = LJIIIIZZ.getLanguageName()) == null) {
                return "";
            }
        } else {
            AutocaptionType LJII = LJII(aweme);
            if (LJII == null || (language = LJII.getLanguage()) == null) {
                return "";
            }
        }
        return language;
    }

    public static final int LJIJI(Aweme aweme) {
        Y0N y0n;
        C84540XFw c84540XFw;
        if (aweme == null) {
            return 0;
        }
        if (!C41032G8m.LIZ()) {
            if (!LJFF().LJIIIIZZ(aweme)) {
                return 0;
            }
            if ((Y04.LIZLLL(aweme) == null && !LJIJ().LJIILJJIL(aweme, LJIJ().LJJIIZI())) || !((ITranslationKevaService) LIZIZ.getValue()).LJ()) {
                return 0;
            }
        } else {
            if (LJJIII(aweme) && !Y04.LIZIZ(aweme) && AK4.LIZ().LJJIIZI()) {
                return -1;
            }
            Y1Y LJIJI = LJIJ().LJIJI(aweme);
            if (!(LJIJI instanceof Y0N) || (y0n = (Y0N) LJIJI) == null || (c84540XFw = y0n.LJFF) == null || !c84540XFw.LIZIZ) {
                return 0;
            }
        }
        return 1;
    }

    public static final Integer LJIJJ(Aweme aweme) {
        Video video;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return null;
        }
        return Integer.valueOf(video.getVideoLength());
    }

    public static final boolean LJIJJLI(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        if (aweme == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
            if (interactStickerStruct.getType() == 20) {
                if (interactStickerStruct == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIL(Aweme aweme) {
        boolean z;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean LJJ(Aweme aweme) {
        CaptionItemModel LJIIIIZZ;
        Long valueOf;
        if (aweme == null || (LJIIIIZZ = LJIIIIZZ(aweme)) == null || (valueOf = Long.valueOf(LJIIIIZZ.getClaSubtitleId())) == null || valueOf.longValue() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJI(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        Long creatorEditedCaptionId;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (creatorEditedCaptionId = captionModel.getCreatorEditedCaptionId()) == null || creatorEditedCaptionId.longValue() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIFFI(Aweme aweme) {
        if (LJIL(aweme) || (aweme != null && LJII(aweme) != null)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(Aweme aweme) {
        Audio audio;
        List<TtsInfos> ttsInfos;
        if (aweme != null && (audio = aweme.getAudio()) != null && (ttsInfos = audio.getTtsInfos()) != null && ORZ.LJLLLL(ttsInfos) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(Aweme aweme) {
        if (LJIIIIZZ(aweme) != null || LJFF().LIZJ(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJ(Aweme aweme) {
        if (C53379KxD.LIZ() && aweme != null && (LJIIIIZZ(aweme) != null || (aweme != null && Y04.LIZLLL(aweme) != null))) {
            return true;
        }
        return false;
    }

    public static boolean LJJIIJZLJL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (LJIIIIZZ(aweme) == null) {
            if (o.LJ(LIZIZ(aweme), Boolean.TRUE)) {
                return false;
            }
            return true;
        }
        return o.LJ(LIZ(aweme), Boolean.FALSE);
    }

    public static final boolean LJJIIZ(Aweme aweme) {
        String str;
        String curUserId = ((IAccountService) LIZLLL.getValue()).LJFF().getCurUserId();
        if (aweme == null || (str = aweme.getAuthorUid()) == null) {
            str = "";
        }
        return curUserId.equals(str);
    }

    public static final boolean LJJIJIIJI(Aweme aweme) {
        if (aweme == null || !LJJIIZ(aweme)) {
            return false;
        }
        if (!LJJI(aweme) && !LJJ(aweme)) {
            return false;
        }
        if (LJIIIIZZ(aweme) != null && !AK4.LIZ().LJJIJIIJIL(aweme.getAid())) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(Aweme aweme) {
        if (aweme == null || !LJJIIZ(aweme) || !LJJI(aweme) || !LJJ(aweme) || AK4.LIZ().LJJIJIIJIL(aweme.getAid())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean LJJIJIL(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Boolean r1 = LIZ(r4)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r3 = 1
            if (r0 != 0) goto L4b
            boolean r0 = X.C53150KtW.LIZ()
            if (r0 == 0) goto L54
            java.lang.String[] r1 = LJI()
            java.lang.String r0 = r4.getTextStickerMajorityLang()
            boolean r0 = X.ORY.LJJIJIIJIL(r0, r1)
            if (r0 == 0) goto L54
            r2 = 1
        L26:
            boolean r0 = X.C53150KtW.LIZ()
            if (r0 == 0) goto L52
            java.lang.String[] r1 = LJI()
            java.lang.String r0 = X.C2058886e.LIZJ(r4)
            boolean r0 = X.ORY.LJJIJIIJIL(r0, r1)
            if (r0 == 0) goto L52
            r1 = 1
        L3b:
            boolean r0 = X.Y02.LJ(r4)
            if (r0 == 0) goto L43
            if (r2 == 0) goto L4b
        L43:
            boolean r0 = X.C2058886e.LIZ(r4)
            if (r0 == 0) goto L50
            if (r1 != 0) goto L50
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L50:
            r3 = 0
            goto L4b
        L52:
            r1 = 0
            goto L3b
        L54:
            r2 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86670Xzu.LJJIJIL(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.Boolean");
    }

    public static final String LIZLLL(Aweme aweme, boolean z) {
        CaptionItemModel LJIIIIZZ;
        String languageName;
        CaptionItemModel LIZLLL2;
        if (!z) {
            if (aweme == null) {
                return "";
            }
            if (Y04.LIZLLL(aweme) != null) {
                if (aweme == null || (LIZLLL2 = Y04.LIZLLL(aweme)) == null || (languageName = LIZLLL2.getLanguageName()) == null) {
                    return "";
                }
                return languageName;
            }
        }
        if (aweme == null || (LJIIIIZZ = LJIIIIZZ(aweme)) == null || (languageName = LJIIIIZZ.getLanguageName()) == null) {
            return "";
        }
        return languageName;
    }

    public static final int LJIILLIIL(Aweme aweme, boolean z) {
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> captionList;
        Long l;
        CaptionModel captionModel2;
        CaptionLanguage originalCaptionLanguage;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || captionList.isEmpty()) {
            return 0;
        }
        Video video2 = aweme.getVideo();
        if (video2 != null && (captionModel2 = video2.getCaptionModel()) != null && (originalCaptionLanguage = captionModel2.getOriginalCaptionLanguage()) != null) {
            l = Long.valueOf(originalCaptionLanguage.getLanguageId());
        } else {
            l = null;
        }
        Iterator<CaptionItemModel> it = captionList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CaptionItemModel next = it.next();
            long languageId = next.getLanguageId();
            if (l == null || languageId != l.longValue() || !z) {
                long languageId2 = next.getLanguageId();
                if (l == null || languageId2 != l.longValue()) {
                    if (z) {
                    }
                }
            }
            try {
                return CastIntegerProtector.parseInt(next.getVersionType());
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static EnumC86688Y0m LJIIZILJ(EnumC86688Y0m enumC86688Y0m, InterfaceC88472Yns callback) {
        int i;
        o.LJIIIZ(callback, "callback");
        if (enumC86688Y0m == null) {
            i = -1;
        } else {
            i = Y10.LIZ[enumC86688Y0m.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    callback.invoke("Hidden expanded");
                    return EnumC86688Y0m.HIDDEN_EXPANDED;
                }
            } else {
                callback.invoke("Hidden collapsed");
                return EnumC86688Y0m.HIDDEN_COLLAPSED;
            }
        }
        if (i != 3) {
            if (i != 4) {
                callback.invoke("None");
                return EnumC86688Y0m.NONE;
            }
            callback.invoke("Collapsed");
            return EnumC86688Y0m.NONE;
        }
        callback.invoke("Collapsed");
        return EnumC86688Y0m.COLLAPSED;
    }
}
