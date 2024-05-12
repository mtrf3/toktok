package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.ies.cutsame.prepare.VEConfig;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.CompressConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import defpackage.i0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HTN {
    public final Context LIZ;
    public final ShortVideoContext LIZIZ;
    public final InterfaceC88473Ynt<String, C44124HTk, List<ReturnEcommerceCommentModel>, C76800UCe> LIZJ;
    public final List<ReturnEcommerceCommentModel> LIZLLL;
    public final Float LJ;
    public final Integer LJFF;
    public final SimpleDateFormat LJI;
    public final HD2 LJII;
    public volatile int LJIIIIZZ;
    public volatile XKQ LJIIIZ;
    public final String LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public long LJIIL;

    public final void LIZ() {
        ((ArrayList) this.LIZLLL).clear();
        XKQ xkq = this.LJIIIZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJIIL = 0L;
    }

    public final boolean LJ() {
        if ((this.LJ == null && this.LJIIJJI.getValue() == null) || o.LIZJ(this.LJ, 1.0f) || (o.LIZJ(this.LJ, 0.0f) && this.LJIIJJI.getValue() == null)) {
            return false;
        }
        return true;
    }

    public final String LIZIZ() {
        Locale locale = Locale.getDefault();
        String LJFF = i0.LJFF("%s/VIDEO_%s", ".mp4");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJI.format(new Date()));
        LIZ.append('_');
        this.LJIIIIZZ++;
        LIZ.append(this.LJIIIIZZ);
        return C63144OqK.LIZIZ(new Object[]{this.LJIIJ, X1D.LIZIZ(LIZ)}, 2, locale, LJFF, "format(locale, format, *args)");
    }

    public HTN(Context context, ShortVideoContext shortVideoContext, C44122HTi c44122HTi) {
        Float f;
        CompressConfig compressConfig;
        Float f2;
        CompressConfig compressConfig2;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = context;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = c44122HTi;
        this.LIZLLL = new ArrayList();
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        Integer num = null;
        if (recordPageOptionalConfig != null && (compressConfig2 = recordPageOptionalConfig.compressConfig) != null) {
            f = compressConfig2.videoCompress;
        } else {
            f = null;
        }
        this.LJ = f;
        if (recordPageOptionalConfig != null && (compressConfig = recordPageOptionalConfig.compressConfig) != null && (f2 = compressConfig.imageCompress) != null) {
            num = Integer.valueOf((int) (f2.floatValue() * 100));
        }
        this.LJFF = num;
        this.LJI = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
        HD2 hd2 = new HD2(shortVideoContext.creativeInfo);
        this.LJII = hd2;
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        EnumC43650HBe enumC43650HBe = EnumC43650HBe.RECORD_CACHE_FILE;
        String LIZIZ = C43073GvN.LIZIZ(LJ, creativeInfo, enumC43650HBe, "video", 8);
        this.LJIIJ = LIZIZ;
        this.LJIIJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 223));
        InterfaceC43072GvM LJ2 = C62850Ola.LJ();
        CreativeInfo creativeInfo2 = shortVideoContext.creativeInfo;
        o.LJIIIIZZ(creativeInfo2, "shortVideoContext.creativeInfo");
        hd2.LIZJ(C43073GvN.LIZIZ(LJ2, creativeInfo2, enumC43650HBe, "photo", 8));
        hd2.LIZJ = Bitmap.CompressFormat.JPEG;
        File file = new File(LIZIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.HTN] */
    public final ReturnEcommerceCommentModel LIZJ(String str, MyMediaModel myMediaModel, String str2, int i, String str3) {
        String str4;
        String str5;
        Integer num;
        if (myMediaModel != null) {
            str4 = C44694HgQ.LJIIL(myMediaModel);
        } else {
            str4 = str;
        }
        long LJFF = C44694HgQ.LJFF(str4);
        long LJFF2 = C44694HgQ.LJFF(str4);
        String LJIILIIL = C44694HgQ.LJIILIIL(str4);
        String str6 = "image/jpeg";
        if (LJIILIIL == null) {
            LJIILIIL = "image/jpeg";
        }
        String str7 = "photo";
        ReturnEcommerceCommentModel returnEcommerceCommentModel = new ReturnEcommerceCommentModel(i, str4, str4, Long.valueOf(LJFF), LJFF2, "photo", str4, LJIILIIL);
        if (myMediaModel != null) {
            str5 = new VESize(myMediaModel.width, myMediaModel.height).toString();
        } else {
            str5 = "";
        }
        HTN htn = "if (mediaModel != null) …eight).toString() else \"\"";
        o.LJIIIIZZ(str5, "if (mediaModel != null) …eight).toString() else \"\"");
        try {
            htn = this;
            CameraComponentModel cameraComponentModel = htn.LIZIZ.cameraComponentModel;
            Bitmap LIZ = C42307Gj1.LIZ(str, cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight);
            if (LIZ == null) {
                str7 = str3;
                C44108HSu.LIZJ(htn.LIZIZ, str, "photo", HTE.IMAGE_BITMAP_NULL, str7, System.currentTimeMillis() - htn.LJIIL, str5);
                return returnEcommerceCommentModel;
            }
            Integer num2 = htn.LJFF;
            if (num2 != null && num2.intValue() != 0 && ((num = htn.LJFF) == null || num.intValue() != 100)) {
                boolean LJ = C42307Gj1.LJ(LIZ, new File(str2), htn.LJFF.intValue(), Bitmap.CompressFormat.JPEG);
                LIZ.recycle();
                if (LJ) {
                    C44108HSu.LJFF(htn.LIZIZ, str, str2, "photo", str3, "photo_compress", System.currentTimeMillis() - htn.LJIIL, str5);
                    long LJFF3 = C44694HgQ.LJFF(str4);
                    long LJFF4 = C44694HgQ.LJFF(str2);
                    String LJIILIIL2 = C44694HgQ.LJIILIIL(str2);
                    if (LJIILIIL2 != null) {
                        str6 = LJIILIIL2;
                    }
                    return new ReturnEcommerceCommentModel(i, str4, str2, Long.valueOf(LJFF3), LJFF4, "photo", str2, str6);
                }
                C44108HSu.LIZJ(htn.LIZIZ, str, "photo", HTE.IMAGE_SAVE_BITMAP_WRONG, str3, System.currentTimeMillis() - htn.LJIIL, str5);
                return returnEcommerceCommentModel;
            }
            LIZ.recycle();
            return returnEcommerceCommentModel;
        } catch (OutOfMemoryError unused) {
            C44108HSu.LIZJ(htn.LIZIZ, str, "photo", HTE.IMAGE_BITMAP_OUT_OF_MEMORY_ERROR, str7, System.currentTimeMillis() - htn.LJIIL, str5);
            return returnEcommerceCommentModel;
        }
    }

    public final Object LIZLLL(int i, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        VEUtils.getVideoFrames(str2, new int[]{0}, 0, 0, false, new HTL(this, str2, str3, c84654XKg, str, i));
        return c84654XKg.LIZ();
    }

    public final Object LJFF(final String inputPath, MyMediaModel myMediaModel, final String outputPath, String str, InterfaceC67352kd<? super String> interfaceC67352kd) {
        float f;
        int i;
        int i2;
        boolean z;
        int i3;
        C87278YNe c87278YNe;
        boolean LJIIJ;
        int i4;
        int i5;
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        Context context = this.LIZ;
        String workSpacePath = this.LJIIJ;
        Float f2 = this.LJ;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        VESize vESize = (VESize) this.LJIIJJI.getValue();
        final HTM htm = new HTM(this, myMediaModel, inputPath, str, c84654XKg);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        o.LJIIIZ(workSpacePath, "workSpacePath");
        final VEEditor vEEditor = new VEEditor(workSpacePath);
        MediaUtil mediaUtil = MediaUtil.LIZ;
        C145725nk LIZ = mediaUtil.LIZ(context, inputPath);
        if (LIZ.LJLJJI % 180 != 0) {
            i = LIZ.LJLJI;
            i2 = LIZ.LJLILLLLZI;
        } else {
            i = LIZ.LJLILLLLZI;
            i2 = LIZ.LJLJI;
        }
        if (vESize != null && (i4 = vESize.height) != 0 && (i5 = vESize.width) != 0) {
            float f3 = i;
            float f4 = i5 / f3;
            float f5 = i4;
            float f6 = i2;
            float f7 = f5 / f6;
            if (f4 > f7) {
                f4 = f7;
            }
            i = (int) (f3 * f4);
            i2 = (int) (f6 * f4);
        }
        int LJJII = vEEditor.LJJII(new String[]{inputPath}, new int[]{0}, new int[]{-1}, null, null, null, null, null, null, null, C5NI.VIDEO_OUT_RATIO_ORIGINAL);
        if (LJJII != 0) {
            vEEditor.LJIILIIL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init ve fail code is ");
            LIZ2.append(LJJII);
            htm.LIZ(inputPath, "", X1D.LIZIZ(LIZ2));
        } else {
            final C133135Kj c133135Kj = new C133135Kj(inputPath, outputPath, htm);
            VEConfig vEConfig = C44618HfC.LIZ;
            int i6 = mediaUtil.LIZ(context, inputPath).LJLJJLL;
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3 = i6 * 1024;
            } else {
                i3 = (int) (i6 * f * 1024);
            }
            if (vEConfig.hardware) {
                c87278YNe = new C87278YNe(2);
                c87278YNe.LIZIZ.isSupportHWEncoder = true;
                c87278YNe.LJII(vEConfig.fps);
                int i7 = vEConfig.gopSize;
                VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
                vEVideoEncodeSettings.gopSize = i7;
                vEVideoEncodeSettings.bitrateMode = VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
                vEVideoEncodeSettings.bps = i3;
                c87278YNe.LJI(C44618HfC.LIZ());
                if (i != 0 && i2 != 0) {
                    c87278YNe.LJIIJ(i, i2);
                }
            } else {
                c87278YNe = new C87278YNe(2);
                c87278YNe.LIZIZ.isSupportHWEncoder = false;
                c87278YNe.LJII(vEConfig.fps);
                c87278YNe.LIZIZ.gopSize = vEConfig.gopSize;
                c87278YNe.LJIIIIZZ(15);
                c87278YNe.LIZIZ.enableRemuxVideo = false;
                c87278YNe.LJI(C44618HfC.LIZ());
                if (i != 0 && i2 != 0) {
                    c87278YNe.LJIIJ(i, i2);
                }
            }
            vEEditor.LJJIJLIJ(C145775np.LIZ.getLooper());
            synchronized (vEEditor) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(outputPath);
                LIZ3.append(".tmp");
                final String LIZIZ = X1D.LIZIZ(LIZ3);
                LJIIJ = vEEditor.LJIIJ(LIZIZ, null, c87278YNe.LIZ(), new InterfaceC134045Nw() { // from class: X.5Ki
                    @Override // X.InterfaceC134045Nw
                    public final void onCompileDone() {
                        if (c133135Kj.LIZ) {
                            C152275yJ c152275yJ = C152275yJ.LIZ;
                            File file = new File(LIZIZ);
                            c152275yJ.getClass();
                            C152275yJ.LJIIIIZZ(file);
                        } else {
                            new File(LIZIZ).renameTo(new File(outputPath));
                            InterfaceC133145Kk interfaceC133145Kk = htm;
                            if (interfaceC133145Kk != null) {
                                interfaceC133145Kk.LJFF(inputPath, outputPath);
                            }
                            vEEditor.LJJIJLIJ(null);
                        }
                        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C133115Kh(vEEditor, null), 2);
                    }

                    @Override // X.InterfaceC134045Nw
                    public final void onCompileProgress(float f8) {
                        InterfaceC133145Kk interfaceC133145Kk = htm;
                        if (interfaceC133145Kk != null) {
                            interfaceC133145Kk.LIZIZ();
                        }
                    }

                    @Override // X.InterfaceC134045Nw
                    public final void onCompileError(int i8, int i9, float f8, String str2) {
                        C152275yJ c152275yJ = C152275yJ.LIZ;
                        File file = new File(LIZIZ);
                        c152275yJ.getClass();
                        C152275yJ.LJIIIIZZ(file);
                        InterfaceC133145Kk interfaceC133145Kk = htm;
                        if (interfaceC133145Kk != null) {
                            String str3 = inputPath;
                            String str4 = outputPath;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(i8);
                            LIZ4.append('_');
                            LIZ4.append(i9);
                            interfaceC133145Kk.LIZ(str3, str4, X1D.LIZIZ(LIZ4));
                        }
                        vEEditor.LJJIJLIJ(null);
                        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C133105Kg(vEEditor, null), 2);
                    }
                });
            }
            if (!LJIIJ) {
                htm.LIZ(inputPath, outputPath, "-1");
                vEEditor.LJJIJLIJ(null);
                vEEditor.LJIILIIL();
            }
        }
        return c84654XKg.LIZ();
    }
}
