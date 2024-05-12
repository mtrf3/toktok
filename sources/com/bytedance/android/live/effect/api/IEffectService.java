package com.bytedance.android.live.effect.api;

import X.C0RV;
import X.C0TW;
import X.C0WB;
import X.C0WF;
import X.C0WG;
import X.C0WH;
import X.C0WI;
import X.C0WL;
import X.C0WR;
import X.C0WS;
import X.C0WT;
import X.C0WU;
import X.C0WV;
import X.C0WW;
import X.C0YJ;
import X.C11060c2;
import X.C11070c3;
import X.C1MY;
import X.C1MZ;
import X.C1QA;
import X.C76800UCe;
import X.InterfaceC06390Mx;
import X.InterfaceC07990Tb;
import X.InterfaceC08020Te;
import X.InterfaceC08030Tf;
import X.InterfaceC08040Tg;
import X.InterfaceC08070Tj;
import X.InterfaceC08080Tk;
import X.InterfaceC08090Tl;
import X.InterfaceC08100Tm;
import X.InterfaceC08130Tp;
import X.InterfaceC08140Tq;
import X.InterfaceC08150Tr;
import X.InterfaceC08160Ts;
import X.InterfaceC08170Tt;
import X.InterfaceC08180Tu;
import X.InterfaceC28989BZh;
import X.InterfaceC30359Bvn;
import X.InterfaceC30494Bxy;
import X.InterfaceC30594Bza;
import X.InterfaceC31961Ng;
import X.InterfaceC31971Nh;
import X.InterfaceC31981Ni;
import X.InterfaceC31991Nj;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IEffectService extends InterfaceC06390Mx {
    C0WF baseComposerManager();

    void changeKaraokePlayStatus(DataChannel dataChannel, boolean z);

    void cleanEffectCache();

    InterfaceC31971Nh composerManager();

    InterfaceC31981Ni composerManagerB();

    LiveEffect convertStickerBean(Effect effect);

    InterfaceC31971Nh createComposerManager();

    InterfaceC31981Ni createComposerManagerB();

    InterfaceC08160Ts createMagicGestureEffectAnchorHelper(DataChannel dataChannel, View view, InterfaceC08140Tq interfaceC08140Tq);

    InterfaceC08170Tt createMagicGestureEffectAudienceHelper(ViewGroup viewGroup, InterfaceC65784Pro<OSZ<? extends Integer, ? extends Integer>> interfaceC65784Pro);

    void destroyEffectPalletHandler();

    C0WG getComposerFilterSlideHelper();

    C0WB getComposerHandler(InterfaceC30359Bvn interfaceC30359Bvn);

    LiveEffect getCurrentBgEffect();

    C0WB getDefaultComposerHandler(IFilterManager iFilterManager, String str);

    C1MY getEcEffectHelper();

    InterfaceC07990Tb getEcExternalEffectHelper();

    LiveDialogFragment getEffectNewDialogFragment(Context context, DataChannel dataChannel);

    C0WH getH5EventStickerManager();

    InterfaceC31961Ng getInsertStickerManager();

    Class<? extends KaraokeRecyclableWidget> getKaraokeHoverWidget();

    LiveDialogFragment getLiveBGMDialog();

    LiveWidget getLiveBGMMiniWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2);

    C0WI getLiveBeautyLogManager();

    LiveDialogFragment getLiveBgDialogFragment(Context context, DataChannel dataChannel, String str, InterfaceC30594Bza interfaceC30594Bza, InterfaceC30494Bxy interfaceC30494Bxy, View.OnClickListener onClickListener, InterfaceC28989BZh interfaceC28989BZh, String str2);

    C1MZ getLiveComposerFilterHelper();

    InterfaceC08070Tj<LiveEffect> getLiveComposerFilterManager();

    C0WL getLiveEffectController();

    C0WR getLiveEffectDataProvider();

    C0TW getLiveEffectPalletHandler(WeakReference<DataChannel> weakReference, WeakReference<Fragment> weakReference2, InterfaceC08020Te interfaceC08020Te);

    InterfaceC08030Tf getLiveEffectRedDotManager();

    InterfaceC08040Tg getLiveEffectRemoveList();

    C0WS getLiveEffectRestoreManager();

    C1MZ getLiveFilterHelper();

    C0WT getLiveFilterLogManager();

    InterfaceC08070Tj<FilterModel> getLiveFilterManager();

    InterfaceC08080Tk getLiveGameEffectHelper();

    C0RV getLiveGoalAreaHelper();

    LiveDialogFragment getLiveGoalBackgroundDialogFragment(JSONObject jSONObject, VideoSize videoSize);

    InterfaceC08090Tl getLiveGoalEffectHelper();

    LiveWidget getLiveGoalEffectWidget();

    InterfaceC08100Tm getLiveGoalLogHelper();

    C0WU getLiveMultiGuestStickerLogManager();

    LiveDialogFragment getLiveMusicDialog();

    LiveDialogFragment getLiveSoundEffectDialog();

    LiveWidget getLiveSoundEffectMiniWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2);

    C0WV getLiveStickerLogManager();

    LiveWidget getLiveStickerShortCutWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2);

    C1QA getLiveTouchEventEffect();

    LiveDialogFragment getLiveVoiceEffectDialog();

    InterfaceC08150Tr getLiveVoiceEffectHelper();

    InterfaceC31991Nj getMultiGuestBeautyLogManager();

    BaseFragment getMultiGuestEffectFragment(InterfaceC31981Ni interfaceC31981Ni, InterfaceC08180Tu interfaceC08180Tu);

    View getMultiGuestFullStickerListView(Fragment fragment, ViewGroup viewGroup, int i, IFilterManager iFilterManager, C0WF c0wf, C11060c2 c11060c2);

    View getMultiGuestStickerListView(Fragment fragment, ViewGroup viewGroup, int i, IFilterManager iFilterManager, C0WF c0wf, C11070c3 c11070c3);

    C1MZ getRealLiveFilterHelper();

    InterfaceC30594Bza getSoloBgEffectLogManager();

    C0WW getUploadEffectRelatedLog();

    Boolean hasUsedAccompanimentBusiness();

    Boolean hasUsedBGMFunction();

    boolean isAccompanimentPlaying();

    Boolean isBGMPlaying();

    boolean isUsingAccompanimentBusiness();

    Boolean isUsingBGMFunction();

    boolean isUsingKaraoke();

    void onEndBroadcast();

    void onEnterBroadcastPreview();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void onLeavePreview();

    void openLiveKaraokeDialog(DataChannel dataChannel);

    void pauseAccompanimentPlay(Boolean bool);

    void pauseBGM(Boolean bool);

    void preloadAccompanimentList();

    void preloadBroadcastApi();

    void preloadLinkMicEffectSmallModel();

    void preloadMultiGuestEffects(int i);

    void prepareEndBGM();

    void releaseAccompanimentResources();

    void releaseBGMPlayerManager();

    void releaseBgPanelResource();

    void releaseNaviAvatarResources();

    void releasePanelResource(boolean z);

    void removeSoloBgEffect(DataChannel dataChannel);

    void reportClickSoundEffectIconLog(DataChannel dataChannel);

    void restoreMultiGuestEffectToLiveCoreForGuest(LifecycleCoroutineScope lifecycleCoroutineScope, InterfaceC31981Ni interfaceC31981Ni);

    void resumeAccompanimentPlay();

    void resumeBGM();

    void selectSoundEffectAfterGameLiveResume();

    void showEffectTextInputDialog(DataChannel dataChannel, C0YJ c0yj, InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns);

    void showStickerPanel(Context context, DataChannel dataChannel, boolean z, InterfaceC30494Bxy interfaceC30494Bxy, boolean z2, boolean z3);

    InterfaceC08130Tp stickerPresenter();
}
