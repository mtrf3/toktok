package com.ss.android.ugc.aweme.services;

import X.C00F;
import X.C10K;
import X.C151975xp;
import X.C152345yQ;
import X.C162476Zf;
import X.C16880lQ;
import X.C173186qw;
import X.C19N;
import X.C26223AQx;
import X.C31461Li;
import X.C40944G5c;
import X.C40983G6p;
import X.C41610GUs;
import X.C44172HVg;
import X.C44296Ha0;
import X.C44531Hdn;
import X.C44690HgM;
import X.C44739Hh9;
import X.C44741HhB;
import X.C44809HiH;
import X.C44810HiI;
import X.C44812HiK;
import X.C44825HiX;
import X.C44839Hil;
import X.C44840Him;
import X.C44841Hin;
import X.C44842Hio;
import X.C46125I8j;
import X.C60903NvH;
import X.C6FR;
import X.C6WA;
import X.C78934UyQ;
import X.EnumC44843Hip;
import X.HJD;
import X.HLX;
import X.InterfaceC44948HkW;
import X.J9A;
import X.L2F;
import android.text.TextUtils;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.property.SharePostSettingsObject;
import com.ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEVersionUtil;
import defpackage.e1;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AVSettingsServiceImpl implements IAVSettingsService {
    public static AVSettingsServiceImpl sInstance = new AVSettingsServiceImpl();

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableFeedbackLog() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableLightningPrivacySetting() {
        return C151975xp.LIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableNowsSelfieWindowGoldenRatio() {
        return e1.LIZ(31744, "now_make_selfie_taking_easier_selfie_window_golden_ratio", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableStitch() {
        return e1.LIZ(31744, "studio_enable_stitch", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getMvThemeRecordMode() {
        return e1.LIZ(31744, "mv_theme_mode_switch", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getPublishProgressOptimize() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableUseVEGetThumbs() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableVideoEditActivityUploadSpeedProbe() {
        return e1.LIZ(31744, "enable_video_edit_activity_upload_speed_probe", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isPhotoEditEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean needLoginBeforeRecord() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean shareVideo2GifEditable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showDuetWithReact() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showMvThemeRecordMode() {
        return e1.LIZ(31744, "mv_theme_mode_switch", true, false);
    }

    private void asyncMonitorAwemeSetting() {
        C10K.LIZJ(new Callable() { // from class: X.HiJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AVSettingsServiceImpl.lambda$asyncMonitorAwemeSetting$0();
            }
        });
    }

    private boolean isInTikTokRegion() {
        if (C78934UyQ.LJLIL.getRegionService() != null && C44296Ha0.LIZIZ().booleanValue()) {
            return true;
        }
        return false;
    }

    public static Void lambda$asyncMonitorAwemeSetting$0() {
        try {
            SettingsManager.LIZLLL().getClass();
            int i = 0;
            C44741HhB.LIZIZ(SettingsManager.LJ("beauty_model", 0), "filter", "");
            SettingsManager.LIZLLL().getClass();
            C44741HhB.LIZIZ(SettingsManager.LJ("use_hardcode", 0), "hard_code_shot", "");
            SettingsManager.LIZLLL().getClass();
            C44741HhB.LIZIZ(SettingsManager.LJ("use_synthetic_hardcode", 0), "hard_code_release", "");
            C60903NvH.LJIIJJI().getPublishService().LIZJ();
            if (C41610GUs.LIZ()) {
                i = 1;
            }
            C44741HhB.LIZIZ(i, "hard_code_water_marker", "");
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public HLX<Boolean> bubbleGuideShown() {
        return new HLX<Boolean>() { // from class: com.ss.android.ugc.aweme.services.AVSettingsServiceImpl.1
            /* renamed from: get, reason: merged with bridge method [inline-methods] */
            public Boolean m151get() {
                return Boolean.valueOf(C60903NvH.LJIIJJI().LJJIL().getBubbleGuideShown(false));
            }

            public void set(Boolean bool) {
                C60903NvH.LJIIJJI().LJJIL().setBubbleGuideShown(bool.booleanValue());
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean clickAnchorLandingAlbumDirectly() {
        if (C173186qw.LIZ == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableModelFileOnlyEnv() {
        return e1.LIZ(31744, "model_file_test_env", true, true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableOpenStopVideoPlayerOpti() {
        return InterfaceC44948HkW.LJI.isOpenStopVideoPlayerOpti();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableReeditPostedDraftInSharePanel() {
        if (C00F.LIZ(31744, 0, "studio_enable_reedit_on_share_panel", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableReleaseVideoPlayerOpt() {
        if (((Number) C44825HiX.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveOwnVideoWithoutWatermask() {
        if (C40983G6p.LIZ == 1) {
            return true;
        }
        if (C40983G6p.LIZ() && !C40944G5c.LIZ.getBoolean("has_water_mark", false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSharePanelTuxDialogRefactor() {
        if (C00F.LIZ(31744, 0, "studio_share_panel_tuxdialog_refactor", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableShowCutsameAnchor() {
        return e1.LIZ(31744, "enable_anchor_cutsame", true, false);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableShowMvAnchor() {
        return e1.LIZ(31744, "enable_anchor_mv", true, true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableTaskDegradationOpti() {
        return InterfaceC44948HkW.LJI.isOpenTaskDegradationOpti();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncIns() {
        return C19N.LJ("enable_upload_sync_ins", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncInsStory() {
        return C19N.LJ("enable_upload_sync_ins_story", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncTwitter() {
        return C19N.LJ("enable_upload_sync_twitter", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String[] getSharePostEffectIds() {
        SharePostSettingsObject sharePostSettingsObject;
        C44812HiK.LIZ.getClass();
        try {
            sharePostSettingsObject = (SharePostSettingsObject) SettingsManager.LIZLLL().LJIIIIZZ("share_post", SharePostSettingsObject.class, null);
        } catch (Throwable unused) {
            sharePostSettingsObject = new SharePostSettingsObject();
        }
        if (sharePostSettingsObject == null) {
            sharePostSettingsObject = new SharePostSettingsObject();
        }
        String[] strArr = sharePostSettingsObject.effectIDs;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getStickerArtistIconUrl() {
        return C31461Li.LIZJ("sticker_artist_icon_url", "", "getInstance().getStringV…rtistIconUrl::class.java)");
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isDuetAutoApplyEffectEnabled() {
        if (C00F.LIZ(31744, 0, "auto_apply_effect_in_duet", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isPrivateAvailable() {
        return C19N.LJ("private_available", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public long progressBarThreshold() {
        return J9A.LIZIZ(" progressbar_threshold", 30000L);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean downloadEffectOrMusicAfterEnterCamera() {
        if (C44810HiI.LIZ() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableFrontFlash() {
        return L2F.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableOpenAlbumExcludeNewUser() {
        if (C44809HiH.LIZ() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableOpenAlbumForAll() {
        if (C44809HiH.LIZ() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableQaSticker() {
        return C6FR.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveDraftAfterPosting() {
        return C26223AQx.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveUploadVideo() {
        return C44739Hh9.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getEffectVersion() {
        return EffectSDKBuildConfig.getAarVersion();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getLongVideoPermittedValue() {
        return C44690HgM.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getShieldTemplateExp() {
        return HJD.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getVESDKVersion() {
        return VEVersionUtil.getVESDKVersion();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableGetThumbsWithEffect() {
        return C6WA.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isLongVideoPermitted() {
        if (C44690HgM.LIZ() && C44531Hdn.LIZ() > LivePlayEnforceIntervalSetting.DEFAULT) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public long longVideoThresholdWithTolerance() {
        return C152345yQ.LIZ() + 1000;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean optPermission() {
        return C46125I8j.LIZIZ();
    }

    public static AVSettingsServiceImpl getInstance() {
        return sInstance;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void updateABTestModel(m mVar) {
        Object valueOf;
        p LJJIJL;
        p LJJIJL2;
        m LJJIJIL = mVar.LJJIJIL("data");
        if (LJJIJIL == null) {
            return;
        }
        C44839Hil c44839Hil = C44172HVg.LJJII;
        c44839Hil.getClass();
        C44840Him c44840Him = c44839Hil.LIZIZ;
        synchronized (c44840Him) {
            c44840Him.LIZIZ.clear();
            c44840Him.LIZ.edit().clear().apply();
        }
        Map<String, VEConfigCenter.ValuePkt> configs = VEConfigCenter.getInstance().getConfigs();
        o.LJIIIIZZ(configs, "getInstance().configs");
        for (Map.Entry<String, VEConfigCenter.ValuePkt> entry : configs.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey()) && LJJIJIL.LJJIJLIJ(entry.getKey())) {
                String key = entry.getKey();
                o.LJIIIIZZ(key, "it.key");
                String str = key;
                VEConfigCenter.ValuePkt value = entry.getValue();
                o.LJIIIIZZ(value, "it.value");
                C44841Hin c44841Hin = new C44841Hin(str, value);
                EnumC44843Hip type = c44841Hin.type();
                if (type != null) {
                    int i = C44842Hio.LIZ[type.ordinal()];
                    boolean z = false;
                    int i2 = 0;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        try {
                                            p LJJIJL3 = LJJIJIL.LJJIJL(str);
                                            if (LJJIJL3 != null) {
                                                valueOf = LJJIJL3.LJJIFFI();
                                                o.LJIIIIZZ(valueOf, "primitive.asString");
                                            }
                                        } catch (Exception e) {
                                            C16880lQ.LLLLIIL(e);
                                        }
                                        valueOf = "";
                                    }
                                } else {
                                    float floatValue = ((Float) c44841Hin.LIZ()).floatValue();
                                    try {
                                        p LJJIJL4 = LJJIJIL.LJJIJL(str);
                                        if (LJJIJL4 != null) {
                                            floatValue = LJJIJL4.LJIIJ();
                                        }
                                    } catch (Exception e2) {
                                        C16880lQ.LLLLIIL(e2);
                                    }
                                    valueOf = Float.valueOf(floatValue);
                                }
                            } else {
                                long longValue = ((Long) c44841Hin.LIZ()).longValue();
                                try {
                                    p LJJIJL5 = LJJIJIL.LJJIJL(str);
                                    if (LJJIJL5 != null) {
                                        longValue = LJJIJL5.LJIJJLI();
                                    }
                                } catch (Exception e3) {
                                    C16880lQ.LLLLIIL(e3);
                                }
                                valueOf = Long.valueOf(longValue);
                            }
                        } else {
                            int intValue = ((Integer) c44841Hin.LIZ()).intValue();
                            try {
                                LJJIJL2 = LJJIJIL.LJJIJL(str);
                            } catch (Exception e4) {
                                C16880lQ.LLLLIIL(e4);
                            }
                            if (LJJIJL2 != null) {
                                if (LJJIJL2.LJLIL instanceof Boolean) {
                                    if (LJJIJL2.LJFF()) {
                                        i2 = 1;
                                    }
                                } else {
                                    i2 = LJJIJL2.LJIILJJIL();
                                }
                                valueOf = Integer.valueOf(i2);
                            }
                            i2 = intValue;
                            valueOf = Integer.valueOf(i2);
                        }
                    } else {
                        boolean booleanValue = ((Boolean) c44841Hin.LIZ()).booleanValue();
                        try {
                            LJJIJL = LJJIJIL.LJJIJL(str);
                        } catch (Exception e5) {
                            C16880lQ.LLLLIIL(e5);
                        }
                        if (LJJIJL != null) {
                            if (LJJIJL.LJLIL instanceof Number) {
                                if (LJJIJL.LJIL().intValue() == 1) {
                                    z = true;
                                }
                            } else {
                                z = LJJIJL.LJFF();
                            }
                            valueOf = Boolean.valueOf(z);
                        }
                        z = booleanValue;
                        valueOf = Boolean.valueOf(z);
                    }
                    C44840Him c44840Him2 = c44839Hil.LIZIZ;
                    EnumC44843Hip type2 = c44841Hin.type();
                    if (type2 != null) {
                        int i3 = C44842Hio.LIZ[type2.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        if (i3 == 5) {
                                            o.LJII(valueOf, "null cannot be cast to non-null type kotlin.String");
                                            c44840Him2.LJIIIZ(c44841Hin, (String) valueOf);
                                        }
                                    } else {
                                        o.LJII(valueOf, "null cannot be cast to non-null type kotlin.Float");
                                        c44840Him2.LJI(c44841Hin, ((Float) valueOf).floatValue());
                                    }
                                } else {
                                    o.LJII(valueOf, "null cannot be cast to non-null type kotlin.Long");
                                    c44840Him2.LJIIIIZZ(c44841Hin, ((Long) valueOf).longValue());
                                }
                            } else {
                                o.LJII(valueOf, "null cannot be cast to non-null type kotlin.Int");
                                c44840Him2.LJII(c44841Hin, ((Integer) valueOf).intValue());
                            }
                        } else {
                            o.LJII(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
                            c44840Him2.LJFF(c44841Hin, ((Boolean) valueOf).booleanValue());
                        }
                    }
                }
                throw new C162476Zf();
            }
        }
        C44741HhB c44741HhB = C44741HhB.LIZ;
        C44741HhB.LIZJ = true;
        c44741HhB.LIZ();
    }

    public void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        if (C44690HgM.LIZ()) {
            C44690HgM.LIZ();
        }
        C44741HhB c44741HhB = C44741HhB.LIZ;
        C44741HhB.LIZIZ = true;
        c44741HhB.LIZ();
        asyncMonitorAwemeSetting();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void setDefaultFilterForCamera(int i, int i2) {
        if (i == 0) {
            C60903NvH.LJIIJJI().LJJIL().setBackCameraFilter(i2);
        } else {
            C60903NvH.LJIIJJI().LJJIL().setFrontCameraFilter(i2);
        }
    }
}
