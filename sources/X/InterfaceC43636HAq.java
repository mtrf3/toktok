package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: X.HAq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43636HAq {
    boolean enable3MinRecord();

    Activity findActivityInstance(Class<? extends ActivityC45651qj> cls);

    C6IC getABService();

    InterfaceC42669Gor getAlbumService();

    String getDefaultShootTabTag(ShortVideoContext shortVideoContext);

    InterfaceC43676HCe getDuetUploadService();

    InterfaceC43721HDx getMaxDurationResolver();

    HJ4 getNowUIService();

    HD8 getPhotoModule(ActivityC45651qj activityC45651qj, InterfaceC83865Wvl interfaceC83865Wvl, HD7 hd7, CreativeInfo creativeInfo);

    boolean isRecordingOrEditing();

    void photoCanvasGoNext(ActivityC45651qj activityC45651qj, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void preloadEffectModel();

    void requestDuetSettingPermission();

    boolean shouldDisable10MinDraftRecord(VideoPublishEditModel videoPublishEditModel);

    boolean shouldDropCurrentMusicFor3min(Object obj, ShortVideoContext shortVideoContext);
}
