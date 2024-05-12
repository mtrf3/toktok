package com.ss.android.ugc.aweme.services.external.ui;

import X.AbstractBinderC44127HTn;
import X.ActivityC45651qj;
import X.C76800UCe;
import X.EnumC133695Mn;
import X.InterfaceC55643Lsd;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public interface IRecordService {

    /* loaded from: classes8.dex */
    public interface UICallback {

        /* loaded from: classes8.dex */
        public static final class DefaultImpls {
            public static boolean checkIsCanceled(UICallback uICallback) {
                return false;
            }
        }

        boolean checkIsCanceled();

        void postFail();

        void postSuccess();

        void preFail(int i);

        void preSuccess();
    }

    void clickMvAnchorOpenAlbumDirectly(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig);

    void enterRecordPageInTemplate(Context context, RecordConfig recordConfig);

    Intent getRecordBasicIntent(RecordConfig recordConfig);

    boolean isBroadcastSmoothGoLive();

    boolean isVideoRecordNewActivityInStack();

    void openAlbum(Activity activity, LongPressOpenAlbumParams longPressOpenAlbumParams);

    void openAlbumWithMusic(Activity activity, RecordConfig recordConfig, MusicModel musicModel);

    void openDMAlbum(Activity activity, DMAlbumParams dMAlbumParams);

    void openSearchAlbum(Activity activity, SearchAlbumParams searchAlbumParams);

    void preloadDuetLayout(int i, int i2, InterfaceC88472Yns<? super Effect, C76800UCe> interfaceC88472Yns);

    void recordActivityResult(Activity activity, int i, int i2, Intent intent);

    void showCameraWidgetGuide(ActivityC45651qj activityC45651qj, String str, String str2, String str3, boolean z, InterfaceC55643Lsd interfaceC55643Lsd);

    void starNLETemplateDebugAlbum(Context context, String str);

    void startAlbum(Context context, RecordConfig recordConfig, EnumC133695Mn enumC133695Mn, EditEffectAnchorManager editEffectAnchorManager);

    void startAlbumForExtractMusic(Activity activity, Bundle bundle);

    void startAutoCutAnchorAlbum(Activity activity, AutoCutAnchorConfig autoCutAnchorConfig);

    void startChangeBanMusic(Aweme aweme, Activity activity, ChangeBanMusicConfig changeBanMusicConfig, UICallback uICallback, String str);

    void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, UICallback uICallback, String str, String str2);

    void startEditorProAnchorAlbum(Activity activity, EditorProAnchorConfig editorProAnchorConfig);

    void startExteriorVideoRecordScene(Context context, ExteriorRecordModel exteriorRecordModel, AbstractBinderC44127HTn abstractBinderC44127HTn, String str, Bundle bundle);

    void startIndependentLiveActivity(Context context, RecordConfig recordConfig);

    void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z);

    void startRecord(Context context, Intent intent);

    void startRecord(Context context, RecordConfig recordConfig);

    void startRecord(Context context, RecordConfig recordConfig, Uri uri);

    void startRecord(Context context, RecordConfig recordConfig, Challenge challenge);

    void startRecordMV(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig);

    void startRecordSlideShowPhotoMV(Context context, RecordConfig recordConfig, PhotoMvAnchorConfig photoMvAnchorConfig);

    void startSoundSyncAlbum(Activity activity, SoundSyncAnchorConfig soundSyncAnchorConfig);

    void startSpecialPlusEntrance(Context context, RecordConfig recordConfig);

    void startStitch(Context context, Intent intent, StitchParams stitchParams, boolean z);

    void startSuperEntrace(Activity activity, RecordConfig recordConfig);

    void startUgcTemplateAlbum(Activity activity, UgcTemplateAlbumConfig ugcTemplateAlbumConfig);

    void startUgcTemplatePreviewActivity(Activity activity, UgcTemplateAnchorConfig ugcTemplateAnchorConfig);
}
