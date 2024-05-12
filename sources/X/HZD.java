package X;

import Y.AObjectS86S0100000_7;
import Y.ARunnableS43S0100000_7;
import Y.IDLListenerS194S0100000_7;
import Y.IDRunnableS6S0101000;
import android.os.Bundle;
import android.os.Looper;
import android.widget.FrameLayout;
import com.bytedance.bae.router.AudioRouteDeviceManager;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* loaded from: classes8.dex */
public final /* synthetic */ class HZD implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        AVMusicWaveBean LJIIL;
        AVMusic extractAVMusic;
        InterfaceC45863HzH interfaceC45863HzH;
        switch (this.LJLIL) {
            case 0:
                this.LJLILLLLZI.getClass();
                F73.LIZ = new C28646BMc();
                return;
            case 1:
                ((AudioRouteDeviceManager) this.LJLILLLLZI).restartBluetoothScoAsynTask();
                return;
            case 2:
                ((InterfaceC37489EnV) this.LJLILLLLZI).release();
                return;
            case 3:
                ((CrossPlatformActivity) this.LJLILLLLZI).finish();
                return;
            case 4:
                final ExteriorVideoRecordScene exteriorVideoRecordScene = (ExteriorVideoRecordScene) this.LJLILLLLZI;
                C45848Hz2 c45848Hz2 = exteriorVideoRecordScene.LLI;
                H78.LIZ("addFragment onFragmentActivityCreated PlanC");
                V0N.LJJIJ(exteriorVideoRecordScene.LLIIIILZ);
                if (c45848Hz2 instanceof WLW) {
                    exteriorVideoRecordScene.LLFF = (FrameLayout) exteriorVideoRecordScene.findViewById(R.id.fkn);
                    H78.LIZ("addFragment onFragmentActivityCreated initFilterModule");
                    exteriorVideoRecordScene.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS194S0100000_7(exteriorVideoRecordScene, 1));
                    if (exteriorVideoRecordScene.LLILII) {
                        final I0N LLLJL = exteriorVideoRecordScene.LLLJL();
                        LLLJL.sG();
                        LLLJL.Yq();
                        if (C45866HzK.LIZIZ()) {
                            C45857HzB.LIZ(new HZL(LLLJL, exteriorVideoRecordScene.LJZ));
                        } else {
                            if (HZZ.LIZ()) {
                                interfaceC45863HzH = new HZL(LLLJL, exteriorVideoRecordScene.LJZ);
                            } else {
                                interfaceC45863HzH = new InterfaceC45863HzH() { // from class: X.HZG
                                    @Override // X.InterfaceC45863HzH
                                    public final /* synthetic */ boolean LIZ() {
                                        return false;
                                    }

                                    @Override // X.InterfaceC45863HzH
                                    public final void run() {
                                        ExteriorVideoRecordScene exteriorVideoRecordScene2 = ExteriorVideoRecordScene.this;
                                        I0N i0n = LLLJL;
                                        exteriorVideoRecordScene2.getClass();
                                        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                                            i0n.bi0();
                                            return;
                                        }
                                        SafeHandler safeHandler = exteriorVideoRecordScene2.LJZ;
                                        Objects.requireNonNull(i0n);
                                        safeHandler.post(new IDRunnableS6S0101000(6, i0n, 23));
                                    }

                                    @Override // X.InterfaceC45863HzH
                                    public final EnumC45752HxU LIZIZ() {
                                        return EnumC45752HxU.P1;
                                    }
                                };
                            }
                            C45857HzB.LIZ(interfaceC45863HzH);
                        }
                        exteriorVideoRecordScene.LLLJL().Lv().init();
                    }
                    if (exteriorVideoRecordScene.LLILIL) {
                        Bundle bundle = exteriorVideoRecordScene.mArguments;
                        if (bundle != null && (((LJIIL = C44172HVg.LJI.LJIIL(bundle.getSerializable("music_wave_data"))) != null && C81995WFz.LJ(LJIIL.getMusicWavePointArray())) || ((extractAVMusic = MusicBeanUtilKt.extractAVMusic(exteriorVideoRecordScene.LJLZ.creativeModel.musicBuzModel)) != null && C81995WFz.LJ(extractAVMusic.getMusicWaveData()) && (LJIIL = WG0.LIZLLL(extractAVMusic)) != null && C81995WFz.LJ(LJIIL.getMusicWavePointArray())))) {
                            exteriorVideoRecordScene.LJLZ.musicWaveBean = WG0.LIZIZ(LJIIL);
                        } else if (exteriorVideoRecordScene.LJLZ.cameraComponentModel.mMusicPath != null) {
                            WG0.LJFF(exteriorVideoRecordScene.LJLZ.cameraComponentModel.mMusicPath, new WG2() { // from class: X.HZI
                                @Override // X.WG2
                                public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                                    ExteriorVideoRecordScene exteriorVideoRecordScene2 = ExteriorVideoRecordScene.this;
                                    if (aVMusicWaveBean != null) {
                                        exteriorVideoRecordScene2.LJLZ.musicWaveBean = WG0.LIZIZ(aVMusicWaveBean);
                                    } else {
                                        exteriorVideoRecordScene2.getClass();
                                    }
                                }
                            });
                        }
                    }
                    ((InterfaceC45979I2t) exteriorVideoRecordScene.LLLL(InterfaceC45979I2t.class)).getBottomTabIndexChangeEvent().LIZIZ(exteriorVideoRecordScene, new AObjectS86S0100000_7(exteriorVideoRecordScene, 59));
                    if (exteriorVideoRecordScene.LJLZ.cameraComponentModel.isRetakeMode) {
                        InterfaceC45995I3j interfaceC45995I3j = (InterfaceC45995I3j) exteriorVideoRecordScene.LLLL(InterfaceC45995I3j.class);
                        interfaceC45995I3j.h5(exteriorVideoRecordScene.LJLZ.LJIILL());
                        interfaceC45995I3j.M3(0);
                        exteriorVideoRecordScene.LLILLL.nQ();
                    }
                    if (exteriorVideoRecordScene.LLFZ) {
                        exteriorVideoRecordScene.LJZ.post(new ARunnableS43S0100000_7(exteriorVideoRecordScene, 31));
                    }
                    if (exteriorVideoRecordScene.mArguments.getBoolean("from_special_plus", false)) {
                        exteriorVideoRecordScene.LJLZ.isSpecialPlusIcon = 1;
                        C2U8.LIZ(new SuperEntranceEvent(3, false));
                        return;
                    } else {
                        exteriorVideoRecordScene.LJLZ.isSpecialPlusIcon = 0;
                        return;
                    }
                }
                return;
            case 5:
                GSR gsr = (GSR) this.LJLILLLLZI;
                gsr.LJIILLIIL(gsr.LLILL);
                return;
            default:
                P6F.LJIJJ((P6F) this.LJLILLLLZI);
                return;
        }
    }

    public /* synthetic */ HZD(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
