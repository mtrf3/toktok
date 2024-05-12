package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public interface I27 extends C0I6 {
    void changeCancelMusicBtnVisible(boolean z);

    void changeHasMusic(AVMusic aVMusic);

    void changeMusicUi(boolean z);

    void changeUiEnableState(boolean z);

    void clearMusic();

    LiveEvent<AVMusic> getChooseMusic();

    AVMusic getCurrentMusic();

    LiveEvent<C76800UCe> getMusicAdded();

    LiveEvent<C76800UCe> getMusicCleared();

    LiveEvent<Boolean> getMusicPanelShow();

    OSZ<Effect, Boolean> getStickerMusicCancelState();

    LiveEvent<Boolean> getUiLoadingMusicEvent();

    void handleCancelMusicResultEvent();

    void handleChooseMusic(C145355n9 c145355n9);

    void handleChooseMusicResultEvent(AVMusic aVMusic, String str);

    void initStitch();

    void musicPanelShow(boolean z);

    void notifyMusicChange();

    void onChooseMusicDone(boolean z, String str, AVMusic aVMusic, String str2);

    void openMusicPanel();

    boolean recordHasMusic();

    void setChooseMusicVisible(Boolean bool, Boolean bool2, Boolean bool3);

    void setStickerMusicCancelState(OSZ<? extends Effect, Boolean> osz);

    void setUiLoadingMusic(boolean z);

    void setupClickListener(boolean z);

    void showMusicTips(Integer num);

    void startChooseMusicAnim(float f, float f2);

    void startPreviewMusic(boolean z);

    void stopPreviewMusic();

    void stopStickerBGM();

    void tryHideMusicTips();
}
