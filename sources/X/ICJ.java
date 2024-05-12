package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.sticker.presenter.handler.StickerVideoStatusHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS81S1100000_14;
import kotlin.jvm.internal.IDqS184S0200000_7;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ICJ implements InterfaceC46236ICq {
    public final C29S LIZ;
    public final CreativeInfo LIZIZ;
    public final InterfaceC82086WJm LIZJ;
    public final I3X LIZLLL;
    public final InterfaceC83727WtX LJ;
    public final I0N LJFF;
    public final C82622Wbi LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final ViewModelProvider LJIILJJIL;
    public final C62822Ol8 LJIILL;
    public final C62822Ol8 LJIILLIIL;

    @Override // X.InterfaceC46236ICq
    public final void LIZ() {
        this.LJII = true;
    }

    @Override // X.InterfaceC46236ICq
    public final void LIZIZ() {
        if (!this.LJIIJJI) {
            return;
        }
        LJIIL(this.LIZ, this.LJIIJ, this.LJIIIIZZ, this.LJIIIZ);
    }

    @Override // X.InterfaceC46236ICq
    public final void LIZJ() {
        this.LJIIJ = "backGroundInput";
    }

    @Override // X.InterfaceC46236ICq
    public final void LJ() {
        this.LJII = this.LJIIJJI;
    }

    @Override // X.InterfaceC46236ICq
    public final void LJI() {
        if (!this.LJIIJJI) {
            return;
        }
        LJIIL(this.LIZ, null, null, null);
        this.LJII = this.LJIIJJI;
    }

    @Override // X.InterfaceC46236ICq
    public final void LJIIIIZZ() {
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) this.LJIILJJIL.get(ShortVideoContextViewModel.class)).LJLIL;
        if (shortVideoContext == null || !this.LJIIJJI) {
            return;
        }
        HCA hca = shortVideoContext.cameraComponentModel.mDurings;
        o.LJIIIIZZ(hca, "it.durings");
        BackgroundVideo backgroundVideo = shortVideoContext.cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo != null) {
            Iterator<TimeSpeedModelExtension> it = hca.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (o.LJ(it.next().getBackgroundVideo(), backgroundVideo)) {
                    z = false;
                }
            }
            if (z) {
                HHI.LIZ(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
            }
        }
        shortVideoContext.cameraComponentModel.curBackgroundVideo = null;
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        LJIIL(this.LIZ, null, null, null);
        H78.LIZ("BackgroundVideo remove BGV");
        this.LJIIJJI = false;
        this.LJII = false;
        LJIIJ(0L);
    }

    @Override // X.InterfaceC46236ICq
    public final void LIZLLL(Double d) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (this.LJIIJJI) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("BackgroundVideo set speed：");
                LIZ.append(doubleValue);
                H78.LIZ(X1D.LIZIZ(LIZ));
                this.LJ.N9(d.doubleValue());
            }
        }
    }

    @Override // X.InterfaceC46236ICq
    public final void LJFF(Effect faceStickerBean) {
        JSONArray optJSONArray;
        o.LJIIIZ(faceStickerBean, "faceStickerBean");
        if (this.LJII) {
            LJIIJJI(this.LJIIIIZZ, this.LJIIIZ);
            this.LJII = false;
            return;
        }
        boolean LJIILLIIL = ID0.LJIILLIIL(faceStickerBean);
        this.LJIIL = LJIILLIIL;
        String str = "";
        if (LJIILLIIL) {
            ICK ick = new ICK(this.LIZ, this.LIZIZ, faceStickerBean);
            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 536);
            IDqS184S0200000_7 iDqS184S0200000_7 = new IDqS184S0200000_7(this, faceStickerBean, 3);
            aqS157S0100000_7.invoke();
            String LJJJZ = C5YW.LIZIZ().LJJJZ(ick.LIZIZ, "");
            if (!C44687HgJ.LIZIZ(LJJJZ)) {
                C44687HgJ.LJFF(LJJJZ, false);
            }
            String[] strArr = {"", ""};
            if (!TextUtils.isEmpty(ick.LIZJ.getSdkExtra())) {
                try {
                    JSONObject optJSONObject = new JSONObject(ick.LIZJ.getSdkExtra()).optJSONObject("vl");
                    if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("multi_vPath")) != null && optJSONArray.length() > 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("multi_aPath");
                        int LJIJ = C78842Uww.LJIJ(V0Q.Default, C78842Uww.LJJ(0, optJSONArray.length()));
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(ick.LIZJ.getUnzipPath());
                        LIZ.append(JSONArrayProtectorUtils.getString(optJSONArray, LJIJ));
                        strArr[0] = X1D.LIZIZ(LIZ);
                        if (optJSONArray2 != null && LJIJ < optJSONArray2.length()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(ick.LIZJ.getUnzipPath());
                            LIZ2.append(JSONArrayProtectorUtils.getString(optJSONArray2, LJIJ));
                            strArr[1] = X1D.LIZIZ(LIZ2);
                        }
                    }
                } catch (Exception unused) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("BackgroundVideo, parse sticker extra fail, ");
                    LIZ3.append(ick.LIZJ);
                    LIZ3.append(".sdkExtra");
                    H78.LIZJ(X1D.LIZIZ(LIZ3));
                }
            }
            String str2 = strArr[0];
            String str3 = strArr[1];
            if (C44687HgJ.LIZIZ(str3)) {
                ick.LJ = str2;
                ick.LJFF = str3;
            } else if (!TextUtils.isEmpty(str2)) {
                String LJI = C173376rF.LJI(str2);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(ick.LIZLLL);
                String str4 = File.separator;
                ick.LJ = C025908h.LIZIZ(LIZ4, str4, LJI, "_background_v", LIZ4);
                StringBuilder LIZ5 = X1D.LIZ();
                YE1.LIZLLL(LIZ5, ick.LIZLLL, str4, LJI, "_background_a");
                ick.LJFF = X1D.LIZIZ(LIZ5);
            }
            if (!C44687HgJ.LIZIZ(ick.LIZLLL) || !C44687HgJ.LIZIZ(ick.LJ) || !C44687HgJ.LIZIZ(ick.LJFF) || VEUtils.getVideoFileInfo(ick.LJ) == null || VEUtils.getAudioFileInfo(ick.LJFF) == null) {
                if (!C44687HgJ.LIZIZ(ick.LIZLLL)) {
                    C44687HgJ.LJFF(ick.LIZLLL, false);
                    if (!C44687HgJ.LIZIZ(ick.LIZLLL)) {
                        H78.LIZJ("BackgroundVideo, splitDir create fail");
                        iDqS184S0200000_7.invoke(Boolean.FALSE, ick.LJI, ick.LJII);
                        return;
                    }
                }
                if (!C44687HgJ.LIZIZ(str2)) {
                    H78.LIZJ("BackgroundVideo, default video not exist");
                    iDqS184S0200000_7.invoke(Boolean.FALSE, ick.LJI, ick.LJII);
                    return;
                }
                ISDKService sDKService = AVServiceImpl.LIZ().getSDKService();
                if (sDKService == null) {
                    return;
                }
                Context LLLLJI = C16880lQ.LLLLJI(C60903NvH.LJ);
                o.LJIIIIZZ(LLLLJI, "getApplication().applicationContext");
                sDKService.split(LLLLJI, 1000, ick.LIZLLL, str2, ick.LJFF, ick.LJ, new ICN(ick, iDqS184S0200000_7));
                return;
            }
            C44694HgQ.LIZJ(ick.LJ, ick.LJI);
            C44687HgJ.LIZLLL(ick.LJFF, ick.LJII);
            iDqS184S0200000_7.invoke(Boolean.TRUE, ick.LJI, ick.LJII);
            return;
        }
        ICL icl = new ICL(this.LIZ, this.LIZIZ, faceStickerBean);
        AqS157S0100000_7 aqS157S0100000_72 = new AqS157S0100000_7(this, 537);
        IDqS184S0200000_7 iDqS184S0200000_72 = new IDqS184S0200000_7(this, faceStickerBean, 4);
        aqS157S0100000_72.invoke();
        String LJJJZ2 = C5YW.LIZIZ().LJJJZ(icl.LIZIZ, "");
        if (!C44687HgJ.LIZIZ(LJJJZ2)) {
            C44687HgJ.LJFF(LJJJZ2, false);
        }
        if (!C44687HgJ.LIZIZ(icl.LIZLLL) || !C44687HgJ.LIZIZ(icl.LJ) || !C44687HgJ.LIZIZ(icl.LJFF) || VEUtils.getVideoFileInfo(icl.LJ) == null || VEUtils.getAudioFileInfo(icl.LJFF) == null) {
            if (!C44687HgJ.LIZIZ(icl.LIZLLL)) {
                C44687HgJ.LJFF(icl.LIZLLL, false);
                if (!C44687HgJ.LIZIZ(icl.LIZLLL)) {
                    H78.LIZJ("BackgroundVideo, splitDir create fail");
                    iDqS184S0200000_72.invoke(Boolean.FALSE, icl.LJI, icl.LJII);
                    return;
                }
            }
            try {
                JSONObject optJSONObject2 = new JSONObject(icl.LIZJ.getSdkExtra()).optJSONObject("vl");
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(icl.LIZJ.getUnzipPath());
                LIZ6.append(optJSONObject2.optString("vPath"));
                str = X1D.LIZIZ(LIZ6);
            } catch (Exception unused2) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("BackgroundVideo, parse sticker extra fail, ");
                LIZ7.append(icl.LIZJ);
                LIZ7.append(".sdkExtra");
                H78.LIZJ(X1D.LIZIZ(LIZ7));
            }
            if (!C44687HgJ.LIZIZ(str)) {
                H78.LIZJ("BackgroundVideo, default video not exist");
                iDqS184S0200000_72.invoke(Boolean.FALSE, icl.LJI, icl.LJII);
                return;
            }
            ISDKService sDKService2 = AVServiceImpl.LIZ().getSDKService();
            if (sDKService2 == null) {
                return;
            }
            Context LLLLJI2 = C16880lQ.LLLLJI(C60903NvH.LJ);
            o.LJIIIIZZ(LLLLJI2, "getApplication().applicationContext");
            sDKService2.split(LLLLJI2, 1000, icl.LIZLLL, str, icl.LJFF, icl.LJ, new ICM(icl, iDqS184S0200000_72));
            return;
        }
        C44694HgQ.LIZJ(icl.LJ, icl.LJI);
        C44687HgJ.LIZLLL(icl.LJFF, icl.LJII);
        iDqS184S0200000_72.invoke(Boolean.TRUE, icl.LJI, icl.LJII);
    }

    public final void LJIIJ(long j) {
        long j2;
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) this.LJIILJJIL.get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "viewModelProvider.get(Sh…s.java).shortVideoContext");
        if (shortVideoContext.LJJIJIIJIL()) {
            return;
        }
        long maxShootingDuration = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration(shortVideoContext.shootMode);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        String str = shortVideoContext.cameraComponentModel.mMusicPath;
        if (extractAVMusic != null && !TextUtils.isEmpty(str)) {
            long LIZ = C44295HZz.LIZ(extractAVMusic, str);
            if (maxShootingDuration > LIZ) {
                maxShootingDuration = LIZ;
            }
            j2 = shortVideoContext.cameraComponentModel.mTotalRecordingTime;
        } else {
            j2 = shortVideoContext.cameraComponentModel.mTotalRecordingTime;
        }
        long j3 = maxShootingDuration - j2;
        if (!this.LJIIL && j > 0) {
            if (j3 <= j) {
                j = j3;
            }
            j3 = j;
        }
        long j4 = shortVideoContext.cameraComponentModel.mTotalRecordingTime + j3;
        C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().resolveMaxDurationFor3MinWithMusic(shortVideoContext, j4);
        shortVideoContext.cameraComponentModel.mMaxDuration = j4;
        this.LIZLLL.vK(new C44302Ha6(j4));
        this.LIZJ.e8().setRecordMaxDuration(j4);
    }

    @Override // X.InterfaceC46236ICq
    public final void LJII(String str, AqS81S1100000_14 aqS81S1100000_14) {
        IVideoLegalCheckerAndToastService videoLegalCheckerAndToastService = AVServiceImpl.LIZ().getVideoLegalCheckerAndToastService(this.LIZ);
        if (videoLegalCheckerAndToastService != null) {
            videoLegalCheckerAndToastService.isVideoLengthOrTypeSupportedAndShowErrToast(str, true, 3600000, aqS81S1100000_14);
        }
    }

    @Override // X.InterfaceC46236ICq
    public final void LJIIIZ(String str, String str2) {
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r4 = r18
            X.I3X r0 = r4.LIZLLL
            X.0IB r0 = r0.Ue0()
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            X.I0N r0 = r4.LJFF
            X.C82398WVm.LIZ(r0)
            return
        L1a:
            androidx.lifecycle.ViewModelProvider r1 = r4.LJIILJJIL
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r0 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r0.LJLIL
            if (r3 != 0) goto L2e
            java.lang.String r0 = "BackgroundVideo set BGV error, shortVideo context is null"
            X.H78.LIZ(r0)
            return
        L2e:
            r8 = r19
            boolean r0 = X.C2060386t.LIZ(r8)
            java.lang.String r2 = " audioPath: "
            r9 = r20
            if (r0 != 0) goto L40
            boolean r0 = X.C2060386t.LIZ(r9)
            if (r0 == 0) goto Lbc
        L40:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "BackgroundVideo path invalid, videoPath: "
            r1.append(r0)
            r1.append(r8)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LIZJ(r0)
        L59:
            r6 = -1
        L5a:
            boolean r0 = r3.LJJIJIIJIL()
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r3.cameraComponentModel
            long r0 = r0.mMaxDuration
            int r5 = (int) r0
            if (r5 <= r6) goto Lba
        L67:
            if (r6 <= 0) goto Lb9
            r4.LJIIIIZZ = r8
            r4.LJIIIZ = r9
            com.ss.android.ugc.aweme.sticker.model.BackgroundVideo r7 = new com.ss.android.ugc.aweme.sticker.model.BackgroundVideo
            long r10 = (long) r6
            boolean r12 = r4.LJIIL
            r13 = 0
            r15 = 0
            r16 = 48
            r1 = r7
            r17 = r15
            r7.<init>(r8, r9, r10, r12, r13, r15, r16, r17)
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r3.cameraComponentModel
            r0.curBackgroundVideo = r1
            r4.LJIIJ(r10)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "BackgroundVideo set BGV, videoPath: "
            r1.append(r0)
            r1.append(r8)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LIZ(r0)
            X.29S r1 = r4.LIZ
            java.lang.String r0 = r4.LJIIJ
            r4.LJIIL(r1, r0, r8, r9)
            X.WJm r0 = r4.LIZJ
            X.WaC r0 = r0.getSpeed()
            float r0 = r0.value()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.LIZLLL(r0)
            r0 = 1
            r4.LJIIJJI = r0
        Lb9:
            return
        Lba:
            r6 = r5
            goto L67
        Lbc:
            kotlin.jvm.internal.o.LJI(r8)
            com.ss.android.vesdk.VEUtils$VEVideoFileInfo r0 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r8)
            if (r0 == 0) goto Lc8
            int r6 = r0.duration
            goto L5a
        Lc8:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "BackgroundVideo getVideoInfo fail, videoPath: "
            r1.append(r0)
            r1.append(r8)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H78.LIZJ(r0)
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ICJ.LJIIJJI(java.lang.String, java.lang.String):void");
    }

    public final void LJIIL(C29S c29s, String str, String str2, String str3) {
        Boolean hasStop = this.LIZLLL.Ue0().LIZ();
        o.LJIIIIZZ(hasStop, "hasStop");
        if (hasStop.booleanValue()) {
            this.LJ.R9(c29s, str, str2, str3);
        }
        I0N i0n = this.LJFF;
        o.LJIIIZ(i0n, "<this>");
        F4V LLLIIII = i0n.LLLIIII(ICP.INSTANCE);
        if (!(LLLIIII instanceof StickerVideoStatusHandler)) {
            LLLIIII = null;
        }
        StickerVideoStatusHandler stickerVideoStatusHandler = (StickerVideoStatusHandler) LLLIIII;
        if (stickerVideoStatusHandler == null || !ID0.LJIILLIIL(stickerVideoStatusHandler.LJLILLLLZI)) {
            return;
        }
        stickerVideoStatusHandler.LJLJJL = false;
        if (stickerVideoStatusHandler.LJLJI == 1) {
            stickerVideoStatusHandler.LJLJJLL.start();
        } else {
            stickerVideoStatusHandler.LJLJJLL.pause();
        }
    }

    public ICJ(C29S activity, CreativeInfo creativeInfo, InterfaceC82086WJm cameraApi, I3X recordControlApi, InterfaceC83727WtX effectController, C46193IAz stickerApi, C82622Wbi diContainer) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraApi, "cameraApi");
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(effectController, "effectController");
        o.LJIIIZ(stickerApi, "stickerApi");
        o.LJIIIZ(diContainer, "diContainer");
        this.LIZ = activity;
        this.LIZIZ = creativeInfo;
        this.LIZJ = cameraApi;
        this.LIZLLL = recordControlApi;
        this.LJ = effectController;
        this.LJFF = stickerApi;
        this.LJI = diContainer;
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LJIILIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 534));
        this.LJIILJJIL = (ViewModelProvider) diContainer.LJ(ViewModelProvider.class, null);
        this.LJIILL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 533));
        this.LJIILLIIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 535));
    }
}
