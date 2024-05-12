package X;

import Y.ACallableS105S0100000_2;
import Y.AObserverS70S0100000_2;
import android.os.Build;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.video2sticker.EditVideoInfo;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import defpackage.e1;
import dmt.av.video.VEPreviewParams;
import kotlin.jvm.internal.o;

/* renamed from: X.5ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143965ku extends C143265jm<InterfaceC144015kz> implements InterfaceC144015kz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLLIL;
    public final VEPreviewParams LLLFZ;
    public final InterfaceC115514g7 LLLI;
    public final InterfaceC115514g7 LLLII;
    public final InterfaceC115514g7 LLLIIII;
    public final InterfaceC115514g7 LLLIIIIL;
    public final InterfaceC115514g7 LLLIIIL;
    public final InterfaceC115514g7 LLLIIL;
    public boolean LLLIILIL;

    static {
        TBT tbt = new TBT(C143965ku.class, "previewMaskApi", "getPreviewMaskApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/mask/Video2StickerPreviewMaskApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLLIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C143965ku.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/topbar/Video2StickerTopBarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143965ku.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/bottombar/Video2StickerBottomBarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C143965ku.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C143965ku.class, "video2StickerModel", "getVideo2StickerModel()Lcom/ss/android/ugc/aweme/creative/model/video2sticker/Video2StickerModel;", 0, c65351Pkp), C61845OOz.LIZJ(C143965ku.class, "videoControllerApi", "getVideoControllerApi()Lcom/ss/android/ugc/aweme/shortvideo/video2sticker/videocontroll/Video2StickerControllerApi;", 0, c65351Pkp)};
    }

    private final VideoPublishEditModel LLLLLJLJLL() {
        return (VideoPublishEditModel) this.LLLIIIIL.LIZ(this, LLLIL[3]);
    }

    private final InterfaceC144495ll LLLLLL() {
        return (InterfaceC144495ll) this.LLLI.LIZ(this, LLLIL[0]);
    }

    private final Video2StickerModel LLLLZI() {
        return (Video2StickerModel) this.LLLIIIL.LIZ(this, LLLIL[4]);
    }

    private final InterfaceC144005ky LLLLZIL() {
        return (InterfaceC144005ky) this.LLLIIL.LIZ(this, LLLIL[5]);
    }

    public final InterfaceC143985kw LLLLLIL() {
        return (InterfaceC143985kw) this.LLLIIII.LIZ(this, LLLIL[2]);
    }

    public final InterfaceC143995kx LLLLLZIL() {
        return (InterfaceC143995kx) this.LLLII.LIZ(this, LLLIL[1]);
    }

    public final void LLLZ() {
        MutableLiveData<Void> mutableLiveData = this.LLIZ;
        o.LJII(mutableLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Unit>");
        mutableLiveData.postValue(null);
        C5MG WS = WS();
        if (WS != null) {
            WS.LJJ().LLLFZ((int) LLLLZI().videoTimeTrimData.startTime, (int) LLLLZI().videoTimeTrimData.endTime);
        }
        LLLLZIL().LK(new C6HV(1, false));
    }

    private final int LLLLLLIL() {
        int LJJIFFI = C32151Nz.LJJIFFI(C78688UuS.LJJIII(this));
        C32151Nz.LJJIFFI(C78688UuS.LJJIII(this));
        if (Build.VERSION.SDK_INT < 23) {
            return LJJIFFI - C81184Vtc.LJFF(getActivity());
        }
        return LJJIFFI;
    }

    private final void LLLLZLLIL() {
        Zq0().observe(this, new AObserverS70S0100000_2(this, 66));
    }

    @Override // X.C143265jm
    public C5MG LJJLIIIJJIZ() {
        C5MG LIZ = C5K2.LIZ(LLLLLJLJLL().getVideoEditorType(), this.LJLJI.LJFF);
        LIZ.LJIL = new InterfaceC134025Nu() { // from class: X.5kv
            @Override // X.InterfaceC134025Nu
            public final void LIZ() {
                if (e1.LIZ(31744, "io_async_editor", true, false)) {
                    C10K.LIZJ(new ACallableS105S0100000_2(C143965ku.this, 15));
                } else {
                    C143965ku.this.LLLZ();
                }
            }
        };
        return LIZ;
    }

    @Override // X.C143265jm
    public int LLJJIJI() {
        NLEEditor LJII;
        int LLJJIJI = super.LLJJIJI();
        C5MG WS = WS();
        if (WS != null) {
            WS.LJJIIJZLJL(C44384HbQ.LJJIIZI(LLLLLJLJLL()));
        }
        String str = LLLLLJLJLL().nleData;
        if (str == null || str.length() == 0) {
            C5MG WS2 = WS();
            if (WS2 != null && (LJII = WS2.LJII(this.LLLFZ)) != null) {
                LLLLZLL(LJII);
                C5MG WS3 = WS();
                if (WS3 != null) {
                    NLEModel LJ = LJII.LJ();
                    o.LJIIIIZZ(LJ, "nleEditor.model");
                    WS3.LJJI(LJ, false);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return LLJJIJI;
    }

    @Override // X.C143265jm
    public void LLLLJI() {
        super.LLLLJI();
        if (this.LLLIILIL) {
            WP();
        }
        this.LLLIILIL = false;
    }

    @Override // X.InterfaceC144015kz
    public VideoPublishEditModel QY() {
        return LLLLLJLJLL();
    }

    @Override // X.InterfaceC144015kz
    public void WP() {
        NLEEditor nLEEditor;
        NLEModel LJ;
        NLETrack mainTrack;
        NLETrackSlot LJIILIIL;
        NLEEditor nLEEditor2;
        NLEModel LJ2;
        InterfaceC153045zY value = Kh().getValue();
        if (value == null) {
            return;
        }
        int i = C144035l1.LIZIZ;
        if (i == 0) {
            i = C81184Vtc.LJ(C78688UuS.LJJIII(this));
        }
        int i2 = C144035l1.LIZ;
        if (i2 == 0) {
            i2 = LLLLLLIL();
        }
        C144035l1.LIZ = i2;
        C144035l1.LIZIZ = i;
        C122034qd LJJI = C17N.LJJI(value);
        if (LJJI != null && (nLEEditor2 = LJJI.LJIIJ) != null && (LJ2 = nLEEditor2.LJ()) != null) {
            LJ2.setCanvasRatio(i / i2);
        }
        VESize LLLLLJIL = LLLLLJIL(i, i2, this.LLLFZ.getCanvasWidth(), this.LLLFZ.getCanvasHeight());
        float LIZIZ = C144025l0.LIZIZ(C1A7.LJIIJJI(LLLLZI()), LLLLLJIL.width, LLLLLJIL.height);
        float LIZJ = (C144035l1.LIZJ() - (i2 / 2)) / C144035l1.LIZ;
        C122034qd LJJI2 = C17N.LJJI(value);
        if (LJJI2 != null && (nLEEditor = LJJI2.LJIIJ) != null && (LJ = nLEEditor.LJ()) != null && (mainTrack = LJ.getMainTrack()) != null && (LJIILIIL = mainTrack.LJIILIIL(0)) != null) {
            LJIILIIL.setScale(LIZIZ);
            LJIILIIL.setTransformY(LIZJ);
        }
        value.LLLF();
        EditVideoInfo editVideoInfo = LLLLZI().editVideoInfo;
        editVideoInfo.initializeScale = LIZIZ;
        editVideoInfo.initializeTransY = LIZJ;
        editVideoInfo.initializeVideoWidth = LLLLLJIL.width;
        editVideoInfo.initializeVideoHeight = LLLLLJIL.height;
        LLLLLL().wc0(true, C144025l0.LIZLLL(LLLLZI().videoCropData.cropRatioMode));
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LLLLZLLIL();
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onResume() {
        super.onResume();
    }

    @Override // X.C143265jm, X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
    }

    private final void LLLLZLL(NLEEditor nLEEditor) {
        NLESegment LJI = nLEEditor.LJ().getMainTrack().LJIILIIL(0).LJI();
        o.LJIIIIZZ(LJI, "nleEditor.model.mainTrac…lotByIndex(0).mainSegment");
        C124574uj.LJJLIIIJJI(LJI, 0.0f);
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLEEditor.LJ().getMainTrack().LJIILIIL(0).LJI());
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        nLEStyCanvas.LIZ(EnumC123894td.COLOR);
        NLEEditorJniJNI.NLEStyCanvas_setColor(nLEStyCanvas.LIZ, nLEStyCanvas, -16777216L);
        LJJ.LJJIII(nLEStyCanvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C143965ku(C82622Wbi diContainer, VEPreviewParams previewParams, InterfaceC88472Yns<? super C140815fp, C76800UCe> componentConfigureBuilder) {
        super(diContainer, previewParams, componentConfigureBuilder, null, 8, 0 == true ? 1 : 0);
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(previewParams, "previewParams");
        o.LJIIIZ(componentConfigureBuilder, "componentConfigureBuilder");
        this.LLLFZ = previewParams;
        this.LLLI = UCI.LJI(getDiContainer(), InterfaceC144495ll.class, null);
        this.LLLII = UCI.LJI(getDiContainer(), InterfaceC143995kx.class, null);
        this.LLLIIII = UCI.LJI(getDiContainer(), InterfaceC143985kw.class, null);
        this.LLLIIIIL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLLIIIL = UCI.LJI(getDiContainer(), Video2StickerModel.class, null);
        this.LLLIIL = UCI.LJI(getDiContainer(), InterfaceC144005ky.class, null);
        this.LLLIILIL = true;
    }

    private final VESize LLLLLJIL(int i, int i2, int i3, int i4) {
        VESize vESize;
        InterfaceC153045zY LJLIIL = LJLIIL();
        if (LJLIIL == null || (vESize = LJLIIL.LLILZ()) == null) {
            vESize = new VESize(0, 0);
        }
        if (vESize.width != 0) {
            return vESize;
        }
        float f = i3;
        float f2 = i4;
        float f3 = f / f2;
        float f4 = i;
        float f5 = i2;
        if (f3 > f4 / f5) {
            vESize.width = i;
            vESize.height = (int) (f4 / f3);
        } else {
            vESize.height = i2;
            vESize.width = (int) (f5 / (f2 / f));
        }
        return vESize;
    }
}
