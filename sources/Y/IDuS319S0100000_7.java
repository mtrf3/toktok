package Y;

import X.AbstractC65743Pr9;
import X.C43080GvU;
import X.C43372H0m;
import X.C44694HgQ;
import X.C45146Hni;
import X.C45685HwP;
import X.C45742HxK;
import X.C45743HxL;
import X.C45744HxM;
import X.C60903NvH;
import X.C73433Srt;
import X.C76L;
import X.C78685UuP;
import X.C82573Wav;
import X.EnumC169566l6;
import X.H7B;
import X.HZB;
import X.InterfaceC36395EQd;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.RunnableC65751PrH;
import X.WG0;
import X.WG2;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDuS319S0100000_7 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C45743HxL> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            case 5:
                subscribe$5(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS319S0100000_7(ShortVideoContext shortVideoContext, int i) {
        this.$t = i;
        switch (i) {
            case 1:
                this.l0 = shortVideoContext;
                return;
            default:
                this.l0 = shortVideoContext;
                return;
        }
    }

    public static final void subscribe$0(IDuS319S0100000_7 iDuS319S0100000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        C45685HwP c45685HwP = C45685HwP.LJFF;
        C45744HxM c45744HxM = (C45744HxM) iDuS319S0100000_7.l0;
        c45685HwP.LIZJ(c45744HxM.LJLIL, c45744HxM.LJLILLLLZI, c45744HxM.LJLJI, new C45742HxK((C73433Srt) interfaceC73573Su9, c45744HxM));
    }

    public static final void subscribe$1(IDuS319S0100000_7 iDuS319S0100000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        final ShortVideoContext shortVideoContext = (ShortVideoContext) iDuS319S0100000_7.l0;
        AVMusicWaveBean aVMusicWaveBean = shortVideoContext.musicWaveBean;
        if (TextUtils.isEmpty(shortVideoContext.cameraComponentModel.mMusicPath)) {
            interfaceC73573Su9.onNext(AbstractC65743Pr9.absent());
            interfaceC73573Su9.onComplete();
        } else if (aVMusicWaveBean != null && TextUtils.equals(aVMusicWaveBean.getMusicPath(), shortVideoContext.cameraComponentModel.mMusicPath)) {
            interfaceC73573Su9.onNext(AbstractC65743Pr9.of(aVMusicWaveBean));
            interfaceC73573Su9.onComplete();
        } else {
            final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
            WG0.LJFF(shortVideoContext.cameraComponentModel.mMusicPath, new WG2() { // from class: X.HZC
                @Override // X.WG2
                public final void LIZ(AVMusicWaveBean aVMusicWaveBean2) {
                    ShortVideoContext shortVideoContext2 = ShortVideoContext.this;
                    InterfaceC73573Su9 interfaceC73573Su92 = c73433Srt;
                    shortVideoContext2.musicWaveBean = aVMusicWaveBean2;
                    interfaceC73573Su92.onNext(AbstractC65743Pr9.fromNullable(aVMusicWaveBean2));
                    interfaceC73573Su92.onComplete();
                }
            });
        }
    }

    public static final void subscribe$2(IDuS319S0100000_7 iDuS319S0100000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        String NLEModelRequestParams_getRecKey;
        IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
        NLEModelRequestParams nLEModelRequestParams = (NLEModelRequestParams) iDuS319S0100000_7.l0;
        String str = null;
        if (nLEModelRequestParams != null) {
            str = SmartMovieJniJNI.NLEModelRequestParams_getRecConfig(nLEModelRequestParams.LIZ, nLEModelRequestParams);
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        NLEModelRequestParams nLEModelRequestParams2 = (NLEModelRequestParams) iDuS319S0100000_7.l0;
        if (nLEModelRequestParams2 != null && (NLEModelRequestParams_getRecKey = SmartMovieJniJNI.NLEModelRequestParams_getRecKey(nLEModelRequestParams2.LIZ, nLEModelRequestParams2)) != null) {
            str2 = NLEModelRequestParams_getRecKey;
        }
        LJJLIIIJJI.getAutoCutNLEModel(str, str2).LIZLLL(new AgS124S0100000_7((C73433Srt) interfaceC73573Su9, 26));
    }

    public static final void subscribe$3(IDuS319S0100000_7 iDuS319S0100000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        String str = ((C45146Hni) iDuS319S0100000_7.l0).LIZ;
        if (str != null && C78685UuP.LJJJZ(str)) {
            String str2 = ((C45146Hni) iDuS319S0100000_7.l0).LIZ;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC73573Su9.onNext(str2);
            ((C45146Hni) iDuS319S0100000_7.l0).LIZ = null;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(0);
        linkedHashMap.put("purpose", "AI");
        C43372H0m c43372H0m = new C43372H0m((C73433Srt) interfaceC73573Su9);
        String host = AVApiImpl.LIZJ().LIZ();
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        o.LJIIIIZZ(host, "host");
        C76L<UploadAuthKeyConfig> uploadAuthKeyConfig = ((UploaderRetrofitService) networkService.createRetrofit(host, true, UploaderRetrofitService.class)).getUploadAuthKeyConfig(linkedHashMap);
        uploadAuthKeyConfig.LJFF(new RunnableC65751PrH(uploadAuthKeyConfig, c43372H0m), EnumC169566l6.LJLIL);
    }

    public static final void subscribe$4(IDuS319S0100000_7 iDuS319S0100000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        int i;
        File LIZJ;
        C82573Wav c82573Wav = (C82573Wav) iDuS319S0100000_7.l0;
        CreativeInfo creativeInfo = c82573Wav.LJLJJLL;
        MediaModel media = c82573Wav.LJLIL;
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(media, "media");
        String str = media.fileLocalUriPath;
        o.LJIIIIZZ(str, "media.fileLocalUriPath");
        try {
            ExifInterface LJIIIZ = C44694HgQ.LJIIIZ(str);
            if (LJIIIZ != null) {
                int attributeInt = LJIIIZ.getAttributeInt("Orientation", 1);
                if (attributeInt == 3) {
                    i = 180;
                } else if (attributeInt != 6) {
                    if (attributeInt == 8) {
                        i = 270;
                    }
                } else {
                    i = 90;
                }
                Bitmap LIZLLL = C44694HgQ.LIZLLL(media.fileLocalUriPath, null);
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                if (LIZLLL != null && (LIZJ = C43080GvU.LIZJ(creativeInfo, Bitmap.createBitmap(LIZLLL, 0, 0, LIZLLL.getWidth(), LIZLLL.getHeight(), matrix, true), Bitmap.CompressFormat.JPEG)) != null) {
                    media.fileLocalUriPath = LIZJ.getAbsolutePath();
                }
            }
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("readPictureDegree failed: ");
            LIZ.append(e.getMessage());
            H7B.LIZJ(X1D.LIZIZ(LIZ));
        }
        C82573Wav c82573Wav2 = (C82573Wav) iDuS319S0100000_7.l0;
        c82573Wav2.LLFFF = c82573Wav2.LJLIL.fileLocalUriPath;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inScaled = false;
        C44694HgQ.LIZLLL(c82573Wav2.LLFFF, options);
        int i2 = options.outWidth;
        c82573Wav2.LJZ = i2;
        c82573Wav2.LJZI = options.outHeight;
        c82573Wav2.LJZL = i2;
        C82573Wav c82573Wav3 = (C82573Wav) iDuS319S0100000_7.l0;
        if (c82573Wav3.LJZI <= 0 || c82573Wav3.LJZ <= 0) {
            interfaceC73573Su9.onError(new IllegalStateException("Calculate image size error."));
        } else {
            interfaceC73573Su9.onComplete();
        }
    }

    public static final void subscribe$5(IDuS319S0100000_7 iDuS319S0100000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) iDuS319S0100000_7.l0;
        AVMusicWaveBean aVMusicWaveBean = shortVideoContext.musicWaveBean;
        if (TextUtils.isEmpty(shortVideoContext.cameraComponentModel.mMusicPath)) {
            interfaceC73573Su9.onNext(AbstractC65743Pr9.absent());
            interfaceC73573Su9.onComplete();
        } else if (aVMusicWaveBean != null && TextUtils.equals(aVMusicWaveBean.getMusicPath(), ((ShortVideoContext) iDuS319S0100000_7.l0).cameraComponentModel.mMusicPath)) {
            interfaceC73573Su9.onNext(AbstractC65743Pr9.of(aVMusicWaveBean));
            interfaceC73573Su9.onComplete();
        } else {
            ShortVideoContext shortVideoContext2 = (ShortVideoContext) iDuS319S0100000_7.l0;
            WG0.LJFF(shortVideoContext2.cameraComponentModel.mMusicPath, new HZB(shortVideoContext2, (C73433Srt) interfaceC73573Su9));
        }
    }

    public IDuS319S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
