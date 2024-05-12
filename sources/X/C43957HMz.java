package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HMz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43957HMz implements IAVProcessService {
    public C133765Mu LIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final int[] getVideoFileInfo(String str) {
        return C170626mo.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void muteVideo(String inputPath, String outputPath, IAVProcessService.IProcessCallback<Integer> iProcessCallback) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        C43939HMh c43939HMh = new C43939HMh();
        c43939HMh.LIZJ = false;
        c43939HMh.LIZIZ = new HN1(inputPath, outputPath, iProcessCallback);
        c43939HMh.LIZ = new AqS157S0100000_7(iProcessCallback, (IAVProcessService.IProcessCallback<Integer>) 739);
        c43939HMh.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void compressPhoto(String photoPath, Integer num, Integer num2, IAVProcessService.IProcessCallback<String> iProcessCallback) {
        PhotoContext LIZ;
        String str;
        o.LJIIIZ(photoPath, "photoPath");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PhotoServiceMonitor===> enter compressPhoto ");
        LIZ2.append(System.currentTimeMillis());
        H7B.LIZJ(X1D.LIZIZ(LIZ2));
        if (num != null && num2 != null) {
            LIZ = C43877HJx.LIZ(photoPath, new HD2(C44384HbQ.LJJJJJ()), num.intValue(), num2.intValue());
        } else {
            LIZ = C43877HJx.LIZ(photoPath, new HD2(C44384HbQ.LJJJJJ()), 1080, 1920);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("PhotoServiceMonitor===> return compressPhoto ");
        LIZ3.append(System.currentTimeMillis());
        H7B.LIZJ(X1D.LIZIZ(LIZ3));
        if (iProcessCallback != null) {
            if (LIZ == null || (str = LIZ.mPhotoLocalPath) == null) {
                str = null;
            }
            iProcessCallback.finish(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void convertImageToVideo(String imagePath, String musicPath, String videoPath, long j, IAVProcessService.IConvertImageToVideoCallback callback) {
        o.LJIIIZ(imagePath, "imagePath");
        o.LJIIIZ(musicPath, "musicPath");
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(callback, "callback");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imagePath, options);
        int i = options.outWidth;
        if (i <= 0) {
            i = ((Number) C151105wQ.LJIIJJI.getValue()).intValue();
        }
        int i2 = options.outHeight;
        if (i2 <= 0) {
            i2 = ((Number) C151105wQ.LJIIL.getValue()).intValue();
        }
        EditVideoSegment editVideoSegment = new EditVideoSegment("", null, new VideoFileInfo(i, i2, j, 0, 0, 0, 0, 0, 0.0f, 504, null));
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setMMusicPath(musicPath);
        videoPublishEditModel.musicVolume = 1.0f;
        float f = 0.0f;
        videoPublishEditModel.canvasVideoData = new CanvasVideoData(C47261Igj.LJJIJIL(imagePath), null, null, new CanvasExtra(0, i, i2, (int) j, f, f, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, 0L, 0 == true ? 1 : 0, 8177, 0 == true ? 1 : 0), 0, null, 0, 118, null);
        videoPublishEditModel.setPreviewInfo(new C149505tq(i, i2, 12).LIZ(editVideoSegment));
        videoPublishEditModel.setVideoEditorType(11);
        videoPublishEditModel.mVideoCanvasWidth = i;
        videoPublishEditModel.mVideoCanvasHeight = i2;
        C133765Mu LIZIZ = C135215Sj.LIZIZ(videoPublishEditModel, false);
        this.LIZ = LIZIZ;
        C5UF.LIZ(LIZIZ);
        C133765Mu c133765Mu = this.LIZ;
        if (c133765Mu != null) {
            NLEEditor nLEEditor = c133765Mu.LJI().LJIIJ;
            nLEEditor.LIZJ();
            videoPublishEditModel.nleData = nLEEditor.LJIIIIZZ();
        }
        C87278YNe c87278YNe = new C87278YNe(2);
        c87278YNe.LIZIZ.compileType = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4;
        VEVideoEncodeSettings encodeSettings = c87278YNe.LIZ();
        C133765Mu c133765Mu2 = this.LIZ;
        if (c133765Mu2 != null) {
            o.LJIIIIZZ(encodeSettings, "encodeSettings");
            c133765Mu2.LLF(videoPath, null, encodeSettings, new HN2(callback, this, videoPath));
        } else {
            callback.onFailure();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void createWaterMarkImages(String str, String str2, String str3, String str4, boolean z, IAVProcessService.IProcessCallback<String[]> iProcessCallback) {
        C164506cw[] waterMarkImages;
        HH1.LIZ(str, "text", str2, "dir", str3, "commonName");
        if (iProcessCallback != 0) {
            List LJIIJ = C78939UyV.LJIIJ(str4);
            if (C32151Nz.LJJIIJZLJL(LJIIJ)) {
                TypedArray obtainTypedArray = C44172HVg.LIZ.getResources().obtainTypedArray(R.array.bg);
                o.LJIIIIZZ(obtainTypedArray, "application.getResources….array.water_mark_images)");
                int length = obtainTypedArray.length();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    C164506cw c164506cw = new C164506cw();
                    int resourceId = obtainTypedArray.getResourceId(i, 0);
                    Resources resources = C44172HVg.LIZ.getResources();
                    o.LJIIIIZZ(resources, "application.getResources()");
                    Bitmap logo = BitmapFactory.decodeResource(resources, resourceId, null);
                    o.LJIIIIZZ(logo, "logo");
                    c164506cw.LIZ(logo, str, z);
                    arrayList.add(c164506cw);
                }
                obtainTypedArray.recycle();
                waterMarkImages = (C164506cw[]) arrayList.toArray(new C164506cw[0]);
            } else {
                ArrayList arrayList2 = new ArrayList();
                o.LJI(LJIIJ);
                int size = ((ArrayList) LJIIJ).size();
                for (int i2 = 0; i2 < size; i2++) {
                    C164506cw c164506cw2 = new C164506cw();
                    Bitmap logo2 = BitmapFactory.decodeFile(((HN3) ListProtector.get(LJIIJ, i2)).LJLILLLLZI);
                    o.LJIIIIZZ(logo2, "logo");
                    c164506cw2.LIZ(logo2, str, z);
                    arrayList2.add(c164506cw2);
                }
                waterMarkImages = (C164506cw[]) arrayList2.toArray(new C164506cw[0]);
            }
            o.LJIIIZ(waterMarkImages, "waterMarkImages");
            ArrayList arrayList3 = new ArrayList();
            int length2 = waterMarkImages.length;
            for (int i3 = 0; i3 < length2; i3++) {
                String path = new File(str2, C0NY.LIZIZ(str3, i3, ".png")).getPath();
                if (waterMarkImages[i3].LIZIZ(path)) {
                    o.LJIIIIZZ(path, "path");
                    arrayList3.add(path);
                }
            }
            iProcessCallback.finish(arrayList3.toArray(new String[0]));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService
    public final void createWaterMarkImages(int i, int i2, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, IAVProcessService.IProcessCallback<String[]> iProcessCallback) {
        C43588H8u.LIZLLL(str, "text", str2, "dir", str3, "commonName", str4, "waterPicDir");
        if (iProcessCallback != null) {
            HN5 hn5 = new HN5();
            hn5.LIZIZ = str4;
            iProcessCallback.finish(HN0.LIZIZ(HN0.LIZ(i, i2, str, z, z2, z3, new HN4(hn5.LIZ, str4)), str2, str3));
        }
    }
}
