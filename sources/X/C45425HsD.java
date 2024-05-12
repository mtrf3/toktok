package X;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusConfig;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusLabels;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusMedia;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusTimePeriod;
import com.ss.android.ugc.aweme.specialplus.SpecialPlusTips;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.e1;
import defpackage.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HsD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45425HsD implements ISpecialPlusService {
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C45430HsI.LJLIL);
    public SpecialPlusConfig LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public boolean LJFF;
    public C45427HsF LJI;
    public boolean LJII;
    public final C36478ETi LIZ = new C36478ETi();
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";

    public final void LIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = C45428HsG.LIZ();
            initCallBack();
        }
        boolean LIZ = C45429HsH.LIZ();
        this.LIZLLL = LIZ;
        boolean z = false;
        if (!LIZ) {
            try {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("enable_special_plus", false)) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
        }
        this.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final int getMaxTransformationsLimit() {
        return C00F.LIZ(31744, 0, "studio_flip_shoot_icon_total_impression_per_day", true);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final long getQuickPromoPlusDebutTime() {
        return this.LIZ.LIZ.getLong("quick_promo_plus_shown_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final int getTransformationsLimitPerEffect() {
        return C00F.LIZ(31744, 0, "studio_flip_shoot_icon_effect_impression_per_day", true);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void initCallBack() {
        C45427HsF c45427HsF = new C45427HsF(this);
        this.LJI = c45427HsF;
        C41877Gc5.LIZ.LIZLLL(c45427HsF);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isEffectVideoPlusEnabled() {
        if (e1.LIZ(31744, "studio_flip_shoot_icon", true, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isEffectVideoPlusUnlimitedTransformations() {
        if (e1.LIZ(31744, "studio_flip_shoot_icon_unlimited_transformations", true, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isNeedShowSpecialPlusDirect() {
        SpecialPlusConfig specialPlusConfig;
        if (C44172HVg.LJIJ.isChildrenMode()) {
            return false;
        }
        LIZ();
        if ((!this.LIZJ && !this.LIZLLL) || (specialPlusConfig = this.LIZIZ) == null) {
            return false;
        }
        if (this.LIZ.LIZ.getInt("special_plus_showed_config_version", 0) != specialPlusConfig.getVersion()) {
            return false;
        }
        return shouldShowSpecialPlus();
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean shouldResetTransformationsMap() {
        boolean z;
        long j = 86400000;
        if (this.LIZ.LIZ.getLong("effect_video_plus_counts_last_reset_time", 0L) / j == System.currentTimeMillis() / j) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean shouldShowSpecialPlus() {
        long j;
        boolean z;
        int i;
        int i2;
        String str;
        float f;
        SpecialPlusTimePeriod[] validTime;
        long j2;
        String resourceType;
        String charSequence;
        if (C44172HVg.LJIJ.isChildrenMode()) {
            return false;
        }
        LIZ();
        if ((!this.LIZJ && !this.LIZLLL) || this.LIZIZ == null) {
            return false;
        }
        boolean shieldTemplateExp = AVExternalServiceImpl.LIZ().configService().avsettingsConfig().getShieldTemplateExp();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        String str2 = null;
        if (specialPlusConfig != null && (resourceType = specialPlusConfig.getResourceType()) != null && (charSequence = s.LJZI(resourceType).toString()) != null) {
            str2 = charSequence.toLowerCase();
            o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase()");
        }
        if (ujb.o.LJJJJIZL(str2, "template", false) && shieldTemplateExp) {
            return false;
        }
        SpecialPlusConfig specialPlusConfig2 = this.LIZIZ;
        if (specialPlusConfig2 != null && specialPlusConfig2.getVersion() == this.LIZ.LIZ.getInt("special_plus_config_version", -1)) {
            C45427HsF c45427HsF = this.LJI;
            if (c45427HsF != null) {
                C41877Gc5.LIZ.LJ(c45427HsF);
            }
            return false;
        }
        SpecialPlusConfig specialPlusConfig3 = this.LIZIZ;
        if (specialPlusConfig3 == null || (validTime = specialPlusConfig3.getValidTime()) == null || validTime.length == 0) {
            j = 0;
        } else {
            j = System.currentTimeMillis() / 1000;
            for (SpecialPlusTimePeriod specialPlusTimePeriod : validTime) {
                long j3 = -1;
                try {
                    long parseLong = CastLongProtector.parseLong(specialPlusTimePeriod.getStart());
                    try {
                        j3 = CastLongProtector.parseLong(specialPlusTimePeriod.getEnd());
                    } catch (NumberFormatException unused) {
                    }
                    j2 = j3;
                    j3 = parseLong;
                } catch (NumberFormatException unused2) {
                    j2 = -1;
                }
                if (j3 <= j && j <= j2) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.LIZ.LIZ.storeLong("quick_promo_plus_shown_time", 0L);
            C45427HsF c45427HsF2 = this.LJI;
            if (c45427HsF2 != null) {
                C41877Gc5.LIZ.LJ(c45427HsF2);
            }
            return false;
        }
        C36478ETi c36478ETi = this.LIZ;
        SpecialPlusConfig specialPlusConfig4 = this.LIZIZ;
        if (specialPlusConfig4 != null) {
            i = specialPlusConfig4.getVersion();
        } else {
            i = 0;
        }
        if (c36478ETi.LIZ.getInt("special_plus_showed_config_version", 0) != i) {
            this.LIZ.LIZ.storeLong("quick_promo_plus_shown_time", 0L);
        }
        float f2 = 0.0f;
        if (this.LIZLLL && this.LIZ.LIZ.getLong("quick_promo_plus_shown_time", 0L) != 0) {
            float f3 = (float) (j - this.LIZ.LIZ.getLong("quick_promo_plus_shown_time", 0L));
            SpecialPlusConfig specialPlusConfig5 = this.LIZIZ;
            if (specialPlusConfig5 != null) {
                f = specialPlusConfig5.getAppearance_period_in_hours();
            } else {
                f = 0.0f;
            }
            if (f3 >= f * 3600) {
                C45427HsF c45427HsF3 = this.LJI;
                if (c45427HsF3 != null) {
                    C41877Gc5.LIZ.LJ(c45427HsF3);
                }
                return false;
            }
        }
        if (this.LIZLLL && (i2 = this.LIZ.LIZ.getInt("last_os_process_id", 0)) != 0) {
            if (i2 != Process.myPid()) {
                this.LJ = this.LIZ.LIZ.getLong("quick_promo_plus_app_terminated_time", 0L);
            }
            long currentTimeMillis = (System.currentTimeMillis() / 1000) - this.LJ;
            SpecialPlusConfig specialPlusConfig6 = this.LIZIZ;
            if (specialPlusConfig6 != null) {
                f2 = specialPlusConfig6.getCool_down_period_in_hours();
            }
            if (((float) currentTimeMillis) <= f2 * 3600) {
                return false;
            }
        }
        SpecialPlusConfig LIZ = C45428HsG.LIZ();
        if (LIZ == null) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C45426HsE.LIZ);
        LIZ2.append(File.separator);
        LIZ2.append(C45426HsE.LIZ(LIZ));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (!C44687HgJ.LIZIZ(LIZIZ)) {
            return false;
        }
        String LJFF = C173376rF.LJFF(new File(LIZIZ));
        String md5 = LIZ.getPlusIcon().getMd5();
        if (TextUtils.isEmpty(md5) || !TextUtils.equals(LJFF, md5)) {
            return false;
        }
        C36478ETi c36478ETi2 = C45426HsE.LIZIZ;
        Effect LIZIZ2 = c36478ETi2.LIZIZ();
        if (LIZIZ2 == null || (str = LIZIZ2.getUnzipPath()) == null) {
            str = "";
        }
        if (!C44687HgJ.LIZIZ(str) || c36478ETi2.LIZ.getInt("special_plus_effect_version", 0) != LIZ.getVersion()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getEffectId() {
        SpecialPlusLabels labels;
        String[] effectIds;
        String str;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig == null || (labels = specialPlusConfig.getLabels()) == null || (effectIds = labels.getEffectIds()) == null || effectIds.length == 0 || (str = effectIds[0]) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getIconType() {
        SpecialPlusMedia plusIcon;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig != null && (plusIcon = specialPlusConfig.getPlusIcon()) != null) {
            return plusIcon.getUrl();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getResourceType() {
        String str;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig != null) {
            str = specialPlusConfig.getResourceType();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return "effect";
        }
        String lowerCase = s.LJZI(str).toString().toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final List<String> getSpecialPlusEffectList() {
        SpecialPlusLabels labels;
        String[] eligibleEffectIds;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig != null && (labels = specialPlusConfig.getLabels()) != null && (eligibleEffectIds = labels.getEligibleEffectIds()) != null) {
            return C61898ORa.LJIILL(eligibleEffectIds);
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getSpecialPlusTips() {
        SpecialPlusTips tips;
        String tryTip;
        LIZ();
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig == null || (tips = specialPlusConfig.getTips()) == null || (tryTip = tips.getTryTip()) == null) {
            return "";
        }
        return tryTip;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isQuickPromoPlusEnabled() {
        return C45429HsH.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusClicked() {
        int i;
        LIZ();
        C36478ETi c36478ETi = this.LIZ;
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig != null) {
            i = specialPlusConfig.getVersion();
        } else {
            i = 0;
        }
        c36478ETi.LIZ.storeInt("special_plus_config_version", i);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusShowed() {
        int i;
        LIZ();
        C36478ETi c36478ETi = this.LIZ;
        SpecialPlusConfig specialPlusConfig = this.LIZIZ;
        if (specialPlusConfig != null) {
            i = specialPlusConfig.getVersion();
        } else {
            i = 0;
        }
        c36478ETi.LIZ.storeInt("special_plus_showed_config_version", i);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getEffectVideoPlusEffectId() {
        return this.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getEffectVideoPlusTab() {
        return this.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isEffectVideoPlusShowed() {
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final HashMap<String, Integer> getTransformationsCountMap(String tab) {
        o.LJIIIZ(tab, "tab");
        if (o.LJ(tab, "homepage_hot")) {
            return this.LIZ.LIZ(tab);
        }
        if (o.LJ(tab, "homepage_follow")) {
            return this.LIZ.LIZ(tab);
        }
        return new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void preDownloadSuperEntranceRes(Context context) {
        long j;
        String str;
        String[] effectIds;
        String str2;
        o.LJIIIZ(context, "context");
        H7B.LIZ("SpecialPlus, downloadSpecialPlusRes start");
        SpecialPlusConfig LIZ = C45428HsG.LIZ();
        if (LIZ == null) {
            return;
        }
        SpecialPlusTimePeriod[] validTime = LIZ.getValidTime();
        if (validTime.length != 0 && (!false)) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (SpecialPlusTimePeriod specialPlusTimePeriod : validTime) {
                try {
                    j = CastLongProtector.parseLong(specialPlusTimePeriod.getEnd());
                } catch (NumberFormatException unused) {
                    j = -1;
                }
                if (currentTimeMillis <= j) {
                    H7B.LIZ("SpecialPlus, downloadSpecialPlusIconUrl start");
                    String url = LIZ.getPlusIcon().getUrl();
                    String md5 = LIZ.getPlusIcon().getMd5();
                    if (TextUtils.isEmpty(url) || TextUtils.isEmpty(md5)) {
                        H7B.LIZ("SpecialPlus, downloadSpecialPlusIconUrl iconUrl or iconMd5 isEmpty");
                    } else {
                        String LIZ2 = C45426HsE.LIZ(LIZ);
                        StringBuilder LIZ3 = X1D.LIZ();
                        String str3 = C45426HsE.LIZ;
                        LIZ3.append(str3);
                        String LJFF = JBR.LJFF(LIZ3, File.separator, LIZ2, LIZ3);
                        if (C44687HgJ.LIZIZ(LJFF)) {
                            String LJFF2 = C173376rF.LJFF(new File(LJFF));
                            if (TextUtils.isEmpty(md5) || TextUtils.equals(LJFF2, md5)) {
                                H7B.LIZ("SpecialPlus, downloadSpecialPlusIconUrl icon do not need to be downloaded");
                            }
                        }
                        H7B.LIZ("SpecialPlus, downloadSpecialPlusIconUrl icon need download and start download");
                        DownloadTask with = C84261X5d.with(context);
                        with.url(url);
                        with.name(LIZ2);
                        with.savePath(str3);
                        with.force(true);
                        with.mainThreadListener(new C42373Gk5());
                        with.download();
                    }
                    H7B.LIZ("SpecialPlus, downloadSticker start");
                    C36478ETi c36478ETi = C45426HsE.LIZIZ;
                    Effect LIZIZ = c36478ETi.LIZIZ();
                    if (LIZIZ == null || (str = LIZIZ.getUnzipPath()) == null) {
                        str = "";
                    }
                    if (C44687HgJ.LIZIZ(str) && c36478ETi.LIZ.getInt("special_plus_effect_version", 0) == LIZ.getVersion()) {
                        H7B.LIZ("SpecialPlus, downloadSticker sticker do not need to be downloaded");
                        return;
                    }
                    int version = LIZ.getVersion();
                    C72242sW c72242sW = new C72242sW();
                    c72242sW.element = System.currentTimeMillis();
                    SpecialPlusLabels labels = LIZ.getLabels();
                    if (labels == null || (effectIds = labels.getEffectIds()) == null || effectIds.length == 0 || (str2 = effectIds[0]) == null || !(true ^ TextUtils.isEmpty(str2))) {
                        return;
                    }
                    H7B.LIZ("SpecialPlus, downloadSticker sticker need download and start download");
                    C42447GlH c42447GlH = new C42447GlH(version, c72242sW);
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    Application application = C44172HVg.LIZ;
                    o.LJIIIIZZ(application, "application");
                    InterfaceC84498XEg LIZ4 = C84488XDw.LIZ(application, null);
                    C44172HVg.LIZJ();
                    x1.LIZ = LIZ4;
                    x1.a aVar = x1.LIZIZ;
                    if (aVar.LJLIL == null) {
                        aVar.LJLIL = EffectService.Companion.getInstance();
                    }
                    EffectService effectService = aVar.LJLIL;
                    if (effectService == null) {
                        return;
                    }
                    effectService.fetchEffectWithMusicBind(x1.LIZ, str2, "", c42447GlH);
                    return;
                }
            }
        }
        H7B.LIZ("SpecialPlus, downloadSpecialPlusRes configuration is expired");
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setEffectVideoPlusEffectId(String effectId) {
        o.LJIIIZ(effectId, "effectId");
        this.LJIIIZ = effectId;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setEffectVideoPlusShowed(boolean z) {
        this.LJII = z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setEffectVideoPlusTab(String tab) {
        o.LJIIIZ(tab, "tab");
        this.LJIIIIZZ = tab;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setLastTransformationDate(long j) {
        this.LIZ.LIZ.storeLong("effect_video_plus_counts_last_reset_time", j);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setQuickPromoPlusDebutTime(long j) {
        this.LIZ.LIZ.storeLong("quick_promo_plus_shown_time", j);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusState(boolean z) {
        this.LJFF = z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isTransformationLimitHit(String effectId, String tab) {
        boolean z;
        boolean z2;
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(tab, "tab");
        if (isEffectVideoPlusUnlimitedTransformations()) {
            return false;
        }
        if (shouldResetTransformationsMap()) {
            C36478ETi c36478ETi = this.LIZ;
            c36478ETi.getClass();
            c36478ETi.LIZLLL(new HashMap<>(), "homepage_hot");
            c36478ETi.LIZLLL(new HashMap<>(), "homepage_follow");
            c36478ETi.LIZJ("homepage_hot", new ArrayList());
            c36478ETi.LIZJ("homepage_follow", new ArrayList());
        }
        HashMap<String, Integer> transformationsCountMap = getTransformationsCountMap(tab);
        int i = 0;
        for (Integer countForCurrentEffect : transformationsCountMap.values()) {
            o.LJIIIIZZ(countForCurrentEffect, "countForCurrentEffect");
            i += countForCurrentEffect.intValue();
        }
        Integer num = transformationsCountMap.get(effectId);
        if (num == null) {
            num = 0;
        }
        o.LJIIIIZZ(num, "it[effectId] ?: 0");
        int intValue = num.intValue();
        int maxTransformationsLimit = getMaxTransformationsLimit();
        int transformationsLimitPerEffect = getTransformationsLimitPerEffect();
        if (i >= maxTransformationsLimit) {
            z = true;
        } else {
            z = false;
        }
        if (intValue >= transformationsLimitPerEffect) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setTransformationsCountMap(HashMap<String, Integer> map, String tab) {
        o.LJIIIZ(map, "map");
        o.LJIIIZ(tab, "tab");
        this.LIZ.LIZLLL(map, tab);
    }
}
