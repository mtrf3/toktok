package com.bytedance.android.live.effect.api;

import X.C08000Tc;
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
public class EffectServiceDummy implements IEffectService {
    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WF baseComposerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void changeKaraokePlayStatus(DataChannel dataChannel, boolean z) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void cleanEffectCache() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC31971Nh composerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC31981Ni composerManagerB() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveEffect convertStickerBean(Effect effect) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC31971Nh createComposerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC31981Ni createComposerManagerB() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08160Ts createMagicGestureEffectAnchorHelper(DataChannel dataChannel, View view, InterfaceC08140Tq interfaceC08140Tq) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08170Tt createMagicGestureEffectAudienceHelper(ViewGroup viewGroup, InterfaceC65784Pro<OSZ<? extends Integer, ? extends Integer>> interfaceC65784Pro) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void destroyEffectPalletHandler() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WG getComposerFilterSlideHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WB getComposerHandler(InterfaceC30359Bvn interfaceC30359Bvn) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveEffect getCurrentBgEffect() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ C0WB getDefaultComposerHandler(IFilterManager iFilterManager, String str) {
        return C08000Tc.LIZ(this, iFilterManager, str);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ C1MY getEcEffectHelper() {
        return C08000Tc.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ InterfaceC07990Tb getEcExternalEffectHelper() {
        return C08000Tc.LIZJ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getEffectNewDialogFragment(Context context, DataChannel dataChannel) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WH getH5EventStickerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC31961Ng getInsertStickerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Class<KaraokeRecyclableWidget> getKaraokeHoverWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveBGMDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveBGMMiniWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WI getLiveBeautyLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveBgDialogFragment(Context context, DataChannel dataChannel, String str, InterfaceC30594Bza interfaceC30594Bza, InterfaceC30494Bxy interfaceC30494Bxy, View.OnClickListener onClickListener, InterfaceC28989BZh interfaceC28989BZh, String str2) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C1MZ getLiveComposerFilterHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08070Tj<LiveEffect> getLiveComposerFilterManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WL getLiveEffectController() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WR getLiveEffectDataProvider() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0TW getLiveEffectPalletHandler(WeakReference<DataChannel> weakReference, WeakReference<Fragment> weakReference2, InterfaceC08020Te interfaceC08020Te) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08030Tf getLiveEffectRedDotManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08040Tg getLiveEffectRemoveList() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WS getLiveEffectRestoreManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C1MZ getLiveFilterHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WT getLiveFilterLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08070Tj<FilterModel> getLiveFilterManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08080Tk getLiveGameEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0RV getLiveGoalAreaHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveGoalBackgroundDialogFragment(JSONObject jSONObject, VideoSize videoSize) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08090Tl getLiveGoalEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveGoalEffectWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08100Tm getLiveGoalLogHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WU getLiveMultiGuestStickerLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveMusicDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveSoundEffectDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveSoundEffectMiniWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WV getLiveStickerLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveWidget getLiveStickerShortCutWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ C1QA getLiveTouchEventEffect() {
        return C08000Tc.LIZLLL(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public LiveDialogFragment getLiveVoiceEffectDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08150Tr getLiveVoiceEffectHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public BaseFragment getMultiGuestEffectFragment(InterfaceC31981Ni interfaceC31981Ni, InterfaceC08180Tu interfaceC08180Tu) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public View getMultiGuestFullStickerListView(Fragment fragment, ViewGroup viewGroup, int i, IFilterManager iFilterManager, C0WF c0wf, C11060c2 c11060c2) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public View getMultiGuestStickerListView(Fragment fragment, ViewGroup viewGroup, int i, IFilterManager iFilterManager, C0WF c0wf, C11070c3 c11070c3) {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final /* synthetic */ C1MZ getRealLiveFilterHelper() {
        return C08000Tc.LJFF(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC30594Bza getSoloBgEffectLogManager() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C0WW getUploadEffectRelatedLog() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean hasUsedBGMFunction() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean isAccompanimentPlaying() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean isBGMPlaying() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean isUsingAccompanimentBusiness() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean isUsingBGMFunction() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public boolean isUsingKaraoke() {
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onEndBroadcast() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onEnterBroadcastPreview() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService, X.InterfaceC06390Mx
    public /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void onLeavePreview() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void openLiveKaraokeDialog(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void pauseAccompanimentPlay(Boolean bool) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void pauseBGM(Boolean bool) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadAccompanimentList() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadBroadcastApi() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadLinkMicEffectSmallModel() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void preloadMultiGuestEffects(int i) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void prepareEndBGM() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseAccompanimentResources() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseBGMPlayerManager() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseBgPanelResource() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releaseNaviAvatarResources() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void releasePanelResource(boolean z) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void removeSoloBgEffect(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void reportClickSoundEffectIconLog(DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void restoreMultiGuestEffectToLiveCoreForGuest(LifecycleCoroutineScope lifecycleCoroutineScope, InterfaceC31981Ni interfaceC31981Ni) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void resumeAccompanimentPlay() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void resumeBGM() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void selectSoundEffectAfterGameLiveResume() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void showEffectTextInputDialog(DataChannel dataChannel, C0YJ c0yj, InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public void showStickerPanel(Context context, DataChannel dataChannel, boolean z, InterfaceC30494Bxy interfaceC30494Bxy, boolean z2, boolean z3) {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC08130Tp stickerPresenter() {
        return null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public InterfaceC31991Nj getMultiGuestBeautyLogManager() {
        return C08000Tc.LJ(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public Boolean hasUsedAccompanimentBusiness() {
        return Boolean.FALSE;
    }
}
