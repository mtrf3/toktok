package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;

/* loaded from: classes8.dex */
public interface HXB extends C0I6 {
    void changeHasMusic(AVMusic aVMusic);

    void changeUiEnableState(boolean z);

    LiveEvent<C76800UCe> getMusicAdded();

    LiveEvent<C76800UCe> getMusicCleared();

    void handleCancelMusicResultEvent();

    void handleChooseMusic(C145355n9 c145355n9);

    void handleChooseMusicResultEvent(AVMusic aVMusic, String str);

    void initStitch();

    void mN();

    void notifyMusicChange();

    void onChooseMusicDone(boolean z, String str, AVMusic aVMusic, String str2);

    void setChooseMusicVisible(Boolean bool, Boolean bool2, Boolean bool3);

    void setupClickListener(boolean z);

    void showMusicTips(Integer num);

    void startChooseMusicAnim(float f, float f2);

    void tryHideMusicTips();
}
