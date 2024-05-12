package com.bytedance.android.live.effect;

import X.BWZ;
import X.BYI;
import X.C07510Rf;
import X.C08000Tc;
import X.C09650Zl;
import X.C0LR;
import X.C0LT;
import X.C0NB;
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
import X.C12880ey;
import X.C14260hC;
import X.C14270hD;
import X.C14360hM;
import X.C15740ja;
import X.C15750jb;
import X.C16880lQ;
import X.C17250m1;
import X.C18420nu;
import X.C1A;
import X.C1HD;
import X.C1KC;
import X.C1KE;
import X.C1KJ;
import X.C1KS;
import X.C1KU;
import X.C1MX;
import X.C1MY;
import X.C1MZ;
import X.C1Q2;
import X.C1Q6;
import X.C1QA;
import X.C1VL;
import X.C1XG;
import X.C21210sP;
import X.C21Y;
import X.C29306Beo;
import X.C29494Bhq;
import X.C2BV;
import X.C30261Gs;
import X.C30686C2o;
import X.C30725C4b;
import X.C30751Ip;
import X.C31661Mc;
import X.C31691Mf;
import X.C31701Mg;
import X.C32011Nl;
import X.C32021Nm;
import X.C32031Nn;
import X.C32041No;
import X.C32071Nr;
import X.C32101Nu;
import X.C32141Ny;
import X.C32241Oi;
import X.C32251Oj;
import X.C32537Cpp;
import X.C35721ai;
import X.C37301dG;
import X.C38991fz;
import X.C39591gx;
import X.C40641ie;
import X.C41561k8;
import X.C41571k9;
import X.C42151l5;
import X.C42671lv;
import X.C42681lw;
import X.C42691lx;
import X.C43381n4;
import X.C44171oL;
import X.C54402Bo;
import X.C54562Ce;
import X.C55382Fi;
import X.C55392Fj;
import X.C76800UCe;
import X.C77800Ug8;
import X.C78886Uxe;
import X.C79081V1x;
import X.C79258V8s;
import X.CN1;
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
import X.InterfaceC30442Bx8;
import X.InterfaceC30494Bxy;
import X.InterfaceC30594Bza;
import X.InterfaceC31961Ng;
import X.InterfaceC31971Nh;
import X.InterfaceC31981Ni;
import X.InterfaceC31991Nj;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.ViewOnLayoutChangeListenerC30741Io;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.EffectRelatedApi;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.ShowStickerShortCutPanelEvent;
import com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget;
import com.bytedance.android.live.effect.bgeffect.LiveBgDialogFragment;
import com.bytedance.android.live.effect.input.EffectTextInputFragment;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.effect.livegoal.LiveGoalEffectWidget;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.model.LogParams;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.live.effect.music.LiveBGMDialog;
import com.bytedance.android.live.effect.music.LiveBGMMiniWidget;
import com.bytedance.android.live.effect.music.LiveMusicDialog;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragmentOpt;
import com.bytedance.android.live.effect.panel.LiveMultiGuestBeautyEffectFragment;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget;
import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerDialogView;
import com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerListView;
import com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget;
import com.bytedance.android.live.effect.voiceeffect.LiveVoiceEffectDialogFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreloadLinkMicSmallModelSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchModelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EffectService implements IEffectService {
    public C1KE LJLIL;

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC31981Ni composerManagerB() {
        return C12880ey.LIZ();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08070Tj<LiveEffect> getLiveComposerFilterManager() {
        return C17250m1.LIZ();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C1MZ getLiveFilterHelper() {
        return C15740ja.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08070Tj<FilterModel> getLiveFilterManager() {
        return C15750jb.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C08000Tc.LJI(this);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void preloadAccompanimentList() {
        C14270hD.LIZIZ(null);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void prepareEndBGM() {
        C14260hC.LJII = true;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void releaseNaviAvatarResources() {
        C18420nu.LIZ = null;
        ((LinkedHashMap) C18420nu.LIZIZ).clear();
        C18420nu.LIZJ = 0;
        C18420nu.LIZLLL = 0;
        C18420nu.LJ = 0;
        C18420nu.LJFF = false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void resumeAccompanimentPlay() {
        C14270hD.LJIILIIL(false);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void resumeBGM() {
        C14260hC.LJI(false);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC31971Nh composerManager() {
        if (C42671lv.LJIILL == null) {
            synchronized (C42671lv.class) {
                if (C42671lv.LJIILL == null) {
                    C42671lv.LJIILL = new C42671lv();
                }
            }
        }
        return C42671lv.LJIILL;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC31971Nh createComposerManager() {
        return new C42671lv();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC31981Ni createComposerManagerB() {
        return new C42681lw();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveDialogFragment getLiveBGMDialog() {
        return new LiveBGMDialog();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C1MZ getLiveComposerFilterHelper() {
        return (C43381n4) C43381n4.LJ.getValue();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveWidget getLiveGoalEffectWidget() {
        return new LiveGoalEffectWidget();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveDialogFragment getLiveMusicDialog() {
        return new LiveMusicDialog();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveDialogFragment getLiveSoundEffectDialog() {
        return new SoundEffectFragment();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C1QA getLiveTouchEventEffect() {
        return new C41571k9();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveDialogFragment getLiveVoiceEffectDialog() {
        return new LiveVoiceEffectDialogFragment(0);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C1MZ getRealLiveFilterHelper() {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            return (C43381n4) C43381n4.LJ.getValue();
        }
        return C15740ja.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final Boolean hasUsedAccompanimentBusiness() {
        return Boolean.valueOf(C14270hD.LLD);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final Boolean hasUsedBGMFunction() {
        return Boolean.valueOf(C14260hC.LJIIL);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final Boolean isBGMPlaying() {
        return Boolean.valueOf(C14260hC.LJIIJJI);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final boolean isUsingAccompanimentBusiness() {
        if (C14270hD.LJZ != 0 && !C14270hD.LJZL) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final Boolean isUsingBGMFunction() {
        boolean z;
        if (C14260hC.LJIIJJI || C14260hC.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void onEndBroadcast() {
        C1KE c1ke = this.LJLIL;
        if (c1ke != null) {
            C1Q2.LIZIZ.remove(c1ke);
        }
        this.LJLIL = null;
        if (EffectParseOptSetting.enableOptAndCleanCache()) {
            C1KJ.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void onEnterBroadcastPreview() {
        C1KE c1ke = new C1KE();
        this.LJLIL = c1ke;
        C1Q2.LIZIZ.add(c1ke);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void onLeavePreview() {
        C1KE c1ke = this.LJLIL;
        if (c1ke != null) {
            C1Q2.LIZIZ.remove(c1ke);
        }
        this.LJLIL = null;
        if (EffectParseOptSetting.enableOptAndCleanCache()) {
            C1KJ.LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void preloadBroadcastApi() {
        ((EffectRelatedApi) C1A.LIZJ(EffectRelatedApi.class)).uploadBeautyParams(0L, "", 0, 0, 0, 0, false);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void preloadLinkMicEffectSmallModel() {
        if (LivePreloadLinkMicSmallModelSetting.INSTANCE.isEnable() && DownloadableModelSupport.isInitialized()) {
            DownloadableModelSupport.getInstance().fetchResourcesNeededByRequirements(new String[]{"liveBaseModels"}, new IFetchModelListener() { // from class: X.1Gr
                @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
                public final void onFailed(Exception exc) {
                    if (exc != null) {
                        StringBuilder LIZIZ = C59895Nf1.LIZIZ(exc, "finish_download_downgrading_resource with error :");
                        LIZIZ.append(exc.getMessage());
                        C32014ChO.LIZIZ("DownloadableModelSupport", X1D.LIZIZ(LIZIZ));
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.IFetchModelListener
                public final void onSuccess(String[] strArr) {
                    C32014ChO.LJFF("DownloadableModelSupport", "finish_download_downgrading_resource");
                }
            });
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void releaseAccompanimentResources() {
        C14270hD.LJIIJJI(CardStruct.IStatusCode.DEFAULT);
        C14270hD.LJIIJ(C14270hD.LJZ);
        if (C14270hD.LJZI != null && !C14270hD.LJZL) {
            C32101Nu.LJIILL(Long.valueOf(C14270hD.LJLJLLL), C14270hD.LJLJLJ, Long.valueOf(System.currentTimeMillis() / 1000), 3L, null);
        }
        C14270hD.LJ().removeMessages(0);
        C14270hD.LJ().removeMessages(1);
        C79258V8s.LIZ(C21Y.LJLIL);
        ((ArrayList) C14270hD.LJLLJ).clear();
        C14270hD.LJLLLL.clear();
        C14270hD.LJLLLLLL.clear();
        BWZ bwz = BWZ.BGM;
        BYI.LIZLLL(bwz);
        C14270hD.LJZ = 0L;
        C14270hD.LJZI = null;
        C14270hD.LL = false;
        if (C14270hD.LJZ != 0) {
            BYI.LIZJ(bwz);
        } else {
            BYI.LIZLLL(bwz);
        }
        C14270hD.LJZL = false;
        C14270hD.LJFF().clear();
        C14270hD.LJLJJL = null;
        InterfaceC30442Bx8.R.LIZ(GsonProtectorUtils.toJson(C09650Zl.LIZJ, C14270hD.LJI()));
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void releaseBGMPlayerManager() {
        if (C14260hC.LIZJ != 0) {
            C14360hM.LIZJ(C14260hC.LIZJ, CardStruct.IStatusCode.DEFAULT);
        }
        C14260hC.LIZJ = 0;
        if (!C14260hC.LIZLLL) {
            C32101Nu.LJIIJJI(Long.valueOf(C14260hC.LJFF), Long.valueOf(System.currentTimeMillis() / 1000), 3L, null);
        }
        C14260hC.LJII(false);
        C14260hC.LIZLLL = false;
        C14260hC.LJI = 1L;
        C14260hC.LIZJ().clear();
        C14260hC.LIZIZ = null;
        C14260hC.LJIIL = false;
        C14260hC.LJIIJ = false;
        C14260hC.LJII = false;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void releaseBgPanelResource() {
        InterfaceC30594Bza interfaceC30594Bza = C07510Rf.LIZLLL;
        if (interfaceC30594Bza != null) {
            interfaceC30594Bza.LIZIZ();
        }
        InterfaceC30594Bza interfaceC30594Bza2 = C07510Rf.LIZLLL;
        if (interfaceC30594Bza2 != null) {
            interfaceC30594Bza2.release();
        }
        C07510Rf.LIZLLL = null;
        InterfaceC30594Bza interfaceC30594Bza3 = C07510Rf.LJ;
        if (interfaceC30594Bza3 != null) {
            interfaceC30594Bza3.LIZIZ();
        }
        InterfaceC30594Bza interfaceC30594Bza4 = C07510Rf.LJ;
        if (interfaceC30594Bza4 != null) {
            interfaceC30594Bza4.release();
        }
        C07510Rf.LJ = null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void selectSoundEffectAfterGameLiveResume() {
        LiveEffect liveEffect = C32141Ny.LJIIIIZZ;
        if (liveEffect != null) {
            C32141Ny.LJFF(liveEffect, true);
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WF baseComposerManager() {
        return composerManagerB();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveEffect getCurrentBgEffect() {
        return C79081V1x.LJIIJJI();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void cleanEffectCache() {
        C1KJ.LJIIIZ();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void destroyEffectPalletHandler() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WG getComposerFilterSlideHelper() {
        return C1VL.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C1MY getEcEffectHelper() {
        return C42691lx.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC07990Tb getEcExternalEffectHelper() {
        return C42691lx.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WH getH5EventStickerManager() {
        return C1HD.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC31961Ng getInsertStickerManager() {
        return C40641ie.LJLIL;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final Class<? extends KaraokeRecyclableWidget> getKaraokeHoverWidget() {
        return KaraokeHoverWidget.class;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WI getLiveBeautyLogManager() {
        return C32011Nl.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WL getLiveEffectController() {
        return C1KC.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WR getLiveEffectDataProvider() {
        return C1KJ.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08030Tf getLiveEffectRedDotManager() {
        return C1KS.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08040Tg getLiveEffectRemoveList() {
        return C39591gx.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WS getLiveEffectRestoreManager() {
        return C1KU.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WT getLiveFilterLogManager() {
        return C32021Nm.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08080Tk getLiveGameEffectHelper() {
        return C1XG.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0RV getLiveGoalAreaHelper() {
        return C31661Mc.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08090Tl getLiveGoalEffectHelper() {
        return C31691Mf.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08100Tm getLiveGoalLogHelper() {
        return C31701Mg.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WU getLiveMultiGuestStickerLogManager() {
        return C32031Nn.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WV getLiveStickerLogManager() {
        return C32041No.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08150Tr getLiveVoiceEffectHelper() {
        return C32141Ny.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC31991Nj getMultiGuestBeautyLogManager() {
        return C42151l5.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC30594Bza getSoloBgEffectLogManager() {
        return C32071Nr.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WW getUploadEffectRelatedLog() {
        return C32101Nu.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final boolean isAccompanimentPlaying() {
        return C14270hD.LL;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final boolean isUsingKaraoke() {
        return C21210sP.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08130Tp stickerPresenter() {
        return C0LR.LIZ;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveEffect convertStickerBean(Effect effect) {
        return C0LT.LIZIZ(effect);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WB getComposerHandler(final InterfaceC30359Bvn interfaceC30359Bvn) {
        return new C0WB(interfaceC30359Bvn) { // from class: X.1R4
            public final WeakReference<InterfaceC30359Bvn> LIZ;

            @Override // X.C0WB
            public final void LIZ(String path, boolean z) {
                o.LJIIIZ(path, "path");
            }

            @Override // X.C0WB
            public final boolean LJII() {
                return false;
            }

            @Override // X.C0WB
            public final void LJJIJLIJ(boolean z) {
            }

            @Override // X.C0WB
            public final void enableMockFace(boolean z) {
            }

            @Override // X.C0WB
            public final void hide() {
            }

            @Override // X.C0WB
            public final void LJ() {
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJ();
                }
            }

            {
                this.LIZ = new WeakReference<>(interfaceC30359Bvn);
            }

            @Override // X.C0WB
            public final void LJIIIIZZ(String[] strArr) {
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJIIIIZZ(strArr);
                }
            }

            @Override // X.C0WB
            public final void LJIIJJI(String[] strArr) {
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJIJ(strArr);
                }
            }

            @Override // X.C0WB
            public final void LJFF(String[] strArr, String[] strArr2) {
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJFF(strArr, strArr2);
                }
            }

            @Override // X.C0WB
            public final void LJI(String[] strArr, String[] tags) {
                o.LJIIIZ(tags, "tags");
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJIJI(strArr, tags);
                }
            }

            @Override // X.C0WB
            public final void LJIIIZ(String[] strArr, String[] strArr2) {
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJIIIZ(strArr, strArr2);
                }
            }

            @Override // X.C0WB
            public final void LJIIJ(String[] strArr, String[] tags) {
                o.LJIIIZ(tags, "tags");
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJJIIJZLJL(strArr, tags);
                }
            }

            @Override // X.C0WB
            public final void setRenderCacheString(String str, String value) {
                o.LJIIIZ(value, "value");
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.setRenderCacheString(str, value);
                }
            }

            @Override // X.C0WB
            public final void LIZIZ(String[] paths, String[] nodeTags, float[] fArr) {
                o.LJIIIZ(paths, "paths");
                o.LJIIIZ(nodeTags, "nodeTags");
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LIZIZ(paths, nodeTags, fArr);
                }
            }

            @Override // X.C0WB
            public final void LIZJ(String[] strArr, String[] newNodePaths, String[] strArr2) {
                o.LJIIIZ(newNodePaths, "newNodePaths");
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LJIIZILJ(strArr, newNodePaths, strArr2);
                }
            }

            @Override // X.C0WB
            public final void composerCheckNodeExclusion(String nodePath, String nodeTag, int[] iArr) {
                o.LJIIIZ(nodePath, "nodePath");
                o.LJIIIZ(nodeTag, "nodeTag");
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.composerCheckNodeExclusion(nodePath, nodeTag, iArr);
                }
            }

            @Override // X.C0WB
            public final void composerUpdateNode(String path, String nodeTag, float f) {
                o.LJIIIZ(path, "path");
                o.LJIIIZ(nodeTag, "nodeTag");
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.composerUpdateNode(path, nodeTag, f);
                }
            }

            @Override // X.C0WB
            public final void LIZLLL(int i, int i2, String str, String str2) {
                InterfaceC30359Bvn interfaceC30359Bvn2 = this.LIZ.get();
                if (interfaceC30359Bvn2 != null) {
                    interfaceC30359Bvn2.LIZLLL(i, i2, str, str2);
                }
            }
        };
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void openLiveKaraokeDialog(DataChannel dataChannel) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (dataChannel != null && (lifecycleOwner = dataChannel.LJLJJI) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new C55392Fj(dataChannel, null), 3);
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void pauseAccompanimentPlay(Boolean bool) {
        C14270hD.LJII(bool.booleanValue());
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void pauseBGM(Boolean bool) {
        C14260hC.LIZLLL(bool.booleanValue(), true);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void preloadMultiGuestEffects(int i) {
        ((MultiGuestStickerViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(null, null)).get(MultiGuestStickerViewModel.class)).gv0(i);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void releasePanelResource(boolean z) {
        ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io = C07510Rf.LIZ;
        if (viewOnLayoutChangeListenerC30741Io != null) {
            C30751Ip c30751Ip = viewOnLayoutChangeListenerC30741Io.LJZI;
            if (c30751Ip != null) {
                C39591gx.LIZJ.remove(c30751Ip);
            }
            InterfaceC30494Bxy interfaceC30494Bxy = viewOnLayoutChangeListenerC30741Io.LJLLL;
            if (interfaceC30494Bxy != null) {
                interfaceC30494Bxy.onDestroy();
            }
            C29306Beo.LJJIFFI(null);
        }
        C07510Rf.LIZ = null;
        C1Q6 c1q6 = C07510Rf.LIZIZ;
        if (c1q6 != null) {
            InterfaceC30494Bxy interfaceC30494Bxy2 = c1q6.LJZI;
            if (interfaceC30494Bxy2 != null) {
                interfaceC30494Bxy2.onDestroy();
            }
            c1q6.LJZL = null;
        }
        C07510Rf.LIZIZ = null;
        C42691lx.LIZJ = null;
        C42691lx.LIZLLL = null;
        InterfaceC06390Mx LIZ = CN1.LIZ(IHostCreativeTool.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        ((IHostCreativeTool) LIZ).lh(C42691lx.LJ);
        C07510Rf.LIZJ = null;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void removeSoloBgEffect(DataChannel dataChannel) {
        C79081V1x.LJJIJIIJIL(dataChannel);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void reportClickSoundEffectIconLog(DataChannel dataChannel) {
        C77800Ug8.LJ("livesdk_live_take_voice_click", dataChannel);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void changeKaraokePlayStatus(DataChannel dataChannel, boolean z) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (dataChannel != null && (lifecycleOwner = dataChannel.LJLJJI) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            XKX.LIZLLL(lifecycleScope, null, null, new C55382Fi(dataChannel, z, null), 3);
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08170Tt createMagicGestureEffectAudienceHelper(ViewGroup viewGroup, InterfaceC65784Pro<OSZ<? extends Integer, ? extends Integer>> interfaceC65784Pro) {
        return new C32251Oj(viewGroup, new C41561k8(0, interfaceC65784Pro));
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0WB getDefaultComposerHandler(final IFilterManager iFilterManager, final String str) {
        return new C0WB(iFilterManager, str) { // from class: X.1R3
            public final IFilterManager LIZ;
            public final String LIZIZ;

            @Override // X.C0WB
            public final void LJ() {
                LJIIL("notifyKeyboardHide", null);
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.notifyKeyboardHide(true);
                }
            }

            @Override // X.C0WB
            public final boolean LJII() {
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    return iFilterManager2.isEnable();
                }
                return false;
            }

            @Override // X.C0WB
            public final void hide() {
                LJIIL("hide", null);
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.setEffect(null, false);
                }
            }

            @Override // X.C0WB
            public final void LJIIIIZZ(String[] nodePaths) {
                o.LJIIIZ(nodePaths, "nodePaths");
                LJIIL("composerRemoveNodes", nodePaths.toString());
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerRemoveNodes(nodePaths, nodePaths.length);
                }
            }

            @Override // X.C0WB
            public final void LJIIJJI(String[] strArr) {
                LJIIL("composerSetNodes", strArr.toString());
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerSetNodes(strArr, strArr.length);
                }
            }

            @Override // X.C0WB
            public final void LJJIJLIJ(boolean z) {
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.enable(z);
                }
            }

            @Override // X.C0WB
            public final void enableMockFace(boolean z) {
                LJIIL("enableMockFace", null);
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.enableMockFace(z);
                }
            }

            {
                this.LIZ = iFilterManager;
                this.LIZIZ = str;
            }

            @Override // X.C0WB
            public final void LIZ(String path, boolean z) {
                o.LJIIIZ(path, "path");
                LJIIL("show", null);
                try {
                    if (!TextUtils.isEmpty(path)) {
                        if (new File(path).exists()) {
                            IFilterManager iFilterManager2 = this.LIZ;
                            if (iFilterManager2 != null) {
                                iFilterManager2.setEffect(path, z);
                                return;
                            }
                            return;
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Filter file not exists:");
                        LIZ.append(path);
                        throw new FileNotFoundException(X1D.LIZIZ(LIZ));
                    }
                    throw new FileNotFoundException("Filter file is empty");
                } catch (FileNotFoundException e) {
                    C0NB.LJI(this.LIZIZ, e);
                }
            }

            @Override // X.C0WB
            public final void LJFF(String[] strArr, String[] strArr2) {
                LJIIL("composerAddNodesWithExtra(useOutput)", strArr.toString());
                for (String str2 : strArr) {
                    ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).updateEffectAddTime(str2);
                }
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerAppendNodesWithTags(strArr, strArr.length, strArr2, true, false, false);
                }
            }

            @Override // X.C0WB
            public final void LJI(String[] strArr, String[] strArr2) {
                LJIIL("composerSetNodesWithExtra(useOutput)", strArr.toString());
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerSetNodesWithTags(strArr, strArr.length, strArr2, true, false, false);
                }
            }

            @Override // X.C0WB
            public final void LJIIIZ(String[] strArr, String[] strArr2) {
                LJIIL("composerAddNodesWithExtra", strArr.toString());
                for (String str2 : strArr) {
                    ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).updateEffectAddTime(str2);
                }
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerAppendNodesWithTags(strArr, strArr.length, strArr2);
                }
            }

            @Override // X.C0WB
            public final void LJIIJ(String[] strArr, String[] strArr2) {
                LJIIL("composerSetNodesWithExtra", strArr.toString());
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerSetNodesWithTags(strArr, strArr.length, strArr2);
                }
            }

            public final void LJIIL(String str2, String str3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                YE1.LIZLLL(LIZ, this.LIZIZ, "][", str2, "]: ");
                if (str3 == null) {
                    str3 = "";
                }
                JBR.LJIIJ(LIZ, str3, LIZ, "composer_handler");
            }

            @Override // X.C0WB
            public final void setRenderCacheString(String str2, String value) {
                o.LJIIIZ(value, "value");
                LJIIL("setRenderCacheString", null);
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.setRenderCacheString(str2, value);
                }
            }

            @Override // X.C0WB
            public final void LIZIZ(String[] paths, String[] nodeTags, float[] fArr) {
                o.LJIIIZ(paths, "paths");
                o.LJIIIZ(nodeTags, "nodeTags");
                LJIIL("composerUpdateMultipleNodes", paths.toString());
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerUpdateMultipleNodes(paths.length, paths, nodeTags, fArr);
                }
            }

            @Override // X.C0WB
            public final void LIZJ(String[] oldNodePaths, String[] newNodePaths, String[] strArr) {
                o.LJIIIZ(oldNodePaths, "oldNodePaths");
                o.LJIIIZ(newNodePaths, "newNodePaths");
                LJIIL("composerReplaceNodesWithTags", newNodePaths.toString());
                for (String str2 : newNodePaths) {
                    ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).updateEffectAddTime(str2);
                }
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerReplaceNodesWithTags(oldNodePaths, oldNodePaths.length, newNodePaths, newNodePaths.length, strArr);
                }
            }

            @Override // X.C0WB
            public final void composerCheckNodeExclusion(String str2, String str3, int[] iArr) {
                LJIIL("composerCheckNodeExclusion", str2);
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerCheckNodeExclusion(str2, str3, iArr);
                }
            }

            @Override // X.C0WB
            public final void composerUpdateNode(String str2, String str3, float f) {
                LJIIL("composerUpdateNode", String.valueOf(str2));
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.composerUpdateNode(str2, str3, f);
                }
            }

            @Override // X.C0WB
            public final void LIZLLL(int i, int i2, String str2, String str3) {
                LJIIL("setInputText", null);
                IFilterManager iFilterManager2 = this.LIZ;
                if (iFilterManager2 != null) {
                    iFilterManager2.setInputText(str2, i, i2, str3);
                }
            }
        };
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveDialogFragment getEffectNewDialogFragment(Context context, DataChannel dataChannel) {
        if (BeautyPanelMemoryOptSetting.INSTANCE.enable()) {
            o.LJIIIZ(context, "context");
            o.LJIIIZ(dataChannel, "dataChannel");
            C35721ai c35721ai = C07510Rf.LIZJ;
            if (c35721ai != null) {
                LiveEffectNewDialogFragmentOpt liveEffectNewDialogFragmentOpt = new LiveEffectNewDialogFragmentOpt();
                liveEffectNewDialogFragmentOpt.LJLIL = c35721ai;
                return liveEffectNewDialogFragmentOpt;
            }
            C35721ai c35721ai2 = new C35721ai(context, dataChannel);
            C07510Rf.LIZJ = c35721ai2;
            LiveEffectNewDialogFragmentOpt liveEffectNewDialogFragmentOpt2 = new LiveEffectNewDialogFragmentOpt();
            liveEffectNewDialogFragmentOpt2.LJLIL = c35721ai2;
            return liveEffectNewDialogFragmentOpt2;
        }
        return new LiveEffectNewDialogFragment();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveWidget getLiveBGMMiniWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        return new LiveBGMMiniWidget(interfaceC88472Yns, interfaceC88472Yns2);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveDialogFragment getLiveGoalBackgroundDialogFragment(JSONObject params, VideoSize videoSize) {
        o.LJIIIZ(params, "params");
        LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = new LiveGoalBackgroundDialogFragment(0);
        liveGoalBackgroundDialogFragment.LJZ = videoSize;
        liveGoalBackgroundDialogFragment.LJLIL = params;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("gift_icon_");
        LIZ.append(params.optString("gift_icon_id"));
        LIZ.append(".png");
        liveGoalBackgroundDialogFragment.LJLLLLLL = X1D.LIZIZ(LIZ);
        liveGoalBackgroundDialogFragment.LJLJI = params.optBoolean("isAuditPass");
        liveGoalBackgroundDialogFragment.LJLJJI = params.optString("extra");
        String optString = params.optString("schema");
        o.LJIIIIZZ(optString, "params.optString(SCHEMA)");
        liveGoalBackgroundDialogFragment.LJLJJL = optString;
        LogParams logParams = C31701Mg.LIZIZ;
        o.LJIIIZ(logParams, "<set-?>");
        C31701Mg.LIZJ = logParams;
        String optString2 = params.optString("entrance");
        Integer valueOf = Integer.valueOf(params.optInt("is_first_guide"));
        String optString3 = params.optString("setting_status");
        String optString4 = params.optString("goal_type");
        String optString5 = params.optString("stream_goal_id");
        String optString6 = params.optString("gift_icon_id");
        Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GOAL_EFFECT_POSITION.value");
        int intValue = LIZJ.intValue();
        LogParams logParams2 = C31701Mg.LIZIZ;
        C31701Mg.LIZIZ = new LogParams(optString2, valueOf, optString3, optString4, optString5, optString6, intValue, logParams2.isAdjust, logParams2.dragMode, C30725C4b.LIZ());
        return liveGoalBackgroundDialogFragment;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveWidget getLiveSoundEffectMiniWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        return new SoundEffectMiniWidget(interfaceC88472Yns, interfaceC88472Yns2);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveWidget getLiveStickerShortCutWidget(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        return new StickerShortCutWidget(interfaceC88472Yns, interfaceC88472Yns2);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final BaseFragment getMultiGuestEffectFragment(InterfaceC31981Ni composerManagerB, InterfaceC08180Tu callback) {
        o.LJIIIZ(composerManagerB, "composerManagerB");
        o.LJIIIZ(callback, "callback");
        LiveMultiGuestBeautyEffectFragment liveMultiGuestBeautyEffectFragment = new LiveMultiGuestBeautyEffectFragment();
        liveMultiGuestBeautyEffectFragment.LJLJI = callback.LIZLLL();
        liveMultiGuestBeautyEffectFragment.LJLILLLLZI = composerManagerB;
        liveMultiGuestBeautyEffectFragment.LJLJJL = callback.LJ();
        liveMultiGuestBeautyEffectFragment.LJLJJLL = callback;
        return liveMultiGuestBeautyEffectFragment;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void restoreMultiGuestEffectToLiveCoreForGuest(LifecycleCoroutineScope lifecycleCoroutineScope, InterfaceC31981Ni composerManagerB) {
        o.LJIIIZ(composerManagerB, "composerManagerB");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("restoreMultiGuestEffectToLiveCoreForGuest, lifecycleCoroutineScope=");
        LIZ.append(lifecycleCoroutineScope);
        LIZ.append(", composerManagerB=");
        LIZ.append(composerManagerB);
        C0NB.LJIIIZ("LiveMultiGuestEffectFetchUtils", X1D.LIZIZ(LIZ));
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = (LiveSmallItemBeautyViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C37301dG(new C44171oL("liveguestbeauty", false))).get(LiveSmallItemBeautyViewModel.class);
        if (lifecycleCoroutineScope != null) {
            XKX.LIZLLL(lifecycleCoroutineScope, null, null, new C54402Bo(liveSmallItemBeautyViewModel, composerManagerB, null), 3);
            XKX.LIZLLL(lifecycleCoroutineScope, null, null, new C2BV(liveSmallItemBeautyViewModel, null), 3);
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final InterfaceC08160Ts createMagicGestureEffectAnchorHelper(DataChannel dataChannel, View view, InterfaceC08140Tq interfaceC08140Tq) {
        return new C32241Oi(dataChannel, view, interfaceC08140Tq);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0TW, X.1Gs, O] */
    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final C0TW getLiveEffectPalletHandler(WeakReference<DataChannel> dataChannel, WeakReference<Fragment> weakReference, InterfaceC08020Te interfaceC08020Te) {
        o.LJIIIZ(dataChannel, "dataChannel");
        ?? c30261Gs = new C30261Gs(dataChannel, weakReference, interfaceC08020Te);
        DataChannel dataChannel2 = dataChannel.get();
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C54562Ce.class)).LIZ = c30261Gs;
        }
        return c30261Gs;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void showEffectTextInputDialog(DataChannel dataChannel, C0YJ effectTextMessage, InterfaceC88472Yns<Boolean, C76800UCe> listener) {
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            EffectTextInputFragment effectTextInputFragment = new EffectTextInputFragment();
            o.LJIIIZ(listener, "listener");
            effectTextInputFragment.LJLJI = listener;
            o.LJIIIZ(effectTextMessage, "effectTextMessage");
            effectTextInputFragment.LJLJJI = effectTextMessage;
            effectTextInputFragment.show(fragmentManager, C16880lQ.LJLLJ(EffectTextInputFragment.class));
        }
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final View getMultiGuestFullStickerListView(Fragment fragment, ViewGroup viewGroup, int i, IFilterManager iFilterManager, C0WF c0wf, C11060c2 c11060c2) {
        return new MultiGuestStickerDialogView(fragment, viewGroup, i, iFilterManager, c0wf, c11060c2).LJ();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final View getMultiGuestStickerListView(Fragment fragment, ViewGroup viewGroup, int i, IFilterManager iFilterManager, C0WF c0wf, C11070c3 c11070c3) {
        return new MultiGuestStickerListView(fragment, viewGroup, i, iFilterManager, c0wf, c11070c3).LJ();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final void showStickerPanel(Context context, DataChannel dataChannel, boolean z, InterfaceC30494Bxy listener, boolean z2, boolean z3) {
        ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(listener, "listener");
        if (z) {
            dataChannel.qv0(ShowStickerShortCutPanelEvent.class, new C1MX(listener, false, z2, z3));
            return;
        }
        if (C07510Rf.LIZ == null) {
            ViewOnLayoutChangeListenerC30741Io viewOnLayoutChangeListenerC30741Io2 = new ViewOnLayoutChangeListenerC30741Io(context, dataChannel);
            C07510Rf.LIZ = viewOnLayoutChangeListenerC30741Io2;
            viewOnLayoutChangeListenerC30741Io2.LJLLL = listener;
        }
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager == null || (viewOnLayoutChangeListenerC30741Io = C07510Rf.LIZ) == null) {
            return;
        }
        LiveEffectContainerDialog liveEffectContainerDialog = new LiveEffectContainerDialog();
        liveEffectContainerDialog.LJLIL = viewOnLayoutChangeListenerC30741Io;
        liveEffectContainerDialog.show(fragmentManager, C16880lQ.LJLLJ(ViewOnLayoutChangeListenerC30741Io.class));
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public final LiveDialogFragment getLiveBgDialogFragment(Context context, DataChannel dataChannel, String dialogType, InterfaceC30594Bza bgEffectLogManager, InterfaceC30494Bxy interfaceC30494Bxy, View.OnClickListener onClickListener, InterfaceC28989BZh interfaceC28989BZh, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(dialogType, "dialogType");
        o.LJIIIZ(bgEffectLogManager, "bgEffectLogManager");
        if (dataChannel.kv0(C29494Bhq.class) != null) {
            if (C78886Uxe.LJJIZ(dialogType)) {
                C07510Rf.LIZLLL = bgEffectLogManager;
                if (C07510Rf.LIZIZ == null) {
                    C1Q6 c1q6 = new C1Q6(context, dataChannel, dialogType, onClickListener, interfaceC28989BZh, str);
                    if (interfaceC30494Bxy != null) {
                        c1q6.LJZI = interfaceC30494Bxy;
                    }
                    c1q6.LJZL = bgEffectLogManager;
                    c1q6.LJZ.LJLLI = bgEffectLogManager;
                    C07510Rf.LIZIZ = c1q6;
                }
                LiveBgDialogFragment liveBgDialogFragment = new LiveBgDialogFragment();
                C1Q6 c1q62 = C07510Rf.LIZIZ;
                if (c1q62 != null) {
                    liveBgDialogFragment.LJLIL = c1q62;
                    return liveBgDialogFragment;
                }
                return liveBgDialogFragment;
            }
            C07510Rf.LJ = bgEffectLogManager;
            C1Q6 c1q63 = new C1Q6(context, dataChannel, dialogType, onClickListener, interfaceC28989BZh, str);
            if (interfaceC30494Bxy != null) {
                c1q63.LJZI = interfaceC30494Bxy;
            }
            c1q63.LJZL = bgEffectLogManager;
            c1q63.LJZ.LJLLI = bgEffectLogManager;
            LiveBgDialogFragment liveBgDialogFragment2 = new LiveBgDialogFragment();
            liveBgDialogFragment2.LJLIL = c1q63;
            return liveBgDialogFragment2;
        }
        return null;
    }
}
