package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.common.MusicContent;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.IEditService;
import com.ss.android.ugc.aweme.services.external.ui.MultiVideoMedia;
import com.ss.android.ugc.aweme.services.external.ui.ShareConfig;
import com.ss.android.ugc.aweme.services.external.ui.VideoMedia;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HDb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43699HDb implements IEditService {
    public static Bundle LIZIZ(EditConfig editConfig, ShareConfig shareConfig) {
        Bundle bundle = new Bundle();
        AVChallenge challenge = editConfig.getChallenge();
        if (challenge != null) {
            bundle.putSerializable("av_challenge", challenge);
        }
        List<AVChallenge> list = C41658GWo.LIZLLL().LIZ;
        o.LJII(list, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("av_challenge_list", (Serializable) list);
        bundle.putString("shoot_way", editConfig.getShootway());
        bundle.putBoolean("is_from_sys_share", true);
        bundle.putString("extra_share_app_name", shareConfig.getAppName());
        bundle.putSerializable("extra_share_context", shareConfig.getShareContext());
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.services.external.ui.EditConfig r14, X.InterfaceC67352kd<? super android.content.Intent> r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43699HDb.LIZ(com.ss.android.ugc.aweme.services.external.ui.EditConfig, X.2kd):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig) {
        C45685HwP c45685HwP;
        o.LJIIIZ(editConfig, "editConfig");
        if (context != null) {
            if (editConfig.getClear() && (c45685HwP = C45685HwP.LJFF) != null) {
                c45685HwP.LIZ();
            }
            if (editConfig.getMediaInfo() != null) {
                XKX.LIZLLL(C48841JEv.LIZIZ(), null, null, new HDX(this, editConfig, context, null), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IEditService
    public final void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig) {
        CreativeInitialModel creativeInitialModel;
        CreativeInitialModel creativeInitialModel2;
        o.LJIIIZ(editConfig, "editConfig");
        o.LJIIIZ(shareConfig, "shareConfig");
        if (context != null) {
            int type = shareConfig.getType();
            if (type != 2) {
                if (type == 4) {
                    Bundle LIZIZ = LIZIZ(editConfig, shareConfig);
                    List<String> videoList = shareConfig.getVideoList();
                    if (videoList != null) {
                        ArrayList arrayList = new ArrayList();
                        long j = 0;
                        for (String str : videoList) {
                            MediaModel mediaModel = new MediaModel(j);
                            int[] LIZIZ2 = C43495H5f.LIZIZ(str);
                            mediaModel.duration = LIZIZ2[3];
                            mediaModel.width = LIZIZ2[0];
                            mediaModel.height = LIZIZ2[1];
                            mediaModel.fileLocalUriPath = str;
                            arrayList.add(mediaModel);
                            j++;
                        }
                        MultiVideoMedia multiVideoMedia = new MultiVideoMedia(arrayList);
                        multiVideoMedia.setExtraBundle(LIZIZ);
                        editConfig.setMediaInfo(multiVideoMedia);
                    }
                    try {
                        creativeInitialModel2 = (CreativeInitialModel) C60903NvH.LJIIJJI().LIZ().LJI(shareConfig.getShareContext().creativeInitModelJson, CreativeInitialModel.class);
                    } catch (Exception unused) {
                        creativeInitialModel2 = null;
                    }
                    editConfig.setInitialModel(creativeInitialModel2);
                }
            } else {
                Bundle LIZIZ3 = LIZIZ(editConfig, shareConfig);
                String creationId = editConfig.getCreationId();
                if (creationId == null) {
                    creationId = C44384HbQ.LJJJJIZL();
                }
                C77412UZs.LJJIJLIJ(LIZIZ3, new CreativeInfo(creationId, 0, null, 6, null));
                LIZIZ3.putString("open_platform_client_key", shareConfig.getShareContext().mClientKey);
                LIZIZ3.putString("open_platform_extra", shareConfig.getShareContext().mOpenPlatformExtra);
                LIZIZ3.putString("anchor_source_type", shareConfig.getShareContext().mAnchorSourceType);
                LIZIZ3.putInt("open_sdk_share_format", shareConfig.getShareContext().mShareFormat.getValue());
                Effect presetEffect = shareConfig.getPresetEffect();
                if (presetEffect != null) {
                    LIZIZ3.putParcelable("green_screen_kit_preset_effect", presetEffect);
                }
                LIZIZ3.putSerializable("share_model", editConfig.getShareModel());
                LIZIZ3.putSerializable("publish_settings_op", editConfig.getPublishSettings());
                MusicContent musicContent = shareConfig.getShareContext().mMusicContent;
                if (musicContent != null) {
                    LIZIZ3.putInt("music_start_time", musicContent.getMusicStartTime());
                    LIZIZ3.putString("music_id", musicContent.getMusicId());
                }
                LIZIZ3.putSerializable("_aweme_open_sdk_extra_share_options", shareConfig.getShareContext().mExtraShareOptions);
                C43722HDy shareContext = shareConfig.getShareContext();
                String file = shareConfig.getFile();
                o.LJI(file);
                VideoMedia videoMedia = new VideoMedia(file);
                videoMedia.setExtraBundle(LIZIZ3);
                editConfig.setMediaInfo(videoMedia);
                try {
                    creativeInitialModel = (CreativeInitialModel) C60903NvH.LJIIJJI().LIZ().LJI(shareContext.creativeInitModelJson, CreativeInitialModel.class);
                } catch (Exception unused2) {
                    creativeInitialModel = null;
                }
                editConfig.setInitialModel(creativeInitialModel);
            }
            startEdit(context, editConfig);
            I9T.LJ(null);
        }
    }
}
