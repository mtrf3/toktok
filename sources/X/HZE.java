package X;

import Y.AObjectS86S0100000_7;
import Y.AObserverS58S0101000_2;
import Y.ARunnableS12S0101000_8;
import Y.IDLListenerS59S0200000_7;
import android.os.Bundle;
import android.os.Looper;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* loaded from: classes8.dex */
public final /* synthetic */ class HZE implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC45863HzH interfaceC45863HzH;
        AVMusicWaveBean LJIIL;
        AVMusic extractAVMusic;
        switch (this.LJLIL) {
            case 0:
                AbstractC30535Byd abstractC30535Byd = (AbstractC30535Byd) this.LJLILLLLZI;
                DataChannel dataChannel = abstractC30535Byd.LJLIL;
                if (dataChannel != null) {
                    dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, abstractC30535Byd.hashCode(), EnumC29596BjU.DIALOG_BIZ_FIRSTLY_EFFECT_PANEL));
                    return;
                }
                return;
            case 1:
                PortraitAudienceInteractionFragment.tn((PortraitAudienceInteractionFragment) this.LJLILLLLZI);
                return;
            case 2:
                FrescoImageLoaderImpl.lambda$makeImageRequestBuilder$1((W5E) this.LJLILLLLZI);
                return;
            case 3:
                final VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) this.LJLILLLLZI;
                C45848Hz2 c45848Hz2 = videoRecordNewScene.LLIIIILZ;
                H78.LIZ("addFragment onFragmentActivityCreated PlanC");
                V0N.LJJIJ(videoRecordNewScene.LLIIJI);
                if (c45848Hz2 instanceof WLW) {
                    videoRecordNewScene.LLFFF = (FrameLayout) videoRecordNewScene.findViewById(R.id.fkn);
                    H78.LIZ("addFragment onFragmentActivityCreated initFilterModule");
                    Window window = videoRecordNewScene.getWindow();
                    window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS59S0200000_7(window, videoRecordNewScene, 2));
                    final I0N LLLL = videoRecordNewScene.LLLL();
                    LLLL.sG();
                    LLLL.Yq();
                    if (C45866HzK.LIZIZ()) {
                        C45857HzB.LIZ(new HZL(LLLL, videoRecordNewScene.LJZ));
                    } else {
                        if (HZZ.LIZ()) {
                            interfaceC45863HzH = new HZL(LLLL, videoRecordNewScene.LJZ);
                        } else {
                            interfaceC45863HzH = new InterfaceC45863HzH() { // from class: X.HXN
                                @Override // X.InterfaceC45863HzH
                                public final /* synthetic */ boolean LIZ() {
                                    return false;
                                }

                                @Override // X.InterfaceC45863HzH
                                public final void run() {
                                    VideoRecordNewScene videoRecordNewScene2 = VideoRecordNewScene.this;
                                    I0N i0n = LLLL;
                                    videoRecordNewScene2.getClass();
                                    if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                                        i0n.bi0();
                                        return;
                                    }
                                    SafeHandler safeHandler = videoRecordNewScene2.LJZ;
                                    Objects.requireNonNull(i0n);
                                    safeHandler.post(new ARunnableS12S0101000_8(4, i0n, 25));
                                }

                                @Override // X.InterfaceC45863HzH
                                public final EnumC45752HxU LIZIZ() {
                                    return EnumC45752HxU.P1;
                                }
                            };
                        }
                        C45857HzB.LIZ(interfaceC45863HzH);
                    }
                    videoRecordNewScene.LLJIJIL.isLoading().LIZIZ(videoRecordNewScene, new C85807Xlz(videoRecordNewScene, 1));
                    videoRecordNewScene.LLLL().Lv().init();
                    Bundle bundle = videoRecordNewScene.mArguments;
                    if (bundle != null && (((LJIIL = C44172HVg.LJI.LJIIL(bundle.getSerializable("music_wave_data"))) != null && C81995WFz.LJ(LJIIL.getMusicWavePointArray())) || ((extractAVMusic = MusicBeanUtilKt.extractAVMusic(videoRecordNewScene.LJLZ.creativeModel.musicBuzModel)) != null && C81995WFz.LJ(extractAVMusic.getMusicWaveData()) && (LJIIL = WG0.LIZLLL(extractAVMusic)) != null && C81995WFz.LJ(LJIIL.getMusicWavePointArray())))) {
                        videoRecordNewScene.LJLZ.musicWaveBean = WG0.LIZIZ(LJIIL);
                    } else if (videoRecordNewScene.LJLZ.cameraComponentModel.mMusicPath != null) {
                        WG0.LJFF(videoRecordNewScene.LJLZ.cameraComponentModel.mMusicPath, new WG2() { // from class: X.HZJ
                            @Override // X.WG2
                            public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                                VideoRecordNewScene videoRecordNewScene2 = VideoRecordNewScene.this;
                                if (aVMusicWaveBean != null) {
                                    videoRecordNewScene2.LJLZ.musicWaveBean = WG0.LIZIZ(aVMusicWaveBean);
                                } else {
                                    videoRecordNewScene2.getClass();
                                }
                            }
                        });
                    }
                    InterfaceC45979I2t interfaceC45979I2t = (InterfaceC45979I2t) videoRecordNewScene.LLLLIIIILLL(InterfaceC45979I2t.class);
                    ShortVideoContext shortVideoContext = videoRecordNewScene.LJLZ;
                    if (shortVideoContext != null) {
                        if (videoRecordNewScene.LLIIIILZ == null || interfaceC45979I2t == null) {
                            C77413UZt.LJIL(shortVideoContext.shootWay);
                        } else {
                            interfaceC45979I2t.isZTLiveSwitch();
                            C77413UZt.LJIL(videoRecordNewScene.LJLZ.shootWay);
                        }
                    }
                    C44284HZo.LIZJ.LIZIZ(videoRecordNewScene.LJLZ.liveSourceParams).observe(videoRecordNewScene, new AObserverS58S0101000_2(2, videoRecordNewScene, 17));
                    interfaceC45979I2t.getBottomTabIndexChangeEvent().LIZIZ(videoRecordNewScene, new AObjectS86S0100000_7(videoRecordNewScene, 75));
                    if (videoRecordNewScene.LJLZ.cameraComponentModel.isRetakeMode) {
                        InterfaceC45995I3j interfaceC45995I3j = (InterfaceC45995I3j) videoRecordNewScene.LLLLIIIILLL(InterfaceC45995I3j.class);
                        interfaceC45995I3j.h5(videoRecordNewScene.LJLZ.LJIILL());
                        interfaceC45995I3j.M3(0);
                        videoRecordNewScene.LLJIJIL.nQ();
                    }
                    InterfaceC45999I3n interfaceC45999I3n = (InterfaceC45999I3n) videoRecordNewScene.LLLLIIIILLL(InterfaceC45999I3n.class);
                    if (interfaceC45999I3n != null) {
                        interfaceC45999I3n.lJ(videoRecordNewScene.LLI);
                    }
                    if (videoRecordNewScene.mArguments.getBoolean("from_special_plus", false)) {
                        videoRecordNewScene.LJLZ.isSpecialPlusIcon = 1;
                        C2U8.LIZ(new SuperEntranceEvent(3, false));
                        return;
                    } else {
                        videoRecordNewScene.LJLZ.isSpecialPlusIcon = 0;
                        return;
                    }
                }
                return;
            case 4:
                IV5.LJIIZILJ((IV5) this.LJLILLLLZI);
                return;
            default:
                ((LiveStream) this.LJLILLLLZI).lambda$startVideoCapture$4();
                return;
        }
    }

    public /* synthetic */ HZE(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
