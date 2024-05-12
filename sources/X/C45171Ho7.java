package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.PairBoolLong;
import com.bytedance.ies.smartmovie.jni.PictureInfo;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.UploadInfo;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecPairBoolLong;
import com.google.gson.Gson;
import com.google.gson.internal.h;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AqS60S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ho7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45171Ho7 extends IMetaInfoDelegate {
    public final Context LIZ;
    public final C62822Ol8 LIZIZ;

    public static void LIZLLL(String msg) {
        o.LJIIIZ(msg, "msg");
    }

    public final C45180HoG LIZIZ() {
        return (C45180HoG) this.LIZIZ.getValue();
    }

    public C45171Ho7(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZIZ(C45179HoF.LJLIL);
    }

    public static boolean LIZ(Meta meta) {
        if (C00F.LIZ(31744, 0, "autocut_image_support_fast_import", true) != 1 && (C00F.LIZ(31744, 0, "autocut_image_support_fast_import", true) != 2 || meta.LJ() > 1920 || meta.LIZJ() > 1920)) {
            return false;
        }
        return true;
    }

    public static CreativeInfo LIZJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMetaInfoDelegate getCreativeInfo: extra = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        try {
            CreativeInfo creativeInfo = (CreativeInfo) new Gson().LJI(str, CreativeInfo.class);
            if (creativeInfo == null) {
                C45049Hm9.LIZ(LogLevel.LEVEL_ERROR, "AutoCutMetaInfoDelegate failed to parse creativeInfo from extra");
                return creativeInfo;
            }
            return creativeInfo;
        } catch (Exception unused) {
            C45049Hm9.LIZ(LogLevel.LEVEL_ERROR, "AutoCutMetaInfoDelegate failed to parse creativeInfo from extra");
            return null;
        }
    }

    public static boolean LJ(Meta meta) {
        return !C1DH.LIZIZ(new VideoSegment(meta.LIZLLL(), (int) meta.LJ(), (int) meta.LIZJ(), (int) meta.LIZIZ()));
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    public final PictureInfo extractorFrame(UploadInfo uploadInfo, String str) {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMetaInfoDelegate extractorFrame: uploadInfo = ");
        LIZ.append(uploadInfo);
        LIZ.append(", extra = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        CreativeInfo LIZJ = LIZJ(str);
        if (LIZJ == null) {
            return new PictureInfo();
        }
        PictureInfo pictureInfo = new PictureInfo();
        if (uploadInfo != null) {
            SmartMovieJniJNI.UploadInfo_isVideo_set(pictureInfo.LIZ, pictureInfo, SmartMovieJniJNI.UploadInfo_isVideo_get(uploadInfo.LIZ, uploadInfo));
            String LIZIZ = uploadInfo.LIZIZ();
            if (LIZIZ == null) {
                LIZIZ = "";
            }
            SmartMovieJniJNI.UploadInfo_path_set(pictureInfo.LIZ, pictureInfo, LIZIZ);
            SmartMovieJniJNI.UploadInfo_duration_set(pictureInfo.LIZ, pictureInfo, SmartMovieJniJNI.UploadInfo_duration_get(uploadInfo.LIZ, uploadInfo));
            SmartMovieJniJNI.UploadInfo_frameTimeStamp_set(pictureInfo.LIZ, pictureInfo, SmartMovieJniJNI.UploadInfo_frameTimeStamp_get(uploadInfo.LIZ, uploadInfo));
            SmartMovieJniJNI.UploadInfo_needFeature_set(pictureInfo.LIZ, pictureInfo, SmartMovieJniJNI.UploadInfo_needFeature_get(uploadInfo.LIZ, uploadInfo));
            SmartMovieJniJNI.UploadInfo_width_set(pictureInfo.LIZ, pictureInfo, SmartMovieJniJNI.UploadInfo_width_get(uploadInfo.LIZ, uploadInfo));
            SmartMovieJniJNI.UploadInfo_height_set(pictureInfo.LIZ, pictureInfo, SmartMovieJniJNI.UploadInfo_height_get(uploadInfo.LIZ, uploadInfo));
            String path = pictureInfo.LIZIZ();
            o.LJIIIIZZ(path, "path");
            long UploadInfo_frameTimeStamp_get = SmartMovieJniJNI.UploadInfo_frameTimeStamp_get(pictureInfo.LIZ, pictureInfo);
            String LIZLLL = C47959Irz.LIZLLL(31744, "autocut_frame_upload_type", "png", true);
            if (o.LJ(LIZLLL, "png") || !o.LJ(LIZLLL, "webp")) {
                str2 = ".png";
            } else {
                str2 = ".webp";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C45087Hml.LJIIIIZZ(LIZJ));
            LIZ2.append(h.LJIIIIZZ(path));
            LIZ2.append('_');
            LIZ2.append(UploadInfo_frameTimeStamp_get);
            LIZ2.append(str2);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (C1B6.LIZIZ(LIZIZ2) && C78496UrM.LIZ(LIZIZ2) >= 1024) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = !SmartMovieJniJNI.UploadInfo_needFeature_get(pictureInfo.LIZ, pictureInfo);
                Bitmap LIZLLL2 = C44694HgQ.LIZLLL(LIZIZ2, options);
                if (LIZLLL2 != null) {
                    i3 = LIZLLL2.getWidth();
                } else {
                    i3 = options.outWidth;
                }
                SmartMovieJniJNI.PictureInfo_resizeWidth_set(pictureInfo.LIZJ, pictureInfo, i3);
                if (LIZLLL2 != null) {
                    i4 = LIZLLL2.getHeight();
                } else {
                    i4 = options.outHeight;
                }
                SmartMovieJniJNI.PictureInfo_resizeHeight_set(pictureInfo.LIZJ, pictureInfo, i4);
                if (SmartMovieJniJNI.UploadInfo_needFeature_get(pictureInfo.LIZ, pictureInfo)) {
                    if (LIZLLL2 != null) {
                        ByteBuffer allocate = ByteBuffer.allocate(LIZLLL2.getByteCount());
                        LIZLLL2.copyPixelsToBuffer(allocate);
                        bArr = allocate.array();
                        o.LJIIIIZZ(bArr, "buf.array()");
                    } else {
                        bArr = new byte[0];
                    }
                    SmartMovieJniJNI.PictureInfo_setData(pictureInfo.LIZJ, pictureInfo, bArr);
                } else {
                    SmartMovieJniJNI.PictureInfo_resizePath_set(pictureInfo.LIZJ, pictureInfo, LIZIZ2);
                }
            } else {
                AqS60S1100000_7 aqS60S1100000_7 = new AqS60S1100000_7(pictureInfo, LIZIZ2, 8);
                if (SmartMovieJniJNI.UploadInfo_isVideo_get(uploadInfo.LIZ, uploadInfo)) {
                    int UploadInfo_width_get = SmartMovieJniJNI.UploadInfo_width_get(uploadInfo.LIZ, uploadInfo);
                    int UploadInfo_height_get = SmartMovieJniJNI.UploadInfo_height_get(uploadInfo.LIZ, uploadInfo);
                    if (UploadInfo_width_get > UploadInfo_height_get) {
                        i2 = (int) (256 * (UploadInfo_width_get / UploadInfo_height_get));
                        i = 256;
                    } else {
                        i = (int) (256 * (UploadInfo_height_get / UploadInfo_width_get));
                        i2 = 256;
                    }
                    VEUtils.getVideoFrames(uploadInfo.LIZIZ(), new int[]{(int) SmartMovieJniJNI.UploadInfo_frameTimeStamp_get(uploadInfo.LIZ, uploadInfo)}, i2, i, true, new HKV(aqS60S1100000_7));
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = false;
                    options2.inSampleSize = C38891fp.LJIIIZ(options2, 256, 256);
                    Bitmap LIZLLL3 = C44694HgQ.LIZLLL(uploadInfo.LIZIZ(), options2);
                    if (LIZLLL3 != null) {
                        aqS60S1100000_7.invoke(HKU.LIZLLL(LIZLLL3, SmartMovieJniJNI.UploadInfo_rotation_get(uploadInfo.LIZ, uploadInfo), 256));
                    } else {
                        aqS60S1100000_7.invoke(null);
                    }
                }
            }
        }
        return pictureInfo;
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    public final Meta getCompressMetaInfo(Meta meta, String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMetaInfoDelegate getCompressMetaInfo: path = ");
        if (meta != null) {
            str2 = meta.LIZLLL();
        } else {
            str2 = null;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        LIZ.append(str2);
        LIZ.append(", extra = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (meta == null) {
            return new Meta();
        }
        CreativeInfo LIZJ = LIZJ(str);
        if (LIZJ == null) {
            return new Meta();
        }
        Meta meta2 = new Meta();
        SmartMovieJniJNI.Meta_setIsVideo(meta2.LIZ, meta2, meta.LJFF());
        SmartMovieJniJNI.Meta_setPath(meta2.LIZ, meta2, C45087Hml.LJIIJ(meta.LIZLLL(), meta.LIZIZ(), meta.LJFF(), LIZJ));
        if (!meta.LJFF() ? !LIZ(meta) && (meta.LJ() > 1920 || meta.LIZJ() > 1920) : LJ(meta)) {
            float max = 1920 / ((float) Math.max(meta.LJ(), meta.LIZJ()));
            meta2.LJIIIIZZ(O6R.LJJIJ(((float) meta.LJ()) * max));
            meta2.LJII(O6R.LJJIJ(((float) meta.LIZJ()) * max));
            SmartMovieJniJNI.Meta_setRotation(meta2.LIZ, meta2, 0L);
        } else {
            meta2.LJIIIIZZ(meta.LJ());
            meta2.LJII(meta.LIZJ());
            SmartMovieJniJNI.Meta_setRotation(meta2.LIZ, meta2, SmartMovieJniJNI.Meta_getRotation(meta.LIZ, meta));
        }
        meta2.LJI(meta.LIZIZ());
        String LIZLLL = meta.LIZLLL();
        if (LIZLLL != null) {
            str3 = LIZLLL;
        }
        SmartMovieJniJNI.Meta_setName(meta2.LIZ, meta2, new File(str3).getName());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutMetaInfoDelegate,getCompressMetaInfo, compress target path = ");
        LIZ2.append(meta2.LIZLLL());
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
        return meta2;
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    public final VecPairBoolLong getFrameTimeStamps(long j, VecMeta vecMeta) {
        int size;
        Meta meta;
        boolean z;
        VecPairBoolLong vecPairBoolLong = new VecPairBoolLong();
        boolean z2 = false;
        if (vecMeta != null && (size = vecMeta.size()) != 0 && j < size && vecMeta != null && (meta = (Meta) ORZ.LJLLLLLL((int) j, vecMeta)) != null) {
            long LIZIZ = meta.LIZIZ();
            if (C45087Hml.LJJIIJ(vecMeta)) {
                long j2 = LIZIZ / 10;
                long j3 = j2 / 2;
                int i = 0;
                do {
                    if (vecPairBoolLong.size() >= 10) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vecPairBoolLong.LIZJ(new PairBoolLong(z, (i * j2) + j3));
                    i++;
                } while (i < 10);
            } else {
                if (j >= 6) {
                    z2 = true;
                }
                vecPairBoolLong.LIZJ(new PairBoolLong(z2, 0L));
            }
        }
        return vecPairBoolLong;
    }

    @Override // com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate
    public final void compressMeta(Meta meta, String str, boolean z, CommonRequestCallback commonRequestCallback) {
        String str2;
        int i;
        int[] iArr;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutMetaInfoDelegate compressImage: path = ");
        if (meta != null) {
            str2 = meta.LIZLLL();
        } else {
            str2 = null;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        LIZ.append(str2);
        LIZ.append(", extra = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        CreativeInfo LIZJ = LIZJ(str);
        if (LIZJ == null) {
            if (commonRequestCallback != null) {
                commonRequestCallback.onFailure(SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "failed to parse creativeInfo from extra", new UnorderedMapStrStr());
                return;
            }
            return;
        }
        if (meta != null) {
            String LIZLLL = meta.LIZLLL();
            boolean z2 = true;
            if (LIZLLL == null || LIZLLL.length() != 0) {
                String dstImage = C45087Hml.LJIIJ(meta.LIZLLL(), meta.LIZIZ(), meta.LJFF(), LIZJ);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("AutoCutMetaInfoDelegate, compressMeta, resizePath = ");
                LIZ2.append(dstImage);
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
                try {
                    StringBuilder LIZ3 = X1D.LIZ();
                    String LIZLLL2 = meta.LIZLLL();
                    if (LIZLLL2 == null) {
                        LIZLLL2 = "";
                    }
                    LIZ3.append(LIZLLL2);
                    LIZ3.append("_isMix=");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    LIZ3.append(i);
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    if (C44687HgJ.LIZIZ(dstImage)) {
                        LIZIZ().LIZJ(LIZIZ, dstImage);
                        if (commonRequestCallback != null) {
                            commonRequestCallback.onSuccess(dstImage);
                        }
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("hit cache, path=");
                        LIZ4.append(meta.LIZLLL());
                        LIZ4.append(", resizePath=");
                        LIZ4.append(dstImage);
                        LIZLLL(X1D.LIZIZ(LIZ4));
                    } else {
                        if (!z) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            String LIZLLL3 = meta.LIZLLL();
                            if (LIZLLL3 == null) {
                                LIZLLL3 = "";
                            }
                            LIZ5.append(LIZLLL3);
                            LIZ5.append("_isMix=1");
                            String LIZIZ2 = X1D.LIZIZ(LIZ5);
                            String LIZ6 = LIZIZ().LIZ(LIZIZ2);
                            if (C44687HgJ.LIZIZ(LIZ6)) {
                                C44694HgQ.LIZJ(LIZ6, dstImage);
                                if (commonRequestCallback != null) {
                                    commonRequestCallback.onSuccess(dstImage);
                                }
                                StringBuilder LIZ7 = X1D.LIZ();
                                LIZ7.append("hit cache, mixKey=");
                                LIZ7.append(LIZIZ2);
                                LIZ7.append(", resizePath=");
                                LIZ7.append(dstImage);
                                LIZLLL(X1D.LIZIZ(LIZ7));
                                return;
                            }
                        }
                        StringBuilder LIZ8 = X1D.LIZ();
                        String LIZLLL4 = meta.LIZLLL();
                        if (LIZLLL4 == null) {
                            LIZLLL4 = "";
                        }
                        LIZ8.append(LIZLLL4);
                        LIZ8.append("_isMix=0");
                        String LIZIZ3 = X1D.LIZIZ(LIZ8);
                        String LIZ9 = LIZIZ().LIZ(LIZIZ3);
                        if (C44687HgJ.LIZIZ(LIZ9)) {
                            C44694HgQ.LIZJ(LIZ9, dstImage);
                            if (commonRequestCallback != null) {
                                commonRequestCallback.onSuccess(dstImage);
                            }
                            StringBuilder LIZ10 = X1D.LIZ();
                            LIZ10.append("hit cache, notMixKey=");
                            LIZ10.append(LIZIZ3);
                            LIZ10.append(", resizePath=");
                            LIZ10.append(dstImage);
                            LIZLLL(X1D.LIZIZ(LIZ10));
                            return;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (!meta.LJFF()) {
                            if (LIZ(meta)) {
                                String LIZLLL5 = meta.LIZLLL();
                                if (LIZLLL5 == null) {
                                    LIZLLL5 = "";
                                }
                                C44694HgQ.LIZJ(LIZLLL5, dstImage);
                                StringBuilder LIZ11 = X1D.LIZ();
                                LIZ11.append("AutoCutMetaInfoDelegate compressMeta: image. FastImportImage cost=");
                                LIZ11.append(System.currentTimeMillis() - currentTimeMillis2);
                                LIZLLL(X1D.LIZIZ(LIZ11));
                            } else {
                                Context context = this.LIZ;
                                String LIZLLL6 = meta.LIZLLL();
                                if (LIZLLL6 == null) {
                                    LIZLLL6 = "";
                                }
                                o.LJIIIZ(context, "context");
                                o.LJIIIZ(dstImage, "dstImage");
                                C45272Hpk.LIZ(context, LIZLLL6, 1920, dstImage);
                                LIZIZ().LIZJ(LIZIZ, dstImage);
                                StringBuilder LIZ12 = X1D.LIZ();
                                LIZ12.append("AutoCutMetaInfoDelegate compressMeta: image. compress cost=");
                                LIZ12.append(System.currentTimeMillis() - currentTimeMillis2);
                                LIZLLL(X1D.LIZIZ(LIZ12));
                                z2 = false;
                            }
                            if (!C44687HgJ.LIZIZ(dstImage)) {
                                if (commonRequestCallback != null) {
                                    if (z2) {
                                        i2 = 1011;
                                    } else {
                                        i2 = 1012;
                                    }
                                    commonRequestCallback.onFailure(i2, C45049Hm9.LJFF(meta), new UnorderedMapStrStr());
                                }
                            } else if (commonRequestCallback != null) {
                                commonRequestCallback.onSuccess(dstImage);
                            }
                        } else if (LJ(meta)) {
                            int LIZIZ4 = (int) meta.LIZIZ();
                            int[] iArr2 = {0};
                            if (z) {
                                iArr = new int[]{Math.min(10000, LIZIZ4)};
                            } else {
                                iArr = new int[]{Math.min(ImagePreloadExperiment.PRIORITY_DEFAULT, LIZIZ4)};
                            }
                            OSZ osz = new OSZ(iArr2, iArr);
                            int[] iArr3 = (int[]) osz.getFirst();
                            int[] iArr4 = (int[]) osz.getSecond();
                            Context context2 = this.LIZ;
                            String LIZLLL7 = meta.LIZLLL();
                            if (LIZLLL7 == null) {
                                LIZLLL7 = "";
                            }
                            HKU.LIZ(context2, LIZLLL7, dstImage, C45087Hml.LJIIIIZZ(LIZJ), iArr3, iArr4, new C45170Ho6(meta, this, LIZIZ, dstImage, commonRequestCallback, currentTimeMillis2));
                        } else {
                            String LIZLLL8 = meta.LIZLLL();
                            if (LIZLLL8 == null) {
                                LIZLLL8 = "";
                            }
                            C44694HgQ.LIZJ(LIZLLL8, dstImage);
                            if (!C44687HgJ.LIZIZ(dstImage)) {
                                if (commonRequestCallback != null) {
                                    commonRequestCallback.onFailure(1014, C45049Hm9.LJFF(meta), new UnorderedMapStrStr());
                                }
                            } else if (commonRequestCallback != null) {
                                commonRequestCallback.onSuccess(dstImage);
                            }
                            StringBuilder LIZ13 = X1D.LIZ();
                            LIZ13.append("AutoCutMetaInfoDelegate compressMeta: video. FastImportVideo cost=");
                            LIZ13.append(System.currentTimeMillis() - currentTimeMillis2);
                            LIZLLL(X1D.LIZIZ(LIZ13));
                        }
                    }
                } catch (Exception e) {
                    if (commonRequestCallback != null) {
                        int swigValue = SmartMovieErrorCode.COMPRESS_FAILURE.swigValue();
                        StringBuilder LIZ14 = X1D.LIZ();
                        LIZ14.append("failed to compress file, msg = ");
                        String message = e.getMessage();
                        if (message != null) {
                            str3 = message;
                        }
                        LIZ14.append(str3);
                        commonRequestCallback.onFailure(swigValue, X1D.LIZIZ(LIZ14), new UnorderedMapStrStr());
                    }
                }
                StringBuilder LIZ15 = X1D.LIZ();
                LIZ15.append("AutoCutMetaInfoDelegate compressMeta:. total cost=");
                LIZ15.append(System.currentTimeMillis() - currentTimeMillis);
                C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ15));
                return;
            }
        }
        if (commonRequestCallback != null) {
            commonRequestCallback.onFailure(SmartMovieErrorCode.COMPRESS_FAILURE.swigValue(), "empty media path", new UnorderedMapStrStr());
        }
    }
}
