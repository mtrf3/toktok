package Y;

import X.AI8;
import X.C145995oB;
import X.C188727au;
import X.C40975G6h;
import X.C44172HVg;
import X.C44384HbQ;
import X.C60903NvH;
import X.FMX;
import X.GUT;
import X.H7R;
import X.InterfaceC88471Ynr;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.CommentSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.DuetSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS141S0100000_7 implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS141S0100000_7(VideoPublishContainerScene videoPublishContainerScene, int i) {
        this.$t = i;
        this.l0 = videoPublishContainerScene;
    }

    public static final Object invoke$0(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        videoPublishContainerScene.LJZL.LIZ(videoPublishContainerScene, (AI8) obj2);
        return null;
    }

    public static final Object invoke$1(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        boolean z;
        boolean z2;
        VideoPublishEditModel videoPublishEditModel;
        MusicObject musicObject;
        boolean z3;
        final VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        AI8 ai8 = (AI8) obj2;
        videoPublishContainerScene.LLD = ai8;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishContainerScene.LLILZLL;
        final boolean z4 = true;
        if (videoPublishEditModel2 != null && ((C44384HbQ.LJLJJI(videoPublishEditModel2) && videoPublishContainerScene.LLILZLL.voiceVolume != 0.0f) || videoPublishContainerScene.LLILZLL.hasRecord())) {
            z = true;
            if (videoPublishContainerScene.getPublishPermission() == 0) {
                z2 = false;
                if (C40975G6h.LIZ() && (videoPublishEditModel = videoPublishContainerScene.LLILZLL) != null) {
                    musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
                    if (musicObject == null && !musicObject.isPgc) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((z && !z3) || videoPublishContainerScene.getPublishPermission() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!C44172HVg.LJIJ.isChildrenMode() || videoPublishContainerScene.LLILZLL.hasSubtitle() || !CrossLanguageUserExperiment.LIZJ().LIZIZ() || z2) {
                    ai8.setVisibility(8);
                } else {
                    z4 = false;
                    ai8.setVisibility(0);
                }
                videoPublishContainerScene.LL._checked.observe(videoPublishContainerScene, new Observer() { // from class: X.G60
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj3) {
                        int i;
                        VideoPublishContainerScene videoPublishContainerScene2 = VideoPublishContainerScene.this;
                        boolean z5 = z4;
                        Boolean bool = (Boolean) obj3;
                        AI8 ai82 = videoPublishContainerScene2.LLD;
                        if (ai82 != null && !z5) {
                            ai82.setVisibility(0);
                            ViewGroup.LayoutParams layoutParams = videoPublishContainerScene2.LLD.getLayoutParams();
                            if (bool.booleanValue()) {
                                i = -2;
                            } else {
                                i = 1;
                            }
                            layoutParams.height = i;
                            videoPublishContainerScene2.LLD.setLayoutParams(layoutParams);
                        }
                    }
                });
                return null;
            }
        } else {
            z = false;
        }
        z2 = true;
        if (C40975G6h.LIZ()) {
            musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
            if (musicObject == null) {
            }
            z3 = false;
            if (z) {
            }
            z2 = false;
        }
        if (!C44172HVg.LJIJ.isChildrenMode()) {
        }
        ai8.setVisibility(8);
        videoPublishContainerScene.LL._checked.observe(videoPublishContainerScene, new Observer() { // from class: X.G60
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj3) {
                int i;
                VideoPublishContainerScene videoPublishContainerScene2 = VideoPublishContainerScene.this;
                boolean z5 = z4;
                Boolean bool = (Boolean) obj3;
                AI8 ai82 = videoPublishContainerScene2.LLD;
                if (ai82 != null && !z5) {
                    ai82.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = videoPublishContainerScene2.LLD.getLayoutParams();
                    if (bool.booleanValue()) {
                        i = -2;
                    } else {
                        i = 1;
                    }
                    layoutParams.height = i;
                    videoPublishContainerScene2.LLD.setLayoutParams(layoutParams);
                }
            }
        });
        return null;
    }

    public static final Object invoke$2(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        int i;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        Boolean bool = (Boolean) obj2;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.LLZL(bool.booleanValue());
        boolean booleanValue = bool.booleanValue();
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        if (booleanValue) {
            i = 1;
        } else {
            i = 2;
        }
        repo.storeInt("USER_HD_VIDEO_SWITCH_SETTING", i);
        C44172HVg.LJIIJ.getClass();
        SharePrefCache.inst().hasShowHighQualityVideoTips().LIZLLL(Boolean.TRUE);
        C60903NvH.LJIIJJI().getPublishService().LJI();
        GUT.LIZ(videoPublishContainerScene.LLII(), "high_quality_setting_changed");
        return null;
    }

    public static final Object invoke$3(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        View view = (View) obj2;
        AddToPlaylistItemStatus addToPlaylistItemStatus = videoPublishContainerScene.LJZI;
        if (addToPlaylistItemStatus != null) {
            addToPlaylistItemStatus.bindView(view, videoPublishContainerScene);
            return null;
        }
        return null;
    }

    public static final Object invoke$4(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        View view = (View) obj2;
        CommentSettingItemStatus commentSettingItemStatus = videoPublishContainerScene.LJLLLL;
        if (commentSettingItemStatus != null) {
            commentSettingItemStatus.bindView(view, videoPublishContainerScene);
            return null;
        }
        return null;
    }

    public static final Object invoke$5(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        View view = (View) obj2;
        DuetSettingItemStatus duetSettingItemStatus = videoPublishContainerScene.LJLLLLLL;
        if (duetSettingItemStatus != null) {
            duetSettingItemStatus.bindView(view, videoPublishContainerScene);
            return null;
        }
        return null;
    }

    public static final Object invoke$6(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        View view = (View) obj2;
        StitchSettingItemStatus stitchSettingItemStatus = videoPublishContainerScene.LJLZ;
        if (stitchSettingItemStatus != null) {
            stitchSettingItemStatus.bindView(view, videoPublishContainerScene);
            return null;
        }
        return null;
    }

    public static final Object invoke$7(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        int i;
        String str;
        String str2;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        Boolean bool = (Boolean) obj2;
        videoPublishContainerScene.getClass();
        if (bool.booleanValue()) {
            i = 1;
        } else {
            i = 2;
        }
        videoPublishContainerScene.LLILZLL.creativeModel.privacySettingModel.allowCreateSticker = i;
        C60903NvH.LJIIJJI().LJJIL().setAllowCreateStickerChanged(true);
        C60903NvH.LJIIJJI().LJJIL().setAllowCreateStickerCurrent(i);
        C145995oB c145995oB = new C145995oB();
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.getCreationId();
        } else {
            str = "mModel is null";
        }
        c145995oB.LJI("creation_id", str);
        c145995oB.LJI("enter_from", "video_post_page");
        c145995oB.LJI("shoot_way", videoPublishContainerScene.LLILZLL.mShootWay);
        if (bool.booleanValue()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c145995oB.LJI("to_status", str2);
        FMX.LJIIL("change_sticker_status", c145995oB.LIZ);
        return null;
    }

    public static final Object invoke$8(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS141S0100000_7.l0;
        Boolean bool = (Boolean) obj2;
        videoPublishContainerScene.LLILZLL.creativeModel.ugcTemplateData.enablePublishAsTemplate = bool.booleanValue();
        VideoPublishEditModel model = videoPublishContainerScene.LLILZLL;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(model, "model");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", model.getCreationId());
        c188727au.LJIIIZ("enter_from", model.enterFrom);
        c188727au.LJIIIZ("shoot_way", model.mShootWay);
        c188727au.LJIIIZ("content_source", H7R.LJIIIIZZ(model));
        if (booleanValue) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("click_post_template", c188727au.LIZ);
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("select_publish_with_template_anchor", bool.booleanValue());
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("select_publish_with_template_anchor_clicked", true);
        return null;
    }

    public static final Object invoke$9(AObjectS141S0100000_7 aObjectS141S0100000_7, Object obj, Object obj2) {
        ((VideoPublishContainerScene) aObjectS141S0100000_7.l0).LLIFFJFJJ = (AI8) obj2;
        return null;
    }
}
